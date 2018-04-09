/**
 * 
 */
package dev.paie.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author GOBERT Guillaume
 *
 */
@Entity
@Table(name = "UTILISATEUR")
public class Utilisateur {

	public enum ROLES {
		ROLE_ADMINISTRATEUR, ROLE_UTILISATEUR
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "NOM_UTILISATEUR", unique = true)
	private String nomUtilisateur;
	@Column(name = "MOT_DE_PASSE", unique = true)
	private String motDePasse;
	@Column(name = "ACTIF")
	private Boolean estActif;
	@Column(name = "ROLE")
	@Enumerated(EnumType.STRING)
	private ROLES role;

	public Utilisateur() {
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the nomUtilisateur
	 */
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	/**
	 * Setter
	 * 
	 * @param nomUtilisateur
	 *            the nomUtilisateur to set
	 */
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	/**
	 * Getter
	 * 
	 * @return the motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}

	/**
	 * Setter
	 * 
	 * @param motDePasse
	 *            the motDePasse to set
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	/**
	 * Getter
	 * 
	 * @return the estActif
	 */
	public Boolean getEstActif() {
		return estActif;
	}

	/**
	 * Setter
	 * 
	 * @param estActif
	 *            the estActif to set
	 */
	public void setEstActif(Boolean estActif) {
		this.estActif = estActif;
	}

	/**
	 * Getter
	 * 
	 * @return the role
	 */
	public ROLES getRole() {
		return role;
	}

	/**
	 * Setter
	 * 
	 * @param role
	 *            the role to set
	 */
	public void setRole(ROLES role) {
		this.role = role;
	}
}