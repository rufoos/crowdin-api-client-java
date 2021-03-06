package com.crowdin.client.screenshots.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class TagResponseList {

    private List<TagResponseObject> data;
    private Pagination pagination;

    public static ResponseList<Tag> to(TagResponseList tagResponseList) {
        return ResponseList.of(
                tagResponseList.getData().stream()
                        .map(TagResponseObject::getData)
                        .map(ResponseObject::of)
                        .collect(Collectors.toList()),
                tagResponseList.getPagination()
        );
    }
}
