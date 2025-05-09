package com.taobao.mytaobao.scroll;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.basement.weex.BasementWeexView;
import com.taobao.mytaobao.scroll.WeexNestedScrollHelper$flingListener$2;
import com.taobao.mytaobao.scroll.WeexNestedScrollHelper$scrollListener$2;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.tao.log.TLog;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import tb.a0g;
import tb.ckf;
import tb.dde;
import tb.dun;
import tb.njg;
import tb.pzc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class WeexNestedScrollHelper {
    public static final /* synthetic */ a0g[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int b;
    public Boolean d;
    public float e;
    public float f;
    public View g;
    public final MTPtrRecyclerView k;
    public final BasementWeexView l;

    /* renamed from: a  reason: collision with root package name */
    public boolean f11312a = true;
    public boolean c = true;
    public final njg h = kotlin.a.b(new WeexNestedScrollHelper$flingListener$2(this));
    public final njg i = kotlin.a.b(new WeexNestedScrollHelper$scrollListener$2(this));
    public final njg j = kotlin.a.b(new WeexNestedScrollHelper$onTouchListener$2(this));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements dde {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.dde
        public final void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4568a0fc", new Object[]{this, map});
                return;
            }
            try {
                Object obj = map.get("pixels");
                if (obj != null) {
                    double doubleValue = ((Double) obj).doubleValue();
                    Object obj2 = map.get("velocity");
                    if (obj2 != null) {
                        double doubleValue2 = ((Double) obj2).doubleValue();
                        Object obj3 = map.get("axis");
                        if (!(obj3 instanceof String)) {
                            obj3 = null;
                        }
                        if (ckf.b((String) obj3, "vertical")) {
                            if (doubleValue > 0) {
                                TLog.loge("basementWeexLog", "overScroll setScrollEnable=true");
                                WeexNestedScrollHelper.this.h(false);
                            }
                            if (doubleValue2 > 10) {
                                TLog.loge("basementWeexLog", "invoke parent scroll" + doubleValue);
                                WeexNestedScrollHelper.e(WeexNestedScrollHelper.this).fling(0, ((int) doubleValue2) * (-2));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Double");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Double");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            WeexNestedScrollHelper weexNestedScrollHelper = WeexNestedScrollHelper.this;
            ckf.c(motionEvent, "event");
            WeexNestedScrollHelper.a(weexNestedScrollHelper, motionEvent);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements pzc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.pzc
        public boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3ef8d254", new Object[]{this, new Integer(i), new Integer(i2), iArr, iArr2, new Integer(i3)})).booleanValue();
            }
            if (!ckf.b(WeexNestedScrollHelper.d(WeexNestedScrollHelper.this), Boolean.TRUE) || i3 != 0 || iArr == null || iArr.length != 2) {
                return false;
            }
            iArr[1] = i2;
            return true;
        }

        @Override // tb.pzc
        public boolean dispatchNestedPreFling(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cd6a38f5", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
            }
            if (ckf.b(WeexNestedScrollHelper.d(WeexNestedScrollHelper.this), Boolean.TRUE)) {
                return true;
            }
            return false;
        }
    }

    public WeexNestedScrollHelper(MTPtrRecyclerView mTPtrRecyclerView, BasementWeexView basementWeexView) {
        ckf.h(mTPtrRecyclerView, "rv");
        ckf.h(basementWeexView, "basementWeexView");
        this.k = mTPtrRecyclerView;
        this.l = basementWeexView;
        b bVar = new b();
        c cVar = new c();
        mTPtrRecyclerView.registerOnFlingListener(n());
        mTPtrRecyclerView.addOnScrollListener(p());
        mTPtrRecyclerView.registerOnTouchListener(o());
        mTPtrRecyclerView.nestedScrollHook = cVar;
        mTPtrRecyclerView.afterTouchListener = bVar;
        basementWeexView.setOverScrollListener(new a());
    }

    public static final /* synthetic */ void a(WeexNestedScrollHelper weexNestedScrollHelper, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cead6b5c", new Object[]{weexNestedScrollHelper, motionEvent});
        } else {
            weexNestedScrollHelper.i(motionEvent);
        }
    }

    public static final /* synthetic */ void b(WeexNestedScrollHelper weexNestedScrollHelper, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a325a263", new Object[]{weexNestedScrollHelper, motionEvent});
        } else {
            weexNestedScrollHelper.j(motionEvent);
        }
    }

    public static final /* synthetic */ BasementWeexView c(WeexNestedScrollHelper weexNestedScrollHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasementWeexView) ipChange.ipc$dispatch("67acbab0", new Object[]{weexNestedScrollHelper});
        }
        return weexNestedScrollHelper.l;
    }

    public static final /* synthetic */ Boolean d(WeexNestedScrollHelper weexNestedScrollHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("321f6955", new Object[]{weexNestedScrollHelper});
        }
        return weexNestedScrollHelper.d;
    }

    public static final /* synthetic */ MTPtrRecyclerView e(WeexNestedScrollHelper weexNestedScrollHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTPtrRecyclerView) ipChange.ipc$dispatch("338e55c1", new Object[]{weexNestedScrollHelper});
        }
        return weexNestedScrollHelper.k;
    }

    public static final /* synthetic */ int f(WeexNestedScrollHelper weexNestedScrollHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8cb63d4", new Object[]{weexNestedScrollHelper})).intValue();
        }
        return weexNestedScrollHelper.b;
    }

    public static final /* synthetic */ void g(WeexNestedScrollHelper weexNestedScrollHelper, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8099f7b6", new Object[]{weexNestedScrollHelper, new Integer(i)});
        } else {
            weexNestedScrollHelper.b = i;
        }
    }

    public final void i(MotionEvent motionEvent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f7b55dc", new Object[]{this, motionEvent});
        } else if (motionEvent.getPointerCount() <= 1) {
            if (motionEvent.getAction() == 0) {
                this.e = motionEvent.getX();
                this.f = motionEvent.getY();
            } else if (motionEvent.getAction() == 2) {
                float abs = Math.abs(motionEvent.getX() - this.e);
                float abs2 = Math.abs(motionEvent.getY() - this.f);
                if (motionEvent.getY() > m() && this.d == null) {
                    float f = 20;
                    if (abs > f || abs2 > f) {
                        if (abs / abs2 <= 1) {
                            z = false;
                        }
                        this.d = Boolean.valueOf(z);
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.d = null;
            }
        }
    }

    public final void j(MotionEvent motionEvent) {
        boolean z;
        ViewParent viewParent;
        View renderView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("324820b5", new Object[]{this, motionEvent});
        } else if (motionEvent.getPointerCount() <= 1) {
            if (motionEvent.getAction() == 0) {
                z = true;
            } else {
                z = false;
            }
            float m = m();
            if (z) {
                if (this.k.getScrollState() != 1 || motionEvent.getY() <= m) {
                    this.f11312a = true;
                } else {
                    return;
                }
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getX(), Math.max(0.0f, motionEvent.getY() - m), motionEvent.getMetaState());
            com.taobao.android.weex_framework.a mInstance = this.l.getMInstance();
            View view = null;
            if (mInstance == null || (renderView = mInstance.getRenderView()) == null) {
                viewParent = null;
            } else {
                viewParent = renderView.getParent();
            }
            if (viewParent instanceof View) {
                view = viewParent;
            }
            View view2 = view;
            if (view2 != null) {
                if (z) {
                    this.f11312a = false;
                }
                if (!this.f11312a) {
                    view2.onTouchEvent(obtain);
                }
            }
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        this.k.unregisterOnFlingListener(n());
        this.k.removeOnScrollListener(p());
        this.k.unregisterOnTouchListener(o());
        MTPtrRecyclerView mTPtrRecyclerView = this.k;
        mTPtrRecyclerView.nestedScrollHook = null;
        mTPtrRecyclerView.afterTouchListener = null;
    }

    public final View l(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6659f82b", new Object[]{this, view});
        }
        ViewParent viewParent = null;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof RecyclerView) {
            return view;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            viewParent = parent;
        }
        return l((View) viewParent);
    }

    public final float m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb3dcf11", new Object[]{this})).floatValue();
        }
        View view = this.g;
        if (view == null) {
            View l = l(this.l);
            this.g = l;
            if (l != null) {
                return l.getY();
            }
            return 0.0f;
        } else if (view != null) {
            return view.getY();
        } else {
            ckf.s();
            throw null;
        }
    }

    public final WeexNestedScrollHelper$flingListener$2.AnonymousClass1 n() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("57b22f18", new Object[]{this});
        } else {
            njg njgVar = this.h;
            a0g a0gVar = $$delegatedProperties[0];
            value = njgVar.getValue();
        }
        return (WeexNestedScrollHelper$flingListener$2.AnonymousClass1) value;
    }

    public final View.OnTouchListener o() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("311eeb17", new Object[]{this});
        } else {
            njg njgVar = this.j;
            a0g a0gVar = $$delegatedProperties[2];
            value = njgVar.getValue();
        }
        return (View.OnTouchListener) value;
    }

    public final WeexNestedScrollHelper$scrollListener$2.AnonymousClass1 p() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("3b84633a", new Object[]{this});
        } else {
            njg njgVar = this.i;
            a0g a0gVar = $$delegatedProperties[1];
            value = njgVar.getValue();
        }
        return (WeexNestedScrollHelper$scrollListener$2.AnonymousClass1) value;
    }

    public final void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbe64b4", new Object[]{this, new Boolean(z)});
        } else if ((!this.k.isScrollEnable()) != z || this.c) {
            this.c = false;
            if (z) {
                TLog.loge("basementWeexLog", "parent禁止滚动");
                com.taobao.android.weex_framework.a mInstance = this.l.getMInstance();
                if (mInstance != null) {
                    this.k.setScrollEnable(false);
                    mInstance.setScrollEnabled(true);
                    return;
                }
                return;
            }
            Log.e("basementWeexLog", "parent允许滚动");
            this.k.setScrollEnable(true);
            com.taobao.android.weex_framework.a mInstance2 = this.l.getMInstance();
            if (mInstance2 != null) {
                mInstance2.setScrollEnabled(false);
            }
        }
    }

    static {
        t2o.a(745538019);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(dun.b(WeexNestedScrollHelper.class), "flingListener", "getFlingListener()Lcom/taobao/mytaobao/scroll/WeexNestedScrollHelper$flingListener$2$1;");
        dun.i(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(dun.b(WeexNestedScrollHelper.class), "scrollListener", "getScrollListener()Lcom/taobao/mytaobao/scroll/WeexNestedScrollHelper$scrollListener$2$1;");
        dun.i(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(dun.b(WeexNestedScrollHelper.class), "onTouchListener", "getOnTouchListener()Landroid/view/View$OnTouchListener;");
        dun.i(propertyReference1Impl3);
        $$delegatedProperties = new a0g[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3};
    }
}
