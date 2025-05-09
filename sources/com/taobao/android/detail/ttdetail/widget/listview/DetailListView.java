package com.taobao.android.detail.ttdetail.widget.listview;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescNativeController;
import java.util.HashMap;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailListView extends TListView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DetailListView";
    private Context mContext;
    private int mCoverOffset;
    private boolean mInnerArrowTop;
    private int mLastScrollYOffset;
    private int mMaxScrollY;
    private a mOnItemStateListener;
    private float xDistance;
    private float xLast;
    private float yDistance;
    private float yLast;
    private b mOnScrollYDistanceChangeListener = null;
    private int mFirstVisibleItem = -1;
    private int mLastVisibleItem = -1;
    private int mLastPartInvisibleItem = -1;
    private int mLastPartVisibleItem = -1;
    public HashMap<Integer, Integer> mObservedChilds = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a(int i, int i2);
    }

    static {
        t2o.a(912263022);
    }

    public DetailListView(Context context) {
        super(context);
        this.mContext = context;
        init();
    }

    public static /* synthetic */ int access$000(DetailListView detailListView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f3ce855", new Object[]{detailListView})).intValue();
        }
        return detailListView.mMaxScrollY;
    }

    public static /* synthetic */ int access$002(DetailListView detailListView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("167864d6", new Object[]{detailListView, new Integer(i)})).intValue();
        }
        detailListView.mMaxScrollY = i;
        return i;
    }

    public static /* synthetic */ b access$100(DetailListView detailListView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1e6ef828", new Object[]{detailListView});
        }
        return detailListView.mOnScrollYDistanceChangeListener;
    }

    public static /* synthetic */ boolean access$202(DetailListView detailListView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dd4fa3a", new Object[]{detailListView, new Boolean(z)})).booleanValue();
        }
        detailListView.mInnerArrowTop = z;
        return z;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.taobao.android.detail.ttdetail.widget.listview.DetailListView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int mLastTop;
            private int mTop;

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                boolean z = true;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2eb0734b", new Object[]{this, absListView, new Integer(i), new Integer(i2), new Integer(i3)});
                    return;
                }
                this.mLastTop = this.mTop;
                int innerTopY = DetailListView.this.getInnerTopY();
                this.mTop = innerTopY;
                if (innerTopY > DetailListView.access$000(DetailListView.this)) {
                    DetailListView.access$002(DetailListView.this, this.mTop);
                }
                if (DetailListView.access$100(DetailListView.this) != null) {
                    DetailListView.access$100(DetailListView.this).a(this.mTop, this.mLastTop);
                }
                DetailListView detailListView = DetailListView.this;
                if (this.mLastTop <= this.mTop) {
                    z = false;
                }
                DetailListView.access$202(detailListView, z);
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("532cfb08", new Object[]{this, absListView, new Integer(i)});
                }
            }
        });
        setOverScrollMode(2);
    }

    public static /* synthetic */ Object ipc$super(DetailListView detailListView, String str, Object... objArr) {
        if (str.hashCode() == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/listview/DetailListView");
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        HashMap<Integer, Integer> hashMap = this.mObservedChilds;
        if (hashMap != null) {
            hashMap.clear();
            this.mObservedChilds = null;
        }
        setOnScrollListener(null);
        setAdapter((ListAdapter) null);
    }

    public int getFirstVisibleItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("466cec45", new Object[]{this})).intValue();
        }
        return this.mFirstVisibleItem;
    }

    public int getInnerTopY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("afb34de", new Object[]{this})).intValue();
        }
        if (getChildCount() <= 0) {
            return 0;
        }
        int firstVisiblePosition = getFirstVisiblePosition();
        for (int i = 0; i < getChildCount(); i++) {
            this.mObservedChilds.put(Integer.valueOf(i + firstVisiblePosition), Integer.valueOf(getChildAt(i).getMeasuredHeight()));
        }
        int i2 = -getChildAt(0).getTop();
        for (int i3 = 0; i3 < firstVisiblePosition; i3++) {
            if (this.mObservedChilds.get(Integer.valueOf(i3)) != null) {
                i2 += this.mObservedChilds.get(Integer.valueOf(i3)).intValue();
            }
        }
        return i2;
    }

    public int getLastVisibleItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a4c3f3", new Object[]{this})).intValue();
        }
        return this.mLastVisibleItem;
    }

    public int getMaxScrollY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3024a98", new Object[]{this})).intValue();
        }
        return this.mMaxScrollY;
    }

    public int getTotalHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b76e4f", new Object[]{this})).intValue();
        }
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((Activity) this.mContext).getWindowManager().getDefaultDisplay().getWidth(), Integer.MIN_VALUE);
        int i = 0;
        for (int i2 = 0; i2 < adapter.getCount(); i2++) {
            View view = adapter.getView(i2, null, this);
            view.measure(makeMeasureSpec, 0);
            i += view.getMeasuredHeight();
        }
        return i;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.listview.TListView, android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.yDistance = 0.0f;
            this.xDistance = 0.0f;
            this.xLast = motionEvent.getX();
            this.yLast = motionEvent.getY();
        } else if (action == 1) {
            this.xLast = motionEvent.getX();
            this.yLast = motionEvent.getY();
        } else if (action == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.xDistance += Math.abs(x - this.xLast);
            float abs = this.yDistance + Math.abs(y - this.yLast);
            this.yDistance = abs;
            this.xLast = x;
            this.yLast = y;
            if (this.xDistance > abs) {
                return false;
            }
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            tgh.c(TAG, "", e);
            return false;
        }
    }

    public void onScroll(int i) {
        a aVar;
        a aVar2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d55950", new Object[]{this, new Integer(i)});
            return;
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            int firstVisiblePosition = getFirstVisiblePosition();
            int i2 = 0;
            while (i2 < childCount && (getChildAt(i2).getBottom() + i) - this.mCoverOffset <= 0) {
                i2++;
            }
            int i3 = childCount - 1;
            while (i3 >= 0 && getChildAt(i3).getTop() + i >= getMeasuredHeight()) {
                i3--;
            }
            if (i2 <= i3) {
                int i4 = firstVisiblePosition + i2;
                int i5 = firstVisiblePosition + i3;
                int i6 = this.mLastScrollYOffset;
                if (i > i6) {
                    z = true;
                } else if (i >= i6) {
                    z = this.mInnerArrowTop;
                }
                this.mLastScrollYOffset = i;
                for (int i7 = i4; i7 <= i5; i7++) {
                    if ((i7 > this.mLastVisibleItem || i7 < this.mFirstVisibleItem) && i7 >= 0 && i7 < getCount() && (aVar2 = this.mOnItemStateListener) != null) {
                        ((DescNativeController.a) aVar2).d(i7);
                    }
                }
                int i8 = this.mFirstVisibleItem;
                if (!(i8 == -1 || this.mLastVisibleItem == -1)) {
                    while (i8 <= this.mLastVisibleItem) {
                        if ((i8 < i4 || i8 > i5) && i8 >= 0 && i8 < getCount() && (aVar = this.mOnItemStateListener) != null) {
                            ((DescNativeController.a) aVar).a(i8, z);
                        }
                        i8++;
                    }
                }
                this.mFirstVisibleItem = i4;
                this.mLastVisibleItem = i5;
                if (z) {
                    View childAt = getChildAt(i2);
                    if ((childAt.getBottom() + i) - this.mCoverOffset > childAt.getMeasuredHeight() / 2 && this.mLastPartVisibleItem != i4) {
                        this.mLastPartVisibleItem = i4;
                        a aVar3 = this.mOnItemStateListener;
                        if (aVar3 != null) {
                            ((DescNativeController.a) aVar3).c(i4);
                        }
                    }
                    View childAt2 = getChildAt(i3);
                    if ((getMeasuredHeight() - childAt2.getTop()) - i < childAt2.getMeasuredHeight() / 2 && this.mLastPartInvisibleItem != i5) {
                        this.mLastPartInvisibleItem = i5;
                        a aVar4 = this.mOnItemStateListener;
                        if (aVar4 != null) {
                            ((DescNativeController.a) aVar4).b(i5);
                            return;
                        }
                        return;
                    }
                    return;
                }
                View childAt3 = getChildAt(i2);
                if ((childAt3.getBottom() + i) - this.mCoverOffset < childAt3.getMeasuredHeight() / 2 && this.mLastPartInvisibleItem != i4) {
                    this.mLastPartInvisibleItem = i4;
                    a aVar5 = this.mOnItemStateListener;
                    if (aVar5 != null) {
                        ((DescNativeController.a) aVar5).b(i4);
                    }
                }
                View childAt4 = getChildAt(i3);
                if ((getMeasuredHeight() - childAt4.getTop()) - i > childAt4.getMeasuredHeight() / 2 && this.mLastPartVisibleItem != i5) {
                    this.mLastPartVisibleItem = i5;
                    a aVar6 = this.mOnItemStateListener;
                    if (aVar6 != null) {
                        ((DescNativeController.a) aVar6).c(i5);
                    }
                }
            }
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.mFirstVisibleItem = -1;
        this.mLastVisibleItem = -1;
        this.mLastPartVisibleItem = -1;
        this.mLastPartInvisibleItem = -1;
    }

    public void setCoverOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd0da6f4", new Object[]{this, new Integer(i)});
        } else {
            this.mCoverOffset = i;
        }
    }

    public void setOnItemStateListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4127c5f2", new Object[]{this, aVar});
        } else {
            this.mOnItemStateListener = aVar;
        }
    }

    public void setOnScrollYDistanceChangeListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c2f2a0c", new Object[]{this, bVar});
        } else {
            this.mOnScrollYDistanceChangeListener = bVar;
        }
    }

    public DetailListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        init();
    }

    public DetailListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        init();
    }
}
