package tb;

import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.monitor.Monitor;
import java.util.Map;
import kotlin.collections.a;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class gi8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final gi8 INSTANCE = new gi8();

    static {
        t2o.a(919601419);
    }

    public static /* synthetic */ void b(gi8 gi8Var, String str, Map map, Monitor.Type type, Monitor.Code code, boolean z, Throwable th, int i, Object obj) {
        boolean z2;
        Throwable th2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9a40c1", new Object[]{gi8Var, str, map, type, code, new Boolean(z), th, new Integer(i), obj});
            return;
        }
        if ((i & 16) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i & 32) != 0) {
            th2 = null;
        } else {
            th2 = th;
        }
        gi8Var.a(str, map, type, code, z2, th2);
    }

    public final void a(String str, Map<String, ? extends Object> map, Monitor.Type type, Monitor.Code code, boolean z, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5db3fe2", new Object[]{this, str, map, type, code, new Boolean(z), th});
            return;
        }
        ckf.g(str, "errorMsg");
        ckf.g(type, "monitorType");
        ckf.g(code, "monitorCode");
        Map<String, ? extends Object> k = a.k(jpu.a("errorMsg", str), jpu.a("throwableMsg", th != null ? th.getMessage() : null));
        if (map != null) {
            k.putAll(map);
        }
        tpu.a aVar = tpu.Companion;
        aVar.a("ErrorUtil", "处理错误，finalErrorArgs=" + k, th);
        Monitor.Companion.a(type, code, k);
        if (l91.Companion.c()) {
            Toast.makeText(spu.Companion.d(), str, 0).show();
            if (!z) {
                return;
            }
            if (th != null) {
                throw th;
            }
            throw new RuntimeException(JSON.toJSONString(k));
        }
    }
}
