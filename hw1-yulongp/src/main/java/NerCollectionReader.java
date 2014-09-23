import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.util.Progress;
import org.apache.uima.util.ProgressImpl;



public class NerCollectionReader extends CollectionReader_ImplBase {
	/**
	   * Name of configuration parameter that must be set to the path of a directory containing input
	   * files.
	   */
	  public static final String PARAM_INPUT = "src/main/resources/data/sample.in";

	  public BufferedReader infile ;
	  public String line;
	  public int cur_size;
	  public int total_size;

	  /**
	   * @see org.apache.uima.collection.CollectionReader_ImplBase#initialize()
	   */
	  public void initialize()  {
		  try {
			File f=new File(PARAM_INPUT);
			infile = new BufferedReader(new FileReader(f));
			line="";
			cur_size=0;
			total_size=(int) f.length();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  
	  
	  /**
	   * @see org.apache.uima.collection.CollectionReader#hasNext()
	   */
	  public boolean hasNext() {
	    return true;//line!=null;
	  }

	  /**
	   * @see org.apache.uima.collection.CollectionReader#getNext(org.apache.uima.cas.CAS)
	   */
	  public void getNext(CAS aCAS) throws IOException, CollectionException {
		  
		  
	    JCas jcas;
	    try {
	      jcas = aCAS.getJCas();
	    } catch (CASException e) {
	      throw new CollectionException(e);
	    }
	    line=infile.readLine();
	    line=infile.readLine();
	    line=infile.readLine();
	    if(line==null)
	    	return;
	    System.out.println(line);
	    //if(line==null)
	    	//System.out.println("end of file");
	    //if(line==null)
	    	//return;
	    cur_size+=line.length();
	    jcas.setDocumentText(line);
	    
	  }

	  /**
	   * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#close()
	   */
	  public void close() throws IOException {
		  infile.close();
	  }

	  /**
	   * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#getProgress()
	   */
	  public Progress[] getProgress() {
	    return new Progress[] { new ProgressImpl(cur_size, total_size, Progress.ENTITIES) };
	  }

	  
}