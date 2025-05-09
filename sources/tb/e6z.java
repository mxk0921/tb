package tb;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class e6z implements sud {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ABILITY_ERROR = "error";
    public static final a Companion = new a(null);
    public static final String EVENT_ERROR_RETRY = "error_retry";

    /* renamed from: a  reason: collision with root package name */
    public wb7 f18333a;
    public final jfr<?> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(440401923);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b implements obo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.obo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3ea132f", new Object[]{this});
            } else {
                e6z.c(e6z.this).e().a(e6z.EVENT_ERROR_RETRY, null);
            }
        }
    }

    static {
        t2o.a(440401922);
        t2o.a(803209236);
    }

    public e6z(jfr<?> jfrVar) {
        ckf.g(jfrVar, "tbiContext");
        this.b = jfrVar;
    }

    public static final /* synthetic */ wb7 b(e6z e6zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wb7) ipChange.ipc$dispatch("8d00d522", new Object[]{e6zVar});
        }
        wb7 wb7Var = e6zVar.f18333a;
        if (wb7Var != null) {
            return wb7Var;
        }
        ckf.y("errorComponent");
        throw null;
    }

    public static final /* synthetic */ jfr c(e6z e6zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfr) ipChange.ipc$dispatch("a7dee512", new Object[]{e6zVar});
        }
        return e6zVar.b;
    }

    public static final /* synthetic */ void d(e6z e6zVar, wb7 wb7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3d06ec", new Object[]{e6zVar, wb7Var});
        } else {
            e6zVar.f18333a = wb7Var;
        }
    }

    @Override // tb.sud
    public void a(String str, JSONObject jSONObject, lr lrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8c347dc", new Object[]{this, str, jSONObject, lrVar});
            return;
        }
        ckf.g(str, "name");
        ckf.g(jSONObject, "params");
        try {
            if (this.f18333a == null) {
                wb7 wb7Var = new wb7(this.b.c());
                this.f18333a = wb7Var;
                wb7Var.l(new b());
            }
            wb7 wb7Var2 = this.f18333a;
            if (wb7Var2 != null) {
                wb7Var2.j();
                ViewGroup a2 = this.b.f().a();
                a2.removeAllViews();
                wb7 wb7Var3 = this.f18333a;
                if (wb7Var3 != null) {
                    a2.addView(wb7Var3.d(), new FrameLayout.LayoutParams(-1, -1));
                    wb7 wb7Var4 = this.f18333a;
                    if (wb7Var4 != null) {
                        wb7Var4.a();
                        if (lrVar != null) {
                            lrVar.a(kr.b.INSTANCE);
                            return;
                        }
                        return;
                    }
                    ckf.y("errorComponent");
                    throw null;
                }
                ckf.y("errorComponent");
                throw null;
            }
            ckf.y("errorComponent");
            throw null;
        } catch (Exception e) {
            if (lrVar != null) {
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                lrVar.a(new kr.a(-1, message));
            }
        }
    }
}
