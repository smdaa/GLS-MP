/**
 */
package simplepdl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simplepdl.Ressource;
import simplepdl.Ressource_Usage;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressource Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.Ressource_UsageImpl#getUsed_ressource <em>Used ressource</em>}</li>
 *   <li>{@link simplepdl.impl.Ressource_UsageImpl#getUser_WD <em>User WD</em>}</li>
 *   <li>{@link simplepdl.impl.Ressource_UsageImpl#getQuantite <em>Quantite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Ressource_UsageImpl extends ProcessElementImpl implements Ressource_Usage {
	/**
	 * The cached value of the '{@link #getUsed_ressource() <em>Used ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsed_ressource()
	 * @generated
	 * @ordered
	 */
	protected Ressource used_ressource;

	/**
	 * The cached value of the '{@link #getUser_WD() <em>User WD</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_WD()
	 * @generated
	 * @ordered
	 */
	protected WorkDefinition user_WD;

	/**
	 * The default value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected int quantite = QUANTITE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ressource_UsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.RESSOURCE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource getUsed_ressource() {
		if (used_ressource != null && used_ressource.eIsProxy()) {
			InternalEObject oldUsed_ressource = (InternalEObject)used_ressource;
			used_ressource = (Ressource)eResolveProxy(oldUsed_ressource);
			if (used_ressource != oldUsed_ressource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.RESSOURCE_USAGE__USED_RESSOURCE, oldUsed_ressource, used_ressource));
			}
		}
		return used_ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource basicGetUsed_ressource() {
		return used_ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsed_ressource(Ressource newUsed_ressource) {
		Ressource oldUsed_ressource = used_ressource;
		used_ressource = newUsed_ressource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCE_USAGE__USED_RESSOURCE, oldUsed_ressource, used_ressource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition getUser_WD() {
		if (user_WD != null && user_WD.eIsProxy()) {
			InternalEObject oldUser_WD = (InternalEObject)user_WD;
			user_WD = (WorkDefinition)eResolveProxy(oldUser_WD);
			if (user_WD != oldUser_WD) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.RESSOURCE_USAGE__USER_WD, oldUser_WD, user_WD));
			}
		}
		return user_WD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition basicGetUser_WD() {
		return user_WD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser_WD(WorkDefinition newUser_WD) {
		WorkDefinition oldUser_WD = user_WD;
		user_WD = newUser_WD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCE_USAGE__USER_WD, oldUser_WD, user_WD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantite() {
		return quantite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantite(int newQuantite) {
		int oldQuantite = quantite;
		quantite = newQuantite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCE_USAGE__QUANTITE, oldQuantite, quantite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE_USAGE__USED_RESSOURCE:
				if (resolve) return getUsed_ressource();
				return basicGetUsed_ressource();
			case SimplepdlPackage.RESSOURCE_USAGE__USER_WD:
				if (resolve) return getUser_WD();
				return basicGetUser_WD();
			case SimplepdlPackage.RESSOURCE_USAGE__QUANTITE:
				return getQuantite();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE_USAGE__USED_RESSOURCE:
				setUsed_ressource((Ressource)newValue);
				return;
			case SimplepdlPackage.RESSOURCE_USAGE__USER_WD:
				setUser_WD((WorkDefinition)newValue);
				return;
			case SimplepdlPackage.RESSOURCE_USAGE__QUANTITE:
				setQuantite((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE_USAGE__USED_RESSOURCE:
				setUsed_ressource((Ressource)null);
				return;
			case SimplepdlPackage.RESSOURCE_USAGE__USER_WD:
				setUser_WD((WorkDefinition)null);
				return;
			case SimplepdlPackage.RESSOURCE_USAGE__QUANTITE:
				setQuantite(QUANTITE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE_USAGE__USED_RESSOURCE:
				return used_ressource != null;
			case SimplepdlPackage.RESSOURCE_USAGE__USER_WD:
				return user_WD != null;
			case SimplepdlPackage.RESSOURCE_USAGE__QUANTITE:
				return quantite != QUANTITE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (quantite: ");
		result.append(quantite);
		result.append(')');
		return result.toString();
	}

} //Ressource_UsageImpl
