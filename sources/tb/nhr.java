package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class nhr extends u1<cic> implements cic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438765);
        t2o.a(1002438835);
    }

    public nhr() {
        this(null, 1, null);
    }

    public static /* synthetic */ Object ipc$super(nhr nhrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceimp/TBKVStorage");
    }

    @Override // tb.zrb
    public ewe B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewe) ipChange.ipc$dispatch("cc717fdf", new Object[]{this});
        }
        return ewe.Companion.i();
    }

    public String V(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2df0e14f", new Object[]{this, str, str2});
        }
        ckf.g(str, "bizId");
        ckf.g(str2, "key");
        return i1g.INSTANCE.c(str, str2);
    }

    public void W(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26f5907", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, "bizId");
        ckf.g(str2, "key");
        ckf.g(str3, "value");
        i1g.INSTANCE.e(str, str2, str3);
    }

    @Override // tb.cic
    public String get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6158a19", new Object[]{this, str});
        }
        ckf.g(str, "key");
        return V(dic.a(this), str);
    }

    @Override // tb.cic
    public void set(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("306d747d", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "key");
        ckf.g(str2, "value");
        W(dic.a(this), str, str2);
    }

    public nhr(asb asbVar) {
        super(asbVar);
    }

    public /* synthetic */ nhr(asb asbVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : asbVar);
    }
}
