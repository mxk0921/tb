package tb;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.tcrash.AnrUncaughtListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h7n extends mss implements AnrUncaughtListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private u7l e = null;
    private int f = 0;
    private int g = 0;
    private final long h = SystemClock.uptimeMillis();
    private final long i = System.currentTimeMillis();

    public h7n(String str) {
        super(str);
        i(true);
        s();
    }

    public static /* synthetic */ Object ipc$super(h7n h7nVar, String str, Object... objArr) {
        if (str.hashCode() == -1890718817) {
            return new Boolean(super.d((en8) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/bootstrap/tao/ability/msg/QoScheduleTask");
    }

    public static mss q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mss) ipChange.ipc$dispatch("6d3f1ebb", new Object[]{str});
        }
        return new h7n(str);
    }

    private u7l r(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u7l) ipChange.ipc$dispatch("cc59c9c3", new Object[]{this, context});
        }
        boolean a2 = t.a(context, "arrangerMsgDumpEnable");
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        return new u7l(a2, true, true, z, true);
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1acf766a", new Object[]{this});
            return;
        }
        UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
        crashCaughtHeader.addHeaderInfo(c() + "Uptime", String.valueOf(this.h));
        UncaughtCrashHeader crashCaughtHeader2 = TCrashSDK.instance().getCrashCaughtHeader();
        crashCaughtHeader2.addHeaderInfo(c() + "UptimeStamp", String.valueOf(this.i));
        TCrashSDK.instance().addAnrUncaughtListener(this);
    }

    @Override // tb.vct
    public boolean d(en8<String, Void> en8Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4deb9f", new Object[]{this, en8Var})).booleanValue();
        }
        boolean d = super.d(en8Var);
        if (!d) {
            return d;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            z = false;
        }
        return z;
    }

    @Override // tb.mss
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c246ea2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.tcrash.AnrUncaughtListener
    public Map<String, Object> onAnrUncaught() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5dc54bb7", new Object[]{this});
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        i7n.g(Looper.getMainLooper(), c(), "ANR-LOOPER-CURRENT: ");
        HashMap hashMap = new HashMap();
        hashMap.put(c() + "TotalSensitiveCount", Integer.valueOf(this.f));
        hashMap.put(c() + "TotalArrangeCount", Integer.valueOf(this.g));
        hashMap.put(c() + "Duration", String.valueOf(uptimeMillis - this.h));
        return hashMap;
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        if (this.e == null) {
            this.e = r(application);
            whh.a(c(), "option: " + this.e);
            if (this.e.e) {
                BootstrapMode.i(8192);
            }
            TCrashSDK.instance().getCrashCaughtHeader().addHeaderInfo(c() + "Option", this.e.toString());
        }
        ce7 o = i7n.o(this.e);
        if (o != null) {
            this.g++;
            this.f += o.b;
        }
    }
}
