package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.weex.LauncherInitWeex2;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f8f extends bxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public f8f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(f8f f8fVar, String str, Object... objArr) {
        if (str.hashCode() == -1890718817) {
            return new Boolean(super.d((en8) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitWeex2BootFinish");
    }

    @Override // tb.bxk, tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
        } else {
            LauncherInitWeex2.init(application, hashMap);
        }
    }

    @Override // tb.bxk, tb.vct
    public boolean d(en8<String, Void> en8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4deb9f", new Object[]{this, en8Var})).booleanValue();
        }
        boolean d = super.d(en8Var);
        return d ? !t.a(LauncherRuntime.g, "weexOpt_weex2_delay") : d;
    }
}
