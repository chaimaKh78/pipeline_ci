package com.example.PokerPlanningBack.security.services;

import com.example.PokerPlanningBack.model.User;
import com.example.PokerPlanningBack.repository.IUserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {


    private final IUserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user =userRepository.findByUserName(username).orElseThrow(()->new UsernameNotFoundException("" +
                "User Not Found with username: "+ username));

        return UserDetailsImpl.build(user);

    }
}
