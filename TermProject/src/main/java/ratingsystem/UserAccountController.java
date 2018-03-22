package ratingsystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserAccountController {
	
	@GetMapping("/user")
	public String getUserInfo(Model model)
	{
		model.addAttribute("user", new UserAccount());
		return "user";
	}

}
