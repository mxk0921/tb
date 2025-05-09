package tb;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.arflow.ARTryViewContainer;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ARTryViewContainer f20553a;
    public b b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a(boolean z, String str, String str2);
    }

    static {
        t2o.a(440401927);
    }

    public static /* synthetic */ b a(hd hdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("9ec0982e", new Object[]{hdVar});
        }
        return hdVar.b;
    }

    public void b(ARTryViewContainer aRTryViewContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0978fe0", new Object[]{this, aRTryViewContainer});
        } else {
            this.f20553a = aRTryViewContainer;
        }
    }

    public void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e3c9e2", new Object[]{this, bVar});
        } else {
            this.b = bVar;
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a6f678b", new Object[]{this, str});
            return;
        }
        ARTryViewContainer aRTryViewContainer = this.f20553a;
        if (aRTryViewContainer != null) {
            this.f20553a.takePicture(new a(str, aRTryViewContainer.getContext()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements pkd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20554a;
        public final /* synthetic */ Context b;

        /* compiled from: Taobao */
        /* renamed from: tb.hd$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0938a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f20555a;

            public RunnableC0938a(String str) {
                this.f20555a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    rf7.b(this.f20555a);
                }
            }
        }

        public a(String str, Context context) {
            this.f20554a = str;
            this.b = context;
        }

        @Override // tb.pkd
        public void sendResult(boolean z, JSONObject jSONObject) {
            Thread thread;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94051768", new Object[]{this, new Boolean(z), jSONObject});
            } else if (!z || jSONObject.getJSONObject("extra") == null || jSONObject.getJSONObject("extra").getJSONObject("snapshotInfo") == null) {
                hd.a(hd.this).a(false, "internalError", null);
            } else {
                String string = jSONObject.getJSONObject("extra").getJSONObject("snapshotInfo").getString("frame_uri");
                try {
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            List<clv> g = rf7.g(this.f20554a, this.b, Collections.singletonMap("capture", BitmapFactory.decodeFile(string)));
                            if (hd.a(hd.this) != null) {
                                if (g == null || g.size() <= 0 || !g.get(0).k()) {
                                    hd.a(hd.this).a(false, "ARMakeupView#UploadError", "");
                                } else {
                                    hd.a(hd.this).a(true, g.get(0).g(), g.get(0).i());
                                }
                            }
                            thread = new Thread(new RunnableC0938a(string), "ar_makeup_cleanup");
                        } catch (Exception e) {
                            e.printStackTrace();
                            hd.a(hd.this).a(false, Log.getStackTraceString(e), null);
                            thread = new Thread(new RunnableC0938a(string), "ar_makeup_cleanup");
                        }
                        thread.start();
                    }
                } catch (Throwable th) {
                    new Thread(new RunnableC0938a(string), "ar_makeup_cleanup").start();
                    throw th;
                }
            }
        }
    }
}
