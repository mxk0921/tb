package tb;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import com.alibaba.android.split.core.internal.InternalHacker;
import com.alibaba.android.split.core.splitcompat.FlexaResources;
import com.alibaba.android.split.core.splitcompat.Reflector;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class k9o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(677380201);
        }

        public static /* synthetic */ Resources a(Resources resources, AssetManager assetManager) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Resources) ipChange.ipc$dispatch("d7c690a5", new Object[]{resources, assetManager});
            }
            return b(resources, assetManager);
        }

        public static Resources b(Resources resources, AssetManager assetManager) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Resources) ipChange.ipc$dispatch("8254de8f", new Object[]{resources, assetManager});
            }
            try {
                return (Resources) Reflector.s(resources).f(AssetManager.class, DisplayMetrics.class, Configuration.class).m(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
            } catch (Exception unused) {
                return new FlexaResources(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(677380202);
        }

        public static /* synthetic */ Resources a(Resources resources, AssetManager assetManager) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Resources) ipChange.ipc$dispatch("7eac22c8", new Object[]{resources, assetManager});
            }
            return b(resources, assetManager);
        }

        public static Resources b(Resources resources, AssetManager assetManager) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Resources) ipChange.ipc$dispatch("8254de8f", new Object[]{resources, assetManager});
            }
            return (Resources) Reflector.o("android.content.res.MiuiResources").f(AssetManager.class, DisplayMetrics.class, Configuration.class).m(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(677380203);
        }

        public static /* synthetic */ Resources a(Resources resources, AssetManager assetManager) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Resources) ipChange.ipc$dispatch("f686c06", new Object[]{resources, assetManager});
            }
            return b(resources, assetManager);
        }

        public static Resources b(Resources resources, AssetManager assetManager) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Resources) ipChange.ipc$dispatch("8254de8f", new Object[]{resources, assetManager});
            }
            return (Resources) Reflector.o("android.content.res.NubiaResources").f(AssetManager.class, DisplayMetrics.class, Configuration.class).m(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
        }
    }

    static {
        t2o.a(677380200);
    }

    public static synchronized Resources a(Context context, File file) throws Exception {
        synchronized (k9o.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Resources) ipChange.ipc$dispatch("d36a5980", new Object[]{context, file});
            }
            Resources b2 = b(context, file.getAbsolutePath());
            c(context, b2);
            return b2;
        }
    }

    public static Resources b(Context context, String str) throws Exception {
        Resources resources = context.getResources();
        Reflector l = Reflector.n(AssetManager.class).l("addAssetPath", String.class);
        AssetManager assets = resources.getAssets();
        l.a(assets);
        int intValue = ((Integer) l.b(str)).intValue();
        if (intValue != 0) {
            Log.e("ResourcesManager", "cookie2 is:" + intValue);
            if (d(resources)) {
                return b.a(resources, assets);
            }
            if (g(resources)) {
                return d.a(context, resources, assets);
            }
            if (f(resources)) {
                return c.a(resources, assets);
            }
            if (e(resources)) {
                return a.a(resources, assets);
            }
            return new FlexaResources(assets, resources.getDisplayMetrics(), resources.getConfiguration());
        }
        throw new RuntimeException("createResources failed, can't addAssetPath for " + str);
    }

    public static void c(Context context, Resources resources) throws Exception {
        if (Build.VERSION.SDK_INT < 24) {
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            Reflector s = Reflector.s(context);
            s.g("mResources").q(resources);
            Reflector.s(s.g("mPackageInfo").j()).g("mResources").q(resources);
            InternalHacker.getActivityThread(context);
            new HashMap();
            Method declaredMethod = Class.forName("android.app.ResourcesManager").getDeclaredMethod("getInstance", new Class[0]);
            declaredMethod.setAccessible(true);
            Map map = (Map) Reflector.s(declaredMethod.invoke(null, new Object[0])).g("mActiveResources").j();
            Iterator it = new HashSet(map.keySet()).iterator();
            while (it.hasNext()) {
                map.put(it.next(), new WeakReference(resources));
            }
        }
    }

    public static boolean d(Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3476424", new Object[]{resources})).booleanValue();
        }
        return resources.getClass().getName().equals("android.content.res.MiuiResources");
    }

    public static boolean e(Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1817d378", new Object[]{resources})).booleanValue();
        }
        return !resources.getClass().getName().equals("android.content.res.Resources");
    }

    public static boolean f(Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68bf2895", new Object[]{resources})).booleanValue();
        }
        return resources.getClass().getName().equals("android.content.res.NubiaResources");
    }

    public static boolean g(Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266dab48", new Object[]{resources})).booleanValue();
        }
        return resources.getClass().getName().equals("android.content.res.VivoResources");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(677380204);
        }

        public static /* synthetic */ Resources a(Context context, Resources resources, AssetManager assetManager) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Resources) ipChange.ipc$dispatch("cb36570f", new Object[]{context, resources, assetManager});
            }
            return b(context, resources, assetManager);
        }

        public static Resources b(Context context, Resources resources, AssetManager assetManager) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Resources) ipChange.ipc$dispatch("71289ce7", new Object[]{context, resources, assetManager});
            }
            Reflector o = Reflector.o("android.content.res.VivoResources");
            Resources resources2 = (Resources) o.f(AssetManager.class, DisplayMetrics.class, Configuration.class).m(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
            o.l("init", String.class).c(resources2, context.getPackageName());
            o.g("mThemeValues");
            o.r(resources2, o.k(resources));
            return resources2;
        }
    }
}
