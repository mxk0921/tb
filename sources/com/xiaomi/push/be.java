package com.xiaomi.push;

import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class be {

    /* renamed from: a  reason: collision with root package name */
    public int f14774a;

    /* renamed from: a  reason: collision with other field name */
    public String f763a;

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f764a = new HashMap();

    public String a() {
        return this.f763a;
    }

    public String toString() {
        return String.format("resCode = %1$d, headers = %2$s, response = %3$s", Integer.valueOf(this.f14774a), this.f764a.toString(), this.f763a);
    }
}
