CREATE TABLE `heroku_7521b1a170ba710`.`rest_url_response` (
  `URL` VARCHAR(100) NOT NULL,
  `RESPONSE` VARCHAR(200) NULL,
  PRIMARY KEY (`URL`));

INSERT INTO REST_URL_RESPONSE(URL,RESPONSE) 
SELECT 'hello' ,'Hello form DB ' FROM DUAL ;

INSERT INTO REST_URL_RESPONSE(URL,RESPONSE) 
SELECT 'bye' ,'Bye form DB ' FROM DUAL ;