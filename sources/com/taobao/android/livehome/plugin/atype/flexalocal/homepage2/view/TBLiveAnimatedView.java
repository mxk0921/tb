package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.cy0;
import tb.fy0;
import tb.s8d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBLiveAnimatedView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int VIEW_ID = 10001;
    private int inAnimationDuration;
    private cy0 mAnimatedImageDrawable = null;
    private TUrlImageView mContentView;
    private String mGifUrl;
    private int mMaxLoopCount;
    private int outAnimationDuration;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable instanceof cy0) {
                TBLiveAnimatedView.access$002(TBLiveAnimatedView.this, (cy0) drawable);
                TBLiveAnimatedView.access$100(TBLiveAnimatedView.this);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements fy0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.fy0
        public boolean onLoopCompleted(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a7565d93", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (i == TBLiveAnimatedView.access$200(TBLiveAnimatedView.this)) {
                TBLiveAnimatedView.access$300(TBLiveAnimatedView.this).setVisibility(4);
            }
            return true;
        }
    }

    static {
        t2o.a(310378878);
    }

    public TBLiveAnimatedView(Context context) {
        super(context);
    }

    public static /* synthetic */ cy0 access$002(TBLiveAnimatedView tBLiveAnimatedView, cy0 cy0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cy0) ipChange.ipc$dispatch("233ddf66", new Object[]{tBLiveAnimatedView, cy0Var});
        }
        tBLiveAnimatedView.mAnimatedImageDrawable = cy0Var;
        return cy0Var;
    }

    public static /* synthetic */ void access$100(TBLiveAnimatedView tBLiveAnimatedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65c74e35", new Object[]{tBLiveAnimatedView});
        } else {
            tBLiveAnimatedView.setAnimatedLoopListener();
        }
    }

    public static /* synthetic */ int access$200(TBLiveAnimatedView tBLiveAnimatedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("358781c7", new Object[]{tBLiveAnimatedView})).intValue();
        }
        return tBLiveAnimatedView.mMaxLoopCount;
    }

    public static /* synthetic */ TUrlImageView access$300(TBLiveAnimatedView tBLiveAnimatedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("ae6c47a9", new Object[]{tBLiveAnimatedView});
        }
        return tBLiveAnimatedView.mContentView;
    }

    public static /* synthetic */ Object ipc$super(TBLiveAnimatedView tBLiveAnimatedView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/view/TBLiveAnimatedView");
    }

    private void setAnimatedLoopListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b31c3644", new Object[]{this});
            return;
        }
        cy0 cy0Var = this.mAnimatedImageDrawable;
        if (cy0Var != null) {
            cy0Var.C();
            this.mAnimatedImageDrawable.B(this.mMaxLoopCount);
            this.mAnimatedImageDrawable.A(new b());
        }
    }

    public void onInVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c04131f5", new Object[]{this});
            return;
        }
        this.mContentView = (TUrlImageView) findViewById(10001);
        cy0 cy0Var = this.mAnimatedImageDrawable;
        if (cy0Var != null) {
            cy0Var.A(null);
            this.mAnimatedImageDrawable.y();
            this.mAnimatedImageDrawable.D();
        }
        TUrlImageView tUrlImageView = this.mContentView;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(8);
        }
    }

    public void onRender(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61560fbd", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.mGifUrl = str;
        this.mMaxLoopCount = i;
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById(10001);
        this.mContentView = tUrlImageView;
        if (tUrlImageView == null) {
            TUrlImageView tUrlImageView2 = new TUrlImageView(getContext());
            this.mContentView = tUrlImageView2;
            tUrlImageView2.setId(10001);
            addView(this.mContentView, 0, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void onVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2444749a", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById(10001);
        this.mContentView = tUrlImageView;
        if (tUrlImageView != null) {
            if (!TextUtils.isEmpty(this.mGifUrl) && this.mMaxLoopCount > 0) {
                this.mContentView.succListener(new a());
            }
            setAnimatedLoopListener();
            this.mContentView.setVisibility(0);
            this.mContentView.setSkipAutoSize(true);
            this.mContentView.setFadeIn(true);
            this.mContentView.setImageUrl(this.mGifUrl);
        }
    }
}
