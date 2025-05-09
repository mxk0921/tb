package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TaoApplication;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wym {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f31015a;

    static {
        t2o.a(619708505);
    }

    public static boolean a(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bb9b9", new Object[]{context})).booleanValue();
        }
        if (f31015a == null) {
            String processName = TaoApplication.getProcessName(context);
            if (context != null && TextUtils.equals(processName, context.getPackageName())) {
                z = true;
            }
            f31015a = Boolean.valueOf(z);
        }
        return f31015a.booleanValue();
    }
}
