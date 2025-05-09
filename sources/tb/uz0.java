package tb;

import android.animation.Animator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class uz0 {

    /* renamed from: a  reason: collision with root package name */
    public Animator f29692a;

    public void a() {
        Animator animator = this.f29692a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void b() {
        this.f29692a = null;
    }

    public void c(Animator animator) {
        a();
        this.f29692a = animator;
    }
}
