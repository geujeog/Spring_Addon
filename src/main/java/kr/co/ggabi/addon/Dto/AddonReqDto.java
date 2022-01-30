package kr.co.ggabi.addon.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Blob;
import java.util.List;

@Getter
@NoArgsConstructor
public class AddonReqDto {

    public String userName;
    public String mailId;

    public List<String> fileNames;
    public List<Blob> files;

}

