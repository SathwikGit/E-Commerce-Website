package com.sheryians.major.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Data
@Table(name="users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

  @NotEmpty
  @Column(nullable = false)
    private String firstname;
  private  String lastname;
  @Column(nullable = false,unique = true)
    @NotEmpty
    @Email(message = "{errors.invalid_email}")
    private String email;

  @Column(nullable = false,unique = true)
  @NotEmpty
    private String password;
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(
            name="user_role",
            joinColumns = {@JoinColumn(name="USER_ID",referencedColumnName="ID")},
            inverseJoinColumns={@JoinColumn(name="ROLE_ID",referencedColumnName = "ID")}
    )
  private List<Role> roles;
  public User(User user)
  {
      this.firstname=user.getFirstname();
      this.lastname=user.getLastname();
      this.email=user.getEmail();
      this.password=user.getPassword();
      this.roles=user.getRoles();
  }
  public User()
  {

  }




}

