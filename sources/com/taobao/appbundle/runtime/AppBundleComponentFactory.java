package com.taobao.appbundle.runtime;

import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.android.tools.bundleInfo.BundleListing;
import com.taobao.appbundle.a;
import com.taobao.appbundle.fake.FakeProvider;
import com.taobao.appbundle.fake.FakeService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.acq;
import tb.bcq;
import tb.ckf;
import tb.erj;
import tb.f7l;
import tb.hdq;
import tb.i04;
import tb.ru1;
import tb.t2o;
import tb.ucq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class AppBundleComponentFactory extends AppComponentFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String componentName;
    public static final Companion Companion = new Companion(null);
    private static final HashMap<String, a.c> featureComponentLoaderMap = new HashMap<>();
    private static final List<Companion.ComponentInterceptor> componentInterceptors = new ArrayList();
    private static final Map<String, a.b> featureComponentDowngradeInterceptors = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class Component {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private ClassLoader cl;
            private String className;
            private Intent intent;

            static {
                t2o.a(377487414);
            }

            public Component(ClassLoader classLoader, String str, Intent intent) {
                ckf.g(classLoader, "cl");
                ckf.g(str, "className");
                this.cl = classLoader;
                this.className = str;
                this.intent = intent;
            }

            public static /* synthetic */ Component copy$default(Component component, ClassLoader classLoader, String str, Intent intent, int i, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Component) ipChange.ipc$dispatch("c6cb7c0f", new Object[]{component, classLoader, str, intent, new Integer(i), obj});
                }
                if ((i & 1) != 0) {
                    classLoader = component.cl;
                }
                if ((i & 2) != 0) {
                    str = component.className;
                }
                if ((i & 4) != 0) {
                    intent = component.intent;
                }
                return component.copy(classLoader, str, intent);
            }

            public final ClassLoader component1() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ClassLoader) ipChange.ipc$dispatch("4e4b9475", new Object[]{this});
                }
                return this.cl;
            }

            public final String component2() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4803344", new Object[]{this});
                }
                return this.className;
            }

            public final Intent component3() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Intent) ipChange.ipc$dispatch("992b7816", new Object[]{this});
                }
                return this.intent;
            }

            public final Component copy(ClassLoader classLoader, String str, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Component) ipChange.ipc$dispatch("b9ff3535", new Object[]{this, classLoader, str, intent});
                }
                ckf.g(classLoader, "cl");
                ckf.g(str, "className");
                return new Component(classLoader, str, intent);
            }

            public boolean equals(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
                }
                if (this != obj) {
                    if (obj instanceof Component) {
                        Component component = (Component) obj;
                        if (!ckf.b(this.cl, component.cl) || !ckf.b(this.className, component.className) || !ckf.b(this.intent, component.intent)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public final ClassLoader getCl() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ClassLoader) ipChange.ipc$dispatch("23378440", new Object[]{this});
                }
                return this.cl;
            }

            public final String getClassName() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("68ef37ac", new Object[]{this});
                }
                return this.className;
            }

            public final Intent getIntent() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Intent) ipChange.ipc$dispatch("cdc34bda", new Object[]{this});
                }
                return this.intent;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3 = 0;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
                }
                ClassLoader classLoader = this.cl;
                if (classLoader != null) {
                    i = classLoader.hashCode();
                } else {
                    i = 0;
                }
                int i4 = i * 31;
                String str = this.className;
                if (str != null) {
                    i2 = str.hashCode();
                } else {
                    i2 = 0;
                }
                int i5 = (i4 + i2) * 31;
                Intent intent = this.intent;
                if (intent != null) {
                    i3 = intent.hashCode();
                }
                return i5 + i3;
            }

            public final void setCl(ClassLoader classLoader) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f688b2b8", new Object[]{this, classLoader});
                    return;
                }
                ckf.g(classLoader, "<set-?>");
                this.cl = classLoader;
            }

            public final void setClassName(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("373579b2", new Object[]{this, str});
                    return;
                }
                ckf.g(str, "<set-?>");
                this.className = str;
            }

            public final void setIntent(Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f524bbe2", new Object[]{this, intent});
                } else {
                    this.intent = intent;
                }
            }

            public String toString() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return "Component(cl=" + this.cl + ", className=" + this.className + ", intent=" + this.intent + f7l.BRACKET_END_STR;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public interface ComponentInterceptor {
            Component intercept(Component component);
        }

        static {
            t2o.a(377487413);
        }

        private Companion() {
        }

        @JvmStatic
        public final void registerComponentDowngradeListener(String str, a.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d8cd98d", new Object[]{this, str, bVar});
                return;
            }
            ckf.g(str, "className");
            ckf.g(bVar, "featureComponentDowngradeInterceptor");
            AppBundleComponentFactory.access$getFeatureComponentDowngradeInterceptors$cp().put(str, bVar);
        }

        public final void registerFeatureComponentLoader(String str, a.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3a0d759", new Object[]{this, str, cVar});
                return;
            }
            ckf.g(str, ru1.FEATURE_NAME);
            ckf.g(cVar, "featureComponentLoader");
            AppBundleComponentFactory.access$getFeatureComponentLoaderMap$cp().put(str, cVar);
        }

        @JvmStatic
        public final boolean registerInterceptor(ComponentInterceptor componentInterceptor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("55925892", new Object[]{this, componentInterceptor})).booleanValue();
            }
            ckf.g(componentInterceptor, "interceptor");
            return AppBundleComponentFactory.access$getComponentInterceptors$cp().add(componentInterceptor);
        }

        public final void unregisterFeatureComponentLoader(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("580ca307", new Object[]{this, str});
                return;
            }
            ckf.g(str, ru1.FEATURE_NAME);
            AppBundleComponentFactory.access$getFeatureComponentLoaderMap$cp().remove(str);
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(377487412);
    }

    public static final /* synthetic */ List access$getComponentInterceptors$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("aeb08004", new Object[0]);
        }
        return componentInterceptors;
    }

    public static final /* synthetic */ Map access$getFeatureComponentDowngradeInterceptors$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("11d81a67", new Object[0]);
        }
        return featureComponentDowngradeInterceptors;
    }

    public static final /* synthetic */ HashMap access$getFeatureComponentLoaderMap$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a18d5e8f", new Object[0]);
        }
        return featureComponentLoaderMap;
    }

    public static /* synthetic */ Object ipc$super(AppBundleComponentFactory appBundleComponentFactory, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1333100599:
                return super.instantiateService((ClassLoader) objArr[0], (String) objArr[1], (Intent) objArr[2]);
            case -1062134232:
                return super.instantiateReceiver((ClassLoader) objArr[0], (String) objArr[1], (Intent) objArr[2]);
            case 16826479:
                return super.instantiateProvider((ClassLoader) objArr[0], (String) objArr[1]);
            case 1582749175:
                return super.instantiateActivity((ClassLoader) objArr[0], (String) objArr[1], (Intent) objArr[2]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/appbundle/runtime/AppBundleComponentFactory");
        }
    }

    @JvmStatic
    public static final void registerComponentDowngradeListener(String str, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d8cd98d", new Object[]{str, bVar});
        } else {
            Companion.registerComponentDowngradeListener(str, bVar);
        }
    }

    @JvmStatic
    public static final boolean registerInterceptor(Companion.ComponentInterceptor componentInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55925892", new Object[]{componentInterceptor})).booleanValue();
        }
        return Companion.registerInterceptor(componentInterceptor);
    }

    private final void trackComponent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841780d", new Object[]{this, str, str2});
            return;
        }
        AppMonitor.Counter.commit(erj.MODULE, "ExceptionRecovery", "type=UncaughtException, componentType=" + str + ", className=" + str2, 1.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107 A[Catch: all -> 0x00d5, TryCatch #2 {all -> 0x00d5, blocks: (B:21:0x00ac, B:23:0x00b2, B:25:0x00c7, B:30:0x00dc, B:31:0x00e1, B:32:0x00e2, B:36:0x00ec, B:37:0x00fb, B:39:0x0107, B:41:0x0111, B:42:0x0115, B:44:0x0126, B:46:0x012d, B:47:0x015c, B:52:0x0190, B:54:0x0196, B:56:0x01a9, B:58:0x01b1, B:51:0x017e), top: B:140:0x005a, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b8  */
    @Override // android.app.AppComponentFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Activity instantiateActivity(java.lang.ClassLoader r19, java.lang.String r20, android.content.Intent r21) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
        /*
            Method dump skipped, instructions count: 1105
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.appbundle.runtime.AppBundleComponentFactory.instantiateActivity(java.lang.ClassLoader, java.lang.String, android.content.Intent):android.app.Activity");
    }

    @Override // android.app.AppComponentFactory
    public ClassLoader instantiateClassLoader(ClassLoader classLoader, ApplicationInfo applicationInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClassLoader) ipChange.ipc$dispatch("bcffff29", new Object[]{this, classLoader, applicationInfo});
        }
        ckf.g(classLoader, "cl");
        ckf.g(applicationInfo, "aInfo");
        return new InjectClassLoader("", classLoader);
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentProvider) ipChange.ipc$dispatch("100c06f", new Object[]{this, classLoader, str});
        }
        ckf.g(classLoader, "cl");
        ckf.g(str, "className");
        try {
            ClassLoader classLoader2 = AppBundleComponentFactory.class.getClassLoader();
            ckf.d(classLoader2);
            ContentProvider instantiateProvider = super.instantiateProvider(classLoader2, str);
            ckf.f(instantiateProvider, "super.instantiateProvide…  className\n            )");
            return instantiateProvider;
        } catch (ClassNotFoundException unused) {
            return new FakeProvider();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01f5  */
    @Override // android.app.AppComponentFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.content.BroadcastReceiver instantiateReceiver(java.lang.ClassLoader r9, java.lang.String r10, android.content.Intent r11) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.appbundle.runtime.AppBundleComponentFactory.instantiateReceiver(java.lang.ClassLoader, java.lang.String, android.content.Intent):android.content.BroadcastReceiver");
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Service service;
        a.c cVar;
        ComponentName component;
        a.b bVar;
        hdq a2;
        Application d;
        Object[] array;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Service) ipChange.ipc$dispatch("b08a7fc9", new Object[]{this, classLoader, str, intent});
        }
        ckf.g(classLoader, "cl");
        ckf.g(str, "className");
        this.componentName = str;
        try {
            ClassLoader classLoader2 = AppBundleComponentFactory.class.getClassLoader();
            ckf.d(classLoader2);
            service = super.instantiateService(classLoader2, str, intent);
            ckf.f(service, "super.instantiateService…     intent\n            )");
        } catch (Throwable th) {
            BundleListing.a bundleInfoFromService = BundleInfoManager.instance().getBundleInfoFromService(str);
            if (bundleInfoFromService != null) {
                Boolean bool = bundleInfoFromService.f4604a;
                ckf.f(bool, "bundleInfo.dynamicFeature");
                if (bool.booleanValue()) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(bundleInfoFromService.c);
                    arrayList.addAll(ModuleDependencyUtils.getDependencies(bundleInfoFromService.c));
                    Log.e("AppBundleComponent", "deferredInstall " + bundleInfoFromService.c + " because " + str + " not found");
                    if (TextUtils.equals("com.alisports.ldl.lesc.core.LeJobService", str)) {
                        acq p = acq.p();
                        ckf.f(p, "SplitCompat.getInstance()");
                        if (!p.r().containsAll(i04.S(arrayList))) {
                            ClassLoader classLoader3 = AppBundleComponentFactory.class.getClassLoader();
                            ckf.d(classLoader3);
                            Service instantiateService = super.instantiateService(classLoader3, FakeService.class.getName(), intent);
                            ckf.f(instantiateService, "super.instantiateService…ent\n                    )");
                            return instantiateService;
                        }
                    }
                    try {
                        a2 = bcq.a();
                        d = a.Companion.a().d();
                        array = i04.S(arrayList).toArray(new String[0]);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (array != null) {
                        String[] strArr = (String[]) array;
                        a2.g(d, false, (String[]) Arrays.copyOf(strArr, strArr.length));
                        acq p2 = acq.p();
                        ckf.f(p2, "SplitCompat.getInstance()");
                        if (p2.r().containsAll(i04.S(arrayList))) {
                            try {
                                ClassLoader classLoader4 = AppBundleComponentFactory.class.getClassLoader();
                                ckf.d(classLoader4);
                                Service instantiateService2 = super.instantiateService(classLoader4, str, intent);
                                ckf.f(instantiateService2, "super.instantiateService…                        )");
                                return instantiateService2;
                            } catch (ClassNotFoundException unused) {
                                ucq h = a.Companion.a().h();
                                if (h != null) {
                                    h.d(i04.S(arrayList));
                                }
                                Map<String, a.b> map = featureComponentDowngradeInterceptors;
                                if (map.containsKey(str)) {
                                    a.b bVar2 = map.get(str);
                                    if (bVar2 != null) {
                                        bVar2.a();
                                    }
                                    ComponentName componentName = null;
                                    if (!(intent == null || (component = intent.getComponent()) == null || (bVar = map.get(str)) == null)) {
                                        componentName = bVar.b(component);
                                    }
                                    if (componentName == null || ckf.b(componentName.getClassName(), str)) {
                                        ClassLoader classLoader5 = AppBundleComponentFactory.class.getClassLoader();
                                        ckf.d(classLoader5);
                                        super.instantiateService(classLoader5, FakeService.class.getName(), intent);
                                    } else {
                                        ClassLoader classLoader6 = AppBundleComponentFactory.class.getClassLoader();
                                        ckf.d(classLoader6);
                                        super.instantiateService(classLoader6, componentName.getClassName(), intent);
                                    }
                                }
                                ClassLoader classLoader7 = AppBundleComponentFactory.class.getClassLoader();
                                ckf.d(classLoader7);
                                Service instantiateService3 = super.instantiateService(classLoader7, FakeService.class.getName(), intent);
                                ckf.f(instantiateService3, "super.instantiateService…                        )");
                                return instantiateService3;
                            }
                        } else {
                            ucq h2 = a.Companion.a().h();
                            if (h2 != null) {
                                h2.d(arrayList);
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                ClassLoader classLoader8 = AppBundleComponentFactory.class.getClassLoader();
                ckf.d(classLoader8);
                service = super.instantiateService(classLoader8, FakeService.class.getName(), intent);
                ckf.f(service, "super.instantiateService…     intent\n            )");
            } else {
                trackComponent("instantiateService", str);
                throw th;
            }
        }
        BundleListing.a bundleInfoFromService2 = BundleInfoManager.instance().getBundleInfoFromService(service.getClass().getName());
        if (bundleInfoFromService2 != null) {
            HashMap<String, a.c> hashMap = featureComponentLoaderMap;
            if (!(hashMap.get(bundleInfoFromService2.c) == null || (cVar = hashMap.get(bundleInfoFromService2.c)) == null)) {
                cVar.onFeatureComponentLoaded(service.getClass().getName());
            }
        }
        return service;
    }
}
