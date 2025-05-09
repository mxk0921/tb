package tb;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.pad.PadSkuFragment;
import com.taobao.android.sku.presenter.AliXSkuPresenterEngine;
import com.taobao.taobao.R;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import tb.s2q;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Ltb/zkl;", "Ltb/s2q$b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "a", "detail-sku_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zkl implements s2q.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final AtomicInteger f = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    public final PadSkuFragment f32837a;
    public final String b;
    public DialogInterface.OnDismissListener c;
    public AliXSkuPresenterEngine.b d;
    public final Context e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(442499213);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements uv2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.uv2
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9f05795", new Object[]{this, jSONObject});
                return;
            }
            AliXSkuPresenterEngine.b g = zkl.g(zkl.this);
            if (g == null || !g.onBackPressed()) {
                zkl.this.dismiss();
            }
        }

        @Override // tb.uv2
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2ca4390", new Object[]{this, jSONObject});
                return;
            }
            DialogInterface.OnDismissListener h = zkl.h(zkl.this);
            if (h != null) {
                h.onDismiss(zkl.i(zkl.this).getDialog());
            }
        }
    }

    static {
        t2o.a(442499212);
        t2o.a(442499379);
    }

    public zkl(Context context) {
        ckf.g(context, "context");
        this.e = context;
        PadSkuFragment padSkuFragment = new PadSkuFragment();
        this.f32837a = padSkuFragment;
        String str = "pad-" + f.incrementAndGet();
        this.b = str;
        Bundle bundle = new Bundle();
        bundle.putString("stdPopPopId", str);
        boolean z = false;
        bundle.putBoolean("stdPopPanEnable", false);
        bundle.putBoolean("stdPopBlockHandleBack", true);
        bundle.putBoolean("stdPopHandleBack", true);
        all allVar = all.INSTANCE;
        if (!allVar.g(context)) {
            bundle.putBoolean("useDrawerMode", (!allVar.b() || allVar.h(context)) ? true : z);
        }
        padSkuFragment.setArguments(bundle);
    }

    public static final /* synthetic */ AliXSkuPresenterEngine.b g(zkl zklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliXSkuPresenterEngine.b) ipChange.ipc$dispatch("fa9425d4", new Object[]{zklVar});
        }
        return zklVar.d;
    }

    public static final /* synthetic */ DialogInterface.OnDismissListener h(zkl zklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogInterface.OnDismissListener) ipChange.ipc$dispatch("785d032e", new Object[]{zklVar});
        }
        return zklVar.c;
    }

    public static final /* synthetic */ PadSkuFragment i(zkl zklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PadSkuFragment) ipChange.ipc$dispatch("25e8c521", new Object[]{zklVar});
        }
        return zklVar.f32837a;
    }

    @Override // tb.s2q.b
    public void a(AliXSkuPresenterEngine.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633d7b7d", new Object[]{this, cVar});
        }
    }

    @Override // tb.s2q.b
    public void b(nfb nfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8024808", new Object[]{this, nfbVar});
        } else {
            this.f32837a.C2(nfbVar);
        }
    }

    @Override // tb.s2q.b
    public void c(int i, int i2, int i3, int i4, int i5, int i6) {
        Bundle arguments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b405587", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        this.f32837a.s2(i, i2, i3, i4, i5, i6);
        if (i6 < 0 && (arguments = this.f32837a.getArguments()) != null) {
            arguments.putString("stdPopAnimation", "none");
        }
    }

    @Override // tb.s2q.b
    public void d(AliXSkuPresenterEngine.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c3841ad", new Object[]{this, bVar});
        } else {
            this.d = bVar;
        }
    }

    @Override // tb.s2q.b
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else {
            olq.a(this.e, this.b);
        }
    }

    @Override // tb.s2q.b
    public void e(DialogInterface.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29d2d87", new Object[]{this, onDismissListener});
        } else {
            this.c = onDismissListener;
        }
    }

    @Override // tb.s2q.b
    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return this.f32837a.isVisible();
    }

    @Override // tb.s2q.b
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (!this.f32837a.isVisible()) {
            olq.j(this.e, this.f32837a, new b());
        }
    }

    @Override // tb.s2q.b
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
        } else if (view != null) {
            this.f32837a.z2(view);
        }
    }

    @Override // tb.s2q.b
    public void f(int i) {
        Bundle arguments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee22c48", new Object[]{this, new Integer(i)});
            return;
        }
        this.f32837a.setStyle(0, i);
        if (R.style.Alix_Sku_TranslucentPopupDialog == i && (arguments = this.f32837a.getArguments()) != null) {
            arguments.putBoolean("stdPopModal", false);
        }
    }
}
