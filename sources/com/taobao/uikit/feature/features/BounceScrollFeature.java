package com.taobao.uikit.feature.features;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.MeasureCallback;
import com.taobao.uikit.feature.callback.ScrollCallback;
import com.taobao.uikit.feature.callback.TouchEventCallback;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BounceScrollFeature extends AbsFeature<ScrollView> implements ScrollCallback, MeasureCallback, TouchEventCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BOUNCE_TAG = "bounce";
    private View mBounceView;
    private float mLastY;
    private OnBounceHeightChangeListener mOnBounceHeightChangeListener;
    private Scroller mScroller;
    private float mMaxRatio = 1.0f;
    private boolean mIsFirstMove = true;
    private int mMaxHeadHeight = 0;
    private int mInitHeadHeight = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnBounceHeightChangeListener {
        void onHeightChanged(float f);
    }

    static {
        t2o.a(931135530);
    }

    public static /* synthetic */ void access$000(BounceScrollFeature bounceScrollFeature, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb07fed0", new Object[]{bounceScrollFeature, view});
        } else {
            bounceScrollFeature.findBounceView(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean changeHeight(float r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.uikit.feature.features.BounceScrollFeature.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0021
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r8)
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r7
            r8[r0] = r3
            java.lang.String r0 = "113ce986"
            java.lang.Object r8 = r2.ipc$dispatch(r0, r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x0021:
            android.view.View r2 = r7.mBounceView
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            int r3 = r2.height
            float r4 = (float) r3
            float r4 = r4 - r8
            int r5 = r7.mInitHeadHeight
            float r6 = (float) r5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x0035
            r2.height = r5
            goto L_0x0040
        L_0x0035:
            float r4 = (float) r3
            float r4 = r4 - r8
            int r5 = r7.mMaxHeadHeight
            float r6 = (float) r5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x0042
            r2.height = r5
        L_0x0040:
            r0 = 0
            goto L_0x0047
        L_0x0042:
            float r1 = (float) r3
            float r1 = r1 - r8
            int r8 = (int) r1
            r2.height = r8
        L_0x0047:
            android.view.View r8 = r7.mBounceView
            r8.setLayoutParams(r2)
            com.taobao.uikit.feature.features.BounceScrollFeature$OnBounceHeightChangeListener r8 = r7.mOnBounceHeightChangeListener
            if (r8 == 0) goto L_0x0056
            int r1 = r2.height
            float r1 = (float) r1
            r8.onHeightChanged(r1)
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.feature.features.BounceScrollFeature.changeHeight(float):boolean");
    }

    private void findBounceView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f655e45", new Object[]{this, view});
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                String str = (String) viewGroup.getChildAt(i).getContentDescription();
                if (str == null || !str.contains(BOUNCE_TAG)) {
                    if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                        findBounceView(viewGroup.getChildAt(i));
                    }
                } else {
                    this.mBounceView = viewGroup.getChildAt(i);
                    return;
                }
            }
        } else {
            String str2 = (String) view.getContentDescription();
            if (str2 != null && str2.contains(BOUNCE_TAG)) {
                this.mBounceView = view;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(BounceScrollFeature bounceScrollFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((BounceScrollFeature) ((View) objArr[0]));
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/features/BounceScrollFeature");
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void afterComputeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559935ef", new Object[]{this});
        } else if (this.mScroller.computeScrollOffset()) {
            int currY = this.mScroller.getCurrY();
            ViewGroup.LayoutParams layoutParams = this.mBounceView.getLayoutParams();
            layoutParams.height = currY;
            this.mBounceView.setLayoutParams(layoutParams);
            OnBounceHeightChangeListener onBounceHeightChangeListener = this.mOnBounceHeightChangeListener;
            if (onBounceHeightChangeListener != null) {
                onBounceHeightChangeListener.onHeightChanged(currY);
            }
            getHost().invalidate();
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82badcd", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.MeasureCallback
    public void afterOnMeasure(int i, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a728ea", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mMaxHeadHeight = (int) (getHost().getMeasuredWidth() * this.mMaxRatio);
        if (this.mInitHeadHeight == 0) {
            View view = this.mBounceView;
            if (view != null) {
                i3 = view.getMeasuredHeight();
            }
            this.mInitHeadHeight = i3;
        }
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void afterOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41622bd3", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35369b32", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void beforeComputeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c216ac", new Object[]{this});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f585f570", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.MeasureCallback
    public void beforeOnMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381b14e7", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void beforeOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65ccad0", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeOnTouchEvent(MotionEvent motionEvent) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673c1915", new Object[]{this, motionEvent});
            return;
        }
        int action = motionEvent.getAction() & 255;
        if ((action == 1 || action == 3 || action == 4) && (view = this.mBounceView) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Scroller scroller = this.mScroller;
            int i = layoutParams.height;
            scroller.startScroll(0, i, 0, this.mInitHeadHeight - i, 300);
            getHost().computeScroll();
        }
        if (this.mBounceView != null && !this.mIsFirstMove && action == 2) {
            float f = this.mLastY;
            if (0.0f < f) {
                float y = f - motionEvent.getY();
                if (getHost().getScrollY() <= 0 && 0.0f > y) {
                    changeHeight(y);
                } else if (0.0f <= y && changeHeight(y)) {
                    getHost().scrollBy(0, (int) (-y));
                }
            }
        }
        if (action == 2 && this.mIsFirstMove) {
            this.mIsFirstMove = false;
        } else if (action != 2) {
            this.mIsFirstMove = true;
        }
        this.mLastY = motionEvent.getY();
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        } else if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BounceScrollFeature, i, 0)) != null) {
            this.mMaxRatio = obtainStyledAttributes.getFloat(R.styleable.BounceScrollFeature_uik_maxRatio, this.mMaxRatio);
            obtainStyledAttributes.recycle();
        }
    }

    public void setMaxRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8573aa30", new Object[]{this, new Float(f)});
            return;
        }
        this.mMaxRatio = f;
        getHost().requestLayout();
    }

    public void setOnBounceHeightChangeListener(OnBounceHeightChangeListener onBounceHeightChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdd6d99c", new Object[]{this, onBounceHeightChangeListener});
        } else {
            this.mOnBounceHeightChangeListener = onBounceHeightChangeListener;
        }
    }

    public void setHost(ScrollView scrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff071d3", new Object[]{this, scrollView});
            return;
        }
        super.setHost((BounceScrollFeature) scrollView);
        this.mScroller = new Scroller(scrollView.getContext());
        getHost().setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.taobao.uikit.feature.features.BounceScrollFeature.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c61913e5", new Object[]{this, view, view2});
                } else {
                    BounceScrollFeature.access$000(BounceScrollFeature.this, view2);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b61353c5", new Object[]{this, view, view2});
                } else {
                    BounceScrollFeature.access$000(BounceScrollFeature.this, view2);
                }
            }
        });
    }
}
