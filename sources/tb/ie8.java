package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ie8 implements l2n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f21274a;
    private Context b;
    private int c;
    private View d;
    private TextView e;
    private String f = "滑动发现更多内容";
    private String g = "释放发现更多内容";

    static {
        t2o.a(912261518);
        t2o.a(632291344);
    }

    public ie8(Context context) {
        this.b = context;
    }

    private float c(float f) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de251b6d", new Object[]{this, new Float(f)})).floatValue();
        }
        View view = this.f21274a;
        if (view != null) {
            i = view.getWidth();
        }
        return Math.abs(f) / i;
    }

    @Override // tb.l2n
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("15436c13", new Object[]{this, viewGroup});
        }
        Context d = tq4.d(viewGroup);
        PreRenderManager g = PreRenderManager.g(d);
        if (g != null) {
            this.f21274a = g.j(d, R.layout.tt_detail_pull_end_tips, viewGroup, true);
        } else {
            this.f21274a = LayoutInflater.from(d).inflate(R.layout.tt_detail_pull_end_tips, viewGroup, false);
        }
        this.d = this.f21274a.findViewById(R.id.iv_ptr_arrow);
        this.e = (TextView) this.f21274a.findViewById(R.id.tv_ptr_label);
        return this.f21274a;
    }

    @Override // tb.l2n
    public int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40eac2eb", new Object[]{this, new Integer(i)})).intValue();
        }
        View view = this.f21274a;
        if (view != null) {
            return view.getWidth();
        }
        return 0;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9117f03e", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1cde00", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    @Override // tb.l2n
    public void onCompleteUpdate(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fc67cc", new Object[]{this, charSequence});
            return;
        }
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // tb.l2n
    public void onFreeze(boolean z, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2222633b", new Object[]{this, new Boolean(z), charSequence});
        } else if (z) {
            View view = this.d;
            if (view != null) {
                view.setVisibility(8);
            }
            TextView textView = this.e;
            if (textView != null) {
                textView.setText(charSequence);
            }
        } else {
            View view2 = this.d;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            TextView textView2 = this.e;
            if (textView2 != null) {
                textView2.setText(this.f);
            }
        }
    }

    @Override // tb.l2n
    public void onPull(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620c25d5", new Object[]{this, new Float(f)});
        } else if (c(f) < 1.0d) {
            TextView textView = this.e;
            if (textView != null) {
                textView.setText(this.f);
            }
        } else {
            TextView textView2 = this.e;
            if (textView2 != null) {
                textView2.setText(this.g);
            }
        }
    }

    @Override // tb.l2n
    public void onRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def893ed", new Object[]{this});
        }
    }

    @Override // tb.l2n
    public void onRelease(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd47c3f1", new Object[]{this, new Float(f)});
        }
    }

    @Override // tb.l2n
    public void onReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b89f37", new Object[]{this});
            return;
        }
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(this.f);
        }
    }

    @Override // tb.l2n
    public void onUpdateDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e55ce5", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }
}
