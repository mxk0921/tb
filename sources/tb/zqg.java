package tb;

import android.app.Instrumentation;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zqg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static xqg a(b8l b8lVar, sgg sggVar, Instrumentation instrumentation, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xqg) ipChange.ipc$dispatch("31fa95c5", new Object[]{b8lVar, sggVar, instrumentation, context});
        }
        if (context != null && r68.d(context)) {
            return new s68(sggVar, instrumentation, context);
        }
        if (b8lVar == null || TextUtils.equals(b8lVar.f16248a, b8lVar.b)) {
            return new arg(sggVar, instrumentation);
        }
        return new yqg(instrumentation);
    }
}
