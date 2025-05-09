package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zg0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements fpk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f32739a;

        public a(Context context) {
            this.f32739a = context;
        }

        @Override // tb.fpk
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2247aab2", new Object[]{this});
            } else if (TextUtils.equals("HOT", pg0.i().k("COLD"))) {
                vp9.a("linkx", "AfcTkManager === registerTkFlag === 热启动切到前台，发起广告SDK的相关逻辑");
                zg0.a(this.f32739a);
            }
        }

        @Override // tb.fpk
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3cbde6f6", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f32740a;

        public b(Context context) {
            this.f32740a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                zg0.h(this.f32740a);
            }
        }
    }

    static {
        t2o.a(467664965);
    }

    public static /* synthetic */ void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context});
        } else {
            b(context);
        }
    }

    public static int d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ad8aa78", new Object[]{new Integer(i)})).intValue();
        }
        if (i <= 0) {
            return 0;
        }
        return new Random().nextInt(i);
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("456d07b", new Object[]{context})).booleanValue();
        }
        if (c(context) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.StringBuilder] */
    public static Map<String, String> f(Context context) {
        Exception e;
        Map hashMap = new HashMap();
        try {
            Class<?> c = c(context);
            if (c == null) {
                return hashMap;
            }
            Map map = (Map) c.getMethod("getCrossTaokeEConfig", new Class[0]).invoke(c.getMethod("instance", new Class[0]).invoke(null, new Object[0]), new Object[0]);
            try {
                vp9.a("linkx", "AfcTkManager === isNeedTkRequest === 获取到的数据:" + map);
                return map;
            } catch (Exception e2) {
                e = e2;
                hashMap = map;
                vp9.b("linkx", "AfcTkManager === isNeedTkRequest === 异常：" + e);
                return hashMap;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3217fdb", new Object[]{context});
            return;
        }
        vp9.a("linkx", "AfcTkManager === registerTkFlag === 开始注册广告相关逻辑");
        if (!e(context)) {
            vp9.a("linkx", "AfcTkManager === registerTkFlag === 广告SDK不存在，不发起相关逻辑");
        } else if (TextUtils.equals("false", vg0.c().b("isAlimamaRequestAvailable", "true"))) {
            vp9.a("linkx", "AfcTkManager === registerTkFlag === 开关关闭，不发起广告SDK的相关逻辑");
        } else if (pg0.i().e == null) {
            vp9.a("linkx", "AfcTkManager === registerTkFlag === 当前未注册，不发起广告SDK的相关逻辑");
        } else {
            if (TextUtils.equals("COLD", pg0.i().k("COLD"))) {
                vp9.a("linkx", "AfcTkManager === registerTkFlag === APP冷启动，发起广告SDK的相关逻辑");
                b(context);
            }
            pg0.i().e.onEvent(new a(context));
        }
    }

    public static void h(Context context) {
        try {
            Class<?> c = c(context);
            if (c != null) {
                c.getMethod("syncCrossTaokeE", new Class[0]).invoke(c.getMethod("instance", new Class[0]).invoke(null, new Object[0]), new Object[0]);
                vp9.a("linkx", "AfcTkManager === sendTkRequest === 发起请求");
            }
        } catch (Exception e) {
            vp9.b("linkx", "AfcTkManager === sendTkRequest，发起请求异常：" + e);
        }
    }

    public static void b(Context context) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d829e6", new Object[]{context});
            return;
        }
        try {
            Map<String, String> f = f(context);
            if (!(f == null || f.size() == 0)) {
                if (!TextUtils.equals("0", f.get("enable_cross_e"))) {
                    if (!TextUtils.isEmpty(f.get("flux_disperse_config"))) {
                        i = Integer.parseInt(f.get("flux_disperse_config"));
                    }
                    vp9.a("linkx", "AfcTkManager === dealTkLogic === 打散请求时间：" + i);
                    if (i <= 0) {
                        h(context);
                        return;
                    }
                    int d = d(i);
                    vp9.a("linkx", "AfcTkManager === dealTkLogic === 随机打散时间：" + d);
                    zsa.b.b(new b(context), (long) (d * 1000));
                    return;
                }
                return;
            }
            vp9.a("linkx", "AfcTkManager === dealTkLogic === 获取的数据为空不处理");
        } catch (Exception e) {
            vp9.b("linkx", "AfcTkManager === dealTkLogic 异常：" + e);
        }
    }

    public static Class<?> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("562ea34f", new Object[]{context});
        }
        try {
            return Class.forName("com.taobao.alimama.AlimamaAdvertising", true, context.getClassLoader());
        } catch (Exception e) {
            vp9.b("linkx", "AfcTkManager === isAdSdkExist === 异常：" + e);
            return null;
        }
    }
}
