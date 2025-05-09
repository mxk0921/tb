package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.event.submit.business.default")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class no0 implements xcb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String USER_CONTEXT_KEY_SUBMIT_CALLBACK = "submit_callback";
    public static final String USER_CONTEXT_KEY_SUBMIT_RPC_PARAMS = "submit_rpc_params";

    /* renamed from: a  reason: collision with root package name */
    public lo f24855a;
    public AURAGlobalData b;
    public final pt c = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/submit/AliBuySubmitParamsExtension$1");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            } else {
                ck.g().a("submit", "innerHandleEvent", miVar.e());
            }
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
            } else if (ykVar == null) {
                ck.g().a("submit", "innerHandleEvent", "auraOutputData is null");
            } else {
                Serializable b = ykVar.b();
                if (!(b instanceof AURAParseIO)) {
                    ck.g().a("submit", "innerHandleEvent", f4w.LOAD_DATA_NULL);
                    return;
                }
                AURAParseIO aURAParseIO = (AURAParseIO) b;
                if (aURAParseIO.getData().isEmpty() || aURAParseIO.getData().get(0) == null) {
                    ck.g().a("submit", "innerHandleEvent", "parseIO is null");
                    return;
                }
                JSONObject b2 = aURAParseIO.getData().get(0).b();
                bn0.d(no0.r(no0.this).f(), no0.x(no0.this, b2));
                gfb gfbVar = (gfb) no0.r(no0.this).g("submit_callback", gfb.class);
                if (gfbVar != null) {
                    gfbVar.c(no0.r(no0.this), no0.B(no0.this));
                    gfbVar.a(b2);
                }
            }
        }
    }

    static {
        t2o.a(301990022);
        t2o.a(81789120);
    }

    public static /* synthetic */ AURAGlobalData B(no0 no0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAGlobalData) ipChange.ipc$dispatch("c5ebba50", new Object[]{no0Var});
        }
        return no0Var.b;
    }

    public static /* synthetic */ lo r(no0 no0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("508ff433", new Object[]{no0Var});
        }
        return no0Var.f24855a;
    }

    public static /* synthetic */ String x(no0 no0Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fcc4cb", new Object[]{no0Var, jSONObject});
        }
        return no0Var.L(jSONObject);
    }

    public final String L(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0f8e812", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            ck.g().a("submit", "innerHandleEvent", "createOrderProtocol is null");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("feature");
        if (jSONObject2 != null) {
            return jSONObject2.getString("needRemoveCartIds");
        }
        ck.g().a("submit", "innerHandleEvent", "feature is null");
        return null;
    }

    @Override // tb.xcb
    public pt i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pt) ipChange.ipc$dispatch("f2ced9e", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f24855a = loVar;
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        } else {
            this.b = aURAGlobalData;
        }
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }
}
