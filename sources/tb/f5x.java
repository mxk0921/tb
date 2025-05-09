package tb;

import android.app.Application;
import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_plugin.WeexPlugin;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import tb.o3x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class f5x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Application f19038a;
    public static volatile boolean b;
    public static Future<Integer> d;
    public static String e;
    public static String f;
    public static Class<? extends apc> h;
    public static Class<? extends gce> i;
    public static Class<? extends egb> j;
    public static Class<? extends cbe> l;
    public static Class<? extends jce> m;
    public static Class<? extends kde> p;
    public static Class<? extends kce> q;
    public static Class<? extends hpc> s;
    public static Class<? extends epc> t;
    public static Class<? extends bpc> u;
    public static Integer c = null;
    public static final Map<String, Object> wxEnvironment = new ConcurrentHashMap();
    public static final Map<String, Object> systemEnvironment = new ConcurrentHashMap();
    public static final Map<String, Object> sdkEnvironment = new ConcurrentHashMap();
    public static final Map<String, Object> appEnvironment = new ConcurrentHashMap();
    public static final Class<? extends gpc> g = awh.class;
    public static final Class<? extends qpc> k = g97.class;
    public static final Class<? extends mce> n = v8l.class;
    public static final Class<? extends fde> o = p8x.class;
    public static final Map<String, String> builtinFontMaps = new ConcurrentHashMap();
    public static final Map<Integer, Integer> builtinDarkModeColorMaps = new ConcurrentHashMap();
    public static boolean r = true;

    static {
        t2o.a(982515735);
    }

    public static Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        Application application = f19038a;
        if (application != null) {
            return application;
        }
        return c();
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        Integer num = c;
        if (num != null) {
            return num.intValue();
        }
        Future<Integer> future = d;
        if (future == null) {
            return 0;
        }
        try {
            Integer num2 = (Integer) ((o3x.c) future).get();
            c = num2;
            return num2.intValue();
        } catch (Throwable th) {
            dwh.i(th);
            return 0;
        }
    }

    public static Application c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("707577cd", new Object[0]);
        }
        try {
            Context context = GlobalAppRuntimeInfo.getContext();
            if (context != null) {
                return (Application) context.getApplicationContext();
            }
        } catch (Throwable unused) {
        }
        return e();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76f1caf8", new Object[0])).booleanValue();
        }
        return false;
    }

    public static Application e() {
        try {
            IpChange ipChange = WeexPlugin.$ipChange;
            Object invoke = WeexPlugin.class.getDeclaredMethod("getApplication", new Class[0]).invoke(null, new Object[0]);
            if (invoke instanceof Application) {
                return (Application) invoke;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
