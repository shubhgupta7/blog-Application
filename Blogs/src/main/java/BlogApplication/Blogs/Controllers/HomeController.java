package BlogApplication.Blogs.Controllers;

import BlogApplication.Blogs.Models.blog;
import BlogApplication.Blogs.Services.blogService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    public blogService blogServ;

    //HomeController
    @GetMapping("/")
    public ResponseEntity<String> home(){
        return ResponseEntity.ok("Checked at -> "+LocalDateTime.now().getHour() +":"+ LocalDateTime.now().getMinute()+":"+LocalDateTime.now().getSecond());
    }

    //For getting a list of all blogs
    @GetMapping("/blogs")
    public ResponseEntity<List<blog>> getBlogs(){
        return ResponseEntity.ok(blogServ.getAll());
    }

    //For getting a particular Blog
    @GetMapping("/{id}")
    public ResponseEntity<blog> getBlog(@PathVariable int id){
        return ResponseEntity.ok(blogServ.getBlog(id));
    }

    // For Deleting a blog by id
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBlog(@PathVariable int id){
        if(blogServ.getBlog(id)==null){
            return ResponseEntity.status(404).body("Blog Not Found");
        }
        boolean del = blogServ.deleteId(id);
        if(del){
            return ResponseEntity.ok("Deleted");
        }
        return ResponseEntity.ok("Not Deleted");
    }

    //For Updating
//    @PutMapping("/{id}")
//    public ResponseEntity<blog> updateBlog(@PathVariable int id, @Re)

//    //For Pagenation
//    // For Adding a Blog

//    @PostMapping("/addblog")
//    public ResponseEntity<blog> addBlog(){
//        blog br = new blog();
//        br.setAuthor("Shubh");
//        br.setTitle("Time");
//        blog g = blogServ.addBlog(br);
//        return ResponseEntity.ok(g);
//    }



}
