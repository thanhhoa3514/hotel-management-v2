package com.hotelmanagement.quanlikhachsan.dto.response;

import java.time.LocalDateTime;

public record RoomImageResponse(
        String id,
        String roomId,
        String imageUrl,
        String description,
        Boolean isPrimary,
        short displayOrder,
        LocalDateTime createdAt
) {
}
