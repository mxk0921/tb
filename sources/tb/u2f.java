package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u2f extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public u2f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(u2f u2fVar, String str, Object... objArr) {
        if (str.hashCode() == -1890718817) {
            return new Boolean(super.d((en8) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitNewDetail");
    }

    public static boolean q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b574c571", new Object[]{str})).booleanValue();
        }
        if (!BootstrapMode.d(524288) || !TextUtils.equals(str, BootstrapMode.c(BootstrapMode.EXTRA_KEY_FAST_ENTER_BIZ))) {
            return false;
        }
        return true;
    }

    @Override // tb.vct
    public boolean d(en8<String, Void> en8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4deb9f", new Object[]{this, en8Var})).booleanValue();
        }
        boolean d = super.d(en8Var);
        if (d) {
            return !q("TMS");
        }
        return d;
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        ebr.a(application, hashMap);
        rxj.a(application, hashMap);
    }
}
