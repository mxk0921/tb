package com.taobao.uikit.extend.component.refresh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBDefaultRefreshHeader extends TBRefreshHeader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBDefaultRefreshHeader";
    private final String[] mDefaultRefreshTips;
    private final LottieAnimationView mRefreshProgressView1;
    private final LottieAnimationView mRefreshProgressView2;
    private final LottieAnimationView mRefreshProgressView3;
    private String[] mRefreshTips;
    private String[] mDefaultRefreshAnimation = {"pullrefresh/normal/uik_pull_to_refresh.json", "pullrefresh/normal/uik_refreshing.json", "pullrefresh/normal/uik_refresh_finished.json"};
    private String[] mRefreshAnimation = {"pullrefresh/normal/uik_pull_to_refresh.json", "pullrefresh/normal/uik_refreshing.json", "pullrefresh/normal/uik_refresh_finished.json"};
    private FrameLayout mRefreshHeaderView = (FrameLayout) findViewById(R.id.uik_refresh_header);
    private FrameLayout mRefreshViewGroup = (FrameLayout) findViewById(R.id.uik_refresh_header_fl);
    private View mSecondFloorView = findViewById(R.id.uik_refresh_header_second_floor);

    /* compiled from: Taobao */
    /* renamed from: com.taobao.uikit.extend.component.refresh.TBDefaultRefreshHeader$1  reason: invalid class name */
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
        t2o.a(932184110);
    }

    public TBDefaultRefreshHeader(Context context) {
        super(context);
        Context context2 = getContext();
        int i = R.string.uik_pull_to_refresh;
        String string = context2.getString(i);
        Context context3 = getContext();
        int i2 = R.string.uik_release_to_refresh;
        String string2 = context3.getString(i2);
        Context context4 = getContext();
        int i3 = R.string.uik_refreshing;
        String string3 = context4.getString(i3);
        Context context5 = getContext();
        int i4 = R.string.uik_refresh_finished;
        this.mDefaultRefreshTips = new String[]{string, string2, string3, context5.getString(i4)};
        this.mRefreshTips = new String[]{getContext().getString(i), getContext().getString(i2), getContext().getString(i3), getContext().getString(i4)};
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.uik_swipe_refresh_header, (ViewGroup) this, true);
        setBackgroundResource(R.color.uik_refresh_head_bg);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.uik_refresh_header_progress1);
        this.mRefreshProgressView1 = lottieAnimationView;
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) findViewById(R.id.uik_refresh_header_progress2);
        this.mRefreshProgressView2 = lottieAnimationView2;
        LottieAnimationView lottieAnimationView3 = (LottieAnimationView) findViewById(R.id.uik_refresh_header_progress3);
        this.mRefreshProgressView3 = lottieAnimationView3;
        lottieAnimationView.setImageAssetsFolder("pullrefresh/normal/images");
        lottieAnimationView2.setImageAssetsFolder("pullrefresh/normal/images");
        lottieAnimationView3.setImageAssetsFolder("pullrefresh/normal/images");
        lottieAnimationView.setAnimation("pullrefresh/normal/uik_pull_to_refresh.json");
        lottieAnimationView2.setAnimation("pullrefresh/normal/uik_refreshing.json");
        lottieAnimationView3.setAnimation("pullrefresh/normal/uik_refresh_finished.json");
        lottieAnimationView2.setRepeatCount(-1);
        changeToState(TBRefreshHeader.RefreshState.NONE);
    }

    public static /* synthetic */ Object ipc$super(TBDefaultRefreshHeader tBDefaultRefreshHeader, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/refresh/TBDefaultRefreshHeader");
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
            LottieAnimationView lottieAnimationView = this.mRefreshProgressView1;
            String[] strArr = this.mRefreshAnimation;
            if (strArr == null) {
                str = this.mDefaultRefreshAnimation[0];
            } else {
                str = strArr[0];
            }
            lottieAnimationView.setAnimation(str);
            LottieAnimationView lottieAnimationView2 = this.mRefreshProgressView2;
            String[] strArr2 = this.mRefreshAnimation;
            if (strArr2 == null) {
                str2 = this.mDefaultRefreshAnimation[1];
            } else {
                str2 = strArr2[1];
            }
            lottieAnimationView2.setAnimation(str2);
            LottieAnimationView lottieAnimationView3 = this.mRefreshProgressView3;
            String[] strArr3 = this.mRefreshAnimation;
            if (strArr3 == null) {
                str3 = this.mDefaultRefreshAnimation[2];
            } else {
                str3 = strArr3[2];
            }
            lottieAnimationView3.setAnimation(str3);
            int i = AnonymousClass1.$SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[this.mState.ordinal()];
            if (i == 1) {
                this.mRefreshProgressView3.setVisibility(0);
                this.mRefreshProgressView1.setVisibility(8);
                this.mRefreshProgressView2.setVisibility(8);
                this.mRefreshProgressView1.cancelAnimation();
                this.mRefreshProgressView2.cancelAnimation();
                this.mRefreshProgressView3.cancelAnimation();
            } else if (i == 2) {
                this.mRefreshProgressView1.setVisibility(0);
                this.mRefreshProgressView2.setVisibility(8);
                this.mRefreshProgressView3.setVisibility(8);
                this.mRefreshViewGroup.setVisibility(0);
            } else if (i == 3) {
                this.mRefreshViewGroup.setVisibility(0);
            } else if (i == 4) {
                this.mRefreshProgressView2.setVisibility(0);
                this.mRefreshProgressView1.setVisibility(8);
                this.mRefreshProgressView3.setVisibility(8);
                this.mRefreshViewGroup.setVisibility(0);
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
    public void setRefreshAnimation(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9e81f7", new Object[]{this, strArr, str});
            return;
        }
        if (strArr == null || strArr.length != 3) {
            this.mRefreshAnimation = null;
        }
        this.mRefreshAnimation = strArr;
        this.mRefreshProgressView1.setImageAssetsFolder(str);
        this.mRefreshProgressView2.setImageAssetsFolder(str);
        this.mRefreshProgressView3.setImageAssetsFolder(str);
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setRefreshTipColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e29913b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setRefreshTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e253df27", new Object[]{this, strArr});
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

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void switchStyle(TBRefreshHeader.RefreshHeaderStyle refreshHeaderStyle) {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbda9585", new Object[]{this, refreshHeaderStyle});
            return;
        }
        int i = AnonymousClass1.$SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshHeaderStyle[refreshHeaderStyle.ordinal()];
        if (i == 1) {
            this.mDefaultRefreshAnimation = new String[]{"pullrefresh/normal/uik_pull_to_refresh.json", "pullrefresh/normal/uik_refreshing.json", "pullrefresh/normal/uik_refresh_finished.json"};
            this.mRefreshAnimation = new String[]{"pullrefresh/normal/uik_pull_to_refresh.json", "pullrefresh/normal/uik_refreshing.json", "pullrefresh/normal/uik_refresh_finished.json"};
            this.mRefreshProgressView1.setImageAssetsFolder("pullrefresh/normal/images");
            this.mRefreshProgressView2.setImageAssetsFolder("pullrefresh/normal/images");
            this.mRefreshProgressView3.setImageAssetsFolder("pullrefresh/normal/images");
        } else if (i == 2) {
            this.mDefaultRefreshAnimation = new String[]{"pullrefresh/dark/uik_pull_to_refresh.json", "pullrefresh/dark/uik_refreshing.json", "pullrefresh/dark/uik_refresh_finished.json"};
            this.mRefreshAnimation = new String[]{"pullrefresh/dark/uik_pull_to_refresh.json", "pullrefresh/dark/uik_refreshing.json", "pullrefresh/dark/uik_refresh_finished.json"};
            this.mRefreshProgressView1.setImageAssetsFolder("pullrefresh/dark/images");
            this.mRefreshProgressView2.setImageAssetsFolder("pullrefresh/dark/images");
            this.mRefreshProgressView3.setImageAssetsFolder("pullrefresh/dark/images");
            LottieAnimationView lottieAnimationView = this.mRefreshProgressView1;
            String[] strArr = this.mRefreshAnimation;
            if (strArr == null) {
                str = this.mDefaultRefreshAnimation[0];
            } else {
                str = strArr[0];
            }
            lottieAnimationView.setAnimation(str);
            LottieAnimationView lottieAnimationView2 = this.mRefreshProgressView2;
            String[] strArr2 = this.mRefreshAnimation;
            if (strArr2 == null) {
                str2 = this.mDefaultRefreshAnimation[1];
            } else {
                str2 = strArr2[1];
            }
            lottieAnimationView2.setAnimation(str2);
            LottieAnimationView lottieAnimationView3 = this.mRefreshProgressView3;
            String[] strArr3 = this.mRefreshAnimation;
            if (strArr3 == null) {
                str3 = this.mDefaultRefreshAnimation[2];
            } else {
                str3 = strArr3[2];
            }
            lottieAnimationView3.setAnimation(str3);
        }
    }
}
