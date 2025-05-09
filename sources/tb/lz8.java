package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class lz8 extends bck implements kz8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(lz8 lz8Var, String str, Object... objArr) {
        if (str.hashCode() == 2047587167) {
            return super.a();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/analysis/v3/FalcoScopeManagerImpl");
    }

    /* renamed from: c */
    public iz8 b(paq paqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iz8) ipChange.ipc$dispatch("e94a18c6", new Object[]{this, paqVar});
        }
        return new jz8(this, paqVar);
    }

    @Override // tb.bck, tb.xuo
    public oz8 a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oz8) ipChange.ipc$dispatch("53741599", new Object[]{this}) : (oz8) super.a();
    }
}
