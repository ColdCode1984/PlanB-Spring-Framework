package sping.in.action.chapter5.spittr.repository;


import sping.in.action.chapter5.spittr.domain.Spitter;

public interface SpitterRepository {

    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);

}
