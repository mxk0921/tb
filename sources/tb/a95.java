package tb;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a95 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DWContext f15610a;
    public final FrameLayout b;
    public ImageView c;
    public qtb d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (a95.a(a95.this) != null) {
                a95.a(a95.this).hook();
            }
        }
    }

    static {
        t2o.a(452984931);
    }

    public a95(DWContext dWContext) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        this.f15610a = dWContext;
        FrameLayout frameLayout = new FrameLayout(dWContext.getActivity());
        this.b = frameLayout;
        frameLayout.setOnClickListener(new a());
    }

    public static /* synthetic */ qtb a(a95 a95Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qtb) ipChange.ipc$dispatch("4a73f957", new Object[]{a95Var});
        }
        return a95Var.d;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        DWContext dWContext = this.f15610a;
        if (dWContext != null && dWContext.mDWImageAdapter != null) {
            this.b.removeAllViews();
            ((z75) this.f15610a.mDWImageAdapter).f(null, this.c);
        }
    }

    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b;
    }

    public void d(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab315d39", new Object[]{this, imageView});
            return;
        }
        this.c = imageView;
        this.b.removeAllViews();
        this.b.setVisibility(0);
        this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    public void e(qtb qtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb970df4", new Object[]{this, qtbVar});
        } else {
            this.d = qtbVar;
        }
    }
}
