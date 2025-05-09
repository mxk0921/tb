package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.middleware.compat.MtopInitializer;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j2f extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public j2f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(j2f j2fVar, String str, Object... objArr) {
        if (str.hashCode() == -1890718817) {
            return new Boolean(super.d((en8) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitMtopMultiLang");
    }

    @Override // tb.vct
    public boolean d(en8<String, Void> en8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4deb9f", new Object[]{this, en8Var})).booleanValue();
        }
        if (!super.d(en8Var)) {
            return false;
        }
        int b = BootstrapMode.b();
        if (!BootstrapMode.e(b, 1024) || !BootstrapMode.e(b, 2048)) {
            return false;
        }
        return true;
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        MtopInitializer.init(application, hashMap);
        x7j.a();
    }
}
