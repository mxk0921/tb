package tb;

import android.graphics.Bitmap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class olh {

    /* renamed from: a  reason: collision with root package name */
    public final int f25458a;
    public final int b;
    public final String c;
    public final String d;
    public Bitmap e;

    public olh(int i, int i2, String str, String str2, String str3) {
        this.f25458a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    public Bitmap a() {
        return this.e;
    }

    public String b() {
        return this.d;
    }

    public int c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public int e() {
        return this.f25458a;
    }

    public boolean f() {
        if (this.e == null) {
            String str = this.d;
            if (!str.startsWith("data:") || str.indexOf(nwl.BASE_64) <= 0) {
                return false;
            }
        }
        return true;
    }

    public void g(Bitmap bitmap) {
        this.e = bitmap;
    }
}
