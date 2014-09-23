import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceProcessException;

public class CasConsumer extends CasConsumer_ImplBase {
	
	public static final String PARAM_OUTPUT = "";
	
	public void initialize() {
	    
    }
	public void processCas(CAS aCAS) throws ResourceProcessException  {
	    JCas jcas;
	    try {
	      jcas = aCAS.getJCas();
	    } catch (CASException e) {
	      throw new ResourceProcessException(e);
	    }

	    // retrieve the filename of the input file from the CAS
	    FSIterator it = jcas.getAnnotationIndex(Sentence.type).iterator();
	   
	    if (it.hasNext()) {
	    	Sentence s=(Sentence)it.next();
	    	//System.out.println(s.getId()+"\t"+s.getContent());
	    }
	    
	    
	  }

}