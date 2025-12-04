package com.hellojava.demo.api.items;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellojava.demo.domain.Item;
public interface ItemRepository extends JpaRepository<Item, Long> {

}
