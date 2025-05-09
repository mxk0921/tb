package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hye extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public hye(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(hye hyeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitColdLogin");
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        bjh bjhVar = LauncherRuntime.sLoginState;
        if (!bjhVar.b && bjhVar.f16426a) {
            bjhVar.b = true;
            LauncherRuntime.i.f();
        }
    }
}
