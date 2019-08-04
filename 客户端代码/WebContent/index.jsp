<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script type="text/javascript" src="common/jquery-2.1.4.js"></script>
<!DOCTYPE html>
<html>
<head>
    <title>Change</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="change.css">
    <script type="text/javascript" src="change.js"></script>
    <script type="text/javascript" src="common/jquery-2.1.4.js"></script>
</head>
<body>

<div id="all4">
    <img src="img/cha1.png" class="cha1" onclick="hidden1()">
    <div class="housedetailstop">申请交换</div>
    <div class="housedetails">
        <table id="fabutable1">
            <tr>
                <td><img src="img/fdz1.png" id="fdz"><input type="text" name="city" placeholder="想互换的城市" id="city" onblur="check1(1)"><span id="cityCheck1">请准确填入城市（汉字）&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><br>
                    <datalist id="citylist" style="display: none;">
                        <option value="Beijing">Beijing</option>
                        <option value="Shanghai">Shanghai</option>
                        <option value="Heilongjiang">Heilongjiang</option>
                        <option value="Jilin">Jilin</option>
                        <option value="Neimenggu">Neimenggu</option>
                        <option value="Xinjiang">Xinjiang</option>
                    </datalist>
                </td>
            </tr>
            <tr>
                <td><img src="img/xdz1.png" id="xdz"><textarea placeholder="详细地址" id="xd"></textarea></td>
            </tr>
            <tr>
                <td><br>&nbsp;&nbsp;屋主本人正面照<img src="img/jia.png" id="jia"><input type="file" name="" id="hostPhoto"><span id="hostphotoCheck">请添加房屋照片</span></td>
            </tr>
            <tr>
                <td><img src="img/rili1.png" id="rili"><input class="change" type="date" name="date1" placeholder="开放日期" id="begindate1">&nbsp;&nbsp;&nbsp;&nbsp;至</td>
            </tr>
            <tr>
                <td><img src="img/rili1.png" id="rili"><input class="change" type="date" name="date1" placeholder="开放日期" id="enddate1">&nbsp;&nbsp;<span id="dateCheck1">请填写日期</span></td>
            </tr>
        </table>
        <div id="zhucexuzhi2">
            <ul id="ul11">
                <li id="xuzhi1">互换须知</li>
            </ul>
            <ul id="ul21">
                <li>申请互换后，我们会为您匹配最符合您要求的房屋</li>
                <li id="midd1" style="margin-top: -20px;">成功交换后，我们会向您收取会员费用
                </li>
                <li>希望您有一次愉快的体验
                </li>
            </ul>
        </div>
        <button id="zhuceanniu1" style="margin-top: 80px;" onclick="judge1()">申请</button>
    </div>
