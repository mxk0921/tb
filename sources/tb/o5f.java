package tb;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class o5f extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public o5f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(o5f o5fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitSecurityManager");
    }

    @Override // tb.mss
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c246ea2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        try {
            SecurityGuardManager.getInstance(application);
        } catch (SecException unused) {
        }
    }

    @Override // tb.mss
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd9904d3", new Object[]{this})).booleanValue();
        }
        if (!TextUtils.equals(LauncherRuntime.b, LauncherRuntime.c)) {
            return true;
        }
        fxp j = fxp.j();
        if (j == null || j.f19614a) {
            return false;
        }
        return t.a(LauncherRuntime.h, "ngSecurityAsync");
    }
}
