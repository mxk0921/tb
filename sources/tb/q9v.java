package tb;

import android.content.Context;
import android.util.Base64;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class q9v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886232);
    }

    public static void a(Context context, String str, StreamRemoteMainResponse streamRemoteMainResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df352657", new Object[]{context, str, streamRemoteMainResponse});
        } else if (streamRemoteMainResponse != null) {
            try {
                String api = streamRemoteMainResponse.getApi();
                if (api != null) {
                    hav.d(str + "#UltronMtopTracer", api);
                }
                if (!(streamRemoteMainResponse.getMtopResponse() == null || streamRemoteMainResponse.getMtopResponse().getBytedata() == null)) {
                    c(context, str, streamRemoteMainResponse.getMtopResponse().getBytedata());
                    return;
                }
                c(context, str, streamRemoteMainResponse.getData());
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef8d701", new Object[]{context, str, jSONObject});
        } else {
            c(context, str, jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f26611a;
        public final /* synthetic */ String b;

        public a(Object obj, String str) {
            this.f26611a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Object obj = this.f26611a;
                if (obj instanceof byte[]) {
                    obj = new String((byte[]) obj);
                }
                if (vav.a("ultron", "compressMtopResponseOfTlog", true)) {
                    UnifyLog.k(this.b, "UltronMtopTracer", "onSuccess", "", "", UnifyLog.EventType.NET, Base64.encodeToString(zcv.a(obj.toString().getBytes(StandardCharsets.UTF_8)), 0));
                    return;
                }
                String str = this.b;
                UnifyLog.EventType eventType = UnifyLog.EventType.NET;
                UnifyLog.k(str, "UltronMtopTracer", "onSuccess", "", "", eventType, "response: " + obj);
            } catch (Throwable th) {
                hav.g(this.b, "UltronMtopTracer", th.getMessage());
            }
        }
    }

    public static void c(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff3605df", new Object[]{context, str, obj});
        } else if (context != null && str != null && obj != null && vav.a(str, "enableTraceMtop", false)) {
            long b = o9v.b(context);
            if (b < vav.e(str, "minFreeMemoSizeMBTraceMtop", 200)) {
                h15 create = h15.create(str, "doNotTraceMtopOfLowMemory");
                f9v.p(create.message("可用内存：" + b + "MB").sampling(1.0f));
                return;
            }
            pav.k(new a(obj, str));
        }
    }
}
