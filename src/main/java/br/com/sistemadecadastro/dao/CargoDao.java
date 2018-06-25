package br.com.sistemadecadastro.dao;

import br.com.sistemadecadastro.domain.Cargo;

import java.util.List;



public interface CargoDao {

    void save(Cargo cargo);

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}
