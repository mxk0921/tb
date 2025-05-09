package tb;

import android.view.View;
import android.view.ViewStub;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qh8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CustomBaseActivity f26751a;
    public final View b;
    public final ProgressBar c;
    public View.OnClickListener d;
    public final TextView e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (qh8.a(qh8.this) != null) {
                qh8.b(qh8.this);
                qh8.a(qh8.this).onClick(view);
            }
        }
    }

    static {
        t2o.a(764412046);
    }

    public qh8(CustomBaseActivity customBaseActivity) {
        this.f26751a = customBaseActivity;
        this.b = ((ViewStub) customBaseActivity.findViewById(R.id.shop_common_error_pager)).inflate();
        this.c = (ProgressBar) customBaseActivity.findViewById(R.id.shop_error_view_progress);
        this.e = (TextView) customBaseActivity.findViewById(R.id.shop_common_error_text);
        d();
    }

    public static /* synthetic */ View.OnClickListener a(qh8 qh8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("488afcc", new Object[]{qh8Var});
        }
        return qh8Var.d;
    }

    public static /* synthetic */ void b(qh8 qh8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5c7a4", new Object[]{qh8Var});
        } else {
            qh8Var.i();
        }
    }

    public final String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1022fd24", new Object[]{this, new Integer(i)});
        }
        return this.f26751a.getResources().getString(i);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84c82357", new Object[]{this});
        } else {
            this.c.setVisibility(8);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else if (this.b != null) {
            d();
            this.b.setVisibility(8);
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f9e5364", new Object[]{this, str});
            return;
        }
        TextView textView = this.e;
        if (textView != null && str != null) {
            textView.setText(str);
        }
    }

    public void g(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d502d8", new Object[]{this, onClickListener});
            return;
        }
        View view = this.b;
        if (view != null) {
            this.d = onClickListener;
            view.setClickable(true);
            ViewProxy.setOnClickListener(this.b, new a());
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb83a50", new Object[]{this, new Boolean(z)});
        } else if (this.b != null && this.f26751a != null) {
            d();
            if (z) {
                f(c(R.string.flowlimt_error_text));
            } else {
                f(c(R.string.shop_common_error_data));
            }
            this.b.setVisibility(0);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d83b03d1", new Object[]{this});
        } else {
            this.c.setVisibility(0);
        }
    }
}
