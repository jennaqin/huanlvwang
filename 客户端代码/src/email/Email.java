package email;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mail")
public class Email extends HttpServlet{
	private static final long serialVersionUID = 1L;

        public static String myEmailAccount = "18742021547@163.com";
        public static String myEmailPassword = "gospursgo20";
        public static String myEmailSMTPHost = "smtp.163.com";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String receiverEmail = "519551142@qq.com";
        //String receiverEmail = request.getParameter("receiverEmail");
       // String mailTitle  = request.getParameter("mailTitle");       
       // String mailContent = request.getParameter("mailContent");    //
    	String mailTitle = "���";
        String name = request.getParameter("name01");
        String emaildress = request.getParameter("email1");
        String phone = request.getParameter("telephone1");
        String address = request.getParameter("address1");
        String content = request.getParameter("content1");
        String mailContent = name + " " + emaildress + " " + phone + " " + address + " " + content; 
                Properties props = new Properties();
                props.setProperty("mail.transport.protocol", "smtp");  
                props.setProperty("mail.smtp.host", myEmailSMTPHost);  
                props.setProperty("mail.smtp.auth", "true"); 
                Session session=Session.getInstance(props);
                session.setDebug(true);      
                 try {
                     MimeMessage message=createMimeMessage(session,myEmailAccount,receiverEmail,mailContent,mailTitle);
                     Transport transport =session.getTransport();
                     transport.connect(myEmailAccount, myEmailPassword);
                     transport.sendMessage(message, message.getAllRecipients());
                     transport.close();

                } catch (NoSuchProviderException e) {

                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }   

                response.sendRedirect("login.jsp");
    }
      public static MimeMessage createMimeMessage(Session session,String sendMail,String receiveMail,
              String mailContent,String mailTitle) throws Exception{

        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(sendMail,"xuheng","utf-8"));
        message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveMail,"Lisa","utf-8"));
        message.setSubject(mailTitle,"utf-8");
        message.setContent(mailContent, "text/html;charset=UTF-8");
        message.setSentDate(new Date());
        message.saveChanges();
        return message;

    }
}