</div>
<div id="all3">
    <img src="img/cha1.png" class="cha1" onclick="hidden1()">
    <div class="housedetailstop">发布房源</div>
    <div class="housedetails">
	    <form action="InsertAction" method="get">
	    <input type="hidden" name="method" value="inserthouse" >
	    	<table id="fabutable1">
	    	
	            <tr>
	                <td><img src="img/fdz1.png" id="fdz"><input type="text" name="housecity" placeholder="房屋所在城市" id="city1" onblur="check(1)">&nbsp;&nbsp;<span id="cityCheck">请准确填入城市（汉字）&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><br>
	                    <datalist id="citylist" style="display: none;">
	                        <option value="Beijing">Beijing</option>
	                        <option value="Shanghai">Shanghai</option>
	                        <option value="Heilongjiang">Heilongjiang</option>
	                        <option value="Jilin">Jilin</option>
	                        <option value="Neimenggu">Neimenggu</option>
	                        <option value="Xinjiang">Xinjiang</option>
	                    </datalist>
	                </td>
	            </tr>
	            <tr>
	                <td><img src="img/xdz1.png" id="xdz"><textarea placeholder="详细地址" id="xd1" name="houseaddr"></textarea></td>
	            </tr>
	            <tr>
	                <td>
	                	<img src="img/fangzimo.png" id="fm1">
	                	<textarea placeholder="房屋面积" id="homemianji" onblur="check(2)" name="housearea"></textarea>
	                	<textarea placeholder="室" id="huxing" onblur="check(3)" name="housebedroom"></textarea>
	                	<textarea placeholder="厅" id="ting" onblur="check(4)" name="househallroom"></textarea>
	                	<textarea placeholder="阳台" id="yangtai" onblur="check(5)" name="housebalconyroom"name="housearea"></textarea>
	                	<textarea placeholder="卫" id="wei" onblur="check(6)" name="houserestroom"></textarea>
	                	<textarea placeholder="厨" id="chu" onblur="check(7)" name="housekitchen"></textarea>
	                </td>
	            </tr>
	            <tr>
	                <td>
	                	<input type="text" name="houselivingnum" placeholder="易住人数" id="zhunum">
	                	<input type="text" name="housebedroomnum" placeholder="床数" id="chuangnum">&nbsp;&nbsp;<span id="baseCheck">请填入数字</span></td>
	            </tr>
	            <tr>
	                <td><br>&nbsp;&nbsp;房屋详细照片<img src="img/jia.png" id="jia"><input type="file" name="" id="photo"><span id="photoCheck">请添加房屋照片</span></td>
	            </tr>
	            <tr>
	                <td><img src="img/rili1.png" id="rili"><input class="change" type="date" name="housebeginliving" placeholder="开放日期" id="begindate">&nbsp;&nbsp;&nbsp;&nbsp;至</td>
	            </tr>
	            <tr>
	                <td><img src="img/rili1.png" id="rili"><input class="change" type="date" name="houseendliving" placeholder="开放日期" id="enddate">&nbsp;&nbsp;<span id="dateCheck">请填写日期</span></td>
	            </tr>
	        </table>
	        <table id="fabutable2">
	            <tr>
	                <td id="fukuan">您需要填写付款账户
	                </td>
	            </tr>
	            <tr>
	                <td id="zhifufang"><img src="img/qian1.png" id="qian">
	                    <input type="radio" name="zhufufangshi" checked="true">支付宝
	                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="zhufufangshi">银行卡
	                </td>
	            </tr>
	            <tr>
	                <td><img src="img/zfbzh1.png" id="zfbzh1"><input type="text" name="" id="zfbzh" placeholder="支付宝账号"><button id="yanzhengzfb">验证支付宝账号</button></td>
	            </tr>
	            <tr>
	                <td><img src="img/zfbxm1.png" id="zfbxm1"><input type="text" name="" id="zfbxm" placeholder="支付宝姓名"></td>
	            </tr>
	        </table>
	        <button  id="baocun" onclick="judge()">保存并发布</input>
	    </form>
        
        <!--<input type="checkbox" name="" id="tixing">&nbsp;&nbsp;&nbsp;&nbsp;为了能顺利收款，请务必认真填写，支付宝速度更快-->
        
    </div>
</div>
<span id="phone" style="z-index:10;position: fixed;margin-left:750px;margin-top:24px;color:#aaa;"><span style="color:#aaa;">Phone</span>&nbsp;&nbsp;&nbsp;${error.info}&nbsp;&nbsp;&nbsp;${Member.memberphone}</span>
<div id="all2">
    <img src="img/cha1.png" class="cha1" onclick="hidden1()">
    <div class="housedetailstop">会员登录</div>
    <form action="MemberAction" method="post">
    <div class="housedetails" id="huiy">
        <table>
            <tr>
                <td><img src="img/shouji1.png" id="sj"><input type="text" name="memberphone" class="pnumber" placeholder="手机号"></td>
            </tr>
            <tr>
                <td><img src="img/duanxin1.png" id="dx"><input type="password" name="password" id="yanzhengnum" placeholder="密码"></td>
            </tr>
            <tr>
                <td><br>&nbsp;&nbsp;身份证正反面<img src="img/jia.png" id="jia"><input type="file" name="" id="idcard1"></td>
            </tr>
            <tr>
                <td id="paizhao">&nbsp;&nbsp;请拍一张正面照<img src="img/xiangji.png" id="xiangji"></td>
            </tr>
        </table>
        <div id="zhucexuzhi3">
            <ul id="ul111">
                <li id="xuzhi11">登陆说明</li>
            </ul>
            <ul id="ul211">
                <li>为了做到充分的身份验证，我们需要您进行再次核对，对您造成麻烦在此抱歉</li>
                <li id="midd1">成功登陆会员后，您就可以享受互换居所的权利
                </li>
                <li>希望您找到满意的住所
                </li>
            </ul>
        </div>
        <input type="submit" id="dengluanniu"></input>
    </div>
    </form>
