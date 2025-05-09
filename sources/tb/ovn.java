package tb;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ImageSearchMtopUtil;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ovn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public pft f25687a;
    public final Handler b = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements ImageSearchMtopUtil.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ImageSearchMtopUtil.a b;

        /* compiled from: Taobao */
        /* renamed from: tb.ovn$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class RunnableC1019a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ImageSearchMtopUtil.a f25689a;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;
            public final /* synthetic */ Integer d;
            public final /* synthetic */ String e;

            public RunnableC1019a(ImageSearchMtopUtil.a aVar, String str, String str2, Integer num, String str3) {
                this.f25689a = aVar;
                this.b = str;
                this.c = str2;
                this.d = num;
                this.e = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f25689a.b(this.b, this.c, this.d, this.e);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ImageSearchMtopUtil.a f25690a;
            public final /* synthetic */ MtopResponse b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;
            public final /* synthetic */ JSONObject e;

            public b(ImageSearchMtopUtil.a aVar, MtopResponse mtopResponse, String str, String str2, JSONObject jSONObject) {
                this.f25690a = aVar;
                this.b = mtopResponse;
                this.c = str;
                this.d = str2;
                this.e = jSONObject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f25690a.a(this.b, this.c, this.d, this.e);
                }
            }
        }

        public a(ImageSearchMtopUtil.a aVar) {
            this.b = aVar;
        }

        @Override // com.etao.feimagesearch.util.ImageSearchMtopUtil.a
        public void a(MtopResponse mtopResponse, String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5be81ac", new Object[]{this, mtopResponse, str, str2, jSONObject});
            } else {
                ovn.a(ovn.this).post(new b(this.b, mtopResponse, str, str2, jSONObject));
            }
        }

        @Override // com.etao.feimagesearch.util.ImageSearchMtopUtil.a
        public void b(String str, String str2, Integer num, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ac2ca7b", new Object[]{this, str, str2, num, str3});
            } else {
                ovn.a(ovn.this).post(new RunnableC1019a(this.b, str, str2, num, str3));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements ImageSearchMtopUtil.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ImageSearchMtopUtil.a b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ImageSearchMtopUtil.a f25692a;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;
            public final /* synthetic */ Integer d;
            public final /* synthetic */ String e;

            public a(ImageSearchMtopUtil.a aVar, String str, String str2, Integer num, String str3) {
                this.f25692a = aVar;
                this.b = str;
                this.c = str2;
                this.d = num;
                this.e = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f25692a.b(this.b, this.c, this.d, this.e);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.ovn$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class RunnableC1020b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ImageSearchMtopUtil.a f25693a;
            public final /* synthetic */ MtopResponse b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;
            public final /* synthetic */ JSONObject e;

            public RunnableC1020b(ImageSearchMtopUtil.a aVar, MtopResponse mtopResponse, String str, String str2, JSONObject jSONObject) {
                this.f25693a = aVar;
                this.b = mtopResponse;
                this.c = str;
                this.d = str2;
                this.e = jSONObject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f25693a.a(this.b, this.c, this.d, this.e);
                }
            }
        }

        public b(ImageSearchMtopUtil.a aVar) {
            this.b = aVar;
        }

        @Override // com.etao.feimagesearch.util.ImageSearchMtopUtil.a
        public void a(MtopResponse mtopResponse, String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5be81ac", new Object[]{this, mtopResponse, str, str2, jSONObject});
            } else {
                ovn.a(ovn.this).post(new RunnableC1020b(this.b, mtopResponse, str, str2, jSONObject));
            }
        }

        @Override // com.etao.feimagesearch.util.ImageSearchMtopUtil.a
        public void b(String str, String str2, Integer num, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ac2ca7b", new Object[]{this, str, str2, num, str3});
            } else {
                ovn.a(ovn.this).post(new a(this.b, str, str2, num, str3));
            }
        }
    }

    static {
        t2o.a(481297426);
    }

    public static final /* synthetic */ Handler a(ovn ovnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("5d197318", new Object[]{ovnVar});
        }
        return ovnVar.b;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        pft pftVar = this.f25687a;
        if (pftVar != null) {
            pftVar.d(true);
        }
        this.f25687a = null;
        this.b.removeCallbacksAndMessages(null);
    }

    public final void c(Bitmap bitmap, Map<String, String> map, ImageSearchMtopUtil.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf14dabf", new Object[]{this, bitmap, map, aVar});
            return;
        }
        ckf.g(bitmap, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
        ckf.g(map, "params");
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        b();
        pft pftVar = new pft(bitmap, map, new a(aVar));
        this.f25687a = pftVar;
        pftVar.c();
    }

    public final void d(String str, RectF rectF, String str2, Map<String, String> map, ImageSearchMtopUtil.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fc5c780", new Object[]{this, str, rectF, str2, map, aVar});
            return;
        }
        ckf.g(map, "params");
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        b();
        pft pftVar = new pft(str, rectF, str2, map, new b(aVar));
        this.f25687a = pftVar;
        pftVar.c();
    }
}
