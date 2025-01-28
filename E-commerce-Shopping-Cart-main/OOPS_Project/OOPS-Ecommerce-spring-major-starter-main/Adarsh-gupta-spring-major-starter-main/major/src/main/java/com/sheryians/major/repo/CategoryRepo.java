package com.sheryians.major.repo;

import com.sheryians.major.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer>
{

}
