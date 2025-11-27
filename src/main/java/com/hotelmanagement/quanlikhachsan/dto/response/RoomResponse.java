package com.hotelmanagement.quanlikhachsan.dto.response;

import java.util.List;

public record RoomResponse(
        String id,
        String roomNumber,
        RoomTypeResponse roomType,
        RoomStatusResponse roomStatus,
        short floor,
        String note,
        List<RoomImageResponse> images
) {
}
