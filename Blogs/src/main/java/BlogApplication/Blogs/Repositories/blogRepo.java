package BlogApplication.Blogs.Repositories;

import BlogApplication.Blogs.Models.blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface blogRepo extends JpaRepository<blog,Integer> {

}
