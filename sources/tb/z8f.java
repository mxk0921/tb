package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class z8f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f32601a = true;

    public static dgd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dgd) ipChange.ipc$dispatch("55baadb2", new Object[0]);
        }
        try {
            if (f32601a) {
                RSoLog.d("RSo init logger tracker, start");
                u9t.b();
                f32601a = false;
            }
            RSoLog.d("RSo init() , --- start ");
            w35.a("rso-init");
            van vanVar = new van(u9t.a(qts.b()));
            vanVar.i();
            RSoLog.d("RSo init() , finish with success");
            return vanVar;
        } catch (Throwable th) {
            try {
                rbn.g("RSo init() , failed", th);
                w35.c();
                RSoLog.d("RSo init() , finally ");
                return null;
            } finally {
                w35.c();
                RSoLog.d("RSo init() , finally ");
            }
        }
    }
}
