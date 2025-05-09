package com.taobao.android.riverlogger.inspector;

import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLRemoteConnectCallback;
import org.json.JSONObject;
import tb.kpw;
import tb.m7h;
import tb.mcn;
import tb.nsw;
import tb.qcn;
import tb.t2o;
import tb.x24;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RVLWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private m7h _localChannel;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements RVLRemoteConnectCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f9300a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.riverlogger.inspector.RVLWVPlugin$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC0481a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f9301a;
            public final /* synthetic */ String b;

            public RunnableC0481a(boolean z, String str) {
                this.f9301a = z;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                nsw nswVar = new nsw();
                if (this.f9301a) {
                    a.this.f9300a.success(nswVar);
                    return;
                }
                String str = this.b;
                if (str == null) {
                    str = "Unknown error";
                }
                nswVar.b("msg", str);
                a.this.f9300a.error(nswVar);
            }
        }

        public a(WVCallBackContext wVCallBackContext) {
            this.f9300a = wVCallBackContext;
        }

        @Override // com.taobao.android.riverlogger.RVLRemoteConnectCallback
        public void finish(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db6055c4", new Object[]{this, new Boolean(z), str});
            } else {
                RVLWVPlugin.access$000(RVLWVPlugin.this).post(new RunnableC0481a(z, str));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements x24 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f9302a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ JSONObject f9303a;

            public a(JSONObject jSONObject) {
                this.f9303a = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                nsw nswVar = new nsw();
                nswVar.h(this.f9303a);
                b.this.f9302a.success(nswVar);
            }
        }

        public b(WVCallBackContext wVCallBackContext) {
            this.f9302a = wVCallBackContext;
        }

        @Override // tb.x24
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81eeca1f", new Object[]{this, jSONObject});
            } else {
                RVLWVPlugin.access$000(RVLWVPlugin.this).post(new a(jSONObject));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements x24 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f9304a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ JSONObject f9305a;

            public a(JSONObject jSONObject) {
                this.f9305a = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                nsw nswVar = new nsw();
                nswVar.h(this.f9305a);
                nswVar.k();
                c.this.f9304a.successAndKeepAlive(nswVar.m());
            }
        }

        public c(WVCallBackContext wVCallBackContext) {
            this.f9304a = wVCallBackContext;
        }

        @Override // tb.x24
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81eeca1f", new Object[]{this, jSONObject});
            } else {
                RVLWVPlugin.access$000(RVLWVPlugin.this).post(new a(jSONObject));
            }
        }
    }

    static {
        t2o.a(649068596);
    }

    public static /* synthetic */ Handler access$000(RVLWVPlugin rVLWVPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("3639b31c", new Object[]{rVLWVPlugin});
        }
        return rVLWVPlugin.mainHandler;
    }

    private m7h getLocalChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m7h) ipChange.ipc$dispatch("4cbeed90", new Object[]{this});
        }
        if (this._localChannel == null) {
            this._localChannel = new m7h();
        }
        return this._localChannel;
    }

    public static /* synthetic */ Object ipc$super(RVLWVPlugin rVLWVPlugin, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/riverlogger/inspector/RVLWVPlugin");
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        m7h m7hVar = this._localChannel;
        if (m7hVar != null) {
            m7hVar.i("local page close");
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, "openRemote")) {
            JSONObject b2 = qcn.b(str2);
            if (b2 != null) {
                str3 = b2.optString("server");
                if (str3.isEmpty()) {
                    str3 = b2.optString("appWsUrl");
                    str4 = b2.optString("debugId");
                } else {
                    str4 = b2.optString("id");
                }
            } else {
                str3 = null;
                str4 = null;
            }
            mcn.d(str3, str4, new a(wVCallBackContext));
            return true;
        } else if (TextUtils.equals(str, "postLocalMessage")) {
            getLocalChannel().G(qcn.b(str2), new b(wVCallBackContext));
            return true;
        } else if (!TextUtils.equals(str, "subscribeLocalMessage")) {
            return false;
        } else {
            getLocalChannel().I(qcn.b(str2), new c(wVCallBackContext));
            return true;
        }
    }
}
