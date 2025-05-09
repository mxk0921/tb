package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class n6 extends u0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public n6() {
        super(i2p.TYPE_ACTIVATE);
    }

    public static /* synthetic */ Object ipc$super(n6 n6Var, String str, Object... objArr) {
        if (str.hashCode() == 1569381830) {
            super.accept((Throwable) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/ai/AISearchWidget$requestCloudData$3");
    }

    @Override // tb.u0p
    /* renamed from: a */
    public void accept(Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8addc6", new Object[]{this, th});
            return;
        }
        ckf.g(th, "t");
        super.accept(th);
        TLogTracker.i("Default", "-1", th.getMessage());
        AppMonitor.Alarm.commitFail("Page_SearchItemList", "SearchDoorMain", "30001", th.getMessage());
    }
}
