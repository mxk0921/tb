package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.phenix.compat.PhenixInitializer;
import com.taobao.phenix.compat.PhenixWebpDelayInitializer;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m3f extends bxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean f;

    public m3f(String str) {
        super(str);
        e(true);
    }

    public static /* synthetic */ Object ipc$super(m3f m3fVar, String str, Object... objArr) {
        if (str.hashCode() == -1890718817) {
            return new Boolean(super.d((en8) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitPhenix");
    }

    @Override // tb.bxk, tb.vct
    public boolean d(en8<String, Void> en8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4deb9f", new Object[]{this, en8Var})).booleanValue();
        }
        boolean d = super.d(en8Var);
        if (d) {
            if (BootstrapMode.o()) {
                f = true;
                return false;
            } else if (vrg.b(LauncherRuntime.g)) {
                return false;
            }
        }
        return d;
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
        HashMap<String, Object> hashMap2 = new HashMap<>(2);
        Boolean bool = Boolean.TRUE;
        hashMap2.put("isNextLaunch", bool);
        hashMap2.put("ngLaunch", bool);
        new PhenixInitializer().init(application, hashMap2);
        if (t.a(application, "phenix_decoder_merge")) {
            PhenixInitializer.initApng(application);
            PhenixInitializer.initHeif(application);
            PhenixWebpDelayInitializer.init(application, hashMap);
        }
        f = true;
    }
}
