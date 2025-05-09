package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bg4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <T> T a(cgd cgdVar, String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("5f84520e", new Object[]{cgdVar, str, cls});
        }
        try {
            String b = b(cgdVar, str);
            if (!trq.e(b)) {
                return null;
            }
            RSoLog.a("config helper -> readFromCustomIndex = " + b);
            return (T) JSON.parseObject(b, cls);
        } catch (Throwable th) {
            rbn.g("index->readData", th);
            return null;
        }
    }

    public static String b(cgd cgdVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4abf6844", new Object[]{cgdVar, str});
        }
        if (!cgdVar.a("switch_remote_index_enabled3", true)) {
            RSoLog.d("config -> readCustomContent, enabled = false");
            return null;
        }
        String f = cgdVar.f(null);
        if (trq.e(f)) {
            try {
                return JSON.parseObject(f).getString(str);
            } catch (Throwable th) {
                rbn.g("index->readData", th);
            }
        }
        return null;
    }
}
