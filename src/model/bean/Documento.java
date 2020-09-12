/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Raicley Santana
 */
public class Documento {
      private Integer doc_id;
      private String doc_descricao;
      private Integer doc_criado_por;
      private String doc_dtcriado;
      private String doc_arquivo;
      
      public Documento(){}

    public Integer getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(Integer doc_id) {
        this.doc_id = doc_id;
    }

    public String getDoc_descricao() {
        return doc_descricao;
    }

    public void setDoc_descricao(String doc_descricao) {
        this.doc_descricao = doc_descricao;
    }

    public Integer getDoc_criado_por() {
        return doc_criado_por;
    }

    public void setDoc_criado_por(Integer doc_criado_por) {
        this.doc_criado_por = doc_criado_por;
    }

    public String getDoc_dtcriado() {
        return doc_dtcriado;
    }

    public void setDoc_dtcriado(String doc_dtcriado) {
        this.doc_dtcriado = doc_dtcriado;
    }
      
      
}
