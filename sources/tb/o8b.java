package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.UtilityImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class o8b extends pfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933236);
    }

    public static /* synthetic */ Object ipc$super(o8b o8bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/utl/HuaWeiRomCollecter");
    }

    @Override // tb.pfo
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50bb0c0f", new Object[]{this});
        }
        return UtilityImpl.getEmuiVersion();
    }
}
