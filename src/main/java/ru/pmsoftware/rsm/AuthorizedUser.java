package ru.pmsoftware.rsm;

import ru.pmsoftware.rsm.model.BaseEntity;

public class AuthorizedUser {
    public static int id = BaseEntity.START_SEQ;

    public static int id() {
        return id;
    }

    public static void setId(int id) {
        AuthorizedUser.id = id;
    }

}
