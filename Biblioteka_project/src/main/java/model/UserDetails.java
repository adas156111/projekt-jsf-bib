package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "UserDetails")
@SequenceGenerator(name = "seq", sequenceName = "seq_userdetails")
public class UserDetails {

	@Id
	@GeneratedValue(generator = "seq",strategy = GenerationType.IDENTITY)
	@Column(name = "id_userdetails", unique = true)
	private long id;
	@Column(nullable = true)
	private String province;
	@Column(nullable = true)
	private String Code;
	@Column(nullable = true)
	private String City;
	@Column(nullable = true)
	private String Street;
	@Column(nullable = true)
	private String flat_number;
	@Column(nullable = true)
	private String phone_number;
	@Type(type = "date")
	@Column(nullable = true)
	private Date birth_date;
	@OneToOne
	@JoinColumn(name = "id_user")
	private User user;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return Code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		Code = code;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return City;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		City = city;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return Street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		Street = street;
	}
	/**
	 * @return the flat_number
	 */
	public String getFlat_number() {
		return flat_number;
	}
	/**
	 * @param flat_number the flat_number to set
	 */
	public void setFlat_number(String flat_number) {
		this.flat_number = flat_number;
	}
	/**
	 * @return the phone_number
	 */
	public String getPhone_number() {
		return phone_number;
	}
	/**
	 * @param phone_number the phone_number to set
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	/**
	 * @return the birth_date
	 */
	public Date getBirth_date() {
		return birth_date;
	}
	/**
	 * @param birth_date the birth_date to set
	 */
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
}
