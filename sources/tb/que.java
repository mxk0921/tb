package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.IInfoFlowDarkMode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class que {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static IInfoFlowDarkMode f26936a;

    static {
        t2o.a(486539281);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8b94ae1", new Object[]{context})).booleanValue();
        }
        IInfoFlowDarkMode iInfoFlowDarkMode = f26936a;
        if (iInfoFlowDarkMode == null) {
            fve.f("InfoFlowDarkMode", "isInDarkTheme gInfoFlowDarkMode == null");
            return false;
        }
        try {
            return iInfoFlowDarkMode.a(context);
        } catch (Throwable th) {
            fve.c("InfoFlowDarkMode", "isInDarkTheme error", th);
            return false;
        }
    }

    public static void b(IInfoFlowDarkMode iInfoFlowDarkMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63af667", new Object[]{iInfoFlowDarkMode});
        } else {
            f26936a = iInfoFlowDarkMode;
        }
    }
}
