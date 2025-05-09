package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.g;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f27482a = new AtomicBoolean(false);
    public static a b;
    public static Application c;
    public static HashMap d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        ywb init(Application application, HashMap hashMap);
    }

    static {
        t2o.a(444597734);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        a aVar = b;
        if (aVar != null && f27482a.compareAndSet(false, true)) {
            g.t(aVar.init(c, d));
            b = null;
            c = null;
            d = null;
        }
    }

    public static void b(a aVar, Application application, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9faa3ef", new Object[]{aVar, application, hashMap});
            return;
        }
        b = aVar;
        c = application;
        d = hashMap;
    }
}
