package tb;

import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dressup.common.model.CardModel;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class vo1 extends sg5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String h = "BannerComponent";
    public boolean i;
    public boolean j;
    public int k;
    public final int l;
    public DXTemplateItem m;
    public final qpu n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements e1c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.e1c
        public void onScrollStateChanged(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e409bdce", new Object[]{this, viewGroup, new Integer(i)});
                return;
            }
            tpu.a aVar = tpu.Companion;
            String D = vo1.D(vo1.this);
            tpu.a.b(aVar, D, "DressBanner onScrollStateChanged p0" + viewGroup + " newState:" + i, null, 4, null);
        }

        @Override // tb.e1c
        public void onScrolled(ViewGroup viewGroup, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7f64c91", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
                return;
            }
            tpu.a aVar = tpu.Companion;
            String D = vo1.D(vo1.this);
            tpu.a.b(aVar, D, "DressBanner onScrollStateChanged p0" + viewGroup + " dx:" + i + " dy:" + i2, null, 4, null);
        }
    }

    static {
        t2o.a(918552825);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo1(qpu qpuVar) {
        super(qpuVar);
        Integer num;
        ckf.g(qpuVar, "engineContext");
        this.n = qpuVar;
        t5d t5dVar = (t5d) qpuVar.getService(t5d.class);
        Object G = t5dVar.G("bannerComponentIndex");
        Integer num2 = (Integer) (!(G instanceof Integer) ? null : G);
        if (num2 == null) {
            num = 1;
        } else {
            num = Integer.valueOf(num2.intValue() + 1);
        }
        t5dVar.A("bannerComponentIndex", num);
        int intValue = num.intValue();
        this.l = intValue;
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "BannerComponent", "dBannerRefresh-init:component:" + intValue + ":refresh:" + this.k, null, 4, null);
    }

    public static final /* synthetic */ String D(vo1 vo1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba28e50f", new Object[]{vo1Var});
        }
        return vo1Var.h;
    }

    public static /* synthetic */ Object ipc$super(vo1 vo1Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1312640741:
                super.onCreate((CardModel) objArr[0], (IComponentLifecycle$TriggerType) objArr[1]);
                return null;
            case 677627874:
                super.y((DXTemplateItem) objArr[0], (l18) objArr[1]);
                return null;
            case 1381928840:
                super.updateDataImpl((CardModel) objArr[0]);
                return null;
            case 1484435997:
                super.onPause((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/feeds/component/BannerComponent");
        }
    }

    @Override // tb.sg5
    /* renamed from: C */
    public void updateDataImpl(CardModel cardModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("525e8f88", new Object[]{this, cardModel});
            return;
        }
        ckf.g(cardModel, "data");
        if (!kz7.a() || !ud0.Companion.b().a("dress_banner_single_root_view")) {
            super.updateDataImpl(cardModel);
        } else {
            I(cardModel);
        }
    }

    public final void G(l18 l18Var) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce2f7cb", new Object[]{this, l18Var});
        } else if (!kz7.a()) {
        } else {
            if (ud0.Companion.b().a("dress_show_banner_debug_info")) {
                if (!(l18Var == null || (a2 = l18Var.a()) == null)) {
                    a2.put("debugAppThenShowBannerDebugInfo", (Object) Boolean.TRUE);
                }
                tpu.a.b(tpu.Companion, this.h, "Debug包:renderDXTemplateDebugInfo:调试信息:已经追加 debugAppThenShowBannerDebugInfo 标识。", null, 4, null);
                return;
            }
            tpu.a.b(tpu.Companion, this.h, "Debug包:renderDXTemplateDebugInfo:调试信息:禁止追加 debugAppThenShowBannerDebugInfo 标识。", null, 4, null);
        }
    }

    public final void L(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c8f47c", new Object[]{this, new Boolean(z)});
            return;
        }
        String str = "banner_component_" + this.l;
        JSONObject a2 = cz7.INSTANCE.a(o());
        if (a2 == null) {
            tpu.a.b(tpu.Companion, this.h, "dBannerRefresh-setDirty-异常退出:无有效originData:bannerComponentToken:" + str + ":不更新脏标:isCache:" + z, null, 4, null);
            return;
        }
        JSONObject jSONObject = a2.getJSONObject(cz7.PAGE_DATA_KEY_PAGE_CACHE_BANNER_DATA_IS_DIRTY_JSON);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            tpu.a.b(tpu.Companion, this.h, "dBannerRefresh-setDirty-字典准备:bannerComponentToken:" + str + ":isCache:" + z, null, 4, null);
            a2.put((JSONObject) cz7.PAGE_DATA_KEY_PAGE_CACHE_BANNER_DATA_IS_DIRTY_JSON, (String) jSONObject);
        }
        Boolean bool = jSONObject.getBoolean(str);
        Boolean bool2 = Boolean.TRUE;
        if (ckf.b(bool, bool2)) {
            tpu.a.b(tpu.Companion, this.h, "dBannerRefresh-setDirty-脏数退出:Banner数据已使用过:bannerComponentToken:" + str + ":不更新脏标:isCache:" + z, null, 4, null);
            return;
        }
        jSONObject.put((JSONObject) str, (String) bool2);
        tpu.a.b(tpu.Companion, this.h, "dBannerRefresh-setDirty-普通数据:Banner数据还未用过:bannerComponentToken:" + str + ":已设置脏标:isCache:" + z, null, 4, null);
    }

    public final void a(DXTemplateItem dXTemplateItem, l18 l18Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aaa165", new Object[]{this, dXTemplateItem, l18Var});
        } else {
            super.y(dXTemplateItem, l18Var);
        }
    }

    public final void b(DXTemplateItem dXTemplateItem, l18 l18Var, int i) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e67035d", new Object[]{this, dXTemplateItem, l18Var, new Integer(i)});
            return;
        }
        DXRootView v = v();
        if (v != null) {
            num = Integer.valueOf(v.hashCode());
        } else {
            num = null;
        }
        if (this.j) {
            tpu.a aVar = tpu.Companion;
            String str = this.h;
            tpu.a.b(aVar, str, "dBannerRefresh_缓存:忽略:component:" + this.l + ":refresh:" + this.k + ":获取到了Banner缓存数据。正式数据已刷新过，忽略本次缓存数据。resultArrSize:" + i + " hasRender:" + this.i + " dxRootViewCode:" + num, null, 4, null);
        } else if (!this.i) {
            L(true);
            tpu.a aVar2 = tpu.Companion;
            String str2 = this.h;
            tpu.a.b(aVar2, str2, "dBannerRefresh_缓存:首刷:component:" + this.l + ":refresh:" + this.k + ":获取到了Banner缓存数据。即将进行Banner渲染。resultArrSize:" + i + " hasRender:" + this.i + " dxRootViewCode:" + num, null, 4, null);
            this.i = true;
            a(dXTemplateItem, l18Var);
            this.m = dXTemplateItem;
        } else if (H(true)) {
            tpu.a aVar3 = tpu.Companion;
            String str3 = this.h;
            tpu.a.b(aVar3, str3, "dBannerRefresh_缓存:再刷:component:" + this.l + ":refresh:" + this.k + ":获取到了Banner缓存数据。refreshing刷新中，即将进行Banner渲染。resultArrSize:" + i + " hasRender:" + this.i + " dxRootViewCode:" + num, null, 4, null);
            this.i = true;
            a(dXTemplateItem, l18Var);
            this.m = dXTemplateItem;
        } else {
            tpu.a aVar4 = tpu.Companion;
            String str4 = this.h;
            tpu.a.b(aVar4, str4, "dBannerRefresh_缓存:忽略:component:" + this.l + ":refresh:" + this.k + ":获取到了Banner缓存数据。缓存已刷新过且非Refreshing动作，忽略本次缓存数据。resultArrSize:" + i + " hasRender:" + this.i + " dxRootViewCode:" + num, null, 4, null);
        }
    }

    public final void c(DXTemplateItem dXTemplateItem, l18 l18Var, int i) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2ef9407", new Object[]{this, dXTemplateItem, l18Var, new Integer(i)});
            return;
        }
        DXRootView v = v();
        if (v != null) {
            num = Integer.valueOf(v.hashCode());
        } else {
            num = null;
        }
        if (!this.j) {
            L(false);
            tpu.a aVar = tpu.Companion;
            String str = this.h;
            tpu.a.b(aVar, str, "dBannerRefresh_正式:二刷:component:" + this.l + ":refresh:" + this.k + ":缓存刷新过:获取到了Banner正式数据。即将进行Banner渲染。resultArrSize:" + i + " hasRender:" + this.i + " dxRootViewCode:" + num, null, 4, null);
            this.j = true;
            a(dXTemplateItem, l18Var);
            this.m = dXTemplateItem;
        } else if (H(false)) {
            tpu.a aVar2 = tpu.Companion;
            String str2 = this.h;
            tpu.a.b(aVar2, str2, "dBannerRefresh_正式:再刷:component:" + this.l + ":refresh:" + this.k + ":获取到了Banner正式数据。refreshing刷新中，即将进行 Banner 渲染。resultArrSize:" + i + " hasRender:" + this.i + " dxRootViewCode:" + num, null, 4, null);
            this.j = true;
            a(dXTemplateItem, l18Var);
            this.m = dXTemplateItem;
        } else {
            tpu.a aVar3 = tpu.Companion;
            String str3 = this.h;
            tpu.a.b(aVar3, str3, "dBannerRefresh_正式:忽略:component:" + this.l + ":refresh:" + this.k + ":获取到了Banner正式数据。正式数据已刷新过且非Refreshing动作，忽略本次正式数据。resultArrSize:" + i + " hasRender:" + this.i + " dxRootViewCode:" + num, null, 4, null);
        }
    }

    @Override // tb.sg5, tb.fwa
    public String getComponentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5df1a77", new Object[]{this});
        }
        return "bannerComponent";
    }

    @Override // tb.sg5, tb.fwa, com.taobao.android.turbo.core.component.BaseComponent
    public void onPause(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587ab21d", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onPause(iComponentLifecycle$TriggerType);
        tpu.a.b(tpu.Companion, this.h, "DressBanner onPause", null, 4, null);
    }

    @Override // tb.sg5
    /* renamed from: x */
    public void onCreate(CardModel cardModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1c2b11b", new Object[]{this, cardModel, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onCreate(cardModel, iComponentLifecycle$TriggerType);
        ((g1c) this.n.getService(g1c.class)).addDressListListener(new b());
    }

    public final void F(DXTemplateItem dXTemplateItem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea1ae0b", new Object[]{this, dXTemplateItem, new Boolean(z)});
            return;
        }
        DXTemplateItem dXTemplateItem2 = this.m;
        if (dXTemplateItem2 != null && dXTemplateItem != null && !ckf.b(dXTemplateItem2, dXTemplateItem)) {
            if (!ckf.b(dXTemplateItem2.f7343a, dXTemplateItem.f7343a) || dXTemplateItem2.b != dXTemplateItem.b || !ckf.b(dXTemplateItem2.c, dXTemplateItem.c)) {
                if (z && this.i) {
                    tpu.a aVar = tpu.Companion;
                    String str = this.h;
                    tpu.a.b(aVar, str, "dBannerRefresh_缓存:重置:component:" + this.l + ":refresh:" + this.k + ":由于模板有变化，重置缓存标识。旧:name:" + dXTemplateItem.f7343a + ":version:" + dXTemplateItem.b + " 新:name:" + dXTemplateItem.f7343a + ":version:" + dXTemplateItem.b, null, 4, null);
                    this.i = false;
                }
                if (!z && this.j) {
                    tpu.a aVar2 = tpu.Companion;
                    String str2 = this.h;
                    tpu.a.b(aVar2, str2, "dBannerRefresh_正式:重置:component:" + this.l + ":refresh:" + this.k + ":由于模板有变化，重置正式标识。旧:name:" + dXTemplateItem2.f7343a + ":version:" + dXTemplateItem2.b + " 新:name:" + dXTemplateItem.f7343a + ":version:" + dXTemplateItem.b, null, 4, null);
                    this.j = false;
                    return;
                }
                return;
            }
            tpu.a aVar3 = tpu.Companion;
            String str3 = this.h;
            tpu.a.b(aVar3, str3, "dBannerRefresh-dx模板无变化:component:" + this.l + ":refresh:" + this.k + ":isCache:" + z + "由于模板有变化，重置缓存标识。", null, 4, null);
        }
    }

    public final void I(CardModel cardModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0c66127", new Object[]{this, cardModel});
        } else if (kz7.a()) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, this.h, "dBannerRefresh-调试包-Banner单个DxRootView-dress_banner_single_root_view", null, 4, null);
            if (cardModel instanceof l18) {
                l18 l18Var = (l18) cardModel;
                JSONObject a2 = l18Var.a();
                JSONArray jSONArray = null;
                boolean b2 = ckf.b(a2 != null ? a2.get("cache") : null, Boolean.TRUE);
                if (this.i) {
                    String str = this.h;
                    tpu.a.b(aVar, str, "dBannerRefresh-禁止重刷-是否缓存:" + b2 + ":缓存已刷新过:", null, 4, null);
                    if (!this.j && this.m != null) {
                        JSONObject a3 = l18Var.a();
                        if (a3 != null) {
                            jSONArray = a3.getJSONArray("result");
                        }
                        if (jSONArray != null && !jSONArray.isEmpty()) {
                            JSONObject jSONObject = jSONArray.getJSONObject(0);
                            ckf.f(jSONObject, "firstObj");
                            jSONObject.put((JSONObject) MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE, "正式数据" + this.k);
                        }
                        DXTemplateItem dXTemplateItem = this.m;
                        ckf.d(dXTemplateItem);
                        a(dXTemplateItem, l18Var);
                    }
                } else if (this.j) {
                    String str2 = this.h;
                    tpu.a.b(aVar, str2, "dBannerRefresh-禁止重刷-是否缓存:" + b2 + ":正式已刷新过:", null, 4, null);
                } else {
                    super.updateDataImpl(cardModel);
                }
            }
        }
    }

    @Override // tb.sg5
    public void y(DXTemplateItem dXTemplateItem, l18 l18Var) {
        JSONObject a2;
        JSONObject a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2863c7e2", new Object[]{this, dXTemplateItem, l18Var});
            return;
        }
        ckf.g(dXTemplateItem, "template");
        Object obj = null;
        boolean b2 = ckf.b((l18Var == null || (a3 = l18Var.a()) == null) ? null : a3.get("cache"), Boolean.TRUE);
        this.k++;
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, this.h, "renderDXTemplate 20250327 16:07 . isCache:" + b2 + " component:" + this.l + ":refresh:" + this.k, null, 4, null);
        if (!(l18Var == null || (a2 = l18Var.a()) == null)) {
            obj = a2.get("result");
        }
        if (obj != null && (obj instanceof JSONArray)) {
            F(dXTemplateItem, b2);
            int size = ((JSONArray) obj).size();
            if (size > 0) {
                G(l18Var);
                if (b2) {
                    b(dXTemplateItem, l18Var, size);
                } else {
                    c(dXTemplateItem, l18Var, size);
                }
            } else if (b2) {
                tpu.a.b(aVar, this.h, "dBannerRefresh_缓存:无数据:component:" + this.l + ":refresh:" + this.k + ":无Banner数组数据，不刷新 Banner 组件。", null, 4, null);
            } else {
                tpu.a.b(aVar, this.h, "dBannerRefresh_正式:无数据:component:" + this.l + ":refresh:" + this.k + ":无Banner数组数据，隐藏 Banner 组件。", null, 4, null);
            }
        } else if (b2) {
            tpu.a.b(aVar, this.h, "dBannerRefresh_缓存:无数据:component:" + this.l + ":refresh:" + this.k + ":无Banner数组数据，不刷新 Banner 组件。", null, 4, null);
        } else {
            tpu.a.b(aVar, this.h, "dBannerRefresh_正式:无数据:component:" + this.l + ":refresh:" + this.k + ":无Banner数组数据，隐藏 Banner 组件。", null, 4, null);
        }
    }

    @Override // tb.sg5
    public boolean w(CardModel cardModel) {
        JSONObject a2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebff6457", new Object[]{this, cardModel})).booleanValue();
        }
        ckf.g(cardModel, "data");
        if (!(cardModel instanceof l18)) {
            cardModel = null;
        }
        l18 l18Var = (l18) cardModel;
        return (l18Var == null || (a2 = l18Var.a()) == null || (jSONArray = a2.getJSONArray("result")) == null || !(jSONArray.isEmpty() ^ true)) ? false : true;
    }

    public final boolean H(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23d6c167", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        String str = "banner_component_" + this.l;
        JSONObject a2 = cz7.INSTANCE.a(o());
        if (a2 == null) {
            tpu.a.b(tpu.Companion, this.h, "dBannerRefresh-checkRefresh-异常退出:无有效originData:bannerComponentToken:" + str + ":允许继续刷新:isCache:" + z, null, 4, null);
            return true;
        }
        JSONObject jSONObject = a2.getJSONObject(cz7.PAGE_DATA_KEY_PAGE_CACHE_BANNER_DATA_IS_DIRTY_JSON);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            tpu.a.b(tpu.Companion, this.h, "dBannerRefresh-checkRefresh-字典准备:bannerComponentToken:" + str + ":isCache:" + z, null, 4, null);
            a2.put((JSONObject) cz7.PAGE_DATA_KEY_PAGE_CACHE_BANNER_DATA_IS_DIRTY_JSON, (String) jSONObject);
        }
        Boolean bool = jSONObject.getBoolean(str);
        Boolean bool2 = Boolean.TRUE;
        if (ckf.b(bool, bool2)) {
            tpu.a.b(tpu.Companion, this.h, "dBannerRefresh-checkRefresh-脏数退出:Banner数据已使用过:bannerComponentToken:" + str + ":禁止继续刷新:isCache:" + z, null, 4, null);
            return false;
        }
        jSONObject.put((JSONObject) str, (String) bool2);
        tpu.a.b(tpu.Companion, this.h, "dBannerRefresh-checkRefresh-普通数据:Banner数据还未用过:bannerComponentToken:" + str + ":允许继续刷新:isCache:" + z, null, 4, null);
        return true;
    }
}
