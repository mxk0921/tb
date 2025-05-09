package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class i6r extends u1<mhc> implements mhc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438754);
        t2o.a(1002438790);
    }

    public i6r(asb asbVar) {
        super(asbVar);
    }

    public static /* synthetic */ Object ipc$super(i6r i6rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceimp/TBAppEnvService");
    }

    @Override // tb.zrb
    public ewe B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewe) ipChange.ipc$dispatch("cc717fdf", new Object[]{this});
        }
        return ewe.Companion.b();
    }

    @Override // tb.mhc
    public String getAppKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
        }
        String a2 = zg8.a();
        if (a2 == null) {
            return nhc.a();
        }
        return a2;
    }
}
