package org.wishlistapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wishlistapp.model.Gift;

import java.util.List;

public interface GiftRepository extends JpaRepository<Gift, Long> {
    Gift findByOwnerList_Owner_UsernameAndOwnerList_TitleAndTitle(String username, String wishlistTitle, String title);
    List<Gift> findByOwnerList_WishListId(Long wishListId);
}
