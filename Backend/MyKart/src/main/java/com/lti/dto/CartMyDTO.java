package com.lti.dto;

public class CartMyDTO {
	private CartDTO cartdto;
	private ProductDTO productdto;
	public CartDTO getCartdto() {
		return cartdto;
	}
	public void setCartdto(CartDTO cartdto) {
		this.cartdto = cartdto;
	}
	public ProductDTO getProductdto() {
		return productdto;
	}
	public void setProductdto(ProductDTO productdto) {
		this.productdto = productdto;
	}
	public CartMyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartMyDTO(CartDTO cartdto, ProductDTO productdto) {
		super();
		this.cartdto = cartdto;
		this.productdto = productdto;
	}
	@Override
	public String toString() {
		return "CartMyDTO [cartdto=" + cartdto + ", productdto=" + productdto + "]";
	}
	
	

}
