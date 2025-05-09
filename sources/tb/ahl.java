package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.xue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ahl extends tv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ahl(fdc fdcVar, String str) {
        super(fdcVar, str);
    }

    public static /* synthetic */ Object ipc$super(ahl ahlVar, String str, Object... objArr) {
        if (str.hashCode() == -1717520895) {
            super.syncGreyStatus(((Boolean) objArr[0]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/homepage/recommend/OverseaRecommendInfoFlowController");
    }

    @Override // tb.tv1
    public xue b(fdc fdcVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xue) ipChange.ipc$dispatch("dd4e6eed", new Object[]{this, fdcVar, str});
        }
        czt cztVar = new czt();
        return new xue.b(cztVar).d(new dzt(str, cztVar, new lza(this, fdcVar))).c();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void syncGreyStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a0b601", new Object[]{this, new Boolean(z)});
            return;
        }
        super.syncGreyStatus(z);
        uyt.b(z);
    }
}
