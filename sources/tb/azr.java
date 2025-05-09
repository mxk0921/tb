package tb;

import android.app.Application;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.crash.WVUTCrashCaughtListener;
import androidx.appcompat.taobao.util.Globals;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.android.tcrash.UncaughtCrashType;
import com.taobao.taobao.R;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class azr extends WVUTCrashCaughtListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708485);
    }

    public azr() {
        Application application = Globals.getApplication();
        TCrashSDK instance = TCrashSDK.instance();
        UncaughtCrashType uncaughtCrashType = UncaughtCrashType.NATIVE_ONLY;
        instance.getCrashCaughtHeaderByType(uncaughtCrashType).addHeaderInfo("isGalileo", application.getString(R.bool.isGalileo));
        UncaughtCrashHeader crashCaughtHeaderByType = TCrashSDK.instance().getCrashCaughtHeaderByType(uncaughtCrashType);
        crashCaughtHeaderByType.addHeaderInfo("require_render_multi", "" + WVCore.getInstance().getUsedWebMulti());
        UncaughtCrashHeader crashCaughtHeaderByType2 = TCrashSDK.instance().getCrashCaughtHeaderByType(uncaughtCrashType);
        crashCaughtHeaderByType2.addHeaderInfo("require_gpu_multi", "" + WVCore.getInstance().getUsedGpuMulti());
    }

    public static /* synthetic */ Object ipc$super(azr azrVar, String str, Object... objArr) {
        if (str.hashCode() == -642401982) {
            return super.onJvmUncaughtCrash((Thread) objArr[0], (Throwable) objArr[1]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/crash/TBWVUTCrashCaughtListener");
    }

    @Override // android.taobao.windvane.extra.crash.WVUTCrashCaughtListener, com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        Map<String, Object> onJvmUncaughtCrash = super.onJvmUncaughtCrash(thread, th);
        onJvmUncaughtCrash.put("isGalileo", Globals.getApplication().getString(R.bool.isGalileo));
        onJvmUncaughtCrash.put("require_render_multi", "" + WVCore.getInstance().getUsedWebMulti());
        onJvmUncaughtCrash.put("require_gpu_multi", "" + WVCore.getInstance().getUsedGpuMulti());
        return onJvmUncaughtCrash;
    }
}
