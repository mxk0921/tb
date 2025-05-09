package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.event.adjust")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class tf extends ws implements wbb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "adjust";
    public List<js> e;
    public hbb f;
    public AURAGlobalData g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nbb f28673a;
        public final /* synthetic */ boolean b;

        /* compiled from: Taobao */
        /* renamed from: tb.tf$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class C1061a implements mbb<mi, Void> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C1061a() {
            }

            /* renamed from: b */
            public Void a(mi miVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Void) ipChange.ipc$dispatch("954f032c", new Object[]{this, miVar});
                }
                a.this.f28673a.c("aura.workflow.adjustRules", new UMFRuleIO("rollback"), null);
                return null;
            }
        }

        public a(nbb nbbVar, boolean z) {
            this.f28673a = nbbVar;
            this.b = z;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/linkage/event/AURAAdjustEvent$1");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            } else if ("AURANextRPCServiceDomain".equals(miVar.c()) && !tf.O0(tf.this, miVar, new C1061a())) {
                this.f28673a.c("aura.workflow.adjustRules", new UMFRuleIO("rollback"), null);
            }
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
            } else if (this.b) {
                tf.P0(tf.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UMFLinkageTrigger f28675a;
        public final /* synthetic */ boolean b;

        public b(UMFLinkageTrigger uMFLinkageTrigger, boolean z) {
            this.f28675a = uMFLinkageTrigger;
            this.b = z;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/linkage/event/AURAAdjustEvent$2");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                return;
            }
            tf.Q0(tf.this, "adjust", miVar.e());
            if (miVar.f() == 0) {
                tf.R0(tf.this);
            }
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
            } else {
                tf.S0(tf.this, this.f28675a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nbb f28676a;
        public final /* synthetic */ boolean b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements mbb<mi, Void> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            /* renamed from: b */
            public Void a(mi miVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Void) ipChange.ipc$dispatch("954f032c", new Object[]{this, miVar});
                }
                c.this.d(miVar);
                return null;
            }
        }

        public c(nbb nbbVar, boolean z) {
            this.f28676a = nbbVar;
            this.b = z;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/linkage/event/AURAAdjustEvent$3");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                return;
            }
            tf.T0(tf.this, "adjust", miVar.e());
            if ("AURANextRPCServiceDomain".equals(miVar.c())) {
                if (!tf.O0(tf.this, miVar, new a())) {
                    this.f28676a.c("aura.workflow.adjustRules", new UMFRuleIO("rollback"), null);
                } else {
                    return;
                }
            }
            if (miVar.f() == 0 && this.b) {
                tf.R0(tf.this);
            }
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
                return;
            }
            Serializable b = ykVar.b();
            if (b instanceof AURAParseIO) {
                tf.U0(tf.this, (AURAParseIO) b);
            }
            tf.R0(tf.this);
        }

        public void d(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5aa1bdd", new Object[]{this, miVar});
                return;
            }
            if ("AURANextRPCServiceDomain".equals(miVar.c())) {
                this.f28676a.c("aura.workflow.adjustRules", new UMFRuleIO("rollback"), null);
            }
            if (miVar.f() == 0 && this.b) {
                tf.R0(tf.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(tf tfVar) {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == -1339997787) {
                super.b((mi) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/linkage/event/AURAAdjustEvent$4");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                return;
            }
            super.b(miVar);
            ck.g().e("adjust", miVar.e());
        }
    }

    static {
        t2o.a(81789122);
        t2o.a(80740477);
    }

    public static /* synthetic */ boolean O0(tf tfVar, mi miVar, mbb mbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96198c44", new Object[]{tfVar, miVar, mbbVar})).booleanValue();
        }
        return tfVar.f1(miVar, mbbVar);
    }

    public static /* synthetic */ void P0(tf tfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d11326", new Object[]{tfVar});
        } else {
            tfVar.i1();
        }
    }

    public static /* synthetic */ void Q0(tf tfVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d898099", new Object[]{tfVar, str, str2});
        } else {
            tfVar.M0(str, str2);
        }
    }

    public static /* synthetic */ void R0(tf tfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8740e4", new Object[]{tfVar});
        } else {
            tfVar.X0();
        }
    }

    public static /* synthetic */ void S0(tf tfVar, UMFLinkageTrigger uMFLinkageTrigger, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9328a89e", new Object[]{tfVar, uMFLinkageTrigger, new Boolean(z)});
        } else {
            tfVar.b1(uMFLinkageTrigger, z);
        }
    }

    public static /* synthetic */ void T0(tf tfVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92357ab6", new Object[]{tfVar, str, str2});
        } else {
            tfVar.M0(str, str2);
        }
    }

    public static /* synthetic */ void U0(tf tfVar, AURAParseIO aURAParseIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a774d631", new Object[]{tfVar, aURAParseIO});
        } else {
            tfVar.Z0(aURAParseIO);
        }
    }

    public static /* synthetic */ Object ipc$super(tf tfVar, String str, Object... objArr) {
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/linkage/event/AURAAdjustEvent");
        }
    }

    @Override // tb.wbb
    public boolean R(AURAParseIO aURAParseIO, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6c61f92", new Object[]{this, aURAParseIO, str})).booleanValue();
        }
        Z0(aURAParseIO);
        return true;
    }

    public final boolean V0(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bc54041", new Object[]{this, aURAEventIO})).booleanValue();
        }
        for (ys ysVar : x().f(ys.class)) {
            if (ysVar.r(aURAEventIO)) {
                return true;
            }
        }
        return false;
    }

    public final void X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4f91cb", new Object[]{this});
        } else {
            pi.b(J0().c(), zh.EVENT_TYPE, new qi());
        }
    }

    public final AURAParseIO Y0(boolean z) {
        AURAGlobalData aURAGlobalData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAParseIO) ipChange.ipc$dispatch("8b2c5ec9", new Object[]{this, new Boolean(z)});
        }
        if (!z || (aURAGlobalData = this.g) == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) aURAGlobalData.get("floatRawProtocol", JSONObject.class);
        String str = (String) this.g.get("floatRootKey", String.class);
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return null;
        }
        AURAParseIO aURAParseIO = new AURAParseIO(Arrays.asList(new rl(jSONObject)));
        aURAParseIO.setRootKey(str);
        return aURAParseIO;
    }

    public final void Z0(AURAParseIO aURAParseIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919ab40a", new Object[]{this, aURAParseIO});
            return;
        }
        List<nbb> c2 = pj.f().c(J0().f());
        if (c2 != null) {
            for (nbb nbbVar : c2) {
                nbbVar.c("aura.workflow.instanceSyncData", aURAParseIO, new d(this));
            }
        }
    }

    public final void a1(UMFLinkageTrigger uMFLinkageTrigger, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3803976", new Object[]{this, uMFLinkageTrigger, new Boolean(z)});
            return;
        }
        nbb c2 = J0().c();
        c2.c("aura.workflow.adjust", uMFLinkageTrigger, new a(c2, z));
    }

    public final void b1(UMFLinkageTrigger uMFLinkageTrigger, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a10b020", new Object[]{this, uMFLinkageTrigger, new Boolean(z)});
        } else if (z || h1(uMFLinkageTrigger)) {
            nbb c2 = J0().c();
            c2.c("aura.workflow.adjustConfirm", uMFLinkageTrigger, new c(c2, z));
        } else {
            X0();
        }
    }

    public final void c1(UMFLinkageTrigger uMFLinkageTrigger, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebaa84f6", new Object[]{this, uMFLinkageTrigger, new Boolean(z)});
            return;
        }
        AURAParseIO Y0 = Y0(z);
        if (Y0 != null) {
            J0().c().c("aura.workflow.parse", Y0, new b(uMFLinkageTrigger, z));
        } else {
            b1(uMFLinkageTrigger, z);
        }
    }

    public final boolean e1(AURAEventIO aURAEventIO, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bcf78ee", new Object[]{this, aURAEventIO, str, new Boolean(z)})).booleanValue();
        }
        JSONObject c2 = aURAEventIO.getEventModel().c();
        if (c2 != null) {
            return c2.getBooleanValue(str);
        }
        return z;
    }

    public final boolean f1(mi miVar, mbb<mi, Void> mbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8107216b", new Object[]{this, miVar, mbbVar})).booleanValue();
        }
        List<js> list = this.e;
        if (list != null) {
            for (js jsVar : list) {
                if (jsVar.m0(miVar, mbbVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean g1(qi qiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ebe602b", new Object[]{this, qiVar})).booleanValue();
        }
        AURARenderComponent j = qiVar.j();
        if (j == null) {
            return false;
        }
        for (gs gsVar : x().f(gs.class)) {
            if (gsVar.L(j)) {
                return true;
            }
        }
        return false;
    }

    public final boolean h1(UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8d1f9f7", new Object[]{this, uMFLinkageTrigger})).booleanValue();
        }
        for (is isVar : x().f(is.class)) {
            if (!isVar.L(uMFLinkageTrigger)) {
                return false;
            }
        }
        return true;
    }

    public final void i1() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d62d2", new Object[]{this});
            return;
        }
        AURAGlobalData aURAGlobalData = this.g;
        if (aURAGlobalData != null && (jSONObject = (JSONObject) aURAGlobalData.get("aura_data_protocol_json", JSONObject.class)) != null) {
            Z0(new AURAParseIO(Arrays.asList(new rl(jSONObject))));
        }
    }

    @Override // tb.ws, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        this.f = hbbVar;
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        this.g = aURAGlobalData;
    }

    @Override // tb.ws, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        pj.f().e(J0().f(), J0().c());
    }

    @Override // tb.ibb
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return "adjust";
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
        } else if (!V0(aURAEventIO)) {
            UMFLinkageTrigger a2 = msg.a(aURAEventIO);
            if (W0(a2)) {
                M0("adjust", "checkParamsInvalid failed");
                return;
            }
            if (this.e != null) {
                List<nbb> c2 = pj.f().c(J0().f());
                for (js jsVar : this.e) {
                    jsVar.L(a2, c2);
                }
            }
            try {
                str = aURAEventIO.getEventModel().j().data.container.name;
            } catch (Throwable th) {
                M0("adjust", th.getMessage());
                str = null;
            }
            aURAEventIO.getEventModel();
            boolean e1 = e1(aURAEventIO, "isConfirm", false);
            boolean e12 = e1(aURAEventIO, "isCancel", false);
            if ("buy_v2_pop_bottom".equals(str) || g1(aURAEventIO.getEventModel()) || e1 || e12) {
                c1(a2, e12);
            } else {
                a1(a2, d1(aURAEventIO, "sync"));
            }
        }
    }

    public final boolean d1(AURAEventIO aURAEventIO, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f680f35b", new Object[]{this, aURAEventIO, str})).booleanValue();
        }
        JSONObject c2 = aURAEventIO.getEventModel().c();
        if (c2 != null) {
            return str.equalsIgnoreCase(c2.getString("option"));
        }
        return false;
    }

    @Override // tb.ws, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        if (!fj.e("useNewInstancePoolManager", true, true)) {
            pj.f().a(loVar.f(), loVar.c());
        }
        this.e = yiVar.f(js.class);
    }

    public final boolean W0(UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e71bde7", new Object[]{this, uMFLinkageTrigger})).booleanValue();
        }
        List<nbb> c2 = pj.f().c(J0().f());
        if (c2 == null || c2.isEmpty()) {
            this.f.b(new mi(1, "AURALinkagePluginDomain", "-4001_ADJUST_PARAM_CHECK", "mInstancePool is empty"));
            return true;
        } else if (uMFLinkageTrigger != null) {
            return false;
        } else {
            this.f.b(new mi(1, "AURALinkagePluginDomain", "-4001_ADJUST_PARAM_CHECK", "linkageTrigger is empty"));
            return true;
        }
    }
}
