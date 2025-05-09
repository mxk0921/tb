package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class sbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static synchronized String a(Context context) {
        synchronized (sbn.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("39afcbea", new Object[]{context});
            } else if (context == null) {
                RSoLog.d("RSoTriverAdapter, obtainTriverJsiLibDir, return lib dir, context == null");
                return null;
            } else if (context.getApplicationContext() == null) {
                RSoLog.d("RSoTriverAdapter, obtainTriverJsiLibDir, return lib dir, app == null");
                return null;
            } else {
                File c = goq.c(context, "swallows_triver");
                b79 c2 = bzn.b().c("mnn_jsi");
                b79 c3 = bzn.b().c("fcanvas_v8_jsi");
                String d = c2.d();
                String d2 = c3.d();
                if (!c2.i() || !c3.i() || !trq.e(d) || !trq.e(d2)) {
                    RSoLog.d("RSoTriverAdapter, obtainTriverJsiLibDir failed, return null");
                    return null;
                }
                goq.a(new File(d), c);
                goq.a(new File(d2), c);
                String path = c.getPath();
                RSoLog.d("RSoTriverAdapter, obtainTriverJsiLibDir, path = " + path);
                return path;
            }
        }
    }
}
