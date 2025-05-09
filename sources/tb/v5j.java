package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.accs.common.Constants;
import com.taobao.message.message_open_api.ICallService;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class v5j {
    public final Boolean A;
    public final Boolean B;
    public final Boolean C;
    public final Map<String, ? extends Object> D;

    /* renamed from: a  reason: collision with root package name */
    public final String f29793a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final Map<String, ? extends Object> e;
    public final String f;
    public final String g;
    public final Boolean h;
    public int i;
    public final Map<String, ? extends Object> j;
    public final Map<String, ? extends Object> k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final long p;
    public final String q;
    public final String r;
    public final String s;
    public final Boolean t;
    public final Map<String, ? extends Object> u;
    public final Boolean v;
    public final Boolean w;
    public final String x;
    public final String y;
    public final Boolean z;

    static {
        t2o.a(119537687);
    }

    public v5j(Map<String, ? extends Object> map) {
        boolean z;
        ckf.g(map, "abilityData");
        String w = MegaUtils.w(map, "api", "");
        ckf.d(w);
        this.f29793a = w;
        this.b = MegaUtils.w(map, "v", "*");
        Boolean bool = Boolean.FALSE;
        this.c = MegaUtils.g(map, ICallService.KEY_NEED_LOGIN, bool);
        String str = "AUTO_LOGIN_ONLY";
        String w2 = MegaUtils.w(map, "sessionOption", str);
        this.d = !ckf.b(w2, "AutoLoginOnly") ? w2 : str;
        this.e = MegaUtils.r(map, "data");
        this.f = MegaUtils.w(map, "method", "GET");
        String w3 = MegaUtils.w(map, "responseType", "noValue");
        String str2 = "originaljson";
        if (w3 != null) {
            int hashCode = w3.hashCode();
            if (hashCode != 2286824) {
                if (hashCode == 713924246) {
                    w3.equals("ORIGINAL_JSON");
                } else if (hashCode == 2101412912 && w3.equals("noValue")) {
                    str2 = MegaUtils.w(map, "dataType", str2);
                }
            } else if (w3.equals("JSON")) {
                str2 = "json";
            }
        }
        this.g = str2;
        Boolean g = MegaUtils.g(map, "useWua", null);
        if (g != null) {
            z = g.booleanValue();
        } else {
            z = false;
            Integer l = MegaUtils.l(map, "secType", 0);
            ckf.d(l);
            if (l.intValue() > 0) {
                z = true;
            }
        }
        this.h = Boolean.valueOf(z);
        Integer l2 = MegaUtils.l(map, "timeout", 30000);
        ckf.d(l2);
        this.i = l2.intValue();
        this.j = MegaUtils.r(map, "extHeaders");
        this.k = MegaUtils.r(map, "extQuerys");
        this.l = MegaUtils.w(map, "ttid", "");
        this.m = MegaUtils.w(map, "pageUrl", "");
        String w4 = MegaUtils.w(map, "userAgent", null);
        this.n = w4 == null ? MegaUtils.w(map, "xUserAgent", "") : w4;
        this.o = MegaUtils.w(map, ov2.ALIPAY_ACCOUNT_SITE, null);
        Integer l3 = MegaUtils.l(map, "prefetchTimeout", 5000);
        ckf.d(l3);
        this.p = l3.intValue();
        this.q = MegaUtils.w(map, "bizID", "");
        String w5 = MegaUtils.w(map, mh1.PRICE_UNIT, null);
        this.r = w5 == null ? MegaUtils.w(map, "unitStrategy", "UNIT_GUIDE") : w5;
        this.s = MegaUtils.w(map, "topic", "");
        this.t = MegaUtils.g(map, "prefetchEnable", bool);
        this.u = MegaUtils.r(map, "loadingConfig");
        Boolean bool2 = Boolean.TRUE;
        this.v = MegaUtils.g(map, "useHttps", bool2);
        this.w = MegaUtils.g(map, "useCache", bool);
        this.x = MegaUtils.w(map, "mpHost", "");
        this.y = MegaUtils.w(map, Constants.KEY_USER_ID, "");
        this.z = MegaUtils.g(map, "retryForbidden", bool);
        this.A = MegaUtils.g(map, "allowSwitchToPOST", bool);
        this.B = MegaUtils.g(map, "droidParseAsync", bool2);
        this.C = MegaUtils.g(map, "enableUpCompress", null);
        this.D = MegaUtils.r(map, "extParams");
    }
}
