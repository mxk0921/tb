package tb;

import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f22718a;
    public String b;
    public String c;
    public String d;
    public Map<String, List<String>> e;
    public boolean f;
    public volatile JSONObject g;
    public MtopResponse h;
    public final ok i = new ok();

    static {
        t2o.a(80740381);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        if (this.c == null) {
            this.c = this.h.getApi();
        }
        return this.c;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ca98c9bf", new Object[]{this});
        }
        if (this.g == null) {
            this.g = tj.a(c(this.h));
        }
        return this.g;
    }

    public final String c(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30cf227c", new Object[]{this, mtopResponse});
        }
        if (mtopResponse.getBytedata() == null) {
            return "";
        }
        return new String(mtopResponse.getBytedata());
    }

    public Map<String, List<String>> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.e;
    }

    public MtopResponse e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("f4ed3de", new Object[]{this});
        }
        return this.h;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d754d74", new Object[]{this});
        }
        return this.d;
    }

    public ok g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ok) ipChange.ipc$dispatch("f8bbd279", new Object[]{this});
        }
        return this.i;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f243c01", new Object[]{this});
        }
        return this.f22718a;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a526aea3", new Object[]{this});
        }
        if (this.b == null) {
            this.b = this.h.getRetMsg();
        }
        return this.b;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b780bae9", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void l(AttachedResponse attachedResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5126c41", new Object[]{this, attachedResponse});
        }
    }

    public void m(dh1 dh1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f51f52a6", new Object[]{this, dh1Var});
        }
    }

    public void n(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aace0a5", new Object[]{this, jSONObject});
        } else {
            this.g = jSONObject;
        }
    }

    public void o(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf00da", new Object[]{this, map});
        } else {
            this.e = map;
        }
    }

    public void p(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ccf090d", new Object[]{this, jSONObject});
        }
    }

    public void q(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5cb4ae", new Object[]{this, mtopResponse});
        } else {
            this.h = mtopResponse;
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38eb8fea", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void s(m7j m7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49bd31e9", new Object[]{this, m7jVar});
        }
    }

    public void t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75df560c", new Object[]{this, new Integer(i)});
        }
    }

    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c66ccfd", new Object[]{this, str});
        } else {
            this.f22718a = str;
        }
    }

    public void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f591333", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d88968c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe82bc5", new Object[]{this, str});
        }
    }
}
