package com.taobao.tao.recommend4.recyclerview;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend4.manager.a;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;
import tb.e7c;
import tb.fdl;
import tb.lh0;
import tb.py0;
import tb.t2o;
import tb.uqa;
import tb.z4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SlideUpAnimationLogic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f12713a;
    public final a.AbstractC0720a b;
    public final lh0 c;
    public final e7c d;
    public String e;
    public final View f;
    public View.OnTouchListener g;
    public int h;
    public int i;
    public RecyclerView.OnScrollListener j;
    public JSONObject k;
    public HomeChildRecyclerView.a l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements HomeChildRecyclerView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f12715a;

        public a(View view) {
            this.f12715a = view;
        }

        @Override // com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView.a
        public void onTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9b14c36", new Object[]{this, motionEvent});
                return;
            }
            if (SlideUpAnimationLogic.a(SlideUpAnimationLogic.this) == null) {
                SlideUpAnimationLogic.b(SlideUpAnimationLogic.this, this.f12715a);
                SlideUpAnimationLogic.c(SlideUpAnimationLogic.this, this.f12715a);
            }
            if (motionEvent.getAction() == 0) {
                SlideUpAnimationLogic.d(SlideUpAnimationLogic.this, motionEvent.getRawY());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f12716a;

        public b(View view) {
            this.f12716a = view;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (SlideUpAnimationLogic.h(SlideUpAnimationLogic.this, this.f12716a, (int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && 1 == motionEvent.getAction()) {
                SlideUpAnimationLogic.i(SlideUpAnimationLogic.this, this.f12716a, motionEvent);
            }
            return false;
        }
    }

    static {
        t2o.a(729810069);
    }

    public SlideUpAnimationLogic(View view, String str, lh0 lh0Var, a.AbstractC0720a aVar) {
        this.e = str;
        this.c = lh0Var;
        this.b = aVar;
        this.f = view;
        t(view);
    }

    public static /* synthetic */ View.OnTouchListener a(SlideUpAnimationLogic slideUpAnimationLogic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnTouchListener) ipChange.ipc$dispatch("fde69d06", new Object[]{slideUpAnimationLogic});
        }
        return slideUpAnimationLogic.g;
    }

    public static /* synthetic */ void b(SlideUpAnimationLogic slideUpAnimationLogic, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fd10bd", new Object[]{slideUpAnimationLogic, view});
        } else {
            slideUpAnimationLogic.v(view);
        }
    }

    public static /* synthetic */ void c(SlideUpAnimationLogic slideUpAnimationLogic, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("458279c", new Object[]{slideUpAnimationLogic, view});
        } else {
            slideUpAnimationLogic.u(view);
        }
    }

    public static /* synthetic */ float d(SlideUpAnimationLogic slideUpAnimationLogic, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7f72e57", new Object[]{slideUpAnimationLogic, new Float(f)})).floatValue();
        }
        slideUpAnimationLogic.f12713a = f;
        return f;
    }

    public static /* synthetic */ int e(SlideUpAnimationLogic slideUpAnimationLogic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c20e06b", new Object[]{slideUpAnimationLogic})).intValue();
        }
        return slideUpAnimationLogic.i;
    }

    public static /* synthetic */ int f(SlideUpAnimationLogic slideUpAnimationLogic, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20d79a3c", new Object[]{slideUpAnimationLogic, new Integer(i)})).intValue();
        }
        slideUpAnimationLogic.i = i;
        return i;
    }

    public static /* synthetic */ int g(SlideUpAnimationLogic slideUpAnimationLogic, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59b7fadb", new Object[]{slideUpAnimationLogic, new Integer(i)})).intValue();
        }
        slideUpAnimationLogic.h = i;
        return i;
    }

    public static /* synthetic */ boolean h(SlideUpAnimationLogic slideUpAnimationLogic, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ebe7d7c", new Object[]{slideUpAnimationLogic, view, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return slideUpAnimationLogic.r(view, i, i2);
    }

    public static /* synthetic */ void i(SlideUpAnimationLogic slideUpAnimationLogic, View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c464fd4c", new Object[]{slideUpAnimationLogic, view, motionEvent});
        } else {
            slideUpAnimationLogic.s(view, motionEvent);
        }
    }

    public final HomeChildRecyclerView.a k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeChildRecyclerView.a) ipChange.ipc$dispatch("cb21aaa4", new Object[]{this, view});
        }
        return new a(view);
    }

    public final View.OnTouchListener l(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnTouchListener) ipChange.ipc$dispatch("4282e075", new Object[]{this, view});
        }
        return new b(view);
    }

    public final RecyclerView.OnScrollListener m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("a565d267", new Object[]{this});
        }
        return new RecyclerView.OnScrollListener() { // from class: com.taobao.tao.recommend4.recyclerview.SlideUpAnimationLogic.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r5, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1177043419) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode == 1361287682) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/recommend4/recyclerview/SlideUpAnimationLogic$2");
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                SlideUpAnimationLogic.f(SlideUpAnimationLogic.this, i);
                super.onScrollStateChanged(recyclerView, i);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                if (SlideUpAnimationLogic.e(SlideUpAnimationLogic.this) != 0) {
                    SlideUpAnimationLogic.g(SlideUpAnimationLogic.this, i2);
                }
                super.onScrolled(recyclerView, i, i2);
            }
        };
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        w(this.f);
        y(this.f);
        x(this.f);
    }

    public final void o(JSONObject jSONObject, View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("977466b7", new Object[]{this, jSONObject, view, motionEvent});
            return;
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            uqa.b("buyAfterRecommend", "dispatchTouchEvent", "config == null");
            jSONObject = JSON.parseObject("{\"animationTime\":\"300\",\"recmdVisibleRate\":\"0.16\",\"marginTopDistance\":\"0\"}");
        }
        int intValue = jSONObject.getIntValue("animationTime");
        int intValue2 = jSONObject.getIntValue("marginTopDistance");
        if (j(view, motionEvent, jSONObject.getFloatValue("recmdVisibleRate"), intValue2)) {
            ((fdl.b) this.b).a(new py0(intValue2, new AccelerateDecelerateInterpolator(), intValue));
            uqa.b("buyAfterRecommend", "processTouchEvent", "通知执行动画了");
        }
    }

    public final JSONObject p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("896858d9", new Object[]{this});
        }
        if (this.k == null) {
            this.k = this.c.l(this.e);
        }
        JSONObject jSONObject = this.k;
        if (jSONObject != null && !jSONObject.isEmpty()) {
            return this.k.getJSONObject("interactiveUpgrade");
        }
        e7c e7cVar = this.d;
        if (e7cVar != null) {
            return e7cVar.getFirstScreenEffectConfig("interactiveUpgrade");
        }
        return null;
    }

    public final boolean r(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90afb68a", new Object[]{this, view, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int measuredWidth = view.getMeasuredWidth() + i3;
        int measuredHeight = view.getMeasuredHeight() + i4;
        if (i2 < i4 || i2 > measuredHeight || i < i3 || i > measuredWidth) {
            return false;
        }
        return true;
    }

    public final void s(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40fc59f0", new Object[]{this, view, motionEvent});
            return;
        }
        JSONObject p = p();
        if (p == null) {
            uqa.b("buyAfterRecommend", "dispatchTouchEvent", "服务端数据没下发");
        } else if (!p.getBooleanValue("enable")) {
            uqa.b("buyAfterRecommend", "dispatchTouchEvent", "服务端开关关闭");
        } else {
            o(p.getJSONObject("config"), view, motionEvent);
        }
    }

    public final void t(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d47100", new Object[]{this, view});
        } else if (view instanceof HomeChildRecyclerView) {
            HomeChildRecyclerView.a k = k(view);
            this.l = k;
            ((HomeChildRecyclerView) view).addDispatchTouchEventListener(k);
        }
    }

    public final void u(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10832ad8", new Object[]{this, view});
        } else if (view instanceof HomeChildRecyclerView) {
            ViewParent parent = view.getParent();
            if (parent instanceof RecyclerView) {
                RecyclerView.OnScrollListener m = m();
                this.j = m;
                ((RecyclerView) parent).addOnScrollListener(m);
            }
        }
    }

    public final void v(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01a3b16", new Object[]{this, view});
        } else if (view instanceof HomeChildRecyclerView) {
            ViewParent parent = view.getParent();
            if (parent instanceof RecyclerView) {
                View.OnTouchListener l = l(view);
                this.g = l;
                ((RecyclerView) parent).setOnTouchListener(l);
            }
        }
    }

    public final void w(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8fe9239", new Object[]{this, view});
        } else if (view instanceof HomeChildRecyclerView) {
            ((HomeChildRecyclerView) view).removeDispatchTouchEventListener(this.l);
        }
    }

    public final void x(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f83bff", new Object[]{this, view});
        } else if (view instanceof HomeChildRecyclerView) {
            ViewParent parent = view.getParent();
            if (parent instanceof RecyclerView) {
                ((RecyclerView) parent).removeOnScrollListener(this.j);
            }
        }
    }

    public final void y(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e8f9e7d", new Object[]{this, view});
        } else if (view instanceof HomeChildRecyclerView) {
            ViewParent parent = view.getParent();
            if (parent instanceof RecyclerView) {
                ((RecyclerView) parent).setOnTouchListener(null);
                this.g = null;
            }
        }
    }

    public void z(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2903cfd1", new Object[]{this, z4aVar});
        } else {
            this.e = z4aVar.b();
        }
    }

    public final boolean q(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daa60ec2", new Object[]{this, view, new Float(f)})).booleanValue();
        }
        if (!(view.getParent() instanceof RecyclerView)) {
            uqa.b("buyAfterRecommend", "isInfoFlowVisibleRateMoreThanThreshold", "该视图的父组件不是recycleView");
            return false;
        }
        int height = ((RecyclerView) view.getParent()).getHeight();
        uqa.b("buyAfterRecommend", "isInfoFlowVisibleRateMoreThanThreshold", "recycleViewHeight: " + height + "当前的view距离顶部的距离: " + view.getTop());
        return ((float) (height - view.getTop())) / ((float) height) > f;
    }

    public final boolean j(View view, MotionEvent motionEvent, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e43eb0d6", new Object[]{this, view, motionEvent, new Float(f), new Integer(i)})).booleanValue();
        }
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop() / 3;
        boolean z = this.f12713a - motionEvent.getRawY() > ((float) scaledTouchSlop) || this.h > 0;
        uqa.b("buyAfterRecommend", "checkIsNeedDoAnimation", "当前的距离：" + motionEvent.getRawY() + " 按下手指的时候的距离：" + this.f12713a + "滑动的阈值：" + scaledTouchSlop);
        boolean z2 = view.getTop() > i + 10;
        boolean q = q(view, f);
        uqa.b("buyAfterRecommend", "checkIsNeedDoAnimation", "当前是否是向上滚动：" + z + " 当前是否距离顶部的距离小于需要做动画的间距：" + z2 + "当前信息流露头的距离是否达标：" + q);
        return z && z2 && q;
    }

    public SlideUpAnimationLogic(View view, String str, e7c e7cVar, a.AbstractC0720a aVar) {
        this.e = str;
        this.d = e7cVar;
        this.b = aVar;
        this.f = view;
        t(view);
    }
}
