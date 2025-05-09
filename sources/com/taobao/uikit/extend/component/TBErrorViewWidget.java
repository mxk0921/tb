package com.taobao.uikit.extend.component;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.WindowType;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.error.AbsErrorFilter;
import com.taobao.uikit.extend.component.error.DefaultErrorFilter;
import com.taobao.uikit.extend.component.error.Error;
import com.taobao.uikit.extend.material.TBCircularProgressDrawable;
import com.taobao.uikit.extend.utils.NetUtil;
import java.net.URLEncoder;
import org.json.JSONObject;
import tb.hij;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBErrorViewWidget extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BIT_ENABLE_ALL = 7;
    public static final int BIT_ENABLE_FEEDBACK = 2;
    public static final int BIT_ENABLE_NETWORK_DIAGNOSIS = 1;
    public static final int BIT_ENABLE_NONE = 0;
    public static final int BIT_ENABLE_REFRESH = 4;
    private boolean mAdaptiveWidth;
    private RelativeLayout mBackground;
    private int mBitEnableButtons;
    private TBCircularProgressDrawable mCircularDrawable;
    private float mCurrentAlpha;
    private int mCurrentVisible;
    private String mCustomTitle;
    private Error mError;
    private AbsErrorFilter mErrorFilter;
    private ValueAnimator mFadeIn;
    private ValueAnimator mFadeOut;
    private Button mFeedbackButton;
    private boolean mHasReported;
    private UserInterfaceStyle mInterfaceStyle;
    private boolean mIsInRefreshingState;
    private int mLoadingIntervalMillis;
    private boolean mNeedRefreshProgress;
    private Button mNetworkCheckButton;
    private LinearLayout mRefreshButton;
    private ImageView mRefreshCircularView;
    private RefreshRestoreRunnable mRefreshRestoreRunnable;
    private String mRefreshText;
    private TextView mRefreshTitleView;
    private String mRefreshingText;
    private Status mStatus;
    private TextView mTitleView;
    private String mTopic;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.uikit.extend.component.TBErrorViewWidget$4  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$autosize$WindowType;
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$TBErrorViewWidget$UserInterfaceStyle;

        static {
            int[] iArr = new int[UserInterfaceStyle.values().length];
            $SwitchMap$com$taobao$uikit$extend$component$TBErrorViewWidget$UserInterfaceStyle = iArr;
            try {
                iArr[UserInterfaceStyle.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$TBErrorViewWidget$UserInterfaceStyle[UserInterfaceStyle.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$TBErrorViewWidget$UserInterfaceStyle[UserInterfaceStyle.UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[WindowType.values().length];
            $SwitchMap$com$taobao$android$autosize$WindowType = iArr2;
            try {
                iArr2[WindowType.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.MAX.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class GoToNetworkDiagnosisListener implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String URI = "http://m.taobao.com/go/networkDiagnosis?nav_jump_mode=std_mega_pop&diagnosis_page_mode=half";
        private final String mUri;

        static {
            t2o.a(932184085);
        }

        public GoToNetworkDiagnosisListener() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(hij.KEY_CORNER_RADIUS, 8.0d);
                str = URLEncoder.encode(jSONObject.toString(), "UTF-8");
            } catch (Exception unused) {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                this.mUri = URI;
                return;
            }
            this.mUri = "http://m.taobao.com/go/networkDiagnosis?nav_jump_mode=std_mega_pop&diagnosis_page_mode=half&stdpop_config%3D" + str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                Nav.from(TBErrorViewWidget.this.getContext()).toUri(this.mUri);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public final class GoToRefreshListener implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final View.OnClickListener mActual;

        static {
            t2o.a(932184086);
        }

        public GoToRefreshListener(View.OnClickListener onClickListener) {
            this.mActual = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TBErrorViewWidget.access$700(TBErrorViewWidget.this);
            View.OnClickListener onClickListener = this.mActual;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public final class GoToReportListener implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(932184087);
        }

        private GoToReportListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String str3 = "";
            if (TBErrorViewWidget.access$500(TBErrorViewWidget.this) != null && !TextUtils.isEmpty(TBErrorViewWidget.access$500(TBErrorViewWidget.this).errorCode)) {
                str3 = TBErrorViewWidget.access$500(TBErrorViewWidget.this).errorCode;
            }
            String name = TBErrorViewWidget.this.getContext().getClass().getName();
            try {
                String charSequence = TBErrorViewWidget.access$600(TBErrorViewWidget.this).getText().toString();
                if (TBErrorViewWidget.access$500(TBErrorViewWidget.this) != null) {
                    str2 = URLEncoder.encode(TBErrorViewWidget.access$500(TBErrorViewWidget.this).toJSON(), "UTF-8");
                } else {
                    str2 = "empty";
                }
                str = String.format("https://market.m.taobao.com/app/motu/emas-mpop-tucaobar/web/index.html?seCate=BUG&cont=%1s&errCode=%2s&fromPage=%3s&error=%4s", charSequence, str3, name, str2);
            } catch (Exception unused) {
                str = String.format("https://market.m.taobao.com/app/motu/emas-mpop-tucaobar/web/index.html?seCate=BUG&cont=%1s&errCode=%2s&fromPage=%3s&error=%4s", TBErrorViewWidget.access$600(TBErrorViewWidget.this).getText().toString(), str3, name, "empty");
            }
            Nav.from(TBErrorViewWidget.this.getContext()).toUri(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public final class RefreshRestoreRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(932184088);
        }

        private RefreshRestoreRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String string = TBErrorViewWidget.this.getContext().getString(R.string.uik_error_view_widget_refresh);
            if (!TextUtils.isEmpty(TBErrorViewWidget.access$800(TBErrorViewWidget.this))) {
                string = TBErrorViewWidget.access$800(TBErrorViewWidget.this);
            }
            TBErrorViewWidget.access$900(TBErrorViewWidget.this).stop();
            TBErrorViewWidget.access$1000(TBErrorViewWidget.this).setVisibility(8);
            TBErrorViewWidget.access$1100(TBErrorViewWidget.this).setText(string);
            TBErrorViewWidget.access$1200(TBErrorViewWidget.this).setEnabled(true);
            TBErrorViewWidget.access$1302(TBErrorViewWidget.this, false);
            TBErrorViewWidget.access$1402(TBErrorViewWidget.this, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum Status {
        STATUS_NETWORK_ERROR,
        STATUS_SYSTEM_ERROR,
        STATUS_QPS_LIMIT,
        STATUS_CUSTOM;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Status status, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/TBErrorViewWidget$Status");
        }

        public static Status valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Status) ipChange.ipc$dispatch("e9caec72", new Object[]{str});
            }
            return (Status) Enum.valueOf(Status.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum UserInterfaceStyle {
        UNSPECIFIED,
        LIGHT,
        DARK;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(UserInterfaceStyle userInterfaceStyle, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/TBErrorViewWidget$UserInterfaceStyle");
        }

        public static UserInterfaceStyle valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UserInterfaceStyle) ipChange.ipc$dispatch("9acfe861", new Object[]{str});
            }
            return (UserInterfaceStyle) Enum.valueOf(UserInterfaceStyle.class, str);
        }
    }

    static {
        t2o.a(932184080);
    }

    public TBErrorViewWidget(Context context) {
        this(context, null, 0);
    }

    public static /* synthetic */ float access$000(TBErrorViewWidget tBErrorViewWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("441c30de", new Object[]{tBErrorViewWidget})).floatValue();
        }
        return tBErrorViewWidget.mCurrentAlpha;
    }

    public static /* synthetic */ float access$002(TBErrorViewWidget tBErrorViewWidget, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60d5ee04", new Object[]{tBErrorViewWidget, new Float(f)})).floatValue();
        }
        tBErrorViewWidget.mCurrentAlpha = f;
        return f;
    }

    public static /* synthetic */ ImageView access$1000(TBErrorViewWidget tBErrorViewWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("89bb4d51", new Object[]{tBErrorViewWidget});
        }
        return tBErrorViewWidget.mRefreshCircularView;
    }

    public static /* synthetic */ void access$101(TBErrorViewWidget tBErrorViewWidget, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a95cd17", new Object[]{tBErrorViewWidget, new Integer(i)});
        } else {
            super.setVisibility(i);
        }
    }

    public static /* synthetic */ TextView access$1100(TBErrorViewWidget tBErrorViewWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("6bb5fcf2", new Object[]{tBErrorViewWidget});
        }
        return tBErrorViewWidget.mRefreshTitleView;
    }

    public static /* synthetic */ LinearLayout access$1200(TBErrorViewWidget tBErrorViewWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("1ae9edb4", new Object[]{tBErrorViewWidget});
        }
        return tBErrorViewWidget.mRefreshButton;
    }

    public static /* synthetic */ boolean access$1302(TBErrorViewWidget tBErrorViewWidget, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abb3ee9e", new Object[]{tBErrorViewWidget, new Boolean(z)})).booleanValue();
        }
        tBErrorViewWidget.mIsInRefreshingState = z;
        return z;
    }

    public static /* synthetic */ RefreshRestoreRunnable access$1402(TBErrorViewWidget tBErrorViewWidget, RefreshRestoreRunnable refreshRestoreRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RefreshRestoreRunnable) ipChange.ipc$dispatch("ad88ecfd", new Object[]{tBErrorViewWidget, refreshRestoreRunnable});
        }
        tBErrorViewWidget.mRefreshRestoreRunnable = refreshRestoreRunnable;
        return refreshRestoreRunnable;
    }

    public static /* synthetic */ void access$201(TBErrorViewWidget tBErrorViewWidget, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50b6d98", new Object[]{tBErrorViewWidget, new Integer(i)});
        } else {
            super.setVisibility(i);
        }
    }

    public static /* synthetic */ Error access$500(TBErrorViewWidget tBErrorViewWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Error) ipChange.ipc$dispatch("873fa680", new Object[]{tBErrorViewWidget});
        }
        return tBErrorViewWidget.mError;
    }

    public static /* synthetic */ TextView access$600(TBErrorViewWidget tBErrorViewWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("8c78a59c", new Object[]{tBErrorViewWidget});
        }
        return tBErrorViewWidget.mTitleView;
    }

    public static /* synthetic */ void access$700(TBErrorViewWidget tBErrorViewWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e36c087", new Object[]{tBErrorViewWidget});
        } else {
            tBErrorViewWidget.updateUIForRefreshState();
        }
    }

    public static /* synthetic */ String access$800(TBErrorViewWidget tBErrorViewWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6117f17a", new Object[]{tBErrorViewWidget});
        }
        return tBErrorViewWidget.mRefreshText;
    }

    public static /* synthetic */ TBCircularProgressDrawable access$900(TBErrorViewWidget tBErrorViewWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBCircularProgressDrawable) ipChange.ipc$dispatch("f294e90b", new Object[]{tBErrorViewWidget});
        }
        return tBErrorViewWidget.mCircularDrawable;
    }

    public static int dp2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a48ebe0", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) ((context.getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    private String getRefreshText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cff0bcc7", new Object[]{this});
        }
        String string = getContext().getString(R.string.uik_error_view_widget_refresh);
        if (!TextUtils.isEmpty(this.mRefreshText)) {
            return this.mRefreshText;
        }
        return string;
    }

    @Deprecated
    public static int getSuggestedWidth(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5053ca5", new Object[]{activity})).intValue();
        }
        WindowType M = TBAutoSizeConfig.x().M(activity);
        int H = TBAutoSizeConfig.x().H(activity);
        int dp2px = H - dp2px(activity, 5.0f);
        int i = AnonymousClass4.$SwitchMap$com$taobao$android$autosize$WindowType[M.ordinal()];
        if (i == 1) {
            dp2px = 1000;
        } else if (i == 2) {
            dp2px = 1346;
        }
        if (dp2px > 0) {
            return dp2px;
        }
        return H;
    }

    private static int getSuggestedWidthCalibrated(Context context, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b55fc2b", new Object[]{context, new Integer(i)})).intValue();
        }
        WindowType L = TBAutoSizeConfig.x().L(px2dp(context, i));
        int dp2px = i - dp2px(context, 5.0f);
        if (dp2px <= 0) {
            dp2px = i;
        }
        int i3 = AnonymousClass4.$SwitchMap$com$taobao$android$autosize$WindowType[L.ordinal()];
        if (i3 == 1 || i3 == 2) {
            i2 = 1346;
        } else if (i3 != 3) {
            i2 = dp2px;
        } else {
            i2 = 1000;
        }
        if (i2 > i) {
            return dp2px;
        }
        if (i2 > 0) {
            return i2;
        }
        return dp2px;
    }

    private void initErrorViewWidget(View view) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9dec18a", new Object[]{this, view});
            return;
        }
        int visibility = getVisibility();
        this.mCurrentVisible = visibility;
        if (visibility == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.mCurrentAlpha = f;
        this.mCircularDrawable = new TBCircularProgressDrawable(-1, 3.0f, true);
        this.mErrorFilter = new DefaultErrorFilter(getContext(), getResources().getString(R.string.uik_default_rule_v2));
        this.mBackground = (RelativeLayout) view.findViewById(R.id.uik_error_widget_background);
        this.mTitleView = (TextView) view.findViewById(R.id.uik_error_widget_title);
        this.mNetworkCheckButton = (Button) view.findViewById(R.id.uik_error_widget_button_check);
        this.mFeedbackButton = (Button) view.findViewById(R.id.uik_error_widget_button_feedback);
        this.mRefreshButton = (LinearLayout) view.findViewById(R.id.uik_error_widget_button_refresh);
        this.mRefreshCircularView = (ImageView) view.findViewById(R.id.uik_error_widget_refresh_circular);
        this.mRefreshTitleView = (TextView) view.findViewById(R.id.uik_error_widget_refresh_text);
        this.mRefreshCircularView.setImageDrawable(this.mCircularDrawable);
        this.mNetworkCheckButton.setOnClickListener(new GoToNetworkDiagnosisListener());
        this.mFeedbackButton.setOnClickListener(new GoToReportListener());
        this.mRefreshButton.setOnClickListener(new GoToRefreshListener(null));
    }

    public static /* synthetic */ Object ipc$super(TBErrorViewWidget tBErrorViewWidget, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/uikit/extend/component/TBErrorViewWidget");
        }
    }

    public static int px2dp(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbe6c968", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void reportIfNotYet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcab16d", new Object[]{this});
        } else if (!this.mHasReported) {
            this.mHasReported = true;
            TBErrorView.doReport(getContext(), this.mStatus.toString(), this.mTitleView.getText().toString(), this.mTopic, this.mError, "2");
        }
    }

    private void setCustomRefreshButton(boolean z, String str, String str2, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc69e12", new Object[]{this, new Boolean(z), str, str2, onClickListener});
            return;
        }
        this.mNeedRefreshProgress = z;
        this.mRefreshText = str;
        this.mRefreshingText = str2;
        if (onClickListener != null) {
            this.mRefreshButton.setOnClickListener(new GoToRefreshListener(onClickListener));
        }
        this.mRefreshTitleView.setText(getRefreshText());
    }

    private void updateButtonsVisibility(boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        int i = 4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fae58b83", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        if (z) {
            this.mNetworkCheckButton.setVisibility(0);
        } else {
            this.mNetworkCheckButton.setVisibility(8);
        }
        if (z2) {
            this.mFeedbackButton.setVisibility(0);
        } else {
            this.mFeedbackButton.setVisibility(8);
        }
        if (z || z2 || z3) {
            z4 = false;
        }
        this.mRefreshCircularView.setVisibility(8);
        this.mRefreshTitleView.setText(getRefreshText());
        if (z3) {
            this.mRefreshButton.setVisibility(0);
            return;
        }
        LinearLayout linearLayout = this.mRefreshButton;
        if (!z4) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    private void updateErrorViewWidget() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c48739ef", new Object[]{this});
            return;
        }
        int i = AnonymousClass4.$SwitchMap$com$taobao$uikit$extend$component$TBErrorViewWidget$UserInterfaceStyle[this.mInterfaceStyle.ordinal()];
        if (i == 1) {
            this.mBackground.setBackgroundResource(R.drawable.uik_error_view_widget_dark_bg);
            this.mTitleView.setTextColor(getResources().getColor(R.color.uik_errorWidgetTitleDarkColor));
        } else if (i == 2) {
            this.mBackground.setBackgroundResource(R.drawable.uik_error_view_widget_bg);
            this.mTitleView.setTextColor(getResources().getColor(R.color.uik_errorWidgetTitleColor));
        }
        Status status = this.mStatus;
        if (status == Status.STATUS_CUSTOM) {
            String string = getContext().getString(R.string.uik_default_error_title_v2);
            if (!TextUtils.isEmpty(this.mCustomTitle)) {
                string = this.mCustomTitle;
            }
            this.mTitleView.setText(string);
            int i2 = this.mBitEnableButtons;
            if (i2 == 7) {
                updateButtonsVisibility(true, false, true);
            } else if (i2 == 0) {
                updateButtonsVisibility(false, false, false);
            } else {
                if ((i2 & 1) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((2 & i2) > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i2 & 4) > 0) {
                    z3 = true;
                }
                updateButtonsVisibility(z, z2, z3);
            }
        } else if (status == Status.STATUS_SYSTEM_ERROR) {
            this.mTitleView.setText(getContext().getString(R.string.uik_default_error_title_v2));
            updateButtonsVisibility(false, true, true);
        } else if (status == Status.STATUS_NETWORK_ERROR) {
            this.mTitleView.setText(getContext().getString(R.string.uik_network_error_title_v2));
            updateButtonsVisibility(true, false, true);
        } else {
            this.mTitleView.setText(getContext().getString(R.string.uik_default_error_widget_title_qps));
            updateButtonsVisibility(false, false, true);
        }
    }

    private void updateInternalStatus(Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f753d034", new Object[]{this, status});
        } else if (!NetUtil.isNetworkConnected(getContext())) {
            this.mStatus = Status.STATUS_NETWORK_ERROR;
        } else {
            this.mStatus = status;
            Error error = this.mError;
            if (error != null && error.errorCode != null) {
                int filterIcon = this.mErrorFilter.filterIcon(error);
                if (filterIcon == R.drawable.uik_error_icon_v2) {
                    this.mStatus = Status.STATUS_NETWORK_ERROR;
                } else if (filterIcon == R.drawable.uik_limit_error_icon_v2) {
                    this.mStatus = Status.STATUS_QPS_LIMIT;
                } else if (filterIcon == R.drawable.uik_sys_error_icon_v2) {
                    this.mStatus = Status.STATUS_SYSTEM_ERROR;
                }
            }
        }
    }

    private void updateUIForRefreshState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef40689", new Object[]{this});
        } else if (this.mNeedRefreshProgress) {
            String string = getContext().getString(R.string.uik_error_view_widget_refreshing);
            if (!TextUtils.isEmpty(this.mRefreshingText)) {
                string = this.mRefreshingText;
            }
            this.mRefreshCircularView.setVisibility(0);
            this.mRefreshTitleView.setText(string);
            this.mRefreshButton.setEnabled(false);
            this.mIsInRefreshingState = true;
            RefreshRestoreRunnable refreshRestoreRunnable = new RefreshRestoreRunnable();
            this.mRefreshRestoreRunnable = refreshRestoreRunnable;
            int i = this.mLoadingIntervalMillis;
            if (i > 0) {
                postDelayed(refreshRestoreRunnable, i);
            }
            this.mCircularDrawable.start();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        if (this.mAdaptiveWidth) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(getSuggestedWidthCalibrated(getContext(), getMeasuredWidth()), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }

    public void setAdaptiveWidth(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc29b83f", new Object[]{this, new Boolean(z)});
        } else {
            this.mAdaptiveWidth = z;
        }
    }

    public void setCustomEnableButtons(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc129d71", new Object[]{this, new Integer(i)});
            return;
        }
        this.mBitEnableButtons = i & 7;
        updateInternalStatus(this.mStatus);
        updateErrorViewWidget();
    }

    public void setCustomTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4faa076", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.mCustomTitle = str;
            updateInternalStatus(this.mStatus);
            updateErrorViewWidget();
        }
    }

    public void setDefaultLoadingInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe7dbfa", new Object[]{this, new Integer(i)});
        } else {
            this.mLoadingIntervalMillis = i;
        }
    }

    public void setError(Error error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4369955a", new Object[]{this, error});
        } else if (error != null) {
            this.mError = error;
            updateInternalStatus(this.mStatus);
            updateErrorViewWidget();
            reportIfNotYet();
        }
    }

    public void setRefreshButton(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40036347", new Object[]{this, onClickListener});
        } else {
            setRefreshButtonWithProgress(null, null, onClickListener);
        }
    }

    public void setRefreshButtonWithProgress(String str, String str2, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d66420", new Object[]{this, str, str2, onClickListener});
        } else {
            setCustomRefreshButton(true, str, str2, onClickListener);
        }
    }

    public void setRefreshButtonWithoutProgress(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5dfc45e", new Object[]{this, str, onClickListener});
        } else {
            setCustomRefreshButton(false, str, null, onClickListener);
        }
    }

    public void setStatus(Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87dee4f0", new Object[]{this, status});
        } else if (status != null) {
            updateInternalStatus(status);
            updateErrorViewWidget();
        }
    }

    public void setTopic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.mTopic = str;
        }
    }

    public void setUserInterfaceStyle(UserInterfaceStyle userInterfaceStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("904a27d0", new Object[]{this, userInterfaceStyle});
            return;
        }
        this.mInterfaceStyle = userInterfaceStyle;
        updateInternalStatus(this.mStatus);
        updateErrorViewWidget();
    }

    @Override // android.view.View
    public void setVisibility(final int i) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.mCurrentVisible;
        if (i != i2) {
            if (i2 == 0) {
                stopLoadingIfNeed();
                ValueAnimator valueAnimator = this.mFadeIn;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.mFadeIn = null;
                }
                this.mFadeOut = ValueAnimator.ofFloat(this.mCurrentAlpha, 0.0f);
                this.mFadeOut.setDuration(Math.round(this.mCurrentAlpha * 300.0f));
                this.mFadeOut.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.uikit.extend.component.TBErrorViewWidget.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                            return;
                        }
                        TBErrorViewWidget.access$002(TBErrorViewWidget.this, ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                        TBErrorViewWidget tBErrorViewWidget = TBErrorViewWidget.this;
                        tBErrorViewWidget.setAlpha(TBErrorViewWidget.access$000(tBErrorViewWidget));
                    }
                });
                this.mFadeOut.addListener(new Animator.AnimatorListener() { // from class: com.taobao.uikit.extend.component.TBErrorViewWidget.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        } else {
                            TBErrorViewWidget.access$101(TBErrorViewWidget.this, i);
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                        }
                    }
                });
                this.mCurrentVisible = i;
                this.mFadeOut.start();
            } else if (i == 0) {
                ValueAnimator valueAnimator2 = this.mFadeOut;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.mFadeOut = null;
                }
                setAlpha(this.mCurrentAlpha);
                access$201(this, i);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.mCurrentAlpha, 1.0f);
                this.mFadeIn = ofFloat;
                float f = (1.0f - this.mCurrentAlpha) * 300.0f;
                if (f < 0.0f) {
                    j = 0;
                } else {
                    j = Math.round(f);
                }
                ofFloat.setDuration(j);
                this.mFadeIn.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.uikit.extend.component.TBErrorViewWidget.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator3});
                            return;
                        }
                        TBErrorViewWidget.access$002(TBErrorViewWidget.this, ((Float) valueAnimator3.getAnimatedValue()).floatValue());
                        TBErrorViewWidget tBErrorViewWidget = TBErrorViewWidget.this;
                        tBErrorViewWidget.setAlpha(TBErrorViewWidget.access$000(tBErrorViewWidget));
                    }
                });
                this.mCurrentVisible = i;
                this.mFadeIn.start();
                reportIfNotYet();
            } else {
                this.mCurrentVisible = i;
                super.setVisibility(i);
            }
        }
    }

    public void stopLoadingIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdf34d4", new Object[]{this});
        } else if (this.mIsInRefreshingState) {
            RefreshRestoreRunnable refreshRestoreRunnable = this.mRefreshRestoreRunnable;
            if (refreshRestoreRunnable != null) {
                removeCallbacks(refreshRestoreRunnable);
                this.mRefreshRestoreRunnable.run();
                return;
            }
            this.mIsInRefreshingState = false;
        }
    }

    public TBErrorViewWidget(Context context, int i) {
        super(context, null, 0);
        this.mBitEnableButtons = 6;
        this.mCustomTitle = null;
        this.mNeedRefreshProgress = true;
        this.mRefreshText = null;
        this.mRefreshingText = null;
        this.mAdaptiveWidth = false;
        this.mLoadingIntervalMillis = 2000;
        this.mInterfaceStyle = UserInterfaceStyle.UNSPECIFIED;
        this.mHasReported = false;
        this.mError = null;
        this.mTopic = null;
        this.mErrorFilter = null;
        this.mStatus = Status.STATUS_SYSTEM_ERROR;
        this.mIsInRefreshingState = false;
        this.mRefreshRestoreRunnable = null;
        super.setVisibility(i);
        initErrorViewWidget(LayoutInflater.from(getContext()).inflate(R.layout.uik_error_view_widget, (ViewGroup) this, true));
    }

    public TBErrorViewWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TBErrorViewWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.mBitEnableButtons = 6;
        this.mCustomTitle = null;
        this.mNeedRefreshProgress = true;
        this.mRefreshText = null;
        this.mRefreshingText = null;
        this.mAdaptiveWidth = false;
        this.mLoadingIntervalMillis = 2000;
        this.mInterfaceStyle = UserInterfaceStyle.UNSPECIFIED;
        this.mHasReported = false;
        this.mError = null;
        this.mTopic = null;
        this.mErrorFilter = null;
        this.mStatus = Status.STATUS_SYSTEM_ERROR;
        this.mIsInRefreshingState = false;
        this.mRefreshRestoreRunnable = null;
        if (!(attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TBErrorViewWidget, i, 0)) == null)) {
            String string = obtainStyledAttributes.getString(R.styleable.TBErrorViewWidget_uik_errorInterfaceStyle);
            obtainStyledAttributes.recycle();
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.mInterfaceStyle = UserInterfaceStyle.valueOf(string.toUpperCase());
                } catch (Exception unused) {
                }
            }
        }
        initErrorViewWidget(LayoutInflater.from(getContext()).inflate(R.layout.uik_error_view_widget, (ViewGroup) this, true));
    }
}
