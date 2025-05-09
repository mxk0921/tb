package com.taobao.android.turbo.subpage.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.trade.event.OpenSimplePopupSubscriber;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.service.BaseServiceDelegate;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.android.turbo.subpage.component.dx.DxContainer;
import com.taobao.android.turbo.subpage.component.dx.DxVideoControlHelper;
import com.taobao.android.turbo.subpage.component.dx.TheaterCardAnimAbility;
import com.taobao.android.turbo.subpage.component.dx.a;
import com.taobao.android.turbo.subpage.component.dx.b;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.tao.infoflow.multitab.nativetab.NativeContainerProvider;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.lpb;
import tb.mqu;
import tb.nuo;
import tb.r6o;
import tb.t2o;
import tb.tpu;
import tb.ud0;
import tb.xa2;
import tb.xyo;
import tb.y7;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00015BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010 \u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J%\u0010$\u001a\u00020\u00142\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0003H\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010+\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b+\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00100¨\u00066"}, d2 = {"Lcom/taobao/android/turbo/subpage/component/DXSubPageComponent;", "Lcom/taobao/android/turbo/core/subpage/BaseSubPageComponent;", "Lcom/taobao/android/turbo/model/TabModel;", "Landroid/view/ViewGroup;", "Lcom/taobao/android/turbo/core/component/BaseOuterComponent$OuterComponentType;", OpenSimplePopupSubscriber.KEY_COMPONENT_TYPE, "", "componentId", "Landroid/content/Context;", "context", "", "host", "pageURL", "engineId", "Lcom/taobao/android/turbo/core/service/BaseServiceDelegate;", "serviceDelegate", "<init>", "(Lcom/taobao/android/turbo/core/component/BaseOuterComponent$OuterComponentType;Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/android/turbo/core/service/BaseServiceDelegate;)V", "Lcom/alibaba/fastjson/JSONObject;", "newParams", "Ltb/xhv;", "updateUrlParams", "(Lcom/alibaba/fastjson/JSONObject;)V", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "sureVersion", "()Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "", "getContainerSize", "()[I", "data", "Lcom/taobao/android/turbo/core/component/IComponentLifecycle$TriggerType;", "triggerType", "onCreate", "(Lcom/taobao/android/turbo/model/TabModel;Lcom/taobao/android/turbo/core/component/IComponentLifecycle$TriggerType;)V", "", "args", "onRefresh", "(Ljava/util/Map;)V", "createViewImpl", "()Landroid/view/ViewGroup;", "onResume", "(Lcom/taobao/android/turbo/core/component/IComponentLifecycle$TriggerType;)V", "onPause", "onDestroy", "Lcom/taobao/android/turbo/subpage/component/dx/DxContainer;", NativeContainerProvider.DX_CONTAINER, "Lcom/taobao/android/turbo/subpage/component/dx/DxContainer;", DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS, "Lcom/alibaba/fastjson/JSONObject;", "container", "Landroid/view/ViewGroup;", "pendingParams", "Companion", "a", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DXSubPageComponent extends BaseSubPageComponent<TabModel, ViewGroup> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "DXSubPageComponent";
    private ViewGroup container;
    private DxContainer dxContainer;
    private JSONObject pendingParams;
    private JSONObject urlParams;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455711);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455710);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXSubPageComponent(BaseOuterComponent.OuterComponentType outerComponentType, String str, Context context, Object obj, String str2, String str3, BaseServiceDelegate baseServiceDelegate) {
        super(outerComponentType, str, context, obj, str2, str3, baseServiceDelegate);
        ckf.g(outerComponentType, OpenSimplePopupSubscriber.KEY_COMPONENT_TYPE);
        ckf.g(str, "componentId");
        ckf.g(context, "context");
        ckf.g(str2, "pageURL");
        ckf.g(str3, "engineId");
        ckf.g(baseServiceDelegate, "serviceDelegate");
    }

    public static final /* synthetic */ ViewGroup access$getContainer$p(DXSubPageComponent dXSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("55fb940a", new Object[]{dXSubPageComponent});
        }
        return dXSubPageComponent.container;
    }

    public static final /* synthetic */ DxContainer access$getDxContainer$p(DXSubPageComponent dXSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DxContainer) ipChange.ipc$dispatch("21bc66a8", new Object[]{dXSubPageComponent});
        }
        return dXSubPageComponent.dxContainer;
    }

    public static final /* synthetic */ JSONObject access$getPendingParams$p(DXSubPageComponent dXSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("259d51cf", new Object[]{dXSubPageComponent});
        }
        return dXSubPageComponent.pendingParams;
    }

    public static final /* synthetic */ void access$setContainer$p(DXSubPageComponent dXSubPageComponent, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c3514f6", new Object[]{dXSubPageComponent, viewGroup});
        } else {
            dXSubPageComponent.container = viewGroup;
        }
    }

    public static final /* synthetic */ void access$setDxContainer$p(DXSubPageComponent dXSubPageComponent, DxContainer dxContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d09678e", new Object[]{dXSubPageComponent, dxContainer});
        } else {
            dXSubPageComponent.dxContainer = dxContainer;
        }
    }

    public static final /* synthetic */ void access$setPendingParams$p(DXSubPageComponent dXSubPageComponent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a38b995", new Object[]{dXSubPageComponent, jSONObject});
        } else {
            dXSubPageComponent.pendingParams = jSONObject;
        }
    }

    private final int[] getContainerSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("85cabc51", new Object[]{this});
        }
        r6o.a aVar = r6o.Companion;
        return new int[]{aVar.h(getContext()), aVar.e(getContext())};
    }

    public static /* synthetic */ Object ipc$super(DXSubPageComponent dXSubPageComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -560092455:
                super.onDestroy((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -258772824:
                super.onResume((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -128189347:
                super.onCreate((DXSubPageComponent) objArr[0], (IComponentLifecycle$TriggerType) objArr[1]);
                return null;
            case 1484435997:
                super.onPause((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/subpage/component/DXSubPageComponent");
        }
    }

    private final DXTemplateItem sureVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("ebd8a7f5", new Object[]{this});
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        lpb b = ud0.Companion.b();
        dXTemplateItem.f7343a = "tb_gg_theater_main";
        dXTemplateItem.b = mqu.Companion.g(b.b("AB_theater.dx_config.dx_version", "196"), 196L);
        dXTemplateItem.c = (String) b.b("AB_theater.dx_config.dx_url", "https://dinamicx.alibabausercontent.com/l_pub/tb_gg_theater_main/1710833547668/tb_gg_theater_main.zip");
        return dXTemplateItem;
    }

    private final void updateUrlParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7261c5bd", new Object[]{this, jSONObject});
        } else if (jSONObject.isEmpty() || ckf.b(jSONObject, this.urlParams)) {
            tpu.a.b(tpu.Companion, TAG, "empty or same params", null, 4, null);
        } else {
            this.urlParams = jSONObject;
            DxContainer dxContainer = this.dxContainer;
            ckf.d(dxContainer);
            DinamicXEngine s = dxContainer.s();
            if (s != null) {
                DxContainer dxContainer2 = this.dxContainer;
                ckf.d(dxContainer2);
                s.r("refreshUrlParams", dxContainer2.r(), jSONObject, null, null);
                return;
            }
            this.pendingParams = jSONObject;
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, TAG, "dinamicXEngine is null, pending params: " + this.pendingParams, null, 4, null);
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onPause(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587ab21d", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onPause(iComponentLifecycle$TriggerType);
        DxContainer dxContainer = this.dxContainer;
        if (dxContainer != null) {
            dxContainer.y();
        }
        DxVideoControlHelper.c s = DxVideoControlHelper.s(this.container);
        if (s != null) {
            s.a();
        }
    }

    @Override // com.taobao.android.turbo.core.subpage.BaseSubPageComponent
    public void onRefresh(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ff6aa2", new Object[]{this, map});
        } else {
            updateUrlParams(new JSONObject(map));
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onResume(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09370a8", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onResume(iComponentLifecycle$TriggerType);
        DxContainer dxContainer = this.dxContainer;
        if (dxContainer != null) {
            dxContainer.x();
        }
        DxVideoControlHelper.c s = DxVideoControlHelper.s(this.container);
        if (s != null) {
            s.appear();
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public ViewGroup createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("eb9b458d", new Object[]{this});
        }
        DxContainer.b bVar = new DxContainer.b();
        bVar.a().put((JSONObject) "containerType", "tnode");
        bVar.a().put((JSONObject) "enableBgImage", "true");
        bVar.a().put((JSONObject) "enableScrollToPositionTop", "true");
        if (this.urlParams != null) {
            bVar.a().put((JSONObject) DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS, (String) this.urlParams);
        }
        int[] containerSize = getContainerSize();
        DXTemplateItem sureVersion = sureVersion();
        DxContainer dxContainer = this.dxContainer;
        ckf.d(dxContainer);
        int i = containerSize[1];
        int i2 = containerSize[0];
        String str = sureVersion.f7343a;
        ckf.f(str, "targetItem.name");
        long j = sureVersion.b;
        String str2 = sureVersion.c;
        ckf.f(str2, "targetItem.templateUrl");
        View n = dxContainer.n(i, i2, str, j, str2, bVar, null, new DXSubPageComponent$createViewImpl$1(this));
        if (n != null) {
            ViewGroup viewGroup = (ViewGroup) n;
            this.container = viewGroup;
            return viewGroup;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public void onCreate(TabModel tabModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9183789a", new Object[]{this, tabModel, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onCreate((DXSubPageComponent) tabModel, iComponentLifecycle$TriggerType);
        if (tabModel != null) {
            nuo initSchedulerMessage = getInitSchedulerMessage(tabModel.getId());
            if ((initSchedulerMessage != null ? initSchedulerMessage.a() : null) != null) {
                this.urlParams = new JSONObject(initSchedulerMessage.a());
            }
        }
        if (this.dxContainer == null) {
            this.dxContainer = DxContainer.Companion.a(getContext(), "guangguang", "guangguang", "DX");
        }
        DxContainer dxContainer = this.dxContainer;
        ckf.d(dxContainer);
        dxContainer.l();
        DxContainer dxContainer2 = this.dxContainer;
        ckf.d(dxContainer2);
        dxContainer2.v();
        DxContainer dxContainer3 = this.dxContainer;
        ckf.d(dxContainer3);
        DinamicXEngine s = dxContainer3.s();
        if (s != null) {
            y7 v = s.v();
            ckf.f(v, "dinamicXEngine.abilityEngine");
            v.i(String.valueOf((long) xa2.BINDMULTITABVIDEOCONTROL), new xa2.a());
            v.i(String.valueOf((long) TheaterCardAnimAbility.THEATERCARDANIM), new TheaterCardAnimAbility.a());
            v.i(String.valueOf((long) b.THEATERCARDANIMSTART), new b.a());
            v.i(String.valueOf((long) com.taobao.android.turbo.subpage.component.dx.a.THEATERCARDANIMCLEAR), new a.C0507a());
            v.i(String.valueOf((long) xyo.SCROLLTOPOSITIONTOP), new xyo.b());
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onDestroy(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9daad9", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onDestroy(iComponentLifecycle$TriggerType);
        DxContainer dxContainer = this.dxContainer;
        if (dxContainer != null) {
            dxContainer.w(1);
        }
    }
}
