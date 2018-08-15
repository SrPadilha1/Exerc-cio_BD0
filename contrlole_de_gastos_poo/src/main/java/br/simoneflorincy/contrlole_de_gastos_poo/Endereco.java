/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.simoneflorincy.contrlole_de_gastos_poo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author User
 */
   @Entity
   @Table(name = "endereco")
   public class Endereco implements Serializable {

    /**
     * @return the codEndereco
     */
    public Integer getCodEndereco() {
        return codEndereco;
    }

    /**
     * @param codEndereco the codEndereco to set
     */
    public void setCodEndereco(Integer codEndereco) {
        this.codEndereco = codEndereco;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(Integer cep) {
        this.cep = cep;
    }
   //cd_enderco
    @Id
    @Column(name = "cd_endereco")
    private Integer codEndereco;
    @Column(name = "telefone2")
    @OneToOne(targetEntity = Endereco.class,
            cascade = CascadeType.REMOVE,
            fetch = FetchType.EAGER)
    private String bairro;
    @Column(name = "nm_bairro")
    private Integer cep;
    @Column(name = "ds_cep")
    private String cidade;
    @Column(name = "nm_cidade")
    private String complemento;
    @Column(name = "ds_complemento")
    private String numero;
    @Column(name = "nr_casa")
    private String rua;
    @Column(name = "nm_rua")
    private Integer telefone1;
    @Column(name = "telefone1")
    private Integer telefone2;
    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cep
     */
    public Integer getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.setCep(cep);
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the telefone1
     */
    public Integer getTelefone1() {
        return telefone1;
    }

    /**
     * @param telefone1 the telefone1 to set
     */
    public void setTelefone1(Integer telefone1) {
        this.telefone1 = telefone1;
    }

    /**
     * @return the telefone2
     */
    public Integer getTelefone2() {
        return telefone2;
    }

    /**
     * @param telefone2 the telefone2 to set
     */
    public void setTelefone2(Integer telefone2) {
        this.telefone2 = telefone2;
    }

}
