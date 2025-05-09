package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.updown.TaoLiveKtUpDownRequestType;
import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import com.taobao.kmp.live.updown.model.TaoLiveKtUpDownResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class qqz implements oyd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f26888a;
    public long b;
    public pxs c;
    public Map<String, ? extends Object> d;
    public final Map<String, Object> e = new LinkedHashMap();
    public String f;
    public w1a<? super Boolean, ? super String, ? super List<z3t>, xhv> g;
    public g1a<? super Map<String, ? extends Object>, xhv> h;

    static {
        t2o.a(1010827418);
        t2o.a(1010827416);
    }

    public static final xhv m(qqz qqzVar, boolean z, String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("424650da", new Object[]{qqzVar, new Boolean(z), str, list});
        }
        w1a<Boolean, String, List<z3t>, xhv> h = qqzVar.h();
        if (h != null) {
            h.invoke(Boolean.valueOf(z), str, list);
        }
        return xhv.INSTANCE;
    }

    public static final xhv p(qqz qqzVar, String str, l0g l0gVar, boolean z, TaoLiveKtUpDownResponse taoLiveKtUpDownResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("4c634548", new Object[]{qqzVar, str, l0gVar, new Boolean(z), taoLiveKtUpDownResponse});
        }
        ckf.g(l0gVar, "resultData");
        qqzVar.l(l0gVar, z, taoLiveKtUpDownResponse, str);
        return xhv.INSTANCE;
    }

    @Override // tb.oyd
    public void buildInitTppParams(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4edbb182", new Object[]{this, map});
        } else if (map != null) {
            Map<String, Object> f = f();
            if (f != null) {
                f.putAll(map);
            }
            iqz.INSTANCE.c(map);
        }
    }

    public pxs d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pxs) ipChange.ipc$dispatch("76c119ff", new Object[]{this});
        }
        return this.c;
    }

    public Map<String, Object> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("91a9918b", new Object[]{this});
        }
        return this.d;
    }

    public Map<String, Object> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7fa20a2f", new Object[]{this});
        }
        return this.e;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("591fb5d2", new Object[]{this});
        }
        return this.f;
    }

    public w1a<Boolean, String, List<z3t>, xhv> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w1a) ipChange.ipc$dispatch("838e27b3", new Object[]{this});
        }
        return this.g;
    }

    public g1a<Map<String, ? extends Object>, xhv> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("736c60c6", new Object[]{this});
        }
        return this.h;
    }

    public final void j(l0g l0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d183dd", new Object[]{this, l0gVar});
            return;
        }
        pus pusVar = pus.INSTANCE;
        pusVar.g("TaoLiveKtUpDownRankRequestManager", "", "live_recommend_no_data " + hashCode());
        u5t.INSTANCE.a("0", f(), l0gVar);
    }

    public final void k(l0g l0gVar, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7859e313", new Object[]{this, l0gVar, str});
            return;
        }
        pus pusVar = pus.INSTANCE;
        StringBuilder sb = new StringBuilder("handleRequestOnError, requestType:");
        sb.append(str);
        sb.append(", error msg:");
        j0g b = l0gVar.b();
        String str3 = null;
        if (b != null) {
            str2 = b.a();
        } else {
            str2 = null;
        }
        sb.append(str2);
        pusVar.g("TaoLiveKtUpDownRankRequestManager", "", sb.toString());
        u5t u5tVar = u5t.INSTANCE;
        j0g b2 = l0gVar.b();
        if (b2 != null) {
            str3 = b2.b();
        }
        u5tVar.a(str3, f(), l0gVar);
    }

    public final void l(l0g l0gVar, final boolean z, TaoLiveKtUpDownResponse taoLiveKtUpDownResponse, final String str) {
        List<TaoLiveKtSwitchModel> model;
        Integer num;
        TaoLiveKtSwitchModel taoLiveKtSwitchModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c84eed", new Object[]{this, l0gVar, new Boolean(z), taoLiveKtUpDownResponse, str});
        } else if (!z) {
            k(l0gVar, str);
        } else {
            String str2 = null;
            if (taoLiveKtUpDownResponse == null || (model = taoLiveKtUpDownResponse.getModel()) == null || model.isEmpty()) {
                j(l0gVar);
                w1a<Boolean, String, List<z3t>, xhv> h = h();
                if (h != null) {
                    h.invoke(Boolean.valueOf(z), str, null);
                    return;
                }
                return;
            }
            pus pusVar = pus.INSTANCE;
            StringBuilder sb = new StringBuilder("Request success, modelSize:");
            List<TaoLiveKtSwitchModel> model2 = taoLiveKtUpDownResponse.getModel();
            if (model2 != null) {
                num = Integer.valueOf(model2.size());
            } else {
                num = null;
            }
            sb.append(num);
            sb.append(" first liveId:");
            List<TaoLiveKtSwitchModel> model3 = taoLiveKtUpDownResponse.getModel();
            if (!(model3 == null || (taoLiveKtSwitchModel = model3.get(0)) == null)) {
                str2 = taoLiveKtSwitchModel.getLiveId();
            }
            sb.append(str2);
            sb.append(" requestType:");
            sb.append(str);
            sb.append(" hashCode:");
            sb.append(hashCode());
            pusVar.k("TaoLiveKtUpDownRankRequestManager", "", sb.toString());
            pxs d = d();
            if (d != null) {
                if (ckf.b(str, TaoLiveKtUpDownRequestType.FirstBatch.getValue()) || ckf.b(str, TaoLiveKtUpDownRequestType.NextBatch.getValue()) || ckf.b(str, TaoLiveKtUpDownRequestType.ForceBatch.getValue())) {
                    d.u(taoLiveKtUpDownResponse.getModel(), new g1a() { // from class: tb.oqz
                        @Override // tb.g1a
                        public final Object invoke(Object obj) {
                            xhv m;
                            m = qqz.m(qqz.this, z, str, (List) obj);
                            return m;
                        }
                    });
                }
                this.f26888a += this.b;
            }
        }
    }

    @Override // tb.oyd
    public void liveRoomSwitched() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d1ab61", new Object[]{this});
        } else {
            pus.INSTANCE.k("TaoLiveKtUpDownRankRequestManager", "", "TaoLiveKtUpDownRankRequestManager liveRoomSwitched");
        }
    }

    public void n(pxs pxsVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0977472", new Object[]{this, pxsVar, new Boolean(z)});
            return;
        }
        q(pxsVar);
        r(z);
    }

    public final void o(ziv zivVar, String str, w1a<? super l0g, ? super Boolean, ? super TaoLiveKtUpDownResponse, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716e9c9c", new Object[]{this, zivVar, str, w1aVar});
            return;
        }
        pus pusVar = pus.INSTANCE;
        pusVar.k("TaoLiveKtUpDownRankRequestManager", "", "perform Batch Recommend Request, requestType:" + str);
        if (ckf.b(str, TaoLiveKtUpDownRequestType.FirstBatch.getValue())) {
            this.f26888a = 0L;
            zivVar.b(zivVar.a() + ":0");
        }
        this.b = c5t.INSTANCE.y();
        zivVar.g(Long.valueOf(this.f26888a));
        zivVar.f(Long.valueOf(this.b));
        e5t.INSTANCE.a(zivVar, str, w1aVar);
    }

    public void q(pxs pxsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf02d0a9", new Object[]{this, pxsVar});
        } else {
            this.c = pxsVar;
        }
    }

    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eaaefc4", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.oyd
    public void requestRecommendModel(TaoLiveKtSwitchModel taoLiveKtSwitchModel, final String str, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("969f9cc4", new Object[]{this, taoLiveKtSwitchModel, str, map});
            return;
        }
        if (taoLiveKtSwitchModel == null) {
            pxs d = d();
            taoLiveKtSwitchModel = d != null ? d.d() : null;
            if (taoLiveKtSwitchModel == null) {
                return;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("mockUserId", g());
        if (ckf.b(str, TaoLiveKtUpDownRequestType.FirstBatch.getValue()) || ckf.b(str, TaoLiveKtUpDownRequestType.NextBatch.getValue()) || ckf.b(str, TaoLiveKtUpDownRequestType.ForceBatch.getValue())) {
            iqz iqzVar = iqz.INSTANCE;
            pxs d2 = d();
            ziv a2 = iqzVar.a(taoLiveKtSwitchModel, null, linkedHashMap, iqzVar.b("batch", taoLiveKtSwitchModel, d2 != null ? Integer.valueOf(d2.c()) : null, map));
            a2.l(xrf.c(c()));
            o(a2, str, new w1a() { // from class: tb.mqz
                @Override // tb.w1a
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    xhv p;
                    p = qqz.p(qqz.this, str, (l0g) obj, ((Boolean) obj2).booleanValue(), (TaoLiveKtUpDownResponse) obj3);
                    return p;
                }
            });
        }
    }

    @Override // tb.oyd
    public void setMFirstInitParams(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b299e63", new Object[]{this, map});
        } else {
            this.d = map;
        }
    }

    @Override // tb.oyd
    public void setMMockUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e28e334c", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    @Override // tb.oyd
    public void setResponseHandleCompletionCallBack(w1a<? super Boolean, ? super String, ? super List<z3t>, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49adb797", new Object[]{this, w1aVar});
        } else {
            this.g = w1aVar;
        }
    }

    @Override // tb.oyd
    public void setTppParamsBuildCallback(g1a<? super Map<String, ? extends Object>, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d0cdea8", new Object[]{this, g1aVar});
        } else {
            this.h = g1aVar;
        }
    }

    @Override // tb.oyd
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            iqz.INSTANCE.d(i());
        }
    }

    @Override // tb.oyd
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            pus.INSTANCE.k("TaoLiveKtUpDownRankRequestManager", "", "TaoLiveKtUpDownRankRequestManager stop");
        }
    }

    public final Map<String, Object> c() {
        Integer m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d82b04dd", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> e = e();
        String str = null;
        linkedHashMap.put("upDownStrategy", e != null ? e.get("upDownStrategy") : null);
        Map<String, Object> e2 = e();
        linkedHashMap.put("rankTrackId", e2 != null ? e2.get("rankTrackId") : null);
        Map<String, Object> e3 = e();
        linkedHashMap.put("jumpTimeStamp", e3 != null ? e3.get("jumpTimeStamp") : null);
        Map<String, Object> e4 = e();
        Object obj = e4 != null ? e4.get("rankIndex") : null;
        if (obj instanceof String) {
            str = (String) obj;
        }
        int intValue = (str == null || (m = ssq.m(str)) == null) ? 1 : m.intValue();
        pxs d = d();
        linkedHashMap.put("rankIndex", Integer.valueOf((intValue + (d != null ? d.D() : 1)) - 1));
        return linkedHashMap;
    }
}
