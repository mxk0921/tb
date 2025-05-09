package com.taobao.uikit.extend.component.refresh;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.taobao.uikit.feature.features.internal.pullrefresh.CustomProgressBar;
import com.taobao.uikit.feature.features.internal.pullrefresh.RefreshHeadView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBOldRefreshHeader extends TBRefreshHeader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Typeface sIconfont;
    private static int sReference = 0;
    private TextView mArrowTextView;
    private ObjectAnimator mFadeAnimationSet;
    private RefreshHeadView mRefreshHeadView;
    private FrameLayout mRefreshHeaderView;
    private CustomProgressBar mRefreshProgressView;
    private TextView mRefreshTipView;
    private View mSecondFloorView;
    private final int[] mDefaultRefreshTips = {R.string.uik_pull_to_refresh, R.string.uik_release_to_refresh, R.string.uik_refreshing, R.string.uik_refresh_finished};
    private String[] mRefreshTips = null;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.uikit.extend.component.refresh.TBOldRefreshHeader$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState;

        static {
            int[] iArr = new int[TBRefreshHeader.RefreshState.values().length];
            $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState = iArr;
            try {
                iArr[TBRefreshHeader.RefreshState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.PULL_TO_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.RELEASE_TO_REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.REFRESHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.SECOND_FLOOR_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.SECOND_FLOOR_END.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        t2o.a(932184114);
    }

    public TBOldRefreshHeader(Context context) {
        super(context);
        this.mRefreshHeaderView = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.mRefreshHeaderView.setId(R.id.uik_refresh_header);
        addView(this.mRefreshHeaderView, layoutParams);
        this.mSecondFloorView = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        this.mSecondFloorView.setId(R.id.uik_refresh_header_second_floor);
        this.mRefreshHeaderView.addView(this.mSecondFloorView, layoutParams2);
        setBackgroundResource(R.color.uik_refresh_head_bg);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        RefreshHeadView refreshHeadView = new RefreshHeadView(context, R.string.uik_refresh_arrow, null, false);
        this.mRefreshHeadView = refreshHeadView;
        this.mRefreshHeaderView.addView(refreshHeadView, layoutParams3);
        this.mRefreshTipView = this.mRefreshHeadView.getRefreshStateText();
        this.mRefreshProgressView = this.mRefreshHeadView.getProgressbar();
        this.mArrowTextView = this.mRefreshHeadView.getArrow();
        changeToState(TBRefreshHeader.RefreshState.NONE);
    }

    public static /* synthetic */ Object ipc$super(TBOldRefreshHeader tBOldRefreshHeader, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/refresh/TBOldRefreshHeader");
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
        this.mRefreshHeadView.setAlpha(f);
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void changeToState(TBRefreshHeader.RefreshState refreshState) {
        TBRefreshHeader.RefreshState refreshState2;
        String str;
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2396ba61", new Object[]{this, refreshState});
        } else if (this.mRefreshProgressView != null && (refreshState2 = this.mState) != refreshState) {
            TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener = this.mPullRefreshListener;
            if (onPullRefreshListener != null) {
                onPullRefreshListener.onRefreshStateChanged(refreshState2, refreshState);
            }
            this.mState = refreshState;
            int i = AnonymousClass1.$SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[refreshState.ordinal()];
            if (i == 1) {
                this.mRefreshProgressView.stopLoadingAnimation();
                TextView textView = this.mRefreshTipView;
                String[] strArr = this.mRefreshTips;
                if (strArr == null) {
                    str = Localization.q(this.mDefaultRefreshTips[3]);
                } else {
                    str = strArr[3];
                }
                textView.setText(str);
                this.mRefreshProgressView.stopLoadingAnimation();
                changeHeaderAlpha(1.0f);
            } else if (i == 2) {
                showArrow();
                this.mRefreshTipView.setVisibility(0);
                TextView textView2 = this.mRefreshTipView;
                String[] strArr2 = this.mRefreshTips;
                if (strArr2 == null) {
                    str2 = Localization.q(this.mDefaultRefreshTips[0]);
                } else {
                    str2 = strArr2[0];
                }
                textView2.setText(str2);
                this.mRefreshHeadView.setVisibility(0);
            } else if (i == 3) {
                startArrowAnim();
                TextView textView3 = this.mRefreshTipView;
                String[] strArr3 = this.mRefreshTips;
                if (strArr3 == null) {
                    str3 = Localization.q(this.mDefaultRefreshTips[1]);
                } else {
                    str3 = strArr3[1];
                }
                textView3.setText(str3);
                this.mRefreshHeadView.setVisibility(0);
            } else if (i == 4) {
                this.mRefreshProgressView.startLoadingAnimaton();
                this.mRefreshProgressView.setVisibility(0);
                this.mArrowTextView.setVisibility(4);
                TextView textView4 = this.mRefreshTipView;
                String[] strArr4 = this.mRefreshTips;
                if (strArr4 == null) {
                    str4 = Localization.q(this.mDefaultRefreshTips[2]);
                } else {
                    str4 = strArr4[2];
                }
                textView4.setText(str4);
                this.mRefreshHeadView.setVisibility(0);
            } else if (i == 5) {
                this.mRefreshHeadView.setVisibility(8);
            }
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public View getRefreshView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("378be073", new Object[]{this});
        }
        return this.mRefreshHeadView;
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public View getSecondFloorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d44bd650", new Object[]{this});
        }
        return this.mSecondFloorView;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        this.mRefreshProgressView.setPullDownDistance(getMeasuredHeight());
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
        } else if (this.mState == TBRefreshHeader.RefreshState.PULL_TO_REFRESH) {
            if (getMeasuredHeight() != 0) {
                this.mRefreshProgressView.changeProgressBarState((int) (getMeasuredHeight() * f));
            }
            changeHeaderAlpha(f);
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setRefreshAnimation(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9e81f7", new Object[]{this, strArr, str});
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setRefreshTipColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e29913b", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mRefreshTipView;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setRefreshTipSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a646859", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mRefreshTipView;
        if (textView != null) {
            textView.setTextSize(i);
            this.mRefreshTipView.setSingleLine(true);
            this.mRefreshTipView.setMaxLines(1);
            ViewGroup.LayoutParams layoutParams = this.mRefreshTipView.getLayoutParams();
            layoutParams.width = -2;
            this.mRefreshTipView.setLayoutParams(layoutParams);
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setRefreshTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e253df27", new Object[]{this, strArr});
            return;
        }
        if (strArr == null || strArr.length != 4) {
            this.mRefreshTips = null;
        }
        this.mRefreshTips = strArr;
    }

    @Deprecated
    public void showLoadingTip(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b8b5411", new Object[]{this, new Boolean(z)});
        } else if (this.mState == TBRefreshHeader.RefreshState.REFRESHING) {
            if (!z) {
                i = 8;
            }
            this.mRefreshProgressView.setVisibility(i);
            this.mRefreshHeadView.setVisibility(i);
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setSecondFloorView(View view) {
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1b4090", new Object[]{this, view});
        } else if (this.mSecondFloorView != null) {
            if (this.mRefreshHeaderView != null) {
                if (view.getLayoutParams() == null) {
                    layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                } else {
                    layoutParams2 = new FrameLayout.LayoutParams(view.getLayoutParams());
                }
                layoutParams2.gravity = 80;
                this.mRefreshHeaderView.removeView(this.mSecondFloorView);
                this.mRefreshHeaderView.addView(view, 0, layoutParams2);
                this.mSecondFloorView = view;
                view.setId(R.id.uik_refresh_header_second_floor);
            }
        } else if (this.mRefreshHeaderView != null) {
            if (view.getLayoutParams() == null) {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            } else {
                layoutParams = new FrameLayout.LayoutParams(view.getLayoutParams());
            }
            layoutParams.gravity = 80;
            this.mRefreshHeaderView.addView(view, 0, layoutParams);
            this.mSecondFloorView = view;
            view.setId(R.id.uik_refresh_header_second_floor);
        }
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
}
