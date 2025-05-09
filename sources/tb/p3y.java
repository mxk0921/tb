package tb;

import android.text.TextUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class p3y {

    /* renamed from: a  reason: collision with root package name */
    public final String f25864a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;

    public p3y(String str, String str2, String str3, String str4, String str5, int i) {
        this.g = 0;
        this.f25864a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        if (str != null) {
            this.g = str.length() / 2;
        }
    }

    public boolean a() {
        String str = this.f25864a;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.b;
            if (!TextUtils.isEmpty(str2)) {
                String str3 = this.c;
                if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(this.d) || str.length() != str2.length() || str2.length() != str3.length() || str3.length() != this.g * 2 || this.f < 0 || TextUtils.isEmpty(this.e)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public String b() {
        return this.f25864a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public String f() {
        return this.e;
    }

    public int g() {
        return this.f;
    }

    public int h() {
        return this.g;
    }
}
