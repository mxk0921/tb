package com.ali.user.mobile.login.model;

import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NeedLoginInfo implements Serializable {
    public long expire;
    public List<NeedLoginLimitStrategies> needLoginLimitStrategies;
    public List<NeedLoginStrategy> needLoginStrategies;

    static {
        t2o.a(69206130);
    }
}
