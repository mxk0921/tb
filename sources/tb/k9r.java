package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ali.adapt.api.AliAdaptServiceManager;
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
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbbuy.impl.event.verifyIdentity")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class k9r extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "verifyIdentity";
    public hbb e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f22503a;
        public final /* synthetic */ AURAEventIO b;
        public final /* synthetic */ String c;

        public a(Context context, AURAEventIO aURAEventIO, String str) {
            this.f22503a = context;
            this.b = aURAEventIO;
            this.c = str;
        }

        @Override // tb.k9r.d
        public void a(boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f730c189", new Object[]{this, new Boolean(z), str, str2});
                return;
            }
            k9r.O0(k9r.this, false);
            if (z) {
                k9r.P0(k9r.this, this.f22503a, this.b, this.c);
                return;
            }
            k9r.Q0(k9r.this, this.f22503a, str2);
            k9r.R0(k9r.this).b(new mi(1, "AURAEventServiceDomain", str, str2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nbb f22504a;
        public final /* synthetic */ AURAEventIO b;

        public b(k9r k9rVar, nbb nbbVar, AURAEventIO aURAEventIO) {
            this.f22504a = nbbVar;
            this.b = aURAEventIO;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1584757281) {
                super.c((yk) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/event/TBBuyRPVerifyEvent$3");
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
                return;
            }
            super.c(ykVar);
            pi.b(this.f22504a, "adjust", this.b.getEventModel());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        void verify(Context context, String str, d dVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface d {
        void a(boolean z, String str, String str2);
    }

    static {
        t2o.a(708837466);
    }

    public static /* synthetic */ void O0(k9r k9rVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb199fb", new Object[]{k9rVar, new Boolean(z)});
        } else {
            k9rVar.U0(z);
        }
    }

    public static /* synthetic */ void P0(k9r k9rVar, Context context, AURAEventIO aURAEventIO, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45cafbe6", new Object[]{k9rVar, context, aURAEventIO, str});
        } else {
            k9rVar.V0(context, aURAEventIO, str);
        }
    }

    public static /* synthetic */ void Q0(k9r k9rVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0d3cefb", new Object[]{k9rVar, context, str});
        } else {
            k9rVar.S0(context, str);
        }
    }

    public static /* synthetic */ hbb R0(k9r k9rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hbb) ipChange.ipc$dispatch("cffae3af", new Object[]{k9rVar});
        }
        return k9rVar.e;
    }

    public static /* synthetic */ Object ipc$super(k9r k9rVar, String str, Object... objArr) {
        if (str.hashCode() == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/event/TBBuyRPVerifyEvent");
    }

    public final void S0(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6d54cf", new Object[]{this, context, str});
        } else if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(new l9r(this, context, str));
        }
    }

    public final rxu T0(AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rxu) ipChange.ipc$dispatch("32654c40", new Object[]{this, aURARenderComponent, str});
        }
        rxu rxuVar = new rxu();
        rxuVar.f27667a = RuleType.PROPS_WRITE_BACK;
        rxuVar.b = aURARenderComponent.key;
        rxuVar.c.fields = new HashMap();
        rxuVar.c.fields.put(BaseJsExecutor.NAME_VERIFY_TOKEN, str);
        rxuVar.d.fields = new HashMap();
        rxuVar.d.events = new HashMap();
        rxuVar.d.f32185a = new HashMap();
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData != null) {
            Map<String, Object> map = aURARenderComponentData.fields;
            if (map != null) {
                rxuVar.d.fields.putAll(map);
            }
            Map<String, List<Event>> map2 = aURARenderComponent.data.events;
            if (map2 != null) {
                rxuVar.d.events.putAll(map2);
            }
            Map<String, Object> map3 = aURARenderComponent.data.localFields;
            if (map3 != null) {
                rxuVar.d.f32185a.putAll(map3);
            }
        }
        return rxuVar;
    }

    public final void U0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25b67fb3", new Object[]{this, new Boolean(z)});
            return;
        }
        alq alqVar = (alq) J0().g(wt.USERDATA_KEY_STATUS_MANAGER, alq.class);
        if (alqVar != null) {
            if (z) {
                alqVar.l(Boolean.FALSE);
            } else {
                alqVar.b();
            }
        }
    }

    public final void V0(Context context, AURAEventIO aURAEventIO, String str) {
        AURARenderComponent j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76af380d", new Object[]{this, context, aURAEventIO, str});
            return;
        }
        nbb c2 = J0().c();
        if (c2 != null && (j = aURAEventIO.getEventModel().j()) != null) {
            c2.c("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(T0(j, str))), new b(this, c2, aURAEventIO));
            S0(context, Localization.q(R.string.purchase_taobao_app_1029_1_19069));
        }
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

    @Override // tb.ibb
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return "verifyIdentity";
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
            return;
        }
        Context f = J0().f();
        if (f != null) {
            JSONObject c2 = aURAEventIO.getEventModel().c();
            if (c2 == null || TextUtils.isEmpty(c2.getString(BaseJsExecutor.NAME_VERIFY_TOKEN))) {
                S0(f, Localization.q(R.string.purchase_taobao_app_1029_1_19077));
                return;
            }
            String string = c2.getString(BaseJsExecutor.NAME_VERIFY_TOKEN);
            c cVar = (c) AliAdaptServiceManager.getInstance().findAliAdaptService(c.class);
            if (cVar == null) {
                ck.g().b("AliBuyRPVerifyEvent", "innerHandleEvent", "verify service is null");
                S0(f, Localization.q(R.string.purchase_taobao_app_1029_1_19077));
                return;
            }
            U0(true);
            try {
                cVar.verify(f, string, new a(f, aURAEventIO, string));
            } catch (Exception unused) {
                U0(false);
            }
        }
    }
}
