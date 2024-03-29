package com.erick.forum.controller.form;

import com.erick.forum.modelo.Curso;
import com.erick.forum.modelo.Topico;
import com.erick.forum.repository.CursoRepository;
import com.erick.forum.repository.TopicoRepository;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;


public class TopicoForm {
    @NotNull @NotEmpty @Length(min = 5, max = 10, message = "Presta atencao no tamannho")
    private String titulo;
    @NotEmpty @NotNull
    private String mensagem;
    private String nomeCurso;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Topico converter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return new Topico(titulo, mensagem, curso);
    }
}
