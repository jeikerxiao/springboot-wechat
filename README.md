# springboot-wechat

spring boot wechat

## 微信接收普通消息

## 1.文本消息

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


## 2.图片消息

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


## 3.语音消息

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


## 4.视频消息

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


## 5.小视频消息

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


## 6.地理位置消息

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


## 7.链接消息

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

## 接收事件推送

## 1.关注/取消关注事件

```xml
<xml>
	<ToUserName>< ![CDATA[toUser] ]></ToUserName>
	<FromUserName>< ![CDATA[FromUser] ]></FromUserName>
	<CreateTime>123456789</CreateTime>
	<MsgType>< ![CDATA[event] ]></MsgType>
	<Event>< ![CDATA[subscribe] ]></Event>
</xml>
```

## 2.扫描带参数二维码事件

### 2.1 用户未关注时，进行关注后的事件推送

```xml
<xml>
	<ToUserName>< ![CDATA[toUser] ]></ToUserName>
	<FromUserName>< ![CDATA[FromUser] ]></FromUserName>
	<CreateTime>123456789</CreateTime>
	<MsgType>< ![CDATA[event] ]></MsgType>
	<Event>< ![CDATA[subscribe] ]></Event>
	
	<EventKey>< ![CDATA[qrscene_123123] ]></EventKey>
	<Ticket>< ![CDATA[TICKET] ]></Ticket>
</xml>
```

### 2.2 用户已关注时的事件推送

```xml
<xml> 
	<ToUserName>< ![CDATA[toUser] ]></ToUserName> 
	<FromUserName>< ![CDATA[FromUser] ]></FromUserName> 
	<CreateTime>123456789</CreateTime> 
	<MsgType>< ![CDATA[event] ]></MsgType> 
	<Event>< ![CDATA[SCAN] ]></Event> 
	
	<EventKey>< ![CDATA[SCENE_VALUE] ]></EventKey> 
	<Ticket>< ![CDATA[TICKET] ]></Ticket> 
</xml>
```

## 3.上报地理位置事件


```xml
<xml>
	<ToUserName>< ![CDATA[toUser] ]></ToUserName>
	<FromUserName>< ![CDATA[fromUser] ]></FromUserName>
	<CreateTime>123456789</CreateTime>
	<MsgType>< ![CDATA[event] ]></MsgType>
	<Event>< ![CDATA[LOCATION] ]></Event>
	
	<Latitude>23.137466</Latitude>
	<Longitude>113.352425</Longitude>
	<Precision>119.385040</Precision>
</xml>
```


## 4.自定义菜单事件

### 4.1 点击菜单拉取消息时的事件推送



```xml
<xml>
	<ToUserName>< ![CDATA[toUser] ]></ToUserName>
	<FromUserName>< ![CDATA[FromUser] ]></FromUserName>
	<CreateTime>123456789</CreateTime>
	<MsgType>< ![CDATA[event] ]></MsgType>
	<Event>< ![CDATA[CLICK] ]></Event>
	
	<EventKey>< ![CDATA[EVENTKEY] ]></EventKey>
</xml>
```

### 4.2 点击菜单跳转链接时的事件推送

```xml
<xml>
	<ToUserName>< ![CDATA[toUser] ]></ToUserName>
	<FromUserName>< ![CDATA[FromUser] ]></FromUserName>
	<CreateTime>123456789</CreateTime>
	<MsgType>< ![CDATA[event] ]></MsgType>
	<Event>< ![CDATA[VIEW] ]></Event>
	
	<EventKey>< ![CDATA[www.qq.com] ]></EventKey>
</xml>
```


## 被动回复用户消息

## 1.回复文本消息

```xml
<xml> 
	<ToUserName>< ![CDATA[toUser] ]></ToUserName>
	<FromUserName>< ![CDATA[fromUser] ]></FromUserName> 
	<CreateTime>12345678</CreateTime> 
	<MsgType>< ![CDATA[text] ]></MsgType> 
	
	<Content>< ![CDATA[你好] ]></Content> 
</xml>
```

## 2.回复图片消息


```xml
<xml>
	<ToUserName>< ![CDATA[toUser] ]></ToUserName>
	<FromUserName>< ![CDATA[fromUser] ]></FromUserName>
	<CreateTime>12345678</CreateTime>
	<MsgType>< ![CDATA[image] ]></MsgType>
	
	<Image>
		<MediaId>< ![CDATA[media_id] ]></MediaId>
	</Image>
</xml>
```

## 3.回复语音消息


```xml
<xml>
	<ToUserName>< ![CDATA[toUser] ]></ToUserName>
	<FromUserName>< ![CDATA[fromUser] ]></FromUserName>
	<CreateTime>12345678</CreateTime>
	<MsgType>< ![CDATA[voice] ]></MsgType>
	
	<Voice>
		<MediaId>< ![CDATA[media_id] ]></MediaId>
	</Voice>
</xml>
```

## 4.回复视频消息


```xml
<xml>
	<ToUserName>< ![CDATA[toUser] ]></ToUserName>
	<FromUserName>< ![CDATA[fromUser] ]></FromUserName>
	<CreateTime>12345678</CreateTime>
	<MsgType>< ![CDATA[video] ]></MsgType>
	<Video>
		<MediaId>< ![CDATA[media_id] ]></MediaId>
		<Title>< ![CDATA[title] ]></Title>
		<Description>< ![CDATA[description] ]></Description>
	</Video> 
</xml>
```

## 5.回复音乐消息


```xml
<xml>
	<ToUserName>< ![CDATA[toUser] ]></ToUserName>
	<FromUserName>< ![CDATA[fromUser] ]></FromUserName>
	<CreateTime>12345678</CreateTime>
	<MsgType>< ![CDATA[music] ]></MsgType>
	
	<Music>
		<Title>< ![CDATA[TITLE] ]></Title>
		<Description>< ![CDATA[DESCRIPTION] ]></Description>
		<MusicUrl>< ![CDATA[MUSIC_Url] ]></MusicUrl>
		<HQMusicUrl>< ![CDATA[HQ_MUSIC_Url] ]></HQMusicUrl>
		<ThumbMediaId>< ![CDATA[media_id] ]></ThumbMediaId>
	</Music>
</xml>
```

## 6.回复图文消息


```xml
<xml>
	<ToUserName>< ![CDATA[toUser] ]></ToUserName>
	<FromUserName>< ![CDATA[fromUser] ]></FromUserName>
	<CreateTime>12345678</CreateTime>
	<MsgType>< ![CDATA[news] ]></MsgType>
	
	<ArticleCount>2</ArticleCount>
	<Articles>
		<item>
			<Title>< ![CDATA[title1] ]></Title> 
			<Description>< ![CDATA[description1] ]></Description>
			<PicUrl>< ![CDATA[picurl] ]></PicUrl>
			<Url>< ![CDATA[url] ]></Url>
		</item>
		<item>
			<Title>< ![CDATA[title] ]></Title>
			<Description>< ![CDATA[description] ]></Description>
			<PicUrl>< ![CDATA[picurl] ]></PicUrl>
			<Url>< ![CDATA[url] ]></Url>
		</item>
	</Articles>
</xml>
```
