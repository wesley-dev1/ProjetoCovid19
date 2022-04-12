
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
* Classe que representa a tabela DADOSBRA
* @generated
*/
@Entity
@Table(name = "\"DADOSBRA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.dadosbra")
public class dadosbra implements Serializable {
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
    @Column(name = "pais", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String pais;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "dia", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dia;


    /**
    * @generated
    */
    @Column(name = "semanaepidemia", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String semanaepidemia;


    /**
    * @generated
    */
    @Column(name = "casosacumulados", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String casosacumulados;


    /**
    * @generated
    */
    @Column(name = "casosnovos", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String casosnovos;


    /**
    * @generated
    */
    @Column(name = "obitosacumulados", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String obitosacumulados;


    /**
    * @generated
    */
    @Column(name = "obitosnovos", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String obitosnovos;


    /**
    * @generated
    */
    @Column(name = "recuperadosnovos", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String recuperadosnovos;


    /**
    * @generated
    */
    @Column(name = "acompanhamentonovos", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String acompanhamentonovos;


    /**
    * Construtor
    * @generated
    */
    public dadosbra(){
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
    public dadosbra setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém pais
    * return pais
    * @generated
    */
    public java.lang.String getPais() {
        return this.pais;
    }

    /**
    * Define pais
    * @param pais pais
    * @generated
    */
    public dadosbra setPais(java.lang.String pais) {
        this.pais = pais;
        return this;
    }
    /**
    * Obtém dia
    * return dia
    * @generated
    */
    public java.util.Date getDia() {
        return this.dia;
    }

    /**
    * Define dia
    * @param dia dia
    * @generated
    */
    public dadosbra setDia(java.util.Date dia) {
        this.dia = dia;
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
    public dadosbra setSemanaepidemia(java.lang.String semanaepidemia) {
        this.semanaepidemia = semanaepidemia;
        return this;
    }
    /**
    * Obtém casosacumulados
    * return casosacumulados
    * @generated
    */
    public java.lang.String getCasosacumulados() {
        return this.casosacumulados;
    }

    /**
    * Define casosacumulados
    * @param casosacumulados casosacumulados
    * @generated
    */
    public dadosbra setCasosacumulados(java.lang.String casosacumulados) {
        this.casosacumulados = casosacumulados;
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
    public dadosbra setCasosnovos(java.lang.String casosnovos) {
        this.casosnovos = casosnovos;
        return this;
    }
    /**
    * Obtém obitosacumulados
    * return obitosacumulados
    * @generated
    */
    public java.lang.String getObitosacumulados() {
        return this.obitosacumulados;
    }

    /**
    * Define obitosacumulados
    * @param obitosacumulados obitosacumulados
    * @generated
    */
    public dadosbra setObitosacumulados(java.lang.String obitosacumulados) {
        this.obitosacumulados = obitosacumulados;
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
    public dadosbra setObitosnovos(java.lang.String obitosnovos) {
        this.obitosnovos = obitosnovos;
        return this;
    }
    /**
    * Obtém recuperadosnovos
    * return recuperadosnovos
    * @generated
    */
    public java.lang.String getRecuperadosnovos() {
        return this.recuperadosnovos;
    }

    /**
    * Define recuperadosnovos
    * @param recuperadosnovos recuperadosnovos
    * @generated
    */
    public dadosbra setRecuperadosnovos(java.lang.String recuperadosnovos) {
        this.recuperadosnovos = recuperadosnovos;
        return this;
    }
    /**
    * Obtém acompanhamentonovos
    * return acompanhamentonovos
    * @generated
    */
    public java.lang.String getAcompanhamentonovos() {
        return this.acompanhamentonovos;
    }

    /**
    * Define acompanhamentonovos
    * @param acompanhamentonovos acompanhamentonovos
    * @generated
    */
    public dadosbra setAcompanhamentonovos(java.lang.String acompanhamentonovos) {
        this.acompanhamentonovos = acompanhamentonovos;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
dadosbra object = (dadosbra)obj;
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