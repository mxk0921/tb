package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fln implements d0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f19391a = {"http://pre-tmq2.alibaba-inc.com/api/tmqsdk/apm/uploadRealTime"};
    public static final String[] b = {"http://tmq-service.taobao.org/api/tmqsdk/apm/uploadRealTime"};

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d31925f", new Object[]{str, str2});
        } else {
            cst.c(new a(str, str2));
        }
    }

    @Override // tb.d0d
    public void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4384fd91", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(v5r.d)) {
                c(str, str2);
            }
        } catch (Throwable th) {
            zq6.a("RealtimeTmqUploadSender", th);
        }
    }

    public final String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7896b2cd", new Object[]{this, str});
        }
        String[] split = str.split("/");
        return split[split.length - 1];
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19392a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f19392a = str;
            this.b = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r3v12, types: [java.net.HttpURLConnection, java.net.URLConnection] */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Unknown variable types count: 1 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.fln.a.run():void");
        }
    }

    public final void c(String str, String str2) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ed5c78", new Object[]{this, str, str2});
            return;
        }
        if (v5r.f29797a == 1) {
            strArr = f19391a;
        } else {
            strArr = b;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("simpleTopic", (Object) d(str));
        jSONObject.put("utdid", (Object) oua.g);
        jSONObject.put("traceId", (Object) v5r.d);
        jSONObject.put("traceIdSource", (Object) v5r.e);
        jSONObject.put("apmData", (Object) str2);
        for (String str3 : strArr) {
            zq6.a("RealtimeTmqUploadSender", "requestUrl", str3, "simpleTopic", d(str));
            b(str3, jSONObject.toJSONString());
        }
    }
}
