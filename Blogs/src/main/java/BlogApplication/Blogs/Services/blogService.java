package BlogApplication.Blogs.Services;

import BlogApplication.Blogs.Models.blog;
import BlogApplication.Blogs.Repositories.blogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class blogService {
    @Autowired
    public blogRepo blogRep;
    public blog getBlog(int id){
        return blogRep.findById(id).orElse(null);
    }
    public blog addBlog(blog br) {
        blogRep.save(br);
        return br;
    }
    public List<blog> getAll() {
        return blogRep.findAll();
    }
    public boolean deleteId(int id) {
        blogRep.deleteById(id);
        if(getBlog(id)!=null){
            return false;
        }
        return true;
    }
}
