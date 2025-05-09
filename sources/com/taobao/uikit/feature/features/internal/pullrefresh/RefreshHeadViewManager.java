package com.taobao.uikit.feature.features.internal.pullrefresh;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.alibaba.android.ultron.common.page.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.utils.UIKITLog;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RefreshHeadViewManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RefreshHeadViewManager";
    public static final int TYPE_FOOTER = 2;
    public static final int TYPE_FOOTER_HORIZONTAL = 4;
    public static final int TYPE_HEADER = 1;
    public static final int TYPE_HEADER_HORIZONTAL = 3;
    private TextView mArrowTextView;
    private ObjectAnimator mFadeAnimationSet;
    private int mHeadContentHeight;
    private int mHeadContentWidth;
    private RefreshHeadView mHeadView;
    private boolean mIsFinish;
    private int mLogoImageHeight;
    private CustomProgressBar mProgressBar;
    private String[] mTipArray;
    private TextView mTipsTextView;
    private int mType;

    static {
        t2o.a(931135577);
    }

    public RefreshHeadViewManager(Context context, Drawable drawable, View view, View view2, int i) {
        this(context, R.string.uik_refresh_arrow, view2, true, i);
    }

    private void showArrow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c8d1d93", new Object[]{this});
            return;
        }
        ObjectAnimator objectAnimator = this.mFadeAnimationSet;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.mArrowTextView.setScaleX(1.0f);
        this.mArrowTextView.setScaleY(1.0f);
        this.mArrowTextView.setAlpha(1.0f);
        this.mArrowTextView.setVisibility(0);
    }

    public void changeHeaderAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588897b8", new Object[]{this, new Float(f)});
            return;
        }
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.mHeadView.findViewById(R.id.uik_refresh_header_view).setAlpha(f);
    }

    public void changeProgressBarState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8212e1", new Object[]{this, new Integer(i)});
        } else {
            this.mProgressBar.changeProgressBarState(i);
        }
    }

    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.mHeadContentHeight;
    }

    public int getImageHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0bdcba6", new Object[]{this})).intValue();
        }
        return this.mLogoImageHeight;
    }

    public int getPaddingBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86af8f60", new Object[]{this})).intValue();
        }
        return this.mHeadView.getPaddingBottom();
    }

    public int getPaddingLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("111699fc", new Object[]{this})).intValue();
        }
        return this.mHeadView.getPaddingLeft();
    }

    public int getPaddingRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f2526fb", new Object[]{this})).intValue();
        }
        return this.mHeadView.getPaddingRight();
    }

    public int getPaddingTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c5536f4", new Object[]{this})).intValue();
        }
        return this.mHeadView.getPaddingTop();
    }

    public View getRefreshView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("378be073", new Object[]{this});
        }
        return this.mHeadView;
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.mHeadView;
    }

    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.mHeadContentWidth;
    }

    public void isHeadViewHeightContainImage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f5a750", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            View childAt = this.mHeadView.getChildAt(1);
            if (childAt != null) {
                this.mLogoImageHeight = childAt.getMeasuredHeight();
            }
            this.mHeadView.setPullDownDistance(this.mLogoImageHeight);
        }
    }

    public void measureView(View view) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca053468", new Object[]{this, view});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i2 = layoutParams.height;
        if (i2 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else {
            i = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce01816", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            this.mHeadView.setPadding(i, i2, i3, i4);
        }
    }

    public void setProgressBarInitState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b8f870", new Object[]{this, new Boolean(z)});
            return;
        }
        RefreshHeadView refreshHeadView = this.mHeadView;
        if (refreshHeadView != null) {
            refreshHeadView.setProgressBarInitState(z);
        }
    }

    public void setRefreshBackground(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d973fd95", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadView refreshHeadView = this.mHeadView;
        if (refreshHeadView != null) {
            refreshHeadView.setBackgroundColor(i);
        }
    }

    public void setRefreshViewColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2bd8ad7", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadView refreshHeadView = this.mHeadView;
        if (refreshHeadView != null) {
            refreshHeadView.setRefreshViewColor(i);
        }
    }

    public void setTipArray(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f7fa438", new Object[]{this, strArr});
        } else {
            this.mTipArray = strArr;
        }
    }

    public void setUpdatedTextView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244f4adc", new Object[]{this, str});
        }
    }

    public void setViewPadding(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4db72183", new Object[]{this, new Boolean(z)});
            return;
        }
        int i = this.mType;
        if ((i == 2 || i == 4) && z) {
            this.mHeadView.setPadding(0, 0, 0, 0);
        }
    }

    public RefreshHeadViewManager(Context context, int i, View view, boolean z, int i2) {
        this.mIsFinish = false;
        this.mLogoImageHeight = 0;
        RefreshHeadView refreshHeadView = new RefreshHeadView(context, i, view, z);
        this.mHeadView = refreshHeadView;
        this.mArrowTextView = refreshHeadView.getArrow();
        this.mProgressBar = this.mHeadView.getProgressbar();
        this.mTipsTextView = this.mHeadView.getRefreshStateText();
        measureView(this.mHeadView);
        this.mHeadContentHeight = this.mHeadView.getMeasuredHeight();
        int measuredWidth = this.mHeadView.getMeasuredWidth();
        this.mHeadContentWidth = measuredWidth;
        if (i2 == 1 || i2 == 2) {
            this.mHeadView.setPullDownDistance(this.mHeadContentHeight);
        } else {
            this.mHeadView.setPullDownDistance(measuredWidth);
        }
        this.mType = i2;
        if (i2 == 1) {
            this.mHeadView.setPadding(0, this.mHeadContentHeight * (-1), 0, 0);
        } else if (i2 == 2) {
            this.mHeadView.setPadding(0, 0, 0, this.mHeadContentHeight * (-1));
        } else if (i2 == 3) {
            this.mHeadView.setPadding(this.mHeadContentWidth * (-1), 0, 0, 0);
        } else {
            this.mHeadView.setPadding(0, 0, this.mHeadContentWidth * (-1), 0);
        }
        this.mHeadView.invalidate();
    }

    public void setFinish(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdbdd0b8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsFinish = z;
        if (z) {
            this.mArrowTextView.setVisibility(0);
            this.mTipsTextView.setVisibility(0);
            this.mProgressBar.setVisibility(0);
            this.mProgressBar.stopLoadingAnimation();
            String[] strArr = this.mTipArray;
            if (strArr != null && strArr.length > 3) {
                TextView textView = this.mTipsTextView;
                if (strArr == null) {
                    str = b.LOAD_FINISH;
                } else {
                    str = strArr[3];
                }
                textView.setText(str);
                return;
            }
            return;
        }
        this.mArrowTextView.setVisibility(4);
        this.mProgressBar.setVisibility(4);
        this.mTipsTextView.setVisibility(4);
    }

    private void startArrowAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a536afff", new Object[]{this});
            return;
        }
        if (this.mFadeAnimationSet == null) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.mArrowTextView, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
            this.mFadeAnimationSet = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
            this.mFadeAnimationSet.setDuration(200L);
        }
        this.mFadeAnimationSet.start();
    }

    public void changeHeaderViewByState(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d19ce4", new Object[]{this, new Integer(i)});
        } else if (!this.mIsFinish) {
            if (i == 0) {
                this.mProgressBar.setVisibility(0);
                this.mTipsTextView.setVisibility(0);
                TextView textView = this.mTipsTextView;
                String[] strArr = this.mTipArray;
                if (strArr == null || strArr.length < 2) {
                    str = "松开刷新";
                } else {
                    str = strArr[1];
                }
                textView.setText(str);
                startArrowAnim();
                UIKITLog.v(TAG, "当前状态，松开刷新", new Object[0]);
            } else if (i == 1) {
                this.mTipsTextView.setVisibility(0);
                TextView textView2 = this.mTipsTextView;
                String[] strArr2 = this.mTipArray;
                if (strArr2 == null || strArr2.length < 1) {
                    str2 = "下拉刷新";
                } else {
                    str2 = strArr2[0];
                }
                textView2.setText(str2);
                showArrow();
                UIKITLog.v(TAG, "当前状态，下拉刷新", new Object[0]);
            } else if (i == 2) {
                this.mTipsTextView.setVisibility(0);
                TextView textView3 = this.mTipsTextView;
                String[] strArr3 = this.mTipArray;
                if (strArr3 == null || strArr3.length < 3) {
                    str3 = "正在刷新...";
                } else {
                    str3 = strArr3[2];
                }
                textView3.setText(str3);
                this.mProgressBar.setVisibility(0);
                this.mProgressBar.startLoadingAnimaton();
                this.mArrowTextView.setVisibility(4);
                UIKITLog.v(TAG, "当前状态,正在刷新...", new Object[0]);
                View findViewById2 = this.mHeadView.findViewById(R.id.uik_refresh_header_view);
                if (findViewById2 != null) {
                    findViewById2.setAlpha(1.0f);
                }
            } else if (i == 3) {
                this.mProgressBar.stopLoadingAnimation();
                TextView textView4 = this.mTipsTextView;
                String[] strArr4 = this.mTipArray;
                if (strArr4 == null || strArr4.length < 3) {
                    str4 = "数据加载完毕";
                } else {
                    str4 = strArr4[3];
                }
                textView4.setText(str4);
                UIKITLog.v(TAG, "当前状态，done", new Object[0]);
                View findViewById3 = this.mHeadView.findViewById(R.id.uik_refresh_header_view);
                if (findViewById3 != null) {
                    findViewById3.setAlpha(1.0f);
                }
            } else if (i == 5 && (findViewById = this.mHeadView.findViewById(R.id.uik_refresh_header_view)) != null) {
                findViewById.setAlpha(0.0f);
            }
        }
    }
}
