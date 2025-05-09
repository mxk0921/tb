package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class xe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f31327a;

    static {
        t2o.a(503316973);
    }

    public abstract void a(Object obj, String str);

    public abstract View b();

    public abstract View c(Context context);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract boolean h();

    public View i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f583d243", new Object[]{this, context});
        }
        if (this.f31327a == null) {
            this.f31327a = c(context);
        }
        return this.f31327a;
    }
}
