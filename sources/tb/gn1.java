package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class gn1 extends a90 implements xhb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "UniBackAction";
    public View.OnClickListener c;
    public ImageView d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(835715183);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;

        public b(Context context) {
            this.b = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (gn1.r(gn1.this) != null) {
                View.OnClickListener r = gn1.r(gn1.this);
                if (r != null) {
                    r.onClick(view);
                }
            } else {
                Context context = this.b;
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            View.OnClickListener r = gn1.r(gn1.this);
            if (r != null) {
                r.onClick(view);
            }
        }
    }

    static {
        t2o.a(835715182);
        t2o.a(835715174);
    }

    public static /* synthetic */ Object ipc$super(gn1 gn1Var, String str, Object... objArr) {
        if (str.hashCode() == 485366694) {
            super.i((ITMSPage) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/title/action/impl/BackAction");
    }

    public static final /* synthetic */ View.OnClickListener r(gn1 gn1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("68310e02", new Object[]{gn1Var});
        }
        return gn1Var.c;
    }

    @Override // tb.xhb
    public boolean hideBackButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddb73ce6", new Object[]{this})).booleanValue();
        }
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        return true;
    }

    @Override // tb.a90
    public void i(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cee1ba6", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        super.i(iTMSPage);
    }

    @Override // tb.a90
    public View l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1ed25ea8", new Object[]{this, context});
        }
        ckf.g(context, "context");
        if (this.d == null) {
            ImageView imageView = new ImageView(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(xcs.a(context, 28.0f), xcs.a(context, 28.0f));
            layoutParams.gravity = 17;
            layoutParams.leftMargin = xcs.a(context, 10.0f);
            imageView.setLayoutParams(layoutParams);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setContentDescription("返回");
            imageView.setTag(TAG);
            imageView.setOnClickListener(new b(context));
            this.d = imageView;
        }
        return this.d;
    }

    @Override // tb.a90
    public void q(Window.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4570c", new Object[]{this, theme});
            return;
        }
        ckf.g(theme, "style");
        if (Window.Theme.DARK == theme) {
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.tms_back_action_dark);
                return;
            }
            return;
        }
        ImageView imageView2 = this.d;
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.tms_back_action_light);
        }
    }

    public void s(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20cc06fe", new Object[]{this, onClickListener});
            return;
        }
        ckf.g(onClickListener, "clickListener");
        this.c = onClickListener;
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setOnClickListener(new c());
        }
    }

    @Override // tb.xhb
    public boolean showBackButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2041761", new Object[]{this})).booleanValue();
        }
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        return true;
    }
}
