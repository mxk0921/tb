package tb;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Scroller;
import androidx.core.view.MotionEventCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trade.uikit.feature.features.DragToRefreshFeature;
import com.taobao.trade.uikit.feature.features.PullToRefreshFeature;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kun {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DONE = 3;
    public static final int DOWN_PULL = 4;
    public static final int LEFT_PULL = 7;
    public static final int PULL_TO_REFRESH = 1;
    public static final int REFRESHING = 2;
    public static final int RELEASE_TO_REFRESH = 0;
    public static final int RIGHT_PULL = 6;
    public static final int UP_PULL = 5;
    public int A;
    public int B;
    public int C;
    public int D;
    public final int E;

    /* renamed from: a  reason: collision with root package name */
    public float f22933a;
    public float b;
    public int c;
    public oun d;
    public oun e;
    public int f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public final Scroller l;
    public boolean m;
    public final t9e n;
    public final Context o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public boolean x;
    public int y;
    public int z;

    static {
        t2o.a(724566090);
    }

    public kun(t9e t9eVar, Context context, Scroller scroller) {
        this.c = -1;
        this.m = false;
        this.q = false;
        this.r = false;
        this.s = true;
        this.t = false;
        this.u = true;
        this.x = false;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = -1;
        this.D = 0;
        this.E = 1;
        this.n = t9eVar;
        this.l = scroller;
        this.o = context;
        this.f = 3;
        this.j = true;
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c915dbfd", new Object[]{this});
            return;
        }
        oun ounVar = this.d;
        if (ounVar != null) {
            this.n.removeHeaderView(ounVar.i());
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
        oun ounVar = this.e;
        if (ounVar != null) {
            if (this.E == 1) {
                i2 = ounVar.c();
            } else {
                i2 = ounVar.j();
            }
            if (i2 != 0) {
                if (i != 2 && i == 3) {
                    i3 = -i2;
                }
                this.m = true;
                if (this.E == 1) {
                    this.l.startScroll(0, this.e.e(), 0, i3 - this.e.e(), 350);
                } else {
                    this.l.startScroll(this.e.g(), 0, i3 - this.e.g(), 0, 350);
                }
                this.n.trigger();
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
        oun ounVar = this.d;
        if (ounVar != null) {
            if (this.E == 1) {
                i2 = ounVar.c();
            } else {
                i2 = ounVar.j();
            }
            if (i2 != 0) {
                if (i != 2 && i == 3) {
                    i3 = -i2;
                }
                this.m = true;
                if (this.E != 1) {
                    this.l.startScroll(this.d.f(), 0, i3 - this.d.f(), 0, 350);
                } else if (this.u) {
                    this.l.startScroll(0, this.d.h(), 0, i3 - this.d.h(), 350);
                } else if (i == 2) {
                    this.l.startScroll(0, this.d.h(), 0, (this.d.d() - this.d.h()) - this.d.c(), 350);
                } else if (i == 3) {
                    this.l.startScroll(0, this.d.h(), 0, i3 - this.d.h(), 350);
                }
                this.n.trigger();
            }
        }
    }

    public void D(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ff6e5e", new Object[]{this, new Integer(i)});
            return;
        }
        oun ounVar = this.d;
        if (ounVar != null) {
            ounVar.p(i);
        }
    }

    public void E(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1833e3", new Object[]{this, new Boolean(z)});
            return;
        }
        oun ounVar = this.d;
        if (ounVar != null) {
            this.r = z;
            ounVar.m(z);
        }
    }

    public void F(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0370669", new Object[]{this, strArr});
            return;
        }
        oun ounVar = this.d;
        if (ounVar != null) {
            ounVar.r(strArr);
        }
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f897bc", new Object[]{this});
        } else if (this.d != null) {
            this.f = 2;
            h();
            this.d.n(0, 0, 0, 0);
            this.p = 4;
        }
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308b3cf5", new Object[]{this});
        } else if (this.e != null) {
            this.p = 5;
            this.f = 2;
            h();
            this.e.n(0, 0, 0, 0);
        }
    }

    public void I(DragToRefreshFeature.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b7c140f", new Object[]{this, aVar});
        } else {
            this.j = true;
        }
    }

    public void J(PullToRefreshFeature.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("428640ef", new Object[]{this, aVar});
        } else {
            this.j = true;
        }
    }

    public void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db0bd25", new Object[]{this, new Boolean(z)});
            return;
        }
        this.s = !z;
        oun ounVar = this.e;
        if (ounVar != null) {
            ounVar.o(z);
            this.e.a(1);
        }
    }

    public void L(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2bd8ad7", new Object[]{this, new Integer(i)});
            return;
        }
        oun ounVar = this.d;
        if (ounVar != null) {
            ounVar.q(i);
        }
        oun ounVar2 = this.e;
        if (ounVar2 != null) {
            ounVar2.q(i);
        }
    }

    public void M(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead3c845", new Object[]{this, new Integer(i)});
            return;
        }
        oun ounVar = this.e;
        if (ounVar != null) {
            ounVar.p(i);
        }
    }

    public void N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa6ca1c", new Object[]{this, new Boolean(z)});
            return;
        }
        oun ounVar = this.e;
        if (ounVar != null) {
            this.q = z;
            ounVar.m(z);
        }
    }

    public void O(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ac0aa2", new Object[]{this, strArr});
            return;
        }
        oun ounVar = this.e;
        if (ounVar != null) {
            ounVar.r(strArr);
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7f191f9", new Object[]{this, motionEvent})).booleanValue();
        }
        t9e t9eVar = this.n;
        if (t9eVar != null) {
            if (t9eVar.hasArrivedTopEdge() && !this.k) {
                this.k = true;
                this.h = (int) motionEvent.getY();
                this.i = (int) motionEvent.getX();
                int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                if (this.c == -1) {
                    this.c = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                    this.f22933a = motionEvent.getY();
                    this.b = motionEvent.getX();
                    this.C = this.c;
                }
                return true;
            } else if (this.n.hasArrivedBottomEdge() && !this.k) {
                this.k = true;
                this.h = (int) motionEvent.getY();
                this.i = (int) motionEvent.getX();
                int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                if (this.c == -1) {
                    this.c = MotionEventCompat.getPointerId(motionEvent, actionIndex2);
                    this.f22933a = motionEvent.getY();
                    this.b = motionEvent.getX();
                    this.C = this.c;
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
        oun ounVar = this.e;
        if (ounVar != null) {
            this.n.setFooterView(ounVar.i());
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d47655a", new Object[]{this});
            return;
        }
        oun ounVar = this.d;
        if (ounVar != null) {
            this.n.setHeadView(ounVar.i());
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c1abede", new Object[]{this});
        } else if (!this.s && !this.t && !this.q) {
            this.t = true;
            this.p = 5;
            oun ounVar = this.e;
            if (ounVar != null) {
                ounVar.a(2);
            }
            oun ounVar2 = this.e;
            if (ounVar2 != null) {
                ounVar2.t(true);
            }
        }
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32636806", new Object[]{this, new Integer(i)});
            return;
        }
        oun ounVar = this.e;
        if (ounVar != null) {
            ounVar.b(i);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f18531", new Object[]{this});
            return;
        }
        oun ounVar = this.e;
        if (ounVar != null) {
            ounVar.a(this.f);
            int i = this.f;
            if (i == 1 && this.g) {
                this.g = false;
            } else if (i == 2) {
                B(i);
            } else if (i == 3) {
                B(i);
            }
        }
    }

    public final void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cb2654", new Object[]{this, new Integer(i)});
            return;
        }
        oun ounVar = this.d;
        if (ounVar != null) {
            ounVar.b(i);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("766195ff", new Object[]{this});
            return;
        }
        oun ounVar = this.d;
        if (ounVar != null) {
            ounVar.a(this.f);
            int i = this.f;
            if (i == 1 && this.g) {
                this.g = false;
            } else if (i == 2) {
                C(i);
            } else if (i == 3) {
                C(i);
            }
        }
    }

    public void i(boolean z, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9864e86b", new Object[]{this, new Boolean(z), new Integer(i), view});
        } else {
            j(z, i, view, true);
        }
    }

    public void k(boolean z, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a491b064", new Object[]{this, new Boolean(z), new Integer(i), view});
        } else {
            l(z, i, view, true);
        }
    }

    public final int m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("344db25f", new Object[]{this, new Integer(i)})).intValue();
        }
        DisplayMetrics displayMetrics = this.o.getResources().getDisplayMetrics();
        oun ounVar = this.d;
        if (ounVar == null) {
            return i;
        }
        int j = this.d.j() + ounVar.f();
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
        return this.p;
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c6288c", new Object[]{this})).intValue();
        }
        return this.D;
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
        DisplayMetrics displayMetrics = this.o.getResources().getDisplayMetrics();
        oun ounVar = this.d;
        if (ounVar == null) {
            return i;
        }
        int c = this.d.c() + ounVar.h();
        int i2 = displayMetrics.heightPixels;
        return (int) (((float) ((i2 / (i2 + c)) / 1.3d)) * i);
    }

    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f5a750", new Object[]{this, new Boolean(z)});
            return;
        }
        oun ounVar = this.d;
        if (ounVar != null) {
            ounVar.k(z);
        }
        this.u = z;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c167144", new Object[]{this})).booleanValue();
        }
        return this.l.isFinished();
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
            return;
        }
        int i = this.p;
        if (i == 4 || i == 6) {
            if (this.r) {
                v();
            }
        } else if ((i == 5 || i == 7) && this.q) {
            v();
        }
    }

    public void w(int i, boolean z) {
        oun ounVar;
        oun ounVar2;
        oun ounVar3;
        oun ounVar4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52c020b4", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        int i2 = this.p;
        if (i2 == 4) {
            if (!this.m) {
                return;
            }
            if (!z || (ounVar4 = this.d) == null) {
                this.m = false;
            } else {
                ounVar4.n(0, i, 0, 0);
            }
        } else if (i2 == 5) {
            if (!this.m) {
                return;
            }
            if (!z || (ounVar3 = this.e) == null) {
                this.m = false;
            } else {
                ounVar3.n(0, 0, 0, i);
            }
        } else if (i2 == 6) {
            if (!this.m) {
                return;
            }
            if (!z || (ounVar2 = this.d) == null) {
                this.m = false;
            } else {
                ounVar2.n(i, 0, 0, 0);
            }
        } else if (i2 == 7 && this.m) {
            if (!z || (ounVar = this.e) == null) {
                this.m = false;
            } else {
                ounVar.n(0, 0, i, 0);
            }
        }
    }

    public void x(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b14c36", new Object[]{this, motionEvent});
        } else if (this.j && !this.m) {
            switch (motionEvent.getAction() & 255) {
                case 0:
                    a(motionEvent);
                    return;
                case 1:
                case 3:
                case 4:
                    int i4 = this.f;
                    if (i4 != 2) {
                        int i5 = this.p;
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
                                if (this.s) {
                                    f();
                                }
                            }
                            if (this.f == 0) {
                                this.f = 2;
                                if (this.s) {
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
                                if (this.s) {
                                    f();
                                }
                            }
                            if (this.f == 0) {
                                this.f = 2;
                                if (this.s) {
                                    f();
                                }
                                u();
                            }
                        }
                    }
                    this.k = false;
                    this.g = false;
                    this.x = false;
                    this.v = 0;
                    this.y = 0;
                    this.z = 0;
                    this.c = -1;
                    return;
                case 2:
                    if (this.c == -1) {
                        this.c = MotionEventCompat.getPointerId(motionEvent, MotionEventCompat.getActionIndex(motionEvent));
                        this.f22933a = motionEvent.getY();
                        this.b = motionEvent.getX();
                        this.C = this.c;
                    }
                    try {
                        int n = n(motionEvent, this.c);
                        int y = (int) MotionEventCompat.getY(motionEvent, n);
                        int x = (int) MotionEventCompat.getX(motionEvent, n);
                        a(motionEvent);
                        if (this.x) {
                            int i6 = this.C;
                            int i7 = this.c;
                            if (i6 != i7) {
                                if (1 == this.E) {
                                    int i8 = this.w;
                                    float f = y - this.f22933a;
                                    i2 = (int) (i8 + f);
                                    int i9 = this.A;
                                    y = (int) (i9 + f);
                                    this.C = i7;
                                    this.v = i8;
                                    this.y = i9;
                                } else {
                                    int i10 = this.w;
                                    float f2 = x - this.b;
                                    i2 = (int) (i10 + f2);
                                    int i11 = this.B;
                                    x = (int) (i11 + f2);
                                    this.C = i7;
                                    this.v = i10;
                                    this.z = i11;
                                }
                                i = i2;
                            } else if (1 == this.E) {
                                float f3 = y - this.f22933a;
                                i = (int) (this.v + f3);
                                y = (int) (this.y + f3);
                                this.w = i;
                                this.A = y;
                            } else {
                                float f4 = x - this.b;
                                i = (int) (this.v + f4);
                                x = (int) (this.z + f4);
                                this.w = i;
                                this.B = x;
                            }
                        } else if (1 == this.E) {
                            i = y - this.h;
                            this.v = i;
                            this.w = i;
                            this.y = y;
                            this.A = y;
                        } else {
                            i = x - this.i;
                            this.v = i;
                            this.w = i;
                            this.z = x;
                            this.B = x;
                        }
                        if (this.f != 2 && this.k) {
                            if (this.E == 1) {
                                x = y;
                            }
                            y(i, x);
                            this.D = i;
                            return;
                        }
                        return;
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                        return;
                    }
                case 5:
                    int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                    this.f22933a = MotionEventCompat.getY(motionEvent, actionIndex);
                    this.b = MotionEventCompat.getX(motionEvent, actionIndex);
                    this.c = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                    this.x = true;
                    return;
                case 6:
                    int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                    if (MotionEventCompat.getPointerId(motionEvent, actionIndex2) == this.c) {
                        if (actionIndex2 != 0) {
                            i3 = 0;
                        }
                        this.f22933a = MotionEventCompat.getY(motionEvent, i3);
                        this.b = MotionEventCompat.getX(motionEvent, i3);
                        this.c = MotionEventCompat.getPointerId(motionEvent, i3);
                    }
                    int n2 = n(motionEvent, this.c);
                    if (this.c != -1) {
                        this.f22933a = MotionEventCompat.getY(motionEvent, n2);
                        this.b = MotionEventCompat.getX(motionEvent, n2);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void y(int i, int i2) {
        oun ounVar;
        oun ounVar2;
        oun ounVar3;
        oun ounVar4;
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
            int i8 = this.p;
            if (i8 == 4 && this.d != null) {
                this.n.keepTop();
                if (this.u) {
                    i6 = this.d.c();
                } else {
                    i6 = this.d.d();
                }
                if (r(i) < i6 && i2 - this.h > 0) {
                    this.f = 1;
                    h();
                }
            } else if (i8 == 5 && this.e != null) {
                this.n.keepBottom();
                if (Math.abs(i / 3) < this.e.c() && i2 - this.h < 0) {
                    this.f = 1;
                    if (this.s) {
                        f();
                    }
                }
            } else if (i8 == 6 && this.d != null) {
                this.n.keepTop();
                if (m(i) < this.d.j() && i2 - this.i > 0) {
                    this.f = 1;
                    h();
                }
            } else if (i8 == 7 && this.e != null) {
                this.n.keepBottom();
                if (Math.abs(i) < this.e.j() && i2 - this.i < 0) {
                    this.f = 1;
                    if (this.s) {
                        f();
                    }
                }
            }
        } else if (i7 == 1) {
            int i9 = this.p;
            if (i9 == 4 && this.d != null) {
                this.n.keepTop();
                if (this.u) {
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
                this.n.keepBottom();
                if (i / 3 <= this.e.c() * (-1)) {
                    this.f = 0;
                    this.g = true;
                } else if (i2 - this.h >= 0) {
                    this.f = 3;
                }
                if (this.s) {
                    f();
                    e((-i) / 3);
                }
            } else if (i9 == 6 && this.d != null) {
                this.n.keepTop();
                if (m(i) >= this.d.j()) {
                    this.f = 0;
                    this.g = true;
                } else if (i2 - this.i <= 0) {
                    this.f = 3;
                }
                h();
                g(m(i));
            } else if (i9 == 7 && this.e != null) {
                this.n.keepBottom();
                if (i <= this.e.j() * (-1)) {
                    this.f = 0;
                    this.g = true;
                } else if (i2 - this.i >= 0) {
                    this.f = 3;
                }
                if (this.s) {
                    f();
                    e(-i);
                }
            }
        } else if (i7 == 3) {
            if (i > 0 && this.n.hasArrivedTopEdge()) {
                if (this.E == 1) {
                    i4 = 4;
                } else {
                    i4 = 6;
                }
                this.p = i4;
                this.f = 1;
                h();
            } else if (i < 0 && this.n.hasArrivedBottomEdge()) {
                if (this.E == 1) {
                    i3 = 5;
                } else {
                    i3 = 7;
                }
                this.p = i3;
                if (this.s) {
                    this.f = 1;
                    f();
                } else {
                    d();
                }
            }
        }
        int i10 = this.f;
        if (i10 == 1 || i10 == 0) {
            int i11 = this.p;
            if (i11 == 4 && (ounVar4 = this.d) != null) {
                ounVar4.n(0, r(i) - this.d.c(), 0, 0);
            } else if (i11 != 5 || (ounVar3 = this.e) == null || this.q) {
                if (i11 == 6 && (ounVar2 = this.d) != null) {
                    ounVar2.n((ounVar2.j() * (-1)) + m(i), 0, 0, 0);
                } else if (i11 == 7 && (ounVar = this.e) != null && this.s) {
                    ounVar.n(0, 0, (ounVar.j() * (-1)) - i, 0);
                }
            } else if (this.s) {
                ounVar3.n(0, 0, 0, (ounVar3.c() * (-1)) - (i / 3));
            }
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107ac10b", new Object[]{this});
            return;
        }
        oun ounVar = this.e;
        if (ounVar != null) {
            this.n.removeFooterView(ounVar.i());
        }
    }

    public void v() {
        oun ounVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3573f5c", new Object[]{this});
            return;
        }
        this.f = 3;
        int i = this.p;
        if (i == 4 || i == 6) {
            oun ounVar2 = this.d;
            if (ounVar2 != null) {
                ounVar2.s("最近更新:" + new Date().toLocaleString());
                h();
            }
        } else if ((i == 5 || i == 7) && (ounVar = this.e) != null) {
            ounVar.s("最近更新:" + new Date().toLocaleString());
            if (this.s) {
                f();
                return;
            }
            this.t = false;
            if (!this.q) {
                this.e.a(3);
                B(3);
            }
        }
    }

    public void j(boolean z, int i, View view, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7438d7c9", new Object[]{this, new Boolean(z), new Integer(i), view, new Boolean(z2)});
        } else if (z) {
            ImageView imageView = view;
            if (this.d == null) {
                if (view == null) {
                    ImageView imageView2 = new ImageView(this.o);
                    imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    imageView = imageView2;
                }
                oun ounVar = new oun(this.o, i, imageView, z2, this.E == 1 ? 1 : 3);
                this.d = ounVar;
                ounVar.s("最近更新:" + new Date().toLocaleString());
                c();
            }
        } else if (this.d != null) {
            A();
            this.d = null;
        }
    }

    public void l(boolean z, int i, View view, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda50ef0", new Object[]{this, new Boolean(z), new Integer(i), view, new Boolean(z2)});
        } else if (z) {
            if (this.e == null) {
                oun ounVar = new oun(this.o, i, view, z2, this.E == 1 ? 2 : 4);
                this.e = ounVar;
                ounVar.s("最近更新:" + new Date().toLocaleString());
                b();
            }
        } else if (this.e != null) {
            z();
            this.e = null;
        }
    }

    public kun(t9e t9eVar, Context context, Scroller scroller, int i) {
        this.c = -1;
        this.m = false;
        this.q = false;
        this.r = false;
        this.s = true;
        this.t = false;
        this.u = true;
        this.x = false;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = -1;
        this.D = 0;
        this.n = t9eVar;
        this.l = scroller;
        this.o = context;
        this.f = 3;
        this.j = true;
        this.E = i;
    }
}
