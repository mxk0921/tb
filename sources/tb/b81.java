package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
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
public final class b81 extends a90 implements ahb, iec {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView c;
    public ImageView d;
    public View e;
    public Integer f;

    static {
        t2o.a(835715181);
        t2o.a(835715173);
        t2o.a(835715179);
    }

    public static /* synthetic */ Object ipc$super(b81 b81Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/title/action/impl/AppNameAction");
    }

    @Override // tb.iec
    public void b(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b47adda", new Object[]{this, drawable});
            return;
        }
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        }
        View view = this.e;
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
            ImageView imageView = this.d;
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
            TextView textView = this.c;
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
            this.f = null;
        } else {
            try {
                TextView textView = this.c;
                if (textView != null) {
                    textView.setTextColor(num.intValue());
                }
                this.f = num;
            } catch (Throwable th) {
                TMSLogger.c("UniAppNameAction", th.getMessage(), th);
            }
        }
    }

    @Override // tb.a90
    public void q(Window.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4570c", new Object[]{this, theme});
            return;
        }
        ckf.g(theme, "style");
        TextView textView = this.c;
        if (textView != null && this.f == null) {
            textView.setTextColor(theme == Window.Theme.LIGHT ? Color.parseColor("#333333") : -1);
        }
    }

    public final void r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c79264", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setMaxWidth(i);
        }
        ImageView imageView = this.d;
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
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView = this.c;
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

    @Override // tb.a90
    public View l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1ed25ea8", new Object[]{this, context});
        }
        ckf.g(context, "context");
        if (this.e == null) {
            View view = null;
            this.e = View.inflate(context, R.layout.tms_title_action, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart(xcs.a(context, 8.0f));
            View view2 = this.e;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams);
            }
            View view3 = this.e;
            View findViewById = view3 == null ? null : view3.findViewById(R.id.tvTitle);
            if (findViewById != null) {
                TextView textView = (TextView) findViewById;
                this.c = textView;
                textView.setTextSize(1, 18.0f);
                View view4 = this.e;
                if (view4 != null) {
                    view = view4.findViewById(R.id.imgTitleBg);
                }
                if (view != null) {
                    ImageView imageView = (ImageView) view;
                    this.d = imageView;
                    imageView.setAdjustViewBounds(true);
                    View view5 = this.e;
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
        return this.e;
    }
}
