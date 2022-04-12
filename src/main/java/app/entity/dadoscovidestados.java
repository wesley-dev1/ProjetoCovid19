
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela DADOSCOVIDESTADOS
* @generated
*/
@Entity
@Table(name = "\"DADOSCOVIDESTADOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.dadoscovidestados")
public class dadoscovidestados implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "regiao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String regiao;


    /**
    * @generated
    */
    @Column(name = "estado", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String estado;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data;


    /**
    * @generated
    */
    @Column(name = "semanaepidemia", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String semanaepidemia;


    /**
    * @generated
    */
    @Column(name = "casosacumulado", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String casosacumulado;


    /**
    * @generated
    */
    @Column(name = "casosnovos", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String casosnovos;


    /**
    * @generated
    */
    @Column(name = "obitosacumulado", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String obitosacumulado;


    /**
    * @generated
    */
    @Column(name = "obitosnovos", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String obitosnovos;


    /**
    * Construtor
    * @generated
    */
    public dadoscovidestados(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public dadoscovidestados setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém regiao
    * return regiao
    * @generated
    */
    public java.lang.String getRegiao() {
        return this.regiao;
    }

    /**
    * Define regiao
    * @param regiao regiao
    * @generated
    */
    public dadoscovidestados setRegiao(java.lang.String regiao) {
        this.regiao = regiao;
        return this;
    }
    /**
    * Obtém estado
    * return estado
    * @generated
    */
    public java.lang.String getEstado() {
        return this.estado;
    }

    /**
    * Define estado
    * @param estado estado
    * @generated
    */
    public dadoscovidestados setEstado(java.lang.String estado) {
        this.estado = estado;
        return this;
    }
    /**
    * Obtém data
    * return data
    * @generated
    */
    public java.util.Date getData() {
        return this.data;
    }

    /**
    * Define data
    * @param data data
    * @generated
    */
    public dadoscovidestados setData(java.util.Date data) {
        this.data = data;
        return this;
    }
    /**
    * Obtém semanaepidemia
    * return semanaepidemia
    * @generated
    */
    public java.lang.String getSemanaepidemia() {
        return this.semanaepidemia;
    }

    /**
    * Define semanaepidemia
    * @param semanaepidemia semanaepidemia
    * @generated
    */
    public dadoscovidestados setSemanaepidemia(java.lang.String semanaepidemia) {
        this.semanaepidemia = semanaepidemia;
        return this;
    }
    /**
    * Obtém casosacumulado
    * return casosacumulado
    * @generated
    */
    public java.lang.String getCasosacumulado() {
        return this.casosacumulado;
    }

    /**
    * Define casosacumulado
    * @param casosacumulado casosacumulado
    * @generated
    */
    public dadoscovidestados setCasosacumulado(java.lang.String casosacumulado) {
        this.casosacumulado = casosacumulado;
        return this;
    }
    /**
    * Obtém casosnovos
    * return casosnovos
    * @generated
    */
    public java.lang.String getCasosnovos() {
        return this.casosnovos;
    }

    /**
    * Define casosnovos
    * @param casosnovos casosnovos
    * @generated
    */
    public dadoscovidestados setCasosnovos(java.lang.String casosnovos) {
        this.casosnovos = casosnovos;
        return this;
    }
    /**
    * Obtém obitosacumulado
    * return obitosacumulado
    * @generated
    */
    public java.lang.String getObitosacumulado() {
        return this.obitosacumulado;
    }

    /**
    * Define obitosacumulado
    * @param obitosacumulado obitosacumulado
    * @generated
    */
    public dadoscovidestados setObitosacumulado(java.lang.String obitosacumulado) {
        this.obitosacumulado = obitosacumulado;
        return this;
    }
    /**
    * Obtém obitosnovos
    * return obitosnovos
    * @generated
    */
    public java.lang.String getObitosnovos() {
        return this.obitosnovos;
    }

    /**
    * Define obitosnovos
    * @param obitosnovos obitosnovos
    * @generated
    */
    public dadoscovidestados setObitosnovos(java.lang.String obitosnovos) {
        this.obitosnovos = obitosnovos;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
dadoscovidestados object = (dadoscovidestados)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}