package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.adapter.BXBRBridge;
import com.taobao.android.behavix.feature.IPVBaseFeature;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.testutils.JsBridgeBehaviXConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oo2 extends m02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean b = false;

    static {
        t2o.a(404750453);
    }

    private oo2(String str) {
        super(str);
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc73a1", new Object[]{str});
        } else if (!b || !v82.h("bxInitOnce", true)) {
            b = true;
            cet.d().f(new oo2(str));
        }
    }

    public static /* synthetic */ Object ipc$super(oo2 oo2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/BxDelayInitTask");
    }

    @Override // tb.m02
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4134b145", new Object[]{this});
            return;
        }
        gg4.l().n();
        BXBRBridge.c();
        JsBridgeBehaviXConfig.initPersistScriptConfig();
        IPVBaseFeature.i();
        if (v82.h("enableCrashReport", true)) {
            TCrashSDK.instance().addJvmUncaughtCrashListener(new ex4());
        }
    }
}
