package com.github.sankowskiwojciech.coursestestlib.stub;

import com.github.sankowskiwojciech.coursescorelib.model.db.file.FileEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.FILE_CONTENT_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.FILE_EXTENSION_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.FILE_NAME_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.TUTOR_EMAIL_ADDRESS_STUB;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FileEntityStub {
    public static FileEntity create() {
        return FileEntity.builder()
                .name(FILE_NAME_STUB)
                .extension(FILE_EXTENSION_STUB)
                .content(FILE_CONTENT_STUB)
                .createdBy(TUTOR_EMAIL_ADDRESS_STUB)
                .creationDateTime(LocalDateTime.now())
                .build();
    }
}
