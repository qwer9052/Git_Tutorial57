@Controller
public class UserController{

	//�α��� �������� �̵�
	@RequestMapping("/user/login.do")
	public String login(){
		logger.info("��� : login"):
		
		return "user/login";
	}

	//ȸ������ �������� �̵�
	@RequestMapping("/user/insert.do")
	public String login(){
		logger.info("��� : insert"):
		
		return "user/insert";
	}
 


}