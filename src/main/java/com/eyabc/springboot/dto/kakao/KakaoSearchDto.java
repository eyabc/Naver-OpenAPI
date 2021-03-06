package com.eyabc.springboot.dto.kakao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class KakaoSearchDto<T> {

    private KakaoSearchMeta meta;
    private List<T> documents;

    @Getter
    @Setter
    @NoArgsConstructor
    public static class KakaoSearchMeta {
        private boolean is_end;
        private int pageable_count;
        private long total_count;
    }
}
