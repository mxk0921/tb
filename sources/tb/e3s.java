package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class e3s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092455);
    }

    public static String a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6272d35e", new Object[]{str, str2, str3, str4});
        }
        try {
            Variation variation = UTABTest.activate(str, str2).getVariation(str3);
            if (variation != null) {
                return variation.getValueAsString(str4);
            }
        } catch (Exception unused) {
        }
        return str4;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ceb9e065", new Object[0])).booleanValue();
        }
        if (arq.c(OrangeConfig.getInstance().getConfig("tblive", "enableWhenNullClearImg", "true"))) {
            return arq.c(a("taolive", "channelHomeLoadImgImprove", "value", "true"));
        }
        return false;
    }
}
