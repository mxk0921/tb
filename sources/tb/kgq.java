package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.TCrashSDK;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kgq extends c12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public SharedPreferences c;
    public boolean b = false;
    public final JvmUncaughtCrashListener d = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements JvmUncaughtCrashListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
        public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
            }
            try {
                kgq.f(kgq.this, th);
                return null;
            } catch (Throwable th2) {
                tm1.b("StabilityService", "crashCaughtListener ERROR", th2);
                return null;
            }
        }
    }

    static {
        t2o.a(736100465);
    }

    public static /* synthetic */ void f(kgq kgqVar, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("817db776", new Object[]{kgqVar, th});
        } else {
            kgqVar.g(th);
        }
    }

    public static /* synthetic */ Object ipc$super(kgq kgqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/bootimage/stability/StabilityService");
    }

    @Override // tb.bsd
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15e6af6f", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final void g(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e421c8", new Object[]{this, th});
            return;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (stackTraceElement.getClassName().startsWith("com.taobao.bootimage")) {
                h();
                e();
                return;
            }
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5591b9a", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong("occupiedTime", System.currentTimeMillis());
            edit.apply();
        }
    }

    @Override // tb.bsd
    public void init() {
        SharedPreferences sharedPreferences;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.c = nh2.k();
        StringBuilder sb = new StringBuilder("StabilityService init sp ");
        if (this.c != null) {
            z = true;
        }
        sb.append(z);
        tm1.a("StabilityService", sb.toString());
        SharedPreferences sharedPreferences2 = this.c;
        long j = sharedPreferences2 != null ? sharedPreferences2.getLong("occupiedTime", 0L) : 0L;
        if (d(j)) {
            this.b = true;
            tm1.a("StabilityService", "StabilityService InCrashOccupiedState");
            return;
        }
        tm1.a("StabilityService", "正常启动");
        if (!(j == 0 || (sharedPreferences = this.c) == null)) {
            sharedPreferences.edit().putLong("occupiedTime", 0L).apply();
        }
        TCrashSDK.instance().addJvmUncaughtCrashListener(this.d);
    }
}
