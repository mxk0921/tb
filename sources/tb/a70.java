package tb;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.core.view.MotionEventCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.util.DensityUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a70 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int MAX_DISTANCE_Y = DensityUtil.dip2px(Globals.getApplication(), 42.0f);

    /* renamed from: a  reason: collision with root package name */
    public float f15578a;
    public boolean f;
    public boolean g;
    public final a h;
    public boolean b = false;
    public boolean c = false;
    public int d = -1;
    public float i = 0.0f;
    public final int e = ViewConfiguration.get(Globals.getApplication()).getScaledPagingTouchSlop();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void onTouchEvent(MotionEvent motionEvent);
    }

    static {
        t2o.a(729810092);
    }

    public a70(a aVar) {
        this.h = aVar;
    }

    public final void a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa9f2464", new Object[]{this, motionEvent});
        } else if (!this.b) {
            int action = motionEvent.getAction();
            if (action == 0) {
                n(motionEvent);
            } else if (action == 1) {
                p(motionEvent);
            } else if (action == 2) {
                o(motionEvent);
            }
        }
    }

    public void b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb68bd1", new Object[]{this, motionEvent});
        } else if (z60.c().e()) {
            a(motionEvent);
        }
    }

    public final boolean c(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae7056f3", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.b || !this.c || !i() || !d(motionEvent)) {
            return false;
        }
        return true;
    }

    public final boolean d(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12743e7d", new Object[]{this, motionEvent})).booleanValue();
        }
        float x = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.d)) - this.f15578a;
        float abs = Math.abs(x);
        if (!g(x) && abs > this.e * z60.c().a()) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39b3fdd6", new Object[]{this})).booleanValue();
        }
        if (f()) {
            return true;
        }
        uqa.a("Scene.ACCIDENT_SLIDE", "Conditional judgment", "Not eligible for rolling ");
        return false;
    }

    public final boolean f() {
        IHomeSubTabController currentSubTabController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2a2257a", new Object[]{this})).booleanValue();
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService == null || (currentSubTabController = iHomeControllerService.getCurrentSubTabController()) == null || currentSubTabController.getSubContainerScrollY() > z60.c().b()) {
            return false;
        }
        return true;
    }

    public final boolean g(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccd7876c", new Object[]{this, new Float(f)})).booleanValue();
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService != null && f < 0.0f && iHomeControllerService.isAtRecommendTab()) {
            return true;
        }
        return false;
    }

    public final boolean h(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbfd3702", new Object[]{this, motionEvent})).booleanValue();
        }
        int i = this.d;
        if (i == -1 || motionEvent.findPointerIndex(i) == -1) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        IHomeSubTabController currentSubTabController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e09a573", new Object[]{this})).booleanValue();
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService == null || (currentSubTabController = iHomeControllerService.getCurrentSubTabController()) == null) {
            return false;
        }
        return currentSubTabController.isHandleUpAndDownScrollingEvent();
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9b94240", new Object[]{this})).booleanValue();
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService != null) {
            return iHomeControllerService.isSubscribeTab();
        }
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc13b3", new Object[]{this, motionEvent});
        } else if (!this.f) {
            this.f = true;
            motionEvent.getX();
            motionEvent.getY();
            r(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
        }
    }

    public boolean l(MotionEvent motionEvent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efc2a1e", new Object[]{this, motionEvent, new Boolean(z)})).booleanValue();
        }
        this.b = z;
        return z;
    }

    public final void n(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd2272e", new Object[]{this, motionEvent});
            return;
        }
        boolean e = e();
        this.c = e;
        if (e) {
            this.d = MotionEventCompat.getPointerId(motionEvent, 0);
            this.f15578a = motionEvent.getX();
            motionEvent.getY();
        }
    }

    public final void o(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b190c21d", new Object[]{this, motionEvent});
        } else if (!h(motionEvent) && c(motionEvent)) {
            this.g = true;
            k(motionEvent);
            r(s(motionEvent));
        }
    }

    public final void p(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c717e367", new Object[]{this, motionEvent});
        } else if (this.c) {
            if (h(motionEvent)) {
                motionEvent = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 1, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
            }
            r(motionEvent);
            q();
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.d = -1;
        this.f = false;
        this.f15578a = 0.0f;
        this.i = 0.0f;
    }

    public final void r(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59ee4da0", new Object[]{this, motionEvent});
        } else {
            this.h.onTouchEvent(motionEvent);
        }
    }

    public final MotionEvent s(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionEvent) ipChange.ipc$dispatch("12e4a201", new Object[]{this, motionEvent});
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.d);
        float y = motionEvent.getY(findPointerIndex);
        if (this.i == 0.0f) {
            this.i = y;
        }
        motionEvent.setLocation(motionEvent.getX(findPointerIndex), this.i);
        return motionEvent;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        if (j() && this.g) {
            r5a.i("Page_Home", 2101, "Page_Home_Accident_Slideto-tabdingyue", "spm=a2141.1.searchbar.dingyue");
            bqa.d("AccidentSlideFeature", "accident slide");
        }
        this.g = false;
    }
}
