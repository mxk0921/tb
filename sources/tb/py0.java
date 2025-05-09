package tb;

import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class py0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f26394a;
    public final Interpolator b;
    public final int c;

    static {
        t2o.a(729809992);
    }

    public py0(int i, Interpolator interpolator, int i2) {
        this.f26394a = i;
        this.b = interpolator;
        this.c = i2;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65260d5", new Object[]{this})).intValue();
        }
        return this.f26394a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97373faf", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public Interpolator c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("651d14b3", new Object[]{this});
        }
        return this.b;
    }
}
