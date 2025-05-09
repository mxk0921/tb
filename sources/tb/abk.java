package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class abk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FROM_FULL = "full";
    public static final String FROM_SMALL = "small";
    public static final int STRATEGY_DIRECT = 0;
    public static final int STRATEGY_MUISE = 6;
    public static final int STRATEGY_WEEX = 3;

    static {
        t2o.a(815792809);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df1b973f", new Object[]{str})).intValue();
        }
        String h = f6p.h(str, "wh_weex");
        String h2 = f6p.h(str, uyv.WX_TPL);
        String h3 = f6p.h(str, "_mus_tpl");
        String h4 = f6p.h(str, "wh_muise");
        if ("true".equals(h) || !TextUtils.isEmpty(h2)) {
            return 3;
        }
        return (!TextUtils.isEmpty(h3) || !TextUtils.isEmpty(h4)) ? 6 : 0;
    }
}
