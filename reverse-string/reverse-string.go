package main

import "fmt"

var p = fmt.Println

func Reverse(s string) (result string) {
	for _, v := range s {
		result = string(v) + result
	}
	return result
}

func main() {
	p(Reverse("abc"))
}
