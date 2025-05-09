package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fuw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f19545a;
    public View b;
    public View.OnClickListener c;
    public final TextView d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (fuw.a(fuw.this) != null) {
                fuw.a(fuw.this).onClick(view);
            }
        }
    }

    static {
        t2o.a(85983279);
    }

    public fuw(Context context, View view) {
        this.f19545a = context;
        this.b = ((ViewStub) view.findViewById(R.id.wx_fragment_error)).inflate();
        this.d = (TextView) view.findViewById(R.id.wa_common_error_text);
    }

    public static /* synthetic */ View.OnClickListener a(fuw fuwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("5a805708", new Object[]{fuwVar});
        }
        return fuwVar.c;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    public final String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1022fd24", new Object[]{this, new Integer(i)});
        }
        return this.f19545a.getResources().getString(i);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f9e5364", new Object[]{this, str});
            return;
        }
        TextView textView = this.d;
        if (textView != null && str != null) {
            textView.setText(str);
        }
    }

    public void f(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d502d8", new Object[]{this, onClickListener});
            return;
        }
        View view = this.b;
        if (view != null) {
            this.c = onClickListener;
            view.setClickable(true);
            ViewProxy.setOnClickListener(this.b, new a());
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d609ce", new Object[]{this, str});
        } else if (this.b != null && this.f19545a != null) {
            if (TextUtils.isEmpty(str)) {
                str = c(R.string.weex_common_error_data);
            }
            e(str);
            this.b.setVisibility(0);
        }
    }
}
