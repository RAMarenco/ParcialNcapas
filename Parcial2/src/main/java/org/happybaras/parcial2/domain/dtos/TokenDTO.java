package org.happybaras.parcial2.domain.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.happybaras.parcial2.domain.entities.Token;

@Data
@NoArgsConstructor
public class TokenDTO {
    private String token;

    public TokenDTO(Token token) {
        this.token = token.getContent();
    }
}
