package com.crowdin.client.sourcefiles.model;

import com.crowdin.client.core.model.Priority;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class File extends FileInfo {

    private Long revisionId;
    private Long revision;
    private Priority priority;
    private ImportOptions importOptions;
    private ExportOptions exportOptions;
    private Date createdAt;
    private Date updatedAt;
}
