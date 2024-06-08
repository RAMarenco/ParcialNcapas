package org.happybaras.parcial2.utils;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.happybaras.parcial2.domain.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JWTTokenFilter extends OncePerRequestFilter {
    final
    JWTTools jwtTools;

//    final
//    UserService userService;

    public JWTTokenFilter(JWTTools jwtTools /*, UserService userService*/) {
        this.jwtTools = jwtTools;
//        this.userService = userService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String tokenHeader = request.getHeader("Authorization");
        String username = null;
        String token = null;

        if(tokenHeader != null && tokenHeader.startsWith("Bearer ") && tokenHeader.length() > 7) {
            token = tokenHeader.substring(7);

            try {
                username = jwtTools.getUsernameFrom(token);
            } catch (IllegalArgumentException e) {
                System.out.println("Unable to get JWT Token");
            } catch (ExpiredJwtException e) {
                System.out.println("JWT TOKEN has expired");
            } catch (MalformedJwtException e) {
                System.out.println("JWT Malformado");
            }
        } else {
            System.out.println("Bearer string not found");
        }

//        if(username != null && token != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//            User user = userService.findOneByIdentifier(username);
//
//            if(user != null) {
//                Boolean tokenValidity = userService.isTokenValid(user, token);
//
//                if(tokenValidity) {
//                    //Preparing the authentication token.
//                    UsernamePasswordAuthenticationToken authToken
//                            = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
//
//                    authToken.setDetails(
//                            new WebAuthenticationDetailsSource().buildDetails(request)
//                    );
//
//                    //This line, sets the user to security context to be handled by the filter chain
//                    SecurityContextHolder
//                            .getContext()
//                            .setAuthentication(authToken);
//                }
//            }
//        }

        filterChain.doFilter(request, response);
    }
}
