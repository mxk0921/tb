package com.xiaomi.push;

import com.xiaomi.push.cg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cc extends cg.d {

    /* renamed from: a  reason: collision with root package name */
    protected String f14795a;

    public cc(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr);
        this.f14795a = str3;
    }

    public static cc a(String str) {
        return new cc(str, "status = ?", new String[]{String.valueOf(2)}, "a job build to delete uploaded job");
    }
}
