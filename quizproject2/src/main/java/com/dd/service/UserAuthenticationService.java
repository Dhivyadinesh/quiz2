package com.dd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

@Service
public class UserAuthenticationService implements AuthenticationProvider{
   
   @Override
   public Authentication authenticate(Authentication auth) throws AuthenticationException{
	   
      Authentication model = null;
      List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
      
      if (auth != null)
      {
         String name = auth.getName();
         String password = auth.getCredentials().toString();
         
         if (name.equals("admin") && password.equals("add"))
         {
            grantedAuths.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
            model = new UsernamePasswordAuthenticationToken(name, "", grantedAuths);
         }
      
   }
      return auth;

 }

   @Override
   public boolean supports(Class<?> tokenType)
   {
      return tokenType.equals(UsernamePasswordAuthenticationToken.class);
   }
}
