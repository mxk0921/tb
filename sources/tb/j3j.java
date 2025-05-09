package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.s;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXTsKVDataParser;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class j3j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final s f21738a;
    public final n3j b;
    public final m3j c;
    public final j9m d;

    static {
        t2o.a(745537902);
    }

    public j3j() {
        j9m j9mVar = new j9m();
        this.d = j9mVar;
        uv6.d("initMtbContext");
        DXEngineConfig.b H = new DXEngineConfig.b("mytaobao").g0(true).Q(2).X(10086).Y("mytaobao").H(true, true);
        if (MtbGlobalEnv.p() && !uv6.b) {
            H.R(false);
        }
        s sVar = new s(H.F());
        this.f21738a = sVar;
        if (ih4.a("compatDarkMode", true)) {
            sVar.k().O0(new k3j());
        }
        ko5 ko5Var = new ko5();
        e(ko5Var);
        f(ko5Var);
        n3j n3jVar = new n3j(sVar);
        this.b = n3jVar;
        this.c = new m3j(sVar, n3jVar, j9mVar);
        uv6.g("initMtbContext");
    }

    public final s a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("887afe62", new Object[]{this});
        }
        return this.f21738a;
    }

    public final m3j b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m3j) ipChange.ipc$dispatch("c253abcd", new Object[]{this});
        }
        return this.c;
    }

    public final n3j c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n3j) ipChange.ipc$dispatch("83c29e8d", new Object[]{this});
        }
        return this.b;
    }

    public final j9m d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j9m) ipChange.ipc$dispatch("442ea4bc", new Object[]{this});
        }
        return this.d;
    }

    public final void f(ko5 ko5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8ce840", new Object[]{this, ko5Var});
            return;
        }
        this.f21738a.s(nsh.DX_EVENT_MTB_ONTAP, new nsh(null));
        this.f21738a.s(p46.DX_EVENT_MTB_SCROLL_EXPOSE, new p46());
        this.f21738a.s(t46.DX_EVENT_MTB_TOOLSSCROLLEXPOSE, new t46());
        this.f21738a.s(18619468269105L, new u46());
        this.f21738a.s(-9059485389533098272L, new s46());
        this.f21738a.s(qd6.DX_EVENT_SWITCHACCOUNT, new qd6());
        this.f21738a.s(u66.DX_EVENT_OPENURL, new u66());
        q46.b();
        this.f21738a.s(q46.DX_EVENT_MTBSLIDEREXPOSEUT, new q46(true));
        this.f21738a.s(u36.DX_EVENT_MTBORDERSLIDEREVENTHANDLE, new u36(true));
        this.f21738a.s(q66.DX_EVENT_ONMTBEQUITYSLIDERFINISH, new q66(ko5Var));
        this.f21738a.s(1544903441687469454L, new r46());
        this.f21738a.s(4706731952712964941L, new o46());
    }

    public final void e(ko5 ko5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b0967b", new Object[]{this, ko5Var});
            return;
        }
        this.f21738a.r(dkx.DX_PARSER_SKINSWITCH, new dkx(true));
        this.f21738a.r(ckx.DX_PARSER_NAVISWITCH, new ckx(true));
        this.f21738a.r(lj5.DX_PARSER_COLORPARSE, new lj5());
        this.f21738a.r(lo5.DX_PARSER_MTBFESTIVAL, new lo5());
        this.f21738a.r(-8467096471110193181L, new dn5());
        this.f21738a.r(-7652928674852335207L, new mo5("mytaobao"));
        this.f21738a.r(no5.DX_PARSER_MTBICONFONTSUPPORT, new no5());
        this.f21738a.r(DXTsKVDataParser.DX_PARSER_TSKV, new DXTsKVDataParser());
        this.f21738a.r(-2517623531547489759L, new nq5());
        this.f21738a.r(ko5.DX_PARSER_MTB2022EQUITY_NUMBER_CHANGE_DATA, ko5Var);
        this.f21738a.r(tt5.DX_PARSER_URLCODETOOL, new tt5());
        this.f21738a.r(9422011105736515L, new mi6());
    }
}
