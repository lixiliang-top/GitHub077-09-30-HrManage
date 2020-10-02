package cn.kgc.ssm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customers {
    private Integer id;

    private String name;

    private Integer age;

    private Integer sex;

    private Integer credentialtypeid;

    private String idnumber;

    private Date addtime;

    private String typeName;

}