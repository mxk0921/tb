package tb;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.swipeback.SwipeBackLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mzq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f24415a;
    public SwipeBackLayout b;

    static {
        t2o.a(779093272);
    }

    public mzq(Activity activity) {
        this.f24415a = activity;
    }

    public View a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)});
        }
        SwipeBackLayout swipeBackLayout = this.b;
        if (swipeBackLayout != null) {
            return swipeBackLayout.findViewById(i);
        }
        return null;
    }

    public SwipeBackLayout b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SwipeBackLayout) ipChange.ipc$dispatch("5e950d87", new Object[]{this});
        }
        return this.b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f208031", new Object[]{this});
            return;
        }
        this.f24415a.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.f24415a.getWindow().getDecorView().setBackgroundDrawable(null);
        this.b = (SwipeBackLayout) LayoutInflater.from(this.f24415a).inflate(R.layout.taolive_swipeback_layout, (ViewGroup) null);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f701c02", new Object[]{this});
        } else {
            this.b.attachToActivity(this.f24415a);
        }
    }
}
