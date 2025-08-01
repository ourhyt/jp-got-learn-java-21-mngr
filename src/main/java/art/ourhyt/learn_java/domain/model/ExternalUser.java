package art.ourhyt.learn_java.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ExternalUser {
    private Long id;
    private String name;
    private String email;
}
