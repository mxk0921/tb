package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.IAURAInputField;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.taobao.adapter.widget.floatview.NUTFloatViewManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cyc;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.event.popupWindow")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ml extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "popupWindow";
    public hbb e;
    public gh f;
    public NUTFloatViewManager g;
    public boolean h;
    public boolean i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements cyc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24111a;
        public final /* synthetic */ AURAEventIO b;
        public final /* synthetic */ HashMap c;
        public final /* synthetic */ NUTFloatViewManager.Builder d;

        public a(String str, AURAEventIO aURAEventIO, HashMap hashMap, NUTFloatViewManager.Builder builder) {
            this.f24111a = str;
            this.b = aURAEventIO;
            this.c = hashMap;
            this.d = builder;
        }

        @Override // tb.cyc.a
        public boolean onClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e155e364", new Object[]{this})).booleanValue();
            }
            ml.P0(ml.this, ml.O0(ml.this, this.f24111a), this.b.getEventModel().j(), this.c.get("auraInstance"));
            return true ^ this.d.getFloatStyle().k();
        }
    }

    static {
        t2o.a(81789198);
    }

    public static /* synthetic */ JSONObject O0(ml mlVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fc994336", new Object[]{mlVar, str});
        }
        return mlVar.V0(str);
    }

    public static /* synthetic */ void P0(ml mlVar, JSONObject jSONObject, AURARenderComponent aURARenderComponent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2df5c34", new Object[]{mlVar, jSONObject, aURARenderComponent, obj});
        } else {
            mlVar.d1(jSONObject, aURARenderComponent, obj);
        }
    }

    public static /* synthetic */ Object ipc$super(ml mlVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/popupWindow/AURAPopupWindowEvent");
        }
    }

    public final hij R0(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hij) ipChange.ipc$dispatch("576be9d1", new Object[]{this, jSONObject, jSONObject2});
        }
        hij hijVar = new hij();
        int d = ai.d();
        hijVar.p(0.6f);
        hijVar.s(0.9f);
        hijVar.r(xn.a());
        iij iijVar = new iij();
        iijVar.g((int) (d * 0.2d));
        hijVar.q(iijVar);
        f1(hijVar, jSONObject);
        f1(hijVar, jSONObject2);
        if (hijVar.b()) {
            hijVar.r(false);
            hijVar.v(0.0f);
        }
        return hijVar;
    }

    public final void S0(NUTFloatViewManager nUTFloatViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2546ed", new Object[]{this, nUTFloatViewManager});
            return;
        }
        AURAGlobalData B = B();
        if (B != null) {
            B.update("auraFloatViewManager", nUTFloatViewManager);
        }
    }

    public final mj T0() {
        List<IAURAInputField> list;
        lo loVar;
        IAURAPluginCenter[] iAURAPluginCenterArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mj) ipChange.ipc$dispatch("4734dc9", new Object[]{this});
        }
        hcb hcbVar = (hcb) x().e(hcb.class);
        if (hcbVar != null) {
            loVar = hcbVar.v();
            list = hcbVar.u0();
            iAURAPluginCenterArr = hcbVar.I();
        } else {
            iAURAPluginCenterArr = null;
            loVar = null;
            list = null;
        }
        if (loVar == null) {
            loVar = new lo(J0().f(), null);
        }
        g1(loVar);
        mj h = mj.h(loVar);
        AURAPluginContainerNodeModel g = this.f.g();
        if (g == null) {
            h.t(X0());
        } else {
            h.u(g);
            ck.g().c("AURAPopupWindowEvent", "createAURAInstance", "使用预加载的配置");
        }
        if (iAURAPluginCenterArr != null) {
            h.o(iAURAPluginCenterArr);
        }
        if (list != null && !list.isEmpty()) {
            for (IAURAInputField iAURAInputField : list) {
                h.b(iAURAInputField);
            }
        }
        return h;
    }

    public final void U0(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9785c6a3", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        hbb hbbVar = this.e;
        if (hbbVar != null) {
            hbbVar.b(new mi(i, "AURAFloatPluginDomain", str, str2));
        }
    }

    public final JSONObject V0(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("352290d3", new Object[]{this, str});
        }
        JSONObject W0 = W0();
        if (W0 == null || (jSONObject = W0.getJSONObject("data")) == null) {
            return null;
        }
        return jSONObject.getJSONObject(str);
    }

    public final JSONObject W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8eef27f", new Object[]{this});
        }
        AURAGlobalData B = B();
        if (B == null) {
            return null;
        }
        return (JSONObject) B.get("aura_data_protocol_json", JSONObject.class);
    }

    public final String X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf02894c", new Object[]{this});
        }
        hcb hcbVar = (hcb) x().e(hcb.class);
        if (hcbVar == null) {
            return "aura_float_config.json";
        }
        String E0 = hcbVar.E0();
        if (TextUtils.isEmpty(E0)) {
            return "aura_float_config.json";
        }
        return E0;
    }

    public final JSONObject Y0(Component component) {
        Map<String, Object> fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("df31327b", new Object[]{this, component});
        }
        if (component == null || (fields = component.getFields()) == null) {
            return null;
        }
        Object obj = fields.get("style");
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        return null;
    }

    public final Object Z0(AURAEventIO aURAEventIO) {
        AURARenderComponentData aURARenderComponentData;
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8f067846", new Object[]{this, aURAEventIO});
        }
        qi eventModel = aURAEventIO.getEventModel();
        JSONObject c = eventModel.c();
        if (c == null) {
            return null;
        }
        String string = c.getString("code");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Object obj = c.get("popupData");
        if (obj != null) {
            return obj;
        }
        AURARenderComponent j = eventModel.j();
        if (j == null || (aURARenderComponentData = j.data) == null || (map = aURARenderComponentData.codePopupWindowMap) == null) {
            return null;
        }
        return map.get(string);
    }

    public final String b1() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11a6d5ba", new Object[]{this});
        }
        hcb hcbVar = (hcb) x().e(hcb.class);
        if (hcbVar != null) {
            str = hcbVar.t();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return "aura.workflow.float";
        }
        return str;
    }

    public final UltronProtocol c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronProtocol) ipChange.ipc$dispatch("1ef3927a", new Object[]{this});
        }
        AURAGlobalData B = B();
        if (B == null) {
            return null;
        }
        return (UltronProtocol) B.get(zj.GLOBAL_DATA_PROTOCOL, UltronProtocol.class);
    }

    public final void d1(JSONObject jSONObject, AURARenderComponent aURARenderComponent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90536de6", new Object[]{this, jSONObject, aURARenderComponent, obj});
        } else if (!(obj instanceof nbb) || jSONObject == null) {
            ck.g().e("auraInstance or dataProtocol is null!!");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("events");
            if (jSONObject2 != null) {
                for (String str : jSONObject2.keySet()) {
                    if ("onClose".equals(str)) {
                        pi.a((nbb) obj, aURARenderComponent, jSONObject2.getJSONArray(str));
                    }
                }
            }
        }
    }

    public final boolean e1(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95fe2aa3", new Object[]{this, aURAEventIO})).booleanValue();
        }
        for (ys ysVar : x().f(ys.class)) {
            if (ysVar.r(aURAEventIO)) {
                return true;
            }
        }
        return false;
    }

    public final void g1(lo loVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4919c576", new Object[]{this, loVar});
        } else {
            this.i = ((Boolean) fk.b(loVar.i(), "autoSize", Boolean.class, Boolean.valueOf(xh.b(loVar.f())))).booleanValue();
        }
    }

    @Override // tb.ws, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        gh ghVar = new gh("AURAPopupWindowEvent");
        this.f = ghVar;
        ghVar.c(loVar.f(), X0());
        this.h = xk.a("delayDestroyInstance", true);
    }

    @Override // tb.ws, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        this.e = hbbVar;
    }

    @Override // tb.ws, tb.ybb
    public void onDestroy() {
        NUTFloatViewManager nUTFloatViewManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.f.f();
        if (this.h && (nUTFloatViewManager = this.g) != null) {
            nUTFloatViewManager.h();
        }
    }

    @Override // tb.ibb
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return EVENT_TYPE;
    }

    public final void f1(hij hijVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19355af7", new Object[]{this, hijVar, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("backgroundColor");
            if (!TextUtils.isEmpty(string)) {
                hijVar.o(string);
            }
            String string2 = jSONObject.getString(hij.KEY_NEED_CLOSE_BUTTON);
            if (!TextUtils.isEmpty(string2)) {
                hijVar.t(Boolean.parseBoolean(string2));
                hijVar.r(false);
            }
            String string3 = jSONObject.getString(hij.KEY_CLOSE_BUTTON_V3);
            if (!TextUtils.isEmpty(string3)) {
                hijVar.u(Boolean.parseBoolean(string3));
            }
            float b = pn.b(jSONObject.getString(hij.KEY_HEIGHT_RATIO), -1.0f);
            if (b != -1.0f) {
                hijVar.p(b);
                iij iijVar = new iij();
                iijVar.g((int) (ai.d() * (1.0f - b)));
                hijVar.q(iijVar);
            }
            String string4 = jSONObject.getString(hij.KEY_AUTO_SIZE);
            if (TextUtils.isEmpty(string4) || Boolean.parseBoolean(string4)) {
                hijVar.n(this.i);
            }
            String string5 = jSONObject.getString(hij.KEY_CORNER_RADIUS);
            if (!TextUtils.isEmpty(string5)) {
                hijVar.v(ai.a(Float.parseFloat(string5)));
            }
        }
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
            return;
        }
        JSONObject W0 = W0();
        if (bh.b(W0)) {
            M0(EVENT_TYPE, "参数校验失败");
            U0(0, "-2000_INVALID_PROTOCOL", "浮层插件popupWindow事件输入的协议为校验失败");
        } else if (!e1(aURAEventIO)) {
            Object Z0 = Z0(aURAEventIO);
            if (!(Z0 instanceof RenderComponent)) {
                M0(EVENT_TYPE, "浮层插件获取的popupWindowComponent为空");
                U0(0, "-1000_EMPTY_STATE", "浮层插件获取的popupWindowComponent为空");
                return;
            }
            RenderComponent renderComponent = (RenderComponent) Z0;
            String str = renderComponent.key;
            if (TextUtils.isEmpty(str)) {
                M0(EVENT_TYPE, "浮层插件获取的popupWindowComponent为空");
                U0(0, "-1000_EMPTY_STATE", "浮层插件获取的popupWindowKey为空");
                return;
            }
            JSONObject Y0 = Y0(renderComponent.component);
            HashMap<String, Object> Q0 = Q0(str, W0);
            NUTFloatViewManager.Builder floatParams = NUTFloatViewManager.v().floatType("aura").floatStyle(R0(Y0, aURAEventIO.getEventModel().c())).floatParams(Q0);
            if (this.h) {
                floatParams.internalRecycleOnDismiss(false);
                NUTFloatViewManager nUTFloatViewManager = this.g;
                if (nUTFloatViewManager != null) {
                    nUTFloatViewManager.dismiss();
                    this.g.h();
                }
            } else {
                floatParams.internalRecycleOnDismiss(true);
            }
            NUTFloatViewManager build = floatParams.build();
            this.g = build;
            build.s(J0().f());
            S0(this.g);
            this.g.n(new a(str, aURAEventIO, Q0, floatParams));
        }
    }

    public final HashMap<String, Object> Q0(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("872c10ee", new Object[]{this, str, jSONObject});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        JSONObject a1 = a1(jSONObject);
        if (a1 == null) {
            return hashMap;
        }
        AURAParseIO aURAParseIO = new AURAParseIO(Arrays.asList(new rl(a1)));
        aURAParseIO.setRootKey(str);
        hashMap.put("auraInstance", T0());
        hashMap.put("startPointInputIO", aURAParseIO);
        hashMap.put("startPointWorkflow", b1());
        return hashMap;
    }

    public final JSONObject a1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fe36d5eb", new Object[]{this, jSONObject});
        }
        if (xk.a("enablePopupWindowOpt2", true)) {
            return JSON.parseObject(jSONObject.toJSONString());
        }
        try {
            return (JSONObject) JSON.toJSON(c1().clone());
        } catch (Throwable th) {
            if (this.e == null) {
                return null;
            }
            U0(0, "-3000_DEEP_CLONE_EXCEPTION", "浮层插件popupWindow协议深拷贝异常：" + th.toString());
            return null;
        }
    }
}
