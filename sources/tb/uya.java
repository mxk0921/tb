package tb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class uya {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f29672a;

    static {
        t2o.a(713031858);
    }

    public uya(Activity activity) {
        this.f29672a = activity;
    }

    public abstract int a();

    public abstract void b(View view);

    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f2361e7c", new Object[]{this});
        }
        Activity activity = this.f29672a;
        if (activity == null) {
            return null;
        }
        View inflate = LayoutInflater.from(activity).inflate(a(), (ViewGroup) null);
        b(inflate);
        return inflate;
    }
}