</div>
<div id="all">
    <img src="img/cha1.png" class="cha1" onclick="hidden1()">
    <div class="housedetailstop">大连沿海</div>
    <div id="fangimg">
        <button id="left" onmouseover="xianshi()" onclick="remove1()">&lt;</button>
        <button id="right" onmouseover="xianshi()" onclick="remove()">&gt;</button>
        <img src="img/fang1.jpg" id="fang1" onmouseover="xianshi()" onmouseout="yin()">
        <img src="img/woshi.jpg" id="fang2" onmouseover="xianshi()" onmouseout="yin()">
    </div>
    <ul id="fx">
        <li><img src="img/fangzimo.png" id="fm"><h3>基本信息</h3></li>
        <li>房屋面积: 120平方</li>
        <li>房屋户型：2室1厅1卫1厨1阳台</li>
    </ul>
    <ul id="fx1">
        <li><img src="img/ren.png" id="fm11"><h3>易住人数</h3></li>
        <li>4人</li>
    </ul>
    <ul id="fx2">
        <li><img src="img/ch.png" id="fm111"><h3>床数</h3></li>
        <li>3张</li>
    </ul>
    <img src="img/tou.jpg" id="homer">
    <ul id="homerde">
        <li>李灵智</li>
        <li style="color: #4eb892; padding-top: 10px;font-size: 13px;"><img src="img/xinyu.png" style="width: 20px;height: 20px;position: absolute;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;实名验证</li>
    </ul>
    <div class="housedetails">
        <button id="example">视频通话</button>
        <button id="submit">语音通话</button>
        <button id="reset">留言</button>
        <button id="example" style="margin-top: 150px;" onclick="show5()">详细信息</button>
        <button id="example" style="margin-top: 390px; background:#F05B72;">确认交换</button>
    </div>
</div>
<div id="all5">
    <img src="img/cha1.png" class="cha1" onclick="hidden1()">
    <div class="housedetailstop">详细信息</div>
    <div class="housedetails" id="zhuce">
        <img src="img/ditu1.jpg" id="ditu">
        <table id="xiangxiqingkuang" style="margin-top: 10px;position: absolute;margin-left: 850px;font-size: 18px;color: #aaa;border:none;">
            <tr>
                <td>
                    <img src="img/xiangxi1.png" style="position:absolute;width: 20px;height: 20px;margin-left: -25px;margin-top: 2px;">&nbsp;&nbsp;&nbsp;&nbsp;附近
                </td>
            </tr>
            <tr>
                <td style="padding-top: 20px;">
                    火锅
                </td>
            </tr>
            <tr>
                <td style="padding-top: 20px;">
                    海鲜店
                </td>
            </tr>
            <tr>
                <td style="padding-top: 20px;">
                    面馆
                </td>
            </tr>
            <tr>
                <td style="padding-top: 20px;">
                    发现王国
                </td>
            </tr>
            <tr >
                <td style="padding-top: 20px;">
                    海边
                </td>
            </tr>
            <tr >
                <td style="padding-top: 20px;">
                    肯德基
                </td>
            </tr>
            <tr >
                <td style="padding-top: 20px;">
                    轻轨站
                </td>
            </tr>
            <tr >
                <td style="padding-top: 20px;">
                    重庆小面
                </td>
            </tr>
            <tr >
                <td style="padding-top: 20px;">
                    旋转小火锅
                </td>
            </tr>
        </table>
    </div>
