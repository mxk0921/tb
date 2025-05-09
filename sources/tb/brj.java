package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.i5p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class brj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "NegativeFeedbackRequest";

    /* renamed from: a  reason: collision with root package name */
    public or7 f16569a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793691);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements hk4<m4p> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public void accept(m4p m4pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63d045bb", new Object[]{this, m4pVar});
            }
        }
    }

    static {
        t2o.a(815793690);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        or7 or7Var = this.f16569a;
        if (or7Var != null && !or7Var.isDisposed()) {
            or7Var.dispose();
        }
        this.f16569a = null;
    }

    public final void b(Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfd538de", new Object[]{this, activity, map});
            return;
        }
        ckf.g(activity, "activity");
        or7 or7Var = this.f16569a;
        if (or7Var != null && !or7Var.isDisposed()) {
            or7Var.dispose();
        }
        this.f16569a = new i5p.c().c(new crj(map)).a().d().n(new b(), new u0p(TAG));
    }
}
