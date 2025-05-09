package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class m1n implements zdd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f23722a;

    public m1n(String str) {
        if (str != null) {
            this.f23722a = str;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // tb.zdd
    public zdd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zdd) ipChange.ipc$dispatch("4625fce1", new Object[]{this});
        }
        return new m1n(b());
    }

    @Override // tb.zdd
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b423e688", new Object[]{this});
        }
        return this.f23722a;
    }

    @Override // tb.zdd
    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a27c518", new Object[]{this, str})).booleanValue();
        }
        for (String str2 : str.replaceAll(" ", "").split(",")) {
            if (this.f23722a.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || m1n.class != obj.getClass()) {
            return false;
        }
        return this.f23722a.equals(((m1n) obj).f23722a);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.f23722a.hashCode();
    }

    @Override // tb.zdd
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return b();
    }
}
