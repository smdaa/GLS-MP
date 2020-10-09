/**
 */
package simplepdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.Ressource_Usage#getUsed_ressource <em>Used ressource</em>}</li>
 *   <li>{@link simplepdl.Ressource_Usage#getUser_WD <em>User WD</em>}</li>
 *   <li>{@link simplepdl.Ressource_Usage#getQuantite <em>Quantite</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getRessource_Usage()
 * @model
 * @generated
 */
public interface Ressource_Usage extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Used ressource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used ressource</em>' reference.
	 * @see #setUsed_ressource(Ressource)
	 * @see simplepdl.SimplepdlPackage#getRessource_Usage_Used_ressource()
	 * @model required="true"
	 * @generated
	 */
	Ressource getUsed_ressource();

	/**
	 * Sets the value of the '{@link simplepdl.Ressource_Usage#getUsed_ressource <em>Used ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used ressource</em>' reference.
	 * @see #getUsed_ressource()
	 * @generated
	 */
	void setUsed_ressource(Ressource value);

	/**
	 * Returns the value of the '<em><b>User WD</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User WD</em>' reference.
	 * @see #setUser_WD(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getRessource_Usage_User_WD()
	 * @model required="true"
	 * @generated
	 */
	WorkDefinition getUser_WD();

	/**
	 * Sets the value of the '{@link simplepdl.Ressource_Usage#getUser_WD <em>User WD</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User WD</em>' reference.
	 * @see #getUser_WD()
	 * @generated
	 */
	void setUser_WD(WorkDefinition value);

	/**
	 * Returns the value of the '<em><b>Quantite</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite</em>' attribute list.
	 * @see simplepdl.SimplepdlPackage#getRessource_Usage_Quantite()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getQuantite();

} // Ressource_Usage
