package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.promotion.content.TTDContentController;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class nur implements lvd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "PromotionContent";

    /* renamed from: a  reason: collision with root package name */
    public final TTDContentController f24961a;
    public boolean b;
    public final Context c;
    public final pur d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(629145633);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TTDContentController d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TTDContentController d2 = nur.this.d();
            if (d2 != null && d2.n() && (d = nur.this.d()) != null) {
                d.x();
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TTDContentController d = nur.this.d();
            if (d != null) {
                d.C();
            }
        }
    }

    static {
        t2o.a(629145632);
        t2o.a(629145628);
    }

    public nur(Context context, pur purVar) {
        ckf.g(context, "context");
        ckf.g(purVar, "model");
        this.c = context;
        this.d = purVar;
        this.f24961a = new TTDContentController(context);
    }

    public final TTDContentController d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDContentController) ipChange.ipc$dispatch("878532f9", new Object[]{this});
        }
        return this.f24961a;
    }

    @Override // tb.lvd
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        odg.d(TAG, "destroy");
        TTDContentController tTDContentController = this.f24961a;
        if (tTDContentController != null) {
            tTDContentController.r();
        }
    }

    @Override // tb.lvd
    public void disappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c72aaa", new Object[]{this});
            return;
        }
        odg.d(TAG, "disappear");
        TTDContentController tTDContentController = this.f24961a;
        if (tTDContentController != null) {
            tTDContentController.s();
        }
    }

    @Override // tb.lvd
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        TTDContentController tTDContentController = this.f24961a;
        if (tTDContentController != null) {
            return tTDContentController.j();
        }
        return null;
    }

    @Override // tb.lvd
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        odg.d(TAG, "init");
        if (!this.b) {
            this.b = true;
            TTDContentController tTDContentController = this.f24961a;
            if (tTDContentController != null) {
                tTDContentController.v(true, this.d);
            }
        }
    }

    @Override // tb.lvd
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2521a939", new Object[]{this, str, str2});
            return;
        }
        odg.d(TAG, "refreshContent");
        if (!TextUtils.isEmpty(str)) {
            TTDContentController tTDContentController = this.f24961a;
            if (tTDContentController != null) {
                tTDContentController.D(str);
            }
            TTDContentController tTDContentController2 = this.f24961a;
            if (tTDContentController2 != null) {
                tTDContentController2.F(str2);
            }
            TTDContentController tTDContentController3 = this.f24961a;
            if (tTDContentController3 != null) {
                tTDContentController3.g("all");
            }
            trt.d(new c(), 500L);
        }
    }

    @Override // tb.lvd
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6567a66", new Object[]{this, str});
            return;
        }
        odg.d(TAG, "appear");
        if (tv6.a()) {
            Toast.makeText(this.c, "这是新种草页面!!!!!!", 1).show();
        }
        TTDContentController tTDContentController = this.f24961a;
        if (tTDContentController != null) {
            tTDContentController.x();
        }
        TTDContentController tTDContentController2 = this.f24961a;
        if (tTDContentController2 != null) {
            tTDContentController2.q();
        }
    }

    @Override // tb.lvd
    public void c(pur purVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("476ce4e4", new Object[]{this, purVar});
            return;
        }
        odg.d(TAG, "refresh");
        TTDContentController tTDContentController = this.f24961a;
        if (tTDContentController != null) {
            tTDContentController.z();
        }
        TTDContentController tTDContentController2 = this.f24961a;
        if (tTDContentController2 != null) {
            tTDContentController2.v(true, purVar);
        }
        trt.c(new b());
    }

    @Override // tb.lvd
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        odg.d(TAG, "start");
        TTDContentController tTDContentController = this.f24961a;
        if (tTDContentController != null) {
            tTDContentController.t();
        }
    }

    @Override // tb.lvd
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        odg.d(TAG, "stop");
        TTDContentController tTDContentController = this.f24961a;
        if (tTDContentController != null) {
            tTDContentController.u();
        }
    }
}
