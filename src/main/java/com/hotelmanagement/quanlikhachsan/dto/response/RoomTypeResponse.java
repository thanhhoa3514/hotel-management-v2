package com.hotelmanagement.quanlikhachsan.dto.response;

public record RoomTypeResponse(
        String id,
        String name,
        String description,
        Double pricePerNight
) {
}
