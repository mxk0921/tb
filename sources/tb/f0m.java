package tb;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.AttributionReporter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class f0m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f0m INSTANCE = new f0m();

    static {
        t2o.a(140509195);
    }

    public final boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a6dca8d", new Object[]{this, context, str})).booleanValue();
        }
        ckf.g(context, "context");
        ckf.g(str, AttributionReporter.SYSTEM_PERMISSION);
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }
}
