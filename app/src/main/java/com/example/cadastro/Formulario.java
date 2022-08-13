package com.example.cadastro;

import android.text.Editable;

import java.util.Objects;

public class Formulario {
    private String nome;
    private String telefone;
    private String email;
    private boolean ingressarListaEmails;
    private String sexo;
    private String cidade;
    private String UF;

    public Formulario(String nome, String telefone, String email, boolean ingressarListaEmails, String sexo, String cidade, String UF) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.ingressarListaEmails = ingressarListaEmails;
        this.sexo = sexo;
        this.cidade = cidade;
        this.UF = UF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIngressarListaEmails() {
        return ingressarListaEmails;
    }

    public void setIngressarListaEmails(boolean ingressarListaEmails) {
        this.ingressarListaEmails = ingressarListaEmails;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", ingressarListaEmails=" + ingressarListaEmails +
                ", sexo='" + sexo + '\'' +
                ", cidade='" + cidade + '\'' +
                ", UF='" + UF + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Formulario that = (Formulario) o;
        return telefone.equals(that.telefone) && email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telefone, email);
    }
}
