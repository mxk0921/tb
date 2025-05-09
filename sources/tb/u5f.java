package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.orange.OConstant;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u5f extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public u5f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(u5f u5fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitShopRuleOpt");
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
        } else {
            gqp.b(application, (String) hhg.a(OConstant.LAUNCH_ONLINEAPPKEY, null), LauncherRuntime.d, ((Integer) hhg.a(OConstant.LAUNCH_ENVINDEX, 0)).intValue());
        }
    }
}
