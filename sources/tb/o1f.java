package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class o1f extends bxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public o1f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(o1f o1fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitLivePopup");
    }

    @Override // tb.mss
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd9904d3", new Object[]{this})).booleanValue();
        }
        return t.a(LauncherRuntime.h, "ngLiveAsync");
    }

    @Override // tb.bxk, tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
        } else {
            w6f.a(application, hashMap);
        }
    }
}
