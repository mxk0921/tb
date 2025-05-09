package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class t0b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ViewStub f28387a;
    public ViewGroup b;
    public final b0h c;
    public final Context d;

    static {
        t2o.a(310378726);
        t2o.a(310378752);
    }

    public t0b(ViewStub viewStub, Context context, b0h b0hVar) {
        this.f28387a = viewStub;
        this.d = context;
        this.c = b0hVar;
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        ViewStub viewStub = this.f28387a;
        if (viewStub == null && this.b == null) {
            return null;
        }
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.live_dx_float_container_flexalocal);
            FrameLayout frameLayout = (FrameLayout) this.f28387a.inflate();
            if (frameLayout != null) {
                this.b = (ViewGroup) frameLayout.findViewById(R.id.live_dx_float_container);
            }
        }
        return this.b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81791840", new Object[]{this});
        }
    }

    public t0b(ViewGroup viewGroup, Context context, b0h b0hVar) {
        this.b = viewGroup;
        this.d = context;
        this.c = b0hVar;
    }

    public t0b(Activity activity, Context context, ViewGroup viewGroup, b0h b0hVar) {
        this.b = viewGroup;
        this.d = context;
        this.c = b0hVar;
    }
}
