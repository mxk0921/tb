package com.xiaomi.push;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bd implements bf {

    /* renamed from: a  reason: collision with root package name */
    private final String f14773a;
    private final String b;

    public bd(String str, String str2) {
        if (str != null) {
            this.f14773a = str;
            this.b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    @Override // com.xiaomi.push.bf
    public String a() {
        return this.f14773a;
    }

    @Override // com.xiaomi.push.bf
    public String b() {
        return this.b;
    }
}
