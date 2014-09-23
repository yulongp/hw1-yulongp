import java.util.Iterator;
import java.util.regex.Matcher;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.tutorial.RoomNumber;


public class NERAnnotator extends JCasAnnotator_ImplBase {
	public void process(JCas aJCas) {
	    
		String str = aJCas.getDocumentText();
		Sentence s=new Sentence(aJCas);
	    int idx=str.indexOf(" ");
	    String id=str.substring(0, idx);
	    String content=str.substring(idx+1, str.length()-1);
	    s.setId(id);
	    s.setContent(content);
	    s.addToIndexes();
	    //System.out.println(s);
	  }
}