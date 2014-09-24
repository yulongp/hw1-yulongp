

/* First created by JCasGen Tue Sep 23 14:19:56 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** mention of an entity
 * Updated by JCasGen Tue Sep 23 22:11:15 EDT 2014
 * XML source: /home/paul/git/hw1-yulongp/hw1-yulongp/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class EntityMention extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EntityMention.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected EntityMention() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public EntityMention(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public EntityMention(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public EntityMention(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets id of this mention
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (EntityMention_Type.featOkTst && ((EntityMention_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "EntityMention");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EntityMention_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets id of this mention 
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (EntityMention_Type.featOkTst && ((EntityMention_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "EntityMention");
    jcasType.ll_cas.ll_setStringValue(addr, ((EntityMention_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: start

  /** getter for start - gets start position of this entity mention
   * @generated
   * @return value of the feature 
   */
  public int getStart() {
    if (EntityMention_Type.featOkTst && ((EntityMention_Type)jcasType).casFeat_start == null)
      jcasType.jcas.throwFeatMissing("start", "EntityMention");
    return jcasType.ll_cas.ll_getIntValue(addr, ((EntityMention_Type)jcasType).casFeatCode_start);}
    
  /** setter for start - sets start position of this entity mention 
   * @generated
   * @param v value to set into the feature 
   */
  public void setStart(int v) {
    if (EntityMention_Type.featOkTst && ((EntityMention_Type)jcasType).casFeat_start == null)
      jcasType.jcas.throwFeatMissing("start", "EntityMention");
    jcasType.ll_cas.ll_setIntValue(addr, ((EntityMention_Type)jcasType).casFeatCode_start, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets end position of this entity mention
   * @generated
   * @return value of the feature 
   */
  public int getEnd() {
    if (EntityMention_Type.featOkTst && ((EntityMention_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "EntityMention");
    return jcasType.ll_cas.ll_getIntValue(addr, ((EntityMention_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets end position of this entity mention 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd(int v) {
    if (EntityMention_Type.featOkTst && ((EntityMention_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "EntityMention");
    jcasType.ll_cas.ll_setIntValue(addr, ((EntityMention_Type)jcasType).casFeatCode_end, v);}    
   
    
  //*--------------*
  //* Feature: content

  /** getter for content - gets content of the entity mention
   * @generated
   * @return value of the feature 
   */
  public String getContent() {
    if (EntityMention_Type.featOkTst && ((EntityMention_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "EntityMention");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EntityMention_Type)jcasType).casFeatCode_content);}
    
  /** setter for content - sets content of the entity mention 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContent(String v) {
    if (EntityMention_Type.featOkTst && ((EntityMention_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "EntityMention");
    jcasType.ll_cas.ll_setStringValue(addr, ((EntityMention_Type)jcasType).casFeatCode_content, v);}    
  }

    