package tb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.DWViewUtil;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.CodeUsageCounter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class r95 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f27204a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f27205a;

        public a(View view) {
            this.f27205a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                r95.a(r95.this).removeView(this.f27205a);
            }
        }
    }

    static {
        t2o.a(452985162);
    }

    public r95(ViewGroup viewGroup) {
        this.f27204a = viewGroup;
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_sdk_DWToastContainer);
    }

    public static /* synthetic */ ViewGroup a(r95 r95Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("3e12bcd5", new Object[]{r95Var});
        }
        return r95Var.f27204a;
    }

    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79755704", new Object[]{this, view});
        } else if (this.f27204a != null && view != null) {
            this.f27204a.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void c(String str, float f) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5448aee5", new Object[]{this, str, new Float(f)});
            return;
        }
        View inflate = LayoutInflater.from(this.f27204a.getContext()).inflate(R.layout.dw_toast, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        if (f == 0.0f) {
            i = DWViewUtil.dip2px(this.f27204a.getContext(), 20.0f);
        } else {
            i = DWViewUtil.dip2px(this.f27204a.getContext(), f);
        }
        layoutParams.topMargin = i;
        this.f27204a.addView(inflate, layoutParams);
        ((TextView) inflate.findViewById(R.id.dw_toast_tv)).setText(str);
        inflate.setVisibility(0);
        inflate.bringToFront();
        inflate.postDelayed(new a(inflate), 3000L);
    }
}
