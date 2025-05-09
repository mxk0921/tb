package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class ly1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BaseNode";
    public String k;
    public String l;
    public JSONObject r;
    public Map<String, Object> w;

    /* renamed from: a  reason: collision with root package name */
    public long f23634a = -1;
    public String b = "";
    public String c = "";
    public String d = "";
    public long e = 0;
    public long f = 0;
    public String g = "";
    public String h = "";
    public String i = "";
    public long j = 0;
    public String m = "";
    public String n = "";
    public String o = "";
    public String p = null;
    public String q = null;
    public boolean s = false;
    public Map<String, String> t = null;
    public Map<String, Object> u = null;
    public String v = null;
    public final Map<String, Object> x = Collections.synchronizedMap(new HashMap());

    static {
        t2o.a(404750533);
    }

    public Map<String, Object> a() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("92b751d4", new Object[]{this});
        }
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new HashMap());
        this.w = synchronizedMap;
        synchronizedMap.put("sessionId", hqv.q(this.b));
        this.w.put("bizId", hqv.q(this.c));
        this.w.put("scene", hqv.q(this.d));
        this.w.put("createTime", Long.valueOf(this.e));
        this.w.put(StWindow.UPDATE_TIME, Long.valueOf(this.f));
        this.w.put("userId", hqv.q(iaa.f21189a));
        this.w.put("actionType", hqv.q(this.h));
        this.w.put("actionName", hqv.q(this.i));
        this.w.put("actionDuration", Long.valueOf(this.j));
        this.w.put("actionArgs", hqv.q(this.k));
        Map<String, String> map = this.t;
        if (map == null || map.size() <= 0) {
            str = hqv.q(this.l);
        } else if (gwv.C()) {
            str = hqv.q(hqv.e(this.u));
        } else {
            str = hqv.q(hqv.c(this.t));
        }
        this.w.put("bizArgs", str.replace("'", "''"));
        this.w.put(yj4.PARAM_IS_FIRST_ENTER, Integer.valueOf(this.s ? 1 : 0));
        this.w.put("fromScene", hqv.q(this.m));
        this.w.put("toScene", hqv.q(this.n));
        this.w.put("reserve1", hqv.q(this.o));
        this.w.put("reserve2", hqv.q(this.p));
        this.w.put("periodSessionId", s82.a().b());
        this.w.put("bizArgKVS", hqv.q(this.v));
        HashMap<String, Object> c = c();
        if (c != null && c.size() > 0) {
            this.w.putAll(c);
        }
        return this.w;
    }

    public String b() {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5dc757ea", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.v) && (map = this.u) != null && map.size() > 0) {
            this.v = new JSONObject(this.u).toJSONString();
        }
        return this.v;
    }

    public abstract HashMap<String, Object> c();
}
