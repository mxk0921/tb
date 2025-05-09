package com.taobao.uikit.extend.component.refresh;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBAnimationHeader extends TBRefreshHeader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBDefaultRefreshHeader";
    private final String[] mDefaultNormalAnimation;
    private String[] mRefreshAnimation;
    private final LottieAnimationView mRefreshProgressView1;
    private final LottieAnimationView mRefreshProgressView2;
    private final LottieAnimationView mRefreshProgressView3;
    private final String[] mDefaultDarkAnimation = {"pullrefresh/uik_pull_to_refresh_dark.json", "pullrefresh/uik_refreshing_dark.json", "pullrefresh/uik_refresh_finished_dark.json"};
    private final int[] mDefaultRefreshTips = {R.string.uik_pull_to_refresh, R.string.uik_release_to_refresh, R.string.uik_refreshing, R.string.uik_refresh_finished};
    private String[] mRefreshTips = null;
    private final FrameLayout mRefreshHeaderView = (FrameLayout) findViewById(R.id.uik_refresh_header);
    private final FrameLayout mRefreshViewGroup = (FrameLayout) findViewById(R.id.uik_refresh_header_fl);
    private final TextView mRefreshHeaderText = (TextView) findViewById(R.id.uik_refresh_header_text);
    private View mSecondFloorView = findViewById(R.id.uik_refresh_header_second_floor);

    /* compiled from: Taobao */
    /* renamed from: com.taobao.uikit.extend.component.refresh.TBAnimationHeader$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshHeaderStyle;
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState;

        static {
            int[] iArr = new int[TBRefreshHeader.RefreshHeaderStyle.values().length];
            $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshHeaderStyle = iArr;
            try {
                iArr[TBRefreshHeader.RefreshHeaderStyle.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshHeaderStyle[TBRefreshHeader.RefreshHeaderStyle.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[TBRefreshHeader.RefreshState.values().length];
            $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState = iArr2;
            try {
                iArr2[TBRefreshHeader.RefreshState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.PULL_TO_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.RELEASE_TO_REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.REFRESHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.SECOND_FLOOR_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.SECOND_FLOOR_END.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        t2o.a(932184106);
    }

    public TBAnimationHeader(Context context) {
        super(context);
        String[] strArr = {"pullrefresh/uik_pull_to_refresh.json", "pullrefresh/uik_refreshing.json", "pullrefresh/uik_refresh_finished.json"};
        this.mDefaultNormalAnimation = strArr;
        this.mRefreshAnimation = strArr;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.uik_swipe_animation_refresh_header, (ViewGroup) this, true);
        setBackgroundColor(Color.parseColor("#F4F4F4"));
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.uik_refresh_header_progress1);
        this.mRefreshProgressView1 = lottieAnimationView;
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) findViewById(R.id.uik_refresh_header_progress2);
        this.mRefreshProgressView2 = lottieAnimationView2;
        LottieAnimationView lottieAnimationView3 = (LottieAnimationView) findViewById(R.id.uik_refresh_header_progress3);
        this.mRefreshProgressView3 = lottieAnimationView3;
        lottieAnimationView.setScaleType(ImageView.ScaleType.FIT_END);
        lottieAnimationView.setAnimation(this.mRefreshAnimation[0]);
        lottieAnimationView2.setAnimation(this.mRefreshAnimation[1]);
        lottieAnimationView3.setAnimation(this.mRefreshAnimation[2]);
        lottieAnimationView2.setRepeatCount(-1);
        changeToState(TBRefreshHeader.RefreshState.NONE);
    }

    public static /* synthetic */ Object ipc$super(TBAnimationHeader tBAnimationHeader, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/refresh/TBAnimationHeader");
    }

    private void setHardwareEnable(LottieAnimationView lottieAnimationView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb4fd236", new Object[]{this, lottieAnimationView, new Boolean(z)});
        } else if (!lottieAnimationView.isHardwareAccelerated() || !z) {
            lottieAnimationView.setLayerType(1, null);
        } else {
            lottieAnimationView.setLayerType(2, null);
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void changeToState(TBRefreshHeader.RefreshState refreshState) {
        String str;
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2396ba61", new Object[]{this, refreshState});
        } else if (this.mState != refreshState) {
            StringBuilder sb = new StringBuilder("changeToState called: oldState is ");
            sb.append(this.mState.toString());
            sb.append(" newState is ");
            sb.append(refreshState.toString());
            TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener = this.mPullRefreshListener;
            if (onPullRefreshListener != null) {
                onPullRefreshListener.onRefreshStateChanged(this.mState, refreshState);
            }
            this.mState = refreshState;
            int i = AnonymousClass1.$SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[refreshState.ordinal()];
            if (i == 1) {
                this.mRefreshProgressView3.setVisibility(0);
                this.mRefreshProgressView1.setVisibility(8);
                this.mRefreshProgressView2.setVisibility(8);
                this.mRefreshProgressView1.cancelAnimation();
                this.mRefreshProgressView2.cancelAnimation();
                this.mRefreshProgressView3.cancelAnimation();
                TextView textView = this.mRefreshHeaderText;
                String[] strArr = this.mRefreshTips;
                if (strArr == null) {
                    str = Localization.q(this.mDefaultRefreshTips[3]);
                } else {
                    str = strArr[3];
                }
                textView.setText(str);
            } else if (i == 2) {
                this.mRefreshProgressView1.setVisibility(0);
                this.mRefreshProgressView2.setVisibility(8);
                this.mRefreshProgressView3.setVisibility(8);
                this.mRefreshViewGroup.setVisibility(0);
                TextView textView2 = this.mRefreshHeaderText;
                String[] strArr2 = this.mRefreshTips;
                if (strArr2 == null) {
                    str2 = Localization.q(this.mDefaultRefreshTips[0]);
                } else {
                    str2 = strArr2[0];
                }
                textView2.setText(str2);
            } else if (i == 3) {
                this.mRefreshViewGroup.setVisibility(0);
                TextView textView3 = this.mRefreshHeaderText;
                String[] strArr3 = this.mRefreshTips;
                if (strArr3 == null) {
                    str3 = Localization.q(this.mDefaultRefreshTips[1]);
                } else {
                    str3 = strArr3[1];
                }
                textView3.setText(str3);
            } else if (i == 4) {
                this.mRefreshProgressView2.setVisibility(0);
                this.mRefreshProgressView1.setVisibility(8);
                this.mRefreshProgressView3.setVisibility(8);
                this.mRefreshViewGroup.setVisibility(0);
                TextView textView4 = this.mRefreshHeaderText;
                String[] strArr4 = this.mRefreshTips;
                if (strArr4 == null) {
                    str4 = Localization.q(this.mDefaultRefreshTips[2]);
                } else {
                    str4 = strArr4[2];
                }
                textView4.setText(str4);
            } else if (i == 5) {
                this.mRefreshViewGroup.setVisibility(8);
            }
            if (this.mState == TBRefreshHeader.RefreshState.REFRESHING) {
                this.mRefreshProgressView2.playAnimation();
            }
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public View getRefreshView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("378be073", new Object[]{this});
        }
        return this.mRefreshViewGroup;
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public View getSecondFloorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d44bd650", new Object[]{this});
        }
        return this.mSecondFloorView;
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            return;
        }
        LottieAnimationView lottieAnimationView = this.mRefreshProgressView1;
        if (lottieAnimationView != null) {
            lottieAnimationView.setProgress(f);
        }
        LottieAnimationView lottieAnimationView2 = this.mRefreshProgressView2;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setProgress(f);
        }
        LottieAnimationView lottieAnimationView3 = this.mRefreshProgressView3;
        if (lottieAnimationView3 != null) {
            lottieAnimationView3.setProgress(f);
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setRefreshTipColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e29913b", new Object[]{this, new Integer(i)});
        } else {
            this.mRefreshHeaderText.setTextColor(i);
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setRefreshTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e253df27", new Object[]{this, strArr});
        } else if (strArr != null && strArr.length == 4) {
            this.mRefreshTips = strArr;
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setSecondFloorView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1b4090", new Object[]{this, view});
            return;
        }
        View view2 = this.mSecondFloorView;
        if (view2 != null) {
            if (this.mRefreshHeaderView != null) {
                this.mRefreshHeaderView.removeView(this.mSecondFloorView);
                this.mRefreshHeaderView.addView(view, 0, (FrameLayout.LayoutParams) view2.getLayoutParams());
                this.mSecondFloorView = view;
                view.setId(R.id.uik_refresh_header_second_floor);
            }
        } else if (this.mRefreshHeaderView != null) {
            this.mRefreshHeaderView.addView(view, 0, new FrameLayout.LayoutParams(-2, -2));
            this.mSecondFloorView = view;
            view.setId(R.id.uik_refresh_header_second_floor);
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void switchStyle(TBRefreshHeader.RefreshHeaderStyle refreshHeaderStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbda9585", new Object[]{this, refreshHeaderStyle});
            return;
        }
        int i = AnonymousClass1.$SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshHeaderStyle[refreshHeaderStyle.ordinal()];
        if (i == 1) {
            this.mRefreshAnimation = this.mDefaultNormalAnimation;
            this.mRefreshHeaderText.setTextColor(Color.parseColor("#7C889C"));
        } else if (i == 2) {
            this.mRefreshAnimation = this.mDefaultDarkAnimation;
            this.mRefreshHeaderText.setTextColor(Color.parseColor("#FFFFFF"));
        }
        this.mRefreshProgressView1.setAnimation(this.mRefreshAnimation[0]);
        this.mRefreshProgressView2.setAnimation(this.mRefreshAnimation[1]);
        this.mRefreshProgressView3.setAnimation(this.mRefreshAnimation[2]);
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setRefreshAnimation(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9e81f7", new Object[]{this, strArr, str});
        } else if (strArr == null || strArr.length != 3) {
            Log.e(TAG, "setRefreshAnimation: jsonAnim is null or length is not 3");
            this.mRefreshAnimation = this.mDefaultNormalAnimation;
        } else {
            this.mRefreshAnimation = strArr;
        }
    }

    public void setHardwareEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c73b0c0", new Object[]{this, new Boolean(z)});
            return;
        }
        setHardwareEnable(this.mRefreshProgressView1, z);
        setHardwareEnable(this.mRefreshProgressView2, z);
        setHardwareEnable(this.mRefreshProgressView3, z);
    }
}
