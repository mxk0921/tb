package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class x7v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f31196a;
    public final String b;
    public final String c;

    static {
        t2o.a(83886275);
    }

    public x7v(String str, String str2, String str3) {
        this.f31196a = str;
        this.b = str2;
        this.c = str3;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0aa84ca", new Object[]{this});
        }
        return this.f31196a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ded0b07e", new Object[]{this});
        }
        return this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d7f8791", new Object[]{this});
        }
        return this.b;
    }
}
