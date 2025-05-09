package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.split.core.internal.FlexaClassLoader;
import com.alibaba.android.split.core.internal.InternalHacker;
import com.alibaba.android.split.core.internal.ObjectInvoker;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.InstantPatcher;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipFile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a9m extends hx<l8m> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final wnc f = (wnc) d62.b(wnc.class, "PluginManager");

    static {
        t2o.a(677380197);
    }

    public static /* synthetic */ Object ipc$super(a9m a9mVar, String str, Object... objArr) {
        if (str.hashCode() == 1372235095) {
            super.d((jcq) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/plugin/PluginManager");
    }

    public static String v(CharSequence charSequence, Iterable<? extends CharSequence> iterable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84036d82", new Object[]{charSequence, iterable});
        }
        return TextUtils.join(charSequence, iterable);
    }

    @Override // tb.hx, com.alibaba.android.split.manager.a
    public void d(jcq jcqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51caa557", new Object[]{this, jcqVar});
            return;
        }
        super.d(jcqVar);
        if (jcqVar instanceof v49) {
            this.b = new u49(jcqVar);
        } else {
            this.b = new mkj(jcqVar);
        }
    }

    @Override // com.alibaba.android.split.manager.a
    public void h(ocq ocqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0cbdcf0", new Object[]{this, ocqVar});
        } else {
            ((ConcurrentHashMap) this.f20938a).put(ocqVar.b(), new l8m(ocqVar.b(), ocqVar.c(), this.d));
        }
    }

    @Override // com.alibaba.android.split.manager.a
    public boolean j(ClassLoader classLoader, boolean z, boolean z2, boolean z3, ocq ocqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d9239c2", new Object[]{this, classLoader, new Boolean(z), new Boolean(z2), new Boolean(z3), ocqVar})).booleanValue();
        }
        try {
            ClassLoader t = t(classLoader);
            if (z) {
                this.b.b();
                Set<File> k = this.b.k(ocqVar);
                if (z2 && k.size() > 0) {
                    this.e.loadNativeLib(t, k, z3);
                }
            } else if (!z3) {
                Set<File> h = this.b.h(ocqVar);
                if (h == null) {
                    this.f.c("load NativeLibs.Exception:failed", new Object[0]);
                    return false;
                } else if (h.size() > 0) {
                    this.e.loadNativeLib(t, h, false);
                }
            }
            return true;
        } catch (Exception e) {
            this.f.d(e, "installNativeLibs.Exception:%s", e.getMessage());
            Log.e("PluginManager", "installNativeLibs Exception:" + ocqVar.b() + " md5:" + hbi.b(ocqVar.c()));
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.alibaba.android.split.manager.a
    public boolean l(ocq ocqVar) throws Exception {
        ClassLoader classLoader;
        FlexaClassLoader flexaClassLoader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59ac0992", new Object[]{this, ocqVar})).booleanValue();
        }
        HashMap hashMap = (HashMap) fwt.b;
        ((fwt) hashMap.get("FlexaApplication")).b("dex2oat");
        int i = Build.VERSION.SDK_INT;
        if (i <= 29 || acq.p().o().getApplicationInfo().targetSdkVersion >= 29) {
            if (i > 26) {
                this.f.c("injectClassLoader:%s", "injectClassLoader to:FlexaClassLoader");
                flexaClassLoader = new FlexaClassLoader(this.c, ":", null, this.d.d(ocqVar.b()).getPath(), this.c.getParent());
                if (!r(flexaClassLoader, ocqVar, false, true)) {
                    return false;
                }
            } else {
                flexaClassLoader = new FlexaClassLoader(this.c, ocqVar.c().getAbsolutePath(), this.d.c(ocqVar.b()).getAbsolutePath(), this.d.d(ocqVar.b()).getPath(), this.c.getParent());
            }
            classLoader = flexaClassLoader;
        } else {
            y8m.a();
            classLoader = x8m.a(ocqVar.c().getAbsolutePath(), this.d.d(ocqVar.b()).getPath(), this.c);
        }
        boolean g = g(acq.p().o(), classLoader);
        ((fwt) hashMap.get("FlexaApplication")).c();
        if (!g) {
            return false;
        }
        this.c = classLoader;
        return true;
    }

    @Override // com.alibaba.android.split.manager.a
    public boolean m(Set<ocq> set) throws Exception {
        ClassLoader classLoader;
        FlexaClassLoader flexaClassLoader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("517983c2", new Object[]{this, set})).booleanValue();
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (ocq ocqVar : set) {
            hashSet.add(ocqVar.c().getAbsolutePath());
            hashSet2.add(this.d.d(ocqVar.b()).getPath());
        }
        hashSet2.add(acq.p().o().getApplicationInfo().nativeLibraryDir);
        String v = v(":", hashSet);
        String v2 = v(":", hashSet2);
        int i = Build.VERSION.SDK_INT;
        if (i <= 29 || acq.p().o().getApplicationInfo().targetSdkVersion >= 29) {
            if (i > 26) {
                Log.e("injectClassLoader", "injectClassLoader to:FlexaClassLoader");
                ClassLoader classLoader2 = this.c;
                flexaClassLoader = new FlexaClassLoader(classLoader2, ":", null, v2, classLoader2.getParent());
                for (ocq ocqVar2 : set) {
                    if (!r(flexaClassLoader, ocqVar2, false, true)) {
                        return false;
                    }
                }
            } else {
                flexaClassLoader = new FlexaClassLoader(this.c, v, this.d.c(set.iterator().next().b()).getAbsolutePath(), v2, this.c.getParent());
            }
            classLoader = flexaClassLoader;
        } else {
            y8m.a();
            classLoader = x8m.a(v, v2, this.c);
        }
        if (!g(acq.p().o(), classLoader)) {
            return false;
        }
        Thread.currentThread().setContextClassLoader(classLoader);
        this.c = classLoader;
        return true;
    }

    @Override // com.alibaba.android.split.manager.a
    public boolean n(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35373292", new Object[]{this, context, str})).booleanValue();
        }
        if (((ConcurrentHashMap) this.f20938a).containsKey(str)) {
            return ((l8m) ((ConcurrentHashMap) this.f20938a).get(str)).f(context);
        }
        return false;
    }

    public final ClassLoader s(ClassLoader classLoader) {
        if (classLoader == null) {
            return null;
        }
        try {
            Field declaredField = classLoader.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            return (ClassLoader) declaredField.get(classLoader);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final ClassLoader t(ClassLoader classLoader) {
        Class<?> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClassLoader) ipChange.ipc$dispatch("fbc2e370", new Object[]{this, classLoader});
        }
        try {
            cls = Class.forName("java.lang.BootClassLoader");
        } catch (Exception e) {
            e.printStackTrace();
            cls = null;
        }
        ClassLoader classLoader2 = classLoader;
        while (classLoader2 != null && classLoader2.getClass() != PathClassLoader.class && classLoader2.getClass() != cls) {
            classLoader2 = classLoader2.getParent();
        }
        if (classLoader2.getClass() == cls) {
            classLoader2 = s(classLoader);
            while (classLoader2 != null && classLoader2.getClass() != cls && classLoader2.getClass() != PathClassLoader.class) {
                classLoader2 = s(classLoader2);
            }
        }
        return classLoader2;
    }

    public final boolean u(ocq ocqVar) throws IOException {
        IOException e;
        ZipFile zipFile;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1345bb2f", new Object[]{this, ocqVar})).booleanValue();
        }
        ZipFile zipFile2 = null;
        try {
            zipFile = new ZipFile(ocqVar.c());
        } catch (IOException e2) {
            e = e2;
        }
        try {
            if (zipFile.getEntry(InstantPatcher.CLASSES_DEX) == null) {
                z = false;
            }
            zipFile.close();
            return z;
        } catch (IOException e3) {
            e = e3;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException unused) {
                }
            }
            throw e;
        }
    }

    @Override // com.alibaba.android.split.manager.a
    public boolean g(Context context, ClassLoader classLoader) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d48fa21", new Object[]{this, context, classLoader})).booleanValue();
        }
        Object loadedApk = InternalHacker.getLoadedApk(InternalHacker.getActivityThread(context), context.getPackageName());
        if (loadedApk == null) {
            return false;
        }
        ObjectInvoker.create(loadedApk, "mClassLoader", ClassLoader.class).setObject(classLoader);
        Thread.currentThread().setContextClassLoader(classLoader);
        return true;
    }

    public final boolean r(ClassLoader classLoader, ocq ocqVar, boolean z, boolean z2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93032a35", new Object[]{this, classLoader, ocqVar, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        String valueOf = String.valueOf(ocqVar.c());
        StringBuilder sb = new StringBuilder(valueOf.length() + 24);
        if (!u(ocqVar) || this.e.loadDex(classLoader, this.d.c(ocqVar.b()), ocqVar, z, z2)) {
            return true;
        }
        wnc wncVar = this.f;
        sb.append("split dexopt failed ");
        sb.append(valueOf);
        wncVar.c("appendSelfClassLoader:%s", sb.toString());
        return false;
    }

    @Override // com.alibaba.android.split.manager.a
    public boolean o(ClassLoader classLoader, ocq ocqVar, boolean z, boolean z2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e51345fc", new Object[]{this, classLoader, ocqVar, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        String valueOf = String.valueOf(ocqVar.c());
        StringBuilder sb = new StringBuilder(valueOf.length() + 24);
        ClassLoader t = t(classLoader);
        if (!u(ocqVar) || this.e.loadDex(t, this.d.c(ocqVar.b()), ocqVar, z, z2)) {
            return true;
        }
        wnc wncVar = this.f;
        sb.append("split dexopt failed ");
        sb.append(valueOf);
        wncVar.c("appendPathClassLoader:%s:%s:%s", sb.toString(), Boolean.valueOf(z), Boolean.valueOf(z2));
        return false;
    }
}
