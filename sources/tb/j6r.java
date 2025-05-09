package tb;

import android.content.Context;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class j6r implements jgb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final j6r INSTANCE = new j6r();

    @Override // tb.jgb
    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79643682", new Object[]{this, context})).booleanValue();
        }
        return var.c(context);
    }

    @Override // tb.jgb
    public int getAppEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2e02d7c", new Object[]{this})).intValue();
        }
        int a2 = EnvironmentSwitcher.a();
        if (a2 == EnvironmentSwitcher.EnvType.OnLINE.getValue()) {
            return 0;
        }
        if (a2 == EnvironmentSwitcher.EnvType.PRE.getValue()) {
            return 1;
        }
        return 2;
    }

    @Override // tb.jgb
    public String getTTID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e0d7a8", new Object[]{this});
        }
        Object a2 = hhg.a("ttid", "unknown");
        ckf.f(a2, "LauncherParam.getParam(\n…      \"unknown\"\n        )");
        return (String) a2;
    }

    @Override // tb.jgb
    public String getUTDID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22b9b56f", new Object[]{this});
        }
        Object a2 = hhg.a("deviceId", "unknown");
        ckf.f(a2, "LauncherParam.getParam(\n…      \"unknown\"\n        )");
        return (String) a2;
    }

    @Override // tb.jgb
    public boolean isForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("845d1c18", new Object[]{this})).booleanValue();
        }
        chb g = c21.g();
        if (g == null || g.getBoolean("isInBackground", false)) {
            return false;
        }
        return true;
    }
}
