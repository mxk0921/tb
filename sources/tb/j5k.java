package tb;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.weex.ui.view.gesture.WXGestureType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class j5k<T extends UINode> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Handler m = new Handler(Looper.getMainLooper());
    public View.OnClickListener c;
    public View.OnLongClickListener d;
    public final T i;

    /* renamed from: a  reason: collision with root package name */
    public int f21774a = 0;
    public final Set<View.OnClickListener> b = new HashSet();
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean k = false;
    public final Runnable l = new a();
    public final Rect j = new Rect();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            j5k.a(j5k.this);
            j5k.b(j5k.this, true);
        }
    }

    static {
        t2o.a(986710060);
        t2o.a(986710095);
    }

    public j5k(T t) {
        this.i = t;
    }

    public static /* synthetic */ void a(j5k j5kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81b152de", new Object[]{j5kVar});
        } else {
            j5kVar.m();
        }
    }

    public static /* synthetic */ boolean b(j5k j5kVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43d37897", new Object[]{j5kVar, new Boolean(z)})).booleanValue();
        }
        j5kVar.h = z;
        return z;
    }

    public final void A(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74bfe5cd", new Object[]{this, new Boolean(z)});
        } else if (g() != z) {
            if (z) {
                i = this.f21774a | 32;
            } else {
                i = this.f21774a & (-33);
            }
            this.f21774a = i;
        }
    }

    public void B(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7b9751", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            i = this.f21774a | 16;
        } else {
            i = this.f21774a & (-17);
        }
        this.f21774a = i;
    }

    public void c(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492482f6", new Object[]{this, onClickListener});
        } else {
            ((HashSet) this.b).add(onClickListener);
        }
    }

    public boolean d(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0ce5165", new Object[]{this, motionEvent, view})).booleanValue();
        }
        return o(motionEvent, view);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da0ff163", new Object[]{this})).booleanValue();
        }
        if ((this.f21774a & 2) != 0 || !((HashSet) this.b).isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e0b5947", new Object[]{this})).booleanValue();
        }
        if ((this.f21774a & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("373aec23", new Object[]{this})).booleanValue();
        }
        if ((this.f21774a & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86be3a36", new Object[]{this})).booleanValue();
        }
        if (this.e || this.f || this.g) {
            return true;
        }
        return false;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c3641a", new Object[]{this})).booleanValue();
        }
        if ((this.i.getMountContent() instanceof ixh) || (this.i.getMountContent() instanceof View)) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e40fa1f", new Object[]{this})).booleanValue();
        }
        if ((this.f21774a & 16) != 0) {
            return true;
        }
        return false;
    }

    public final JSONObject k(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84ef2065", new Object[]{this, motionEvent});
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONObject.put(WXGestureType.GestureInfo.TOUCHES, (Object) jSONArray);
        JSONObject jSONObject2 = new JSONObject();
        float n = fxh.n(vvh.c(), motionEvent.getRawX());
        float n2 = fxh.n(vvh.c(), motionEvent.getRawY());
        float n3 = fxh.n(vvh.c(), motionEvent.getX());
        float n4 = fxh.n(vvh.c(), motionEvent.getY());
        jSONObject2.put("clientX", (Object) Float.valueOf(n));
        jSONObject2.put("clientY", (Object) Float.valueOf(n2));
        jSONObject2.put("relativeX", (Object) Float.valueOf(n3));
        jSONObject2.put("relativeY", (Object) Float.valueOf(n4));
        jSONObject2.put(WXGestureType.GestureInfo.PAGE_X, (Object) Float.valueOf(n));
        jSONObject2.put(WXGestureType.GestureInfo.PAGE_Y, (Object) Float.valueOf(n2));
        jSONArray.add(jSONObject2);
        return jSONObject;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f782f0", new Object[]{this});
            return;
        }
        View.OnClickListener onClickListener = this.c;
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
        Iterator it = ((HashSet) this.b).iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(null);
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6d0f54", new Object[]{this});
            return;
        }
        View.OnLongClickListener onLongClickListener = this.d;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(null);
        }
    }

    public boolean o(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c03524e0", new Object[]{this, motionEvent, view})).booleanValue();
        }
        if (!e() && !f() && !i() && !h()) {
            return false;
        }
        if (this.i.getNodeType() == UINodeType.VIEW) {
            return q(motionEvent);
        }
        if (this.i.getMountContent() instanceof ixh) {
            if (motionEvent.getAction() == 0) {
                this.k = ((ixh) this.i.getMountContent()).d(motionEvent);
            }
            if (this.k) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.k = false;
                }
                if (((ixh) this.i.getMountContent()).d(motionEvent)) {
                    return p(motionEvent, view);
                }
                this.k = false;
                return false;
            } else if (e() || f()) {
                return n(motionEvent);
            } else {
                return false;
            }
        } else if (this.i.getMountContent() != null || this.i.getNodeType() == UINodeType.LAYOUT) {
            return n(motionEvent);
        } else {
            s();
            return false;
        }
    }

    public final boolean p(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a79f0736", new Object[]{this, motionEvent, view})).booleanValue();
        }
        return ((ixh) this.i.getMountContent()).f(motionEvent, view);
    }

    public final boolean q(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("102d64ba", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.i.getMountContent() == null) {
            return false;
        }
        try {
            return ((View) this.i.getMountContent()).dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            dwh.i(e);
            return false;
        }
    }

    public void r(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcc05a99", new Object[]{this, onClickListener});
        } else {
            ((HashSet) this.b).remove(onClickListener);
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eece8348", new Object[]{this});
            return;
        }
        B(false);
        this.h = false;
        A(false);
    }

    public void t(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d19a8d", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            i = this.f21774a | 2;
        } else {
            i = this.f21774a & (-3);
        }
        this.f21774a = i;
    }

    public void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33793f99", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bfc9275", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648ea2b2", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void x(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b39d329", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            i = this.f21774a | 4;
        } else {
            i = this.f21774a & (-5);
        }
        this.f21774a = i;
    }

    public void y(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.c = onClickListener;
        }
    }

    public void z(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f73f2f", new Object[]{this, onLongClickListener});
        } else {
            this.d = onLongClickListener;
        }
    }

    public final boolean n(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("150fb77d", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() != 0 && !j()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.h = false;
            B(true);
            A(true);
            if (f()) {
                Handler handler = m;
                handler.removeCallbacks(this.l);
                handler.postDelayed(this.l, ViewConfiguration.getLongPressTimeout());
            }
            if (this.e && this.i.hasEvent("touchstart")) {
                this.i.fireEvent("touchstart", k(motionEvent));
            }
            return true;
        } else if (action == 1) {
            if (e() && !this.h) {
                l();
            }
            s();
            if (f()) {
                m.removeCallbacks(this.l);
            }
            if (this.g && this.i.hasEvent("touchend")) {
                this.i.fireEvent("touchend", k(motionEvent));
            }
            return true;
        } else if (action == 2) {
            this.j.set(0, 0, this.i.getNodeInfo().N(), this.i.getNodeInfo().w());
            boolean contains = this.j.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!contains) {
                s();
                if (f()) {
                    m.removeCallbacks(this.l);
                }
            }
            if (this.f && this.i.hasEvent("touchmove")) {
                this.i.fireEvent("touchmove", k(motionEvent));
            }
            if (h()) {
                return true;
            }
            return contains;
        } else if (action != 3) {
            return false;
        } else {
            s();
            if (f()) {
                m.removeCallbacks(this.l);
            }
            if (this.g && this.i.hasEvent("touchend")) {
                this.i.fireEvent("touchend", k(motionEvent));
            }
            return true;
        }
    }
}
