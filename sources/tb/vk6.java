package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vk6 implements JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("dxTplName", rh5.f27380a);
        hashMap.put("dxTplV", Long.valueOf(rh5.b));
        hashMap.put("dxBiz", rh5.c);
        hashMap.put("dxThreadName", rh5.d);
        hashMap.put("dxPipeName", rh5.e);
        Map<String, String> s = s26.s();
        if (s != null) {
            hashMap.putAll(s);
        }
        return hashMap;
    }
}
