package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.o;
import com.taobao.android.dinamicx.widget.recycler.expose.ExposeHelperBuilder;
import com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager;
import java.util.ArrayList;
import tb.c4c;
import tb.d4c;
import tb.gp8;
import tb.h36;
import tb.hjd;
import tb.ic5;
import tb.jb6;
import tb.kl6;
import tb.lvk;
import tb.t2o;
import tb.vt5;
import tb.vu3;
import tb.wq2;
import tb.xv5;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXNativeRecyclerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private wq2 cLipRadiusHandler;
    private int contentHorizontalLength;
    private int contentOffsetX;
    private int contentOffsetY;
    private int contentVerticalLength;
    private boolean isClick;
    private float mActionDownX;
    private float mActionDownY;
    private gp8 mExposeHelper;
    public ArrayList<DXWidgetNode> mItemWidgetNodes;
    private int mScrolledX;
    private int mScrolledY;
    private boolean needScrollAfterLayout;
    private lvk onTapListener;
    private Parcelable saveInstanceState;
    private Parcelable state;
    private long exposeTime = 0;
    private int needFixScrollConflict = 0;
    private double velocitySpeed = -1.0d;
    private boolean enableSmoothScroll = false;
    private int lastX = 0;
    private int lastY = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements d4c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(DXNativeRecyclerView dXNativeRecyclerView) {
        }

        @Override // tb.d4c
        public String a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("716b22c0", new Object[]{this, new Integer(i)});
            }
            return i + "";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements hjd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f7355a;

        public b(e eVar) {
            this.f7355a = eVar;
        }

        @Override // tb.hjd
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31daa17d", new Object[]{this, new Integer(i)});
                return;
            }
            e eVar = this.f7355a;
            if (eVar != null) {
                ((o.b) eVar).b(i, DXNativeRecyclerView.this.mItemWidgetNodes);
            }
        }

        @Override // tb.hjd
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17b89437", new Object[]{this, new Integer(i)});
                return;
            }
            e eVar = this.f7355a;
            if (eVar != null) {
                ((o.b) eVar).c(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements c4c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f7356a;

        public c(e eVar) {
            this.f7356a = eVar;
        }

        @Override // tb.c4c
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b9c2618", new Object[]{this, new Integer(i)});
                return;
            }
            e eVar = this.f7356a;
            if (eVar != null) {
                ((o.b) eVar).a(i, DXNativeRecyclerView.this.mItemWidgetNodes);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                DXNativeRecyclerView.this.scrollToPosition(0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface e {
    }

    static {
        t2o.a(444597181);
    }

    public DXNativeRecyclerView(Context context) {
        super(context);
    }

    private boolean checkHandleScrollConflictWithAngle() {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("448f6ac9", new Object[]{this})).booleanValue();
        }
        DXWidgetNode b2 = kl6.b(this);
        if (!(b2 instanceof DXWidgetNode) || (dXRuntimeContext = b2.getDXRuntimeContext()) == null) {
            return false;
        }
        return dXRuntimeContext.s().n();
    }

    public static /* synthetic */ Object ipc$super(DXNativeRecyclerView dXNativeRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1852077959:
                return new Boolean(super.fling(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
            case 1893018130:
                super.onScrolled(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/DXNativeRecyclerView");
        }
    }

    public void callParentDisallowInterceptTouchEvent(boolean z, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02266f3", new Object[]{this, new Boolean(z), new Float(f), new Float(f2)});
        } else {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void clearExposeCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49e1a998", new Object[]{this});
            return;
        }
        gp8 gp8Var = this.mExposeHelper;
        if (gp8Var != null) {
            gp8Var.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        wq2 wq2Var = this.cLipRadiusHandler;
        if (wq2Var == null) {
            super.dispatchDraw(canvas);
        } else if (wq2Var.h()) {
            super.dispatchDraw(canvas);
        } else {
            this.cLipRadiusHandler.b(this, canvas);
            super.dispatchDraw(canvas);
            this.cLipRadiusHandler.a(this, canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.needFixScrollConflict != 0) {
            if (checkHandleScrollConflictWithAngle()) {
                handleScrollConflictWithAngle(motionEvent);
            } else {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                int action = motionEvent.getAction();
                if (action == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else if (action == 2) {
                    int abs = Math.abs(rawX - this.lastX);
                    int abs2 = Math.abs(rawY - this.lastY);
                    if (this.needFixScrollConflict == 1) {
                        RecyclerView.LayoutManager layoutManager = getLayoutManager();
                        if (layoutManager instanceof StackLayoutManager) {
                            if (((StackLayoutManager) layoutManager).I() != 0.0f) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ViewParent parent = getParent();
                            if (abs < abs2 && !z) {
                                z2 = false;
                            }
                            parent.requestDisallowInterceptTouchEvent(z2);
                        } else {
                            ViewParent parent2 = getParent();
                            if (abs < abs2) {
                                z2 = false;
                            }
                            parent2.requestDisallowInterceptTouchEvent(z2);
                        }
                    }
                    this.lastX = rawX;
                    this.lastY = rawY;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e647787", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (zg5.J4() && this.needFixScrollConflict == 1 && (getLayoutManager() instanceof DXLinearLayoutManager) && ((DXLinearLayoutManager) getLayoutManager()).getOrientation() == 0) {
            if (i > 0 && !canScrollHorizontally(1)) {
                return false;
            }
            if (i < 0 && !canScrollHorizontally(-1)) {
                return false;
            }
        }
        double d2 = this.velocitySpeed;
        if (d2 > vu3.b.GEO_NOT_SUPPORT) {
            return super.fling((int) (i * d2), (int) (i2 * d2));
        }
        return super.fling(i, i2);
    }

    public wq2 getCLipRadiusHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wq2) ipChange.ipc$dispatch("a6a1a69b", new Object[]{this});
        }
        return this.cLipRadiusHandler;
    }

    public Parcelable getSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("27f8ecd3", new Object[]{this});
        }
        return this.saveInstanceState;
    }

    public int getScrolledX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e39c70", new Object[]{this})).intValue();
        }
        return this.mScrolledX;
    }

    public int getScrolledY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f1b3f1", new Object[]{this})).intValue();
        }
        return this.mScrolledY;
    }

    public double getValidScrollAngle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5985855", new Object[]{this})).doubleValue();
        }
        return 1.0471975511965976d;
    }

    public void handleScrollConflictWithAngle(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("821e8ac2", new Object[]{this, motionEvent});
            return;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                } else if (motionEvent.getX() - this.mActionDownX != 0.0f) {
                    if (Math.atan(Math.abs((motionEvent.getY() - this.mActionDownY) / (motionEvent.getX() - this.mActionDownX))) < getValidScrollAngle()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    RecyclerView.LayoutManager layoutManager = getLayoutManager();
                    if (layoutManager instanceof StackLayoutManager) {
                        if (((StackLayoutManager) layoutManager).I() != 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        ViewParent parent = getParent();
                        if (!z && !z2) {
                            z3 = false;
                        }
                        parent.requestDisallowInterceptTouchEvent(z3);
                        return;
                    }
                    callParentDisallowInterceptTouchEvent(canScrollHorizontally((int) (this.mActionDownX - motionEvent.getX())) & z, motionEvent.getX() - this.mActionDownX, motionEvent.getY() - this.mActionDownY);
                    return;
                } else {
                    return;
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            return;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.mActionDownX = motionEvent.getX();
        this.mActionDownY = motionEvent.getY();
    }

    public void initExposeHelper(JSONObject jSONObject, boolean z, ArrayList<DXWidgetNode> arrayList, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ee7625", new Object[]{this, jSONObject, new Boolean(z), arrayList, eVar});
            return;
        }
        this.mItemWidgetNodes = arrayList;
        int i = 300;
        float f = 0.5f;
        if (jSONObject != null) {
            if (jSONObject.getInteger(vt5.PLAY_DELAY) != null) {
                i = jSONObject.getInteger(vt5.PLAY_DELAY).intValue();
            }
            if (jSONObject.getFloat(vt5.VIEW_AREA_PERCENT) != null) {
                f = jSONObject.getFloat(vt5.VIEW_AREA_PERCENT).floatValue();
            }
        }
        gp8 gp8Var = this.mExposeHelper;
        if (gp8Var != null) {
            if (z) {
                gp8Var.c();
            } else {
                return;
            }
        }
        this.mExposeHelper = new ExposeHelperBuilder(this, new c(eVar)).l(ExposeHelperBuilder.REPEAT_MODE.CELL_REPEAT, new b(eVar)).b(new a(this)).m(f).n(i).p(z).a();
    }

    public boolean isNeedScrollAfterLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c028e24", new Object[]{this})).booleanValue();
        }
        return this.needScrollAfterLayout;
    }

    public boolean isSlider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c347a1b6", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void needScrollAfterLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc5fbea", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            needScrollAfterLayout(i, i2, i3, i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        try {
            super.onAttachedToWindow();
            this.state = onSaveInstanceState();
            gp8 gp8Var = this.mExposeHelper;
            if (gp8Var != null) {
                gp8Var.b();
            }
        } catch (Throwable th) {
            f fVar = new f(h36.TAG);
            f.a aVar = new f.a("native", "native_crash", f.DX_ERROR_CODE_RECYCLER_VIEW_ERROR_200007);
            aVar.e = xv5.a(th);
            if (fVar.c == null) {
                fVar.c = new ArrayList();
            }
            fVar.c.add(aVar);
            DXWidgetNode b2 = kl6.b(this);
            if (!(b2 == null || b2.getDXRuntimeContext() == null)) {
                fVar.b = b2.getDXRuntimeContext().p();
            }
            ic5.p(fVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        try {
            super.onDetachedFromWindow();
            Parcelable parcelable = this.state;
            if (parcelable != null) {
                onRestoreInstanceState(parcelable);
            }
            gp8 gp8Var = this.mExposeHelper;
            if (gp8Var != null) {
                gp8Var.c();
            }
        } catch (Throwable th) {
            f fVar = new f(h36.TAG);
            f.a aVar = new f.a("native", "native_crash", f.DX_ERROR_CODE_RECYCLER_VIEW_ERROR_200008);
            aVar.e = xv5.a(th);
            if (fVar.c == null) {
                fVar.c = new ArrayList();
            }
            fVar.c.add(aVar);
            DXWidgetNode b2 = kl6.b(this);
            if (!(b2 == null || b2.getDXRuntimeContext() == null)) {
                fVar.b = b2.getDXRuntimeContext().p();
            }
            ic5.p(fVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d52a12", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrolled(i, i2);
        if (this.mExposeHelper != null) {
            if (System.currentTimeMillis() - this.exposeTime > 500) {
                this.mExposeHelper.d();
            }
            this.exposeTime = System.currentTimeMillis();
        }
        this.mScrolledX += i;
        this.mScrolledY += i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.onTapListener != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.isClick = true;
                return true;
            } else if (action != 1) {
                if (action == 2) {
                    this.isClick = false;
                } else if (action == 3) {
                    this.isClick = false;
                }
            } else if (this.isClick) {
                ((o.a) this.onTapListener).a();
                this.isClick = false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setClipRadiusHandler(wq2 wq2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("592fcdab", new Object[]{this, wq2Var});
        } else {
            this.cLipRadiusHandler = wq2Var;
        }
    }

    public void setContentHorizontalLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa481bfb", new Object[]{this, new Integer(i)});
        } else {
            this.contentHorizontalLength = i;
        }
    }

    public void setContentVerticalLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0867a9", new Object[]{this, new Integer(i)});
        } else {
            this.contentVerticalLength = i;
        }
    }

    public void setEnableSmoothScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e34747ed", new Object[]{this, new Boolean(z)});
        } else {
            this.enableSmoothScroll = z;
        }
    }

    public void setNeedFixScrollConflict(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46dc78e0", new Object[]{this, new Integer(i)});
        } else {
            this.needFixScrollConflict = i;
        }
    }

    public void setOnTapListener(lvk lvkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3dbc4b", new Object[]{this, lvkVar});
        } else {
            this.onTapListener = lvkVar;
        }
    }

    public void setSaveInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95f2990f", new Object[]{this, parcelable});
        } else {
            this.saveInstanceState = parcelable;
        }
    }

    public void setScrolledX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4086ce32", new Object[]{this, new Integer(i)});
        } else {
            this.mScrolledX = i;
        }
    }

    public void setScrolledY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423ba6d1", new Object[]{this, new Integer(i)});
        } else {
            this.mScrolledY = i;
        }
    }

    public void setVelocitySpeed(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3dcd6f", new Object[]{this, new Double(d2)});
        } else {
            this.velocitySpeed = d2;
        }
    }

    public void triggerExpose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce68223", new Object[]{this});
            return;
        }
        gp8 gp8Var = this.mExposeHelper;
        if (gp8Var != null) {
            gp8Var.d();
        }
    }

    public void needScrollAfterLayout(int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbfa342a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        this.needScrollAfterLayout = true;
        if (i3 < this.contentHorizontalLength) {
            this.contentOffsetX = i;
            this.mScrolledX = 0;
            if (z) {
                jb6.n(new d());
            } else {
                scrollToPosition(0);
            }
        } else {
            this.contentOffsetX = i - this.mScrolledX;
        }
        if (i4 < this.contentVerticalLength) {
            this.contentOffsetY = i2;
            this.mScrolledY = 0;
            scrollToPosition(0);
        } else {
            this.contentOffsetY = i2 - this.mScrolledY;
        }
        this.contentHorizontalLength = i3;
        this.contentVerticalLength = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
            if (this.needScrollAfterLayout) {
                if (this.enableSmoothScroll) {
                    smoothScrollBy(this.contentOffsetX, this.contentOffsetY, new DecelerateInterpolator());
                } else {
                    scrollBy(this.contentOffsetX, this.contentOffsetY);
                }
                this.contentOffsetX = 0;
                this.contentOffsetY = 0;
                this.needScrollAfterLayout = false;
            }
            gp8 gp8Var = this.mExposeHelper;
            if (gp8Var != null) {
                gp8Var.d();
            }
        } catch (Throwable unused) {
        }
    }

    public DXNativeRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DXNativeRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
