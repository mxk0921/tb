package com.taobao.weex;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.adapter.IWXImgLoaderAdapter;
import com.taobao.weex.bridge.ModuleFactory;
import com.taobao.weex.bridge.WXInitDelayTask;
import com.taobao.weex.common.Destroyable;
import com.taobao.weex.common.TypeModuleFactory;
import com.taobao.weex.common.WXException;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.ui.ExternalLoaderComponentHolder;
import com.taobao.weex.ui.IExternalComponentGetter;
import com.taobao.weex.ui.IFComponentHolder;
import com.taobao.weex.ui.SimpleComponentHolder;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.utils.WXLogUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.hbe;
import tb.heb;
import tb.nid;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WXSDKEngine implements Serializable, nid<hbe> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static hbe mRemoteImpl = null;
    private static WXSDKEngine sManager;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class DestroyableModule extends WXModule implements Destroyable {
        static {
            t2o.a(985661456);
            t2o.a(985661561);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f14107a;
        public final /* synthetic */ ModuleFactory b;
        public final /* synthetic */ boolean c;

        public a(String str, ModuleFactory moduleFactory, boolean z) {
            this.f14107a = str;
            this.b = moduleFactory;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                WXSDKEngine.access$000().registerModuleImpl(this.f14107a, this.b, this.c);
            } catch (Throwable th) {
                WXLogUtils.e("weex1", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f14108a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;

        public b(String str, String str2, Map map) {
            this.f14108a = str;
            this.b = str2;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                WXSDKEngine.access$000().registerServiceImpl(this.f14108a, this.b, this.c);
            } catch (Throwable th) {
                WXLogUtils.e("weex1", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f14109a;
        public final /* synthetic */ IFComponentHolder b;
        public final /* synthetic */ Map c;

        public c(String str, IFComponentHolder iFComponentHolder, Map map) {
            this.f14109a = str;
            this.b = iFComponentHolder;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                WXSDKEngine.access$000().registerComponent(this.f14109a, this.b, this.c);
            } catch (Throwable th) {
                WXLogUtils.e("weex1", th);
            }
        }
    }

    static {
        t2o.a(985661452);
        t2o.a(985661634);
    }

    public static /* synthetic */ hbe access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hbe) ipChange.ipc$dispatch("cd2e7e88", new Object[0]);
        }
        return mRemoteImpl;
    }

    public static void callback(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7344f625", new Object[]{str, str2, map});
        } else {
            WXSDKManager.getInstance().callback(str, str2, map);
        }
    }

    public static heb getActivityNavBarSetter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (heb) ipChange.ipc$dispatch("fa97988e", new Object[0]);
        }
        return WXSDKManager.getInstance().getActivityNavBarSetter();
    }

    public static IWXImgLoaderAdapter getIWXImgLoaderAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXImgLoaderAdapter) ipChange.ipc$dispatch("7a9f42bd", new Object[0]);
        }
        return WXSDKManager.getInstance().getIWXImgLoaderAdapter();
    }

    public static com.taobao.weex.appfram.storage.b getIWXStorageAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.weex.appfram.storage.b) ipChange.ipc$dispatch("1fdb427", new Object[0]);
        }
        return WXSDKManager.getInstance().getIWXStorageAdapter();
    }

    public static WXSDKEngine getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKEngine) ipChange.ipc$dispatch("4ee9ace3", new Object[0]);
        }
        if (sManager == null) {
            synchronized (WXSDKEngine.class) {
                try {
                    if (sManager == null) {
                        sManager = new WXSDKEngine();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sManager;
    }

    public static boolean isInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[0])).booleanValue();
        }
        hbe hbeVar = mRemoteImpl;
        if (hbeVar == null) {
            WXLogUtils.e("WXSDKEngine remote impl is null. isInitialized:false");
            return false;
        }
        boolean isInitializedImpl = hbeVar.isInitializedImpl();
        WXLogUtils.e("WXSDKEngine isInitialized:" + isInitializedImpl);
        return isInitializedImpl;
    }

    public static boolean isRemoteInstalled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ac48ed5", new Object[0])).booleanValue();
        }
        if (mRemoteImpl != null) {
            return true;
        }
        return false;
    }

    public static boolean registerComponent(String str, Class<? extends WXComponent> cls) throws WXException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9befe1f6", new Object[]{str, cls})).booleanValue() : registerComponent(str, new SimpleComponentHolder(cls), new HashMap());
    }

    public static <T extends WXModule> boolean registerModule(String str, ModuleFactory moduleFactory, boolean z) throws WXException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fcd9cdc", new Object[]{str, moduleFactory, new Boolean(z)})).booleanValue();
        }
        hbe hbeVar = mRemoteImpl;
        if (hbeVar != null) {
            return hbeVar.registerModuleImpl(str, moduleFactory, z);
        }
        WXInitDelayTask.getInstance().addDelayTask(new a(str, moduleFactory, z));
        return true;
    }

    public static boolean registerService(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc91c13c", new Object[]{str, str2, map})).booleanValue();
        }
        hbe hbeVar = mRemoteImpl;
        if (hbeVar != null) {
            return hbeVar.registerServiceImpl(str, str2, map);
        }
        WXInitDelayTask.getInstance().addDelayTask(new b(str, str2, map));
        return true;
    }

    public static void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[0]);
            return;
        }
        hbe hbeVar = mRemoteImpl;
        if (hbeVar != null) {
            hbeVar.reloadImpl();
        }
    }

    public static void setActivityNavBarSetter(heb hebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6943fc", new Object[]{hebVar});
        } else {
            WXSDKManager.getInstance().setActivityNavBarSetter(hebVar);
        }
    }

    public static boolean registerComponent(Map<String, Object> map, Class<? extends WXComponent> cls) throws WXException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("763b8f7d", new Object[]{map, cls})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = (String) map.get("type");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return registerComponent(str, new SimpleComponentHolder(cls), map);
    }

    @Override // tb.nid
    public hbe getImpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hbe) ipChange.ipc$dispatch("cf8b02e", new Object[]{this}) : mRemoteImpl;
    }

    public void setImpl(hbe hbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfce518", new Object[]{this, hbeVar});
        } else {
            mRemoteImpl = hbeVar;
        }
    }

    public static boolean registerModule(String str, Class<? extends WXModule> cls) throws WXException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("51e31701", new Object[]{str, cls})).booleanValue() : registerModule(str, (Class) cls, false);
    }

    public static boolean registerComponent(String str, IFComponentHolder iFComponentHolder, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2b7f55b", new Object[]{str, iFComponentHolder, map})).booleanValue();
        }
        hbe hbeVar = mRemoteImpl;
        if (hbeVar != null) {
            return hbeVar.registerComponent(str, iFComponentHolder, map);
        }
        WXInitDelayTask.getInstance().addDelayTask(new c(str, iFComponentHolder, map));
        return true;
    }

    public static <T extends WXModule> boolean registerModule(String str, Class<T> cls, boolean z) throws WXException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ea807b7b", new Object[]{str, cls, new Boolean(z)})).booleanValue() : cls != null && registerModule(str, new TypeModuleFactory(cls), z);
    }

    public static boolean registerComponent(String str, Class<? extends WXComponent> cls, boolean z) throws WXException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e20d0f26", new Object[]{str, cls, new Boolean(z)})).booleanValue() : registerComponent(cls, z, str);
    }

    public static boolean registerComponent(String str, IExternalComponentGetter iExternalComponentGetter, boolean z) throws WXException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4318f6f6", new Object[]{str, iExternalComponentGetter, new Boolean(z)})).booleanValue() : registerComponent(new ExternalLoaderComponentHolder(str, iExternalComponentGetter), z, str);
    }

    public static boolean registerComponent(Class<? extends WXComponent> cls, boolean z, String... strArr) throws WXException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4038840b", new Object[]{cls, new Boolean(z), strArr})).booleanValue();
        }
        if (cls == null) {
            return false;
        }
        return registerComponent(new SimpleComponentHolder(cls), z, strArr);
    }

    public static boolean registerComponent(IFComponentHolder iFComponentHolder, boolean z, String... strArr) throws WXException {
        Throwable th;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1c0f033", new Object[]{iFComponentHolder, new Boolean(z), strArr})).booleanValue();
        }
        try {
            boolean z3 = true;
            for (String str : strArr) {
                try {
                    HashMap hashMap = new HashMap();
                    if (z) {
                        hashMap.put("append", "tree");
                    }
                    z3 = z3 && registerComponent(str, iFComponentHolder, hashMap);
                } catch (Throwable th2) {
                    th = th2;
                    z2 = z3;
                    th.printStackTrace();
                    return z2;
                }
            }
            return z3;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
