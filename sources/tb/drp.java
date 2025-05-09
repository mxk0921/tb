package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.TBImageUrlStrategy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class drp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(764412006);
    }

    public static String a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8871e579", new Object[]{str, new Integer(i)});
        }
        return TBImageUrlStrategy.getInstance().decideLowNetUrl(str, i, TBImageUrlStrategy.Area.shop, TBImageUrlStrategy.CutType.non);
    }
}
