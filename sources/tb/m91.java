package tb;

import android.app.Application;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class m91 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Application f23859a;

    static {
        try {
            f23859a = (Application) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        return f23859a;
    }
}
