package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ah1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f15734a;
    public final ViewGroup.LayoutParams b;

    static {
        t2o.a(481297460);
    }

    public ah1(View view, ViewGroup.LayoutParams layoutParams) {
        ckf.g(view, "view");
        this.f15734a = view;
        this.b = layoutParams;
    }

    public final ViewGroup.LayoutParams a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("71ab97bf", new Object[]{this});
        }
        return this.b;
    }

    public final View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f15734a;
    }
}
