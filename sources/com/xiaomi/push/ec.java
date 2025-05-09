package com.xiaomi.push;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ec {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ec f14846a;

    /* renamed from: a  reason: collision with other field name */
    private eb f882a;

    /* renamed from: a  reason: collision with other method in class */
    public eb m602a() {
        return this.f882a;
    }

    public static ec a() {
        if (f14846a == null) {
            synchronized (ec.class) {
                try {
                    if (f14846a == null) {
                        f14846a = new ec();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14846a;
    }

    public void a(eb ebVar) {
        this.f882a = ebVar;
    }
}
