import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;

import freemarker.core.TemplateClassResolver;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

@Controller
@EnableAutoConfiguration
public class Main {

    @RequestMapping("/")
    @ResponseBody
    String home(@RequestParam(required=false,name="name",defaultValue="") String name) throws Exception {
    	String template ="<!DOCTYPE html><html><body>"+
    					"<form action='/' method='post'>"+
    					"First name:<br>"+
    					"<input type='text' name='name' value=''>"+
    					"<input type='submit' value='Submit'>"+
    					"</form><h2>Hello "+
    					name+
    					"</h2></body></html>";
		Configuration config = new Configuration();
//		config.setAPIBuiltinEnabled(true);
//		config.setNewBuiltinClassResolver(TemplateClassResolver.SAFER_RESOLVER);
		Template t = new Template("home", new StringReader(template), config);
		Writer out = new StringWriter();
		HashMap<Object, Object> model = new HashMap<Object, Object>();
		model.put("value", "world");
		t.process(model,out);
        return out.toString();
    }

    public static void main(String[] args) throws Exception {
    	System.getProperties().put( "server.port", 5051 );
        SpringApplication.run(Main.class, args);
    }
}
