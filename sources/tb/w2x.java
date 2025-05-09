package tb;

import android.app.Activity;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.cameralink.miniapp.MiniAppContainerView;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w2x implements djb, IEmbedCallback, uae {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String f = w2x.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final c2x f30424a = new c2x();
    public JSONObject b;
    public IEmbedView c;
    public hld d;
    public boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                w2x.c();
                w2x.d(w2x.this);
            } catch (Throwable unused) {
                w2x.c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            w2x.e(w2x.this, true);
            w2x.c();
            try {
                w2x.d(w2x.this);
            } catch (Throwable unused) {
                w2x.c();
            }
        }
    }

    static {
        t2o.a(394264621);
        t2o.a(394264598);
        t2o.a(396361782);
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ void d(w2x w2xVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa24e6aa", new Object[]{w2xVar});
        } else {
            w2xVar.i();
        }
    }

    public static /* synthetic */ boolean e(w2x w2xVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3e9a31", new Object[]{w2xVar, new Boolean(z)})).booleanValue();
        }
        w2xVar.e = z;
        return z;
    }

    @Override // tb.djb
    public void a(JSONObject jSONObject) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb595427", new Object[]{this, jSONObject});
            return;
        }
        this.b = jSONObject;
        this.d.post(new a());
    }

    public void f(hld hldVar, IEmbedView iEmbedView, Activity activity, MiniAppContainerView miniAppContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25a97c61", new Object[]{this, hldVar, iEmbedView, activity, miniAppContainerView});
            return;
        }
        this.c = iEmbedView;
        this.d = hldVar;
        this.f30424a.c = new WeakReference<>(activity);
        this.f30424a.d = new WeakReference<>(miniAppContainerView);
        this.f30424a.e = this;
    }

    public final /* synthetic */ void g(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83eb97a4", new Object[]{this, wVCallBackContext});
            return;
        }
        this.e = false;
        try {
            j();
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            if (wVCallBackContext != null) {
                wVCallBackContext.error();
            }
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8953ea4", new Object[]{this, str});
        } else {
            this.f30424a.e(str);
        }
    }

    public final void i() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aee9e2e", new Object[]{this});
            return;
        }
        TextUtils.equals(this.b.getString("devicePosition"), "front");
        if (this.e) {
            this.b.put(c2x.CAMERA_LINK_VIEW_CONTAINER_KEY, (Object) this.f30424a.f);
            throw null;
        }
    }

    public final void j() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbee93a", new Object[]{this});
        }
    }

    public void k(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f530a64d", new Object[]{this, str, jSONObject});
        } else {
            this.f30424a.g(str, jSONObject);
        }
    }

    public final void l(final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a214a4f5", new Object[]{this, wVCallBackContext});
            return;
        }
        try {
            this.d.post(new Runnable() { // from class: tb.v2x
                @Override // java.lang.Runnable
                public final void run() {
                    w2x.this.g(wVCallBackContext);
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
            if (wVCallBackContext != null) {
                wVCallBackContext.error();
            }
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedCallback
    public void onResponse(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8435f409", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.djb
    public void stop() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        l(null);
        this.f30424a.f();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // tb.uae
    public boolean onAction(String str, String str2, WVCallBackContext wVCallBackContext) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5683d51", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        StringBuilder sb = new StringBuilder("life cycle: invoking onAction of webview, the action is [");
        sb.append(str);
        sb.append("] the param is [");
        sb.append(str2);
        sb.append("]");
        try {
            switch (str.hashCode()) {
                case -1824838201:
                    if (str.equals("stopCamera")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1244921198:
                    if (str.equals("skinDetectStatus")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1490029383:
                    if (str.equals("postMessage")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1953047079:
                    if (str.equals("startCamera")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.d.post(new b());
                wVCallBackContext.success();
            } else if (c == 1) {
                l(wVCallBackContext);
            } else if (c == 2) {
                wVCallBackContext.success();
            } else if (c == 3) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("postMessage", (Object) JSON.parseObject(str2));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("errorMessage", (Object) jSONObject);
                this.c.sendEvent("error", jSONObject2, null);
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            wVCallBackContext.error();
            return false;
        }
    }
}
