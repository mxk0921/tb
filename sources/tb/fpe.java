package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fpe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FILTERED_SUFFIX = "END_IMAGE_URL";

    static {
        t2o.a(912262979);
    }

    public static String a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a37c4fe1", new Object[]{context, str, new Integer(i)});
        }
        return egr.d().c(str, new koe(i, i));
    }
}
