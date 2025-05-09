package tb;

import android.view.animation.AnimationUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ly0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class l2m implements ly0.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ly0 f23069a;
    public b b;
    public a c;
    public double d;
    public double e;
    public boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
    }

    static {
        t2o.a(87031888);
        t2o.a(87031842);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        ly0 ly0Var = this.f23069a;
        if (ly0Var != null) {
            ly0Var.a();
        }
        this.f = false;
    }

    public double b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be03d763", new Object[]{this})).doubleValue();
        }
        return this.d;
    }

    public double c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2598bb5", new Object[]{this})).doubleValue();
        }
        return this.e;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a88bb7", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public abstract void e(Map<String, Object> map);

    public abstract void f(long j);

    public void g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8305d6", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    public void h(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa38d83a", new Object[]{this, bVar});
        } else {
            this.b = bVar;
        }
    }

    public void i(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33aa47c", new Object[]{this, map});
            return;
        }
        e(map);
        if (this.f23069a == null) {
            this.f23069a = ly0.b();
        }
        this.f23069a.c(this);
    }

    @Override // tb.ly0.a
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0baf29", new Object[]{this});
            return;
        }
        f(AnimationUtils.currentAnimationTimeMillis());
        b bVar = this.b;
        if (bVar != null) {
            ((lb2) bVar).C(this, this.d, this.e);
        }
        if (d()) {
            a aVar = this.c;
            if (aVar != null) {
                ((lb2) aVar).B(this, this.d, this.e);
            }
            ly0 ly0Var = this.f23069a;
            if (ly0Var != null) {
                ly0Var.a();
            }
        }
    }
}
