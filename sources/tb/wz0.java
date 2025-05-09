package tb;

import android.animation.Animator;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class wz0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f31028a;
    public final Object b;
    public final Long c;
    public final Animator d;

    static {
        t2o.a(336592975);
    }

    public wz0(String str, Object obj, Long l, Animator animator) {
        this.f31028a = str;
        this.b = obj;
        this.c = l;
        this.d = animator;
    }

    public final Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("144943fe", new Object[]{this});
        }
        return this.b;
    }

    public final Long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("eb3dea64", new Object[]{this});
        }
        return this.c;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7424843", new Object[]{this});
        }
        return this.f31028a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof wz0) {
                wz0 wz0Var = (wz0) obj;
                if (!ckf.b(this.f31028a, wz0Var.f31028a) || !ckf.b(this.b, wz0Var.b) || !ckf.b(this.c, wz0Var.c) || !ckf.b(this.d, wz0Var.d)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f31028a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        Object obj = this.b;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        Long l = this.c;
        if (l != null) {
            i3 = l.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        Animator animator = this.d;
        if (animator != null) {
            i4 = animator.hashCode();
        }
        return i7 + i4;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AnimatorWrapper(propertyName=" + this.f31028a + ", animateValues=" + this.b + ", duration=" + this.c + ", originAnimator=" + this.d + f7l.BRACKET_END_STR;
    }
}
