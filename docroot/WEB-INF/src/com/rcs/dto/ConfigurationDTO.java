package com.rcs.dto;

import java.io.Serializable;

public class ConfigurationDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	// client_id and client_secret 
	// are obtained during application 
	// registration, from the APIs Console
	private String client_id = null;
	private String client_secret = null;
	private String api_key = null;//@@TODO Not used?
	private String account_id = null;
	private String property_id = null;
	private String profile_id = null;
	private String token = null;
	// The refresh token may be used 
	// to obtain new access tokens at any time
	// (because access tokens expire). 
	// This type of access to a Google API 
	// is called offline.
	private String refreshtoken = null;	
	private String authURL = null;
	private String code = null; //@@TODO: should I delete this?
	private String redirect_url = null;
	private boolean isValidAccess;
	
	public ConfigurationDTO() {		
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getApi_key() {
		return api_key;
	}

	public void setApi_key(String api_key) {
		this.api_key = api_key;
	}

	public String getAccount_id() {
		return account_id;
	}

	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	public String getProperty_id() {
		return property_id;
	}

	public void setProperty_id(String property_id) {
		this.property_id = property_id;
	}

	public String getProfile_id() {
		return profile_id;
	}

	public void setProfile_id(String profile_id) {
		this.profile_id = profile_id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getRefreshtoken() {
		return refreshtoken;
	}

	public void setRefreshtoken(String refreshtoken) {
		this.refreshtoken = refreshtoken;
	}

	public String getClient_secret() {
		return client_secret;
	}

	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}

	public String getAuthURL() {
		return authURL;
	}

	public void setAuthURL(String authURL) {
		this.authURL = authURL;
	}

	public boolean isValidAccess() {
		return isValidAccess;
	}

	public void setValidAccess(boolean isValidAccess) {
		this.isValidAccess = isValidAccess;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRedirect_url() {
		return redirect_url;
	}

	public void setRedirect_url(String redirect_url) {
		this.redirect_url = redirect_url;
	}	
	
	
	
}
