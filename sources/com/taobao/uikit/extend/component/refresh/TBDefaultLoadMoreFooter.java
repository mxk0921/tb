package com.taobao.uikit.extend.component.refresh;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.taobao.uikit.feature.features.internal.pullrefresh.CustomProgressBar;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBDefaultLoadMoreFooter extends TBLoadMoreFooter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String[] mDefaultLoadMoreTips;
    private String[] mLoadMoreTips;
    private TextView mLoadMoreView;
    private CustomProgressBar mProgressbar;
    private TBLoadMoreFooter.LoadMoreState mState;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.uikit.extend.component.refresh.TBDefaultLoadMoreFooter$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$refresh$TBLoadMoreFooter$LoadMoreState;

        static {
            int[] iArr = new int[TBLoadMoreFooter.LoadMoreState.values().length];
            $SwitchMap$com$taobao$uikit$extend$component$refresh$TBLoadMoreFooter$LoadMoreState = iArr;
            try {
                iArr[TBLoadMoreFooter.LoadMoreState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBLoadMoreFooter$LoadMoreState[TBLoadMoreFooter.LoadMoreState.PUSH_TO_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBLoadMoreFooter$LoadMoreState[TBLoadMoreFooter.LoadMoreState.RELEASE_TO_LOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBLoadMoreFooter$LoadMoreState[TBLoadMoreFooter.LoadMoreState.LOADING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        t2o.a(932184108);
    }

    public TBDefaultLoadMoreFooter(Context context) {
        super(context);
        TBLoadMoreFooter.LoadMoreState loadMoreState = TBLoadMoreFooter.LoadMoreState.NONE;
        this.mState = loadMoreState;
        Context context2 = getContext();
        int i = R.string.uik_load_more;
        String string = context2.getString(i);
        Context context3 = getContext();
        int i2 = R.string.uik_release_to_load;
        String string2 = context3.getString(i2);
        Context context4 = getContext();
        int i3 = R.string.uik_loading;
        String string3 = context4.getString(i3);
        Context context5 = getContext();
        int i4 = R.string.uik_load_more_finished;
        this.mDefaultLoadMoreTips = new String[]{string, string2, string3, context5.getString(i4)};
        this.mLoadMoreTips = new String[]{getContext().getString(i), getContext().getString(i2), getContext().getString(i3), getContext().getString(i4)};
        float f = getResources().getDisplayMetrics().density;
        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        linearLayout.setGravity(1);
        int i5 = (int) (12.0f * f);
        linearLayout.setPadding(0, i5, 0, 0);
        addView(linearLayout, layoutParams);
        CustomProgressBar customProgressBar = new CustomProgressBar(context);
        this.mProgressbar = customProgressBar;
        customProgressBar.setId(R.id.uik_load_more_footer_progress);
        int i6 = (int) (f * 28.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i6, i6);
        layoutParams2.rightMargin = i5;
        this.mProgressbar.setVisibility(8);
        linearLayout.addView(this.mProgressbar, layoutParams2);
        TextView textView = new TextView(context);
        this.mLoadMoreView = textView;
        textView.setId(R.id.uik_load_more_footer_text);
        this.mLoadMoreView.setText(i);
        this.mLoadMoreView.setTextSize(1, 10.0f);
        this.mLoadMoreView.setGravity(16);
        this.mLoadMoreView.setTextColor(Color.parseColor("#444444"));
        linearLayout.addView(this.mLoadMoreView, new LinearLayout.LayoutParams(-2, i6));
        setBackgroundResource(R.color.uik_load_more_footer_bg);
        changeToState(loadMoreState);
    }

    public static /* synthetic */ Object ipc$super(TBDefaultLoadMoreFooter tBDefaultLoadMoreFooter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/refresh/TBDefaultLoadMoreFooter");
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter
    public void changeToState(TBLoadMoreFooter.LoadMoreState loadMoreState) {
        TBLoadMoreFooter.LoadMoreState loadMoreState2;
        String str;
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3beb65cb", new Object[]{this, loadMoreState});
        } else if (this.mLoadMoreView != null && (loadMoreState2 = this.mState) != loadMoreState) {
            TBSwipeRefreshLayout.OnPushLoadMoreListener onPushLoadMoreListener = this.mPushLoadMoreListener;
            if (onPushLoadMoreListener != null) {
                onPushLoadMoreListener.onLoadMoreStateChanged(loadMoreState2, loadMoreState);
            }
            this.mState = loadMoreState;
            int i = AnonymousClass1.$SwitchMap$com$taobao$uikit$extend$component$refresh$TBLoadMoreFooter$LoadMoreState[loadMoreState.ordinal()];
            if (i == 1) {
                this.mProgressbar.stopLoadingAnimation();
                this.mProgressbar.setVisibility(8);
                TextView textView = this.mLoadMoreView;
                String[] strArr = this.mLoadMoreTips;
                if (strArr == null) {
                    str = this.mDefaultLoadMoreTips[3];
                } else {
                    str = strArr[3];
                }
                textView.setText(str);
            } else if (i == 2) {
                this.mProgressbar.stopLoadingAnimation();
                this.mProgressbar.setVisibility(8);
                TextView textView2 = this.mLoadMoreView;
                String[] strArr2 = this.mLoadMoreTips;
                if (strArr2 == null) {
                    str2 = this.mDefaultLoadMoreTips[0];
                } else {
                    str2 = strArr2[0];
                }
                textView2.setText(str2);
                setVisibility(0);
            } else if (i == 3) {
                this.mProgressbar.stopLoadingAnimation();
                this.mProgressbar.setVisibility(8);
                TextView textView3 = this.mLoadMoreView;
                String[] strArr3 = this.mLoadMoreTips;
                if (strArr3 == null) {
                    str3 = this.mDefaultLoadMoreTips[1];
                } else {
                    str3 = strArr3[1];
                }
                textView3.setText(str3);
                setVisibility(0);
            } else if (i == 4) {
                this.mProgressbar.setVisibility(0);
                this.mProgressbar.startLoadingAnimaton();
                TextView textView4 = this.mLoadMoreView;
                String[] strArr4 = this.mLoadMoreTips;
                if (strArr4 == null) {
                    str4 = this.mDefaultLoadMoreTips[2];
                } else {
                    str4 = strArr4[2];
                }
                textView4.setText(str4);
                setVisibility(0);
            }
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter
    public TBLoadMoreFooter.LoadMoreState getCurrentState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLoadMoreFooter.LoadMoreState) ipChange.ipc$dispatch("f9bc975f", new Object[]{this});
        }
        return this.mState;
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter
    public TextView getLoadMoreTipView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("a0e7614a", new Object[]{this});
        }
        return this.mLoadMoreView;
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter
    public void setLoadMoreTipColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d34ebbf7", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mLoadMoreView;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter
    public void setLoadMoreTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4990e3", new Object[]{this, strArr});
            return;
        }
        if (strArr == null || strArr.length != 4) {
            this.mLoadMoreTips = null;
        }
        this.mLoadMoreTips = strArr;
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter
    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
        }
    }
}
