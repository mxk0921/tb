package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ei2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f18591a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;

    static {
        t2o.a(736100433);
    }

    public ei2() {
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3beaee32", new Object[]{this});
        }
        return this.e;
    }

    public ViewGroup b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("a80a9600", new Object[]{this});
        }
        return this.b;
    }

    public ImageView c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("f02d6158", new Object[]{this});
        }
        return this.f18591a;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d818120b", new Object[]{this});
            return;
        }
        View view = this.d;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.c;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73123f78", new Object[]{this})).booleanValue();
        }
        if (this.f18591a == null || this.b == null) {
            return true;
        }
        return false;
    }

    public ei2(ImageView imageView, ViewGroup viewGroup, View view, View view2, View view3) {
        this.f18591a = imageView;
        this.b = viewGroup;
        this.d = view;
        this.c = view2;
        this.e = view3;
    }
}
