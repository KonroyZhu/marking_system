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
				jsonarray= JSONArray.fromObject("[{'id':'70528','waiguan':'ϲ��','neishi':'��','kongjian':'һ�� �������ŵ���û͹�� ��һ��','caokong':'ָ�Ĵ���','dongli':'����','youhao':'û���ܵĵ� ���ܺ��Ҽ�ʻϰ���й� �ܽ���','xingjiabi':'�����԰�','shushixing':'���Ǻ����� ����� ̥���'},{'id':'595383','waiguan':'����Ͳ���˵�˰����������һ�㣬��ۼ�ֱ���ſ�ק?�ը�찡�?','neishi':'�������п�̨����ͳ��Ŷ������ʵģ���ɫҲ�ǱȽ����ữ���Ƚ����⣡','kongjian':'һ���ִ������ֳ��������ִ��󣡵�����������S3�ģ���������������֮�󣬹��Ϸ���S3���ռ��DX7С̫���ˣ���������1000��S3����~555~~~','caokong':'�ܰ���������ѧ�������С·90���䣬ת��תȥ������û����������ɲ��ɶ��Ҳ�����ȡ�','dongli':'�������֣����о��������Ǻ��ǻ�����Ϊ�����ĳ����࣬û�жԱ��ԣ����Ҹо�DX7�Ķ������аɣ�Ҳ�����ҿ��ñȽ�����Ե�ʡ�','youhao':'���³��������7.5-17.5���ͺĶ�������ϰ�߲��ã���ϲ�������ţ��������������ɣ����ο�����7.5��ƽ����9���ҡ�','xingjiabi':'�����������ۺ�������˵���Ĳ���������������˵�Ļ���Ҳ���󶮡���','shushixing':'Ƥ�ʵ�����㲻����ˡ����Ѷ�˵ͦ����ģ��Լ�����һ�θ���ʻ���о����У�'},{'id':'565540','waiguan':'����˵�ˣ���ͷ��ͦ�ߵ�','neishi':'�����ȽϺã��ϵ���','kongjian':'�ռ䲻���Ⱥö����SUV�Ŀռ䶼�������Ǻ��ţ���1��75����ߣ����ں���һ�㶼����е�ӵ����','caokong':'����о�����ת������б���Ǻ�����','dongli':'1.8T�Ĺ���','youhao':'Ŀǰ��ĥ���ڣ��ͺ��е��','xingjiabi':'','shushixing':'�Ƚ����ʣ��Ե�������۸�'},{'id':'240471','waiguan':'β����̫ϲ��','neishi':'�������岻�����ǵ����ǵ�������ıȽϼ��ף��о��ܲ��ϵ��Σ��⿴����о�������������Ԫ��΢�������һ��','kongjian':'���ڿռ�ܲ���������3���˲��Ǿ��úܼ�','caokong':'����ƽ��·ʱû��ǿ�ҵĵ�����','dongli':'�����������Ǻ�ͻ�����Ͼ���1.6�����ģ�����1�ֶ࣬���ܵ�140����ƽ�����У����ٷ�����Ĳ�����','youhao':'���˼��Σ�һ�������5ë��������6��㣬�Ͼ�ĥ�����ڣ��������ĥ���ڻ��ܽ�Щ��','xingjiabi':'���˶��������⳵���û��˵','shushixing':'������ĺܲ���'},{'id':'578571','waiguan':' ����','neishi':' ����ȥ','kongjian':' ���ã��ȽϿ���','caokong':' ����','dongli':' һ���','youhao':' û�����','xingjiabi':' �������Լ۱ȸ�','shushixing':' һ���'}] ").toString();
				session.setAttribute("data", jsonarray);
				
			}
		}catch(Exception e){
			//jsonarray=getComJson().toString();
			jsonarray= JSONArray.fromObject("[{'id':'70528','waiguan':'ϲ��','neishi':'��','kongjian':'һ�� �������ŵ���û͹�� ��һ��','caokong':'ָ�Ĵ���','dongli':'����','youhao':'û���ܵĵ� ���ܺ��Ҽ�ʻϰ���й� �ܽ���','xingjiabi':'�����԰�','shushixing':'���Ǻ����� ����� ̥���'},{'id':'595383','waiguan':'����Ͳ���˵�˰����������һ�㣬��ۼ�ֱ���ſ�ק?�ը�찡�?','neishi':'�������п�̨����ͳ��Ŷ������ʵģ���ɫҲ�ǱȽ����ữ���Ƚ����⣡','kongjian':'һ���ִ������ֳ��������ִ��󣡵�����������S3�ģ���������������֮�󣬹��Ϸ���S3���ռ��DX7С̫���ˣ���������1000��S3����~555~~~','caokong':'�ܰ���������ѧ�������С·90���䣬ת��תȥ������û����������ɲ��ɶ��Ҳ�����ȡ�','dongli':'�������֣����о��������Ǻ��ǻ�����Ϊ�����ĳ����࣬û�жԱ��ԣ����Ҹо�DX7�Ķ������аɣ�Ҳ�����ҿ��ñȽ�����Ե�ʡ�','youhao':'���³��������7.5-17.5���ͺĶ�������ϰ�߲��ã���ϲ�������ţ��������������ɣ����ο�����7.5��ƽ����9���ҡ�','xingjiabi':'�����������ۺ�������˵���Ĳ���������������˵�Ļ���Ҳ���󶮡���','shushixing':'Ƥ�ʵ�����㲻����ˡ����Ѷ�˵ͦ����ģ��Լ�����һ�θ���ʻ���о����У�'},{'id':'565540','waiguan':'����˵�ˣ���ͷ��ͦ�ߵ�','neishi':'�����ȽϺã��ϵ���','kongjian':'�ռ䲻���Ⱥö����SUV�Ŀռ䶼�������Ǻ��ţ���1��75����ߣ����ں���һ�㶼����е�ӵ����','caokong':'����о�����ת������б���Ǻ�����','dongli':'1.8T�Ĺ���','youhao':'Ŀǰ��ĥ���ڣ��ͺ��е��','xingjiabi':'','shushixing':'�Ƚ����ʣ��Ե�������۸�'},{'id':'240471','waiguan':'β����̫ϲ��','neishi':'�������岻�����ǵ����ǵ�������ıȽϼ��ף��о��ܲ��ϵ��Σ��⿴����о�������������Ԫ��΢�������һ��','kongjian':'���ڿռ�ܲ���������3���˲��Ǿ��úܼ�','caokong':'����ƽ��·ʱû��ǿ�ҵĵ�����','dongli':'�����������Ǻ�ͻ�����Ͼ���1.6�����ģ�����1�ֶ࣬���ܵ�140����ƽ�����У����ٷ�����Ĳ�����','youhao':'���˼��Σ�һ�������5ë��������6��㣬�Ͼ�ĥ�����ڣ��������ĥ���ڻ��ܽ�Щ��','xingjiabi':'���˶��������⳵���û��˵','shushixing':'������ĺܲ���'},{'id':'578571','waiguan':' ����','neishi':' ����ȥ','kongjian':' ���ã��ȽϿ���','caokong':' ����','dongli':' һ���','youhao':' û�����','xingjiabi':' �������Լ۱ȸ�','shushixing':' һ���'}] ").toString();
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
