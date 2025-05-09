package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.IImageAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class r2n extends a90 implements ahb, iec {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView d;
    public ImageView e;
    public View f;
    public Context g;
    public Integer h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
    }

    static {
        t2o.a(844103748);
        t2o.a(835715173);
        t2o.a(835715179);
    }

    public r2n() {
        this(null, 1, null);
    }

    public static /* synthetic */ Object ipc$super(r2n r2nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/titlebar/action/PubAppNameAction");
    }

    @Override // tb.iec
    public void b(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b47adda", new Object[]{this, drawable});
            return;
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        }
        View view = this.f;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // tb.iec
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84501600", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ImageView imageView = this.e;
            if (imageView != null) {
                imageView.setVisibility(0);
                IImageAdapter.b bVar = new IImageAdapter.b();
                bVar.f("HEIGHT_LIMIT");
                IImageAdapter iImageAdapter = (IImageAdapter) p8s.b(IImageAdapter.class);
                if (iImageAdapter != null) {
                    ckf.d(str);
                    iImageAdapter.setImageUrl(imageView, str, bVar);
                }
            }
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    @Override // tb.ahb
    public void d(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32af8e77", new Object[]{this, num});
        } else if (num == null) {
            this.h = null;
        } else {
            try {
                TextView textView = this.d;
                if (textView != null) {
                    textView.setTextColor(num.intValue());
                }
                this.h = num;
            } catch (Throwable th) {
                TMSLogger.c("PubAppNameAction", th.getMessage(), th);
            }
        }
    }

    @Override // tb.a90
    public void q(Window.Theme theme) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4570c", new Object[]{this, theme});
            return;
        }
        ckf.g(theme, "style");
        if (this.h == null && (textView = this.d) != null) {
            textView.setTextColor(theme == Window.Theme.LIGHT ? -1 : Color.parseColor("#333333"));
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c362", new Object[]{this});
            return;
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.leftMargin = xcs.a(this.g, 7.0f);
                imageView.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        TextView textView = this.d;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            if (layoutParams3 != null) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.leftMargin = xcs.a(this.g, 7.0f);
                textView.setLayoutParams(layoutParams4);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    public final void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c79264", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.d;
        if (textView != null) {
            textView.setMaxWidth(i);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setMaxWidth(i);
        }
    }

    @Override // tb.ahb
    public void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
            return;
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView = this.d;
        if (textView != null) {
            if (TextUtils.isEmpty(str)) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            textView.setText(str);
            textView.setTypeface(Typeface.defaultFromStyle(1));
        }
    }

    public r2n(a aVar) {
    }

    public /* synthetic */ r2n(a aVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : aVar);
    }

    @Override // tb.a90
    public View l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1ed25ea8", new Object[]{this, context});
        }
        ckf.g(context, "context");
        if (this.f == null) {
            View view = null;
            this.f = View.inflate(context, R.layout.tms_pub_title, null);
            this.g = context;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, xcs.a(context, 48.0f));
            layoutParams.setMargins(xcs.a(context, 5.0f), 0, 0, 0);
            View view2 = this.f;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams);
            }
            View view3 = this.f;
            View findViewById = view3 == null ? null : view3.findViewById(R.id.tvTitle);
            if (findViewById != null) {
                this.d = (TextView) findViewById;
                View view4 = this.f;
                if (view4 != null) {
                    view = view4.findViewById(R.id.imgTitleBg);
                }
                if (view != null) {
                    ImageView imageView = (ImageView) view;
                    this.e = imageView;
                    imageView.setAdjustViewBounds(true);
                    View view5 = this.f;
                    if (view5 != null) {
                        view5.setTag("PubAppNameAction");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
        }
        return this.f;
    }
}
