# Spring Security

## 创建项目

与创建 Web 项目类似，在选择依赖的步骤，选择`Spring Web` `Spring Data JPA` `Spring Security` 以及`H2 Database`

## Spring Security

Spring Security 是一个认证和鉴权的框架

## 配置项目

配置文件类型 demo2

添加 schema.sql

```sql
create table local_user (
    `id` int primary key auto_increment,
    `name` varchar(50) not null,
    `password` varchar(200)
);
```

## 创建 LocalUser 和 LocalUserRepository

创建 LocalUser

```java

@Entity
@Table(name = "local_user")
public class LocalUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String password;

    public LocalUser() {
    }

    public LocalUser(String name) {
        this.name = name;
    }

    public LocalUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
```

创建 LocalUserRepository

```java
@Repository
public interface LocalUserRepository extends JpaRepository<LocalUser, Integer> {

    /**
     *
     * 根据名称获取用户
     *
     * @param name
     * @return
     */
    LocalUser findOneByName(String name);

}
```

## SecurityFilterChain

## UserDetailsService

```java
@Service
public class LocalUserDetailsService implements UserDetailsService {
    private final LocalUserRepository userRepository;

    public LocalUserDetailsService(LocalUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LocalUser user = this.userRepository.findOneByName(username);
        return User.builder().username(user.getName()).password(user.getPassword()).authorities("user").build();
    }
}
```

## PasswordEncoder

## 登录

使用浏览器访问 http://localhost:8080 跳转到登录页
