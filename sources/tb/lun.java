package tb;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.core.view.MotionEventCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent;
import com.taobao.tao.flexbox.layoutmanager.uikit.feature.DragToRefreshFeature;
import com.taobao.tao.flexbox.layoutmanager.uikit.pullrefresh.FakeHeaderView;
import com.taobao.uikit.utils.UIKITLog;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lun {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DONE = 3;
    public static final int DOWN_PULL = 4;
    public static final int LEFT_PULL = 7;
    public static final int PULL_TO_REFRESH = 1;
    public static final int REFRESHING = 2;
    public static final int RELEASE_TO_REFRESH = 0;
    public static final int RIGHT_PULL = 6;
    public static final int UP_PULL = 5;
    public final int F;

    /* renamed from: a  reason: collision with root package name */
    public float f23576a;
    public float b;
    public pun d;
    public pun e;
    public boolean g;
    public int h;
    public int i;
    public boolean k;
    public DragToRefreshFeature.a l;
    public final Scroller m;
    public final u9e o;
    public final Context p;
    public int q;
    public int w;
    public int x;
    public int c = -1;
    public boolean n = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = true;
    public boolean u = false;
    public boolean v = true;
    public boolean y = false;
    public int z = 0;
    public int A = 0;
    public int B = 0;
    public int C = 0;
    public int D = -1;
    public int E = 0;
    public int f = 3;
    public boolean j = true;

    static {
        t2o.a(503317374);
    }

    public lun(u9e u9eVar, Context context, Scroller scroller, int i) {
        this.o = u9eVar;
        this.m = scroller;
        this.p = context;
        this.F = i;
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c915dbfd", new Object[]{this});
            return;
        }
        pun punVar = this.d;
        if (punVar != null) {
            this.o.removeHeaderView(punVar.i());
        }
    }

    public void B(int i) {
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5bd9d1a", new Object[]{this, new Integer(i)});
            return;
        }
        pun punVar = this.e;
        if (punVar != null) {
            if (this.F == 1) {
                i2 = punVar.c();
            } else {
                i2 = punVar.j();
            }
            if (i2 != 0) {
                if (i != 2 && i == 3) {
                    i3 = -i2;
                }
                this.n = true;
                if (this.F == 1) {
                    this.m.startScroll(0, this.e.e(), 0, i3 - this.e.e(), 350);
                } else {
                    this.m.startScroll(this.e.g(), 0, i3 - this.e.g(), 0, 350);
                }
                this.o.trigger();
            }
        }
    }

    public final void C(int i) {
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7dcb1f", new Object[]{this, new Integer(i)});
            return;
        }
        pun punVar = this.d;
        if (punVar != null) {
            if (this.F == 1) {
                i2 = punVar.c();
            } else {
                i2 = punVar.j();
            }
            if (i2 != 0) {
                if (i != 2 && i == 3) {
                    i3 = -i2;
                }
                this.n = true;
                if (this.F != 1) {
                    this.m.startScroll(this.d.f(), 0, i3 - this.d.f(), 0, 350);
                } else if (this.v) {
                    this.m.startScroll(0, this.d.h(), 0, i3 - this.d.h(), 350);
                } else if (i == 2) {
                    this.m.startScroll(0, this.d.h(), 0, (this.d.d() - this.d.h()) - this.d.c(), 350);
                } else if (i == 3) {
                    this.m.startScroll(0, this.d.h(), 0, i3 - this.d.h(), 350);
                }
                this.o.trigger();
            }
        }
    }

    public void D(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ff6e5e", new Object[]{this, new Integer(i)});
            return;
        }
        pun punVar = this.d;
        if (punVar != null) {
            punVar.q(i);
        }
    }

    public void E(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1833e3", new Object[]{this, new Boolean(z)});
            return;
        }
        pun punVar = this.d;
        if (punVar != null) {
            this.s = z;
            punVar.m(z);
        }
    }

    public void F(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0370669", new Object[]{this, strArr});
            return;
        }
        pun punVar = this.d;
        if (punVar != null) {
            punVar.s(strArr);
        }
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f897bc", new Object[]{this});
        } else if (this.d != null) {
            this.f = 2;
            h();
            this.d.o(0, 0, 0, 0);
            this.q = 4;
        }
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308b3cf5", new Object[]{this});
        } else if (this.e != null) {
            this.q = 5;
            this.f = 2;
            h();
            this.e.o(0, 0, 0, 0);
        }
    }

    public void I(int i) {
        pun punVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("643538c0", new Object[]{this, new Integer(i)});
        } else if (i > 0 && (punVar = this.d) != null) {
            punVar.n(i);
        }
    }

    public void J(DragToRefreshFeature.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16269af6", new Object[]{this, aVar});
            return;
        }
        this.l = aVar;
        this.j = true;
    }

    public void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db0bd25", new Object[]{this, new Boolean(z)});
            return;
        }
        this.t = !z;
        pun punVar = this.e;
        if (punVar != null) {
            punVar.p(z);
            this.e.a(1);
        }
    }

    public void L(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2bd8ad7", new Object[]{this, new Integer(i)});
            return;
        }
        pun punVar = this.d;
        if (punVar != null) {
            punVar.r(i);
        }
        pun punVar2 = this.e;
        if (punVar2 != null) {
            punVar2.r(i);
        }
    }

    public void M(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead3c845", new Object[]{this, new Integer(i)});
            return;
        }
        pun punVar = this.e;
        if (punVar != null) {
            punVar.q(i);
        }
    }

    public void N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa6ca1c", new Object[]{this, new Boolean(z)});
            return;
        }
        pun punVar = this.e;
        if (punVar != null) {
            this.r = z;
            punVar.m(z);
        }
        this.u = false;
    }

    public void O(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ac0aa2", new Object[]{this, strArr});
            return;
        }
        pun punVar = this.e;
        if (punVar != null) {
            punVar.s(strArr);
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7f191f9", new Object[]{this, motionEvent})).booleanValue();
        }
        u9e u9eVar = this.o;
        if (u9eVar != null) {
            if (u9eVar.hasArrivedTopEdge() && !this.k) {
                this.k = true;
                this.h = (int) motionEvent.getY();
                this.i = (int) motionEvent.getX();
                int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                if (this.c == -1) {
                    this.c = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                    this.f23576a = motionEvent.getY();
                    this.b = motionEvent.getX();
                    this.D = this.c;
                }
                return true;
            } else if (this.o.hasArrivedBottomEdge() && !this.k) {
                this.k = true;
                this.h = (int) motionEvent.getY();
                this.i = (int) motionEvent.getX();
                int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                if (this.c == -1) {
                    this.c = MotionEventCompat.getPointerId(motionEvent, actionIndex2);
                    this.f23576a = motionEvent.getY();
                    this.b = motionEvent.getX();
                    this.D = this.c;
                }
                return true;
            }
        }
        return false;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ac4a68", new Object[]{this});
            return;
        }
        pun punVar = this.e;
        if (punVar != null) {
            this.o.setFooterView(punVar.i());
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d47655a", new Object[]{this});
            return;
        }
        pun punVar = this.d;
        if (punVar != null) {
            this.o.setHeadView(punVar.i());
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c1abede", new Object[]{this});
        } else if (!this.t && !this.u && !this.r) {
            this.u = true;
            this.q = 5;
            pun punVar = this.e;
            if (punVar != null) {
                punVar.a(2);
            }
            DragToRefreshFeature.a aVar = this.l;
            if (aVar != null) {
                ((ListViewComponent.k) aVar).a();
            }
            pun punVar2 = this.e;
            if (punVar2 != null) {
                punVar2.u(true);
            }
        }
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32636806", new Object[]{this, new Integer(i)});
            return;
        }
        pun punVar = this.e;
        if (punVar != null) {
            punVar.b(i);
        }
    }

    public final void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cb2654", new Object[]{this, new Integer(i)});
            return;
        }
        pun punVar = this.d;
        if (punVar != null) {
            punVar.b(i);
        }
    }

    public void i(boolean z, int i, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74388cb5", new Object[]{this, new Boolean(z), new Integer(i), view, new Float(f)});
        } else {
            j(z, i, view, true, f);
        }
    }

    public void k(boolean z, int i, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda4c3dc", new Object[]{this, new Boolean(z), new Integer(i), view, new Float(f)});
        } else {
            l(z, i, view, true, f);
        }
    }

    public final int m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("344db25f", new Object[]{this, new Integer(i)})).intValue();
        }
        DisplayMetrics displayMetrics = this.p.getResources().getDisplayMetrics();
        pun punVar = this.d;
        if (punVar == null) {
            return i;
        }
        int j = this.d.j() + punVar.f();
        int i2 = displayMetrics.widthPixels;
        return (int) (((float) ((i2 / (i2 + j)) / 1.3d)) * i);
    }

    public final int n(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6128e2f", new Object[]{this, motionEvent, new Integer(i)})).intValue();
        }
        int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i);
        if (findPointerIndex == -1) {
            this.c = -1;
        }
        return findPointerIndex;
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        return this.q;
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c6288c", new Object[]{this})).intValue();
        }
        return this.E;
    }

    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public final int r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db9570a0", new Object[]{this, new Integer(i)})).intValue();
        }
        DisplayMetrics displayMetrics = this.p.getResources().getDisplayMetrics();
        pun punVar = this.d;
        if (punVar == null) {
            return i;
        }
        int c = this.d.c() + punVar.h();
        int i2 = displayMetrics.heightPixels;
        return (int) (((float) ((i2 / (i2 + c)) / 1.3d)) * i);
    }

    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f5a750", new Object[]{this, new Boolean(z)});
            return;
        }
        pun punVar = this.d;
        if (punVar != null) {
            punVar.k(z);
        }
        this.v = z;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c167144", new Object[]{this})).booleanValue();
        }
        return this.m.isFinished();
    }

    public final void u() {
        DragToRefreshFeature.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
            return;
        }
        int i = this.q;
        if (i == 4 || i == 6) {
            if (this.s) {
                v();
                return;
            }
            DragToRefreshFeature.a aVar2 = this.l;
            if (aVar2 != null) {
                ((ListViewComponent.k) aVar2).b();
            }
        } else if (i != 5 && i != 7) {
        } else {
            if (this.r) {
                v();
            } else if (this.t && (aVar = this.l) != null) {
                ((ListViewComponent.k) aVar).a();
            }
        }
    }

    public void w(int i, boolean z) {
        pun punVar;
        pun punVar2;
        pun punVar3;
        pun punVar4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52c020b4", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        int i2 = this.q;
        if (i2 == 4) {
            if (!this.n) {
                return;
            }
            if (!z || (punVar4 = this.d) == null) {
                this.n = false;
            } else {
                punVar4.o(0, i, 0, 0);
            }
        } else if (i2 == 5) {
            if (!this.n) {
                return;
            }
            if (!z || (punVar3 = this.e) == null) {
                this.n = false;
            } else {
                punVar3.o(0, 0, 0, i);
            }
        } else if (i2 == 6) {
            if (!this.n) {
                return;
            }
            if (!z || (punVar2 = this.d) == null) {
                this.n = false;
            } else {
                punVar2.o(i, 0, 0, 0);
            }
        } else if (i2 == 7 && this.n) {
            if (!z || (punVar = this.e) == null) {
                this.n = false;
            } else {
                punVar.o(0, 0, i, 0);
            }
        }
    }

    public void x(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b14c36", new Object[]{this, motionEvent});
        } else if (this.j && !this.n) {
            switch (motionEvent.getAction() & 255) {
                case 0:
                    a(motionEvent);
                    return;
                case 1:
                case 3:
                case 4:
                    int i4 = this.f;
                    if (i4 != 2) {
                        int i5 = this.q;
                        if (i5 == 4) {
                            if (i4 == 1) {
                                this.f = 3;
                                h();
                            }
                            if (this.f == 0) {
                                this.f = 2;
                                h();
                                u();
                            }
                        } else if (i5 == 5) {
                            if (i4 == 1) {
                                this.f = 3;
                                if (this.t) {
                                    f();
                                }
                            }
                            if (this.f == 0) {
                                this.f = 2;
                                if (this.t) {
                                    f();
                                }
                                u();
                            }
                        } else if (i5 == 6) {
                            if (i4 == 1) {
                                this.f = 3;
                                h();
                            }
                            if (this.f == 0) {
                                this.f = 2;
                                h();
                                u();
                            }
                        } else if (i5 == 7) {
                            if (i4 == 1) {
                                this.f = 3;
                                if (this.t) {
                                    f();
                                }
                            }
                            if (this.f == 0) {
                                this.f = 2;
                                if (this.t) {
                                    f();
                                }
                                u();
                            }
                        }
                    }
                    this.k = false;
                    this.g = false;
                    this.y = false;
                    this.w = 0;
                    this.z = 0;
                    this.A = 0;
                    this.c = -1;
                    return;
                case 2:
                    if (this.c == -1) {
                        this.c = MotionEventCompat.getPointerId(motionEvent, MotionEventCompat.getActionIndex(motionEvent));
                        this.f23576a = motionEvent.getY();
                        this.b = motionEvent.getX();
                        this.D = this.c;
                    }
                    try {
                        int n = n(motionEvent, this.c);
                        int y = (int) MotionEventCompat.getY(motionEvent, n);
                        int x = (int) MotionEventCompat.getX(motionEvent, n);
                        a(motionEvent);
                        if (this.y) {
                            int i6 = this.D;
                            int i7 = this.c;
                            if (i6 != i7) {
                                if (1 == this.F) {
                                    int i8 = this.x;
                                    float f = y - this.f23576a;
                                    i2 = (int) (i8 + f);
                                    int i9 = this.B;
                                    y = (int) (i9 + f);
                                    this.D = i7;
                                    this.w = i8;
                                    this.z = i9;
                                } else {
                                    int i10 = this.x;
                                    float f2 = x - this.b;
                                    i2 = (int) (i10 + f2);
                                    int i11 = this.C;
                                    x = (int) (i11 + f2);
                                    this.D = i7;
                                    this.w = i10;
                                    this.A = i11;
                                }
                                i = i2;
                            } else if (1 == this.F) {
                                float f3 = y - this.f23576a;
                                i = (int) (this.w + f3);
                                y = (int) (this.z + f3);
                                this.x = i;
                                this.B = y;
                            } else {
                                float f4 = x - this.b;
                                i = (int) (this.w + f4);
                                x = (int) (this.A + f4);
                                this.x = i;
                                this.C = x;
                            }
                        } else if (1 == this.F) {
                            i = y - this.h;
                            this.w = i;
                            this.x = i;
                            this.z = y;
                            this.B = y;
                        } else {
                            i = x - this.i;
                            this.w = i;
                            this.x = i;
                            this.A = x;
                            this.C = x;
                        }
                        if (this.f != 2 && this.k) {
                            if (this.F == 1) {
                                x = y;
                            }
                            y(i, x);
                            this.E = i;
                            return;
                        }
                        return;
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                        return;
                    }
                case 5:
                    int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                    UIKITLog.i("DownRefreshControler", "ACTION_POINTER_DOWN : mActivePointerId %d  position : %f", Integer.valueOf(this.c), Float.valueOf(this.f23576a));
                    this.f23576a = MotionEventCompat.getY(motionEvent, actionIndex);
                    this.b = MotionEventCompat.getX(motionEvent, actionIndex);
                    this.c = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                    this.y = true;
                    return;
                case 6:
                    int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                    if (MotionEventCompat.getPointerId(motionEvent, actionIndex2) == this.c) {
                        if (actionIndex2 == 0) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        this.f23576a = MotionEventCompat.getY(motionEvent, i3);
                        this.b = MotionEventCompat.getX(motionEvent, i3);
                        this.c = MotionEventCompat.getPointerId(motionEvent, i3);
                    }
                    int n2 = n(motionEvent, this.c);
                    if (this.c != -1) {
                        this.f23576a = MotionEventCompat.getY(motionEvent, n2);
                        this.b = MotionEventCompat.getX(motionEvent, n2);
                        UIKITLog.i("DownRefreshControler", "ACTION_POINTER_UP : mActivePointerId %d mLastMotionY position : %f", Integer.valueOf(this.c), Float.valueOf(this.f23576a));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void y(int i, int i2) {
        pun punVar;
        pun punVar2;
        pun punVar3;
        pun punVar4;
        int i3;
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdc6d9d", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i7 = this.f;
        if (i7 == 0) {
            int i8 = this.q;
            if (i8 == 4 && this.d != null) {
                this.o.keepTop();
                if (this.v) {
                    i6 = this.d.c();
                } else {
                    i6 = this.d.d();
                }
                if (r(i) < i6 && i2 - this.h > 0) {
                    this.f = 1;
                    h();
                }
            } else if (i8 == 5 && this.e != null) {
                this.o.keepBottom();
                if (Math.abs(i / 3) < this.e.c() && i2 - this.h < 0) {
                    this.f = 1;
                    if (this.t) {
                        f();
                    }
                }
            } else if (i8 == 6 && this.d != null) {
                this.o.keepTop();
                if (m(i) < this.d.j() && i2 - this.i > 0) {
                    this.f = 1;
                    h();
                }
            } else if (i8 == 7 && this.e != null) {
                this.o.keepBottom();
                if (Math.abs(i) < this.e.j() && i2 - this.i < 0) {
                    this.f = 1;
                    if (this.t) {
                        f();
                    }
                }
            }
        } else if (i7 == 1) {
            int i9 = this.q;
            if (i9 == 4 && this.d != null) {
                this.o.keepTop();
                if (this.v) {
                    i5 = this.d.c();
                } else {
                    i5 = this.d.d();
                }
                if (r(i) >= i5) {
                    this.f = 0;
                    this.g = true;
                } else if (i2 - this.h <= 0) {
                    this.f = 3;
                }
                h();
                g(r(i));
            } else if (i9 == 5 && this.e != null) {
                this.o.keepBottom();
                if (i / 3 <= this.e.c() * (-1)) {
                    this.f = 0;
                    this.g = true;
                } else if (i2 - this.h >= 0) {
                    this.f = 3;
                }
                if (this.t) {
                    f();
                    e((-i) / 3);
                }
            } else if (i9 == 6 && this.d != null) {
                this.o.keepTop();
                if (m(i) >= this.d.j()) {
                    this.f = 0;
                    this.g = true;
                } else if (i2 - this.i <= 0) {
                    this.f = 3;
                }
                h();
                g(m(i));
            } else if (i9 == 7 && this.e != null) {
                this.o.keepBottom();
                if (i <= this.e.j() * (-1)) {
                    this.f = 0;
                    this.g = true;
                } else if (i2 - this.i >= 0) {
                    this.f = 3;
                }
                if (this.t) {
                    f();
                    e(-i);
                }
            }
        } else if (i7 == 3) {
            if (i > 0 && this.o.hasArrivedTopEdge()) {
                if (this.F == 1) {
                    i4 = 4;
                } else {
                    i4 = 6;
                }
                this.q = i4;
                this.f = 1;
                h();
            } else if (i < 0 && this.o.hasArrivedBottomEdge()) {
                if (this.F == 1) {
                    i3 = 5;
                } else {
                    i3 = 7;
                }
                this.q = i3;
                if (this.t) {
                    this.f = 1;
                    f();
                } else {
                    d();
                }
            }
        }
        int i10 = this.f;
        if (i10 == 1 || i10 == 0) {
            int i11 = this.q;
            if (i11 == 4 && (punVar4 = this.d) != null) {
                punVar4.o(0, r(i) - this.d.c(), 0, 0);
            } else if (i11 != 5 || (punVar3 = this.e) == null || this.r) {
                if (i11 == 6 && (punVar2 = this.d) != null) {
                    punVar2.o((punVar2.j() * (-1)) + m(i), 0, 0, 0);
                } else if (i11 == 7 && (punVar = this.e) != null && this.t) {
                    punVar.o(0, 0, (punVar.j() * (-1)) - i, 0);
                }
            } else if (this.t) {
                punVar3.o(0, 0, 0, (punVar3.c() * (-1)) - (i / 3));
            }
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107ac10b", new Object[]{this});
            return;
        }
        pun punVar = this.e;
        if (punVar != null) {
            this.o.removeFooterView(punVar.i());
        }
    }

    public void v() {
        pun punVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3573f5c", new Object[]{this});
            return;
        }
        this.f = 3;
        int i = this.q;
        if (i == 4 || i == 6) {
            pun punVar2 = this.d;
            if (punVar2 != null) {
                punVar2.t("最近更新:" + new Date().toLocaleString());
                h();
            }
        } else if ((i == 5 || i == 7) && (punVar = this.e) != null) {
            punVar.t("最近更新:" + new Date().toLocaleString());
            if (this.t) {
                f();
                return;
            }
            this.u = false;
            if (!this.r) {
                this.e.a(3);
                B(3);
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f18531", new Object[]{this});
            return;
        }
        pun punVar = this.e;
        if (punVar != null) {
            punVar.a(this.f);
            int i = this.f;
            if (i == 1 && this.g) {
                this.g = false;
            } else if (i == 2) {
                UIKITLog.v("DownRefreshControler", "刷新造成scroll", new Object[0]);
                B(this.f);
            } else if (i == 3) {
                UIKITLog.v("DownRefreshControler", "不需要刷新或者刷新完成造成scroll", new Object[0]);
                B(this.f);
            }
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("766195ff", new Object[]{this});
            return;
        }
        pun punVar = this.d;
        if (punVar != null) {
            punVar.a(this.f);
            int i = this.f;
            if (i == 1 && this.g) {
                this.g = false;
            } else if (i == 2) {
                UIKITLog.v("DownRefreshControler", "刷新造成scroll", new Object[0]);
                C(this.f);
            } else if (i == 3) {
                UIKITLog.v("DownRefreshControler", "不需要刷新或者刷新完成造成scroll", new Object[0]);
                C(this.f);
            }
        }
    }

    public void j(boolean z, int i, View view, boolean z2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12e28917", new Object[]{this, new Boolean(z), new Integer(i), view, new Boolean(z2), new Float(f)});
        } else if (z) {
            ImageView imageView = view;
            if (this.d == null) {
                if (view == null) {
                    ImageView imageView2 = new ImageView(this.p);
                    imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    imageView = imageView2;
                }
                pun punVar = new pun(this.p, i, imageView, z2, this.F == 1 ? 1 : 3, f);
                this.d = punVar;
                punVar.t("最近更新:" + new Date().toLocaleString());
                c();
            }
        } else {
            if (this.d != null) {
                A();
                this.d = null;
            }
            FakeHeaderView fakeHeaderView = new FakeHeaderView(this.p);
            fakeHeaderView.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            fakeHeaderView.setPadding(0, -1, 0, 0);
            this.o.setHeadView(fakeHeaderView);
        }
    }

    public void l(boolean z, int i, View view, boolean z2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fd36d0", new Object[]{this, new Boolean(z), new Integer(i), view, new Boolean(z2), new Float(f)});
        } else if (z) {
            if (this.e == null) {
                pun punVar = new pun(this.p, i, view, z2, this.F == 1 ? 2 : 4, f);
                this.e = punVar;
                punVar.t("最近更新:" + new Date().toLocaleString());
                b();
            }
        } else if (this.e != null) {
            z();
            this.e = null;
        }
    }
}
