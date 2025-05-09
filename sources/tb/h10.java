package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class h10 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f20355a;
    public final Activity b;

    static {
        t2o.a(713032003);
    }

    public h10(Activity activity) {
        this.b = activity;
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d9a8c76f", new Object[]{this});
        }
        View b = b();
        ViewGroup viewGroup = this.f20355a;
        if (!(viewGroup == b || viewGroup == null)) {
            this.f20355a.addView(b, new ViewGroup.LayoutParams(-1, -1));
        }
        return this.f20355a;
    }

    public abstract View b();

    public h10 c(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h10) ipChange.ipc$dispatch("1c410ea6", new Object[]{this, viewGroup});
        }
        this.f20355a = viewGroup;
        return this;
    }
}
