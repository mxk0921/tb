package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class wlf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f30763a = "Unknown";
    public boolean b = true;
    public String c = "";
    public String d = "";
    public String e;
    public String f;

    static {
        t2o.a(481297178);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("214c5ebd", new Object[]{this});
        }
        return this.f30763a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("522dd71", new Object[]{this});
        }
        return this.c;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d161f33", new Object[]{this});
        }
        return this.d;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("175681f6", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8cf7a473", new Object[]{this});
        }
        return this.f;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b02a625", new Object[]{this});
        }
        return this.e;
    }

    public final void g(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4763d", new Object[]{this, str, str2, str3});
            return;
        }
        this.e = str;
        this.f = str2;
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113c1783", new Object[]{this, str});
            return;
        }
        ckf.g(str, "avaType");
        this.f30763a = str;
        this.b = true;
        tmf.e(this);
    }

    public final void h(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6727b1de", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, "avaType");
        this.f30763a = str;
        this.b = false;
        if (TextUtils.isEmpty(str2)) {
            str2 = "unknown";
        }
        this.c = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = "unknown";
        }
        this.d = str3;
        tmf.e(this);
    }
}
