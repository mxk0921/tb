package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ImageSearchMtopUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class p64 extends yy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String d;
    public final String e;
    public final String f;
    public final Map<String, String> g;
    public final String h;
    public final boolean i;

    static {
        t2o.a(481297346);
    }

    public p64(String str, String str2, String str3, Map<String, String> map, String str4, boolean z) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = map;
        this.h = str4;
        this.i = z;
    }

    public static /* synthetic */ Object ipc$super(p64 p64Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/pipline/node/CommonRequestNode");
    }

    @Override // tb.yy1
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b5601d", new Object[]{this});
        }
        return "CommonRequest";
    }

    @Override // tb.yy1
    public x7m k(w7m w7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7m) ipChange.ipc$dispatch("826f33b6", new Object[]{this, w7mVar});
        }
        ckf.g(w7mVar, "pipLineDS");
        if (!n4p.c()) {
            m(-10, ErrorConstant.ERRMSG_NO_NETWORK);
            return c(-10, ErrorConstant.ERRMSG_NO_NETWORK, this.i);
        } else if (TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.e)) {
            m(-18, "无效请求");
            return c(-18, "无效请求", this.i);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, String> map = this.g;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            a("apiName", this.e);
            a("appId", this.d);
            b(linkedHashMap);
            o4j t = ImageSearchMtopUtil.t(this.d, this.e, this.f, this.h, linkedHashMap, false, 32, null);
            a("mtopTraceId", t.e());
            a("eagleeyeTraceId", t.a());
            if (t.g()) {
                n();
                return f(t);
            }
            Integer b = t.b();
            int intValue = b == null ? -14 : b.intValue();
            String c = t.c();
            if (c == null) {
                c = "请求失败，原因未知";
            }
            m(intValue, c);
            return d(Integer.valueOf(intValue), c, this.i, t);
        }
    }
}
