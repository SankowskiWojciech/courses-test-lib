package com.github.sankowskiwojciech.coursestestlib.stub;

import com.github.sankowskiwojciech.coursescorelib.model.db.file.FileUserPermissionsEntity;
import com.github.sankowskiwojciech.coursescorelib.model.db.file.FileUserPermissionsEntityId;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FileUserPermissionsEntityStub {
    public static FileUserPermissionsEntity create(String fileId, String userId, boolean canRead, boolean canModify, boolean canDelete) {
        return new FileUserPermissionsEntity(new FileUserPermissionsEntityId(fileId, userId), canRead, canModify, canDelete);
    }
}
