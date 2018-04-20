# springboot-wechat

spring boot wechat

## 微信接收普通消息

### 文本消息

```xml
<xml>  
	<ToUserName>< ![CDATA[toUser] ]></ToUserName>  
	<FromUserName>< ![CDATA[fromUser] ]></FromUserName>  
	<CreateTime>1348831860</CreateTime>  
	<MsgType>< ![CDATA[text] ]></MsgType>  

	<Content>< ![CDATA[this is a test] ]></Content>  

	<MsgId>1234567890123456</MsgId>  
</xml>
```


### 图片消息

```xml
<xml> 
	<ToUserName>< ![CDATA[toUser] ]></ToUserName> 
	<FromUserName>< ![CDATA[fromUser] ]></FromUserName> 
	<CreateTime>1348831860</CreateTime> 
	<MsgType>< ![CDATA[image] ]></MsgType> 

	<PicUrl>< ![CDATA[this is a url] ]></PicUrl>
	<MediaId>< ![CDATA[media_id] ]></MediaId> 

	<MsgId>1234567890123456</MsgId>
</xml>
```


### 语音消息

```xml
<xml>
	<ToUserName>< ![CDATA[toUser] ]></ToUserName>
	<FromUserName>< ![CDATA[fromUser] ]></FromUserName>
	<CreateTime>1357290913</CreateTime>
	<MsgType>< ![CDATA[voice] ]></MsgType>

	<MediaId>< ![CDATA[media_id] ]></MediaId>
	<Format>< ![CDATA[Format] ]></Format>

	<MsgId>1234567890123456</MsgId>
</xml>
```


### 视频消息

```xml
<xml>
	<ToUserName>< ![CDATA[toUser] ]></ToUserName>
	<FromUserName>< ![CDATA[fromUser] ]></FromUserName>
	<CreateTime>1357290913</CreateTime>
	<MsgType>< ![CDATA[video] ]></MsgType>
	
	<MediaId>< ![CDATA[media_id] ]></MediaId>
	<ThumbMediaId>< ![CDATA[thumb_media_id] ]></ThumbMediaId>
	
	<MsgId>1234567890123456</MsgId>
</xml>
```


### 小视频消息

```xml
<xml>
	<ToUserName>< ![CDATA[toUser] ]></ToUserName>
	<FromUserName>< ![CDATA[fromUser] ]></FromUserName>
	<CreateTime>1357290913</CreateTime>
	<MsgType>< ![CDATA[video] ]></MsgType>

	<MediaId>< ![CDATA[media_id] ]></MediaId>
	<ThumbMediaId>< ![CDATA[thumb_media_id] ]></ThumbMediaId>

	<MsgId>1234567890123456</MsgId>
</xml>
```


### 地理位置消息

```xml
<xml>
	<ToUserName>< ![CDATA[toUser] ]></ToUserName>
	<FromUserName>< ![CDATA[fromUser] ]></FromUserName>
	<CreateTime>1351776360</CreateTime>
	<MsgType>< ![CDATA[location] ]></MsgType>

	<Location_X>23.134521</Location_X>
	<Location_Y>113.358803</Location_Y>
	<Scale>20</Scale>
	<Label>< ![CDATA[位置信息] ]></Label>

	<MsgId>1234567890123456</MsgId>
</xml>
```


### 链接消息

```xml
<xml>
	<ToUserName>< ![CDATA[toUser] ]></ToUserName>
	<FromUserName>< ![CDATA[fromUser] ]></FromUserName>
	<CreateTime>1351776360</CreateTime>
	<MsgType>< ![CDATA[link] ]></MsgType>

	<Title>< ![CDATA[公众平台官网链接] ]></Title>
	<Description>< ![CDATA[公众平台官网链接] ]></Description>
	<Url>< ![CDATA[url] ]></Url>

	<MsgId>1234567890123456</MsgId>
</xml>
```
