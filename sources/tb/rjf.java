package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rjf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(835715216);
    }

    public static String a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88a0c8f7", new Object[]{context, new Integer(i)});
        }
        if (context != null) {
            return context.getString(i);
        }
        return b(i);
    }

    public static String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a43567e", new Object[]{new Integer(i)});
        }
        return ((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext().getString(i);
    }
}
