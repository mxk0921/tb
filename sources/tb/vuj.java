package tb;

import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.weex_framework.devtool.NetworkResourceType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.bxh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vuj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;
    public String f;
    public int c = -1;
    public NetworkResourceType d = NetworkResourceType.Other;
    public wuj e = null;
    public int g = 0;
    public int h = 0;
    public boolean i = false;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f30267a = r5x.c();

    static {
        t2o.a(982516077);
    }

    public void a(byte[] bArr) {
        wuj wujVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("468c3af9", new Object[]{this, bArr});
        } else if (bArr != null) {
            this.g += bArr.length;
            this.h++;
            if (this.f30267a && (wujVar = this.e) != null) {
                wujVar.a(bArr);
            }
        }
    }

    public void b(int i, String str) {
        wuj wujVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("223e696d", new Object[]{this, new Integer(i), str});
            return;
        }
        x6x.b(this.c, LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "finished", this.b).g(i, str).a("dataSize", Integer.valueOf(this.g)).a("chunkCount", Integer.valueOf(this.h)).f();
        if (this.f30267a && (wujVar = this.e) != null) {
            wujVar.b(str);
        }
    }

    public void c() {
        wuj wujVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("591cf755", new Object[]{this});
            return;
        }
        x6x.d(this.c, LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "finished", this.b).a("dataSize", Integer.valueOf(this.g)).a("chunkCount", Integer.valueOf(this.h)).f();
        if (this.f30267a && (wujVar = this.e) != null) {
            wujVar.d(this.g, 0L);
        }
    }

    public void d(dxh dxhVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c32f4e0", new Object[]{this, dxhVar});
        } else if (dxhVar == null) {
            b(-1001, "response is null");
        } else {
            if (!this.i) {
                boolean equals = "cache".equals(((HashMap) dxhVar.e).get("requestType"));
                if (equals) {
                    f();
                }
                try {
                    i = Integer.parseInt(dxhVar.f18133a);
                } catch (NumberFormatException unused) {
                    i = 200;
                }
                e(i, equals, dxhVar.f);
                a(dxhVar.b);
            }
            c();
        }
    }

    public void f() {
        wuj wujVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ebc94a", new Object[]{this});
        } else if (this.f30267a && (wujVar = this.e) != null) {
            wujVar.e();
        }
    }

    public void g(bxh bxhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc2be81", new Object[]{this, bxhVar});
        } else if (bxhVar != null) {
            String str = bxhVar.f16702a;
            this.b = str;
            this.f = bxhVar.c;
            bxh.a aVar = bxhVar.g;
            if (aVar != null) {
                this.c = aVar.f16703a;
                this.d = aVar.b;
            }
            icn a2 = x6x.d(this.c, LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "request", str).a("url", bxhVar.c).a("method", bxhVar.d).a("header", bxhVar.b);
            String str2 = bxhVar.e;
            if (str2 != null) {
                a2.a("bodySize", Integer.valueOf(str2.length()));
            }
            a2.f();
            if (this.f30267a) {
                if (this.e == null) {
                    this.e = new wuj(r5x.b(this.c), this.b);
                }
                this.e.d = this.d.value;
                euj eujVar = new euj(this.f);
                eujVar.b = bxhVar.d;
                eujVar.c = bxhVar.b;
                String str3 = bxhVar.e;
                if (str3 != null) {
                    eujVar.d = str3.getBytes();
                }
                this.e.f(eujVar);
            }
        }
    }

    public void e(int i, boolean z, Map<String, List<String>> map) {
        RVLLevel rVLLevel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c291198b", new Object[]{this, new Integer(i), new Boolean(z), map});
            return;
        }
        this.i = true;
        if ((i < 200 || i > 304) && i != 307) {
            rVLLevel = RVLLevel.Warn;
        } else {
            rVLLevel = RVLLevel.Info;
        }
        x6x.e(rVLLevel, this.c, LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "response", this.b).a("url", this.f).a("statusCode", Integer.valueOf(i)).a("header", map).a("zcacheInfo", null).f();
        if (this.f30267a && this.e != null) {
            kuj kujVar = new kuj(this.f);
            kujVar.b = i;
            kujVar.d = z;
            if (map != null) {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    kujVar.a(entry.getKey(), entry.getValue().get(0));
                }
            }
            JSONObject jSONObject = new JSONObject();
            kujVar.e = jSONObject;
            try {
                jSONObject.put("statusText", okq.a(String.valueOf(i)));
            } catch (JSONException unused) {
            }
            this.e.g(kujVar);
        }
    }
}
