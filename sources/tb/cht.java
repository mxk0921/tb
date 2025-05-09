package tb;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class cht {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BROWSER_ONLY_CATEGORY = "com.taobao.intent.category.HYBRID_UI";

    static {
        t2o.a(744489002);
    }

    public static cht a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cht) ipChange.ipc$dispatch("b6e79d5d", new Object[0]);
        }
        if (LauncherRuntime.m) {
            return new qb();
        }
        return new vm1();
    }

    public boolean b(Context context, qg0 qg0Var, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72f2abcd", new Object[]{this, context, qg0Var, str, bundle})).booleanValue();
        }
        return false;
    }
}
