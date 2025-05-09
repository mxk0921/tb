package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.LauncherInitWeex;
import com.taobao.weex.LauncherInitWeex2;
import com.taobao.weex.LauncherInitWeexTask;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n8f extends bxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public n8f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(n8f n8fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitWeexSmoothOpt");
    }

    @Override // tb.bxk, tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        if (!t.a(application, "weexOpt_weex1_delay")) {
            new LauncherInitWeex().init(application, hashMap);
        }
        if (!t.a(application, "weexOpt_weex2_delay")) {
            LauncherInitWeex2.init(application, hashMap);
        }
        LauncherInitWeexTask.init(application, hashMap);
    }
}
