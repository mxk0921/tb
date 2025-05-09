package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.session.SessionManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x0s extends b1n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Application b;

    public x0s(Application application) {
        this.b = application;
    }

    public static /* synthetic */ Object ipc$super(x0s x0sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tcrash/config/TCrashEnv");
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f470be2", new Object[]{this});
        }
        String d = d("APP_VERSION", "");
        if (TextUtils.isEmpty(d)) {
            return njo.d(this.b);
        }
        return d;
    }

    public Application g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("a9ff4c85", new Object[]{this});
        }
        return this.b;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e486559f", new Object[]{this});
        }
        String d = d(SessionManager.CURRENT_PROCESS, "");
        if (TextUtils.isEmpty(d)) {
            return njo.j(this.b);
        }
        return d;
    }
}
