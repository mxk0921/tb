package com.taobao.android.icart.widget.touch;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DragFloatLayer<T> extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Interpolator sDragScrollInterpolator = new b();
    private int mBoundBottomY;
    private int mBoundTopY;
    private d<T> mCallback;
    private int mDragPos;
    private T mDragUniqueId;
    private e mDragingViewHolder;
    private T mEnterUniqueId;
    private f mFollower;
    private View mFollowerView;
    private T mLastSwapUniqueId;
    private float mLastX;
    private float mLastY;
    private int mOffsetY;
    private RecyclerView mRecyclerView;
    private T mSelectUniqueId;
    private int mSelectPos = -1;
    private int mEnterPos = -1;
    private float mUpScrollFactor = 1.0f;
    private boolean mScrolling = false;
    private int mScrollDy = 0;
    private long mDragScrollStartTimeInMs = Long.MIN_VALUE;
    private final Map<Point, Boolean> mCanSwapCache = new HashMap();
    private final Runnable mScrollRunnable = new a();
    private int mCachedMaxScrollSpeed = -1;
    public final ViewDragHelper viewDragHelper = ViewDragHelper.create(this, new ViewDragHelper.Callback() { // from class: com.taobao.android.icart.widget.touch.DragFloatLayer.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/touch/DragFloatLayer$3");
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            DragFloatLayer.access$702(DragFloatLayer.this, -1);
            DragFloatLayer.access$802(DragFloatLayer.this, null);
            DragFloatLayer.access$902(DragFloatLayer.this, -1);
            DragFloatLayer.access$1002(DragFloatLayer.this, null);
            DragFloatLayer.access$1102(DragFloatLayer.this, -1);
            DragFloatLayer.access$1202(DragFloatLayer.this, null);
            DragFloatLayer.access$1302(DragFloatLayer.this, null);
            DragFloatLayer.access$602(DragFloatLayer.this, null);
            DragFloatLayer.this.setVisibility(8);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dcd272d1", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
            }
            return 0;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53c1297f", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
            }
            return i;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faa1e09a", new Object[]{this, view, new Integer(i)});
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3e50ec1", new Object[]{this, new Integer(i)});
            } else if (i == 0) {
                a();
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bc6f844", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else {
                DragFloatLayer.access$300(DragFloatLayer.this, i3, i4);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f2, float f3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32d03eca", new Object[]{this, view, new Float(f2), new Float(f3)});
                return;
            }
            Object access$800 = DragFloatLayer.access$800(DragFloatLayer.this);
            Object access$1000 = DragFloatLayer.access$1000(DragFloatLayer.this);
            Object access$1300 = DragFloatLayer.access$1300(DragFloatLayer.this);
            a();
            DragFloatLayer.access$1400(DragFloatLayer.this).i(DragFloatLayer.access$500(DragFloatLayer.this), access$800, access$1300, access$1000);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("567455cc", new Object[]{this, view, new Integer(i)})).booleanValue();
            }
            if (view != DragFloatLayer.access$600(DragFloatLayer.this)) {
                return true;
            }
            return false;
        }
    });

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (DragFloatLayer.access$000(DragFloatLayer.this) != null) {
                e.a(DragFloatLayer.access$000(DragFloatLayer.this));
                DragFloatLayer dragFloatLayer = DragFloatLayer.this;
                DragFloatLayer.access$300(dragFloatLayer, 0, DragFloatLayer.access$200(dragFloatLayer));
                DragFloatLayer.access$500(DragFloatLayer.this).removeCallbacks(DragFloatLayer.access$400(DragFloatLayer.this));
                ViewCompat.postOnAnimation(DragFloatLayer.access$500(DragFloatLayer.this), this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Interpolator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
            }
            return f * f;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static abstract class c<T, C> implements d<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<C> f8096a;
        public final List<Point> b = new ArrayList();

        static {
            t2o.a(478151150);
            t2o.a(478151151);
        }

        public c(List<C> list) {
            this.f8096a = list;
        }

        public static <C> boolean k(List<C> list, Point point) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("94101ec4", new Object[]{list, point})).booleanValue();
            }
            int i = point.x;
            int i2 = point.y;
            if (i < i2) {
                while (i < i2) {
                    int i3 = i + 1;
                    Collections.swap(list, i, i3);
                    i = i3;
                }
                return true;
            } else if (i <= i2) {
                return false;
            } else {
                while (i > i2) {
                    Collections.swap(list, i, i - 1);
                    i--;
                }
                return true;
            }
        }

        @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.d
        public void c(RecyclerView recyclerView, int i, int i2) {
            int i3 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d5f81a0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            Point point = new Point(i, i2);
            ((ArrayList) this.b).add(point);
            if (k(this.f8096a, point)) {
                recyclerView.getAdapter().notifyItemMoved(i, i2);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                if (findFirstCompletelyVisibleItemPosition >= 0) {
                    View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstCompletelyVisibleItemPosition);
                    i3 = linearLayoutManager.getDecoratedTop(findViewByPosition) - linearLayoutManager.getTopDecorationHeight(findViewByPosition);
                }
                if (findFirstCompletelyVisibleItemPosition >= 0) {
                    linearLayoutManager.scrollToPositionWithOffset(findFirstCompletelyVisibleItemPosition, i3);
                }
            }
        }

        @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.d
        public void i(RecyclerView recyclerView, T t, T t2, T t3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3967e43", new Object[]{this, recyclerView, t, t2, t3});
            } else {
                ((ArrayList) this.b).clear();
            }
        }

        public Point j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Point) ipChange.ipc$dispatch("aa77c28a", new Object[]{this});
            }
            if (((ArrayList) this.b).isEmpty()) {
                return null;
            }
            List<Point> list = this.b;
            return new Point(((Point) ((ArrayList) this.b).get(0)).x, ((Point) ((ArrayList) list).get(((ArrayList) list).size() - 1)).y);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d<T> {
        boolean a(int i, int i2);

        void b(RecyclerView recyclerView, T t, T t2, int i, int i2);

        void c(RecyclerView recyclerView, int i, int i2);

        void d(RecyclerView recyclerView, T t);

        boolean e(RecyclerView recyclerView, T t, boolean z);

        T f(int i);

        boolean g(int i, int i2);

        void h(RecyclerView recyclerView, T t, T t2, int i, int i2);

        void i(RecyclerView recyclerView, T t, T t2, T t3);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final View f8097a;
        public final View b;

        static {
            t2o.a(478151152);
        }

        public e(View view, View view2) {
            this.f8097a = view;
            if (view2 == null) {
                this.b = view;
            } else {
                this.b = view2;
            }
        }

        public static /* synthetic */ View a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("938c256d", new Object[]{eVar});
            }
            return eVar.b;
        }

        public View b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("5cb3463", new Object[]{this});
            }
            return this.b;
        }

        public View c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("e6cee057", new Object[]{this});
            }
            return this.f8097a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface f {
        void onViewPositionChanged(Rect rect, Rect rect2, int i, int i2);
    }

    static {
        t2o.a(478151146);
    }

    public DragFloatLayer(Context context) {
        super(context);
    }

    public static /* synthetic */ e access$000(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("1445cc4e", new Object[]{dragFloatLayer});
        }
        return dragFloatLayer.mDragingViewHolder;
    }

    public static /* synthetic */ Object access$1000(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2463dac8", new Object[]{dragFloatLayer});
        }
        return dragFloatLayer.mSelectUniqueId;
    }

    public static /* synthetic */ Object access$1002(DragFloatLayer dragFloatLayer, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a3c50c2a", new Object[]{dragFloatLayer, obj});
        }
        dragFloatLayer.mSelectUniqueId = obj;
        return obj;
    }

    public static /* synthetic */ int access$1102(DragFloatLayer dragFloatLayer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8fe928e9", new Object[]{dragFloatLayer, new Integer(i)})).intValue();
        }
        dragFloatLayer.mEnterPos = i;
        return i;
    }

    public static /* synthetic */ Object access$1202(DragFloatLayer dragFloatLayer, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("64c89be8", new Object[]{dragFloatLayer, obj});
        }
        dragFloatLayer.mEnterUniqueId = obj;
        return obj;
    }

    public static /* synthetic */ Object access$1300(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6f67cfa5", new Object[]{dragFloatLayer});
        }
        return dragFloatLayer.mLastSwapUniqueId;
    }

    public static /* synthetic */ Object access$1302(DragFloatLayer dragFloatLayer, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("454a63c7", new Object[]{dragFloatLayer, obj});
        }
        dragFloatLayer.mLastSwapUniqueId = obj;
        return obj;
    }

    public static /* synthetic */ d access$1400(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("ae57a9c1", new Object[]{dragFloatLayer});
        }
        return dragFloatLayer.mCallback;
    }

    public static /* synthetic */ int access$200(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed8c72b0", new Object[]{dragFloatLayer})).intValue();
        }
        return dragFloatLayer.mScrollDy;
    }

    public static /* synthetic */ void access$300(DragFloatLayer dragFloatLayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd89c1e", new Object[]{dragFloatLayer, new Integer(i), new Integer(i2)});
        } else {
            dragFloatLayer.scrollAndMoveIfNecessary(i, i2);
        }
    }

    public static /* synthetic */ Runnable access$400(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("e92f0375", new Object[]{dragFloatLayer});
        }
        return dragFloatLayer.mScrollRunnable;
    }

    public static /* synthetic */ RecyclerView access$500(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("aa4ae667", new Object[]{dragFloatLayer});
        }
        return dragFloatLayer.mRecyclerView;
    }

    public static /* synthetic */ View access$600(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9e003ec3", new Object[]{dragFloatLayer});
        }
        return dragFloatLayer.mFollowerView;
    }

    public static /* synthetic */ View access$602(DragFloatLayer dragFloatLayer, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6634b031", new Object[]{dragFloatLayer, view});
        }
        dragFloatLayer.mFollowerView = view;
        return view;
    }

    public static /* synthetic */ int access$702(DragFloatLayer dragFloatLayer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5421cb2", new Object[]{dragFloatLayer, new Integer(i)})).intValue();
        }
        dragFloatLayer.mDragPos = i;
        return i;
    }

    public static /* synthetic */ Object access$800(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ed8bfcf", new Object[]{dragFloatLayer});
        }
        return dragFloatLayer.mDragUniqueId;
    }

    public static /* synthetic */ Object access$802(DragFloatLayer dragFloatLayer, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b2535d71", new Object[]{dragFloatLayer, obj});
        }
        dragFloatLayer.mDragUniqueId = obj;
        return obj;
    }

    public static /* synthetic */ int access$902(DragFloatLayer dragFloatLayer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ddbefbf0", new Object[]{dragFloatLayer, new Integer(i)})).intValue();
        }
        dragFloatLayer.mSelectPos = i;
        return i;
    }

    private boolean canSelectWithCache(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32e281fb", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return this.mCallback.a(i, i2);
    }

    private boolean canSwapWithCache(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43cf4884", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        Point point = new Point(i, i2);
        Boolean bool = this.mCanSwapCache.get(point);
        if (bool == null) {
            boolean g = this.mCallback.g(i, i2);
            bool = Boolean.valueOf(g);
            if (g) {
                this.mCanSwapCache.clear();
            } else {
                this.mCanSwapCache.put(point, bool);
            }
        }
        return bool.booleanValue();
    }

    private Rect findRect(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("77b15ee8", new Object[]{this, eVar});
        }
        View b2 = eVar.b();
        int left = b2.getLeft();
        int top = b2.getTop();
        while (b2 != eVar.c() && (b2.getParent() instanceof View)) {
            b2 = (View) b2.getParent();
            left += b2.getLeft();
            top += b2.getTop();
        }
        return new Rect(left, top, eVar.b().getWidth() + left, eVar.b().getHeight() + top);
    }

    private int getMaxDragScroll(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("229237b4", new Object[]{this, recyclerView})).intValue();
        }
        if (this.mCachedMaxScrollSpeed == -1) {
            this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        return this.mCachedMaxScrollSpeed;
    }

    private int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("289e42fe", new Object[]{this, recyclerView, new Integer(i), new Integer(i2), new Integer(i3), new Long(j)})).intValue();
        }
        int maxDragScroll = getMaxDragScroll(recyclerView);
        int abs = Math.abs(i2);
        int signum = (int) Math.signum(i2);
        if (i2 < 0) {
            f2 = this.mUpScrollFactor;
        } else {
            f2 = 1.0f;
        }
        if (r4 != 0) {
            return r4;
        }
        if (i2 > 0) {
            return 1;
        }
        return -1;
    }

    public static /* synthetic */ Object ipc$super(DragFloatLayer dragFloatLayer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/touch/DragFloatLayer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b1, code lost:
        r0 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void scrollAndMoveIfNecessary(int r23, int r24) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.icart.widget.touch.DragFloatLayer.scrollAndMoveIfNecessary(int, int):void");
    }

    public void abortDrag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa244f0b", new Object[]{this});
        } else {
            this.viewDragHelper.abort();
        }
    }

    public void attach(RecyclerView recyclerView, d<T> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfc858", new Object[]{this, recyclerView, dVar});
            return;
        }
        this.mRecyclerView = recyclerView;
        this.mCallback = dVar;
        setVisibility(8);
        setMotionEventSplittingEnabled(false);
    }

    public int getDragPos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("112e1bc4", new Object[]{this})).intValue();
        }
        return this.mDragPos;
    }

    public T getDragUniqueId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("23ef96b5", new Object[]{this});
        }
        return this.mDragUniqueId;
    }

    public int getEnterPos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22a12d4c", new Object[]{this})).intValue();
        }
        return this.mEnterPos;
    }

    public T getSelectUniqueId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1657596d", new Object[]{this});
        }
        return this.mSelectUniqueId;
    }

    public boolean isDraging() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6a482f", new Object[]{this})).booleanValue();
        }
        if (this.mDragingViewHolder != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return this.viewDragHelper.shouldInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            this.viewDragHelper.processTouchEvent(motionEvent);
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.mDragingViewHolder = null;
            this.mDragUniqueId = null;
            setForeground(null);
            removeAllViews();
        }
        return true;
    }

    public void setBound(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc6c3c63", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mBoundTopY = i;
        this.mBoundBottomY = i2;
    }

    public void setFollower(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2627fe3", new Object[]{this, fVar});
        } else {
            this.mFollower = fVar;
        }
    }

    public void setLastMonitorEvent(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995e245f", new Object[]{this, new Float(f2), new Float(f3)});
            return;
        }
        this.mLastX = f2;
        this.mLastY = f3;
    }

    public void setUpScrollFactor(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8dda00", new Object[]{this, new Float(f2)});
        } else {
            this.mUpScrollFactor = f2;
        }
    }

    public void startDragItemSnapshot(e eVar, Rect rect, int i, T t, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc5792e", new Object[]{this, eVar, rect, new Integer(i), t, new Integer(i2)});
            return;
        }
        this.mOffsetY = i;
        int i3 = rect.left;
        int i4 = rect.top;
        int i5 = this.mOffsetY;
        Rect rect2 = new Rect(i3, i4 + i5, rect.right, rect.bottom + i5);
        View c2 = eVar.c();
        c2.setLeft(rect2.left);
        c2.setTop(rect2.top);
        c2.setRight(rect2.right);
        c2.setBottom(rect2.bottom);
        c2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect2.width(), rect2.height());
        layoutParams.topMargin = rect2.top;
        if (c2.getParent() instanceof ViewGroup) {
            ((ViewGroup) c2.getParent()).removeView(c2);
        }
        addView(c2, layoutParams);
        this.mDragingViewHolder = eVar;
        this.mDragUniqueId = t;
        this.mDragPos = i2;
        long uptimeMillis = SystemClock.uptimeMillis();
        long uptimeMillis2 = SystemClock.uptimeMillis();
        float f2 = this.mLastX;
        if (f2 < 0.0f) {
            f2 = rect2.centerX();
        }
        float f3 = this.mLastY;
        if (f3 < 0.0f) {
            f3 = rect2.centerY();
        }
        dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis2, 0, f2, f3, 0));
        setVisibility(0);
    }

    public DragFloatLayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DragFloatLayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DragFloatLayer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
