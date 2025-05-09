package tb;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PtrLayout;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class m2n implements l2n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private PtrLayout f23741a;
    private View b;
    private TextView c;
    private ProgressBar d;
    private int e;
    private l2n f;

    static {
        t2o.a(632291345);
        t2o.a(632291344);
    }

    public m2n(PtrLayout ptrLayout) {
        this.f23741a = ptrLayout;
    }

    private float c(float f) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de251b6d", new Object[]{this, new Float(f)})).floatValue();
        }
        if (this.e != 1) {
            View view = this.b;
            if (view != null) {
                i = view.getHeight();
            }
        } else {
            View view2 = this.b;
            if (view2 != null) {
                i = view2.getWidth();
            }
        }
        return Math.abs(f) / i;
    }

    private void d(CharSequence charSequence) {
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

    @Override // tb.l2n
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("15436c13", new Object[]{this, viewGroup});
        }
        if (this.e != 1) {
            this.b = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ptr_loading_vertical, viewGroup, false);
        } else {
            this.b = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ptr_loading_horizontal, viewGroup, false);
        }
        if (this.f != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.b;
            viewGroup2.removeAllViews();
            this.c = null;
            this.d = null;
            viewGroup2.addView(this.f.a(viewGroup2));
        } else {
            View findViewById = this.b.findViewById(R.id.tv_ptr_label);
            if (findViewById instanceof TextView) {
                this.c = (TextView) findViewById;
            }
            View findViewById2 = this.b.findViewById(R.id.pb_ptr_progress);
            if (findViewById2 instanceof ProgressBar) {
                this.d = (ProgressBar) findViewById2;
            }
            PtrLayout ptrLayout = this.f23741a;
            if (ptrLayout != null) {
                f(ptrLayout.getLoadingDrawable());
                g(this.f23741a.getTextColor());
                d(this.f23741a.getPullLabel());
            }
        }
        return this.b;
    }

    @Override // tb.l2n
    public int b(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40eac2eb", new Object[]{this, new Integer(i)})).intValue();
        }
        l2n l2nVar = this.f;
        if (l2nVar != null) {
            i2 = l2nVar.b(i);
        }
        if (i2 != 0) {
            return i2;
        }
        if (i != 1) {
            View view = this.b;
            if (view != null) {
                return view.getHeight();
            }
            return i2;
        }
        View view2 = this.b;
        if (view2 != null) {
            return view2.getWidth();
        }
        return i2;
    }

    public void e(l2n l2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72bc5a54", new Object[]{this, l2nVar});
        } else {
            this.f = l2nVar;
        }
    }

    public void f(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aabccd63", new Object[]{this, drawable});
            return;
        }
        ProgressBar progressBar = this.d;
        if (progressBar != null && drawable != null) {
            progressBar.setIndeterminateDrawable(drawable);
        }
    }

    public void g(ColorStateList colorStateList) {
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
        ProgressBar progressBar = this.d;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(charSequence);
        }
        l2n l2nVar = this.f;
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
            ProgressBar progressBar = this.d;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.c;
            if (textView != null) {
                textView.setText(charSequence);
            }
        } else {
            ProgressBar progressBar2 = this.d;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
            }
            TextView textView2 = this.c;
            if (!(textView2 == null || this.f23741a == null)) {
                textView2.setVisibility(0);
                this.c.setText(this.f23741a.getPullLabel());
            }
        }
        l2n l2nVar = this.f;
        if (l2nVar != null) {
            l2nVar.onFreeze(z, charSequence);
        }
    }

    @Override // tb.l2n
    public void onPull(float f) {
        PtrLayout ptrLayout;
        PtrLayout ptrLayout2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620c25d5", new Object[]{this, new Float(f)});
            return;
        }
        if (c(f) < 1.0d) {
            TextView textView = this.c;
            if (!(textView == null || (ptrLayout2 = this.f23741a) == null)) {
                textView.setText(ptrLayout2.getPullLabel());
            }
        } else {
            TextView textView2 = this.c;
            if (!(textView2 == null || (ptrLayout = this.f23741a) == null)) {
                textView2.setText(ptrLayout.getReleaseLabel());
            }
        }
        ProgressBar progressBar = this.d;
        if (progressBar != null && progressBar.getVisibility() == 0) {
            this.d.setVisibility(8);
        }
        l2n l2nVar = this.f;
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
        if (!(textView == null || this.f23741a == null)) {
            if (textView.getVisibility() == 8) {
                this.c.setVisibility(0);
            }
            this.c.setText(this.f23741a.getRefreshingLabel());
        }
        ProgressBar progressBar = this.d;
        if (progressBar != null && progressBar.getVisibility() == 8) {
            this.d.setVisibility(0);
        }
        l2n l2nVar = this.f;
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
        l2n l2nVar = this.f;
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
        if (!(textView == null || this.f23741a == null)) {
            if (textView.getVisibility() == 8) {
                this.c.setVisibility(0);
            }
            this.c.setText(this.f23741a.getPullLabel());
        }
        ProgressBar progressBar = this.d;
        if (progressBar != null && progressBar.getVisibility() == 0) {
            this.d.setVisibility(8);
        }
        l2n l2nVar = this.f;
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
        this.e = i;
        l2n l2nVar = this.f;
        if (l2nVar != null) {
            l2nVar.onUpdateDirection(i);
        }
    }
}
