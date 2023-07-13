package com.bodega.bodega.infraestructure.adapter;

import com.bodega.bodega.infraestructure.entity.ClientEntity;

import org.springframework.data.repository.CrudRepository;

public interface IClientCrudRepositoryAdapter extends CrudRepository<ClientEntity,Integer> {
}
