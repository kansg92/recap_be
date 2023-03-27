package co.project.recap.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Integer useridx;

    private String name;

    private String nickname;

    private String email;

    private String phonenumber;

    private String password;

    private String status;

    private String country;

}
