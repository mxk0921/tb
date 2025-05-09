package com.taobao.android.detail.ttdetail.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.mr7;
import tb.t2o;
import tb.tq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BarrageView extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BarrageView";
    private static final int TIME_COUNT = 1000;
    private ValueAnimator animator;
    private int itemSpace;
    private c listener;
    private long mAnimatorDuration;
    private int mCurrentOffset;
    private int mMaxCount;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6979a;
        public final /* synthetic */ View b;

        public a(int i, View view) {
            this.f6979a = i;
            this.b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            BarrageView.access$002(BarrageView.this, 1000 - ((Integer) valueAnimator.getAnimatedValue()).intValue());
            if (this.f6979a >= BarrageView.access$100(BarrageView.this)) {
                this.b.setAlpha(1.0f - (((float) valueAnimator.getCurrentPlayTime()) / ((float) valueAnimator.getDuration())));
            }
            BarrageView.this.requestLayout();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6980a;
        public final /* synthetic */ View b;

        public b(int i, View view) {
            this.f6980a = i;
            this.b = view;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            } else if (hashCode == 977295137) {
                super.onAnimationStart((Animator) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/widget/BarrageView$2");
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            int childCount = BarrageView.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                BarrageView.this.getChildAt(i).setAlpha(1.0f);
            }
            if (this.f6980a >= BarrageView.access$100(BarrageView.this)) {
                BarrageView.this.removeViewAt(0);
            }
            if (BarrageView.access$200(BarrageView.this) != null) {
                BarrageView.access$200(BarrageView.this).b(this.b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                super.onAnimationStart(animator);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
        View a(Context context, Object obj);

        void b(View view);
    }

    static {
        t2o.a(912262887);
    }

    public BarrageView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ int access$002(BarrageView barrageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d74939b", new Object[]{barrageView, new Integer(i)})).intValue();
        }
        barrageView.mCurrentOffset = i;
        return i;
    }

    public static /* synthetic */ int access$100(BarrageView barrageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7198f8f", new Object[]{barrageView})).intValue();
        }
        return barrageView.mMaxCount;
    }

    public static /* synthetic */ c access$200(BarrageView barrageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("427fbfcf", new Object[]{barrageView});
        }
        return barrageView.listener;
    }

    private void initView(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5591cf22", new Object[]{this, context, attributeSet});
            return;
        }
        this.itemSpace = mr7.b(context, 20.0f);
        this.mMaxCount = 2;
    }

    public static /* synthetic */ Object ipc$super(BarrageView barrageView, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/BarrageView");
    }

    public boolean addData(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("678aea4a", new Object[]{this, obj, new Boolean(z)})).booleanValue();
        }
        if (this.listener == null || this.mMaxCount <= 0 || obj == null) {
            return false;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return false;
        }
        int childCount = getChildCount();
        View a2 = this.listener.a(tq4.d(this), obj);
        if (a2 == null) {
            return false;
        }
        addView(a2);
        if (z) {
            View childAt = getChildAt(0);
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 1000);
            this.animator = ofInt;
            ofInt.setDuration(this.mAnimatorDuration);
            this.animator.addUpdateListener(new a(childCount, childAt));
            this.animator.addListener(new b(childCount, a2));
            this.animator.start();
        } else {
            this.mCurrentOffset = 0;
            if (childCount >= this.mMaxCount) {
                removeViewAt(0);
            }
        }
        return true;
    }

    public void initDatas(List<Object> list, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca5dc73", new Object[]{this, list, cVar});
            return;
        }
        this.listener = cVar;
        if (!(list == null || cVar == null)) {
            removeAllViews();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                addData(list.get(i), false);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int measuredHeight;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int childCount = getChildCount();
        int height = getHeight();
        if (childCount > 0) {
            f = (getChildAt(childCount - 1).getMeasuredHeight() + this.itemSpace) / 1000.0f;
        } else {
            f = 0.0f;
        }
        int i6 = childCount - 1;
        int i7 = 0;
        for (int i8 = i6; i8 >= 0; i8--) {
            View childAt = getChildAt(i8);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight2 = childAt.getMeasuredHeight();
            if (i8 == i6) {
                measuredHeight = i7 + height + measuredHeight2 + this.itemSpace;
                i5 = (int) ((1000 - this.mCurrentOffset) * f);
            } else {
                measuredHeight = i7 - getChildAt(i8 + 1).getMeasuredHeight();
                i5 = this.itemSpace;
            }
            i7 = measuredHeight - i5;
            childAt.layout(0, i7 - measuredHeight2, measuredWidth, i7);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            measureChild(childAt, i, i2);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (i5 < childCount) {
                if (i5 != 0) {
                    i4 += measuredHeight;
                    measuredHeight = this.itemSpace;
                }
                i4 += measuredHeight;
            }
            i3 = Math.max(i3, measuredWidth);
        }
        if (mode2 != 1073741824) {
            size2 = i3;
        }
        if (mode != 1073741824) {
            size = i4;
        }
        setMeasuredDimension(size2, size);
    }

    public void setAnimatorDuration(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcc54b20", new Object[]{this, new Long(j)});
        } else {
            this.mAnimatorDuration = j;
        }
    }

    public void setData(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4342fbb0", new Object[]{this, new Integer(i)});
        } else {
            this.mMaxCount = i;
        }
    }

    public void setItemSpace(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6b528b", new Object[]{this, new Integer(i)});
        } else {
            this.itemSpace = mr7.b(tq4.d(this), i);
        }
    }

    public void setMaxCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ccb6ef", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMaxCount = i;
        int childCount = getChildCount();
        if (childCount > this.mMaxCount) {
            for (int i2 = 0; i2 < childCount - this.mMaxCount; i2++) {
                removeViewAt(0);
            }
        }
    }

    public BarrageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BarrageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAnimatorDuration = 1000L;
        initView(context, attributeSet);
    }
}
