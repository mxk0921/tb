package com.taobao.android.live.plugin.atype.flexalocal.profile;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarInfoCardResponseData;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import tb.d9m;
import tb.giv;
import tb.gwg;
import tb.hw0;
import tb.ikr;
import tb.ml6;
import tb.nh4;
import tb.o3s;
import tb.p3u;
import tb.pb6;
import tb.sjr;
import tb.t2o;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.vc;
import tb.yqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveAvatarNewView extends BasePopupView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int LIVE_AVATAR_CONTAINER_MAX_HEIGHT = 430;
    public static final String MIDDLE_AVATAR_CONTAINER_DX_TEMPLATE_NAME = "taolive_anchor_card_content";
    public static final String MIDDLE_AVATAR_CONTAINER_DX_TEMPLATE_NAME2 = "taolive_anchor_card_content2";
    public static final int SPAN_COUNT = 3;
    public static final String TAG = "LiveAvatarNewView";
    public static final String TOP_AVATAR_CONTAINER_DX_TEMPLATE_NAME = "taolive_anchor_card_header";
    public static final String VIDEO_ITEM_AVATAR_CONTAINER_DX_TEMPLATE_NAME = "taolive_anchor_card_video";
    public static final String VIDEO_ITEM_AVATAR_CONTAINER_DX_TEMPLATE_NAME2 = "taolive_anchor_card_video2";
    private boolean installedWidget;
    private AppBarLayout mAppBarLayout;
    private float mAvatarBigInitY;
    private float mAvatarBigSize;
    private FrameLayout mAvatarMiddleContainer;
    private FrameLayout mAvatarRightContainer;
    private float mAvatarSmallInitY;
    private float mAvatarSmallSize;
    private TUrlImageView mAvatarViewBig;
    private TUrlImageView mAvatarViewBigBorder;
    private View mAvatarViewBigLayout;
    private View mAvatarViewSmall;
    private View mCardRootView;
    private CollapsingToolbarLayout mCollapsingToolbar;
    private View mCover;
    private LiveAvatarInfoCardResponseData mData;
    private View mEmptyView;
    private final ux9 mFrameContext;
    private boolean mIsHaveFooter;
    private final boolean mIsLandscape;
    private LiveAvatarAdapter mLiveAvatarAdapter;
    private TBLiveDataModel mLiveDataModel;
    private NestedScrollView mNestedScrollView;
    private long mOpenPageTime;
    private RecyclerView mRecyclerView;
    private FrameLayout mShortAvatarMiddleContainer;
    private View mSmallAvatarContainer;
    private String mSourceType;
    private TextView mTvUserNameSmall;
    private final ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener = new a();
    private final AppBarLayout.d mOffsetChangedListener = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            LiveAvatarNewView.access$000(LiveAvatarNewView.this);
            LiveAvatarNewView.access$100(LiveAvatarNewView.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements AppBarLayout.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1579d24", new Object[]{this, appBarLayout, new Integer(i)});
                return;
            }
            int measuredHeight = LiveAvatarNewView.access$200(LiveAvatarNewView.this).getMeasuredHeight() - ViewCompat.getMinimumHeight(LiveAvatarNewView.access$200(LiveAvatarNewView.this));
            float abs = measuredHeight > 0 ? Math.abs(i) / measuredHeight : 0.0f;
            o3s.a(LiveAvatarNewView.TAG, "onOffsetChanged: verticalOffset = " + i + ", range = " + measuredHeight + ", expandRatio = " + abs);
            if (abs > 0.0f) {
                LiveAvatarNewView.access$300(LiveAvatarNewView.this).setVisibility(0);
            }
            LiveAvatarNewView.access$400(LiveAvatarNewView.this, abs);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                LiveAvatarNewView.this.hide();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (LiveAvatarNewView.this.mContentView.getMeasuredHeight() > hw0.b(LiveAvatarNewView.this.mContext, 430.0f)) {
                ViewGroup.LayoutParams layoutParams = LiveAvatarNewView.this.mContentView.getLayoutParams();
                layoutParams.height = hw0.b(LiveAvatarNewView.this.mContext, 430.0f);
                LiveAvatarNewView.this.mContentView.setLayoutParams(layoutParams);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LiveAvatarInfoCardResponseData f8642a;

        public e(LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData) {
            this.f8642a = liveAvatarInfoCardResponseData;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f8642a.videos.size() <= 3) {
                int measuredHeight = LiveAvatarNewView.access$700(LiveAvatarNewView.this).getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = LiveAvatarNewView.access$700(LiveAvatarNewView.this).getLayoutParams();
                layoutParams.height = measuredHeight + hw0.a(144.0f);
                LiveAvatarNewView.access$700(LiveAvatarNewView.this).setLayoutParams(layoutParams);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int measuredHeight = LiveAvatarNewView.access$800(LiveAvatarNewView.this).getMeasuredHeight();
            if (measuredHeight < hw0.b(LiveAvatarNewView.this.mContext, 120.0f) && (LiveAvatarNewView.access$800(LiveAvatarNewView.this).getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) LiveAvatarNewView.access$800(LiveAvatarNewView.this).getLayoutParams();
                layoutParams.bottomMargin = hw0.b(LiveAvatarNewView.this.mContext, 120.0f) - measuredHeight;
                LiveAvatarNewView.access$800(LiveAvatarNewView.this).setLayoutParams(layoutParams);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRootView f8644a;

        public g(DXRootView dXRootView) {
            this.f8644a = dXRootView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ViewGroup.LayoutParams layoutParams = LiveAvatarNewView.this.mContentView.getLayoutParams();
            int i = this.f8644a.getLayoutParams().width;
            if (i > layoutParams.width) {
                layoutParams.width = i;
                LiveAvatarNewView.this.mContentView.setLayoutParams(layoutParams);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LiveAvatarInfoCardResponseData f8645a;

        public h(LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData) {
            this.f8645a = liveAvatarInfoCardResponseData;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (!TextUtils.isEmpty(this.f8645a.headJumpUrl)) {
                v2s.o().v().b(LiveAvatarNewView.this.mContext, this.f8645a.headJumpUrl, null);
                LiveAvatarNewView.this.hide();
                gwg.b(LiveAvatarNewView.access$900(LiveAvatarNewView.this), LiveAvatarNewView.access$1000(LiveAvatarNewView.this));
            }
        }
    }

    static {
        t2o.a(295699584);
    }

    public LiveAvatarNewView(ux9 ux9Var, boolean z, Context context, ViewGroup viewGroup, TBLiveDataModel tBLiveDataModel, View view) {
        super(context, viewGroup);
        this.mFrameContext = ux9Var;
        this.mLiveDataModel = tBLiveDataModel;
        this.mIsLandscape = z;
        init(view);
    }

    public static /* synthetic */ void access$000(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a056f0dc", new Object[]{liveAvatarNewView});
        } else {
            liveAvatarNewView.initAvatarPosition();
        }
    }

    public static /* synthetic */ TUrlImageView access$100(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("33d8521", new Object[]{liveAvatarNewView});
        }
        return liveAvatarNewView.mAvatarViewBig;
    }

    public static /* synthetic */ String access$1000(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("632cbff3", new Object[]{liveAvatarNewView});
        }
        return liveAvatarNewView.mSourceType;
    }

    public static /* synthetic */ CollapsingToolbarLayout access$200(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CollapsingToolbarLayout) ipChange.ipc$dispatch("4682818d", new Object[]{liveAvatarNewView});
        }
        return liveAvatarNewView.mCollapsingToolbar;
    }

    public static /* synthetic */ TextView access$300(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("e157fcad", new Object[]{liveAvatarNewView});
        }
        return liveAvatarNewView.mTvUserNameSmall;
    }

    public static /* synthetic */ void access$400(LiveAvatarNewView liveAvatarNewView, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876f968", new Object[]{liveAvatarNewView, new Float(f2)});
        } else {
            liveAvatarNewView.animAvatar(f2);
        }
    }

    public static /* synthetic */ boolean access$500(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89ce037b", new Object[]{liveAvatarNewView})).booleanValue();
        }
        return liveAvatarNewView.mIsHaveFooter;
    }

    public static /* synthetic */ LiveAvatarInfoCardResponseData access$600(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveAvatarInfoCardResponseData) ipChange.ipc$dispatch("e1e1bbaf", new Object[]{liveAvatarNewView});
        }
        return liveAvatarNewView.mData;
    }

    public static /* synthetic */ NestedScrollView access$700(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NestedScrollView) ipChange.ipc$dispatch("e36db6fc", new Object[]{liveAvatarNewView});
        }
        return liveAvatarNewView.mNestedScrollView;
    }

    public static /* synthetic */ FrameLayout access$800(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("184f4285", new Object[]{liveAvatarNewView});
        }
        return liveAvatarNewView.mShortAvatarMiddleContainer;
    }

    public static /* synthetic */ ux9 access$900(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("fb85b1eb", new Object[]{liveAvatarNewView});
        }
        return liveAvatarNewView.mFrameContext;
    }

    private void animAvatar(float f2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac13438f", new Object[]{this, new Float(f2)});
            return;
        }
        float f3 = this.mAvatarBigSize;
        float f4 = 0.0f;
        if (f3 <= 0.0f) {
            o3s.d(TAG, "animAvatar skipper");
            return;
        }
        float f5 = this.mAvatarSmallInitY;
        float f6 = this.mAvatarBigInitY;
        float b2 = ((((f3 - this.mAvatarSmallSize) - (f6 / 2.0f)) - hw0.b(this.mContext, 40.0f)) * f2) / 2.0f;
        o3s.d(TAG, "animAvatar pivotX：" + b2);
        this.mAvatarViewBigLayout.setPivotX(b2);
        this.mAvatarViewBigLayout.setPivotY(0.0f);
        this.mAvatarViewBigLayout.setTranslationY((f5 - (f6 / 2.0f)) * f2);
        float f7 = 1.0f - ((1.0f - (this.mAvatarSmallSize / this.mAvatarBigSize)) * f2);
        this.mAvatarViewBigLayout.setScaleX(f7);
        this.mAvatarViewBigLayout.setScaleY(f7);
        this.mTvUserNameSmall.setAlpha(f2);
        float f8 = 1.0f - f2;
        this.mAvatarRightContainer.setAlpha(f8);
        FrameLayout frameLayout = this.mAvatarRightContainer;
        if (f8 == 0.0f) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        float f9 = 1.0f - (f2 * 10.0f);
        if (f9 > 1.0f) {
            f4 = 1.0f;
        } else if (f9 >= 0.0f) {
            f4 = f9;
        }
        this.mAvatarViewBigBorder.setAlpha(f4 * 10.0f);
    }

    private void hideProfileTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("857d9a0b", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.mOpenPageTime;
        LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData = this.mData;
        if (liveAvatarInfoCardResponseData != null) {
            gwg.f(this.mFrameContext, liveAvatarInfoCardResponseData.follow, currentTimeMillis, this.mSourceType);
        } else {
            gwg.f(this.mFrameContext, false, currentTimeMillis, this.mSourceType);
        }
    }

    private void init(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce90a9db", new Object[]{this, view});
            return;
        }
        this.mCover = view;
        if (view != null) {
            ViewProxy.setOnClickListener(view, new c());
        }
        setVisibility(8);
        this.mAppBarLayout.addOnOffsetChangedListener(this.mOffsetChangedListener);
    }

    private void initAvatarPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7533659", new Object[]{this});
            return;
        }
        this.mAvatarBigInitY = this.mAvatarViewBigLayout.getY();
        this.mAvatarBigSize = this.mAvatarViewBigLayout.getWidth();
        this.mAvatarSmallInitY = this.mAvatarViewSmall.getY() + this.mSmallAvatarContainer.getTop();
        this.mAvatarSmallSize = this.mAvatarViewSmall.getWidth();
        StringBuilder sb = new StringBuilder("initAvatarPosition: big = [");
        sb.append(this.mSmallAvatarContainer.getPaddingLeft());
        sb.append(",");
        sb.append(this.mAvatarBigInitY);
        sb.append(",");
        sb.append(this.mAvatarBigSize);
        sb.append("], small = [");
        sb.append(this.mSmallAvatarContainer.getPaddingLeft());
        sb.append(",");
        sb.append(this.mAvatarSmallInitY);
        sb.append(",");
        sb.append(this.mAvatarSmallSize);
        sb.append("], this = ");
        sb.append(this);
        o3s.d(TAG, sb.toString());
    }

    public static /* synthetic */ Object ipc$super(LiveAvatarNewView liveAvatarNewView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1775111991) {
            super.hide();
            return null;
        } else if (hashCode == -340027132) {
            super.show();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/profile/LiveAvatarNewView");
        }
    }

    private void refreshBottomUi(LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3eced0", new Object[]{this, liveAvatarInfoCardResponseData});
            return;
        }
        List<LiveAvatarInfoCardResponseData.SimpleContent> list = liveAvatarInfoCardResponseData.videos;
        if (list == null || list.isEmpty()) {
            this.mRecyclerView.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = this.mContentView.getLayoutParams();
            layoutParams.height = -2;
            this.mContentView.setLayoutParams(layoutParams);
            this.mAppBarLayout.setExpanded(false);
            this.mAppBarLayout.setVisibility(8);
            setEmptyViewLayoutParams(40);
            return;
        }
        setEmptyViewLayoutParams(12);
        this.mAppBarLayout.setVisibility(0);
        this.mAppBarLayout.setExpanded(true);
        ViewGroup.LayoutParams layoutParams2 = this.mContentView.getLayoutParams();
        layoutParams2.height = hw0.b(this.mContext, 430.0f);
        if (this.mIsLandscape) {
            layoutParams2.height = hw0.h() - hw0.b(this.mContext, 80.0f);
        }
        this.mContentView.setLayoutParams(layoutParams2);
        this.mRecyclerView.setVisibility(0);
        if (liveAvatarInfoCardResponseData.videos.size() >= 12) {
            this.mLiveAvatarAdapter.Q();
            this.mIsHaveFooter = true;
        } else {
            this.mLiveAvatarAdapter.T();
            this.mIsHaveFooter = false;
            this.mNestedScrollView.post(new e(liveAvatarInfoCardResponseData));
        }
        this.mLiveAvatarAdapter.S(liveAvatarInfoCardResponseData.videos, this.mSourceType);
        this.mLiveAvatarAdapter.U(liveAvatarInfoCardResponseData.headJumpUrl);
    }

    private String replaceQueryParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b74ef8c", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        for (String str3 : parse.getQueryParameterNames()) {
            if (!str3.equals(str2)) {
                buildUpon.appendQueryParameter(str3, parse.getQueryParameter(str3));
            }
        }
        return buildUpon.build().toString();
    }

    private void setEmptyViewLayoutParams(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4f4a9c", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mEmptyView.getLayoutParams();
        layoutParams.height = hw0.b(this.mContext, i);
        this.mEmptyView.setLayoutParams(layoutParams);
    }

    private void setupRecyclerView() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a36f5ea8", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = (RecyclerView) this.mContentView.findViewById(R.id.live_avatar_card_recyclerView_container);
        this.mRecyclerView = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        this.mNestedScrollView = (NestedScrollView) this.mContentView.findViewById(R.id.live_avatar_card_nst);
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(this.mContext, 3);
        this.mLiveAvatarAdapter = new LiveAvatarAdapter(this.mFrameContext, this.mContext);
        this.mRecyclerView.setLayoutManager(gridLayoutManager);
        this.mRecyclerView.setAdapter(this.mLiveAvatarAdapter);
        this.mRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r3, String str, Object... objArr) {
                if (str.hashCode() == -2066002230) {
                    super.getItemOffsets((Rect) objArr[0], (View) objArr[1], (RecyclerView) objArr[2], (RecyclerView.State) objArr[3]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/profile/LiveAvatarNewView$4");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView2, RecyclerView.State state) {
                int i3;
                int i4;
                int size;
                int size2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView2, state});
                    return;
                }
                super.getItemOffsets(rect, view, recyclerView2, state);
                if (!vc.a() || !vc.h(LiveAvatarNewView.this.mContext)) {
                    i3 = hw0.a(8.0f);
                } else {
                    i3 = pb6.d(ikr.f().e(), LiveAvatarNewView.this.mContext, 8.0f);
                }
                rect.bottom = i3;
                int measuredWidth = (recyclerView2.getMeasuredWidth() - recyclerView2.getPaddingStart()) - recyclerView2.getPaddingEnd();
                if (!vc.a() || !vc.h(LiveAvatarNewView.this.mContext)) {
                    i4 = hw0.a(117.0f);
                } else {
                    i4 = pb6.d(ikr.f().e(), LiveAvatarNewView.this.mContext, 117.0f);
                }
                int spanIndex = gridLayoutManager.getSpanSizeLookup().getSpanIndex(recyclerView2.getChildAdapterPosition(view), 3);
                rect.left = ((i4 + ((measuredWidth - (i4 * 3)) / 2)) * spanIndex) - ((measuredWidth / 3) * spanIndex);
                int indexOfChild = recyclerView2.indexOfChild(view);
                if (!LiveAvatarNewView.access$500(LiveAvatarNewView.this) && LiveAvatarNewView.access$600(LiveAvatarNewView.this) != null && LiveAvatarNewView.access$600(LiveAvatarNewView.this).videos != null && (size2 = (size = LiveAvatarNewView.access$600(LiveAvatarNewView.this).videos.size()) - indexOfChild) < 4) {
                    int i5 = size % 3;
                    if (i5 == 0) {
                        rect.bottom = hw0.a(18.0f);
                    } else if (i5 == 1) {
                        if (size2 < 2) {
                            rect.bottom = hw0.a(18.0f);
                        }
                    } else if (i5 == 2 && size2 < 3) {
                        rect.bottom = hw0.a(18.0f);
                    }
                }
                if (LiveAvatarNewView.access$500(LiveAvatarNewView.this) && LiveAvatarNewView.access$600(LiveAvatarNewView.this) != null && LiveAvatarNewView.access$600(LiveAvatarNewView.this).videos != null && indexOfChild == LiveAvatarNewView.access$600(LiveAvatarNewView.this).videos.size()) {
                    rect.left = 0;
                    rect.bottom = 0;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mRecyclerView.getLayoutParams();
        if (!vc.a() || !vc.h(this.mContext)) {
            i = hw0.a(8.0f);
        } else {
            i = pb6.d(ikr.f().e(), this.mContext, 8.0f);
        }
        layoutParams.leftMargin = i;
        if (!vc.a() || !vc.h(this.mContext)) {
            i2 = hw0.a(8.0f);
        } else {
            i2 = pb6.d(ikr.f().e(), this.mContext, 8.0f);
        }
        layoutParams.rightMargin = i2;
        this.mRecyclerView.setLayoutParams(layoutParams);
    }

    private void setupTopView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7013d264", new Object[]{this});
            return;
        }
        this.mAppBarLayout = (AppBarLayout) this.mContentView.findViewById(R.id.live_avatar_mini_app_bar);
        this.mCollapsingToolbar = (CollapsingToolbarLayout) this.mContentView.findViewById(R.id.live_avatar_mini_collapsing_tool_bar);
        this.mAvatarViewBig = (TUrlImageView) this.mContentView.findViewById(R.id.live_avatar_mini_avatar_big_new);
        this.mAvatarViewBigBorder = (TUrlImageView) this.mContentView.findViewById(R.id.live_avatar_mini_avatar_big_new_border);
        this.mAvatarViewBigLayout = this.mContentView.findViewById(R.id.live_avatar_mini_avatar_big_layout_new);
        this.mContentView.findViewById(R.id.live_avatar_mini_avatar_big_common_border);
        this.mEmptyView = this.mContentView.findViewById(R.id.live_avatar_card_empty_view);
        this.mSmallAvatarContainer = this.mContentView.findViewById(R.id.live_mini_avatar_small_container);
        this.mAvatarViewSmall = this.mContentView.findViewById(R.id.personal_mini_avatar_small);
        this.mTvUserNameSmall = (TextView) this.mContentView.findViewById(R.id.personal_mini_tv_user_name_small);
        this.mAvatarRightContainer = (FrameLayout) this.mContentView.findViewById(R.id.live_avatar_card_first_container);
        this.mAvatarMiddleContainer = (FrameLayout) this.mContentView.findViewById(R.id.live_avatar_card_second_container);
        this.mShortAvatarMiddleContainer = (FrameLayout) this.mContentView.findViewById(R.id.live_avatar_card_second_short_container);
    }

    private void update(LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d890ff", new Object[]{this, liveAvatarInfoCardResponseData});
        } else if (liveAvatarInfoCardResponseData != null) {
            this.mData = liveAvatarInfoCardResponseData;
            liveAvatarInfoCardResponseData.sourceType = this.mSourceType;
            this.mCover.setVisibility(0);
            this.mContentView.setVisibility(0);
            this.mCardRootView.setVisibility(0);
            refreshBottomUi(liveAvatarInfoCardResponseData);
            refreshTopUi(liveAvatarInfoCardResponseData, true);
            refreshMiddleUi(liveAvatarInfoCardResponseData);
            this.mContentView.post(new d());
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        AppBarLayout appBarLayout = this.mAppBarLayout;
        if (appBarLayout != null) {
            appBarLayout.removeOnOffsetChangedListener(this.mOffsetChangedListener);
        }
        TUrlImageView tUrlImageView = this.mAvatarViewBig;
        if (tUrlImageView != null) {
            tUrlImageView.getViewTreeObserver().removeOnGlobalLayoutListener(this.mGlobalLayoutListener);
        }
        if (nh4.h0()) {
            hide();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.profile.BasePopupView
    public void hide() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.hide();
        View view = this.mCover;
        if (view != null) {
            view.setVisibility(8);
        }
        sjr g2 = sjr.g();
        Boolean bool = Boolean.FALSE;
        ux9 ux9Var = this.mFrameContext;
        String str2 = null;
        if (ux9Var == null) {
            str = null;
        } else {
            str = ux9Var.C();
        }
        g2.c(uyg.EVENT_NEW_PROFILE__IS_SHOWING, bool, str);
        sjr g3 = sjr.g();
        ux9 ux9Var2 = this.mFrameContext;
        if (ux9Var2 != null) {
            str2 = ux9Var2.C();
        }
        g3.c("com.taobao.taolive.room.enable_updown_switch", "avatarCard", str2);
        hideProfileTrack();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.profile.BasePopupView
    public View onCreateContentView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a25b4d4b", new Object[]{this, viewGroup});
        }
        if (viewGroup == null) {
            return null;
        }
        this.mContentView = viewGroup;
        this.mCardRootView = LayoutInflater.from(getContext()).inflate(R.layout.taolive_avatar_card_layout2_new_flexalocal, this.mContentView, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        this.mContentView.addView(this.mCardRootView, layoutParams);
        this.mContentView.setVisibility(8);
        setupView();
        return this.mContentView;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.profile.BasePopupView
    public FrameLayout.LayoutParams onCreateLayoutParams(View view, DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("46bd761c", new Object[]{this, view, displayMetrics});
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        if (vc.a() && vc.h(this.mContext)) {
            layoutParams.width = vc.b(this.mContext);
            layoutParams.height = vc.c(this.mContext);
            layoutParams.gravity = 85;
        } else if (this.mbPopFromRight) {
            layoutParams.gravity = 85;
            layoutParams.width = hw0.h();
            if (giv.c().b()) {
                layoutParams.width = pb6.d(ikr.f().e(), this.mContext, 375.0f);
            }
            layoutParams.height = hw0.h() - hw0.b(this.mContext, 80.0f);
        } else {
            layoutParams.gravity = 83;
            layoutParams.width = hw0.h();
            layoutParams.height = hw0.b(this.mContext, 430.0f);
        }
        return layoutParams;
    }

    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
        } else {
            this.mLiveDataModel = tBLiveDataModel;
        }
    }

    public void refreshFollowStatus(boolean z) {
        LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfd586f", new Object[]{this, new Boolean(z)});
        } else if (isShowing() && (liveAvatarInfoCardResponseData = this.mData) != null) {
            liveAvatarInfoCardResponseData.follow = z;
            if (!z) {
                liveAvatarInfoCardResponseData.topFollow = false;
            }
            refreshTopUi(liveAvatarInfoCardResponseData, false);
        }
    }

    public void refreshLiveDataModel(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4936efb8", new Object[]{this, tBLiveDataModel});
            return;
        }
        this.mLiveDataModel = tBLiveDataModel;
        this.installedWidget = true;
    }

    public void refreshTopFollowStatus(boolean z) {
        LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d0a78b0", new Object[]{this, new Boolean(z)});
        } else if (isShowing() && (liveAvatarInfoCardResponseData = this.mData) != null) {
            liveAvatarInfoCardResponseData.topFollow = z;
            refreshTopUi(liveAvatarInfoCardResponseData, false);
        }
    }

    public void setupView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7423b649", new Object[]{this});
        } else if (this.mContentView != null) {
            setupTopView();
            setupRecyclerView();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.profile.BasePopupView
    public void show() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.A() == null)) {
            this.mFrameContext.A().accessListener(AccessListenerEnum.onFloatViewShow, new Object[0]);
        }
        this.mOpenPageTime = System.currentTimeMillis();
        ViewGroup viewGroup = this.mContentView;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        View view = this.mCover;
        if (view != null) {
            view.setVisibility(0);
        }
        sjr g2 = sjr.g();
        Boolean bool = Boolean.TRUE;
        ux9 ux9Var2 = this.mFrameContext;
        String str2 = null;
        if (ux9Var2 == null) {
            str = null;
        } else {
            str = ux9Var2.C();
        }
        g2.c(uyg.EVENT_NEW_PROFILE__IS_SHOWING, bool, str);
        sjr g3 = sjr.g();
        ux9 ux9Var3 = this.mFrameContext;
        if (ux9Var3 != null) {
            str2 = ux9Var3.C();
        }
        g3.c("com.taobao.taolive.room.disable_updown_switch", "avatarCard", str2);
    }

    public void updateData(LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ad1e61", new Object[]{this, liveAvatarInfoCardResponseData, str, new Boolean(z)});
            return;
        }
        this.installedWidget = z;
        this.mSourceType = str;
        TUrlImageView tUrlImageView = this.mAvatarViewBig;
        if (tUrlImageView != null) {
            tUrlImageView.getViewTreeObserver().addOnGlobalLayoutListener(this.mGlobalLayoutListener);
        }
        show();
        update(liveAvatarInfoCardResponseData);
    }

    private boolean enableProfileReplaceQueryParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2304eb7e", new Object[]{this})).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enableProfileReplaceQueryParam", "true"));
        }
        return false;
    }

    private void refreshMiddleUi(LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData) {
        LiveAvatarInfoCardResponseData.UtParams utParams;
        LiveAvatarInfoCardResponseData.GenerateParams generateParams;
        ux9 ux9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eece68ba", new Object[]{this, liveAvatarInfoCardResponseData});
            return;
        }
        FrameLayout frameLayout = this.mAvatarMiddleContainer;
        List<LiveAvatarInfoCardResponseData.SimpleContent> list = liveAvatarInfoCardResponseData.videos;
        if (list == null || list.isEmpty()) {
            frameLayout = this.mShortAvatarMiddleContainer;
            frameLayout.setVisibility(0);
            this.mShortAvatarMiddleContainer.post(new f());
        } else {
            this.mShortAvatarMiddleContainer.setVisibility(8);
        }
        DXRootView createDX = d9m.n().createDX(this.mContext, MIDDLE_AVATAR_CONTAINER_DX_TEMPLATE_NAME2);
        if (createDX != null) {
            frameLayout.removeAllViews();
            frameLayout.addView(createDX);
            if (enableProfileReplaceQueryParam() && (ux9Var = this.mFrameContext) != null && ux9Var.P != null && !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_StandardOpenWatch.name().equals(this.mFrameContext.P.bizCode)) {
                LiveAvatarInfoCardResponseData.ShopWindow shopWindow = liveAvatarInfoCardResponseData.shopWindow;
                if (shopWindow != null) {
                    LiveAvatarInfoCardResponseData.TitleSection titleSection = shopWindow.titleSection;
                    if (titleSection != null) {
                        titleSection.jumpUrl = replaceQueryParam(titleSection.jumpUrl, "livesource");
                    }
                    List<LiveAvatarInfoCardResponseData.ShopItem> list2 = liveAvatarInfoCardResponseData.shopWindow.itemList;
                    if (list2 != null && !list2.isEmpty()) {
                        for (LiveAvatarInfoCardResponseData.ShopItem shopItem : liveAvatarInfoCardResponseData.shopWindow.itemList) {
                            if (shopItem != null) {
                                shopItem.itemUrl = replaceQueryParam(shopItem.itemUrl, "livesource");
                            }
                        }
                    }
                }
                LiveAvatarInfoCardResponseData.PreLiveInfo preLiveInfo = liveAvatarInfoCardResponseData.preLiveInfo;
                if (preLiveInfo != null) {
                    preLiveInfo.jumpUrl = replaceQueryParam(preLiveInfo.jumpUrl, "livesource");
                }
                LiveAvatarInfoCardResponseData.AnchorSubscribeInfo anchorSubscribeInfo = liveAvatarInfoCardResponseData.anchorSubscribeInfo;
                if (anchorSubscribeInfo != null) {
                    anchorSubscribeInfo.jumpUrl = replaceQueryParam(anchorSubscribeInfo.jumpUrl, "livesource");
                }
                LiveAvatarInfoCardResponseData.SimpleReplayLive simpleReplayLive = liveAvatarInfoCardResponseData.playbackInfo;
                if (simpleReplayLive != null) {
                    simpleReplayLive.jumpUrl = replaceQueryParam(simpleReplayLive.jumpUrl, "livesource");
                }
            }
            d9m.n().renderDX(createDX, JSON.parseObject(JSON.toJSONString(liveAvatarInfoCardResponseData)), ml6.a(this.mContext));
            frameLayout.post(new g(createDX));
        }
        LiveAvatarInfoCardResponseData.ShopWindow shopWindow2 = liveAvatarInfoCardResponseData.shopWindow;
        if (!(shopWindow2 == null || (utParams = shopWindow2.utParams) == null || (generateParams = utParams.showParams) == null || TextUtils.isEmpty(generateParams.controlName))) {
            ux9 ux9Var2 = this.mFrameContext;
            boolean z = liveAvatarInfoCardResponseData.follow;
            String str = this.mSourceType;
            LiveAvatarInfoCardResponseData.GenerateParams generateParams2 = liveAvatarInfoCardResponseData.shopWindow.utParams.showParams;
            gwg.j(ux9Var2, z, str, generateParams2.params, generateParams2.controlName);
        }
        LiveAvatarInfoCardResponseData.PreLiveInfo preLiveInfo2 = liveAvatarInfoCardResponseData.preLiveInfo;
        if (preLiveInfo2 == null || TextUtils.isEmpty(preLiveInfo2.title)) {
            LiveAvatarInfoCardResponseData.SimpleReplayLive simpleReplayLive2 = liveAvatarInfoCardResponseData.playbackInfo;
            if (simpleReplayLive2 == null || TextUtils.isEmpty(simpleReplayLive2.content)) {
                LiveAvatarInfoCardResponseData.AnchorSubscribeInfo anchorSubscribeInfo2 = liveAvatarInfoCardResponseData.anchorSubscribeInfo;
                if (!(anchorSubscribeInfo2 == null || TextUtils.isEmpty(anchorSubscribeInfo2.title))) {
                    gwg.h(this.mFrameContext, this.mSourceType, "subscribe");
                    return;
                }
                return;
            }
            gwg.h(this.mFrameContext, this.mSourceType, "playback");
            return;
        }
        gwg.h(this.mFrameContext, this.mSourceType, "preview");
    }

    public void refreshTopUi(LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData, boolean z) {
        LiveAvatarInfoCardResponseData.ChatGroupInfo chatGroupInfo;
        VideoInfo videoInfo;
        AccountInfo accountInfo;
        AccountInfo.Atmosphere atmosphere;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63372ff0", new Object[]{this, liveAvatarInfoCardResponseData, new Boolean(z)});
            return;
        }
        this.mAvatarViewBig.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.mAvatarViewBig.asyncSetImageUrl(liveAvatarInfoCardResponseData.broadCasterPic);
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || (accountInfo = videoInfo.broadCaster) == null || (atmosphere = accountInfo.atmosphere) == null || TextUtils.isEmpty(atmosphere.headIcon)) {
            this.mAvatarViewBigBorder.setVisibility(8);
        } else {
            this.mAvatarViewBigBorder.setVisibility(0);
            this.mAvatarViewBigBorder.setImageUrl(this.mLiveDataModel.mVideoInfo.broadCaster.atmosphere.headIcon);
        }
        this.mTvUserNameSmall.setText(liveAvatarInfoCardResponseData.broadCasterName);
        ViewProxy.setOnClickListener(this.mAvatarViewBigLayout, new h(liveAvatarInfoCardResponseData));
        DXRootView createDX = d9m.n().createDX(this.mContext, TOP_AVATAR_CONTAINER_DX_TEMPLATE_NAME);
        if (createDX != null) {
            this.mAvatarRightContainer.removeAllViews();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(50, -2);
            layoutParams.gravity = 16;
            this.mAvatarRightContainer.addView(createDX, layoutParams);
            JSONObject parseObject = JSON.parseObject(JSON.toJSONString(liveAvatarInfoCardResponseData));
            if (nh4.R0() && p3u.f(this.mFrameContext, this.mLiveDataModel)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("installedWidget", (Object) Boolean.valueOf(this.installedWidget));
                jSONObject.put("isMyWidgetAnchor", (Object) Boolean.valueOf(this.mLiveDataModel.mVideoInfo.broadCaster.widgetTip.widgetAddition));
                jSONObject.put("widgetJumpUrl", (Object) this.mLiveDataModel.mVideoInfo.broadCaster.widgetTip.widgetJumpUrl);
                jSONObject.put("jumpType", (Object) this.mLiveDataModel.mVideoInfo.broadCaster.widgetTip.jumpType);
                jSONObject.put("componentData", (Object) this.mLiveDataModel.mVideoInfo.broadCaster.widgetTip.componentData);
                parseObject.put("widgetTip", (Object) jSONObject);
            }
            d9m.n().renderDX(createDX, parseObject, ml6.a(this.mContext));
        }
        if (!TextUtils.isEmpty(liveAvatarInfoCardResponseData.shopJumpUrl) && z) {
            gwg.i(this.mFrameContext, "shop", this.mSourceType, liveAvatarInfoCardResponseData.follow);
        }
        if (z && (chatGroupInfo = liveAvatarInfoCardResponseData.chatGroupInfo) != null) {
            if (TextUtils.equals(chatGroupInfo.canJoinChatGroup, "true") || TextUtils.equals(liveAvatarInfoCardResponseData.chatGroupInfo.isInChatGroup, "true")) {
                gwg.i(this.mFrameContext, "chatGroup", this.mSourceType, liveAvatarInfoCardResponseData.follow);
            }
        }
    }

    public LiveAvatarNewView(ux9 ux9Var, boolean z, Context context, ViewGroup viewGroup, TBLiveDataModel tBLiveDataModel, View view, boolean z2) {
        super(context, viewGroup, z2);
        this.mFrameContext = ux9Var;
        this.mLiveDataModel = tBLiveDataModel;
        this.mIsLandscape = z;
        init(view);
    }
}
