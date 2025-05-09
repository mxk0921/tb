package com.taobao.android.turbo;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.hostcontainer.tnode.component.VideoListSubPageComponent;
import com.taobao.android.fluid.framework.hostcontainer.tnode.component.VideoTabConfig;
import com.taobao.android.fluid.framework.preload.impl.VideoPreload;
import com.taobao.android.tab2liveroom.liveroom.LivePreload;
import com.taobao.android.tab2liveroom.liveroom.LiveSubPageComponent;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.service.BaseServiceDelegate;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.android.turbo.subpage.component.DXSubPageComponent;
import com.taobao.android.turbo.subpage.component.TNodeSubPageComponent;
import com.taobao.android.turbo.subpage.component.WeexSubPageComponent;
import com.taobao.tab2interact.pageadapter.guangguang.turbo.GGInteractContainerComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.a5h;
import tb.ckf;
import tb.htd;
import tb.j12;
import tb.qpu;
import tb.r12;
import tb.s4d;
import tb.t2o;
import tb.tpu;
import tb.vaj;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0011\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ[\u0010\u001f\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J)\u0010!\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"JS\u0010%\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010$2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010)2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/taobao/android/turbo/Tab2OuterInstanceRegistry;", "Ltb/s4d;", "<init>", "()V", "Lcom/taobao/android/turbo/core/component/BaseOuterComponent$OuterComponentType;", "type", "", "outComponentId", "Landroid/content/Context;", "context", "", "host", "url", "instanceId", "Lcom/taobao/android/turbo/core/service/BaseServiceDelegate;", "serviceDelegate", "Lcom/taobao/android/turbo/core/subpage/BaseSubPageComponent;", "getLiveComponent", "(Lcom/taobao/android/turbo/core/component/BaseOuterComponent$OuterComponentType;Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/android/turbo/core/service/BaseServiceDelegate;)Lcom/taobao/android/turbo/core/subpage/BaseSubPageComponent;", "Ltb/qpu;", "engineContext", vaj.KEY_TAB_ID, "Ltb/htd;", "getLivePreload", "(Ltb/qpu;Ljava/lang/String;)Ltb/htd;", "Lcom/taobao/android/turbo/model/TabModel;", "tabModel", "Ltb/r12;", "getTabConfig", "(Lcom/taobao/android/turbo/model/TabModel;)Ltb/r12;", "subPageType", "getSubPageComponent", "(Ljava/lang/String;Lcom/taobao/android/turbo/core/component/BaseOuterComponent$OuterComponentType;Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/android/turbo/core/service/BaseServiceDelegate;)Lcom/taobao/android/turbo/core/subpage/BaseSubPageComponent;", "getSubPagePreload", "(Ljava/lang/String;Ltb/qpu;Ljava/lang/String;)Ltb/htd;", "componentId", "Lcom/taobao/android/turbo/core/component/BaseOuterComponent;", "getOuterComponentClasses", "(Lcom/taobao/android/turbo/core/component/BaseOuterComponent$OuterComponentType;Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/android/turbo/core/service/BaseServiceDelegate;)Lcom/taobao/android/turbo/core/component/BaseOuterComponent;", "Lcom/taobao/android/turbo/core/subpage/BaseSubPageComponent$SubPageModel;", "subPageModel", "Ltb/j12;", "getSubPageConfig", "(Lcom/taobao/android/turbo/core/subpage/BaseSubPageComponent$SubPageModel;)Ltb/j12;", "", "tabConfigMap", "Ljava/util/Map;", "Companion", "a", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class Tab2OuterInstanceRegistry implements s4d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final String TAG = "Tab2OuterInstanceRegistry";
    private final Map<String, r12> tabConfigMap = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455428);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455427);
        t2o.a(919601362);
    }

    private final r12 getTabConfig(TabModel tabModel) {
        r12 r12Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r12) ipChange.ipc$dispatch("7b8804b7", new Object[]{this, tabModel});
        }
        String id = tabModel.getId();
        String type = tabModel.getType();
        r12 r12Var2 = this.tabConfigMap.get(id);
        if (r12Var2 != null) {
            return r12Var2;
        }
        int hashCode = type.hashCode();
        if (hashCode != 3322092) {
            if (hashCode != 112202875 || !type.equals("video")) {
                return null;
            }
            r12Var = new VideoTabConfig(tabModel);
        } else if (!type.equals("live")) {
            return null;
        } else {
            r12Var = new a5h(tabModel);
        }
        this.tabConfigMap.put(id, r12Var);
        return r12Var;
    }

    @Override // tb.s4d
    public j12<?> getSubPageConfig(BaseSubPageComponent.SubPageModel subPageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j12) ipChange.ipc$dispatch("628c129", new Object[]{this, subPageModel});
        }
        ckf.g(subPageModel, "subPageModel");
        if (subPageModel instanceof TabModel) {
            return getTabConfig((TabModel) subPageModel);
        }
        return null;
    }

    @Override // tb.s4d
    public htd getSubPagePreload(String str, qpu qpuVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (htd) ipChange.ipc$dispatch("4d14b99", new Object[]{this, str, qpuVar, str2});
        }
        ckf.g(str, "type");
        ckf.g(qpuVar, "engineContext");
        ckf.g(str2, vaj.KEY_TAB_ID);
        int hashCode = str.hashCode();
        if (hashCode != 3322092) {
            if (hashCode == 112202875 && str.equals("video")) {
                return new VideoPreload(qpuVar, str2);
            }
        } else if (str.equals("live")) {
            return getLivePreload(qpuVar, str2);
        }
        return null;
    }

    private final htd getLivePreload(qpu qpuVar, String str) {
        try {
            IpChange ipChange = LivePreload.$ipChange;
            Object newInstance = LivePreload.class.getConstructor(qpu.class, String.class).newInstance(qpuVar, str);
            if (newInstance != null) {
                return (htd) newInstance;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.turbo.core.subpage.ISubPagePreload");
        } catch (Exception e) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, TAG, "load live preload error, " + e.getMessage(), null, 4, null);
            return null;
        }
    }

    private final BaseSubPageComponent<?, ?> getLiveComponent(BaseOuterComponent.OuterComponentType outerComponentType, String str, Context context, Object obj, String str2, String str3, BaseServiceDelegate baseServiceDelegate) {
        try {
            IpChange ipChange = LiveSubPageComponent.$ipChange;
            Object newInstance = LiveSubPageComponent.class.getConstructor(BaseOuterComponent.OuterComponentType.class, String.class, Context.class, Object.class, String.class, String.class, BaseServiceDelegate.class).newInstance(outerComponentType, str, context, obj, str2, str3, baseServiceDelegate);
            if (newInstance != null) {
                return (BaseSubPageComponent) newInstance;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.turbo.core.subpage.BaseSubPageComponent<*, *>");
        } catch (Exception e) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, TAG, "load live error, " + e.getMessage(), null, 4, null);
            return null;
        }
    }

    @Override // tb.s4d
    public BaseOuterComponent<?, ?> getOuterComponentClasses(BaseOuterComponent.OuterComponentType outerComponentType, String str, Context context, Object obj, String str2, String str3, BaseServiceDelegate baseServiceDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseOuterComponent) ipChange.ipc$dispatch("ca4e0347", new Object[]{this, outerComponentType, str, context, obj, str2, str3, baseServiceDelegate});
        }
        ckf.g(outerComponentType, "type");
        ckf.g(str, "componentId");
        ckf.g(context, "context");
        ckf.g(str2, "url");
        ckf.g(str3, "instanceId");
        ckf.g(baseServiceDelegate, "serviceDelegate");
        if (outerComponentType == BaseOuterComponent.OuterComponentType.INTERACT_CONTAINER) {
            return new GGInteractContainerComponent(outerComponentType, str, context, obj, str2, str3, baseServiceDelegate);
        }
        return null;
    }

    @Override // tb.s4d
    public BaseSubPageComponent<?, ?> getSubPageComponent(String str, BaseOuterComponent.OuterComponentType outerComponentType, String str2, Context context, Object obj, String str3, String str4, BaseServiceDelegate baseServiceDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSubPageComponent) ipChange.ipc$dispatch("f13d56cd", new Object[]{this, str, outerComponentType, str2, context, obj, str3, str4, baseServiceDelegate});
        }
        ckf.g(str, "subPageType");
        ckf.g(outerComponentType, "type");
        ckf.g(str2, "outComponentId");
        ckf.g(context, "context");
        ckf.g(str3, "url");
        ckf.g(str4, "instanceId");
        ckf.g(baseServiceDelegate, "serviceDelegate");
        switch (str.hashCode()) {
            case 3220:
                if (str.equals("dx")) {
                    return new DXSubPageComponent(outerComponentType, str2, context, obj, str3, str4, baseServiceDelegate);
                }
                break;
            case 3322092:
                if (str.equals("live")) {
                    return getLiveComponent(outerComponentType, str2, context, obj, str3, str4, baseServiceDelegate);
                }
                break;
            case 3386882:
                if (str.equals("node")) {
                    return new TNodeSubPageComponent(outerComponentType, str2, context, obj, str3, str4, baseServiceDelegate);
                }
                break;
            case 3645441:
                if (str.equals("weex")) {
                    return new WeexSubPageComponent(outerComponentType, str2, context, obj, str3, str4, baseServiceDelegate);
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    return new VideoListSubPageComponent(outerComponentType, str2, context, obj, str3, str4, baseServiceDelegate);
                }
                break;
        }
        return null;
    }
}
