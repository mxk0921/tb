package com.ut.mini.internal;

import java.util.HashMap;
import java.util.Map;
import tb.g1v;
import tb.hsq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UTOriginalCustomHitBuilder extends g1v {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f14551a = 0;

    static {
        t2o.a(962593299);
    }

    public UTOriginalCustomHitBuilder(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        if (!hsq.f(str)) {
            super.setProperty(g1v.FIELD_PAGE, str);
        }
        if (i == 1010 || i == 1023) {
            map = map == null ? new HashMap<>() : map;
            map.put("_original_eid", String.valueOf(i));
        }
        super.setProperty(g1v.FIELD_EVENT_ID, String.valueOf(i));
        if (!hsq.f(str2)) {
            super.setProperty(g1v.FIELD_ARG1, str2);
        }
        if (!hsq.f(str3)) {
            super.setProperty(g1v.FIELD_ARG2, str3);
        }
        if (!hsq.f(str4)) {
            super.setProperty(g1v.FIELD_ARG3, str4);
        }
        super.setProperties(map);
    }
}
