package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cna {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(759169066);
    }

    public static void a(Activity activity, long j, long j2, String str, String str2, lt9 lt9Var, zt9 zt9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cf38da6", new Object[]{activity, new Long(j), new Long(j2), str, str2, lt9Var, zt9Var});
        }
    }
}