</div>
<div id="all1">
    <img src="img/cha1.png" class="cha1" onclick="hidden1()">
    <div class="housedetailstop">会员注册</div>
   	<div class="housedetails" id="zhuce">
   		<form action="InsertAction" method="get">
   		<input type="hidden" name="method" value="register" >
   			<table>
   				<tr>
	                <td><img src="img/shouji1.png" id="sj">
	                <input type="text" name="memberphone" class="pnumber" id="pnum" placeholder="手机号" onblur="phoneVerify()"></td>
	                <div id="pVerify">手机号格式不正确</div><div id="pNumNull">号码不能为空</div>
	            </tr>
	            <tr>
	                <td><img src="img/duanxin1.png" id="dx">
	                <input type="password" name="password" class="yanzhengnum" id="nam" placeholder="密码" onblur="nameVerify()"></td>
	                <div id="nVerify">密码格式不正确</div>
	            </tr>
	             
	            <tr>
	                <td><br>&nbsp;&nbsp;身份证正反面<img src="img/jia.png" id="jia"><input type="file" name="" class="idcard" id="ic1" onblur="icVerify()"></td>
	                <div id="picVerify1">照片必填</div>
	            </tr>
	            <tr>
	                <td id="paizhao">&nbsp;&nbsp;请拍一张正面照<img src="img/xiangji.png" id="xiangji"><input type="file" name="" class="idcard" id="ic2" onblur="icVerify()"></td>
	                <div id="picVerify2">照片必填</div>
	            </tr>
	            <tr>
	                <td id="agree">&nbsp;&nbsp;<input type="checkbox" id="fuxuan">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我同意 《服务协议》、《隐私保护声明》</td>
	            </tr>
	        </table>
   		</form>
        
        <div id="zhucexuzhi">
            <ul id="ul1">
                <li id="xuzhi">注册须知</li>
            </ul>
            <ul id="ul2">
                <li>充分的身份验证机制是为了保证每位用户的安全，保证我们平台更加可信赖，让大家有安全可靠的换房体验</li>
                <li id="midd">我们只有在您决定真正与某人换房的时候才会收取您会员费用
                </li>
                <li>会员审核为3个工作日，希望您耐心等待
                </li>
            </ul>
        </div>
        <button id="zhuceanniu" onclick="register()">注册</button>
    </div>
</div>
<div id="details"><span id="intro">
	到世界任何地方去旅游·像当地人一样·免费住宿</span> <br>
    <span id="introE">Travel anywhere in the world. Like the local people. Free accommodation</span>
</div>
<div id="bgt"><img src="img/2.jpg"></div>
<div id="bgty"></div>
<div id="title">
    <span id="theme"><pre><span id="name">换驴</span>网</pre></span>
    <span id="select">
			<ul id="choose">
				<li id="l1" onclick="scrollchange(1)">
					介绍
				</li>
				<li id="l2" onclick="scrollchange(2)">
					互换旅居
				</li>
				<li id="l3" onclick="scrollchange(3)">
					互换成长
				</li>
				<li id="l4" onclick="scrollchange(4)">
					会员
				</li>
				<li id="l5" onclick="scrollchange(5)">
					意见
				</li>
			</ul>
		</span>
    <button id="denglu" onclick="huiyuan()">会员登陆</button>
    <button id="fabu" onclick="show3()">免费发布房源</button>
    <button id="shenqing" onclick="show4()">申请交换</button>
    <div id="hr"><HR align=center width=100% color=white SIZE=1 id="hr1"></div>
</div>
<div id="jiantou">
    <img src="img/jiantou.png">
