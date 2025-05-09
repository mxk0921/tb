package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.s;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXTsKVDataParser;
import kotlin.jvm.JvmStatic;
import tb.a86;
import tb.ekx;
import tb.ikx;
import tb.ivh;
import tb.jkx;
import tb.vav;
import tb.z7v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class a4j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public com.alibaba.android.ultron.vfw.instance.a f15534a;
    public DinamicXEngine b;
    public ko5 c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(745538077);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final void a(com.alibaba.android.ultron.vfw.instance.a aVar, ko5 ko5Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4ea86e9", new Object[]{this, aVar, ko5Var});
                return;
            }
            ckf.h(aVar, "ultronInstance");
            ckf.h(ko5Var, "mtb2022EquityNumberChangeData");
            aVar.B0(ko5.DX_PARSER_MTB2022EQUITY_NUMBER_CHANGE_DATA, ko5Var);
            aVar.B0(dkx.DX_PARSER_SKINSWITCH, new dkx(false));
            aVar.B0(ckx.DX_PARSER_NAVISWITCH, new ckx(false));
            aVar.B0(-8467096471110193181L, new dn5());
            aVar.B0(-7652928674852335207L, new mo5("mytaobao"));
            aVar.B0(lj5.DX_PARSER_COLORPARSE, new lj5());
            aVar.B0(lo5.DX_PARSER_MTBFESTIVAL, new lo5());
            aVar.B0(no5.DX_PARSER_MTBICONFONTSUPPORT, new no5());
            aVar.B0(tt5.DX_PARSER_URLCODETOOL, new tt5());
            aVar.B0(-2517623531547489759L, new nq5());
            aVar.B0(kn5.DX_PARSER_ISUSEHIGHBASEMENTGUIDE, new kn5());
            aVar.B0(ml5.DX_PARSER_GETUNREADMSGCOUNT, new ml5());
            aVar.C0(ikx.DX_MFAVORTEXTVIEW, new ikx.a());
            aVar.C0(jkx.DX_MORDERNUMTEXTVIEW, new jkx.a());
            aVar.C0(ekx.DX_MGIFIMAGEVIEW, new ekx.a());
            aVar.C0(a86.DX_SCROLLER_LAYOUT, new a86.a());
            aVar.C0(ivh.DXMTVIDEOVIEW_MTVIDEOVIEW, new ivh.a());
            aVar.B0(DXTsKVDataParser.DX_PARSER_TSKV, new DXTsKVDataParser());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b extends z7v.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Activity b;

        public b(Activity activity) {
            this.b = activity;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/MtbUltronHelper$createUltronInstance$1");
        }

        @Override // tb.z7v.c
        public void b(Context context, s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0a5ce96", new Object[]{this, context, sVar});
                return;
            }
            ckf.h(sVar, "dinamicXEngineRouter");
            a4j.b(a4j.this, sVar.k());
            DinamicXEngine a2 = a4j.a(a4j.this);
            if (a2 != null) {
                a2.l1(this.b);
                if (ih4.a("compatDarkMode", true)) {
                    DinamicXEngine a3 = a4j.a(a4j.this);
                    if (a3 != null) {
                        a3.O0(new k3j());
                    } else {
                        ckf.s();
                        throw null;
                    }
                }
            } else {
                ckf.s();
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c extends vav.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == 1758077316) {
                return new Boolean(super.a((String) objArr[0], ((Boolean) objArr[1]).booleanValue()));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/MtbUltronHelper$doInit$1");
        }

        @Override // tb.vav.b
        public boolean a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("68ca2184", new Object[]{this, str, new Boolean(z)})).booleanValue();
            }
            ckf.h(str, "switchKey");
            if (!TextUtils.equals(str, "enableDXPreCreateView") && !TextUtils.equals(str, "enablePipelineCache")) {
                return super.a(str, z);
            }
            return true;
        }
    }

    static {
        t2o.a(745538076);
    }

    public static final /* synthetic */ DinamicXEngine a(a4j a4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("35beedc", new Object[]{a4jVar});
        }
        return a4jVar.b;
    }

    public static final /* synthetic */ void b(a4j a4jVar, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e67670", new Object[]{a4jVar, dinamicXEngine});
        } else {
            a4jVar.b = dinamicXEngine;
        }
    }

    @JvmStatic
    public static final void h(com.alibaba.android.ultron.vfw.instance.a aVar, ko5 ko5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ea86e9", new Object[]{aVar, ko5Var});
        } else {
            Companion.a(aVar, ko5Var);
        }
    }

    public final void d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42a35114", new Object[]{this, activity});
            return;
        }
        ckf.h(activity, "aty");
        if (this.f15534a == null) {
            vav.h("mytaobao", new c());
            this.f15534a = c(activity);
            ko5 ko5Var = new ko5();
            this.c = ko5Var;
            a aVar = Companion;
            com.alibaba.android.ultron.vfw.instance.a aVar2 = this.f15534a;
            if (aVar2 != null) {
                aVar.a(aVar2, ko5Var);
            } else {
                ckf.s();
                throw null;
            }
        }
    }

    public final com.alibaba.android.ultron.vfw.instance.a e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.a) ipChange.ipc$dispatch("53e15d68", new Object[]{this});
        }
        com.alibaba.android.ultron.vfw.instance.a aVar = this.f15534a;
        this.f15534a = null;
        return aVar;
    }

    public final DinamicXEngine f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("5bafc634", new Object[]{this});
        }
        return this.b;
    }

    public final ko5 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ko5) ipChange.ipc$dispatch("20dfd948", new Object[]{this});
        }
        return this.c;
    }

    public final com.alibaba.android.ultron.vfw.instance.a c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.a) ipChange.ipc$dispatch("8bf1dda6", new Object[]{this, activity});
        }
        UltronInstanceConfig K = new UltronInstanceConfig().z("mytaobao").K(false);
        K.a(true);
        K.I(true);
        z7v.b m = new z7v.b().p(10086).q("mytaobao").m(true);
        DXEngineConfig.b g0 = new DXEngineConfig.b("mytaobao").H(true, true).g0(true);
        if (MtbGlobalEnv.p() && !uv6.b) {
            g0.R(false);
        }
        K.G(m.l(g0).n(new b(activity)).i());
        com.alibaba.android.ultron.vfw.instance.a q = com.alibaba.android.ultron.vfw.instance.a.q(K, activity);
        ckf.c(q, "UltronInstance.createUltronInstance(config, aty)");
        return q;
    }
}
