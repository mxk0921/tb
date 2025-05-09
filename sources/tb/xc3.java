package tb;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.widget.refresh.CartCustomProgressBar;
import com.taobao.ptr.PtrLayout;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xc3 implements l2n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private PtrLayout f31294a;
    private View b;
    private TextView c;
    private ImageView d;
    private ProgressBar e;
    private CartCustomProgressBar f;
    private int g;
    private l2n h;

    static {
        t2o.a(478151107);
        t2o.a(632291344);
    }

    public xc3(PtrLayout ptrLayout) {
        this.f31294a = ptrLayout;
    }

    private float c(float f) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de251b6d", new Object[]{this, new Float(f)})).floatValue();
        }
        View view = this.b;
        if (view != null) {
            i = view.getHeight();
        }
        return Math.abs(f) / i;
    }

    private void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcc4558b", new Object[]{this, view});
        } else if (view != null) {
            view.clearAnimation();
            view.setVisibility(0);
        }
    }

    private void e(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c3ebcd", new Object[]{this, charSequence});
            return;
        }
        TextView textView = this.c;
        if (textView != null && charSequence != null) {
            textView.setText(charSequence);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6d4366", new Object[]{this});
            return;
        }
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    @Override // tb.l2n
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("15436c13", new Object[]{this, viewGroup});
        }
        if (!vav.a(c9x.CART_BIZ_NAME, "enableReusePtrLoadingInflate", true)) {
            this.b = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.icart_cart_ptr_loading_vertical, viewGroup, false);
            f();
        } else if (this.b == null) {
            this.b = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.icart_cart_ptr_loading_vertical, viewGroup, false);
            f();
        }
        ViewParent parent = this.b.getParent();
        if ((parent instanceof ViewGroup) && parent != viewGroup) {
            ((ViewGroup) parent).removeView(this.b);
        }
        if (this.h != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.b;
            viewGroup2.removeAllViews();
            this.c = null;
            this.e = null;
            viewGroup2.addView(this.h.a(viewGroup2));
        } else {
            if (this.c == null) {
                View findViewById = this.b.findViewById(R.id.tv_ptr_label);
                if (findViewById instanceof TextView) {
                    this.c = (TextView) findViewById;
                }
            }
            if (this.d == null) {
                View findViewById2 = this.b.findViewById(R.id.iv_ptr_indicator);
                if (findViewById2 instanceof ImageView) {
                    this.d = (ImageView) findViewById2;
                }
            }
            if (this.e == null) {
                View findViewById3 = this.b.findViewById(R.id.pb_ptr_progress);
                if (findViewById3 instanceof ProgressBar) {
                    this.e = (ProgressBar) findViewById3;
                }
            }
            if (this.f == null) {
                View findViewById4 = this.b.findViewById(R.id.cpb_ptr_progress);
                if (findViewById4 instanceof CartCustomProgressBar) {
                    this.f = (CartCustomProgressBar) findViewById4;
                }
            }
            e(Localization.q(R.string.app_pull_up_to_load));
            TextView textView = this.c;
            if (textView != null) {
                textView.setTextColor(-15658735);
            }
        }
        return this.b;
    }

    @Override // tb.l2n
    public int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40eac2eb", new Object[]{this, new Integer(i)})).intValue();
        }
        return 0;
    }

    public void g(l2n l2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72bc5a54", new Object[]{this, l2nVar});
        } else {
            this.h = l2nVar;
        }
    }

    public void h(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75543c61", new Object[]{this, colorStateList});
            return;
        }
        TextView textView = this.c;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    @Override // tb.l2n
    public void onCompleteUpdate(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fc67cc", new Object[]{this, charSequence});
            return;
        }
        CartCustomProgressBar cartCustomProgressBar = this.f;
        if (cartCustomProgressBar != null) {
            cartCustomProgressBar.setVisibility(0);
        }
        ProgressBar progressBar = this.e;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(charSequence);
        }
        l2n l2nVar = this.h;
        if (l2nVar != null) {
            l2nVar.onCompleteUpdate(charSequence);
        }
    }

    @Override // tb.l2n
    public void onFreeze(boolean z, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2222633b", new Object[]{this, new Boolean(z), charSequence});
            return;
        }
        if (z) {
            CartCustomProgressBar cartCustomProgressBar = this.f;
            if (cartCustomProgressBar != null) {
                cartCustomProgressBar.setVisibility(8);
            }
            ProgressBar progressBar = this.e;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.c;
            if (textView != null) {
                textView.setText(charSequence);
            }
        } else {
            CartCustomProgressBar cartCustomProgressBar2 = this.f;
            if (cartCustomProgressBar2 != null) {
                cartCustomProgressBar2.setVisibility(0);
            }
            ProgressBar progressBar2 = this.e;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
            }
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.c.setText(Localization.q(R.string.app_pull_up_to_load));
            }
        }
        l2n l2nVar = this.h;
        if (l2nVar != null) {
            l2nVar.onFreeze(z, charSequence);
        }
    }

    @Override // tb.l2n
    public void onPull(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620c25d5", new Object[]{this, new Float(f)});
            return;
        }
        float c = c(f);
        if (c < 1.0d) {
            TextView textView = this.c;
            if (textView != null) {
                textView.setText(Localization.q(R.string.app_pull_up_to_load));
            }
        } else {
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setText(Localization.q(R.string.taobao_app_1028_1_21638));
            }
        }
        d(this.d);
        CartCustomProgressBar cartCustomProgressBar = this.f;
        if (cartCustomProgressBar != null && cartCustomProgressBar.getVisibility() == 0) {
            this.f.onPullDownDistance(c);
        }
        ProgressBar progressBar = this.e;
        if (progressBar != null && progressBar.getVisibility() == 0) {
            this.e.setVisibility(8);
        }
        l2n l2nVar = this.h;
        if (l2nVar != null) {
            l2nVar.onPull(f);
        }
    }

    @Override // tb.l2n
    public void onRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def893ed", new Object[]{this});
            return;
        }
        TextView textView = this.c;
        if (textView != null) {
            if (textView.getVisibility() == 8) {
                this.c.setVisibility(0);
            }
            this.c.setText(Localization.q(R.string.app_loading_progress));
        }
        CartCustomProgressBar cartCustomProgressBar = this.f;
        if (cartCustomProgressBar != null && cartCustomProgressBar.getVisibility() == 0) {
            this.f.setVisibility(8);
        }
        ProgressBar progressBar = this.e;
        if (progressBar != null && progressBar.getVisibility() == 8) {
            this.e.setVisibility(0);
        }
        l2n l2nVar = this.h;
        if (l2nVar != null) {
            l2nVar.onRefreshing();
        }
    }

    @Override // tb.l2n
    public void onRelease(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd47c3f1", new Object[]{this, new Float(f)});
            return;
        }
        if (c(f) >= 1.0d) {
            yua.e(this.d);
        }
        l2n l2nVar = this.h;
        if (l2nVar != null) {
            l2nVar.onRelease(f);
        }
    }

    @Override // tb.l2n
    public void onReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b89f37", new Object[]{this});
            return;
        }
        TextView textView = this.c;
        if (textView != null) {
            if (textView.getVisibility() == 8) {
                this.c.setVisibility(0);
            }
            this.c.setText(Localization.q(R.string.app_pull_up_to_load));
        }
        d(this.d);
        CartCustomProgressBar cartCustomProgressBar = this.f;
        if (cartCustomProgressBar != null) {
            cartCustomProgressBar.reset();
            if (this.f.getVisibility() == 8) {
                this.f.setVisibility(0);
            }
        }
        ProgressBar progressBar = this.e;
        if (progressBar != null && progressBar.getVisibility() == 0) {
            this.e.setVisibility(8);
        }
        l2n l2nVar = this.h;
        if (l2nVar != null) {
            l2nVar.onReset();
        }
    }

    @Override // tb.l2n
    public void onUpdateDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e55ce5", new Object[]{this, new Integer(i)});
            return;
        }
        this.g = i;
        l2n l2nVar = this.h;
        if (l2nVar != null) {
            l2nVar.onUpdateDirection(i);
        }
    }
}
