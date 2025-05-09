package tb;

import java.net.URL;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class x3y {

    /* renamed from: a  reason: collision with root package name */
    public final int f31130a = 0;
    public String b;
    public String c;

    public x3y(String str) {
        this.b = str;
    }

    public final URL a() {
        try {
            return new URL(this.b);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(String str) {
        if (str != null) {
            str.getBytes();
            this.c = str;
        }
    }

    public final String c() {
        if (this.f31130a == 1) {
            return "POST";
        }
        return "GET";
    }

    public final void d(String str) {
        this.b = str;
    }

    public final String e() {
        return this.c;
    }

    public x3y(String str, byte b) {
        this.b = str;
    }
}
