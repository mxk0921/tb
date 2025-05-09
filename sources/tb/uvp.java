package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.globalmodel.TBShareContent;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class uvp implements jpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(664797270);
        t2o.a(664797264);
    }

    @Override // tb.jpd
    public boolean a(ArrayList<String> arrayList, TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfa241d0", new Object[]{this, arrayList, tBShareContent, str})).booleanValue();
        }
        if ("true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "isShowReturn", String.valueOf(true))) && bwr.h().i()) {
            fwr.c(jpd.TAG, "return: isShowReturn true");
            return true;
        } else if (!"true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "isBusyReturn", String.valueOf(true))) || !bwr.h().q()) {
            return false;
        } else {
            fwr.c(jpd.TAG, "return: isInGetShareActivityInfo true");
            return true;
        }
    }
}
