package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ayr extends u1<yhc> implements yhc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438780);
        t2o.a(1002438829);
    }

    public ayr() {
        this(null, 1, null);
    }

    public static /* synthetic */ Object ipc$super(ayr ayrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceimp/TBURLEncodeService");
    }

    @Override // tb.zrb
    public ewe B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewe) ipChange.ipc$dispatch("cc717fdf", new Object[]{this});
        }
        return ewe.Companion.s();
    }

    @Override // tb.yhc
    public String encode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f52dc359", new Object[]{this, str});
        }
        ckf.g(str, "input");
        return kyu.b(jyu.Companion, str);
    }

    @Override // tb.yhc
    public String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("803d4c81", new Object[]{this, str});
        }
        ckf.g(str, "input");
        return kyu.a(jyu.Companion, str);
    }

    public ayr(asb asbVar) {
        super(asbVar);
    }

    public /* synthetic */ ayr(asb asbVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : asbVar);
    }
}
