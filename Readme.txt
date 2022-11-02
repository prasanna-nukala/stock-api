1. Created StockModel class which is modal class that maps Dow Jones Data set attributes
2. Created StockRepository class which will handle database transactions
3. Created StockService class which will wrap database transactions
4. Created StockController class which consists of API endpoints i.e. these api will be called from client
5. Created Junit test case

Technology used
1. Spring Boot
2. Mongo DB

Endpoints:

1. api/file-upload - Post
-- To upload data as multipart file

2. api/stock - Post
-- To create individual stock

3. /stock/{symbol} - Get
-- To fetch stock by symbol