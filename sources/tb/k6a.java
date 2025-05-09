package tb;

import android.content.Context;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k6a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Pair<j6a<String>, aft<String, Void>> a(Context context, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("a04c7cb9", new Object[]{context, str});
        }
        ehj ehjVar = new ehj();
        if ("com.taobao.taobao:channel".equals(str)) {
            obj = new ri3();
        } else if (LauncherRuntime.PROCESS_SAFEMODE.equals(str)) {
            obj = new opo();
        } else {
            obj = new lhg();
        }
        return Pair.create(ehjVar, obj);
    }
}
