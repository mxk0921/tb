package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.psg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ksg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final nwi f22888a;
    public final ja2 b;
    public final oy0 c;
    public final f69 d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/linkage/LinkageManager$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                ksg.a(ksg.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                ksg.a(ksg.this);
            }
        }
    }

    static {
        t2o.a(573571140);
    }

    public ksg(nwi nwiVar) {
        this.f22888a = nwiVar;
        this.b = new ja2(nwiVar);
        o4q.c(nwiVar);
        this.c = new oy0(nwiVar);
        this.d = new f69(nwiVar);
    }

    public static /* synthetic */ void a(ksg ksgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a449ebb", new Object[]{ksgVar});
        } else {
            ksgVar.d();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd075b9", new Object[]{this});
        } else if (this.f22888a.g().d() == null) {
            d();
        } else {
            this.f22888a.g().d().animate().alpha(0.0f).setDuration(100L).setListener(new a()).start();
        }
    }

    public void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2471be04", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.d.a(i2);
        if (i != 200) {
            b();
            return;
        }
        String dataType = this.f22888a.d().a().getDataType();
        psg.a aVar = new psg.a();
        boolean i3 = this.f22888a.c().i(aVar);
        jgh.a("LinkageManager", "checkLinkage shouldAnimate=" + i3);
        if (!i3) {
            b();
            if (!TextUtils.isEmpty(dataType)) {
                m0j.h(this.f22888a, dataType, "shouldAnimateFalse");
                return;
            }
            return;
        }
        if (this.b.d()) {
            this.b.f();
            m0j.g(this.f22888a, dataType);
        } else if (this.c.b()) {
            this.c.d(aVar);
            m0j.g(this.f22888a, dataType);
        } else {
            m0j.h(this.f22888a, dataType, "adbizCannotShow");
            b();
        }
        ecj.e(this.f22888a);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("225ba19f", new Object[]{this});
        } else {
            this.f22888a.c().e(2001);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eca6c73", new Object[]{this});
        } else {
            this.b.e();
        }
    }
}
