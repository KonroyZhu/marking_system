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
		
		
		 
		//�������� ������ֵ
		
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
		//�������鴢��id
		String[] tendid=new String[limit];
		
		//����id
		tendid=getData("tendid",request);
		//��������������
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
		
		 
		//���ݿ�
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
		out.print("  �������ݣ� "+waiguancom[i]+" ");   
		out.println("  �������  "+i+"�� "+waiguan[i]+""+"<br/>"); 
		out.print("  �������ݣ� "+neishicom[i]); 
		out.print("  ������� "+i+":"+neishi[i]+" ");   
		out.print("  �������ݣ� "+caokongcom[i]+" "); 
		out.println("  �������  "+i+"�� "+caokong[i]+"");
		out.print("  �������ݣ� "+donglicom[i]+" ");  
		out.println("  �������  "+i+"�� "+dongli[i]+""); 
		out.print("  �������ݣ� "+youhaocom[i]+" ");  
		out.println("  �������  "+i+"�� "+youhao[i]+"");
		out.print("  �������ݣ� "+kongjiancom[i]+" ");  
		out.println("  �������  "+i+"�� "+kongjian[i]+"");
		out.print("  �������ݣ� "+xingjiabicom[i]+" "); 
		out.println("  �������  "+i+"�� "+xingjiabi[i]+"");
		out.print("  �������ݣ� "+shushixingcom[i]+" ");
		out.println("  �������  "+i+"�� "+shushixing[i]+""+"<br/>");
		
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
		out.print("�ѱ�ע  "+times+" ������  (^-^)  ");
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
