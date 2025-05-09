package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.inspector.InspectorNativeAgent;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wuj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f30935a;
    public final String b;
    public JSONObject c;
    public String d;

    static {
        t2o.a(649068594);
    }

    public wuj(String str) {
        this.d = "Other";
        this.f30935a = str;
        this.b = lcn.c("NetReq");
        h("other");
    }

    public static void i(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbac2d44", new Object[]{str, str2, str3, str4});
        } else if (zbf.a() && !TextUtils.isEmpty(str)) {
            InspectorNativeAgent.networkSetLoader(str, str2, str3, str4);
        }
    }

    public void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("468c3af9", new Object[]{this, bArr});
        } else if (zbf.a() && bArr != null) {
            InspectorNativeAgent.networkDataReceived(this.f30935a, this.b, bArr, 0L);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98da566a", new Object[]{this, str});
        } else if (zbf.a()) {
            InspectorNativeAgent.networkLoadingFailed(this.f30935a, this.b, this.d, str, null, 0L);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("591cf755", new Object[]{this});
        } else if (zbf.a()) {
            InspectorNativeAgent.networkLoadingFinished(this.f30935a, this.b, 0, 0L);
        }
    }

    public void d(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85cada36", new Object[]{this, new Integer(i), new Long(j)});
        } else if (zbf.a()) {
            InspectorNativeAgent.networkLoadingFinished(this.f30935a, this.b, i, j);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9e1e3b", new Object[]{this});
        } else if (zbf.a()) {
            InspectorNativeAgent.networkRequestServedFromCache(this.f30935a, this.b);
        }
    }

    public void f(euj eujVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f30a63f", new Object[]{this, eujVar});
        } else if (zbf.a() && eujVar != null) {
            InspectorNativeAgent.networkRequestWillBeSent(this.f30935a, this.b, this.d, this.c, eujVar);
        }
    }

    public void g(kuj kujVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59042127", new Object[]{this, kujVar});
        } else if (zbf.a() && kujVar != null) {
            InspectorNativeAgent.networkResponseReceived(this.f30935a, this.b, this.d, kujVar);
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81826fe", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            this.c = jSONObject;
            try {
                jSONObject.put("type", str);
            } catch (JSONException unused) {
            }
        }
    }

    public wuj(String str, String str2) {
        this.d = "Other";
        this.f30935a = str;
        if (TextUtils.isEmpty(str2)) {
            this.b = lcn.c("NetReq");
        } else {
            this.b = str2;
        }
        h("other");
    }
}
