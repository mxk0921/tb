package tb;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.ArrayMap;
import com.alibaba.android.split.core.internal.FieldObjectHolder;
import com.alibaba.android.split.core.internal.InternalHacker;
import com.alibaba.android.split.core.internal.ObjectInvoker;
import com.alibaba.android.split.core.splitcompat.Reflector;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class r8o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static r8o i;

    /* renamed from: a  reason: collision with root package name */
    public final Method f27194a;
    public Resources b;
    public final Method c;
    public final ArrayMap d;
    public final Field e;
    public final Method f;
    public final Object g = new Object();
    public final wnc h = (wnc) d62.b(wnc.class, "ResourceManager");

    static {
        t2o.a(677380199);
    }

    public r8o() {
        this.d = null;
        try {
            if (Build.VERSION.SDK_INT < 26) {
                Method declaredMethod = AssetManager.class.getDeclaredMethod("getStringBlockCount", new Class[0]);
                this.c = declaredMethod;
                declaredMethod.setAccessible(true);
                this.f27194a = AssetManager.class.getDeclaredMethod("getCookieName", Integer.TYPE);
            }
            if (Build.VERSION.SDK_INT > 23) {
                Method declaredMethod2 = Class.forName("android.app.ResourcesManager").getDeclaredMethod("getInstance", new Class[0]);
                declaredMethod2.setAccessible(true);
                this.d = (ArrayMap) ObjectInvoker.create(declaredMethod2.invoke(null, new Object[0]), "mResourceImpls", ArrayMap.class).getObject();
                Field declaredField = Class.forName("android.content.res.ResourcesImpl").getDeclaredField("mAssets");
                this.e = declaredField;
                declaredField.setAccessible(true);
            }
            Method declaredMethod3 = AssetManager.class.getDeclaredMethod("addAssetPath", String.class);
            this.f = declaredMethod3;
            declaredMethod3.setAccessible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String[] e(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("53b8460a", new Object[]{strArr, strArr2});
        }
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        if (strArr2 == null || strArr2.length == 0) {
            return strArr;
        }
        String[] strArr3 = (String[]) Array.newInstance(String.class, strArr.length + strArr2.length);
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    public static String[] f(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("2f2e1f8b", new Object[]{strArr});
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : strArr) {
            linkedHashSet.add(str);
        }
        return (String[]) linkedHashSet.toArray(new String[0]);
    }

    public static r8o i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r8o) ipChange.ipc$dispatch("f9dbeec6", new Object[0]);
        }
        if (i == null) {
            synchronized (r8o.class) {
                try {
                    if (i == null) {
                        i = new r8o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }

    public int a(AssetManager assetManager, String str) {
        int i2 = 0;
        int i3 = 0;
        while (i2 == 0 && i3 < 3) {
            i3++;
            try {
                i2 = ((Integer) this.f.invoke(assetManager, str)).intValue();
            } catch (Exception unused) {
            }
        }
        if (i2 != 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("addAssetPath failed with cookie:");
        sb2.append(i2);
        sb.append(sb2.toString());
        sb.append(" with apk:");
        sb.append(str);
        sb.append(" size:");
        sb.append(new File(str).length());
        sb.append(" md5:");
        sb.append(hbi.b(new File(str)));
        this.h.c(sb.toString(), new Object[0]);
        throw new RuntimeException("can not addAssetPath:" + str);
    }

    public void b(Context context, File file) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3904cc4", new Object[]{this, context, file});
        } else {
            this.b = k9o.a(context, file);
        }
    }

    public void c(String[] strArr, Context context) throws Exception {
        Object loadedApk;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1732cc7c", new Object[]{this, strArr, context});
        } else if (!n1r.B(context) && (loadedApk = InternalHacker.getLoadedApk(InternalHacker.getActivityThread(context), context.getPackageName())) != null) {
            ObjectInvoker.create(loadedApk, "mSplitResDirs", String[].class).setObject(strArr);
        }
    }

    public boolean g(AssetManager assetManager, String str) {
        try {
            Method method = this.c;
            if (method != null) {
                int intValue = ((Integer) method.invoke(assetManager, new Object[0])).intValue();
                int i2 = 0;
                while (i2 < intValue) {
                    i2++;
                    if (h(assetManager, i2).equals(str)) {
                        wnc wncVar = this.h;
                        wncVar.c("assetsManager:" + assetManager + "containsFeaturePath:" + str, new Object[0]);
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    public String h(AssetManager assetManager, int i2) throws IllegalAccessException {
        try {
            Method method = this.f27194a;
            if (method != null) {
                return (String) method.invoke(assetManager, Integer.valueOf(i2));
            }
            return "";
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return "";
        }
    }

    public void j(String[] strArr) throws Exception {
        if (this.d != null) {
            synchronized (this.g) {
                for (int i2 = 0; i2 < this.d.size(); i2++) {
                    try {
                        Object keyAt = this.d.keyAt(i2);
                        FieldObjectHolder create = ObjectInvoker.create(keyAt, "mSplitResDirs", String[].class);
                        if (create.getObject() == null) {
                            create.setObject(strArr);
                        } else {
                            create.setObject(f(e(strArr, (String[]) create.getObject())));
                        }
                        Object obj = ((WeakReference) this.d.get(keyAt)).get();
                        if (obj != null) {
                            AssetManager assetManager = (AssetManager) this.e.get(obj);
                            for (String str : strArr) {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    a(assetManager, str);
                                } else if (!i().g(assetManager, str)) {
                                    a(assetManager, str);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public Resources d(Context context, String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("6cc3eb21", new Object[]{this, context, str});
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26 && g(context.getAssets(), str)) {
            return context.getResources();
        }
        if (i2 > 23) {
            a(context.getAssets(), str);
            Resources resources = context.getResources();
            this.b = resources;
            return resources;
        }
        if (this.b == null || mcq.a().a().size() >= 2) {
            b(context, new File(str));
        } else {
            try {
                if (context instanceof ContextWrapper) {
                    Reflector.s(((ContextWrapper) context).getBaseContext()).g("mResources").q(this.b);
                } else {
                    Reflector.s(context).g("mResources").q(this.b);
                }
            } catch (Reflector.ReflectedException e) {
                e.printStackTrace();
                throw e;
            }
        }
        return this.b;
    }
}
