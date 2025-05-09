package com.taobao.relationship.mtop.addfollow;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AddFollowWelcomeRequest implements IMTOPDataObject {
    public long accountId;
    public int accountType;
    public String origin;
    public String API_NAME = "mtop.cybertron.follow.welcome";
    public String VERSION = "2.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;

    static {
        t2o.a(759169052);
        t2o.a(589299906);
    }
}
