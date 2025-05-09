package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class s3t implements nyd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f27781a;
    public boolean b;
    public oyd c;
    public pxs d;
    public Map<String, ? extends Object> e;
    public g1a<? super TaoLiveKtSwitchModel, xhv> f;
    public g1a<? super TaoLiveKtSwitchModel, xhv> g;
    public g1a<? super String, xhv> h;
    public g1a<? super List<z3t>, xhv> i;
    public g1a<? super String, xhv> j;

    static {
        t2o.a(1010827407);
        t2o.a(1003487367);
    }

    public static final xhv G(s3t s3tVar, boolean z, String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("bd0f9792", new Object[]{s3tVar, new Boolean(z), str, list});
        }
        s3tVar.J(z, str, list);
        return xhv.INSTANCE;
    }

    public static final xhv H(s3t s3tVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("368dbbe7", new Object[]{s3tVar, map});
        }
        g1a<Map<String, ? extends Object>, xhv> E = s3tVar.E();
        if (E != null) {
            E.invoke(map);
        }
        return xhv.INSTANCE;
    }

    public static final xhv I(s3t s3tVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("9cfd54f8", new Object[]{s3tVar, list});
        }
        g1a<List<z3t>, xhv> A = s3tVar.A();
        if (A != null) {
            A.invoke(list);
        }
        return xhv.INSTANCE;
    }

    public static final xhv y(s3t s3tVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("f27283eb", new Object[]{s3tVar, list});
        }
        g1a<List<z3t>, xhv> A = s3tVar.A();
        if (A != null) {
            A.invoke(list);
        }
        return xhv.INSTANCE;
    }

    public g1a<List<z3t>, xhv> A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("adcc8f16", new Object[]{this});
        }
        return this.i;
    }

    public g1a<TaoLiveKtSwitchModel, xhv> B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("ee496706", new Object[]{this});
        }
        return this.f;
    }

    public g1a<TaoLiveKtSwitchModel, xhv> C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("88dcb829", new Object[]{this});
        }
        return this.g;
    }

    public g1a<String, xhv> D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("6712e73f", new Object[]{this});
        }
        return this.h;
    }

    public g1a<Map<String, ? extends Object>, xhv> E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("38d6da8c", new Object[]{this});
        }
        return null;
    }

    public final void J(boolean z, String str, List<z3t> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46552883", new Object[]{this, new Boolean(z), str, list});
        } else if (!z) {
            g1a<String, xhv> D = D();
            if (D != null) {
                D.invoke(str);
            }
        } else {
            g1a<List<z3t>, xhv> A = A();
            if (A != null) {
                A.invoke(list);
            }
            g1a<String, xhv> z2 = z();
            if (z2 != null) {
                z2.invoke(str);
            }
        }
    }

    @Override // tb.nyd
    public void a(Map<String, ? extends Object> map) {
        Object obj;
        Object obj2;
        Object obj3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43afb2e1", new Object[]{this, map});
        } else if (!this.f27781a) {
            this.f27781a = true;
            oyd oydVar = this.c;
            if (oydVar != null) {
                oydVar.buildInitTppParams(map);
            }
            TaoLiveKtSwitchModel taoLiveKtSwitchModel = null;
            if (map != null) {
                obj = map.get(zlr.PARAM_ENTRY_LIVE_ID);
            } else {
                obj = null;
            }
            String str = (String) obj;
            if (map != null) {
                obj2 = map.get(zlr.PARAM_ENTRY_ACCOUNT_ID);
            } else {
                obj2 = null;
            }
            String str2 = (String) obj2;
            if (map != null) {
                obj3 = map.get(zlr.PARAM_ENTRY_RECOMMEND_BIND_ID);
            } else {
                obj3 = null;
            }
            String str3 = (String) obj3;
            pxs pxsVar = this.d;
            if (pxsVar != null) {
                taoLiveKtSwitchModel = pxsVar.r(str, str2, str3);
            }
            g1a<TaoLiveKtSwitchModel, xhv> C = C();
            if (C != null) {
                C.invoke(taoLiveKtSwitchModel);
            }
        }
    }

    @Override // tb.nyd
    public Map<String, String> b(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("46f7885a", new Object[]{this, map});
        }
        this.e = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a4t a4tVar = a4t.INSTANCE;
        String d = a4tVar.d(this.e);
        String str = "";
        if (d == null) {
            d = str;
        }
        linkedHashMap.put("upDownLiveStatus", d);
        String c = a4tVar.c(this.e, this.d);
        if (c == null) {
            c = str;
        }
        linkedHashMap.put("upDownBizType", c);
        String b = a4tVar.b(this.e, this.d);
        if (b == null) {
            b = str;
        }
        linkedHashMap.put("upDownBizExtendParams", b);
        String e = a4tVar.e(this.d);
        if (e != null) {
            str = e;
        }
        linkedHashMap.put("upDownRequestType", str);
        return linkedHashMap;
    }

    @Override // tb.nyd
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("785cd7b4", new Object[]{this})).intValue();
        }
        pxs pxsVar = this.d;
        if (pxsVar != null) {
            return pxsVar.f();
        }
        return -1;
    }

    @Override // tb.nyd
    public void d(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b46944b", new Object[]{this, map});
        } else if (map != null) {
            TaoLiveKtSwitchModel a2 = c4t.INSTANCE.a(map);
            pxs pxsVar = this.d;
            if (pxsVar != null) {
                pxsVar.t(pxsVar.c(), a2, new g1a() { // from class: tb.m3t
                    @Override // tb.g1a
                    public final Object invoke(Object obj) {
                        xhv y;
                        y = s3t.y(s3t.this, (List) obj);
                        return y;
                    }
                });
            }
        }
    }

    @Override // tb.nyd
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1038383", new Object[]{this, str});
            return;
        }
        oyd oydVar = this.c;
        if (oydVar != null) {
            oydVar.setMMockUserId(str);
        }
    }

    @Override // tb.nyd
    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff6ebae8", new Object[]{this, new Integer(i)});
            return;
        }
        pxs pxsVar = this.d;
        if (pxsVar != null) {
            pxsVar.A(i);
        }
        oyd oydVar = this.c;
        if (oydVar != null) {
            oydVar.liveRoomSwitched();
        }
    }

    @Override // tb.nyd
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        pxs pxsVar = this.d;
        if (pxsVar != null) {
            return pxsVar.D();
        }
        return 0;
    }

    @Override // tb.nyd
    public Map<String, Object> h() {
        TaoLiveKtSwitchModel d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1b105257", new Object[]{this});
        }
        pxs pxsVar = this.d;
        if (pxsVar == null || (d = pxsVar.d()) == null) {
            return null;
        }
        return d.getModelDebugInfo();
    }

    @Override // tb.nyd
    public void i(g1a<? super String, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e129b7", new Object[]{this, g1aVar});
        } else {
            this.h = g1aVar;
        }
    }

    @Override // tb.nyd
    public void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb1b5bb7", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "liveId");
        ckf.g(str2, "officialLiveId");
        pxs pxsVar = this.d;
        if (pxsVar != null) {
            pxsVar.v(str, str2);
        }
    }

    @Override // tb.nyd
    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d30922", new Object[]{this, new Boolean(z)});
            return;
        }
        this.b = z;
        this.d = new pxs();
    }

    @Override // tb.nyd
    public void l(Map<String, ? extends Object> map) {
        TaoLiveKtSwitchModel taoLiveKtSwitchModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8653b83e", new Object[]{this, map});
            return;
        }
        F(map);
        pxs pxsVar = this.d;
        if (pxsVar != null) {
            taoLiveKtSwitchModel = pxsVar.s(map);
        } else {
            taoLiveKtSwitchModel = null;
        }
        g1a<TaoLiveKtSwitchModel, xhv> B = B();
        if (B != null) {
            B.invoke(taoLiveKtSwitchModel);
        }
    }

    @Override // tb.nyd
    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9878e6e", new Object[]{this, new Integer(i)});
            return;
        }
        pxs pxsVar = this.d;
        if (pxsVar != null) {
            pxsVar.B(i);
        }
    }

    @Override // tb.nyd
    public void n(g1a<? super String, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31609e7d", new Object[]{this, g1aVar});
        } else {
            this.j = g1aVar;
        }
    }

    @Override // tb.nyd
    public void o(g1a<? super List<z3t>, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb27a58", new Object[]{this, g1aVar});
        } else {
            this.i = g1aVar;
        }
    }

    @Override // tb.nyd
    public Map<String, Object> p() {
        TaoLiveKtSwitchModel d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("10640b09", new Object[]{this});
        }
        pxs pxsVar = this.d;
        if (pxsVar == null || (d = pxsVar.d()) == null) {
            return null;
        }
        return d.getExplainDebugInfo();
    }

    @Override // tb.nyd
    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("771dac62", new Object[]{this})).intValue();
        }
        pxs pxsVar = this.d;
        if (pxsVar != null) {
            return pxsVar.c();
        }
        return -1;
    }

    @Override // tb.nyd
    public void r(g1a<? super TaoLiveKtSwitchModel, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed8fcd0", new Object[]{this, g1aVar});
        } else {
            this.f = g1aVar;
        }
    }

    @Override // tb.nyd
    public void remove(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebab3958", new Object[]{this, new Integer(i)});
            return;
        }
        pxs pxsVar = this.d;
        if (pxsVar != null) {
            pxsVar.y(i, new g1a() { // from class: tb.k3t
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv I;
                    I = s3t.I(s3t.this, (List) obj);
                    return I;
                }
            });
        }
    }

    @Override // tb.nyd
    public void requestRecommendModel(TaoLiveKtSwitchModel taoLiveKtSwitchModel, String str, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("969f9cc4", new Object[]{this, taoLiveKtSwitchModel, str, map});
            return;
        }
        oyd oydVar = this.c;
        if (oydVar != null) {
            oydVar.requestRecommendModel(taoLiveKtSwitchModel, str, map);
        }
    }

    @Override // tb.nyd
    public void s(g1a<? super TaoLiveKtSwitchModel, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b11290d", new Object[]{this, g1aVar});
        } else {
            this.g = g1aVar;
        }
    }

    @Override // tb.nyd
    public void stopManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e446e052", new Object[]{this});
            return;
        }
        oyd oydVar = this.c;
        if (oydVar != null) {
            oydVar.stop();
        }
    }

    @Override // tb.nyd
    public void t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653eea5a", new Object[]{this, new Integer(i)});
            return;
        }
        pxs pxsVar = this.d;
        if (pxsVar != null) {
            pxsVar.C(i);
        }
    }

    public g1a<String, xhv> z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("5c59f951", new Object[]{this});
        }
        return this.j;
    }

    public final void F(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98aae10", new Object[]{this, map});
            return;
        }
        pxs pxsVar = this.d;
        if (pxsVar != null) {
            i3t i3tVar = new i3t();
            i3tVar.e(this.b);
            i3tVar.d(pxsVar);
            if (c5t.INSTANCE.M()) {
                if (ckf.b(map != null ? map.get("upDownStrategy") : null, "rank")) {
                    i3tVar.f(1);
                }
            }
            oyd a2 = g3t.INSTANCE.a(i3tVar);
            if (a2 != null) {
                a2.setMFirstInitParams(map);
                this.c = a2;
                a2.setResponseHandleCompletionCallBack(new w1a() { // from class: tb.o3t
                    @Override // tb.w1a
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        xhv G;
                        G = s3t.G(s3t.this, ((Boolean) obj).booleanValue(), (String) obj2, (List) obj3);
                        return G;
                    }
                });
                a2.setTppParamsBuildCallback(new g1a() { // from class: tb.q3t
                    @Override // tb.g1a
                    public final Object invoke(Object obj) {
                        xhv H;
                        H = s3t.H(s3t.this, (Map) obj);
                        return H;
                    }
                });
                a2.start();
            }
        }
    }

    @Override // tb.nyd
    public List<Map<String, Object>> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5987aec", new Object[]{this});
        }
        pxs pxsVar = this.d;
        List<TaoLiveKtSwitchModel> i = pxsVar != null ? pxsVar.i() : null;
        ArrayList arrayList = new ArrayList();
        if (i != null) {
            int i2 = 0;
            for (TaoLiveKtSwitchModel taoLiveKtSwitchModel : i) {
                i2++;
                if (i2 == q()) {
                    break;
                }
                String liveId = taoLiveKtSwitchModel.getLiveId();
                String accountId = taoLiveKtSwitchModel.getAccountId();
                if (!(liveId == null || accountId == null)) {
                    arrayList.add(a.j(jpu.a("liveId", liveId), jpu.a("accountId", accountId)));
                }
            }
        }
        return arrayList;
    }
}
