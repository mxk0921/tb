package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.copy.ClipUrlWatcherControl;
import com.taobao.share.globalmodel.TBShareContent;
import com.ut.share.ShareApi;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class to4 extends spd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(664797263);
    }

    public static /* synthetic */ Object ipc$super(to4 to4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/core/share/interceptor/ContentDealProcessor");
    }

    @Override // tb.spd
    public void b(ArrayList<String> arrayList, TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30454f87", new Object[]{this, arrayList, tBShareContent, str});
            return;
        }
        kkp e = kkp.e();
        e.a(kkp.KEY_SHAREPANELCONTENTDEALPROCESSORSTART);
        bwr.h().r(ClipUrlWatcherControl.z().s(), tBShareContent);
        ShareApi.getInstance().registerShortenAdapter(new iwr());
        e.a(kkp.KEY_SHAREPANELCONTENTDEALPROCESSOREND);
    }
}
