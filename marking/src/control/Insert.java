package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;
import control.Submit;
import db.Conn;
/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static int limit=Submit.LIMIT;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		
		 
		//生成数组 来储存值
		
		String[] waiguan=new String[limit];
		String[] waiguancom=new String[limit];
		String[] neishi=new String[limit];
		String[] neishicom=new String[limit];
		String[] kongjian=new String[limit];
		String[] kongjiancom=new String[limit];
		String[] caokong=new String[limit];
		String[]caokongcom=new String[limit];
		String[] dongli=new String[limit];
		String[] donglicom=new String[limit];
		String[] youhao=new String[limit];
		String[] youhaocom=new String[limit];
		String[] xingjiabi=new String[limit];
		String[] xingjiabicom=new String[limit];
		String[] shushixing=new String[limit];
		String[] shushixingcom=new String[limit];
		//生成数组储存id
		String[] tendid=new String[limit];
		
		//加载id
		tendid=getData("tendid",request);
		//加载评论与倾向
		waiguan=getData("waiguantend",request);
		waiguancom=getData("waiguancomment",request);
		neishi=getData("neishitend",request);
		neishicom=getData("neishicomment",request);
		kongjian=getData("kongjiantend",request);
		kongjiancom=getData("kongjiancomment",request);
		caokong=getData("caokongtend",request);
		caokongcom=getData("caokongcomment",request);
		dongli=getData("donglitend",request);
		donglicom=getData("donglicomment",request);
		youhao=getData("youhaotend",request);
		youhaocom=getData("youhaocomment",request);
		xingjiabi=getData("xingjiabitend",request);
		xingjiabicom=getData("xingjiabicomment",request);
		shushixing=getData("shushixingtend",request); 
		shushixingcom=getData("shushixingcomment",request);  
		
		 
		//数据库
		boolean result=false;
		Conn conn=new Conn();
		/*for(int i=0;i<Submit.LIMIT;i++){
			result=conn.exec("insert into markin2"
					+ "(waiguancom ,waiguantend,neishicom,neishitend"
					+ ",kongjiancom,kongjiantend,caokongcom,caokongtend,youhaocom,youhaotend,"
					+ "donglicom,donglitend,xingjiabicom,xingjiabitend,shushixingcom,shushixing,comid) "
					+ "values ('"+waiguancom[i]+"','"+waiguan[i]+"',' "+neishicom[i]+"','"+neishi[i]+"',"
							+ "' "+kongjiancom[i]+"',' "+kongjian[i]+"','"+caokongcom[i]+"','"+caokong[i]+"',"
									+ "' "+youhaocom[i]+"','"+youhao[i]+"','"+donglicom[i]+"','"+dongli[i]+"',"
											+ "'"+xingjiabicom[i]+"','"+xingjiabi[i]+"','"+shushixingcom[i]+"',"
													+ "'"+shushixing[i]+"','"+tendid[i]+"');");
			conn.exec("update comment_carhome set picked=picked+1 where id="+tendid[i]+";");
		}  */
		   
		
		/*for(int i=0;i<waiguan.length;i++){
		out.print("  评论内容： "+waiguancom[i]+" ");   
		out.println("  情感倾向  "+i+"： "+waiguan[i]+""+"<br/>"); 
		out.print("  评论内容： "+neishicom[i]); 
		out.print("  情感倾向： "+i+":"+neishi[i]+" ");   
		out.print("  评论内容： "+caokongcom[i]+" "); 
		out.println("  情感倾向  "+i+"： "+caokong[i]+"");
		out.print("  评论内容： "+donglicom[i]+" ");  
		out.println("  情感倾向  "+i+"： "+dongli[i]+""); 
		out.print("  评论内容： "+youhaocom[i]+" ");  
		out.println("  情感倾向  "+i+"： "+youhao[i]+"");
		out.print("  评论内容： "+kongjiancom[i]+" ");  
		out.println("  情感倾向  "+i+"： "+kongjian[i]+"");
		out.print("  评论内容： "+xingjiabicom[i]+" "); 
		out.println("  情感倾向  "+i+"： "+xingjiabi[i]+"");
		out.print("  评论内容： "+shushixingcom[i]+" ");
		out.println("  情感倾向  "+i+"： "+shushixing[i]+""+"<br/>");
		
		} */
		
			
		HttpSession session=request.getSession();
		
		//out.println(session.getAttribute("data"));
		session.setAttribute("data", ""); 
		int times; 
		try{
			times=(int)session.getAttribute("times");
			session.setAttribute("times", times+1);
		}catch(Exception e){
			times=1;
			session.setAttribute("times", times+1);
		}
		out.print("已标注  "+times+" 批评论  (^-^)  ");
		response.setHeader("refresh", "2;url=/markin/index2.html"); 
		  
		
		 
		 
		
		//out.print(new String(request.getParameter("waiguanfinalltend0").getBytes("iso-8859-1"), "utf-8")+"<br/>"); 
		
		 
	 
	}    
  
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public String[] getData(String key,HttpServletRequest request) throws ServletException, IOException {
		String[] data=new String[limit];
		int num=0;
		while(num<limit){
			data[num]=new String(request.getParameter(key+num).getBytes("iso-8859-1"), "utf-8");
			num++;
		}
		
		return data; 
	}
	

}
