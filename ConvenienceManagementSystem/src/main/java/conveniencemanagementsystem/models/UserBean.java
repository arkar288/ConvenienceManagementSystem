package conveniencemanagementsystem.models;
import java.sql.Blob;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.springframework.web.multipart.MultipartFile;


public class UserBean {
	private int id;
	@NotEmpty(message = "Enter your name")
	private String username;
	@Email(message = "Enter your email")
	private String email;
	private String staff_id;
	private String dob;
	private int roles_id;
	
	@NotEmpty(message = "Gender is requried")
	private String gender;
	@Min(1000000000)
	@Max(9999999999L)
	private String phone;
	@NotEmpty(message = "Enter your NRC.")
	private String nrc;
	private MultipartFile multipart;
	private Blob image_blob;
	private String profile_image;
	@Pattern(regexp = "^[a-zA-Z0-9]{3,10}$")
	private String password;
	private boolean is_disabled;
	
	public boolean isIs_disabled() {
		return is_disabled;
	}

	public void setIs_disabled(boolean is_disabled) {
		this.is_disabled = is_disabled;
	}
	
	public int getRoles_id() {
		return roles_id;
	}

	public void setRoles_id(int roles_id) {
		this.roles_id = roles_id;
	}

	public UserBean() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}
	
	public String getDob() {
		return dob;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNrc() {
		return nrc;
	}
	
	public void setNrc(String nrc) {
		this.nrc = nrc;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Blob getImage_blob() {
		return image_blob;
	}

	public void setImage_blob(Blob image_blob) {
		this.image_blob = image_blob;
	}
	
	public String getProfile_image() {
		return profile_image;
	}

	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}
	
	public MultipartFile getMultipart() {
		return multipart;
	}

	public void setMultipart(MultipartFile multipart) {
		this.multipart = multipart;
	}	
}