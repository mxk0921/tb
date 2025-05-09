package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yfq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile yfq c;
    public static final boolean d;
    public static Context e;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f32055a = new HashMap();
    public final AtomicBoolean b = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
            Objects.toString(configs);
            yfq.a(yfq.this, configs);
            fgq.a(yfq.b()).c("mtop_ssr_adapter", configs);
        }
    }

    static {
        try {
            IpChange ipChange = OrangeConfig.$ipChange;
            d = true;
        } catch (Exception unused) {
            d = false;
        }
    }

    public static /* synthetic */ Map a(yfq yfqVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4ca7cdbe", new Object[]{yfqVar, map});
        }
        yfqVar.f32055a = map;
        return map;
    }

    public static /* synthetic */ Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d459f9b0", new Object[0]);
        }
        return e;
    }

    public static yfq d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yfq) ipChange.ipc$dispatch("adbff1f9", new Object[0]);
        }
        if (c == null) {
            synchronized (yfq.class) {
                try {
                    if (c == null) {
                        c = new yfq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static Context e() {
        Context context = e;
        if (context != null) {
            return context;
        }
        synchronized (yfq.class) {
            Context context2 = e;
            if (context2 != null) {
                return context2;
            }
            try {
                Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(cls, new Object[0]);
                e = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return e;
        }
    }

    public String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{this, str, str2});
        }
        if (!d) {
            return "";
        }
        Map<String, String> map = this.f32055a;
        if (map == null || map.size() == 0) {
            this.f32055a = fgq.a(e).b("mtop_ssr_adapter");
        }
        Map<String, String> map2 = this.f32055a;
        if (map2 == null || map2.size() == 0) {
            return str2;
        }
        String str3 = this.f32055a.get(str);
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    public void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("325ad683", new Object[]{this, context});
        } else if (this.b.compareAndSet(false, true)) {
            e = context;
            if (context == null) {
                e = e();
            }
            if (d && e != null) {
                OrangeConfig.getInstance().registerListener(new String[]{"mtop_ssr_adapter"}, new a(), false);
                OrangeConfig.getInstance().getConfigs("mtop_ssr_adapter");
            }
        }
    }
}
