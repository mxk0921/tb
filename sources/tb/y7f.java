package tb;

import android.app.Application;
import com.alibaba.analytics.InitUt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class y7f extends bxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public y7f(String str) {
        super(str);
        i(true);
    }

    public static /* synthetic */ Object ipc$super(y7f y7fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitUt");
    }

    @Override // tb.bxk, tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        new InitUt().init(application, hashMap);
        if (LauncherRuntime.l) {
            bti.a("com.alibaba.analytics.InitUtDebug", application, hashMap);
        }
        zxm.b(application, hashMap);
    }
}
