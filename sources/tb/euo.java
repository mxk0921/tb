package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class euo extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                euo.q(euo.this);
            }
        }
    }

    public euo(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(euo euoVar, String str, Object... objArr) {
        if (str.hashCode() == 1751478273) {
            return super.b();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/task/ScheduledTask");
    }

    public static /* synthetic */ Void q(euo euoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("8a74ef36", new Object[]{euoVar});
        }
        return super.b();
    }

    @Override // tb.mss
    /* renamed from: m */
    public Void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("68657001", new Object[]{this});
        }
        if (!ABGlobal.isFeatureOpened(LauncherRuntime.g, "elastic_schedule_unified")) {
            return super.b();
        }
        ((qa8) pa8.c().b()).m("launch_idle", c(), new a());
        return null;
    }

    @Override // tb.mss
    public abstract /* synthetic */ void p(Application application, HashMap hashMap);
}
