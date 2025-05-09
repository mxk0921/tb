package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bnn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_HOME = "Page_Home";

    /* renamed from: a  reason: collision with root package name */
    public static final HandlerThread f16493a;
    public static final Handler b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f16494a;

        public a(JSONObject jSONObject) {
            this.f16494a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                r5a.m(this.f16494a, null);
            }
        }
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3520d2ed", new Object[]{jSONObject});
        } else if (Thread.currentThread() != f16493a.getLooper().getThread()) {
            b.post(new a(jSONObject));
        } else {
            r5a.m(jSONObject, null);
        }
    }

    static {
        t2o.a(729810037);
        HandlerThread a2 = wsa.a("recommend.UT");
        f16493a = a2;
        a2.start();
        b = new Handler(a2.getLooper());
    }
}
