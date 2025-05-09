package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class iyf implements UncaughtCrashHeader, JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f21646a = new HashMap();

    @Override // com.taobao.android.tcrash.UncaughtCrashHeader
    public void addHeaderInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc462277", new Object[]{this, str, str2});
            return;
        }
        synchronized (this.f21646a) {
            try {
                if (str2 == null) {
                    ((HashMap) this.f21646a).remove(str);
                } else {
                    ((HashMap) this.f21646a).put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        synchronized (this.f21646a) {
            hashMap = new HashMap(this.f21646a);
        }
        return hashMap;
    }
}
