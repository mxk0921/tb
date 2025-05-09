package com.taobao.android.detail.ttdetail.skeleton.navbar;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorUtils;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.skeleton.navbar.NavBarHolderV3;
import com.taobao.android.detail.ttdetail.widget.desc.TIconFontTextView;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBActionView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.b8n;
import tb.bew;
import tb.ee7;
import tb.hi3;
import tb.jos;
import tb.jov;
import tb.mr7;
import tb.nj7;
import tb.nos;
import tb.owo;
import tb.pch;
import tb.q84;
import tb.rc7;
import tb.t2o;
import tb.tgh;
import tb.tq4;
import tb.wb4;
import tb.xka;
import tb.yns;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TaoDetailActionBarV3 extends LinearLayout implements ee7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float MAX_TRANSPARENCY = 1.0f;
    public static final String TAG = "TaoDetailActionBarV3";
    private boolean isFestivalAtmosphere;
    private String mActionBarTitle;
    private TextView mActionBarTitleView;
    private String mComponentId4Fatigue;
    private Context mContext;
    private int[] mDetailExtraTitleColorRGB;
    private LinearLayout mElevatorContainer;
    private int mElevatorContainerHeight;
    private boolean mHasCommitSearchExposure;
    private boolean mHasCommitShareImageExposure;
    private FrameLayout mMiniAppContainer;
    private LinearLayout mNavHeadBar;
    private int mNavHeadHeight;
    private int mNavItemWH;
    private int mNavStatusBarHeight;
    private FrameLayout mNavTabAndSearchContainer;
    private LinearLayout mNavTabsBar;
    private FrameLayout mRateViewContainer;
    private FrameLayout mSearchIconContainer;
    private JSONObject mSearchLabParams;
    private View mShopTabView;
    private Drawable mTopAtmosphereBackground;
    private float mTransparency;
    private float mTransparencyLR;
    private View vSearchView;
    private List<String> mAnchorPoints = new ArrayList();
    private List<View> vItemViews = new ArrayList();
    private Map<View, View> vNaviTabViews = new HashMap();
    private MiniAppEntranceView miniAppEntranceView = null;
    private int mTabSelColor = -1;
    private int mTabSelLocationColor = -1;
    private int mTabUnSelColor = -855638017;
    private int mTabBgColor = -1;
    private AtomicInteger lastClickIndex = new AtomicInteger(-1);
    private ArrayList<Pair<TextView, View>> clickableTabRefs = new ArrayList<>();
    private int mTabNum = 2;
    private int[] mMenuDefaultRGB = {255, 255, 255};
    private int[] mMenuDefault2RGBCollected = {255, 80, 0};
    private int[] mMenuDefault2RGB = {0, 0, 0};
    private int[] mMenuDefaultTaoMoment2RGB = {255, 80, 0};
    private int[] mTabTextDefaultRGB = {255, 255, 255};
    private int[] mTabTextRGB = {153, 153, 153};
    private int[] mTabHighlightTextRGB = {17, 17, 17};
    private int[] mTabHighlightLocationRGB = {255, 95, 0};
    private boolean mFullTransparentMode = false;
    private float orangeAlpha = 0.0f;
    private List<View> mItemTabContainers = new ArrayList();
    private String lastHighlightElevatorLocatorId = null;
    private final Map<String, View> mElevatorItems = new HashMap();
    private boolean isNewNav = false;
    private boolean isRateFragmentShown = false;
    private b8n mInsideQuery = new b8n();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6933a;

        public a(String str) {
            this.f6933a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            new JSONObject().put(xka.KEY_LOCATOR_ID, (Object) this.f6933a);
            TaoDetailActionBarV3.this.highlightTab(this.f6933a);
            q84.f(TaoDetailActionBarV3.access$000(TaoDetailActionBarV3.this), new pch(this.f6933a));
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                if ("header".equals(this.f6933a)) {
                    jSONObject2.put("arg1", (Object) "GotoDetailHome");
                } else if ("divisionDescRecmd".equals(this.f6933a)) {
                    jSONObject2.put("arg1", (Object) "GotoShopRecommend");
                } else if ("divisionRate".equals(this.f6933a)) {
                    jSONObject2.put("arg1", (Object) "GotoDetailRate");
                } else if (yns.KEY_DIVISION_DESC.equals(this.f6933a)) {
                    jSONObject2.put("arg1", (Object) "GotoDetailDesc");
                }
                jSONObject2.put("args", (Object) jSONObject);
                q84.f(TaoDetailActionBarV3.access$000(TaoDetailActionBarV3.this), new rc7("user_track", jSONObject2, new RuntimeAbilityParam[0]));
            } catch (Exception e) {
                tgh.c(TaoDetailActionBarV3.TAG, "ctrlClicked mergeExposure", e);
            }
            if ("header".equals(this.f6933a)) {
                str = "Page_Detail_Button-GotoDetailHome";
            } else if ("looked".equals(this.f6933a)) {
                str = "Page_Detail_Button-GotoShopRecommend";
            } else if ("rate".equals(this.f6933a)) {
                str = "Page_Detail_Button-GotoDetailRate";
            } else if ("desc".equals(this.f6933a)) {
                str = "Page_Detail_Button-GotoDetailDesc";
            } else {
                str = "Page_Detail_Button-GotoTab";
            }
            UserBehaviorTracker.l(TaoDetailActionBarV3.access$000(TaoDetailActionBarV3.this), UserBehaviorUtils.COMPONENT_NAME_NAVI_TAB, str, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6935a;

        public c(String str) {
            this.f6935a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            jov.k(TaoDetailActionBarV3.access$000(TaoDetailActionBarV3.this), this.f6935a);
            tgh.b(TaoDetailActionBarV3.TAG, "tabTitle onclick");
        }
    }

    static {
        t2o.a(912262611);
        t2o.a(912262585);
    }

    public TaoDetailActionBarV3(Context context) {
        super(context);
    }

    public static /* synthetic */ Context access$000(TaoDetailActionBarV3 taoDetailActionBarV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("31ffd26b", new Object[]{taoDetailActionBarV3});
        }
        return taoDetailActionBarV3.mContext;
    }

    public static /* synthetic */ AtomicInteger access$100(TaoDetailActionBarV3 taoDetailActionBarV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("c42b3ebc", new Object[]{taoDetailActionBarV3});
        }
        return taoDetailActionBarV3.lastClickIndex;
    }

    public static /* synthetic */ AtomicInteger access$102(TaoDetailActionBarV3 taoDetailActionBarV3, AtomicInteger atomicInteger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("aaa43f54", new Object[]{taoDetailActionBarV3, atomicInteger});
        }
        taoDetailActionBarV3.lastClickIndex = atomicInteger;
        return atomicInteger;
    }

    public static /* synthetic */ ArrayList access$200(TaoDetailActionBarV3 taoDetailActionBarV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("12c9898b", new Object[]{taoDetailActionBarV3});
        }
        return taoDetailActionBarV3.clickableTabRefs;
    }

    public static /* synthetic */ void access$300(TaoDetailActionBarV3 taoDetailActionBarV3, boolean z, TextView textView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63aed4d2", new Object[]{taoDetailActionBarV3, new Boolean(z), textView, view});
        } else {
            taoDetailActionBarV3.highlightTab(z, textView, view);
        }
    }

    private void addNaviItem(int i, int i2, View view, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1999c132", new Object[]{this, new Integer(i), new Integer(i2), view, new Integer(i3)});
            return;
        }
        int i4 = this.mNavItemWH;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, i4);
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i2;
        FrameLayout createNavBarIconFontLayout = createNavBarIconFontLayout(owo.b(this.mContext, 29.0f));
        createNavBarIconFontLayout.addView(view, new FrameLayout.LayoutParams(-1, -1, 17));
        createNavBarIconFontLayout.setTag(String.valueOf(i3));
        this.mNavHeadBar.addView(createNavBarIconFontLayout, layoutParams);
        if (4 == i3) {
            this.mSearchIconContainer = createNavBarIconFontLayout;
        }
        if (3 == i3) {
            this.vSearchView = view;
            changeSearch(0.0f);
        }
    }

    private void addSearchItem(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a6190f", new Object[]{this, view});
        } else if (view != null) {
            FrameLayout frameLayout = new FrameLayout(this.mContext);
            frameLayout.setBackgroundResource(R.drawable.tt_detail_action_bar_circular_bg_black_v3);
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.mNavItemWH);
            layoutParams.gravity = 16;
            layoutParams.leftMargin = mr7.a(12.0f);
            layoutParams.rightMargin = mr7.a(8.0f);
            this.mNavTabAndSearchContainer.addView(frameLayout, layoutParams);
            TextView textView = (TextView) view.findViewById(R.id.if_action_bar_search_icon);
            TextView textView2 = (TextView) view.findViewById(R.id.if_action_bar_search_text);
            if (!(textView == null || textView2 == null)) {
                if (this.isFestivalAtmosphere) {
                    textView.setTextColor(getRGBColor(255, this.mMenuDefaultRGB));
                    textView2.setTextColor(getRGBColor(255, this.mMenuDefaultRGB));
                } else {
                    textView.setTextColor(-6710887);
                    textView2.setTextColor(-6710887);
                }
            }
            this.vSearchView = view;
            changeSearch(0.0f);
        }
    }

    private int alphaTran(int i, float f) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d080eac0", new Object[]{this, new Integer(i), new Float(f)})).intValue();
        }
        int i3 = (int) (f * i);
        if (i3 >= 0) {
            i2 = i3;
        }
        if (i2 > i) {
            return i;
        }
        return i2;
    }

    private boolean canImmersiveStatusBar(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24663aaf", new Object[]{this, context})).booleanValue();
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        return nos.a(activity, activity.getWindow());
    }

    private void changeActionBarTransparency(float f) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efdf7b14", new Object[]{this, new Float(f)});
        } else if (this.mFullTransparentMode) {
            changeAppearDrawableAlpha(f, this);
            changeMiniAppContainerDrawableAlpha(f, this.mMiniAppContainer);
            changeItemChildrenDrawableAlpha(f);
            changeItemChildrenTran(f);
            changeItemChildrenParentTran(f);
            if (this.lastClickIndex.get() != 0) {
                z = false;
            }
            changeTabColor(f, z);
            changeSearch(f);
            changeElevatorViewTransparency(f);
            changeNavTabsBarTransparency(f);
            changeShareView(f);
        }
    }

    private void changeAppearDrawableAlpha(float f, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f83914", new Object[]{this, new Float(f), view});
        } else if (checkAppear(f)) {
            changeDrawableAlpha(getAppearAlpha(f), view);
        } else {
            changeDrawableAlpha(0.0f, view);
        }
    }

    private void changeDrawableAlpha(float f, View view) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52da91a9", new Object[]{this, new Float(f), view});
        } else if (view != null) {
            int i2 = (int) (f * 255.0f);
            if (i2 >= 0) {
                i = i2;
            }
            if (i > 255) {
                i = 255;
            }
            Drawable background = view.getBackground();
            if (background != null) {
                background.setAlpha(i);
            }
        }
    }

    private void changeItemChildTabColor(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c56c6", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        Iterator<View> it = this.vNaviTabViews.keySet().iterator();
        while (it.hasNext()) {
            changeTabTextColor((TextView) it.next(), i, z);
        }
        View view = this.mShopTabView;
        if (view != null) {
            changeTabTextColor((TextView) view, i, z);
        }
        if (this.clickableTabRefs.size() > 0) {
            ((TextView) this.clickableTabRefs.get(this.lastClickIndex.get()).first).setTextColor(i2);
        }
    }

    private void changeItemChildTabLocateColor(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97df53ed", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        for (View view : this.vNaviTabViews.keySet()) {
            View view2 = this.vNaviTabViews.get(view);
            GradientDrawable gradientDrawable = (GradientDrawable) getResources().getDrawable(R.drawable.tt_detail_tab_bar_circular_bg);
            gradientDrawable.setColor(i);
            view2.setBackgroundDrawable(gradientDrawable);
            if (z) {
                if (Build.VERSION.SDK_INT >= 28) {
                    view2.setOutlineSpotShadowColor(Color.parseColor("#000000"));
                    view2.setOutlineProvider(ViewOutlineProvider.PADDED_BOUNDS);
                    view2.setElevation(4.0f);
                    view2.setTranslationX(2.0f);
                }
            } else if (Build.VERSION.SDK_INT >= 28) {
                view2.setOutlineSpotShadowColor(0);
                view2.setOutlineProvider(null);
                view2.setElevation(0.0f);
            }
        }
    }

    private void changeItemChildrenColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ae117b", new Object[]{this, new Integer(i)});
            return;
        }
        for (View view : this.vItemViews) {
            if (view instanceof TIconFontTextView) {
                TIconFontTextView tIconFontTextView = (TIconFontTextView) view;
                if (CollectBarViewHolder.COLLECTED_ICON_TEXT.contentEquals(tIconFontTextView.getText())) {
                    tIconFontTextView.setTextColor(getCollectedIconColor());
                } else {
                    tIconFontTextView.setTextColor(i);
                }
            } else if (view instanceof TBActionView) {
                ((TBActionView) view).setIconColor(i);
            }
        }
    }

    private void changeItemChildrenDrawableAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861c765b", new Object[]{this, new Float(f)});
            return;
        }
        if (checkFix(f) || this.isFestivalAtmosphere) {
            f = 1.0f;
        } else if (checkDisappear(f)) {
            f = getDisappearAlpha(f);
        } else if (checkAppear(f)) {
            f = getAppearAlpha(f);
        }
        for (View view : this.vItemViews) {
            changeDrawableAlpha(f, view);
        }
    }

    private void changeItemChildrenParentColor(boolean z, float f, boolean z2) {
        View next;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d4bdaa", new Object[]{this, new Boolean(z), new Float(f), new Boolean(z2)});
            return;
        }
        Iterator<View> it = this.vItemViews.iterator();
        while (it.hasNext() && (next = it.next()) != null && next.getParent() != null) {
            boolean equals = String.valueOf(3).equals((String) next.getTag());
            FrameLayout frameLayout = (FrameLayout) next.getParent();
            if (z2) {
                if (z) {
                    i = R.drawable.tt_detail_action_bar_circular_bg_black_v3;
                } else {
                    i = R.drawable.tt_detail_action_bar_circular_bg_black_atmosphere_v3;
                }
            } else if (z) {
                i = R.drawable.tt_detail_action_bar_circular_bg_black_v3;
            } else if (equals) {
                i = R.drawable.tt_detail_action_bar_circular_bg_white_v3;
            } else {
                i = R.drawable.tt_detail_action_bar_circular_bg_transparent_v3;
            }
            frameLayout.setBackgroundResource(i);
            frameLayout.setAlpha(f);
        }
    }

    private void changeItemChildrenParentTran(float f) {
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52bfd3e2", new Object[]{this, new Float(f)});
            return;
        }
        if (!checkDisappear(f) && checkAppear(f)) {
            z = false;
        }
        float f2 = 1.0f;
        if (checkFix(f) || this.isFestivalAtmosphere) {
            z2 = this.isFestivalAtmosphere;
        } else if (checkDisappear(f)) {
            f2 = getDisappearAlpha(f);
        } else if (checkAppear(f)) {
            f2 = getAppearAlpha(f);
        }
        changeItemChildrenParentColor(z, f2, z2);
    }

    private void changeMiniAppContainerDrawableAlpha(float f, View view) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7eba692", new Object[]{this, new Float(f), view});
            return;
        }
        if (!this.mFullTransparentMode) {
            this.mMiniAppContainer.setBackgroundColor(this.mTabBgColor);
        } else if (checkAppear(f)) {
            if (!this.isFestivalAtmosphere && (drawable = this.mTopAtmosphereBackground) != null) {
                this.mMiniAppContainer.setBackgroundDrawable(drawable);
            }
            changeDrawableAlpha(getAppearAlpha(f), view);
            return;
        } else {
            this.mMiniAppContainer.setBackgroundColor(0);
        }
        changeDrawableAlpha(0.0f, view);
    }

    private void changeNavTabsBarTransparency(float f) {
        int i;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33bfa2ff", new Object[]{this, new Float(f)});
        } else if (this.isNewNav) {
            if (this.lastClickIndex.get() == 0) {
                LinearLayout linearLayout = this.mNavTabsBar;
                if (linearLayout != null) {
                    if (checkAppear(f)) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    linearLayout.setVisibility(i);
                }
            } else {
                this.mNavTabsBar.setVisibility(0);
            }
            if (checkAppear(f) && this.lastClickIndex.get() == 0) {
                z = false;
            }
            setTabScrollable(z);
        }
    }

    private void changeShareView(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a70ff45", new Object[]{this, new Float(f)});
        } else if (!TextUtils.isEmpty(this.mComponentId4Fatigue)) {
            if (f == 1.0f) {
                showShareItemView(true);
            } else if (this.mHasCommitShareImageExposure) {
                showShareItemView(false);
            }
        }
    }

    private void changeTabColor(float f, boolean z) {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434e0ff9", new Object[]{this, new Float(f), new Boolean(z)});
        } else if (checkFix(f) || this.isFestivalAtmosphere) {
            this.mTabSelColor = getRGBColor(255, this.mTabTextDefaultRGB);
            int rGBColor = getRGBColor(230, this.mTabTextDefaultRGB);
            this.mTabUnSelColor = rGBColor;
            changeItemChildTabColor(rGBColor, this.mTabSelColor, true);
            changeItemChildTabLocateColor(this.mTabSelColor, true);
        } else if (checkDisappear(f)) {
            float disappearAlpha = getDisappearAlpha(f);
            int alphaTran = alphaTran(255, disappearAlpha);
            int alphaTran2 = alphaTran(230, disappearAlpha);
            this.mTabSelColor = getRGBColor(Math.min(255, alphaTran), this.mTabTextDefaultRGB);
            int rGBColor2 = getRGBColor(Math.min(255, alphaTran2), this.mTabTextDefaultRGB);
            this.mTabUnSelColor = rGBColor2;
            changeItemChildTabColor(rGBColor2, this.mTabSelColor, false);
            changeItemChildTabLocateColor(this.mTabSelColor, false);
            this.mTabSelLocationColor = this.mTabSelColor;
        } else if (checkAppear(f)) {
            int min = Math.min(255, alphaTran(255, getAppearAlpha(f)));
            if (!z || (iArr = this.mDetailExtraTitleColorRGB) == null) {
                this.mTabSelColor = getRGBColor(min, this.mTabHighlightTextRGB);
            } else {
                this.mTabSelColor = getRGBColor(min, iArr);
            }
            int rGBColor3 = getRGBColor(min, this.mTabTextRGB);
            this.mTabUnSelColor = rGBColor3;
            changeItemChildTabColor(rGBColor3, this.mTabSelColor, false);
            int[] iArr2 = this.mDetailExtraTitleColorRGB;
            if (iArr2 != null) {
                this.mTabSelLocationColor = getRGBColor(min, iArr2);
            } else {
                this.mTabSelLocationColor = getRGBColor(min, this.mTabHighlightLocationRGB);
            }
            changeItemChildTabLocateColor(this.mTabSelLocationColor, false);
        }
    }

    private void changeTabTextColor(TextView textView, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61d3407d", new Object[]{this, textView, new Integer(i), new Boolean(z)});
            return;
        }
        textView.setTextColor(i);
        if (z) {
            textView.setShadowLayer(4.0f, 2.0f, 4.0f, Color.parseColor("#33000000"));
        } else {
            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
    }

    private void changeViewAlpha(float f, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42876102", new Object[]{this, new Float(f), view});
        } else if (checkAppear(f)) {
            float appearAlpha = getAppearAlpha(f);
            tgh.b("changeElevator", "alpha:" + appearAlpha + "|" + f);
            view.setAlpha(appearAlpha);
        } else {
            if (view == this.mElevatorContainer) {
                tgh.b("changeElevator", "000");
            }
            view.setAlpha(0.0f);
        }
    }

    private boolean checkAppear(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a552a980", new Object[]{this, new Float(f)})).booleanValue();
        }
        if (f < (this.orangeAlpha + 1.0f) / 2.0f || f > 1.0f) {
            return false;
        }
        return true;
    }

    private boolean checkDisappear(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dafd582", new Object[]{this, new Float(f)})).booleanValue();
        }
        float f2 = this.orangeAlpha;
        if (f <= f2 || f >= (f2 + 1.0f) / 2.0f) {
            return false;
        }
        return true;
    }

    private boolean checkFix(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7573ee50", new Object[]{this, new Float(f)})).booleanValue();
        }
        if (f <= this.orangeAlpha) {
            return true;
        }
        return false;
    }

    private void closePopWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d2f4a90", new Object[]{this});
        }
    }

    private int[] colorStringToHexArray(String str, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("10c223f8", new Object[]{this, str, iArr});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.length() < 6) {
            return iArr;
        }
        try {
            iArr = new int[3];
            for (int i = 0; i < 3; i++) {
                int i2 = i * 2;
                iArr[i] = Integer.parseInt(str.substring(i2, i2 + 2), 16);
            }
        } catch (Exception unused) {
        }
        return iArr;
    }

    private LinearLayout.LayoutParams createTabLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("7cc9489b", new Object[]{this});
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = mr7.a(8.0f);
        layoutParams.topMargin = mr7.a(6.0f);
        return layoutParams;
    }

    private float getAppearAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("beaec856", new Object[]{this, new Float(f)})).floatValue();
        }
        float f2 = this.orangeAlpha;
        return getLimitedTransparency(((f - ((f2 + 1.0f) / 2.0f)) * 2.0f) / (1.0f - f2));
    }

    private int getCollectedIconColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c56011", new Object[]{this})).intValue();
        }
        float f = this.mTransparency;
        int i = 255;
        if (!checkFix(f) && !this.isFestivalAtmosphere) {
            if (checkDisappear(f)) {
                i = alphaTran(255, getDisappearAlpha(f));
            } else if (checkAppear(f)) {
                i = alphaTran(255, getAppearAlpha(f));
            }
        }
        return getRGBColor(i, this.mMenuDefault2RGBCollected);
    }

    private int getColorFromString(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("276dbc8c", new Object[]{this, str, new Integer(i), new Integer(i2)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        return parseColor(str, i2);
    }

    private float getDisappearAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1b8e638", new Object[]{this, new Float(f)})).floatValue();
        }
        float f2 = this.orangeAlpha;
        return getLimitedTransparency(1.0f - (((f - f2) * 2.0f) / (1.0f - f2)));
    }

    private float getFloatFromString(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bbb307e", new Object[]{this, str, new Float(f)})).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return f;
        }
    }

    private float getLimitedTransparency(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6535a2ad", new Object[]{this, new Float(f)})).floatValue();
        }
        if (f < 1.0E-5f) {
            return 0.0f;
        }
        if (f > 0.99999f) {
            return 1.0f;
        }
        return f;
    }

    private int getRGBColor(int i, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c701d1", new Object[]{this, new Integer(i), iArr})).intValue();
        }
        return Color.argb(i, iArr[0], iArr[1], iArr[2]);
    }

    private View.OnClickListener getTabOnClickListener(TextView textView, View view, NavBarHolderV3.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("757d1678", new Object[]{this, textView, view, lVar});
        }
        int size = this.clickableTabRefs.size();
        this.clickableTabRefs.add(new Pair<>(textView, view));
        return new b(size, textView, view, lVar);
    }

    private void initItemsAndTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a0d14c", new Object[]{this});
            return;
        }
        this.mTransparency = 0.0f;
        if (this.mFullTransparentMode) {
            changeDrawableAlpha(0.0f, this);
            changeMiniAppContainerDrawableAlpha(0.0f, this.mMiniAppContainer);
            changeItemChildrenColor(getRGBColor(255, this.mMenuDefaultRGB));
            return;
        }
        changeItemChildrenColor(getRGBColor(255, this.mMenuDefault2RGB));
    }

    private void initMiniApp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b807b2a1", new Object[]{this});
        } else {
            bew.a(tq4.d(this));
        }
    }

    private void initNavBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d18dda7", new Object[]{this});
            return;
        }
        if (this.mNavTabsBar == null) {
            this.mNavTabsBar = new LinearLayout(this.mContext);
        }
        if (this.mFullTransparentMode) {
            this.mNavTabsBar.setBackgroundColor(0);
        } else {
            this.mNavTabsBar.setBackgroundColor(this.mTabBgColor);
        }
        this.mNavTabsBar.setVisibility(0);
    }

    private void initTabTextView(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891b8206", new Object[]{this, textView});
            return;
        }
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(null, 1);
        textView.setTextColor(this.mTabUnSelColor);
        textView.setGravity(17);
        textView.setBackgroundColor(0);
        textView.setPadding(0, 0, 0, mr7.a(4.0f));
        textView.setShadowLayer(4.0f, 0.0f, 2.0f, Color.parseColor("#33000000"));
    }

    public static /* synthetic */ Object ipc$super(TaoDetailActionBarV3 taoDetailActionBarV3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/navbar/TaoDetailActionBarV3");
    }

    private Map<String, Object> mergeContentExposure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("893185c4", new Object[]{this});
        }
        return new HashMap();
    }

    private int parseColor(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c923b015", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            if (str.length() == 6) {
                return (int) ((i << 24) | Long.parseLong(str, 16));
            }
            throw new IllegalArgumentException("Unknown color");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private void setTabScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcd0193", new Object[]{this, new Boolean(z)});
            return;
        }
        Boolean bool = (Boolean) q84.g(this.mContext, this.mInsideQuery);
        if (bool == null || !bool.booleanValue()) {
            q84.f(this.mContext, new hi3(z));
        }
    }

    private void showShareItemView(boolean z) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6956213", new Object[]{this, new Boolean(z)});
            return;
        }
        View findViewWithTag = findViewWithTag(String.valueOf(5));
        View findViewById = findViewById(R.id.tt_detail_nav_bar_share_image);
        View findViewById2 = findViewById(R.id.tt_detail_nav_bar_share_icon);
        if (findViewWithTag != null && findViewById != null && findViewById2 != null) {
            if (z || findViewById2.getVisibility() != 0) {
                if (z) {
                    findViewWithTag.setBackgroundColor(0);
                }
                if (z) {
                    i = 8;
                } else {
                    i = 0;
                }
                findViewById2.setVisibility(i);
                if (!z) {
                    i2 = 8;
                }
                findViewById.setVisibility(i2);
                if (z && !this.mHasCommitShareImageExposure) {
                    this.mHasCommitShareImageExposure = true;
                    com.taobao.android.detail.ttdetail.skeleton.navbar.a.Companion.a(this.mContext);
                    if (!TextUtils.isEmpty(this.mComponentId4Fatigue)) {
                        wb4.ComponentFatigueContainer.b(this.mComponentId4Fatigue);
                    }
                }
            }
        }
    }

    public void addElevatorItem(String str, String str2, int i) {
        LinearLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df5c626", new Object[]{this, str, str2, new Integer(i)});
        } else if (this.mElevatorContainer != null) {
            TextView textView = new TextView(this.mContext);
            textView.setTextColor(new ColorStateList(new int[][]{new int[]{16842913}, new int[0]}, new int[]{-16777216, -6710887}));
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setBackgroundColor(0);
            textView.setOnClickListener(new a(str));
            textView.setSelected(false);
            textView.setText(str2);
            if (i > 0) {
                textView.setPadding(i, 0, i, 0);
                layoutParams = new LinearLayout.LayoutParams(-2, -1);
            } else {
                layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
            }
            this.mElevatorContainer.addView(textView, layoutParams);
            if (!TextUtils.isEmpty(str)) {
                this.mElevatorItems.put(str, textView);
            }
        }
    }

    public void addElevatorPadding(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a95703a", new Object[]{this, new Integer(i)});
            return;
        }
        LinearLayout linearLayout = this.mElevatorContainer;
        if (linearLayout != null && i > 0) {
            linearLayout.setPadding(i, 0, i, 0);
        }
    }

    public void addItemView(View view, int i) {
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c76891", new Object[]{this, view, new Integer(i)});
        } else if (view != null) {
            view.setTag(String.valueOf(i));
            this.vItemViews.add(view);
            if (!this.isNewNav || i != 3) {
                if (1 == i) {
                    i2 = mr7.a(8.0f);
                } else {
                    i2 = mr7.a(4.0f);
                }
                if (2 == i) {
                    i3 = mr7.a(8.0f);
                } else {
                    i3 = mr7.a(4.0f);
                }
                if (1 != i) {
                    i4 = i3;
                }
                addNaviItem(i2, i4, view, i);
                return;
            }
            addSearchItem(view);
        }
    }

    public void addNavTabsBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa9deb9a", new Object[]{this});
            return;
        }
        if (this.mNavTabAndSearchContainer == null) {
            this.mNavTabAndSearchContainer = new FrameLayout(this.mContext);
        }
        LinearLayout linearLayout = this.mNavTabsBar;
        if (linearLayout != null) {
            this.mNavTabAndSearchContainer.removeView(linearLayout);
        }
        initNavBar();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        this.mNavTabAndSearchContainer.addView(this.mNavTabsBar, layoutParams);
        this.mNavHeadBar.addView(this.mNavTabAndSearchContainer, new LinearLayout.LayoutParams(-1, -1, 1.0f));
    }

    public void addShopTab(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2526e4f9", new Object[]{this, str, str2});
            return;
        }
        ShopTabTextView shopTabTextView = new ShopTabTextView(this.mContext);
        initTabTextView(shopTabTextView);
        shopTabTextView.setText(str);
        shopTabTextView.setOnClickListener(new c(str2));
        LinearLayout.LayoutParams createTabLayoutParams = createTabLayoutParams();
        this.mNavTabsBar.setClipChildren(false);
        this.mNavTabsBar.addView(shopTabTextView, createTabLayoutParams);
        this.mShopTabView = shopTabTextView;
        this.mItemTabContainers.add(shopTabTextView);
    }

    public void addTabWithText(String str, NavBarHolderV3.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b245ea", new Object[]{this, str, lVar});
        } else if (this.mNavTabsBar != null) {
            RelativeLayout relativeLayout = new RelativeLayout(this.mContext);
            relativeLayout.setBackgroundColor(0);
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            TextView textView = new TextView(this.mContext);
            initTabTextView(textView);
            int i = R.id.tt_detail_nav_bar_tab_text;
            textView.setId(i);
            textView.setText(str);
            relativeLayout.addView(textView, new RelativeLayout.LayoutParams(-2, -2));
            View view = new View(this.mContext);
            view.setVisibility(4);
            view.setBackgroundColor(this.mTabSelLocationColor);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(mr7.a(15.0f), mr7.a(2.0f));
            layoutParams.addRule(14);
            layoutParams.addRule(8, i);
            relativeLayout.addView(view, layoutParams);
            View.OnClickListener tabOnClickListener = getTabOnClickListener(textView, view, lVar);
            LinearLayout linearLayout = new LinearLayout(this.mContext);
            linearLayout.setGravity(17);
            linearLayout.setBackgroundColor(0);
            linearLayout.setOrientation(0);
            linearLayout.setOnClickListener(tabOnClickListener);
            linearLayout.addView(relativeLayout, new LinearLayout.LayoutParams(-2, -2));
            this.mNavTabsBar.addView(linearLayout, createTabLayoutParams());
            this.mItemTabContainers.add(linearLayout);
            this.vNaviTabViews.put(textView, view);
            highlightTab(0);
        }
    }

    public void changeItemChildrenTran(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3dabec", new Object[]{this, new Float(f)});
            return;
        }
        int[] iArr = this.mMenuDefaultRGB;
        int i = 255;
        if (!checkFix(f) && !this.isFestivalAtmosphere) {
            if (checkDisappear(f)) {
                i = alphaTran(255, getDisappearAlpha(f));
            } else if (checkAppear(f)) {
                i = alphaTran(255, getAppearAlpha(f));
                iArr = this.mMenuDefault2RGB;
            }
        }
        changeItemChildrenColor(getRGBColor(i, iArr));
    }

    public FrameLayout createNavBarIconFontLayout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("c37cf4db", new Object[]{this, new Integer(i)});
        }
        FrameLayout frameLayout = new FrameLayout(this.mContext);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        frameLayout.setBackgroundResource(R.drawable.tt_detail_action_bar_circular_bg_black_v3);
        return frameLayout;
    }

    @Override // tb.de7
    public int getActionBarHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4e99cc8", new Object[]{this})).intValue();
        }
        return this.mNavHeadHeight + this.mNavStatusBarHeight;
    }

    @Override // tb.de7
    public int getElevatorContainerHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29a5147e", new Object[]{this})).intValue();
        }
        return this.mElevatorContainerHeight;
    }

    public FrameLayout getMiniAppContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("2457b185", new Object[]{this});
        }
        return this.mMiniAppContainer;
    }

    public int getNavHeadHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62e6bf6e", new Object[]{this})).intValue();
        }
        return this.mNavHeadHeight;
    }

    public int getNavItemWH() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7b9d16b", new Object[]{this})).intValue();
        }
        return this.mNavItemWH;
    }

    @Override // tb.de7
    public float getTransparency() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8897cb45", new Object[]{this})).floatValue();
        }
        return this.mTransparency;
    }

    public void highlightTab(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a2d31bb", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && i < this.mTabNum && this.lastClickIndex.get() != i) {
            try {
                Pair<TextView, View> pair = -1 != this.lastClickIndex.get() ? this.clickableTabRefs.get(this.lastClickIndex.get()) : null;
                if (pair != null) {
                    highlightTab(false, (TextView) pair.first, (View) pair.second);
                }
                this.lastClickIndex = new AtomicInteger(i);
                Pair<TextView, View> pair2 = this.clickableTabRefs.get(i);
                if (pair2 != null) {
                    highlightTab(true, (TextView) pair2.first, (View) pair2.second);
                    if (i != 0 || getTransparency() <= 0.1f) {
                        z = false;
                    }
                    showElevatorView(z);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void init() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setOrientation(1);
        if (this.mFullTransparentMode) {
            setBackgroundColor(this.mTabBgColor);
        } else {
            setBackgroundColor(0);
        }
        Context d = tq4.d(this);
        this.mContext = d;
        this.mNavItemWH = owo.b(d, 29.0f);
        this.mNavHeadHeight = owo.b(this.mContext, 44.0f);
        this.mElevatorContainerHeight = owo.b(this.mContext, 34.0f);
        if (canImmersiveStatusBar(this.mContext)) {
            i = nj7.b();
        } else {
            i = 0;
        }
        this.mNavStatusBarHeight = i;
        FrameLayout frameLayout = new FrameLayout(this.mContext);
        this.mMiniAppContainer = frameLayout;
        if (this.mFullTransparentMode) {
            frameLayout.setBackgroundColor(0);
        } else {
            frameLayout.setBackgroundColor(this.mTabBgColor);
        }
        addView(this.mMiniAppContainer, new LinearLayout.LayoutParams(-1, this.mNavHeadHeight + this.mNavStatusBarHeight));
        LinearLayout linearLayout = new LinearLayout(this.mContext);
        this.mNavHeadBar = linearLayout;
        linearLayout.setOrientation(0);
        this.mNavHeadBar.setBackgroundColor(0);
        this.mNavHeadBar.setGravity(16);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = this.mNavStatusBarHeight;
        this.mMiniAppContainer.addView(this.mNavHeadBar, layoutParams);
    }

    public void initElevatorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7ddcea", new Object[]{this});
            return;
        }
        if (this.mElevatorContainer == null) {
            LinearLayout linearLayout = new LinearLayout(this.mContext);
            this.mElevatorContainer = linearLayout;
            linearLayout.setBackgroundResource(R.drawable.tt_detail_action_bar_elevator_container_bg_v3);
            this.mElevatorContainer.setOrientation(0);
        }
        addView(this.mElevatorContainer, new LinearLayout.LayoutParams(-1, this.mElevatorContainerHeight));
        this.mElevatorContainer.setVisibility(8);
    }

    public void initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        initItemsAndTabs();
        initMiniApp();
    }

    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else {
            highlightTab(i);
        }
    }

    public void restoreLastTransparency() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19458243", new Object[]{this});
        }
    }

    public void setActionBarBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3991202", new Object[]{this, new Integer(i)});
            return;
        }
        this.mTabBgColor = i;
        if (this.mFullTransparentMode) {
            FrameLayout frameLayout = this.mMiniAppContainer;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            LinearLayout linearLayout = this.mNavTabsBar;
            if (linearLayout != null) {
                linearLayout.setBackgroundColor(0);
            }
            setBackgroundColor(this.mTabBgColor);
            return;
        }
        FrameLayout frameLayout2 = this.mMiniAppContainer;
        if (frameLayout2 != null) {
            frameLayout2.setBackgroundColor(i);
        }
        LinearLayout linearLayout2 = this.mNavTabsBar;
        if (linearLayout2 != null) {
            linearLayout2.setBackgroundColor(this.mTabBgColor);
        }
        setBackgroundColor(0);
    }

    public void setActionBarBackgroundDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658c7032", new Object[]{this, drawable});
        } else if (this.mFullTransparentMode) {
            FrameLayout frameLayout = this.mMiniAppContainer;
            if (frameLayout != null) {
                frameLayout.setBackgroundDrawable(drawable);
                changeMiniAppContainerDrawableAlpha(this.mTransparency, this.mMiniAppContainer);
            }
            LinearLayout linearLayout = this.mNavTabsBar;
            if (linearLayout != null) {
                linearLayout.setBackgroundColor(0);
            }
        } else {
            FrameLayout frameLayout2 = this.mMiniAppContainer;
            if (frameLayout2 != null) {
                frameLayout2.setBackgroundDrawable(drawable);
            }
        }
    }

    public void setActionBarTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3058722e", new Object[]{this, str});
        } else if (!this.isNewNav && !TextUtils.isEmpty(str)) {
            this.mActionBarTitle = str;
            if (this.mActionBarTitleView == null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.leftMargin = mr7.a(6.0f);
                TextView textView = new TextView(this.mContext);
                this.mActionBarTitleView = textView;
                textView.setTextSize(1, 18.0f);
                this.mActionBarTitleView.setTypeface(null, 1);
                this.mActionBarTitleView.setTextColor(-15658735);
                this.mActionBarTitleView.setVisibility(8);
                this.mNavTabsBar.addView(this.mActionBarTitleView, layoutParams);
            }
            this.mActionBarTitleView.setText(this.mActionBarTitle);
        }
    }

    public void setAnchorPoints(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4129ff2", new Object[]{this, list});
        } else {
            this.mAnchorPoints = list;
        }
    }

    public void setComponentId4Fatigue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("526edcfa", new Object[]{this, str});
        } else {
            this.mComponentId4Fatigue = str;
        }
    }

    public void setExtraDetailTitleColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6becb1b", new Object[]{this, str});
        } else if (!this.isFestivalAtmosphere) {
            this.mDetailExtraTitleColorRGB = colorStringToHexArray(str, this.mTabHighlightTextRGB);
        }
    }

    public void setFestivalAtmosphere(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bcb73f1", new Object[]{this, new Boolean(z)});
        } else {
            this.isFestivalAtmosphere = z;
        }
    }

    public void setFullTransparentMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df985e9", new Object[]{this, new Boolean(z)});
        } else {
            this.mFullTransparentMode = z;
        }
    }

    public void setIsNewNav(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10880de", new Object[]{this, new Boolean(z)});
        } else {
            this.isNewNav = z;
        }
    }

    public void setIsRateFragmentShown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acdee078", new Object[]{this, new Boolean(z)});
        } else {
            this.isRateFragmentShown = z;
        }
    }

    public void setIsShowComment(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8f3117", new Object[]{this, new Boolean(z)});
        }
    }

    public void setItemColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d36864e", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMenuDefault2RGB = new int[]{Color.red(i), Color.green(i), Color.blue(i)};
        this.mMenuDefaultTaoMoment2RGB = new int[]{Color.red(i), Color.green(i), Color.blue(i)};
    }

    public void setNavTabsBarAlphaAndVisibility(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebf8489", new Object[]{this, new Float(f), new Integer(i)});
        }
    }

    @Override // tb.de7
    public void setNavTabsBarVisibility(int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("857e35d6", new Object[]{this, new Integer(i)});
            return;
        }
        if (8 == i) {
            z = true;
        }
        setIsRateFragmentShown(z);
        showActionBarTitle(z);
        showElevatorView(!z);
    }

    public void setNaviBarState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b82af67", new Object[]{this, new Boolean(z)});
        } else if (z) {
            FrameLayout frameLayout = this.mNavTabAndSearchContainer;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            FrameLayout frameLayout2 = this.mRateViewContainer;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
            FrameLayout frameLayout3 = this.mSearchIconContainer;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(0);
            }
        } else {
            FrameLayout frameLayout4 = this.mNavTabAndSearchContainer;
            if (frameLayout4 != null) {
                frameLayout4.setVisibility(0);
            }
            FrameLayout frameLayout5 = this.mRateViewContainer;
            if (frameLayout5 != null) {
                frameLayout5.setVisibility(8);
            }
            FrameLayout frameLayout6 = this.mSearchIconContainer;
            if (frameLayout6 != null) {
                frameLayout6.setVisibility(8);
            }
        }
    }

    public void setRateTitleView(TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("880f9472", new Object[]{this, textView, new Boolean(z)});
            return;
        }
        if (this.mRateViewContainer == null) {
            FrameLayout frameLayout = new FrameLayout(this.mContext);
            this.mRateViewContainer = frameLayout;
            frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 16));
            this.mNavHeadBar.addView(this.mRateViewContainer, 1);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, this.mNavItemWH);
        layoutParams.weight = 1.0f;
        if (z) {
            layoutParams.leftMargin = mr7.a(6.0f);
            layoutParams.rightMargin = mr7.a(4.0f);
        } else {
            layoutParams.leftMargin = mr7.a(8.0f);
            layoutParams.rightMargin = mr7.a(8.0f);
        }
        this.mRateViewContainer.setLayoutParams(layoutParams);
    }

    public void setSearchIconContainerVisibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec8e5b7", new Object[]{this});
        } else {
            this.mSearchIconContainer.setVisibility(8);
        }
    }

    public void setSearchLabParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f9a500", new Object[]{this, jSONObject});
        } else {
            this.mSearchLabParams = jSONObject;
        }
    }

    public void setSyncTransparentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c285c71", new Object[]{this, view});
        }
    }

    public void setTabNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca539089", new Object[]{this, new Integer(i)});
        } else {
            this.mTabNum = i;
        }
    }

    public void setTabSelectedColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b702407", new Object[]{this, new Integer(i)});
        } else {
            this.mTabSelColor = i;
        }
    }

    public void setTabUnSelectedColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ac59c0", new Object[]{this, new Integer(i)});
        } else {
            this.mTabUnSelColor = i;
        }
    }

    @Override // tb.de7
    public void setTransparency(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f8137f", new Object[]{this, new Float(f)});
            return;
        }
        float limitedTransparency = getLimitedTransparency(f);
        if (Math.abs(limitedTransparency - this.mTransparency) > 1.0E-5f) {
            this.mTransparency = limitedTransparency;
            changeActionBarTransparency(limitedTransparency);
            MiniAppEntranceView miniAppEntranceView = this.miniAppEntranceView;
            if (miniAppEntranceView != null) {
                miniAppEntranceView.updateViewStatus(limitedTransparency);
            }
        }
    }

    public void setTransparencyLR(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4194cc39", new Object[]{this, new Float(f)});
            return;
        }
        float limitedTransparency = getLimitedTransparency(f);
        if (Math.abs(limitedTransparency - this.mTransparencyLR) > 1.0E-5f) {
            this.mTransparencyLR = limitedTransparency;
            if (!checkFix(this.mTransparency) && (!checkDisappear(this.mTransparency) ? !(!checkAppear(this.mTransparency) || (checkAppear(limitedTransparency) && getAppearAlpha(limitedTransparency) >= getAppearAlpha(this.mTransparency))) : !(this.isFestivalAtmosphere || ((checkDisappear(limitedTransparency) && getDisappearAlpha(limitedTransparency) <= getDisappearAlpha(this.mTransparency)) || (checkAppear(limitedTransparency) && getAppearAlpha(limitedTransparency) >= getAppearAlpha(this.mTransparency)))))) {
                limitedTransparency = this.mTransparency;
            }
            changeActionBarTransparency(limitedTransparency);
        }
    }

    public void showActionBarTitle(boolean z) {
        View view;
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4a7375", new Object[]{this, new Boolean(z)});
        } else if (this.mActionBarTitleView != null && (view = this.vSearchView) != null && view.getParent() != null) {
            if (!z || !TextUtils.isEmpty(this.mActionBarTitle)) {
                FrameLayout frameLayout = (FrameLayout) this.vSearchView.getParent();
                if (z) {
                    i = 8;
                } else {
                    i = 0;
                }
                frameLayout.setVisibility(i);
                for (int i4 = 0; i4 < this.mItemTabContainers.size(); i4++) {
                    View view2 = this.mItemTabContainers.get(i4);
                    if (view2 != null) {
                        if (z) {
                            i2 = 8;
                        } else {
                            i2 = 0;
                        }
                        view2.setVisibility(i2);
                    }
                }
                TextView textView = this.mActionBarTitleView;
                if (!z) {
                    i3 = 8;
                }
                textView.setVisibility(i3);
                if (!z) {
                    this.mActionBarTitle = null;
                }
            }
        }
    }

    public void showElevatorView(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1120f4dd", new Object[]{this, new Boolean(z)});
            return;
        }
        LinearLayout linearLayout = this.mElevatorContainer;
        if (linearLayout != null) {
            if (!z) {
                i = 8;
            }
            linearLayout.setVisibility(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6934a;
        public final /* synthetic */ TextView b;
        public final /* synthetic */ View c;
        public final /* synthetic */ NavBarHolderV3.l d;

        public b(int i, TextView textView, View view, NavBarHolderV3.l lVar) {
            this.f6934a = i;
            this.b = textView;
            this.c = view;
            this.d = lVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (TaoDetailActionBarV3.access$100(TaoDetailActionBarV3.this).get() >= 0) {
                Pair pair = (Pair) TaoDetailActionBarV3.access$200(TaoDetailActionBarV3.this).get(TaoDetailActionBarV3.access$100(TaoDetailActionBarV3.this).get());
                TaoDetailActionBarV3.access$300(TaoDetailActionBarV3.this, false, (TextView) pair.first, (View) pair.second);
            }
            TaoDetailActionBarV3.access$102(TaoDetailActionBarV3.this, new AtomicInteger(this.f6934a));
            TaoDetailActionBarV3.access$300(TaoDetailActionBarV3.this, true, this.b, this.c);
            NavBarHolderV3.l lVar = this.d;
            if (lVar != null) {
                ((jos.c) lVar).a(this.f6934a);
                int i = this.f6934a;
                if (i == 0 || i == 1) {
                    if (i == 0) {
                        str = "Page_Detail_Button_ProductDetail";
                    } else {
                        str = "Page_Detail_Button_Content";
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("arg1", (Object) str);
                    jSONObject.put("arg2", (Object) "detailV3");
                    q84.f(TaoDetailActionBarV3.access$000(TaoDetailActionBarV3.this), new rc7("userTrack", jSONObject, new RuntimeAbilityParam[0]));
                }
            }
        }
    }

    private void changeElevatorViewTransparency(float f) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa9b57e", new Object[]{this, new Float(f)});
            return;
        }
        LinearLayout linearLayout = this.mElevatorContainer;
        if (linearLayout != null) {
            changeViewAlpha(f, linearLayout);
            int i = 8;
            if (this.isRateFragmentShown) {
                this.mElevatorContainer.setVisibility(8);
            } else {
                this.mElevatorContainer.setClickable(checkAppear(f));
                LinearLayout linearLayout2 = this.mElevatorContainer;
                if (checkAppear(f) && this.lastClickIndex.get() <= 0) {
                    i = 0;
                }
                linearLayout2.setVisibility(i);
            }
            StringBuilder sb = new StringBuilder("change:");
            sb.append(f < 0.1f);
            sb.append("|");
            sb.append(this.lastClickIndex.get());
            sb.append("}");
            sb.append(checkAppear(f));
            tgh.b("changeElevator", sb.toString());
            if (this.mElevatorContainer.getVisibility() != 0) {
                z = false;
            }
            tgh.b("changeElevator", String.valueOf(z));
        }
    }

    private void changeSearch(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea0bda1", new Object[]{this, new Float(f)});
            return;
        }
        View view = this.vSearchView;
        if (view != null && view.getParent() != null) {
            if (this.lastClickIndex.get() <= 0) {
                if (this.vSearchView.getParent() != null) {
                    FrameLayout frameLayout = (FrameLayout) this.vSearchView.getParent();
                    frameLayout.setVisibility(0);
                    changeViewAlpha(f, frameLayout);
                }
                changeViewAlpha(f, this.vSearchView);
                if (checkAppear(f)) {
                    this.vSearchView.setClickable(true);
                } else {
                    this.vSearchView.setClickable(false);
                }
            } else if (this.vSearchView.getParent() != null) {
                FrameLayout frameLayout2 = (FrameLayout) this.vSearchView.getParent();
                frameLayout2.setVisibility(8);
                changeViewAlpha(f, frameLayout2);
            }
            if (checkAppear(f) && !this.mHasCommitSearchExposure) {
                this.mHasCommitSearchExposure = true;
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = this.mSearchLabParams;
                    if (jSONObject3 != null) {
                        jSONObject2.putAll(jSONObject3);
                    }
                    jSONObject.put("page", (Object) "Page_Detail");
                    jSONObject.put("eventId", (Object) 2201);
                    jSONObject.put("arg1", (Object) "Page_Detail_Show-Search");
                    jSONObject.put("args", (Object) jSONObject2);
                    q84.f(this.mContext, new rc7("userTrack", jSONObject, new RuntimeAbilityParam[0]));
                } catch (Exception e) {
                    tgh.c(TAG, "Page_Detail_Show_Navigation error", e);
                }
            }
        }
    }

    public void setTopAtmosphereBackground(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21dfb06", new Object[]{this, jSONObject});
        } else if (!this.isFestivalAtmosphere && jSONObject != null && !jSONObject.isEmpty() && (jSONArray = jSONObject.getJSONArray("topAtmosphereGradientColor")) != null && jSONArray.size() != 0) {
            int size = jSONArray.size();
            int[] iArr = new int[size + 1];
            float floatFromString = getFloatFromString(jSONObject.getString("alpha"), 1.0f);
            for (int i = 0; i < size; i++) {
                iArr[i] = getColorFromString(jSONArray.getString(i).replace("#", ""), 0, (int) (255.0f * floatFromString));
            }
            iArr[size] = parseColor("#FFFFFF", 1);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setColors(iArr);
            this.mTopAtmosphereBackground = gradientDrawable;
        }
    }

    @Override // tb.de7
    public void highlightTab(String str) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c6b212", new Object[]{this, str});
            return;
        }
        tgh.b("[highlightTab]TaoDetailActionBarV3", str);
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, this.lastHighlightElevatorLocatorId)) {
            String str2 = this.lastHighlightElevatorLocatorId;
            if (!(str2 == null || (view = this.mElevatorItems.get(str2)) == null)) {
                view.setSelected(false);
            }
            View view2 = this.mElevatorItems.get(str);
            if (view2 != null) {
                view2.setSelected(true);
            }
            this.lastHighlightElevatorLocatorId = str;
        }
    }

    public void addElevatorItem(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c523c7d", new Object[]{this, str, str2});
        } else {
            addElevatorItem(str, str2, 0);
        }
    }

    private void highlightTab(boolean z, TextView textView, View view) {
        boolean z2 = true;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a19d39a", new Object[]{this, new Boolean(z), textView, view});
            return;
        }
        if (textView != null) {
            textView.setTextColor(z ? this.mTabSelColor : this.mTabUnSelColor);
            StringBuilder sb = new StringBuilder();
            sb.append((Object) textView.getText());
            sb.append(z ? "按钮已选中" : "");
            textView.setContentDescription(sb.toString());
            if (this.mAnchorPoints.size() <= 1 || !this.mAnchorPoints.get(1).equals(textView.getText().toString())) {
                if (this.mAnchorPoints.size() <= 0 || !this.mAnchorPoints.get(0).equals(textView.getText().toString())) {
                    z2 = false;
                }
                changeItemChildrenTran(this.mTransparency);
                changeItemChildrenParentTran(this.mTransparency);
                changeTabColor(this.mTransparency, z2);
                changeMiniAppContainerDrawableAlpha(this.mTransparency, this.mMiniAppContainer);
                changeSearch(this.mTransparency);
            } else {
                changeItemChildrenTran(1.0f);
                changeItemChildrenParentTran(1.0f);
                changeTabColor(1.0f, false);
                changeMiniAppContainerDrawableAlpha(1.0f, this.mMiniAppContainer);
                changeSearch(1.0f);
                if (z) {
                    closePopWindow();
                }
            }
        }
        if (view != null) {
            if (!z) {
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    public TaoDetailActionBarV3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TaoDetailActionBarV3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