</div>
<div id="jieshao">
    <span id="me">关于我们</span>
    <span id="p1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;为了让更多想换心情，体验生活，旅游，等等的人提供一个平台，实现“互换空间”，我们团队致力于打造安全便捷并且实用的软件。<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;很多人都有这样类似的烦恼，想去一个地方旅游或者说换个地方，换种心情，但是昂贵的居住费用，和并不符合心意的居住环境，使整个旅行显得不是那么完美。如果这个时候刚好遇到想去我的城市，而我想去对方城市的人，双方互换居住房，这岂不是两全其美。尽管那可能是一个陌生的环境，但是每个家都有着每个家的特色，和每个家的好，并且生活用品也会更齐全。在旅游的时候还可以体会到如同自己家的温暖。双方私下里沟通融洽，最后成为好朋友，也都是很有可能的。如果是两个单身的异性，通过此次交换，最后成为情侣也不是不可能的。并且双方都可以给出出行的意见，这比问别人，上网搜索来的更直接，更可靠一些。<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;同时，现在基本上孩子在家里衣食无忧，并不知道什么是辛苦，什么是勤劳。很多家庭就会想通过亲身体验这种方式来教会孩子珍惜。但是又不知道去哪里，通过我们的软件，他们就可以挑选自己喜欢的地方去生活一阵子，体验一下不同于城市的农村生活和氛围，感受农作的乐趣。还可以仅用对方的生活费数目生活一阵子，真正融入当地生活，感悟许多人生道理。一直生活在大山里的人们想看看世界，拓宽视野，激励自己的孩子努力，就可以省下了一笔昂贵的住宿的费用，用来做更有意义的事情。<br>
</div>
<button id="readmore">更多</button>
<div id="Server">
    <div id="Serverbeijing"></div>
    <!--<div id="time"><div id="days">Days</div><div id="hours">Hours</div><div id="minutes">Minutes</div><div id="seconds">Seconds</div></div>-->
    <div id="discount">在2019年3月之前加入我们会员费用折扣40%</div>
    <button id="homebutton">查询</button>
    <img src="img/home.png" id="imghome">
    <input type="text" name="fangxinxi" id="fangxinxi" placeholder="远方的家·到别人的世界寻找自己">
</div>
<div id="yuanjia">
    <div id="yjname">远方的家</div>
    <div class="top">
        <div id="j1" onmouseover="up(1)" onmouseout="down(1)" onclick="show1()"><img src="img/12.jpg" id="j11"><div class="imd1"><br>新疆<br>兄弟姐妹很多</div></div>
        <div id="j2" onmouseover="up(2)" onmouseout="down(2)" onclick="show1()"><img src="img/6.jpg" id="j21"><div class="imd1"><br>大连<br>沿海住宅</div></div>
        <div id="j3" onmouseover="up(3)" onmouseout="down(3)" onclick="show1()"><img src="img/8.jpg" id="j31"><div class="imd1"><br>黑龙江<br>刚结婚的小情侣</div></div>
    </div>
    <div class="bottom">
        <div id="j4" onmouseover="up(4)" onmouseout="down(4)" onclick="show1()"><img src="img/11.jpg" id="j41"><div class="imd1"><br>上海<br>家中模型较多</div></div>
        <div id="j5" onmouseover="up(5)" onmouseout="down(5)" onclick="show1()"><img src="img/10.jpg" id="j51"><div class="imd1"><br>北京<br>喜爱潜水拍照</div></div>
        <div id="j6" onmouseover="up(6)" onmouseout="down(6)" onclick="show1()"><img src="img/9.jpg" id="j61"><div class="imd1"><br>广东<br>爱好摄影</div></div>
        <div id="j7" onmouseover="up(7)" onmouseout="down(7)" onclick="show1()"><img src="img/11.jpg" id="j71"><div class="imd1"><br>上海<br>家中模型较多</div></div>
        <div id="j8" onmouseover="up(8)" onmouseout="down(8)" onclick="show1()"><img src="img/10.jpg" id="j81"><div class="imd1"><br>北京<br>喜爱潜水拍照</div></div>
        <div id="j9" onmouseover="up(9)" onmouseout="down(9)" onclick="show1()"><img src="img/9.jpg" id="j91"><div class="imd1"><br>广东<br>爱好摄影</div></div>
        <div id="j10" onmouseover="up(10)" onmouseout="down(10)" onclick="show1()"><img src="img/12.jpg" id="j101"><div class="imd1"><br>新疆<br>兄弟姐妹很多</div></div>
    </div>

