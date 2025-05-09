package tb;

import android.view.View;
import com.alibaba.ability.env.PerfTracer;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface kdb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(144703525);
        }

        public static ldb a(kdb kdbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ldb) ipChange.ipc$dispatch("db165a08", new Object[]{kdbVar});
            }
            ldb a2 = kdbVar.a();
            if (a2 != null) {
                return a2;
            }
            zq zqVar = new zq("unknown", null, 2, null);
            kdbVar.j(zqVar);
            return zqVar;
        }

        public static View b(kdb kdbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("bbd5e383", new Object[]{kdbVar});
            }
            WeakReference<View> h = kdbVar.h();
            if (h != null) {
                return h.get();
            }
            return null;
        }

        public static <T> T c(kdb kdbVar, String str) {
            T t;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("b46989df", new Object[]{kdbVar, str});
            }
            ckf.g(str, "key");
            Map<String, Object> f = kdbVar.f();
            if (f != null) {
                t = (T) f.get(str);
            } else {
                t = null;
            }
            if (!(t instanceof Object)) {
                return null;
            }
            return t;
        }

        public static kdb d(kdb kdbVar, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kdb) ipChange.ipc$dispatch("ac95228c", new Object[]{kdbVar, view});
            }
            if (view != null) {
                kdbVar.g(new WeakReference<>(view));
            }
            return kdbVar;
        }

        public static kdb e(kdb kdbVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kdb) ipChange.ipc$dispatch("48d7d0ca", new Object[]{kdbVar, str, obj});
            }
            ckf.g(str, "key");
            ckf.g(obj, "data");
            if (kdbVar.f() == null) {
                kdbVar.e(new LinkedHashMap());
            }
            Map<String, Object> f = kdbVar.f();
            ckf.d(f);
            f.put(str, obj);
            return kdbVar;
        }
    }

    ldb a();

    void b(String str);

    void c(Object obj);

    kdb d(String str, Object obj);

    void e(Map<String, Object> map);

    Map<String, Object> f();

    void g(WeakReference<View> weakReference);

    String getPageId();

    Object getUserContext();

    WeakReference<View> h();

    PerfTracer i();

    void j(ldb ldbVar);

    View k();

    ldb l();

    <T> T m(String str);

    String n();
}
