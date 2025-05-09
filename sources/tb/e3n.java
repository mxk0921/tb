package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class e3n extends a90 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FrameLayout c;
    public ImageView d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;

        public a(Context context) {
            this.b = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            e3n.s(e3n.this);
            if (e3n.r(e3n.this) != null) {
                View.OnClickListener r = e3n.r(e3n.this);
                if (r != null) {
                    r.onClick(view);
                    return;
                }
                return;
            }
            Context context = this.b;
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        }
    }

    static {
        t2o.a(844103779);
    }

    public static /* synthetic */ Object ipc$super(e3n e3nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/titlebar/action/PubLoadingBackAction");
    }

    public static final /* synthetic */ View.OnClickListener r(e3n e3nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("1106f4e7", new Object[]{e3nVar});
        }
        e3nVar.getClass();
        return null;
    }

    public static final /* synthetic */ ITMSPage s(e3n e3nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("574fd22e", new Object[]{e3nVar});
        }
        return e3nVar.k();
    }

    @Override // tb.a90
    public View l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1ed25ea8", new Object[]{this, context});
        }
        ckf.g(context, "context");
        if (this.c == null) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, xcs.a(context, 48.0f)));
            frameLayout.setContentDescription("返回");
            frameLayout.setOnClickListener(new a(context));
            this.c = frameLayout;
            ImageView imageView = new ImageView(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(xcs.a(context, 39.0f), xcs.a(context, 26.0f));
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setBackgroundResource(R.drawable.tms_pub_title_back_bg_dark);
            imageView.setImageResource(R.drawable.tms_pub_back);
            imageView.setPadding(xcs.a(context, 17.5f), xcs.a(context, 6.5f), xcs.a(context, 14.75f), xcs.a(context, 6.5f));
            this.d = imageView;
            FrameLayout frameLayout2 = this.c;
            if (frameLayout2 != null) {
                frameLayout2.addView(imageView);
            }
        }
        return this.c;
    }

    @Override // tb.a90
    public void q(Window.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4570c", new Object[]{this, theme});
            return;
        }
        ckf.g(theme, "style");
        if (Window.Theme.LIGHT == theme) {
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.tms_pub_white);
            }
            ImageView imageView2 = this.d;
            if (imageView2 != null) {
                imageView2.setBackgroundResource(R.drawable.tms_pub_title_back_bg_light);
                return;
            }
            return;
        }
        ImageView imageView3 = this.d;
        if (imageView3 != null) {
            imageView3.setImageResource(R.drawable.tms_pub_back);
        }
        ImageView imageView4 = this.d;
        if (imageView4 != null) {
            imageView4.setBackgroundResource(R.drawable.tms_pub_title_back_bg_dark);
        }
    }
}
