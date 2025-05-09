package tb;

import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class j9v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Interpolator b;
    public k9v d;

    /* renamed from: a  reason: collision with root package name */
    public int f21856a = 0;
    public int c = 300;

    static {
        t2o.a(157286678);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19a9f028", new Object[]{this})).intValue();
        }
        return this.f21856a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97373faf", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public k9v c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k9v) ipChange.ipc$dispatch("32b268e5", new Object[]{this});
        }
        return this.d;
    }

    public Interpolator d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("651d14b3", new Object[]{this});
        }
        return this.b;
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b533f7a", new Object[]{this, new Integer(i)});
        } else {
            this.f21856a = i;
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a9a8dd3", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void g(k9v k9vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d972eb97", new Object[]{this, k9vVar});
        } else {
            this.d = k9vVar;
        }
    }

    public void h(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53de22bb", new Object[]{this, interpolator});
        } else {
            this.b = interpolator;
        }
    }
}
