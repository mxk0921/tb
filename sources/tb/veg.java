package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class veg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, a> f29957a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f29958a;
        public final ClassLoader b;

        static {
            t2o.a(507510808);
        }

        public a(String str, ClassLoader classLoader) {
            this.f29958a = str;
            this.b = classLoader;
        }

        public static /* synthetic */ Object a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("9257e9fd", new Object[]{aVar});
            }
            aVar.getClass();
            return null;
        }

        public ClassLoader b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ClassLoader) ipChange.ipc$dispatch("8d8cecd6", new Object[]{this});
            }
            return this.b;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("68ef37ac", new Object[]{this});
            }
            return this.f29958a;
        }
    }

    static {
        t2o.a(507510807);
    }

    public static tdg a(String str, Context context, ajc ajcVar) {
        Class<?> cls;
        a aVar = (a) ((ConcurrentHashMap) f29957a).get(str);
        if (aVar == null || aVar.c() == null) {
            keg.d(6, "LVPluginManager", "create plugin failed, plugin not register or empty, " + str);
            return null;
        }
        String c = aVar.c();
        try {
            ClassLoader b = aVar.b();
            if (b == null) {
                cls = Class.forName(c);
            } else {
                cls = b.loadClass(c);
            }
        } catch (Exception e) {
            keg.d(6, "LVPluginManager", "create plugin error: " + str + e.getMessage());
            e.printStackTrace();
        }
        if (cls == null || !tdg.class.isAssignableFrom(cls)) {
            keg.d(6, "LVPluginManager", "create plugin failed: " + str);
            return null;
        }
        tdg tdgVar = (tdg) cls.newInstance();
        tdgVar.initialize(context, ajcVar, a.a(aVar), str);
        return tdgVar;
    }

    public static void b(String str, Class<? extends tdg> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a95b13e", new Object[]{str, cls, new Boolean(z)});
        } else {
            c(str, cls, z, f29957a);
        }
    }

    public static void c(String str, Class<? extends tdg> cls, boolean z, Map<String, a> map) {
        ClassLoader classLoader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd7c687", new Object[]{str, cls, new Boolean(z), map});
        } else if (!TextUtils.isEmpty(str) && cls != null) {
            if (z) {
                classLoader = cls.getClassLoader();
            } else {
                classLoader = null;
            }
            map.put(str, new a(cls.getName(), classLoader));
            keg.d(6, "LVPluginManager", "HY_REGISTERPLUGIN:" + str + "::" + cls.getName());
        }
    }
}
