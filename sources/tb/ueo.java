package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ueo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f29329a;
    public String b;
    public String c;

    static {
        t2o.a(352322112);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("deba0fdb", new Object[]{this});
        }
        return this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.f29329a;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("836545fb", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.f29329a = str;
        }
    }
}
