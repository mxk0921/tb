package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.ITracingAdapter;
import com.taobao.weex.utils.WXLogUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xvw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f31632a = new AtomicInteger(0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f31633a = xvw.d();
        public Map<String, Object> b;
        public boolean c;

        static {
            t2o.a(985661645);
        }

        public a() {
            System.currentTimeMillis();
            xvw.a();
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8423f89f", new Object[]{this});
            } else if (!this.c) {
                this.c = true;
                xvw.e(this);
            } else {
                WXLogUtils.w("WXTracing", "Event " + this.f31633a + " has been submitted.");
            }
        }
    }

    static {
        t2o.a(985661644);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("351465ab", new Object[0]);
        }
        String name = Thread.currentThread().getName();
        if ("WeexJSBridgeThread".equals(name)) {
            return "JSThread";
        }
        if ("WeeXDomThread".equals(name)) {
            return "DOMThread";
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return "UIThread";
        }
        return name;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[0])).booleanValue();
        }
        return WXEnvironment.isApkDebugable();
    }

    public static a c(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("8e4a1117", new Object[]{str, str2, new Integer(i)});
        }
        a aVar = new a();
        aVar.f31633a = d();
        return aVar;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a296c0e8", new Object[0])).intValue();
        }
        return f31632a.getAndIncrement();
    }

    public static synchronized void e(a aVar) {
        synchronized (xvw.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8054fce", new Object[]{aVar});
                return;
            }
            ITracingAdapter tracingAdapter = WXSDKManager.getInstance().getTracingAdapter();
            if (tracingAdapter != null) {
                tracingAdapter.submitTracingEvent(aVar);
            }
        }
    }
}
