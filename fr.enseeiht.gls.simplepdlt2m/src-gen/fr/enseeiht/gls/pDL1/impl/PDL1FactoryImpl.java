/**
 * generated by Xtext 2.17.1
 */
package fr.enseeiht.gls.pDL1.impl;

import fr.enseeiht.gls.pDL1.Guidance;
import fr.enseeiht.gls.pDL1.PDL1Factory;
import fr.enseeiht.gls.pDL1.PDL1Package;
import fr.enseeiht.gls.pDL1.ProcessElement;
import fr.enseeiht.gls.pDL1.Ressource;
import fr.enseeiht.gls.pDL1.Ressource_Usage;
import fr.enseeiht.gls.pDL1.WorkDefinition;
import fr.enseeiht.gls.pDL1.WorkSequence;
import fr.enseeiht.gls.pDL1.WorkSequenceType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PDL1FactoryImpl extends EFactoryImpl implements PDL1Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PDL1Factory init()
  {
    try
    {
      PDL1Factory thePDL1Factory = (PDL1Factory)EPackage.Registry.INSTANCE.getEFactory(PDL1Package.eNS_URI);
      if (thePDL1Factory != null)
      {
        return thePDL1Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PDL1FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PDL1FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PDL1Package.PROCESS: return createProcess();
      case PDL1Package.PROCESS_ELEMENT: return createProcessElement();
      case PDL1Package.RESSOURCE: return createRessource();
      case PDL1Package.RESSOURCE_USAGE: return createRessource_Usage();
      case PDL1Package.WORK_DEFINITION: return createWorkDefinition();
      case PDL1Package.WORK_SEQUENCE: return createWorkSequence();
      case PDL1Package.GUIDANCE: return createGuidance();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PDL1Package.WORK_SEQUENCE_TYPE:
        return createWorkSequenceTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PDL1Package.WORK_SEQUENCE_TYPE:
        return convertWorkSequenceTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public fr.enseeiht.gls.pDL1.Process createProcess()
  {
    ProcessImpl process = new ProcessImpl();
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProcessElement createProcessElement()
  {
    ProcessElementImpl processElement = new ProcessElementImpl();
    return processElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ressource createRessource()
  {
    RessourceImpl ressource = new RessourceImpl();
    return ressource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ressource_Usage createRessource_Usage()
  {
    Ressource_UsageImpl ressource_Usage = new Ressource_UsageImpl();
    return ressource_Usage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WorkDefinition createWorkDefinition()
  {
    WorkDefinitionImpl workDefinition = new WorkDefinitionImpl();
    return workDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WorkSequence createWorkSequence()
  {
    WorkSequenceImpl workSequence = new WorkSequenceImpl();
    return workSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Guidance createGuidance()
  {
    GuidanceImpl guidance = new GuidanceImpl();
    return guidance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkSequenceType createWorkSequenceTypeFromString(EDataType eDataType, String initialValue)
  {
    WorkSequenceType result = WorkSequenceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertWorkSequenceTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PDL1Package getPDL1Package()
  {
    return (PDL1Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PDL1Package getPackage()
  {
    return PDL1Package.eINSTANCE;
  }

} //PDL1FactoryImpl
