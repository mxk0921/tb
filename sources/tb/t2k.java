package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.NextRPCRequestMethod;
import com.taobao.android.abilityidl.ability.NextRPCResponseType;
import com.taobao.android.abilityidl.ability.NextRPCSessionOption;
import com.taobao.android.abilityidl.ability.NextRPCUnit;
import com.taobao.message.message_open_api.ICallService;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class t2k {

    /* renamed from: a  reason: collision with root package name */
    public final String f28431a;
    public final String b;
    public final Map<String, ? extends Object> c;
    public final String d;
    public final String e;
    public final boolean f;
    public final int g;
    public final Map<String, ? extends Object> h;
    public final Map<String, ? extends Object> i;
    public final String j;
    public final String k;
    public final String l;
    public final Boolean m;

    static {
        t2o.a(525337322);
    }

    public t2k() {
        this.f28431a = "";
        this.b = "";
        this.d = "GET";
        this.e = "UNIT_GUIDE";
        this.g = 30000;
        this.k = "ORIGINAL_JSON";
    }

    public t2k(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "api", null);
        if (x != null) {
            this.f28431a = x;
            String x2 = MegaUtils.x(map, "v", null);
            if (x2 != null) {
                this.b = x2;
                this.c = MegaUtils.s(map, "data");
                String str = "GET";
                String a2 = NextRPCRequestMethod.Companion.a(MegaUtils.x(map, "method", str));
                this.d = a2 != null ? a2 : str;
                MegaUtils.x(map, "bizID", null);
                String str2 = "UNIT_GUIDE";
                String a3 = NextRPCUnit.Companion.a(MegaUtils.x(map, mh1.PRICE_UNIT, str2));
                this.e = a3 != null ? a3 : str2;
                Boolean bool = Boolean.FALSE;
                MegaUtils.h(map, "useWua", bool);
                Boolean h = MegaUtils.h(map, ICallService.KEY_NEED_LOGIN, bool);
                this.f = h != null ? h.booleanValue() : false;
                NextRPCSessionOption.Companion.a(MegaUtils.x(map, "sessionOption", "AUTO_LOGIN_ONLY"));
                MegaUtils.x(map, "ttid", null);
                int i = 30000;
                Integer m = MegaUtils.m(map, "timeout", 30000);
                this.g = m != null ? m.intValue() : i;
                this.h = MegaUtils.s(map, "extHeaders");
                this.i = MegaUtils.s(map, "extQuerys");
                MegaUtils.x(map, ov2.ALIPAY_ACCOUNT_SITE, null);
                this.j = MegaUtils.x(map, "topic", null);
                MegaUtils.j(map, "prefetchTimeout", Double.valueOf(5000.0d));
                String str3 = "ORIGINAL_JSON";
                String a4 = NextRPCResponseType.Companion.a(MegaUtils.x(map, "responseType", str3));
                this.k = a4 != null ? a4 : str3;
                this.l = MegaUtils.x(map, "mpHost", null);
                MegaUtils.h(map, "retryForbidden", bool);
                this.m = MegaUtils.h(map, "enableUpCompress", null);
                return;
            }
            throw new RuntimeException("v 参数必传！");
        }
        throw new RuntimeException("api 参数必传！");
    }
}
