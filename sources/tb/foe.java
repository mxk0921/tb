package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Size;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ImageSearchMtopUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class foe extends yy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String d;
    public final String e;
    public final String f;
    public final Map<String, String> g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final nmf k;
    public final String l;
    public final boolean m;
    public volatile int n;

    static {
        t2o.a(481297364);
    }

    public /* synthetic */ foe(String str, String str2, String str3, Map map, String str4, boolean z, boolean z2, nmf nmfVar, String str5, boolean z3, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? lg4.F1() : str2, (i & 4) != 0 ? lg4.G1() : str3, (i & 8) != 0 ? null : map, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? false : z, (i & 64) == 0 ? z2 : false, (i & 128) != 0 ? null : nmfVar, (i & 256) == 0 ? str5 : null, (i & 512) != 0 ? true : z3);
    }

    public static /* synthetic */ Object ipc$super(foe foeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/pipline/node/ImageSearchNode");
    }

    @Override // tb.yy1
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b5601d", new Object[]{this});
        }
        return "ImageSearch";
    }

    @Override // tb.yy1
    public x7m k(w7m w7mVar) {
        Size f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7m) ipChange.ipc$dispatch("826f33b6", new Object[]{this, w7mVar});
        }
        ckf.g(w7mVar, "pipLineDS");
        if (this.k != null) {
            a("pageRebuild", "true");
            n();
            return f(this.k);
        } else if (!n4p.c()) {
            m(-10, ErrorConstant.ERRMSG_NO_NETWORK);
            return c(-10, ErrorConstant.ERRMSG_NO_NETWORK, this.j);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, String> map = this.g;
            if (map == null) {
                Map<String, String> l = w7mVar.l();
                if (l != null && !l.isEmpty()) {
                    Map<String, String> c = u7j.c(w7mVar.k(), w7mVar.l());
                    ckf.f(c, "preHandleRequestExtraPar…DS.pageParams\n          )");
                    linkedHashMap.putAll(c);
                }
                if (!w7mVar.x()) {
                    linkedHashMap.putAll(w7mVar.b());
                    String str = w7mVar.e().get();
                    if (str != null) {
                        linkedHashMap.put("universalCardFeature", str);
                    }
                    linkedHashMap.put(ImageSearchMtopUtil.KEY_IMG, w7mVar.n());
                    String o = w7mVar.o();
                    if (o != null) {
                        linkedHashMap.put("watermarkStrimg", o);
                    }
                    String str2 = "";
                    if (w7mVar.f() != null) {
                        String str3 = "0," + f.getWidth() + ",0," + f.getHeight();
                        if (str3 != null) {
                            str2 = str3;
                        }
                    }
                    linkedHashMap.put("full_region_size", str2);
                }
                if (!TextUtils.isEmpty(w7mVar.r())) {
                    linkedHashMap.put("region", w7mVar.r());
                }
                ImageSearchMtopUtil.h(linkedHashMap);
                ImageSearchMtopUtil.g(linkedHashMap);
                String str4 = this.l;
                if (str4 != null && str4.length() != 0) {
                    linkedHashMap.put("component", this.l);
                } else if (w7mVar.h() == null && w7mVar.v()) {
                    linkedHashMap.put("component", "plt_text_search_api");
                } else if (w7mVar.y()) {
                    linkedHashMap.put("component", "plt_pic_safe_api");
                }
            } else {
                linkedHashMap.putAll(map);
            }
            String o2 = o(w7mVar);
            a("apiName", this.e);
            a("appId", o2);
            b(linkedHashMap);
            this.n = NetworkQualityMonitor.getGlobalNetworkQuality();
            pmf.U0(this.n);
            return p(o2, linkedHashMap);
        }
    }

    public final String o(w7m w7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c97ccb", new Object[]{this, w7mVar});
        }
        String Y1 = lg4.Y1("irpMockAppId");
        if (!TextUtils.isEmpty(Y1)) {
            ckf.f(Y1, "{\n      // 强制命中 chitu 配置…    chituDebugAppId\n    }");
        } else {
            if (w7mVar.h() != null || !w7mVar.v()) {
                Y1 = this.d;
                if (Y1 == null || TextUtils.isEmpty(Y1)) {
                    String q = w7mVar.q();
                    if (q == null) {
                        q = "";
                    }
                    Y1 = lg4.H1(q);
                }
                ckf.f(Y1, "{\n      // 走正常逻辑\n      i…d\n        }\n      }\n    }");
            } else {
                Y1 = "37747";
            }
            ckf.f(Y1, "{\n      // 走正常逻辑\n      i…d\n        }\n      }\n    }");
        }
        return Y1;
    }

    public final x7m p(String str, Map<String, String> map) {
        x7m x7mVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7m) ipChange.ipc$dispatch("bf2dd495", new Object[]{this, str, map});
        }
        String str2 = this.e;
        String str3 = this.f;
        o4j r = ImageSearchMtopUtil.r(str, str2, str3, this.h, map, this.m);
        a("mtopTraceId", r.e());
        a("eagleeyeTraceId", r.a());
        nmf b = nmf.Companion.b(r.f());
        b.a0(this.n);
        b.e0(map.remove(ImageSearchMtopUtil.KEY_IMG));
        map.remove(p80.ACE_REPORT_FLAG);
        map.remove("watermarkStrimg");
        map.put("appId", str);
        map.put("apiName", str2);
        map.put("apiVersion", str3);
        b.b0(map);
        b.L(this.i);
        if (!r.g() || !b.z()) {
            Integer b2 = r.b();
            int intValue = b2 == null ? -14 : b2.intValue();
            String c = r.c();
            if (c == null) {
                c = "请求失败，原因未知";
            }
            m(intValue, c);
            x7mVar = d(Integer.valueOf(intValue), c, this.j, b);
        } else {
            n();
            x7mVar = f(b);
        }
        pmf.B0(Long.valueOf(SystemClock.elapsedRealtime() - h()));
        pmf.C0();
        return x7mVar;
    }

    public foe(String str, String str2, String str3, Map<String, String> map, String str4, boolean z, boolean z2, nmf nmfVar, String str5, boolean z3) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = map;
        this.h = str4;
        this.i = z;
        this.j = z2;
        this.k = nmfVar;
        this.l = str5;
        this.m = z3;
    }
}
