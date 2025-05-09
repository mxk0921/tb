package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.uqi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class uvq extends tqi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356173);
    }

    public uvq(String str, int i, String str2, String str3, boolean z, String str4, String str5, uqi.c cVar, bwd bwdVar) {
        super(str, i, str2, str3, z, str4, str5, cVar, bwdVar);
    }

    public static /* synthetic */ Object ipc$super(uvq uvqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/model/SubscribeMessageServiceTask");
    }

    @Override // tb.tqi
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dee103cb", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.tqi
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SubscribeMessageServiceTask{topic='" + this.f28884a + "', mBizCode=" + this.b + ", mChannel='" + this.c + "', nick='" + this.d + "', isFandom=" + this.e + ", ext='" + this.f + "'}";
    }
}