</div>
<div id="man">
    <span id="mantitle">到别人的世界寻找自己</span>
    <span id="titledetails">Look for yourself in the world of others</span>
    <div id="man1"><div id="tou1"></div><span id="detailsman1">家里有三口人
			<br>平时以收稻子为只要收入来源<br>家乡空气清新，邻里热情<br>可以体验插秧割麦子的乐趣</span><span id="manintro1"><pre>李灵智</pre></span>
        <span id="manintro11"><pre>黑龙江</pre></span></div>
    <div id="man2"><div id="tou2"><span id="detailsman2"></span></div><span id="manintro2"><pre>李灵智</pre></span>
        <span id="manintro12"><pre>大连</pre></span></div>
    <div id="man3"><div id="tou3"><span id="detailsman3"></span></div><span id="manintro3"><pre>李灵智</pre></span>
        <span id="manintro13"><pre>广东</pre></span></div>
    <div id="man4"><div id="tou4"><span id="detailsman4"></span></div><span id="manintro3"><pre>李灵智</pre></span>
        <span id="manintro14"><pre>广东</pre></span></div>
    <div id="dian">
        <a href=""></a>
        <a href=""></a>
        <a href=""></a>
    </div>
</div>
<div id="Dbeijing"></div>
<div id="Download">
    <span id="Dtitle">会员</span>
    <form action="InsertAction" method="post">
   	 	<input type="hidden" name="method" value="getDept" >
    	<input type="submit" id="join" value="现在加入">
    </form>
    <table id="dtable">
        <tr>
            <td>
                <p>总人数</p>
                <div id="t1">
                    <div id="t11">1978人&nbsp;&nbsp;&nbsp;&nbsp;</div>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <p>今日注册</p>
                <div id="t2">
                    <div id="t21">29人&nbsp;&nbsp;&nbsp;&nbsp;</div>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <p>11月人数</p>
                <div id="t3">
                    <div id="t31">925人&nbsp;&nbsp;&nbsp;&nbsp;</div>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <p>2018年人数</p>
                <div id="t4">
                    <div id="t41">1903人&nbsp;&nbsp;&nbsp;&nbsp;</div>
                </div>
            </td>
        </tr>
    </table>
</div>
<div id="Query">
    <div id="send"><pre>给我们的一封信</pre></div>
    <div id="letter">
    <form action="mail" method="post">
			<div id="lall">
				<input type="text" name="name01" placeholder="姓名">
				<input type="text" name="email1" placeholder="邮箱">
				<input type="text" name="telephone1" placeholder="电话">
				<input type="text" name="address1" placeholder="地点">
			</div>
			<textarea name="content1" placeholder="内容" cols=178 rows=7></textarea>
			<button id="lebutton" type="submit">发送</button>
		</from>
</div>
<div id="helpb"></div>
<div id="help"><div id="htitle">联系我们</div><div id="hd1">如果您有疑问或者遇到任何困难随时可以联系我们，我们24小时在线，真诚为您服务</div>
    <table id="htable" cellspacing="30px;">
        <tr>
            <td class="td1">地址</td>
            <td class="td1">电话</td>
            <td class="td1">邮箱</td>
            <td class="td1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;信息</td>
        </tr>
        <tr>
            <td class="td2"><img src="img/dizhi1.png" class="dizhi1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;辽宁省大连市金州区大连民族大学</td>
            <td class="td2"><img src="img/phone1.png" class="dizhi1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+1 (734) 123-4567</td>
            <td class="td2"><img src="img/youxiang1.png" class="dizhi11">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;info@photos.com</td>
            <td rowspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" id="einput" placeholder="邮箱"></td>
        </tr>
        <tr>
            <td class="td2"><img src="img/dizhi1.png" class="dizhi1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;辽宁省大连市金州区大连民族大学</td>
            <td class="td2"><img src="img/phone1.png" class="dizhi1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+1 (734) 123-4567</td>
            <td class="td2"><img src="img/youxiang1.png" class="dizhi11">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;info@photos.com</td>
    </table>
    <button id="ebu">提交信息</button>
    <div id="bhr"><HR align=center width=143% color=white SIZE=1 id="hr12"></HR></div>
    <div id="banquan">© 2018 大连民族大学 计算机科学与技术学院  | 李灵智</div>
</div>
<script type="text/javascript">
	$(function(){
		$('#baocun').on('click',function(){
			 
		});
		
		
	});

</script>
</body>
</html>