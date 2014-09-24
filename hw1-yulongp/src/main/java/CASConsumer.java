import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceProcessException;

public class CASConsumer extends CasConsumer_ImplBase {

	public BufferedWriter outfile;

	public void initialize() {
		// open the output file
		try {
			File file = new File((String) getConfigParameterValue("OutputFile"));
			file.createNewFile();
			outfile = new BufferedWriter(new FileWriter(file));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void collectionProcessComplete() {
		try {
			outfile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void processCas(CAS aCAS) throws ResourceProcessException {
		JCas jcas;
		try {
			jcas = aCAS.getJCas();
		} catch (CASException e) {
			throw new ResourceProcessException(e);
		}

		// retrieve the filename of the input file from the CAS
		FSIterator it = jcas.getAnnotationIndex(EntityMention.type).iterator();

		if (it.hasNext()) {
			EntityMention s = (EntityMention) it.next();
			// write the entity mention to the output file
			try {
				outfile.write(s.getId() + "|" + s.getStart() + " " + s.getEnd()
						+ "|" + s.getContent() + "\n");
				outfile.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}