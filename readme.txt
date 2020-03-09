This project is for converting bill amount into coins required.

below below is examples for using.

http://localhost:8080/coinService?currency=UdS&bill=28d

Error While Converting to Coin :- Currency Not Supported

http://localhost:8080/coinService?currency=US&bill=288

2 Dollars, 3 Quarters, 1 Dime, 3 Pennies, 


## Below changes are required for adding new currency

1) Need new implementation for new currency which implement interface CoinConverter
2) Need to modify code in CoinConverterFactory