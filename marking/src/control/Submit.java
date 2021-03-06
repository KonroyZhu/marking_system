package control;

import db.Conn;
import java.sql.*;
import net.sf.json.*;
import java.io.PrintWriter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Submit
 */
@WebServlet("/Submit")
public class Submit extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static int LIMIT=5;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Submit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		String jsonarray="";
		HttpSession session=request.getSession();
		try{
			jsonarray=session.getAttribute("data").toString();
			if(jsonarray==""){
				//jsonarray=getComJson().toString();
				jsonarray= JSONArray.fromObject("[{'id':'70528','waiguan':'喜欢','neishi':'赞','kongjian':'一般 不过后排地面没凸起 赞一个','caokong':'指哪打哪','dongli':'满意','youhao':'没介绍的低 可能和我驾驶习惯有关 能接受','xingjiabi':'还可以吧','shushixing':'不是很满意 音响差 胎噪大'},{'id':'595383','waiguan':'这个就不多说了啊，最满意的一点，外观简直酷炫狂拽?耪ㄌ彀。?','neishi':'还不错，中控台上面和车门都是软质的，颜色也是比较年轻化，比较满意！','kongjian':'一个字大，两个字超大，三个字大大大！当初想过买瑞风S3的，后来两款车都体验过之后，果断放弃S3，空间比DX7小太多了，可怜我那1000的S3定金啊~555~~~','caokong':'很棒！开到大学里面各种小路90°弯，转来转去，从来没擦碰到过。刹车啥的也还算稳。','dongli':'本人新手，还感觉不出来是好是坏，因为开过的车不多，没有对比性，自我感觉DX7的动力还行吧，也可能我开得比较慢的缘故。','youhao':'我新车提出来，7.5-17.5的油耗都开过，习惯不好，起步喜欢大油门，技术还不熟练吧，两次开到过7.5，平均在9左右。','xingjiabi':'不错。相对于外观和内饰来说真心不错。相对于三大件来说的话我也不大懂。。','shushixing':'皮质的嘛，还算不错的了。朋友都说挺舒服的，自己坐过一次副驾驶，感觉还行！'},{'id':'565540','waiguan':'不用说了，回头率挺高的','neishi':'做工比较好，上档次','kongjian':'空间不错，比好多合资SUV的空间都大，尤其是后排，我1米75的身高，坐在后面一点都不会感到拥挤。','caokong':'整体感觉不错，转急弯倾斜不是很明显','dongli':'1.8T的够用','youhao':'目前在磨合期，油耗有点高','xingjiabi':'','shushixing':'比较舒适，对得起这个价格'},{'id':'240471','waiguan':'尾部不太喜欢','neishi':'内饰整体不错，就是档杆那的面板做的比较简易，感觉很不上档次，光看那里感觉像是在两三万元的微型面包车一样','kongjian':'车内空间很不错，后排做3个人不是觉得很挤','caokong':'过不平道路时没有强烈的颠簸敢','dongli':'加速能力不是很突出，毕竟是1.6排量的，车身1吨多，但跑到140车子平稳运行，加速方面真的不奢求','youhao':'掐了几次，一公里告诉5毛，市区内6多点，毕竟磨合期内，或许过了磨合期还能降些。','xingjiabi':'除了动力方面这车真的没得说','shushixing':'内饰真的很不错'},{'id':'578571','waiguan':' 还行','neishi':' 过得去','kongjian':' 还好，比较宽敞。','caokong':' 还行','dongli':' 一般般','youhao':' 没计算过','xingjiabi':' 不决得性价比高','shushixing':' 一般般'}] ").toString();
				session.setAttribute("data", jsonarray);
				
			}
		}catch(Exception e){
			//jsonarray=getComJson().toString();
			jsonarray= JSONArray.fromObject("[{'id':'70528','waiguan':'喜欢','neishi':'赞','kongjian':'一般 不过后排地面没凸起 赞一个','caokong':'指哪打哪','dongli':'满意','youhao':'没介绍的低 可能和我驾驶习惯有关 能接受','xingjiabi':'还可以吧','shushixing':'不是很满意 音响差 胎噪大'},{'id':'595383','waiguan':'这个就不多说了啊，最满意的一点，外观简直酷炫狂拽?耪ㄌ彀。?','neishi':'还不错，中控台上面和车门都是软质的，颜色也是比较年轻化，比较满意！','kongjian':'一个字大，两个字超大，三个字大大大！当初想过买瑞风S3的，后来两款车都体验过之后，果断放弃S3，空间比DX7小太多了，可怜我那1000的S3定金啊~555~~~','caokong':'很棒！开到大学里面各种小路90°弯，转来转去，从来没擦碰到过。刹车啥的也还算稳。','dongli':'本人新手，还感觉不出来是好是坏，因为开过的车不多，没有对比性，自我感觉DX7的动力还行吧，也可能我开得比较慢的缘故。','youhao':'我新车提出来，7.5-17.5的油耗都开过，习惯不好，起步喜欢大油门，技术还不熟练吧，两次开到过7.5，平均在9左右。','xingjiabi':'不错。相对于外观和内饰来说真心不错。相对于三大件来说的话我也不大懂。。','shushixing':'皮质的嘛，还算不错的了。朋友都说挺舒服的，自己坐过一次副驾驶，感觉还行！'},{'id':'565540','waiguan':'不用说了，回头率挺高的','neishi':'做工比较好，上档次','kongjian':'空间不错，比好多合资SUV的空间都大，尤其是后排，我1米75的身高，坐在后面一点都不会感到拥挤。','caokong':'整体感觉不错，转急弯倾斜不是很明显','dongli':'1.8T的够用','youhao':'目前在磨合期，油耗有点高','xingjiabi':'','shushixing':'比较舒适，对得起这个价格'},{'id':'240471','waiguan':'尾部不太喜欢','neishi':'内饰整体不错，就是档杆那的面板做的比较简易，感觉很不上档次，光看那里感觉像是在两三万元的微型面包车一样','kongjian':'车内空间很不错，后排做3个人不是觉得很挤','caokong':'过不平道路时没有强烈的颠簸敢','dongli':'加速能力不是很突出，毕竟是1.6排量的，车身1吨多，但跑到140车子平稳运行，加速方面真的不奢求','youhao':'掐了几次，一公里告诉5毛，市区内6多点，毕竟磨合期内，或许过了磨合期还能降些。','xingjiabi':'除了动力方面这车真的没得说','shushixing':'内饰真的很不错'},{'id':'578571','waiguan':' 还行','neishi':' 过得去','kongjian':' 还好，比较宽敞。','caokong':' 还行','dongli':' 一般般','youhao':' 没计算过','xingjiabi':' 不决得性价比高','shushixing':' 一般般'}] ").toString();
			session.setAttribute("data", jsonarray);
			
		}
		 
			
		out.println(jsonarray);
		 
	}   
     
	/**  
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	protected JSONArray getComJson(){
		Conn conn=new Conn();
		ResultSet rs=conn.query("SELECT * FROM comment_carhome where picked<3 ORDER BY RAND()  LIMIT "+LIMIT);
		JSONObject jsonobject=new JSONObject();
		JSONArray jsonarray =new JSONArray();
		
		try{
			while(rs.next()){
				jsonobject.put("id", rs.getString("id"));
				jsonobject.put("waiguan", rs.getString("wai_guan"));
				jsonobject.put("neishi", rs.getString("nei_shi"));
				jsonobject.put("kongjian", rs.getString("kong_jian"));
				jsonobject.put("caokong", rs.getString("cao_kong"));
				jsonobject.put("dongli", rs.getString("dong_li"));
				jsonobject.put("youhao", rs.getString("you_hao"));
				jsonobject.put("xingjiabi",rs.getString("xing_jia_bi"));
				jsonobject.put("shushixing", rs.getString("shu_shi_xing"));
				jsonarray.add(jsonobject);
			}
		}catch(Exception e){
			 
		}
		return jsonarray;
	}

}
