package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zzq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final zzq DefaultOrangeAllOpenSwitch = new zzq();

    /* renamed from: a  reason: collision with root package name */
    public u0r<String> f33129a = new u0r<>();

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f324f255", new Object[]{this, str})).booleanValue();
        }
        u0r<String> u0rVar = this.f33129a;
        if (u0rVar == null) {
            return false;
        }
        return u0rVar.a(str);
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cef4e93", new Object[]{this, str})).booleanValue();
        }
        u0r<String> u0rVar = this.f33129a;
        if (u0rVar == null) {
            return false;
        }
        return u0rVar.b(str);
    }

    public u0r<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u0r) ipChange.ipc$dispatch("be15ea8d", new Object[]{this});
        }
        return this.f33129a;
    }

    public void d(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a464e3e0", new Object[]{this, str, new Boolean(z)});
        } else {
            this.f33129a.f(str, Boolean.valueOf(z));
        }
    }

    public void e(u0r<String> u0rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d9bee97", new Object[]{this, u0rVar});
        } else {
            this.f33129a = u0rVar;
        }
    }
}
