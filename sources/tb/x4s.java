package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.AnrUncaughtListener;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x4s implements JvmUncaughtCrashListener, AnrUncaughtListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public final String a(Throwable th) {
        StackTraceElement[] stackTrace;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7cefb0d", new Object[]{this, th});
        }
        if (th == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(th.getMessage());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\tat " + stackTraceElement);
        }
        return sb.toString();
    }

    @Override // com.taobao.android.tcrash.AnrUncaughtListener
    public Map<String, Object> onAnrUncaught() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5dc54bb7", new Object[]{this});
        }
        m4s.b("CatcherManager", "anr");
        return null;
    }

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        m4s.b("CatcherManager", thread.getName(), a(th));
        String a2 = a(dhh.f17824a);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        m4s.b("CatcherManager", "breakPadLastError", a2);
        HashMap hashMap = new HashMap();
        hashMap.put("breakPadLastError", a2);
        return hashMap;
    }
}
