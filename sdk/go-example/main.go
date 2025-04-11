package main

import (
	"context"
	"encoding/json"
	"fmt"

	openapi "github.com/gurufocus/data-package/sdk/go"
)

func main() {
	auth := context.WithValue(
		context.Background(),
		openapi.ContextAPIKeys,
		map[string]openapi.APIKey{
			"ApiKeyAuth": {Key: "YOUR API KEY"},
		},
	)
	cfg := openapi.NewConfiguration()
	cfg.Debug = true
	client := openapi.NewAPIClient(openapi.NewConfiguration())
	r, _, err := client.ETFAPI.EtfSymbolGet(auth, "SPY").Execute()
	if err != nil {
		panic(err)
	}
	js, _ := json.Marshal(r)
	fmt.Println(string(js))
}
