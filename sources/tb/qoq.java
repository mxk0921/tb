package tb;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.stream.internal.mtop.IStreamMtopRequestCallback;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.z2k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qoq implements wdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, IStreamMtopRequestCallback> f26859a;
    public final Handler b = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26860a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ JSONObject d;

        public a(String str, String str2, String str3, JSONObject jSONObject) {
            this.f26860a = str;
            this.b = str2;
            this.c = str3;
            this.d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                qoq.b(qoq.this, this.f26860a, this.b, this.c, this.d);
            }
        }
    }

    public qoq(Map<String, IStreamMtopRequestCallback> map) {
        this.f26859a = map;
    }

    public static /* synthetic */ void b(qoq qoqVar, String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5345a28", new Object[]{qoqVar, str, str2, str3, jSONObject});
        } else {
            qoqVar.d(str, str2, str3, jSONObject);
        }
    }

    public static String c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4bdb95d", new Object[]{jSONObject});
        }
        return jSONObject.getString(z2k.d.ATTACHED_RESPONSE_HEADER_REQ_ID);
    }

    @Override // tb.wdb
    public void a(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41b304a2", new Object[]{this, str, str2, str3, jSONObject});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            d(str, str2, str3, jSONObject);
        } else {
            this.b.post(new a(str, str2, str3, jSONObject));
        }
    }

    public final void d(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c7969e", new Object[]{this, str, str2, str3, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            String c = c(jSONObject);
            UnifyLog.f("StreamAccsResponse", "Received accs data,current reqId = " + c, new Object[0]);
            for (Map.Entry<String, IStreamMtopRequestCallback> entry : this.f26859a.entrySet()) {
                IStreamMtopRequestCallback value = entry.getValue();
                if (entry.getKey().equals(c)) {
                    value.onReceiveAccsData(str, str2, str3, jSONObject);
                }
            }
        }
    }
}
