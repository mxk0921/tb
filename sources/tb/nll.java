package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nll {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final nll b = new nll();

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f24810a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24811a;

        public a(Context context) {
            this.f24811a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                nll.a(nll.this, JSON.parseObject(yg9.b(this.f24811a, "pageconfig/page.json")));
            }
        }
    }

    static {
        t2o.a(153092140);
    }

    public static /* synthetic */ JSONObject a(nll nllVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c048c1e8", new Object[]{nllVar, jSONObject});
        }
        nllVar.f24810a = jSONObject;
        return jSONObject;
    }

    public static nll c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nll) ipChange.ipc$dispatch("3d11e403", new Object[0]);
        }
        return b;
    }

    public static void e(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd474934", new Object[]{context, new Boolean(z)});
        } else if (c().f24810a == null) {
            c().d(context, z);
        }
    }

    public JSONObject b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f153a7d8", new Object[]{this, context, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f24810a == null && context != null) {
            d(context, false);
        }
        JSONObject jSONObject = this.f24810a;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject(str);
    }

    public final void d(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bbf412d", new Object[]{this, context, new Boolean(z)});
        } else if (context != null) {
            if (z) {
                new Thread(new a(context), "PageConfigDataProvider");
            } else {
                this.f24810a = JSON.parseObject(yg9.b(context, "pageconfig/page.json"));
            }
        }
    }
}
