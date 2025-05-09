package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class drm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1032847437);
    }

    public static void a(drs drsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b2803e", new Object[]{drsVar});
        } else if (!"false".equals(OrangeConfig.getInstance().getConfig("edlp_business_switch", "enableWebHtmlPrefetch", "true")) && drsVar != null && "web".equals(drsVar.b) && !TextUtils.isEmpty(drsVar.f18031a)) {
            muj.a(drsVar.f18031a);
        }
    }
}
