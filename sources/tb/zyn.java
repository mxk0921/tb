package tb;

import android.text.TextUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zyn {

    /* renamed from: a  reason: collision with root package name */
    public String f33110a;
    public String b;
    public String c;

    public boolean a() {
        if ((!TextUtils.isEmpty(this.c) || !TextUtils.isEmpty(null)) && !TextUtils.isEmpty(this.f33110a)) {
            return true;
        }
        return false;
    }

    public String b() {
        return this.f33110a;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.b;
    }

    public void e(String str) {
        this.f33110a = str;
    }

    public void f(String str) {
        this.c = str;
    }

    public void g(String str) {
        this.b = str;
    }

    public String toString() {
        return this.f33110a + "|null|" + this.c;
    }
}
