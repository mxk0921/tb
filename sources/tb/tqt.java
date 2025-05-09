package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tqt implements JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(970981416);
    }

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        if (!(th instanceof OutOfMemoryError)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("virtual_thread_info", etq.b());
        return hashMap;
    }
}
