package tb;

import android.app.Application;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OConstant;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class txe extends bxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public txe(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(txe txeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitBehaviX");
    }

    @Override // tb.mss
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c246ea2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.bxk, tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        HashMap hashMap2 = new HashMap(6);
        hashMap2.put("usingNGNextLaunch", Boolean.valueOf(ii2.a(64)));
        hashMap2.put("isDebuggable", Boolean.valueOf(cw6.b()));
        hashMap2.put("process", LauncherRuntime.c);
        hashMap2.put("packageName", LauncherRuntime.b);
        hashMap2.put("ttid", LauncherRuntime.d);
        hashMap2.put("userId", ry3.d(application, Login.getUserId()));
        hashMap2.put("appVersion", LauncherRuntime.e);
        hashMap2.put(OConstant.LAUNCH_ENVINDEX, Integer.valueOf(EnvironmentSwitcher.a()));
        f82.h(application, hashMap2);
    }
}
