package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
		
	}

	public Reservation(Integer roomNumber, Date checkin, Date checkout) {

		this.roomNumber = roomNumber;
		this.checkIn = checkin;
		this.checkOut = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkIn;
	}

	public Date getCheckout() {
		return checkOut;
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public Long duration() {
		
		Long diff = checkOut.getTime() - checkIn.getTime(); // retorna o tempo em millisegundos
		
		return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
		
	}

	@Override
	public String toString() {
		return "Reservation: Room "
				+ roomNumber
				+ ", check-in: "
				+ sdf.format(checkIn)
				+ ", check-out: "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights";
	}
	

}
