package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class fso {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f19510a;
    public ViewGroup b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ViewGroup a2 = fso.a(fso.this);
            if (a2 != null) {
                a2.setVisibility(8);
            }
        }
    }

    static {
        t2o.a(730857569);
    }

    public fso(Activity activity, CaptureManager captureManager) {
        ckf.g(activity, "activity");
        ckf.g(captureManager, "captureManager");
        this.f19510a = activity;
    }

    public static final /* synthetic */ ViewGroup a(fso fsoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("82f9df", new Object[]{fsoVar});
        }
        return fsoVar.b;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    public final void c() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        ViewStub viewStub = (ViewStub) this.f19510a.findViewById(R.id.scan_loading_view);
        if (viewStub != null) {
            View inflate = viewStub.inflate();
            if (inflate != null) {
                viewGroup = (ViewGroup) inflate;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        } else {
            viewGroup = (ViewGroup) this.f19510a.findViewById(R.id.scan_loading_view_inflated_id);
        }
        this.b = viewGroup;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new a());
            viewGroup.setVisibility(0);
        }
    }
}
