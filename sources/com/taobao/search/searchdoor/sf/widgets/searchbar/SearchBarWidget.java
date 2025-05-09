package com.taobao.search.searchdoor.sf.widgets.searchbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.nav.Nav;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.ai.SearchBarInputModel;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintStructuredBean;
import com.taobao.search.searchdoor.sf.SearchDoorViewPool;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.WindowFocusViewModel;
import com.taobao.search.sf.RpxConfigVM;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.preference.AppPreference;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import tb.a1p;
import tb.aj3;
import tb.aya;
import tb.b4p;
import tb.ca0;
import tb.cy0;
import tb.dgw;
import tb.dy2;
import tb.eh3;
import tb.eoe;
import tb.ey2;
import tb.f6p;
import tb.fy0;
import tb.h0p;
import tb.h1p;
import tb.h2p;
import tb.h3p;
import tb.hrs;
import tb.i0p;
import tb.j0p;
import tb.k0p;
import tb.kgw;
import tb.l0p;
import tb.mv1;
import tb.n0p;
import tb.n3p;
import tb.nd2;
import tb.o1p;
import tb.o4p;
import tb.oic;
import tb.oxb;
import tb.phw;
import tb.r4p;
import tb.s0m;
import tb.s0p;
import tb.s8d;
import tb.sen;
import tb.slo;
import tb.t1p;
import tb.t2o;
import tb.u5p;
import tb.ude;
import tb.v1p;
import tb.v4p;
import tb.vfw;
import tb.w1p;
import tb.xnd;
import tb.xyd;
import tb.yxa;
import tb.z1p;
import tb.zo6;
import tb.zxa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchBarWidget extends phw<Void, View, SearchDoorContext> implements View.OnClickListener, TextView.OnEditorActionListener, zo6, ClipboardManager.OnPrimaryClipChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_SEARCH_BUTTON_GIF_SEP_COUNT = "gifSepCount";
    private static final String KEY_SEARCH_BUTTON_GIF_SHOW_COUNT = "gifShowedCount";
    private static final String TAG = "SearchBarWidget";
    private boolean advHintTracked;
    private SearchBarHintBean cacheHintBean;
    private View delButton;
    private EditText editText;
    private aya hintGuideWidget;
    private boolean isKeyboardViewTreeObserverEnabled;
    private ImageView mBackButton;
    private z1p mFocusEvent;
    private Drawable mHintIconDrawable;
    private eoe mImageSearchGuideWidget;
    private LottieAnimationView mPhotoSearchAnimView;
    public TUrlImageView mPhotoSearchButtonFont;
    private View mSearchBarInner;
    public View mSearchBarLeftContainer;
    public TextView mSearchBarLeftTxtTv;
    private Button mSearchButton;
    private SearchDoorContext mSearchDoorContext;
    private boolean mShowingSpeechLayer;
    private boolean mTb2024Enabled;
    private final String DEFAULT_HINT = Localization.q(R.string.taobao_app_1005_1_16704);
    private CharSequence clipboardContent = null;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private boolean mIsPhotoSearchUnable = false;
    private boolean cameraAnimChecked = false;
    private Runnable mShowKeyboardRunnable = new b();
    private Resources resources = Globals.getApplication().getResources();
    private boolean isUOneStyle = "UOne".equals(getModel().s("searchBoxShowType"));
    private boolean mIsElderHomeEdition = "true".equals(getModel().q(r4p.KEY_SEARCH_ELDER_HOME_OPEN));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ((WindowFocusViewModel) ViewModelProviders.of((FragmentActivity) SearchBarWidget.this.getActivity()).get(WindowFocusViewModel.class)).a().setValue(Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SearchBarWidget.this.showKeyBoard();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            SearchBarWidget.this.getModel().H(SearchBarWidget.this.getActivity(), true);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a1p f11666a;

        public d(a1p a1pVar) {
            this.f11666a = a1pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SearchBarWidget.access$200(SearchBarWidget.this, this.f11666a.f());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUrlImageView f11667a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements fy0 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.fy0
            public boolean onLoopCompleted(int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("a7565d93", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                }
                if (i == 0) {
                    return true;
                }
                SearchBarWidget.access$300(SearchBarWidget.this).setVisibility(0);
                e.this.f11667a.setImageUrl(null);
                kgw.c(e.this.f11667a);
                return false;
            }
        }

        public e(TUrlImageView tUrlImageView) {
            this.f11667a = tUrlImageView;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable instanceof cy0) {
                SearchBarWidget.access$300(SearchBarWidget.this).setVisibility(4);
                ((cy0) drawable).A(new a());
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                SearchBarWidget.access$400(SearchBarWidget.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            SearchBarWidget.access$500(SearchBarWidget.this);
            SearchBarWidget.access$600(SearchBarWidget.this, charSequence, i, i3);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f11671a;
        public final /* synthetic */ int b;
        public final /* synthetic */ SearchBarHintBean c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                h hVar = h.this;
                SearchBarWidget.access$800(SearchBarWidget.this, hVar.c);
            }
        }

        public h(int i, int i2, SearchBarHintBean searchBarHintBean) {
            this.f11671a = i;
            this.b = i2;
            this.c = searchBarHintBean;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable != null && !succPhenixEvent.isIntermediate()) {
                drawable.setBounds(0, 0, this.f11671a, this.b);
                SearchBarWidget.access$702(SearchBarWidget.this, drawable.mutate());
                SearchBarWidget.access$700(SearchBarWidget.this).setAlpha(204);
                SearchBarWidget.access$900(SearchBarWidget.this).post(new a());
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/searchbar/SearchBarWidget$9");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            SearchBarWidget.access$1000(SearchBarWidget.this).setVisibility(8);
            SearchBarWidget.this.mPhotoSearchButtonFont.setVisibility(0);
        }
    }

    static {
        t2o.a(815793238);
        t2o.a(993002134);
    }

    public SearchBarWidget(Activity activity, ude udeVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
        boolean z = false;
        this.mTb2024Enabled = xyd.a(activity);
        this.mSearchDoorContext = searchDoorContext;
        if ((getActivity() instanceof oic) && ((oic) getActivity()).i1()) {
            z = true;
        }
        this.isKeyboardViewTreeObserverEnabled = z;
        registerClipboardListener();
        subscribeEvent(this);
        if (activity instanceof oxb) {
            ((oxb) activity).P(this);
        }
    }

    public static /* synthetic */ EditText access$000(SearchBarWidget searchBarWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("f4e56125", new Object[]{searchBarWidget});
        }
        return searchBarWidget.editText;
    }

    public static /* synthetic */ SearchDoorContext access$100(SearchBarWidget searchBarWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchDoorContext) ipChange.ipc$dispatch("f2ea3404", new Object[]{searchBarWidget});
        }
        return searchBarWidget.mSearchDoorContext;
    }

    public static /* synthetic */ LottieAnimationView access$1000(SearchBarWidget searchBarWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LottieAnimationView) ipChange.ipc$dispatch("f846c489", new Object[]{searchBarWidget});
        }
        return searchBarWidget.mPhotoSearchAnimView;
    }

    public static /* synthetic */ void access$200(SearchBarWidget searchBarWidget, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d7951fe", new Object[]{searchBarWidget, str});
        } else {
            searchBarWidget.showSearchButtonGif(str);
        }
    }

    public static /* synthetic */ Button access$300(SearchBarWidget searchBarWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("81a8e387", new Object[]{searchBarWidget});
        }
        return searchBarWidget.mSearchButton;
    }

    public static /* synthetic */ void access$400(SearchBarWidget searchBarWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f637f72", new Object[]{searchBarWidget});
        } else {
            searchBarWidget.onBackBtnClick();
        }
    }

    public static /* synthetic */ void access$500(SearchBarWidget searchBarWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89d47891", new Object[]{searchBarWidget});
        } else {
            searchBarWidget.handleTextChanged();
        }
    }

    public static /* synthetic */ void access$600(SearchBarWidget searchBarWidget, CharSequence charSequence, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d561b4", new Object[]{searchBarWidget, charSequence, new Integer(i2), new Integer(i3)});
        } else {
            searchBarWidget.checkAndReportPaste(charSequence, i2, i3);
        }
    }

    public static /* synthetic */ Drawable access$700(SearchBarWidget searchBarWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("57ee148b", new Object[]{searchBarWidget});
        }
        return searchBarWidget.mHintIconDrawable;
    }

    public static /* synthetic */ Drawable access$702(SearchBarWidget searchBarWidget, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("943b5ee9", new Object[]{searchBarWidget, drawable});
        }
        searchBarWidget.mHintIconDrawable = drawable;
        return drawable;
    }

    public static /* synthetic */ void access$800(SearchBarWidget searchBarWidget, SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ecde04d", new Object[]{searchBarWidget, searchBarHintBean});
        } else {
            searchBarWidget.updateSearchBarHintUI(searchBarHintBean);
        }
    }

    public static /* synthetic */ Handler access$900(SearchBarWidget searchBarWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("8541499", new Object[]{searchBarWidget});
        }
        return searchBarWidget.mHandler;
    }

    private void applyDefaultSearchhint(SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b74dd2", new Object[]{this, searchBarHintBean});
        } else if (searchBarHintBean == null) {
            h2p.c().i(Integer.valueOf(this.mSearchDoorContext.hashCode()), null);
        } else {
            try {
                h2p.c().i(Integer.valueOf(this.mSearchDoorContext.hashCode()), new JSONObject(JSON.toJSONString(searchBarHintBean)));
            } catch (JSONException unused) {
            }
            if (TextUtils.equals(this.mSearchDoorContext.g(), "all")) {
                updateSearchBarHintUI(searchBarHintBean);
            } else {
                updateSearchBarHintUI(null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    private void bindNightResources() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88740611", new Object[]{this});
            return;
        }
        View findViewById = getView().findViewById(R.id.view_bg);
        if (findViewById != null) {
            setSearchBarBg(findViewById, true);
        }
        EditText editText = this.editText;
        if (editText != null) {
            editText.setTextColor(-1);
        }
        TUrlImageView tUrlImageView = this.mPhotoSearchButtonFont;
        if (tUrlImageView == null) {
            return;
        }
        if (this.mTb2024Enabled) {
            tUrlImageView.setImageUrl(s0p.PHOTO_SEARCH_ICON_2024_DARK);
        } else {
            tUrlImageView.setImageUrl(s0p.PHOTO_SEARCH_ICON_LIGHT);
        }
    }

    private void checkAndReportPaste(CharSequence charSequence, int i2, int i3) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7adbd85b", new Object[]{this, charSequence, new Integer(i2), new Integer(i3)});
        } else if (o4p.J1()) {
            CharSequence subSequence = charSequence.subSequence(i2, i3 + i2);
            if (this.clipboardContent == null) {
                this.clipboardContent = getClipboardContent();
            }
            if (!TextUtils.isEmpty(this.clipboardContent) && !TextUtils.isEmpty(subSequence) && TextUtils.equals(subSequence, this.clipboardContent)) {
                String d2 = getModel().d();
                HashMap hashMap = new HashMap();
                hashMap.put("content", f6p.d(this.clipboardContent.toString()));
                hashMap.put("contentType", "string");
                if (!TextUtils.isEmpty(d2)) {
                    hashMap.put("channelSrp", d2);
                }
                if (TextUtils.isEmpty(d2)) {
                    str = "search";
                } else {
                    str = "search_pingdao";
                }
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Paste", 19997, "OnDeviceAI_Paste", str, "", hashMap).build());
            }
        }
    }

    private void checkAndShowCameraAnim(dy2 dy2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77258b3", new Object[]{this, dy2Var});
        } else if (this.mPhotoSearchAnimView != null && !this.cameraAnimChecked && dy2Var != null) {
            this.cameraAnimChecked = true;
            if (ey2.c(dy2Var)) {
                this.mPhotoSearchButtonFont.setVisibility(8);
                this.mPhotoSearchAnimView.setVisibility(0);
                this.mPhotoSearchAnimView.setAnimationFromUrl(dy2Var.d);
                this.mPhotoSearchAnimView.addAnimatorListener(new i());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    private void checkAndShowPromotionGif() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b9eb94", new Object[]{this});
        } else if (TextUtils.isEmpty(this.mSearchDoorContext.d())) {
            String V = o4p.V();
            if (TextUtils.isEmpty(V)) {
                clearSearchButtonGifShowedCount();
                return;
            }
            try {
                a1p a2 = a1p.a(new JSONObject(V));
                long currentTimeMillis = System.currentTimeMillis();
                if (a2 == null || currentTimeMillis < a2.d() || currentTimeMillis > a2.b()) {
                    clearSearchButtonGifShowedCount();
                    return;
                }
                int d2 = v4p.d(KEY_SEARCH_BUTTON_GIF_SHOW_COUNT, 0);
                if (d2 < a2.e()) {
                    int d3 = v4p.d(KEY_SEARCH_BUTTON_GIF_SEP_COUNT, 0);
                    if (d3 >= a2.c() || d2 == 0) {
                        v4p.g(KEY_SEARCH_BUTTON_GIF_SHOW_COUNT, d2 + 1);
                        v4p.g(KEY_SEARCH_BUTTON_GIF_SEP_COUNT, 0);
                        getView().postDelayed(new d(a2), 500L);
                        return;
                    }
                    v4p.g(KEY_SEARCH_BUTTON_GIF_SEP_COUNT, d3 + 1);
                }
            } catch (JSONException unused) {
                clearSearchButtonGifShowedCount();
            }
        }
    }

    private void clearSearchButtonGifShowedCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd952fd", new Object[]{this});
            return;
        }
        v4p.g(KEY_SEARCH_BUTTON_GIF_SEP_COUNT, 0);
        v4p.g(KEY_SEARCH_BUTTON_GIF_SHOW_COUNT, 0);
    }

    private void displayNormalSearchButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db704cea", new Object[]{this});
            return;
        }
        this.mSearchButton.setTextColor(ContextCompat.getColor(Globals.getApplication(), R.color.tbsearch_white));
        String d2 = getModel().d();
        if (this.isUOneStyle) {
            if (this.mTb2024Enabled) {
                this.mSearchButton.setBackgroundResource(R.drawable.tbsearch_search_btn_uone_new);
                this.mSearchButton.getLayoutParams().width = o1p.a(52.0f);
                this.mSearchButton.setTextSize(1, 13.0f);
                return;
            }
            this.mSearchButton.setBackgroundResource(R.drawable.tbsearch_search_btn_uone);
            this.mSearchButton.getLayoutParams().width = o1p.a(57.5f);
            this.mSearchButton.setTextSize(1, 14.4f);
        } else if (TextUtils.equals(d2, "localSearch")) {
            this.mSearchButton.setBackgroundResource(R.drawable.tbsearch_search_btn_local_search);
        } else if (this.mTb2024Enabled) {
            this.mSearchButton.setBackgroundResource(R.drawable.tbsearch_search_btn_new);
        } else {
            this.mSearchButton.setBackgroundResource(R.drawable.tbsearch_search_btn);
        }
    }

    private void elderHomeAdapt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ea9ea0", new Object[]{this});
            return;
        }
        this.editText.setTextSize(1, h3p.c(14, true));
        this.mSearchBarLeftTxtTv.setTextSize(1, h3p.c(14, true));
        this.mSearchButton.setHeight(DensityUtil.dip2px(getActivity(), 30.0f));
        this.mSearchButton.getLayoutParams().width = o1p.b(67);
        this.mSearchButton.getLayoutParams().height = o1p.b(30);
        this.mSearchButton.setTextSize(1, h3p.b(h3p.a.INSTANCE.a(), true));
    }

    private CharSequence getClipboardContent() {
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("ae9b563a", new Object[]{this});
        }
        if (o4p.J1() && (clipboardManager = (ClipboardManager) getActivity().getSystemService("clipboard")) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() > 0) {
            return primaryClip.getItemAt(0).getText();
        }
        return "";
    }

    private CharSequence getHintContent(SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("f017bc62", new Object[]{this, searchBarHintBean});
        }
        if (TextUtils.isEmpty(searchBarHintBean.iconUrl) || searchBarHintBean.iconWidth == 0 || searchBarHintBean.iconHeight == 0 || o4p.Z1()) {
            return searchBarHintBean.displayText;
        }
        int b2 = o1p.b(h3p.c(14, true));
        int i2 = (int) ((b2 * searchBarHintBean.iconWidth) / searchBarHintBean.iconHeight);
        if (this.mHintIconDrawable == null) {
            s0m.B().T(searchBarHintBean.iconUrl).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, "8920").succListener(new h(i2, b2, searchBarHintBean)).fetch();
            return searchBarHintBean.displayText;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(searchBarHintBean.displayText);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.setSpan(new eh3(this.mHintIconDrawable), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static int getLayoutId(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b1d00a5", new Object[]{new Boolean(z)})).intValue();
        }
        if (z) {
            return R.layout.tbsearchdoor_searchbar_immersive_2021_new;
        }
        return R.layout.tbsearchdoor_searchbar_immersive_2021;
    }

    private SpannableString getStructuredHint(SearchBarHintStructuredBean searchBarHintStructuredBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("1f4b1663", new Object[]{this, searchBarHintStructuredBean});
        }
        if (searchBarHintStructuredBean.getInfoList() == null || searchBarHintStructuredBean.getInfoList().isEmpty()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean isDarkMode = isDarkMode();
        for (mv1 mv1Var : searchBarHintStructuredBean.getInfoList()) {
            yxa<?> a2 = zxa.a(mv1Var, isDarkMode, getActivity());
            if (a2 != null) {
                a2.setCallback(this.editText);
                spannableStringBuilder.append(" ", new eh3(a2), 17).append((CharSequence) " ");
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    private void handleTextChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f439f686", new Object[]{this});
            return;
        }
        String searchEditContent = getSearchEditContent();
        if (!TextUtils.isEmpty(searchEditContent)) {
            this.delButton.setVisibility(0);
            this.mPhotoSearchButtonFont.setVisibility(8);
        } else {
            this.delButton.setVisibility(8);
            if (this.mIsPhotoSearchUnable) {
                this.mPhotoSearchButtonFont.setVisibility(8);
            } else {
                this.mPhotoSearchButtonFont.setVisibility(0);
            }
        }
        this.mSearchDoorContext.O(searchEditContent);
        this.mSearchDoorContext.U(searchEditContent);
        postEvent(i0p.a(searchEditContent));
    }

    public static /* synthetic */ Object ipc$super(SearchBarWidget searchBarWidget, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode == 593843865) {
            super.onCtxDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/searchdoor/sf/widgets/searchbar/SearchBarWidget");
        }
    }

    private void onBackBtnClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec13999", new Object[]{this});
            return;
        }
        sen.e("Back");
        this.mActivity.finish();
    }

    private void onImageSearchBtnClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a81ba9d6", new Object[]{this});
            return;
        }
        try {
            ArrayMap arrayMap = new ArrayMap();
            String str = "ssk";
            String d2 = getModel().d();
            if (!TextUtils.isEmpty(d2)) {
                str = "ssk-" + d2;
            }
            arrayMap.put("pssource", str);
            String str2 = eoe.m;
            if (!TextUtils.isEmpty(str2)) {
                arrayMap.put("image_id", str2);
            }
            Nav.from(this.mActivity).toUri(f6p.a(h1p.PAILITAO_URL, arrayMap));
            sen.e("PhotoSearch_Enter");
        } catch (Throwable th) {
            b4p.l("SearchDoorActivity", "启动图搜失败！", th);
        }
    }

    private void registerClipboardListener() {
        ClipboardManager clipboardManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83b6050e", new Object[]{this});
        } else if (o4p.J1() && (clipboardManager = (ClipboardManager) Globals.getApplication().getSystemService("clipboard")) != null) {
            clipboardManager.addPrimaryClipChangedListener(this);
        }
    }

    private void renderSearchBar(boolean z) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef907f8", new Object[]{this, new Boolean(z)});
        } else if (isDarkMode()) {
            View view = this.mSearchBarInner;
            if (view != null) {
                view.setBackground(null);
            }
            ImageView imageView = this.mBackButton;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.actionbar_left_arrow);
            }
            setStatusBarColor(false);
        } else {
            ImageView imageView2 = this.mBackButton;
            if (imageView2 != null) {
                Drawable drawable = imageView2.getDrawable();
                if (z) {
                    i2 = -1;
                } else {
                    i2 = ContextCompat.getColor(Globals.getApplication(), R.color.black_33);
                }
                drawable.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
            }
            setStatusBarColor(!z);
        }
    }

    private void setStatusBarColor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1424789", new Object[]{this, new Boolean(z)});
        } else {
            u5p.c(z, getActivity());
        }
    }

    private void showSearchButtonGif(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9fd07e", new Object[]{this, str});
            return;
        }
        TUrlImageView tUrlImageView = new TUrlImageView(getActivity());
        tUrlImageView.setId(R.id.search_button_gif_view);
        tUrlImageView.setSkipAutoSize(true);
        tUrlImageView.setLayoutParams(this.mSearchButton.getLayoutParams());
        tUrlImageView.setOnClickListener(this);
        ((ViewGroup) this.mSearchButton.getParent()).addView(tUrlImageView);
        tUrlImageView.setImageUrl(str);
        tUrlImageView.succListener(new e(tUrlImageView));
    }

    private void trackChannelHintExpose(SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd173931", new Object[]{this, searchBarHintBean});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("channelSrp", getModel().d());
        hashMap.put(h1p.KEY_SUGGEST_RN, searchBarHintBean.suggestRn);
        hashMap.put("item_id", getModel().q("targetItemId"));
        hashMap.put("q", searchBarHintBean.displayText);
        sen.l("Page_SearchDoor_Button-DiWen-Exposure", hashMap);
    }

    private void unregisterClipboardListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4b4915", new Object[]{this});
            return;
        }
        ClipboardManager clipboardManager = (ClipboardManager) Globals.getApplication().getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this);
        }
    }

    private void updateSearchBarHintUI(SearchBarHintBean searchBarHintBean) {
        SpannableString structuredHint;
        SearchUrlImageView searchUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bd84ef7", new Object[]{this, searchBarHintBean});
            return;
        }
        EditText editText = this.editText;
        if (editText != null) {
            if (searchBarHintBean == null) {
                editText.setHint(this.DEFAULT_HINT);
                return;
            }
            String atmosImg = searchBarHintBean.getAtmosImg(isDarkMode());
            if (!TextUtils.isEmpty(atmosImg) && !xyd.a(getActivity()) && (searchUrlImageView = (SearchUrlImageView) findView(R.id.view_promotion)) != null) {
                searchUrlImageView.setImageUrl(atmosImg);
            }
            if (searchBarHintBean.isStructuredHint() && !this.mIsElderHomeEdition && (structuredHint = getStructuredHint(searchBarHintBean.structuredInfo)) != null) {
                this.editText.setHint(structuredHint);
            } else if (TextUtils.isEmpty(searchBarHintBean.displayText)) {
                this.editText.setHint(this.DEFAULT_HINT);
            } else {
                this.editText.setHint(getHintContent(searchBarHintBean));
            }
        }
    }

    public void applyDefaultSearchHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f6c6329", new Object[]{this});
        } else {
            applyDefaultSearchhint(this.cacheHintBean);
        }
    }

    public void attachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9770b116", new Object[]{this});
        } else if (this.mFocusEvent != null) {
            this.mSearchDoorContext.Q(true);
            onEventMainThread(this.mFocusEvent);
            this.mSearchDoorContext.Q(false);
            onCtxResume();
        }
    }

    public void bindListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d54d418", new Object[]{this});
            return;
        }
        this.mSearchButton.setOnClickListener(this);
        ViewProxy.setOnClickListener(this.delButton, this);
        this.mPhotoSearchButtonFont.setOnClickListener(this);
        LottieAnimationView lottieAnimationView = this.mPhotoSearchAnimView;
        if (lottieAnimationView != null) {
            lottieAnimationView.setOnClickListener(this);
        }
        this.mBackButton.setOnClickListener(new f());
        this.editText.setOnEditorActionListener(this);
        this.editText.addTextChangedListener(new g());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View] */
    @Override // tb.phw, tb.khq
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        ImageView imageView = (ImageView) findView(R.id.btn_go_back);
        this.mBackButton = imageView;
        RpxConfigVM.a aVar = RpxConfigVM.Companion;
        aVar.b(imageView);
        this.mSearchButton = (Button) findView(R.id.searchbtn);
        View findView = findView(R.id.edit_del_btn);
        this.delButton = findView;
        aVar.b(findView);
        EditText editText = (EditText) findView(R.id.searchEdit);
        this.editText = editText;
        if (editText != null) {
            editText.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_IGNORE);
            if ((getActivity() instanceof SearchDoorActivity) && ((SearchDoorActivity) getActivity()).z3()) {
                getActivity().runOnUiThread(new Runnable() { // from class: com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* compiled from: Taobao */
                    /* renamed from: com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget$2$a */
                    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
                    public class a implements TextWatcher {
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ SearchBarInputModel f11662a;

                        public a(SearchBarInputModel searchBarInputModel) {
                            this.f11662a = searchBarInputModel;
                        }

                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable editable) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                            } else if (SearchBarWidget.access$000(SearchBarWidget.this).hasFocus() && editable != null) {
                                this.f11662a.c(editable.toString());
                                SearchBarWidget.access$100(SearchBarWidget.this).J();
                            }
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                            }
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        SearchBarInputModel searchBarInputModel = (SearchBarInputModel) ViewModelProviders.of((FragmentActivity) SearchBarWidget.this.getActivity()).get(SearchBarInputModel.class);
                        searchBarInputModel.b((FragmentActivity) SearchBarWidget.this.getActivity(), new Observer<String>() { // from class: com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            /* renamed from: a */
                            public void onChanged(String str) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("f154e0a6", new Object[]{this, str});
                                } else if (!SearchBarWidget.access$000(SearchBarWidget.this).hasFocus()) {
                                    SearchBarWidget.access$000(SearchBarWidget.this).setText(str);
                                }
                            }
                        });
                        SearchBarWidget.access$000(SearchBarWidget.this).addTextChangedListener(new a(searchBarInputModel));
                    }
                });
            }
            if (Build.VERSION.SDK_INT >= 26) {
                this.editText.setImportantForAutofill(2);
            }
            if (!this.isKeyboardViewTreeObserverEnabled) {
                this.editText.setOnTouchListener(new c());
            }
        }
        this.mSearchBarInner = findView(R.id.searchbar_inner);
        this.mSearchBarLeftContainer = findView(R.id.search_bar_left_container);
        this.mSearchBarLeftTxtTv = (TextView) findView(R.id.sblc_txt_tv);
        TUrlImageView tUrlImageView = (TUrlImageView) findView(R.id.photoBtn);
        this.mPhotoSearchButtonFont = tUrlImageView;
        aVar.b(tUrlImageView);
        if (!this.mTb2024Enabled) {
            this.mPhotoSearchButtonFont.setImageUrl(s0p.PHOTO_SEARCH_ICON);
        } else {
            this.mPhotoSearchButtonFont.setImageUrl(s0p.PHOTO_SEARCH_ICON_2024);
        }
        this.mPhotoSearchAnimView = (LottieAnimationView) findView(R.id.lav_photo_btn);
        bindListener();
        this.mImageSearchGuideWidget = new eoe(this.mActivity, this, this.mPhotoSearchButtonFont, (ViewGroup) this.mActivity.findViewById(R.id.tbsearch_searchdoor));
        if (c().g().isDebug()) {
            this.editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(512)});
        }
        String d2 = getModel().d();
        if (TextUtils.equals(d2, "localSearch")) {
            this.mSearchButton.setText(Localization.q(R.string.taobao_app_1005_1_16702));
            this.mSearchButton.setBackgroundResource(R.drawable.tbsearch_search_btn_local_search);
            this.mSearchButton.getLayoutParams().width = o1p.b(72);
        }
        if (this.mIsElderHomeEdition) {
            elderHomeAdapt();
        } else {
            aVar.b(this.mSearchButton);
            aVar.c(this.mSearchButton);
            aVar.c(this.editText);
        }
        List asList = Arrays.asList(o4p.Z());
        if (!asList.isEmpty()) {
            boolean contains = asList.contains(d2);
            this.mIsPhotoSearchUnable = contains;
            if (contains) {
                this.mPhotoSearchButtonFont.setVisibility(8);
            } else {
                this.mPhotoSearchButtonFont.setVisibility(0);
            }
            checkAndShowPromotionGif();
            this.hintGuideWidget = new aya(getActivity(), this, this.mSearchButton, this.mSearchDoorContext);
            View findViewById = getView().findViewById(R.id.view_bg);
            aVar.b(findViewById);
            if (findViewById != null) {
                setSearchBarBg(findViewById, false);
            }
            displayNormalSearchButton();
            this.mSearchBarInner.setPadding(0, 0, o1p.a(8.6f), 0);
            if (isDarkMode()) {
                bindNightResources();
            }
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return TAG;
    }

    public String getSearchEditContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5cfdb408", new Object[]{this});
        }
        return (((Object) this.editText.getText()) + "").trim();
    }

    public void hideBackButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddb73ce2", new Object[]{this});
            return;
        }
        ((ViewGroup.MarginLayoutParams) this.mSearchBarInner.getLayoutParams()).leftMargin = o1p.a(6.0f);
        this.mSearchBarInner.requestLayout();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mBackButton.getLayoutParams();
        marginLayoutParams.rightMargin = 0;
        marginLayoutParams.width = 0;
        this.mBackButton.requestLayout();
    }

    public void hideSoftKeyBoard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86c837a", new Object[]{this});
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) Globals.getApplication().getSystemService("input_method");
        if (inputMethodManager != null) {
            EditText editText = this.editText;
            if (editText != null) {
                inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
            }
            if (!this.isKeyboardViewTreeObserverEnabled) {
                getModel().H(getActivity(), false);
            }
        }
    }

    public void initHint() {
        SearchBarHintBean searchBarHintBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3380be", new Object[]{this});
            return;
        }
        String i2 = this.mSearchDoorContext.i();
        if (TextUtils.isEmpty(this.mSearchDoorContext.d())) {
            searchBarHintBean = n3p.a(AppPreference.getString(h1p.HOMEPAGE_PREFERENCE_KEY, ""));
            if (searchBarHintBean != null) {
                searchBarHintBean.handleMultiHint();
            }
        } else if (!TextUtils.isEmpty(i2)) {
            SearchBarHintBean searchBarHintBean2 = new SearchBarHintBean();
            searchBarHintBean2.displayText = i2;
            searchBarHintBean2.searchText = i2;
            searchBarHintBean2.suggestRn = this.mSearchDoorContext.q("hint_suggest_rn");
            searchBarHintBean2.handleMultiHint();
            trackChannelHintExpose(searchBarHintBean2);
            searchBarHintBean = searchBarHintBean2;
        } else {
            searchBarHintBean = null;
        }
        if (searchBarHintBean != null) {
            if (!TextUtils.isEmpty(searchBarHintBean.aac)) {
                this.mSearchDoorContext.b("aac", searchBarHintBean.aac);
            }
            this.mSearchDoorContext.T("all", searchBarHintBean);
            this.cacheHintBean = searchBarHintBean;
        }
    }

    public void initSearchHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f87e86", new Object[]{this});
        } else if (!this.mSearchDoorContext.E()) {
            loadSearchHint();
        }
    }

    public boolean isDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        if (!(getActivity() instanceof oxb) || !((oxb) getActivity()).E1()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.searchbtn || view.getId() == R.id.search_button_gif_view) {
            onSearchBtnClicked();
        } else if (view.getId() == R.id.edit_del_btn) {
            this.editText.setText("");
        } else if (view.getId() == R.id.photoBtn || view.getId() == R.id.lav_photo_btn) {
            onImageSearchBtnClicked();
        }
    }

    @Override // tb.phw
    public View onCreateView() {
        View view;
        SearchDoorViewPool d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        if (!(getActivity() instanceof xnd) || (d2 = ((xnd) getActivity()).d()) == null) {
            view = null;
        } else {
            view = d2.g(this.mTb2024Enabled);
        }
        if (view == null) {
            return LayoutInflater.from(this.mActivity).inflate(getLayoutId(this.mTb2024Enabled), this.mContainer, false);
        }
        return view;
    }

    @Override // tb.abx
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        h2p.c().f(Integer.valueOf(this.mSearchDoorContext.hashCode()));
        hideSoftKeyBoard();
        unregisterClipboardListener();
    }

    @Override // tb.abx
    public void onCtxResume() {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        if (getView() != 0) {
            hrs a2 = aj3.INSTANCE.a(this.mSearchDoorContext.d());
            if (a2 == null || a2.f != 10002) {
                z = false;
            } else {
                z = true;
            }
            if (FestivalMgr.i().v("global") || z) {
                if (TextUtils.equals(FestivalMgr.i().f("global", slo.KEY_NAVI_STYLE), "0") || z) {
                    z2 = true;
                }
                renderSearchBar(z2);
                return;
            }
            renderSearchBar(false);
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i2), keyEvent})).booleanValue();
        }
        if (i2 != 3 && i2 != 0) {
            return false;
        }
        sen.e("IME_Search");
        onSearchBtnClicked();
        return true;
    }

    public void onEventMainThread(v1p v1pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0816fdd", new Object[]{this, v1pVar});
            return;
        }
        initSearchHint();
        setSearchWord(this.mSearchDoorContext.l());
        setSearchBarLeftTxt();
    }

    public void onHitDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
            return;
        }
        View view = this.mSearchBarInner;
        if (view != null) {
            view.setBackground(null);
        }
        ImageView imageView = this.mBackButton;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.actionbar_left_arrow);
        }
        setStatusBarColor(false);
        if (getView() != 0) {
            bindNightResources();
        }
    }

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public void onPrimaryClipChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64145e28", new Object[]{this});
        } else {
            this.clipboardContent = getClipboardContent();
        }
    }

    public void onSearchBtnClicked() {
        String str;
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce74979", new Object[]{this});
            return;
        }
        try {
            str = getSearchEditContent();
        } catch (Exception e2) {
            b4p.l(TAG, "点击键盘获取搜索框关键词失败", e2);
            str = str2;
        }
        SearchDoorContext searchDoorContext = this.mSearchDoorContext;
        SearchBarHintBean u = searchDoorContext.u(searchDoorContext.g());
        if (u != null) {
            str2 = u.searchText;
        }
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            postEvent(j0p.a(str, u));
        } else {
            shakeHint();
        }
    }

    public void setSearchBarBg(View view, boolean z) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56775e77", new Object[]{this, view, new Boolean(z)});
        } else if (z) {
            if (this.isUOneStyle) {
                i3 = R.drawable.tbsearch_searchdoor_bar_bg_uone_night;
            } else {
                i3 = R.drawable.tbsearch_searchdoor_bar_bg_2021_night;
            }
            view.setBackgroundResource(i3);
        } else if (this.mTb2024Enabled) {
            view.setBackgroundResource(R.drawable.tbsearch_searchdoor_bar_bg_uone_new);
        } else {
            if (this.isUOneStyle) {
                i2 = R.drawable.tbsearch_searchdoor_bar_bg_uone;
            } else {
                i2 = R.drawable.tbsearch_searchdoor_bar_bg_2021;
            }
            view.setBackgroundResource(i2);
        }
    }

    public void setSearchBarLeftTxt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e65ca27", new Object[]{this});
            return;
        }
        String r = getModel().r(h1p.a.PARAM_COMBO_BIZ_NAME, "");
        if (TextUtils.isEmpty(r)) {
            this.mSearchBarLeftContainer.setVisibility(8);
            return;
        }
        this.mSearchBarLeftContainer.setVisibility(0);
        this.mSearchBarLeftTxtTv.setText(r);
    }

    public void setSearchWord(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba23665", new Object[]{this, str});
            return;
        }
        EditText editText = this.editText;
        if (editText != null) {
            if (str == null) {
                str = "";
            }
            editText.setText(str);
            this.editText.setSelection(getSearchEditContent().length());
        }
    }

    public void shakeHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55114b4", new Object[]{this});
        } else {
            this.editText.startAnimation(AnimationUtils.loadAnimation(Globals.getApplication(), R.anim.shake));
        }
    }

    public void showKeyBoard() {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315b686b", new Object[]{this});
        } else if (!this.mShowingSpeechLayer && (editText = this.editText) != null) {
            editText.setFocusable(true);
            this.editText.requestFocus();
            this.editText.setSelection(getSearchEditContent().length());
            ((InputMethodManager) Globals.getApplication().getSystemService("input_method")).showSoftInput(this.editText, 0);
            if (!this.isKeyboardViewTreeObserverEnabled) {
                getModel().H(getActivity(), true);
            }
        }
    }

    public void loadSearchHint() {
        SearchBarHintBean searchBarHintBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66126fdc", new Object[]{this});
            return;
        }
        String i2 = this.mSearchDoorContext.i();
        if (TextUtils.isEmpty(this.mSearchDoorContext.d())) {
            searchBarHintBean = n3p.a(AppPreference.getString(h1p.HOMEPAGE_PREFERENCE_KEY, ""));
            if (searchBarHintBean != null) {
                searchBarHintBean.handleMultiHint();
            }
        } else if (!TextUtils.isEmpty(i2)) {
            SearchBarHintBean searchBarHintBean2 = new SearchBarHintBean();
            searchBarHintBean2.displayText = i2;
            searchBarHintBean2.searchText = i2;
            searchBarHintBean2.suggestRn = this.mSearchDoorContext.q("hint_suggest_rn");
            searchBarHintBean2.handleMultiHint();
            trackChannelHintExpose(searchBarHintBean2);
            searchBarHintBean = searchBarHintBean2;
        } else {
            searchBarHintBean = null;
        }
        if (searchBarHintBean != null) {
            if (!TextUtils.isEmpty(searchBarHintBean.aac)) {
                this.mSearchDoorContext.b("aac", searchBarHintBean.aac);
                postEvent(new n0p());
            }
            this.mSearchDoorContext.T("all", searchBarHintBean);
            applyDefaultSearchhint(searchBarHintBean);
            postEvent(k0p.a(searchBarHintBean));
            if (searchBarHintBean.isAdvHint() && !this.advHintTracked) {
                AlimamaAdvertising.instance().buildTanxEventTracking(getActivity().getApplication(), searchBarHintBean.advInfo.getExposureParams()).b(r4p.RUNTIME_PERMISSION_REQUEST_BIZ_NAME).a();
                this.advHintTracked = true;
            }
        }
    }

    public void onEventMainThread(z1p z1pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e265ad0", new Object[]{this, z1pVar});
        } else if (getView() == 0) {
            this.mFocusEvent = z1pVar;
        } else if (!z1pVar.f32465a) {
            try {
                ((WindowFocusViewModel) ViewModelProviders.of((FragmentActivity) getActivity()).get(WindowFocusViewModel.class)).a().setValue(Boolean.FALSE);
            } catch (Exception unused) {
            }
        } else {
            this.mHandler.postDelayed(new a(), o4p.a0() + 100);
            if (!"true".equals(this.mSearchDoorContext.q(MspEventTypes.ACTION_STRING_HIDE_KEYBOARD))) {
                if (this.mSearchDoorContext.E() || this.mSearchDoorContext.x() == 10002) {
                    this.mHandler.post(this.mShowKeyboardRunnable);
                    return;
                }
                SearchBarHintBean u = this.mSearchDoorContext.u("all");
                if ((u == null || !TextUtils.equals(u.aac, "true")) && this.mSearchDoorContext.D()) {
                    this.mHandler.postDelayed(this.mShowKeyboardRunnable, o4p.a0());
                }
            }
        }
    }

    public void onEventMainThread(t1p t1pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd51b85d", new Object[]{this, t1pVar});
        } else {
            hideSoftKeyBoard();
        }
    }

    public void onEventMainThread(h0p h0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a1e124", new Object[]{this, h0pVar});
        } else {
            hideSoftKeyBoard();
        }
    }

    public void onEventMainThread(w1p w1pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c594fd", new Object[]{this, w1pVar});
        } else {
            this.mShowingSpeechLayer = w1pVar.f30400a;
        }
    }

    public void onEventMainThread(l0p l0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28b435cd", new Object[]{this, l0pVar});
            return;
        }
        SearchBarHintBean searchBarHintBean = l0pVar.f23041a;
        if (searchBarHintBean != null) {
            applyDefaultSearchhint(searchBarHintBean);
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("display_text", searchBarHintBean.displayText);
            arrayMap.put("search_text", searchBarHintBean.searchText);
            arrayMap.put(h1p.KEY_SUGGEST_RN, searchBarHintBean.suggestRn);
            sen.k(SearchDoorActivity.PAGE_NAME, "Page_SearchDoor_Show-inner_search_text", arrayMap);
        }
    }

    public void onEventMainThread(ca0 ca0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbbf0a6c", new Object[]{this, ca0Var});
        } else {
            checkAndShowCameraAnim(ca0Var.f16933a.r);
        }
    }
}
