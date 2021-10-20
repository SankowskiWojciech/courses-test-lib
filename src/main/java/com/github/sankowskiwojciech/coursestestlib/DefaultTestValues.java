package com.github.sankowskiwojciech.coursestestlib;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DefaultTestValues {
    //subdomain
    public static final String SUBDOMAIN_ALIAS_STUB = "ssit";

    //organization
    public static final String ORGANIZATION_ALIAS_STUB = "zslitnr1";
    public static final String ORGANIZATION_NAME_STUB = "Zespół szkół licealnych i technicznych nr 1 w Warszawie";
    public static final String ORGANIZATION_DESCRIPTION_STUB = "Technikum mechatroniczno - informatyczne";
    public static final String ORGANIZATION_EMAIL_ADDRESS_STUB = "info@zslitnr1.pl";
    public static final String ORGANIZATION_PHONE_NUMBER_STUB = "123456789";
    public static final String ORGANIZATION_WEBSITE_URL_STUB = "http://zslitnr1.pl";

    //tutor
    public static final String TUTOR_ALIAS_STUB = "wsankowski";
    public static final String TUTOR_FIRST_NAME_STUB = "Wojciech";
    public static final String TUTOR_LAST_NAME_STUB = "Sankowski";
    public static final String TUTOR_DESCRIPTION_STUB = "Java Developer";
    public static final String TUTOR_EMAIL_ADDRESS_STUB = "sankowski.wojciech@gmail.com";
    public static final String TUTOR_PHONE_NUMBER_STUB = "111222333";
    public static final String TUTOR_EMAIL_ADDRESS_STUB_2 = "kaminski.bart@dancewithme.pl";

    //user
    public static final String USER_ID_STUB = "user@test.com";

    //student
    public static final String STUDENT_FIRST_NAME_STUB = "Marcin";
    public static final String STUDENT_LAST_NAME_STUB = "Baczewski";
    public static final String STUDENT_EMAIL_ADDRESS_STUB = "marcin.b@gmail.com";

    //parent
    public static final String PARENT_EMAIL_ADDRESS_STUB = "kbac@gmail.com";

    //group
    public static final String GROUP_ID_STUB = "c3fe86e3-a498-4880-9d15-3d2516951493";
    public static final String GROUP_NAME_STUB = "English C2";
    public static final String GROUP_DESCRIPTION_STUB = "Group description";

    //token and password
    public static final String TOKEN_VALUE_STUB = "tokenIsValid";
    public static final String RSA_PUBLIC_KEY_STUB = "rsaPublicKey";
    public static final String PASSWORD_STUB = "VGVzdDE=";
    public static final String PASSWORD_HASH_STUB = "$2a$15$IuZTBhr5cSi9f4uaZ52uOekG.S/CvFRtxNhQGh1yjhHwJrOY0GbkW";
    public static final String INVALID_PASSWORD_STUB = Base64.getEncoder().encodeToString("INVALID_PASSWORD_STUB".getBytes());
    public static final byte[] RSA_PUBLIC_KEY_BYTE_ARRAY_STUB = RSA_PUBLIC_KEY_STUB.getBytes();
    public static final String TOKEN_STUB = "jwsTokenStub";

    //lesson
    public static final String INDIVIDUAL_LESSON_ID_STUB = "f0604742-8031-4d8a-b6e4-a9d7faaaaba3";
    public static final String LESSON_TITLE_STUB = "Tytul lekcji.";
    public static final String LESSON_DESCRIPTION_STUB = "Opis lekcji.";

    //file
    public static final byte[] FILE_CONTENT_STUB = "This is a test file!".getBytes();
    public static final String FILE_ID_STUB = "65462773-84dc-4738-816b-d044409498bf";
    public static final String FILE_NAME_STUB = "Test file.pdf";
    public static final String FILE_EXTENSION_STUB = "pdf";
    public static final String FILE_CONTENT_TYPE_STUB = "application/pdf";
    public static final String FILE_CREATED_BY_STUB = "sankowski.wojciech@gmail.com";
    public static final LocalDateTime FILE_CREATION_DATE_TIME_STUB = LocalDateTime.now();
    public static final List<String> FILES_IDS_STUB = Arrays.asList("65462773-84dc-4738-816b-d044409498bf");
}
