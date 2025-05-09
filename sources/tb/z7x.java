package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class z7x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public double f32596a = -1.0d;

    static {
        t2o.a(982515804);
    }

    public double a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4267e5a2", new Object[]{this})).doubleValue();
        }
        return -1.0d;
    }

    public double b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1b6fc87", new Object[]{this})).doubleValue();
        }
        return -1.0d;
    }

    public double c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e67f5870", new Object[]{this})).doubleValue();
        }
        return this.f32596a;
    }

    public b8x d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8x) ipChange.ipc$dispatch("113cfbbd", new Object[]{this});
        }
        return null;
    }

    public void e(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5022470", new Object[]{this, new Double(d)});
        } else {
            this.f32596a = d;
        }
    }
}
