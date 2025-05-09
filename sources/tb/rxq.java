package tb;

import android.text.TextUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rxq {

    /* renamed from: a  reason: collision with root package name */
    public String f27666a;
    public Boolean b;

    static {
        t2o.a(147849257);
    }

    public boolean a() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(this.f27666a, str);
    }

    public boolean c() {
        Boolean bool = this.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public void d(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public void e(String str) {
        this.f27666a = str;
    }
}
