package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jd3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f21929a = true;
    public String b;
    public String c;

    static {
        t2o.a(479199537);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e903c9b3", new Object[]{this});
        }
        return this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71b2ca8f", new Object[]{this});
        }
        return this.c;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.f21929a;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c154e8b", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b900ec7", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof jd3)) {
            return false;
        }
        jd3 jd3Var = (jd3) obj;
        if (c() != jd3Var.c()) {
            return false;
        }
        if (a() == null && jd3Var.a() == null) {
            if (b() == null && jd3Var.b() == null) {
                return true;
            }
            if (b() == null || jd3Var.b() == null) {
                return false;
            }
            return b().equals(jd3Var.b());
        } else if (a() == null || jd3Var.a() == null) {
            return false;
        } else {
            return a().equals(jd3Var.a());
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d88968c", new Object[]{this, new Boolean(z)});
        } else {
            this.f21929a = z;
        }
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return 1 ^ (this.f21929a ? 1 : 0);
    }
}
