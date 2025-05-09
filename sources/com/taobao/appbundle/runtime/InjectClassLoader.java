package com.taobao.appbundle.runtime;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.android.tools.bundleInfo.BundleListing;
import com.taobao.appbundle.a;
import com.taobao.appbundle.fake.FakeActivity;
import com.taobao.appbundle.fake.FakeReceiver;
import com.taobao.appbundle.fake.FakeService;
import com.taobao.appbundle.remote.activity.RemoteLoadingActivity;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import tb.a07;
import tb.acq;
import tb.bcq;
import tb.ckf;
import tb.hdq;
import tb.i04;
import tb.jra;
import tb.ru1;
import tb.stn;
import tb.t2o;
import tb.ucq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class InjectClassLoader extends PathClassLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InjectClassLoader";
    private Method methodFindResource;
    private Method methodFindResources;
    private final PathClassLoader originClassLoader;
    public static final Companion Companion = new Companion(null);
    private static final HashMap<String, a.c> featureComponentLoaderMap = new HashMap<>();
    private static String featureName = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(377487417);
        }

        private Companion() {
        }

        private final void reflectPackageInfoClassloader(Context context, ClassLoader classLoader) throws Exception {
            Object obj;
            try {
                obj = jra.b(jra.a(), context.getPackageName());
            } catch (Exception e) {
                e.printStackTrace();
                obj = null;
            }
            if (obj == null) {
                obj = stn.a(a.Companion.a().d(), "mLoadedApk");
            }
            if (obj != null) {
                Log.e(InjectClassLoader.TAG, "loaded_apk got success");
            }
            Field a2 = stn.a(obj, "mClassLoader");
            ckf.f(a2, "field");
            a2.setAccessible(true);
            try {
                a2.set(obj, classLoader);
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
            Thread currentThread = Thread.currentThread();
            ckf.f(currentThread, "Thread.currentThread()");
            currentThread.setContextClassLoader(classLoader);
        }

        public final HashMap<String, a.c> getFeatureComponentLoaderMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("7acbefd6", new Object[]{this});
            }
            return InjectClassLoader.access$getFeatureComponentLoaderMap$cp();
        }

        public final String getFeatureName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this});
            }
            return InjectClassLoader.access$getFeatureName$cp();
        }

        public final PathClassLoader inject(ClassLoader classLoader, Context context) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PathClassLoader) ipChange.ipc$dispatch("45feb1fb", new Object[]{this, classLoader, context});
            }
            ckf.g(classLoader, "originalClassloader");
            ckf.g(context, "appContext");
            InjectClassLoader injectClassLoader = new InjectClassLoader("", classLoader);
            reflectPackageInfoClassloader(context, injectClassLoader);
            Log.e(InjectClassLoader.TAG, "inject classLoader success");
            return injectClassLoader;
        }

        public final void registerFeatureComponentLoader(String str, a.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3a0d759", new Object[]{this, str, cVar});
                return;
            }
            ckf.g(str, ru1.FEATURE_NAME);
            ckf.g(cVar, "featureComponentLoader");
            getFeatureComponentLoaderMap().put(str, cVar);
        }

        public final void setFeatureName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7f67230", new Object[]{this, str});
                return;
            }
            ckf.g(str, "<set-?>");
            InjectClassLoader.access$setFeatureName$cp(str);
        }

        public final void unregisterFeatureComponentLoader(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("580ca307", new Object[]{this, str});
                return;
            }
            ckf.g(str, ru1.FEATURE_NAME);
            getFeatureComponentLoaderMap().remove(str);
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(377487416);
    }

    public static final /* synthetic */ HashMap access$getFeatureComponentLoaderMap$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a18d5e8f", new Object[0]);
        }
        return featureComponentLoaderMap;
    }

    public static final /* synthetic */ String access$getFeatureName$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("389b2bb3", new Object[0]);
        }
        return featureName;
    }

    public static final /* synthetic */ void access$setFeatureName$cp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb966c23", new Object[]{str});
        } else {
            featureName = str;
        }
    }

    private final URL invokeFindResource(String str) {
        Object obj;
        Method method = this.methodFindResource;
        if (method != null) {
            obj = method.invoke(this.originClassLoader, str);
        } else {
            obj = null;
        }
        return (URL) obj;
    }

    private final Enumeration<URL> invokeFindResources(String str) {
        Method method = this.methodFindResources;
        Object invoke = method != null ? method.invoke(this.originClassLoader, str) : null;
        if (invoke != null) {
            return (Enumeration) invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.util.Enumeration<java.net.URL>");
    }

    public static /* synthetic */ Object ipc$super(InjectClassLoader injectClassLoader, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1538227411) {
            return super.findLibrary((String) objArr[0]);
        }
        if (hashCode == 2114946432) {
            return super.getPackage((String) objArr[0]);
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/appbundle/runtime/InjectClassLoader");
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public String findLibrary(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a450832d", new Object[]{this, str});
        }
        ckf.g(str, "name");
        String findLibrary = this.originClassLoader.findLibrary(str);
        if (findLibrary != null && findLibrary.length() != 0) {
            return findLibrary;
        }
        String findLibrary2 = super.findLibrary(str);
        ckf.f(findLibrary2, "super.findLibrary(name)");
        return findLibrary2;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public URL findResource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("8e5461dd", new Object[]{this, str});
        }
        return invokeFindResource(str);
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Enumeration<URL> findResources(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Enumeration) ipChange.ipc$dispatch("93b5f2e7", new Object[]{this, str});
        }
        return invokeFindResources(str);
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Package getPackage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Package) ipChange.ipc$dispatch("7e0f8580", new Object[]{this, str});
        }
        Package r0 = super.getPackage(str);
        if (r0 != null) {
            return r0;
        }
        Package definePackage = definePackage(str, "Unknown", "0.0", "Unknown", "Unknown", "0.0", "Unknown", null);
        ckf.f(definePackage, "definePackage(\n         …       null\n            )");
        return definePackage;
    }

    @Override // dalvik.system.BaseDexClassLoader
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return getParent().toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InjectClassLoader(String str, ClassLoader classLoader) {
        super(str, classLoader);
        ckf.g(str, "dexPath");
        ckf.g(classLoader, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        this.originClassLoader = (PathClassLoader) classLoader;
        try {
            Method declaredMethod = BaseDexClassLoader.class.getDeclaredMethod("findResource", String.class);
            this.methodFindResource = declaredMethod;
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
            Method declaredMethod2 = BaseDexClassLoader.class.getDeclaredMethod("findResources", String.class);
            this.methodFindResources = declaredMethod2;
            if (declaredMethod2 != null) {
                declaredMethod2.setAccessible(true);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("7a51913d", new Object[]{this, str});
        }
        ckf.g(str, "name");
        if (BundleInfoManager.instance().isDynamicFragment(str)) {
            String queryFeatureFromFragment = BundleInfoManager.instance().queryFeatureFromFragment(str);
            if (!TextUtils.isEmpty(queryFeatureFromFragment)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(queryFeatureFromFragment);
                hdq a2 = bcq.a();
                Application d = a.Companion.a().d();
                Object[] array = i04.S(arrayList).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    a2.g(d, false, (String[]) Arrays.copyOf(strArr, strArr.length));
                    try {
                        return Class.forName(str);
                    } catch (Exception unused) {
                        throw new ClassNotFoundException(str);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new ClassNotFoundException(str);
            }
        } else if (BundleInfoManager.instance().isDynamicView(str)) {
            String queryFeatureFromView = BundleInfoManager.instance().queryFeatureFromView(str);
            if (!TextUtils.isEmpty(queryFeatureFromView)) {
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(queryFeatureFromView);
                hdq a3 = bcq.a();
                Application d2 = a.Companion.a().d();
                Object[] array2 = i04.S(arrayList2).toArray(new String[0]);
                if (array2 != null) {
                    String[] strArr2 = (String[]) array2;
                    a3.g(d2, false, (String[]) Arrays.copyOf(strArr2, strArr2.length));
                    try {
                        return Class.forName(str);
                    } catch (Exception unused2) {
                        throw new ClassNotFoundException(str);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new ClassNotFoundException(str);
            }
        } else if (!BundleInfoManager.instance().isAppComponent(str)) {
            throw new ClassNotFoundException(str);
        } else if (BundleInfoManager.instance().isDynamicActivity(str)) {
            BundleListing.a bundleInfoFromActivity = BundleInfoManager.instance().getBundleInfoFromActivity(str);
            if (bundleInfoFromActivity != null) {
                Boolean bool = bundleInfoFromActivity.f4604a;
                ckf.f(bool, "bundleInfo.dynamicFeature");
                if (!bool.booleanValue()) {
                    return FakeActivity.class;
                }
                ArrayList arrayList3 = new ArrayList(1);
                arrayList3.add(bundleInfoFromActivity.c);
                arrayList3.addAll(bundleInfoFromActivity.m);
                Log.e(TAG, "deferredInstall " + bundleInfoFromActivity.c + " because " + str + " not found");
                hdq a4 = bcq.a();
                Application d3 = a.Companion.a().d();
                Object[] array3 = i04.S(arrayList3).toArray(new String[0]);
                if (array3 != null) {
                    String[] strArr3 = (String[]) array3;
                    a4.g(d3, false, (String[]) Arrays.copyOf(strArr3, strArr3.length));
                    acq p = acq.p();
                    ckf.f(p, "com.alibaba.android.spli…SplitCompat.getInstance()");
                    if (p.r().containsAll(i04.S(arrayList3))) {
                        try {
                            return Class.forName(str);
                        } catch (Exception e) {
                            e.printStackTrace();
                            String str2 = bundleInfoFromActivity.c;
                            ckf.f(str2, "bundleInfo.featureName");
                            featureName = str2;
                            return RemoteLoadingActivity.class;
                        }
                    } else {
                        String str3 = bundleInfoFromActivity.c;
                        ckf.f(str3, "bundleInfo.featureName");
                        featureName = str3;
                        return FakeActivity.class;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new ClassNotFoundException(str);
            }
        } else if (BundleInfoManager.instance().isDynamicService(str)) {
            BundleListing.a bundleInfoFromService = BundleInfoManager.instance().getBundleInfoFromService(str);
            if (bundleInfoFromService != null) {
                Boolean bool2 = bundleInfoFromService.f4604a;
                ckf.f(bool2, "bundleInfo.dynamicFeature");
                if (!bool2.booleanValue()) {
                    return FakeService.class;
                }
                ArrayList arrayList4 = new ArrayList(1);
                arrayList4.add(bundleInfoFromService.c);
                arrayList4.addAll(bundleInfoFromService.m);
                Log.e(TAG, "deferredInstall " + bundleInfoFromService.c + " because " + str + " not found");
                hdq a5 = bcq.a();
                Application d4 = a.Companion.a().d();
                Object[] array4 = i04.S(arrayList4).toArray(new String[0]);
                if (array4 != null) {
                    String[] strArr4 = (String[]) array4;
                    a5.g(d4, false, (String[]) Arrays.copyOf(strArr4, strArr4.length));
                    try {
                        return Class.forName(str);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        ucq h = a.Companion.a().h();
                        if (h == null) {
                            return FakeService.class;
                        }
                        h.d(i04.S(arrayList4));
                        return FakeService.class;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new ClassNotFoundException(str);
            }
        } else if (!BundleInfoManager.instance().isDynamicReceiver(str)) {
            return null;
        } else {
            BundleListing.a bundleInfoFromReceiver = BundleInfoManager.instance().getBundleInfoFromReceiver(str);
            if (bundleInfoFromReceiver != null) {
                Boolean bool3 = bundleInfoFromReceiver.f4604a;
                ckf.f(bool3, "bundleInfo.dynamicFeature");
                if (!bool3.booleanValue()) {
                    return FakeReceiver.class;
                }
                ArrayList arrayList5 = new ArrayList(1);
                arrayList5.add(bundleInfoFromReceiver.c);
                arrayList5.addAll(bundleInfoFromReceiver.m);
                Log.e(TAG, "deferredInstall " + bundleInfoFromReceiver.c + " because " + str + " not found");
                hdq a6 = bcq.a();
                Application d5 = a.Companion.a().d();
                Object[] array5 = i04.S(arrayList5).toArray(new String[0]);
                if (array5 != null) {
                    String[] strArr5 = (String[]) array5;
                    a6.g(d5, false, (String[]) Arrays.copyOf(strArr5, strArr5.length));
                    try {
                        return Class.forName(str);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        ucq h2 = a.Companion.a().h();
                        if (h2 == null) {
                            return FakeReceiver.class;
                        }
                        h2.d(i04.S(arrayList5));
                        return FakeReceiver.class;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new ClassNotFoundException(str);
            }
        }
    }
}
