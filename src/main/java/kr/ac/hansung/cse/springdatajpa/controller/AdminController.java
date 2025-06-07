package kr.ac.hansung.cse.springdatajpa.controller;

import kr.ac.hansung.cse.springdatajpa.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
@PreAuthorize("hasRole('ROLE_ADMIN')")  // 전체 컨트롤러에 관리자 권한 필요
public class AdminController {

    private final UserRepository userRepository;

    @GetMapping("/users")
    public String viewUserList(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "admin_users"; // templates/admin_users.html
    }
}
