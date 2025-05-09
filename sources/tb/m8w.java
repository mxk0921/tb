package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m8w extends gr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String g = "VideoLayer";
    private static final String h = "VideoLayer";
    private final prp e;
    private View f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                ((ici) m8w.P(m8w.this)).I0().a0(view.getPivotX(), view.getPivotY());
            }
        }
    }

    static {
        t2o.a(468714036);
    }

    public m8w(FluidContext fluidContext, prp prpVar) {
        super(fluidContext, prpVar);
        this.e = prpVar;
    }

    public static /* synthetic */ uq9 P(m8w m8wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uq9) ipChange.ipc$dispatch("efb3f79f", new Object[]{m8wVar});
        }
        return m8wVar.c;
    }

    public static /* synthetic */ prp Q(m8w m8wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (prp) ipChange.ipc$dispatch("8fd9abf7", new Object[]{m8wVar});
        }
        return m8wVar.e;
    }

    public static /* synthetic */ Object ipc$super(m8w m8wVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/layer/video/VideoLayer");
    }

    @Override // tb.ojc
    public String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17e2e1f3", new Object[]{this});
        }
        return "VideoLayer";
    }

    public View R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fcb37d06", new Object[]{this});
        }
        return this.f;
    }

    public void S(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("415b0d73", new Object[]{this, view});
        } else if (view != null) {
            view.setTag(R.id.fluid_sdk_tag_is_preload_video, Boolean.TRUE);
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            uq9 uq9Var = this.c;
            if ((uq9Var instanceof ici) && ((ici) uq9Var).I0() != null && ((ici) this.c).I0().V()) {
                ViewProxy.setOnClickListener(view, new a());
            }
        }
    }

    public void U(View view, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a4f1428", new Object[]{this, view, layoutParams});
        } else if (view != null) {
            ((IFeedsListService) this.b.getService(IFeedsListService.class)).runOnLayoutSafe((ViewGroup) this.e.W(), new b(view, layoutParams), "onVideoViewUpdated");
        }
    }

    public void V(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74e4ea02", new Object[]{this, view});
        } else {
            this.f = view;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f23856a;
        public final /* synthetic */ FrameLayout.LayoutParams b;

        public b(View view, FrameLayout.LayoutParams layoutParams) {
            this.f23856a = view;
            this.b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String I = nwv.I(this.f23856a.getTag(R.id.fluid_sdk_content_key), "");
            ir9.b("VideoLayer", "videoLayer,update, view: " + this.f23856a + " ,layoutParams width:" + this.b.width + " height:" + this.b.height);
            if (TextUtils.isEmpty(I) || TextUtils.isEmpty(m8w.Q(m8w.this).P()) || TextUtils.equals(I, m8w.Q(m8w.this).P())) {
                khl.c(this.f23856a);
                this.b.gravity = 1;
                m8w.Q(m8w.this).x1().Q().addView(this.f23856a, 0, this.b);
                return;
            }
            ir9.b("VideoLayer", "video view not match contentview: " + I + "," + m8w.Q(m8w.this).P());
        }
    }

    public void T(View view, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427e2454", new Object[]{this, view, layoutParams});
        } else if (view != null) {
            ir9.b("VideoLayer", "onCoverViewUpdate, view: " + view);
            layoutParams.gravity = 1;
            this.e.x1().Q().addView(view, 0, layoutParams);
        }
    }
}
