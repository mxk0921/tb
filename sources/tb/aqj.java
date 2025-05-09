package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.TBFragmentTabHost;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class aqj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public bqj f15938a;
    public final TBFragmentTabHost d;
    public Animator f;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AnimatorListenerAdapter e = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            } else if (hashCode == -1868320925) {
                super.onAnimationCancel((Animator) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/navigation/Controller/NavigationVisibilityController$AnimatorListenerAdapterInner");
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            super.onAnimationCancel(animator);
            String c = y9a.c();
            TLog.loge(c, "NavigationVisibilityController", "animate cancle. isHideAnimating:" + aqj.a(aqj.this).get() + " isShowAnimating:" + aqj.b(aqj.this).get());
            if (aqj.c(aqj.this) != null) {
                aqj.c(aqj.this).onShow();
            }
            aqj.d(aqj.this).setVisibility(0);
            aqj.e(aqj.this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            String c = y9a.c();
            TLog.loge(c, "NavigationVisibilityController", "animate end. isHideAnimating:" + aqj.a(aqj.this).get() + " isShowAnimating:" + aqj.b(aqj.this).get());
            if (aqj.a(aqj.this).get()) {
                aqj.d(aqj.this).setVisibility(4);
            } else if (aqj.c(aqj.this) != null) {
                aqj.c(aqj.this).onShow();
            }
            aqj.e(aqj.this);
        }
    }

    public aqj(TBFragmentTabHost tBFragmentTabHost) {
        this.d = tBFragmentTabHost;
    }

    public static /* synthetic */ AtomicBoolean a(aqj aqjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("fa93ab2f", new Object[]{aqjVar});
        }
        return aqjVar.c;
    }

    public static /* synthetic */ AtomicBoolean b(aqj aqjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("43aab1ce", new Object[]{aqjVar});
        }
        return aqjVar.b;
    }

    public static /* synthetic */ bqj c(aqj aqjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bqj) ipChange.ipc$dispatch("cf07b0c", new Object[]{aqjVar});
        }
        return aqjVar.f15938a;
    }

    public static /* synthetic */ TBFragmentTabHost d(aqj aqjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFragmentTabHost) ipChange.ipc$dispatch("9663e19", new Object[]{aqjVar});
        }
        return aqjVar.d;
    }

    public static /* synthetic */ void e(aqj aqjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36de362b", new Object[]{aqjVar});
        } else {
            aqjVar.i();
        }
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("906bef96", new Object[]{this})).intValue();
        }
        if (this.c.get()) {
            return 2;
        }
        if (this.b.get()) {
            return 4;
        }
        return 0;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.c.set(false);
        this.b.set(false);
        this.f = null;
    }

    public void j(bqj bqjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bbc2047", new Object[]{this, bqjVar});
        } else {
            this.f15938a = bqjVar;
        }
    }

    public boolean g(boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac744ffb", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        String c = y9a.c();
        TLog.loge(c, "NavigationVisibilityController", "start visible operation. should hide " + z);
        if (z) {
            if (this.d.getVisibility() == 4) {
                String c2 = y9a.c();
                TLog.loge(c2, "NavigationVisibilityController", "hide failed. tab host is invisible. should hide " + z);
                return false;
            } else if (this.c.get()) {
                String c3 = y9a.c();
                TLog.loge(c3, "NavigationVisibilityController", "hide return. tab host is hide animating. should hide " + z);
                return false;
            } else {
                if (this.f != null && this.b.get()) {
                    epj.c(this.d, this.f);
                    String c4 = y9a.c();
                    TLog.loge(c4, "NavigationVisibilityController", "stop show animation. tab host should hide " + z);
                }
                bqj bqjVar = this.f15938a;
                if (bqjVar != null) {
                    z2 = bqjVar.onHide();
                }
                if (!z2) {
                    return z2;
                }
                this.d.setVisibility(4);
                return z2;
            }
        } else if (this.d.getVisibility() != 0) {
            bqj bqjVar2 = this.f15938a;
            boolean onShow = bqjVar2 != null ? bqjVar2.onShow() : false;
            if (onShow) {
                this.d.setVisibility(0);
            }
            return onShow;
        } else if (this.f == null || !this.c.get()) {
            String c5 = y9a.c();
            TLog.loge(c5, "NavigationVisibilityController", "show failed. tab host is visible. should hide " + z);
            return false;
        } else {
            epj.c(this.d, this.f);
            String c6 = y9a.c();
            TLog.loge(c6, "NavigationVisibilityController", "stop hide animation. tab host should hide " + z);
            return true;
        }
    }

    public boolean h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f94f5d06", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        String c = y9a.c();
        TLog.loge(c, "NavigationVisibilityController", "start animate. should hide " + z);
        if (z) {
            if (this.c.get()) {
                TLog.loge(y9a.c(), "NavigationVisibilityController", "hide animate failed. is animating");
                return false;
            } else if (this.d.getVisibility() == 4) {
                String c2 = y9a.c();
                TLog.loge(c2, "NavigationVisibilityController", "hide animate failed. tabhost is invisible. should hide " + z + this.d);
                return false;
            } else {
                if (this.f != null && this.b.get()) {
                    epj.c(this.d, this.f);
                }
                bqj bqjVar = this.f15938a;
                if (bqjVar != null) {
                    bqjVar.onHide();
                }
                this.c.set(true);
                this.b.set(false);
            }
        } else if (this.b.get()) {
            TLog.loge(y9a.c(), "NavigationVisibilityController", "hide animate failed. is animating");
            return false;
        } else {
            if (this.d.getVisibility() == 0) {
                if (this.f == null || !this.c.get()) {
                    String c3 = y9a.c();
                    TLog.loge(c3, "NavigationVisibilityController", "hide animate failed. tabhost is visible. should hide " + z + this.d);
                    return false;
                }
                epj.c(this.d, this.f);
            }
            this.d.setVisibility(0);
            this.b.set(true);
            this.c.set(false);
        }
        this.f = epj.d(this.d, z, this.e);
        return true;
    }
}
