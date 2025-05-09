package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class m3h implements u4e, clc, c0d, v9b, qlc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile m3h f23753a;

    static {
        t2o.a(779092270);
        t2o.a(779093486);
        t2o.a(779093411);
        t2o.a(779093393);
        t2o.a(779093406);
        t2o.a(779093392);
        t2o.a(779093395);
    }

    public static m3h e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m3h) ipChange.ipc$dispatch("9d31a93c", new Object[0]);
        }
        if (f23753a == null) {
            synchronized (m3h.class) {
                try {
                    if (f23753a == null) {
                        f23753a = new m3h();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23753a;
    }

    @Override // tb.qlc
    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce5e2af", new Object[]{this, new Integer(i), obj});
        } else {
            qmh.f().e.b("liveRoom", i, obj);
        }
    }

    @Override // tb.qlc
    public void b(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d56b849", new Object[]{this, tLiveMsg});
        } else {
            qmh.f().e.a("liveRoom", tLiveMsg);
        }
    }

    @Override // tb.qlc
    public void c(int i, int i2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a9d0126", new Object[]{this, new Integer(i), new Integer(i2), str, str2});
        } else {
            qmh.f().e.c("liveRoom", i, i2, str, str2);
        }
    }

    @Override // tb.qlc
    public void d(int i, int i2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5608598d", new Object[]{this, new Integer(i), new Integer(i2), str, str2});
        } else {
            qmh.f().e.d("liveRoom", i, i2, str, str2);
        }
    }

    public void f(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d27f62b", new Object[]{this, str, str2, str3, str4, str5});
        } else {
            qmh.f().d.a("liveRoom", str, str2, str3, str4, str5);
        }
    }

    public void g(NetRequest netRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e58070cc", new Object[]{this, netRequest});
        } else {
            qmh.f().c.a("liveRoom", netRequest);
        }
    }

    public void h(int i, NetRequest netRequest, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8493476", new Object[]{this, new Integer(i), netRequest, netResponse, obj});
        } else {
            qmh.f().c.b("liveRoom", i, netRequest, netResponse, obj);
        }
    }

    public void i(int i, NetRequest netRequest, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("715037d3", new Object[]{this, new Integer(i), netRequest, netResponse, netBaseOutDo, obj});
        } else {
            qmh.f().c.c("liveRoom", i, netRequest, netResponse, netBaseOutDo, obj);
        }
    }

    public void j(int i, NetRequest netRequest, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82971d47", new Object[]{this, new Integer(i), netRequest, netResponse, obj});
        } else {
            qmh.f().c.d("liveRoom", i, netRequest, netResponse, obj);
        }
    }

    public void k(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28f5fa44", new Object[]{this, str, str2, str3, str4});
        } else if (str != null && str2 != null && str3 != null && str4 != null) {
            qmh.f().b.a("liveRoom", str, str2, str3, str4);
        }
    }

    public void l(NetRequest netRequest, NetResponse netResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd95d824", new Object[]{this, netRequest, netResponse});
        } else {
            qmh.f().c.e("liveRoom", netRequest, netResponse);
        }
    }

    public void m(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f29b97", new Object[]{this, obj});
        } else {
            qmh.f().f26825a.a("liveRoom", obj);
        }
    }

    public void n(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b70f26b", new Object[]{this, str, str2, map});
        } else {
            qmh.f().f26825a.b("liveRoom", str, str2, map);
        }
    }

    public void o(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6bc7905", new Object[]{this, str, str2, strArr});
        } else if (strArr != null && strArr.length > 0) {
            HashMap hashMap = new HashMap();
            for (String str3 : strArr) {
                if (!TextUtils.isEmpty(str3)) {
                    String[] split = str3.split("=");
                    if (split.length == 2) {
                        hashMap.put(split[0], split[1]);
                    }
                }
            }
            n(str, str2, hashMap);
        }
    }

    public void p(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9fba64", new Object[]{this, str, str2, map});
        } else {
            qmh.f().f26825a.c("liveRoom", str, str2, map);
        }
    }

    public void q(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60e9531", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
        } else {
            qmh.f().f26825a.d("liveRoom", str, Integer.valueOf(i), str2, str3, str4, map);
        }
    }

    public void r(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d98bbee", new Object[]{this, str, str2, map});
        } else {
            qmh.f().f26825a.e("liveRoom", str, str2, map);
        }
    }

    public void s(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be12fe50", new Object[]{this, obj, str});
        } else {
            qmh.f().f26825a.g("liveRoom", obj, str);
        }
    }

    public void t(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{this, obj, map});
        } else {
            qmh.f().f26825a.h("liveRoom", obj, map);
        }
    }
}
