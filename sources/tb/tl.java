package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.taobao.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.event.quantityChange")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class tl extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CHANGE = "change";
    public static final String ACTION_DECREASE = "decrease";
    public static final String ACTION_HIDE_QUANTITY = "hideQuantity";
    public static final String ACTION_INCREASE = "increase";
    public static final String ACTION_SHOW_QUANTITY = "showQuantity";
    public static final String ADJUST_EVENT = "adjust";
    public static final String DEFAULT_RULE_WORKFLOW = "aura.workflow.adjustRules";
    public static final String EVENT_TYPE = "quantityChange";
    public static final String KEY_ACTION = "action";
    public static final String KEY_MAX = "max";
    public static final String KEY_MIN = "min";
    public static final String KEY_QUANTITY = "quantity";
    public static final String KEY_SHOW_QUANTITY = "showQuantity";
    public static final String KEY_STEP = "step";
    public static final String TOAST_CAN_NOT_INCREASE = Localization.q(R.string.taobao_app_1029_1_36429);
    public static final String TOAST_CAN_NOT_DECREASE = Localization.q(R.string.taobao_app_1029_1_36426);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(tl tlVar) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1339997787) {
                super.b((mi) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/event/quantity/AURAQuantityChangeEvent$1");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                return;
            }
            super.b(miVar);
            ck.g().e(tl.EVENT_TYPE, miVar.e());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AURAEventIO f28779a;

        static {
            t2o.a(81789084);
        }

        public b(AURAEventIO aURAEventIO) {
            this.f28779a = aURAEventIO;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/event/quantity/AURAQuantityChangeEvent$InnerChangeQuantityCallback");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            } else {
                tl.Q0(tl.this, tl.EVENT_TYPE, miVar.e());
            }
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
                return;
            }
            nbb c = tl.O0(tl.this).c();
            if (c == null) {
                tl.P0(tl.this, tl.EVENT_TYPE, "auraInstance is null");
            } else {
                pi.b(c, "adjust", this.f28779a.getEventModel());
            }
        }
    }

    static {
        t2o.a(81789082);
    }

    public static /* synthetic */ lo O0(tl tlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("72e425dc", new Object[]{tlVar});
        }
        return tlVar.J0();
    }

    public static /* synthetic */ void P0(tl tlVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d48c3c8", new Object[]{tlVar, str, str2});
        } else {
            tlVar.M0(str, str2);
        }
    }

    public static /* synthetic */ void Q0(tl tlVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a81dcb49", new Object[]{tlVar, str, str2});
        } else {
            tlVar.M0(str, str2);
        }
    }

    public static /* synthetic */ Object ipc$super(tl tlVar, String str, Object... objArr) {
        if (str.hashCode() == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/event/quantity/AURAQuantityChangeEvent");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
        if (r11.equals(tb.tl.ACTION_INCREASE) == false) goto L_0x008d;
     */
    @Override // tb.ws
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void K0(com.alibaba.android.aura.service.event.AURAEventIO r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tl.K0(com.alibaba.android.aura.service.event.AURAEventIO):void");
    }

    public final int T0(qi qiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e8b8e4a", new Object[]{this, qiVar})).intValue();
        }
        try {
            Object g = qiVar.g("quantity");
            if (g instanceof String) {
                return Integer.parseInt((String) g);
            }
            return -1;
        } catch (Throwable th) {
            rbb g2 = ck.g();
            g2.e("getInputQuantityForNativeRender :" + th.getMessage());
            return -1;
        }
    }

    public final int U0(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("763ba24b", new Object[]{this, obj})).intValue();
        }
        if (obj == null) {
            return -1;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj).intValue();
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    @Override // tb.ws, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        } else {
            super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
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

    public final int S0(qi qiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9e21c2", new Object[]{this, qiVar})).intValue();
        }
        int T0 = T0(qiVar);
        if (T0 != -1) {
            return T0;
        }
        Object g = qiVar.g(qi.EXT_KEY_DX_RUNTIME_CONTEXT);
        if (!(g instanceof DXRuntimeContext)) {
            M0(EVENT_TYPE, "dxRuntime 不是DXRuntimeContext");
            ck.g().e("quantityChange fun:innerHandleEvent case: dxRuntime 不是DXRuntimeContext");
            return -1;
        }
        View D = ((DXRuntimeContext) g).D();
        if (D == null) {
            M0(EVENT_TYPE, "view 为空");
            return -1;
        }
        Object tag = D.getTag(mgw.DINAMICX_3_CUSTOM_INPUT_KEY);
        if (tag instanceof List) {
            List list = (List) tag;
            if (list.size() >= 2) {
                Object obj = list.get(1);
                if (obj instanceof CharSequence) {
                    try {
                        return Integer.valueOf(obj.toString()).intValue();
                    } catch (Exception e) {
                        M0(EVENT_TYPE, e.getMessage());
                        return -1;
                    }
                } else if (obj instanceof Integer) {
                    return ((Integer) obj).intValue();
                } else {
                    M0(EVENT_TYPE, "inputObject 类型不对");
                    return -1;
                }
            }
        }
        M0(EVENT_TYPE, "tag 为空");
        return -1;
    }

    public final void V0(nbb nbbVar, rxu rxuVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("374c5f5e", new Object[]{this, nbbVar, rxuVar, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("quantity", String.valueOf(i));
        ym ymVar = rxuVar.c;
        ymVar.fields = hashMap;
        ymVar.f32185a = rxuVar.d.f32185a;
        ymVar.events = new HashMap();
        nbbVar.c("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(rxuVar)), new a(this));
    }

    public final void W0(nbb nbbVar, AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f551d8", new Object[]{this, nbbVar, aURARenderComponent, str});
            return;
        }
        rxu rxuVar = new rxu();
        rxuVar.f27667a = RuleType.PROPS_WRITE_BACK;
        rxuVar.d.fields = new HashMap();
        rxuVar.d.f32185a = new HashMap();
        rxuVar.d.events = new HashMap();
        rxuVar.b = aURARenderComponent.key;
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData != null) {
            Map<String, Object> map = aURARenderComponentData.fields;
            if (map != null) {
                rxuVar.d.fields.putAll(map);
            }
            Map<String, Object> map2 = aURARenderComponent.data.localFields;
            if (map2 != null) {
                rxuVar.d.f32185a.putAll(map2);
            }
            Map<String, List<Event>> map3 = aURARenderComponent.data.events;
            if (map3 != null) {
                rxuVar.d.events.putAll(map3);
            }
        }
        HashMap hashMap = new HashMap();
        if (str.equals("showQuantity")) {
            hashMap.put("showQuantity", "true");
        } else if (str.equals(ACTION_HIDE_QUANTITY)) {
            hashMap.put("showQuantity", "false");
        }
        ym ymVar = rxuVar.c;
        ymVar.fields = hashMap;
        ymVar.f32185a = hashMap;
        ymVar.events = new HashMap();
        nbbVar.c("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(rxuVar)), null);
    }

    public final void R0(nbb nbbVar, AURAEventIO aURAEventIO, AURARenderComponent aURARenderComponent, String str, int i) {
        AURARenderComponentData aURARenderComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3eeba25", new Object[]{this, nbbVar, aURAEventIO, aURARenderComponent, str, new Integer(i)});
            return;
        }
        Context f = J0().f();
        if (f == null || (aURARenderComponentData = aURARenderComponent.data) == null || aURARenderComponentData.fields == null) {
            M0(EVENT_TYPE, "data 为 空");
            return;
        }
        rxu rxuVar = new rxu();
        rxuVar.f27667a = RuleType.PROPS_WRITE_BACK;
        rxuVar.d.fields = new HashMap();
        rxuVar.d.f32185a = new HashMap();
        rxuVar.d.events = new HashMap();
        rxuVar.b = aURARenderComponent.key;
        AURARenderComponentData aURARenderComponentData2 = aURARenderComponent.data;
        if (aURARenderComponentData2 != null) {
            Map<String, Object> map = aURARenderComponentData2.fields;
            if (map != null) {
                rxuVar.d.fields.putAll(map);
            }
            Map<String, Object> map2 = aURARenderComponent.data.localFields;
            if (map2 != null) {
                rxuVar.d.f32185a.putAll(map2);
            }
            Map<String, List<Event>> map3 = aURARenderComponent.data.events;
            if (map3 != null) {
                rxuVar.d.events.putAll(map3);
            }
        }
        int U0 = U0(aURARenderComponent.data.fields.get("quantity"));
        int U02 = U0(aURARenderComponent.data.fields.get(KEY_STEP));
        int U03 = U0(aURARenderComponent.data.fields.get("min"));
        int U04 = U0(aURARenderComponent.data.fields.get("max"));
        if (U0 < 0 || U02 < 0 || U03 < 0 || U04 < 0) {
            M0(EVENT_TYPE, "校验不通过，回滚");
            V0(nbbVar, rxuVar, U0);
            return;
        }
        HashMap hashMap = new HashMap();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1361636432:
                if (str.equals("change")) {
                    c = 0;
                    break;
                }
                break;
            case 95321666:
                if (str.equals(ACTION_INCREASE)) {
                    c = 1;
                    break;
                }
                break;
            case 573606046:
                if (str.equals(ACTION_DECREASE)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (i >= U03) {
                    if (i <= U04) {
                        hashMap.put("quantity", String.valueOf(i));
                        break;
                    } else {
                        eo.b(f, TOAST_CAN_NOT_INCREASE);
                        V0(nbbVar, rxuVar, U0);
                        return;
                    }
                } else {
                    eo.b(f, TOAST_CAN_NOT_DECREASE);
                    V0(nbbVar, rxuVar, U0);
                    return;
                }
            case 1:
                int i2 = U02 + U0;
                if (i2 <= U04) {
                    hashMap.put("quantity", String.valueOf(i2));
                    break;
                } else {
                    eo.b(f, TOAST_CAN_NOT_INCREASE);
                    V0(nbbVar, rxuVar, U0);
                    return;
                }
            case 2:
                int i3 = U0 - U02;
                if (i3 >= U03) {
                    hashMap.put("quantity", String.valueOf(i3));
                    break;
                } else {
                    eo.b(f, TOAST_CAN_NOT_DECREASE);
                    V0(nbbVar, rxuVar, U0);
                    return;
                }
            default:
                M0(EVENT_TYPE, "wrong action");
                return;
        }
        ym ymVar = rxuVar.c;
        ymVar.fields = hashMap;
        ymVar.f32185a = rxuVar.d.f32185a;
        ymVar.events = new HashMap();
        nbbVar.c("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(rxuVar)), new b(aURAEventIO));
    }
}
