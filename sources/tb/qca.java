package tb;

import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f26668a;
    public boolean b;
    public rvd c;

    static {
        t2o.a(806356068);
    }

    public ViewGroup a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("ad711da", new Object[]{this, context});
        }
        rvd rvdVar = this.c;
        if (rvdVar == null) {
            return null;
        }
        return ((gmr) rvdVar).b(context);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b91ce026", new Object[]{this});
        }
        return this.f26668a;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d0e10b9", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6c1b310", new Object[]{this, str});
        } else {
            this.f26668a = str;
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("774a3d5c", new Object[]{this, new Boolean(z)});
        }
    }

    public void f(rvd rvdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef9a9a1a", new Object[]{this, rvdVar});
        } else {
            this.c = rvdVar;
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44956a87", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }
}
