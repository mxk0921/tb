package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class en1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729810263);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4684be0f", new Object[0]);
        }
        return BUFS.getFeature(new BUFS.QueryArgs(), "home.request.cardBehavior", "PageHome", "Page_Home");
    }
}
