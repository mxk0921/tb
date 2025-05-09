package com.taobao.appbundle;

import android.app.Application;
import android.content.SharedPreferences;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.android.task.Coordinator;
import com.taobao.appbundle.a;
import com.taobao.appbundle.runtime.ModuleDependencyUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.acq;
import tb.bcq;
import tb.mcq;
import tb.t2o;
import tb.u58;
import tb.xcq;
import tb.yq0;
import tb.z30;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b extends z30 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final List<String> f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f10053a;

        public a(List list) {
            this.f10053a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (String str : this.f10053a) {
                a.C0529a aVar = com.taobao.appbundle.a.Companion;
                if (aVar.a().h() != null && !aVar.a().h().f().contains(str)) {
                    try {
                        bcq.a().g(aVar.a().d(), false, str);
                        if (Localization.n()) {
                            aVar.a().h().c(xcq.c().l(str).o(true).n());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.appbundle.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class RunnableC0530b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0530b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (com.taobao.appbundle.a.Companion.a().h() != null) {
                for (String str : b.d()) {
                    b.f(str);
                }
            }
        }
    }

    public static /* synthetic */ List d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("54cf0df0", new Object[0]);
        }
        return f;
    }

    public static void e(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            SharedPreferences sharedPreferences = application.getSharedPreferences("dynamic_features_config", 0);
            if (sharedPreferences.getBoolean("deffered_download_feature_enabled_" + application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName, true)) {
                com.taobao.appbundle.a.Companion.a().q();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d82f6acf", new Object[]{str});
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (BundleInfoManager.instance().getDynamicFeatureInfo(str) != null) {
            arrayList.add(str);
            arrayList.addAll(ModuleDependencyUtils.getDependencies(str));
            if (!mcq.a().a().containsAll(arrayList)) {
                try {
                    acq.p().g(com.taobao.appbundle.a.Companion.a().d(), false, (String[]) arrayList.toArray(new String[0]));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/appbundle/Launcher4TriggerDownload");
    }

    @Override // tb.z30
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22cd2c69", new Object[]{this});
        } else {
            b();
        }
    }

    @Override // tb.z30
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd860793", new Object[]{this});
        } else {
            Coordinator.execute(new RunnableC0530b());
        }
    }

    @Override // tb.z30
    public void c(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de39e3ee", new Object[]{this, list});
        } else {
            Coordinator.execute(new a(list));
        }
    }

    @Override // tb.al9.c
    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
        }
    }

    @Override // tb.al9.c
    public void onForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
        }
    }

    static {
        t2o.a(377487374);
        t2o.a(676331532);
        t2o.a(676331533);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        f = arrayList;
        arrayList.add(com.taobao.appbundle.a.TAOPAI_FEATURE);
        arrayList.add(u58.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC);
        arrayList.add("order_remote");
        arrayList.add(yq0.PRELOAD_LITE_DETAIL_FEATURE_NAME);
        arrayList.add("liteCreator");
        arrayList.add("taobao_weex_adapter");
        arrayList.add(u58.DYNAMIC_NAME_TAOBAO_ANDROID_ADDRESS_DYNAMIC);
        arrayList.add("taobao_favorite_aar");
    }
}
