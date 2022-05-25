package com.naim.Countrys.entities;

import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomAnim", types = { country.class })
public interface AnimalProjection {
public String getNomAnimal();
}