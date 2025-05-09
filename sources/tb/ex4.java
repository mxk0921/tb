package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ex4 implements JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750601);
    }

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        String o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        HashMap hashMap = new HashMap();
        try {
            o = gwv.o();
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(o)) {
            return hashMap;
        }
        hashMap.put("bhx", o);
        return hashMap;
    }
}
