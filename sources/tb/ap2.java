package tb;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.afterbuy.NestedScrollRecyclerView;
import java.util.List;
import tb.h6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ap2 implements h6c.c<RecyclerView> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f15911a;
    public final no2 f;
    public long g;
    public int h;
    public int j;
    public int k;
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public int e = 0;
    public int i = 3;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f15912a;
        public final /* synthetic */ long b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ List e;

        public a(int i, long j, int i2, int i3, List list) {
            this.f15912a = i;
            this.b = j;
            this.c = i2;
            this.d = i3;
            this.e = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ap2 ap2Var = ap2.this;
            if (!ap2.c(ap2Var, this.f15912a, ap2.a(ap2Var))) {
                fve.e("BxUserTrackScrollListener", "状态变化异常，targetState：" + this.f15912a + "，currentState：" + ap2.a(ap2.this));
                return;
            }
            ap2.b(ap2.this, this.f15912a);
            int i = this.f15912a;
            if (i == 1) {
                fve.e("BxUserTrackScrollListener", "滚动开始 getVisibleCardTracings 耗时：" + this.b);
                hue.p(ap2.d(ap2.this).getContainerType(), this.c, this.d, this.e, null);
            } else if (i == 2) {
                hue.q(ap2.d(ap2.this).getContainerType(), this.c, this.d, this.e, null);
            } else if (i == 3) {
                ap2.e(ap2.this);
                hue.o(ap2.d(ap2.this).getContainerType(), this.c, this.d, this.e, null);
            }
        }
    }

    static {
        t2o.a(486539639);
        t2o.a(488636470);
    }

    public ap2(cfc cfcVar) {
        this.f15911a = cfcVar;
        k();
        this.f = new no2(cfcVar);
    }

    public static /* synthetic */ int a(ap2 ap2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94ed0b1b", new Object[]{ap2Var})).intValue();
        }
        return ap2Var.i;
    }

    public static /* synthetic */ int b(ap2 ap2Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef18bc0c", new Object[]{ap2Var, new Integer(i)})).intValue();
        }
        ap2Var.i = i;
        return i;
    }

    public static /* synthetic */ boolean c(ap2 ap2Var, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1a4318d", new Object[]{ap2Var, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return ap2Var.h(i, i2);
    }

    public static /* synthetic */ cfc d(ap2 ap2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("c06c49da", new Object[]{ap2Var});
        }
        return ap2Var.f15911a;
    }

    public static /* synthetic */ void e(ap2 ap2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee13ffeb", new Object[]{ap2Var});
        } else {
            ap2Var.k();
        }
    }

    public final void f(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe83ba3", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        int i2 = this.j;
        get.a().e(new a(i, SystemClock.uptimeMillis() - SystemClock.uptimeMillis(), this.k, i2, this.f.c()));
    }

    public final void g(RecyclerView recyclerView) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc4a77a9", new Object[]{this, recyclerView});
            return;
        }
        int i2 = this.c;
        if (i2 != -1 && (i = this.b) != -1) {
            if (i != 1 || i2 != 2) {
                if (i != 0 || i2 != 1) {
                    this.d = 0;
                    this.e = 0;
                    f(recyclerView, 3);
                }
            }
        }
    }

    public final boolean h(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c45bc2b1", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3 && i == 1) {
                    return true;
                }
                return false;
            } else if (i == 3 || i == 2) {
                return true;
            } else {
                return false;
            }
        } else if (i == 2 || i == 3) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: i */
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        if ((recyclerView instanceof NestedScrollRecyclerView) && i == 0) {
            lrj nestedScrollParent = ((NestedScrollRecyclerView) recyclerView).getNestedScrollParent();
            if ((nestedScrollParent instanceof RecyclerView) && ((RecyclerView) nestedScrollParent).getScrollState() != 0) {
                return;
            }
        }
        this.b = this.c;
        this.c = recyclerView.getScrollState();
        if (i == 1) {
            f(recyclerView, 1);
        }
        if (recyclerView instanceof NestedScrollRecyclerView) {
            if (i == 0) {
                g(recyclerView);
            }
        } else if (this.d != 0 || this.e != 0) {
            g(recyclerView);
        }
    }

    /* renamed from: j */
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        this.d += i;
        this.e += i2;
        this.j += i2;
        this.k += i;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.g > this.h) {
            this.g = uptimeMillis;
            f(recyclerView, 2);
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fa0472", new Object[]{this});
        } else {
            this.h = mve.c("bxCaptureCardVisualInterval", 100);
        }
    }

    @Override // tb.h6c.c
    public void n(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }
}
