package backend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;

public class RoleDto {

    private Integer id;
    private String name;


    ///////////////////////////////////////////////////////////////////////
    ///////////////////////// GETTERS AND SETTERS /////////////////////////
    ///////////////////////////////////////////////////////////////////////

    @JsonIgnore
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
}
