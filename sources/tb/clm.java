package tb;

import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class clm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Integer f17141a;
    public Integer b;
    public final Long c;
    public final Map<String, ? extends Object> d;
    public Integer e;
    public Boolean f;
    public Boolean g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public List<String> n;

    static {
        t2o.a(1022361868);
    }

    public clm(Map<?, ?> map) {
        ckf.g(map, "data");
        this.f17141a = ht4.c(map, "type");
        this.b = ht4.c(map, "priority");
        this.c = ht4.d(map, "delay");
        Object obj = map.get("attributes");
        ArrayList arrayList = null;
        Map map2 = obj instanceof Map ? (Map) obj : null;
        this.d = map2 != null ? ht4.h(map2) : null;
        this.e = ht4.c(map, "qosLevel");
        this.f = ht4.a(map, "needACK");
        this.g = ht4.a(map, "sendFullTags");
        this.h = ht4.e(map, "timestamp");
        this.i = ht4.e(map, "messageID");
        this.j = ht4.e(map, LoggingSPCache.STORAGE_USERID);
        this.k = ht4.e(map, "topic");
        this.l = ht4.e(map, "from");
        this.m = ht4.e(map, "to");
        Object obj2 = map.get("tags");
        List list = obj2 instanceof List ? (List) obj2 : null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list) {
                String str = obj3 instanceof String ? (String) obj3 : null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            arrayList = arrayList2;
        }
        this.n = arrayList;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df3302d9", new Object[]{this});
        }
        return this.l;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e707dcd", new Object[]{this});
        }
        return this.i;
    }

    public final Boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("c8110e61", new Object[]{this});
        }
        return this.f;
    }

    public final Integer d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("4790b788", new Object[]{this});
        }
        return this.b;
    }

    public final Integer e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("74313e13", new Object[]{this});
        }
        return this.e;
    }

    public final Boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("7121b2a", new Object[]{this});
        }
        return this.g;
    }

    public final List<String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("248771f1", new Object[]{this});
        }
        return this.n;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86bed099", new Object[]{this});
        }
        return this.h;
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79c0f328", new Object[]{this});
        }
        return this.m;
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        return this.k;
    }

    public final Integer k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("1fd3c39e", new Object[]{this});
        }
        return this.f17141a;
    }

    public final String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87f5e75d", new Object[]{this});
        }
        return this.j;
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bac98bd", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21dcf7b1", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public final void o(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c43ef5", new Object[]{this, bool});
        } else {
            this.f = bool;
        }
    }

    public final void p(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6cbfaa", new Object[]{this, num});
        } else {
            this.b = num;
        }
    }

    public final void q(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5dd0a7f", new Object[]{this, num});
        } else {
            this.e = num;
        }
    }

    public final void r(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a752b4", new Object[]{this, bool});
        } else {
            this.g = bool;
        }
    }

    public final void s(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6edab93", new Object[]{this, list});
        } else {
            this.n = list;
        }
    }

    public final void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d358fe65", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public final void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12eac54e", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public final void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public final void w(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99261054", new Object[]{this, num});
        } else {
            this.f17141a = num;
        }
    }

    public final void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1670f1b9", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public final Map<String, Object> y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        return a.j(jpu.a("type", this.f17141a), jpu.a("priority", this.b), jpu.a("delay", this.c), jpu.a("attributes", this.d), jpu.a("qosLevel", this.e), jpu.a("needACK", this.f), jpu.a("sendFullTags", this.g), jpu.a("timestamp", this.h), jpu.a("messageID", this.i), jpu.a(LoggingSPCache.STORAGE_USERID, this.j), jpu.a("topic", this.k), jpu.a("from", this.l), jpu.a("to", this.m), jpu.a("tags", this.n));
    }
}
