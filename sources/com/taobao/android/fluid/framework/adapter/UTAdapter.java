package com.taobao.android.fluid.framework.adapter;

import android.app.Activity;
import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.g2e;
import tb.qau;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UTAdapter implements IUTAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private g2e trackTint;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UTHitBuilders$UTControlHitBuilder f7759a;

        public a(UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder) {
            this.f7759a = uTHitBuilders$UTControlHitBuilder;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                UTAnalytics.getInstance().getDefaultTracker().send(this.f7759a.build());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UTOriginalCustomHitBuilder f7760a;

        public b(UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder) {
            this.f7760a = uTOriginalCustomHitBuilder;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                UTAnalytics.getInstance().getDefaultTracker().send(this.f7760a.build());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UTOriginalCustomHitBuilder f7761a;

        public c(UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder) {
            this.f7761a = uTOriginalCustomHitBuilder;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                UTAnalytics.getInstance().getDefaultTracker().send(this.f7761a.build());
            }
        }
    }

    static {
        t2o.a(468713822);
        t2o.a(468713817);
    }

    private Map addTintProperties(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c83cf624", new Object[]{this, map});
        }
        g2e g2eVar = this.trackTint;
        if (g2eVar == null) {
            g2eVar = qau.s();
        }
        if (g2eVar != null) {
            if (map == null) {
                map = new HashMap();
            }
            map.putAll(g2eVar.e());
        }
        return map;
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAdapter
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return IUTAdapter.ADAPTER_NAME;
    }

    @Override // com.taobao.android.fluid.framework.adapter.IUTAdapter
    public Map<String, String> getPageAllProperties(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ea4a06bd", new Object[]{this, activity});
        }
        return UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(activity);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IUTAdapter
    public void pageAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52025aa7", new Object[]{this, obj});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageAppear(obj);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IUTAdapter
    public void pageAppearDoNotSkip(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0277a6", new Object[]{this, obj});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(obj);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IUTAdapter
    public void pageDisAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f29b97", new Object[]{this, obj});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(obj);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IUTAdapter
    public void skipPage(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ec0ed1", new Object[]{this, obj});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().skipPage(obj);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IUTAdapter
    public void track4Click(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b70f26b", new Object[]{this, str, str2, map});
            return;
        }
        Map<String, String> addTintProperties = addTintProperties(map);
        UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(str, str2);
        uTHitBuilders$UTControlHitBuilder.setProperties(addTintProperties);
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.c(new a(uTHitBuilders$UTControlHitBuilder));
    }

    @Override // com.taobao.android.fluid.framework.adapter.IUTAdapter
    public void track4Show(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9fba64", new Object[]{this, str, str2, map});
        } else {
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.c(new b(new UTOriginalCustomHitBuilder(str, 2201, str2, "", "0", addTintProperties(map))));
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IUTAdapter
    public void track4Show2202(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77b55ee2", new Object[]{this, str, str2, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2202, str2, "", "0", addTintProperties(map)).build());
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IUTAdapter
    public void trackCustom(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60e9531", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
        } else {
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.c(new c(new UTOriginalCustomHitBuilder(str, i, str2, str3, str4, addTintProperties(map))));
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IUTAdapter
    public void updateNextPageUtParam(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b002a09b", new Object[]{this, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(map));
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IUTAdapter
    public void updatePageName(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be12fe50", new Object[]{this, obj, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(obj, str);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IUTAdapter
    public void updatePageProperties(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{this, obj, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, addTintProperties(map));
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IUTAdapter
    public void updatePageUrl(Object obj, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db943cd", new Object[]{this, obj, uri});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageUrl(obj, uri);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IUTAdapter
    public IUTAdapter withFluidContext(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUTAdapter) ipChange.ipc$dispatch("11a2e25", new Object[]{this, fluidContext});
        }
        if (fluidContext != null) {
            this.trackTint = ((ITrackService) fluidContext.getService(ITrackService.class)).getTrackTint();
        }
        return this;
    }

    @Override // com.taobao.android.fluid.framework.adapter.IUTAdapter
    public void updateNextPageUtParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac44f4", new Object[]{this, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(str);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IUTAdapter
    public void trackCustom(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d98bbee", new Object[]{this, str, str2, map});
            return;
        }
        Map<String, String> addTintProperties = addTintProperties(map);
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder(str2);
        uTHitBuilders$UTCustomHitBuilder.setEventPage(str);
        uTHitBuilders$UTCustomHitBuilder.setProperties(addTintProperties);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }
}
