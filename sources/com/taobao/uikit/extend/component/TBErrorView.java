package com.taobao.uikit.extend.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.LocalizationManager;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoExceptionReporter;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.nav.Nav;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.error.AbsErrorFilter;
import com.taobao.uikit.extend.component.error.DefaultErrorFilter;
import com.taobao.uikit.extend.component.error.Error;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.extend.utils.NetUtil;
import java.net.URLEncoder;
import org.json.JSONObject;
import tb.c21;
import tb.chb;
import tb.hij;
import tb.jk;
import tb.t2o;
import tb.tz8;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBErrorView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE_NAME = "TBErrorView";
    private static final String MONITOR_POINT = "show_error";
    private boolean hasReported;
    private boolean isInRefreshingState;
    private TUrlImageView mBackgroundView;
    private LinearLayout mCenterLayout;
    private TUrlImageView mCustomIconView;
    private Error mError;
    private AbsErrorFilter mErrorFilter;
    private TextView mErrorInfoTextView;
    private TextView mErrorWaterMarkTextView;
    private Button mFeedbackButton;
    private int mIconRes;
    private String mIconString;
    private TUrlImageView mIconView;
    private UserInterfaceStyle mInterfaceStyle;
    private boolean mIsNotShowNetworkDiagnosisView;
    private Button mNetworkDiagnosisButton;
    private Button mRefreshButton;
    private Status mStatus;
    private String mSubTitle;
    private TextView mSubTitleView;
    private String mTitle;
    private TextView mTitleView;
    private String mTopic;
    private RefreshRestoreRunnable refreshRestoreRunnable;
    private static boolean isMonitorRegistered = false;
    private static boolean isNetworkDiagnosisEnable = false;
    private static final String[] DEFAULT_DIMENSION_SET = {"pageName", "url", "title", "subtitle", "code", jk.KEY_MAPPING_CODE, TBImageFlowMonitor.RESPONSE_CODE_MEASURE, "apiName", "topic", "errorPageType", "message", "reqFalcoId"};
    private static final String[] DEFAULT_MEASURE_SET = {"value"};

    /* compiled from: Taobao */
    /* renamed from: com.taobao.uikit.extend.component.TBErrorView$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$TBErrorView$ButtonType;
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$TBErrorView$UserInterfaceStyle;

        static {
            int[] iArr = new int[ButtonType.values().length];
            $SwitchMap$com$taobao$uikit$extend$component$TBErrorView$ButtonType = iArr;
            try {
                iArr[ButtonType.BUTTON_REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$TBErrorView$ButtonType[ButtonType.BUTTON_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$TBErrorView$ButtonType[ButtonType.BUTTON_POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$TBErrorView$ButtonType[ButtonType.BUTTON_FEEDBACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$TBErrorView$ButtonType[ButtonType.BUTTON_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$TBErrorView$ButtonType[ButtonType.BUTTON_NAGTIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[UserInterfaceStyle.values().length];
            $SwitchMap$com$taobao$uikit$extend$component$TBErrorView$UserInterfaceStyle = iArr2;
            try {
                iArr2[UserInterfaceStyle.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$TBErrorView$UserInterfaceStyle[UserInterfaceStyle.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$TBErrorView$UserInterfaceStyle[UserInterfaceStyle.UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum ButtonType {
        BUTTON_FEEDBACK,
        BUTTON_REFRESH,
        BUTTON_LEFT,
        BUTTON_RIGHT,
        BUTTON_POSITIVE,
        BUTTON_NAGTIVE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ButtonType buttonType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/TBErrorView$ButtonType");
        }

        public static ButtonType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ButtonType) ipChange.ipc$dispatch("1fca8bf4", new Object[]{str});
            }
            return (ButtonType) Enum.valueOf(ButtonType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class GoToNetworkDiagnosisListener implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String URI = "http://m.taobao.com/go/networkDiagnosis?nav_jump_mode=std_mega_pop&diagnosis_page_mode=half";
        private final String mUri;

        static {
            t2o.a(932184075);
        }

        public GoToNetworkDiagnosisListener() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(hij.KEY_CORNER_RADIUS, String.valueOf(8.0f));
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
                Nav.from(TBErrorView.this.getContext()).toUri(this.mUri);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class GoToReportListener implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(932184076);
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
            if (TBErrorView.access$200(TBErrorView.this) != null && !TextUtils.isEmpty(TBErrorView.access$200(TBErrorView.this).errorCode)) {
                str3 = TBErrorView.access$200(TBErrorView.this).errorCode;
            }
            String name = TBErrorView.this.getContext().getClass().getName();
            try {
                String str4 = TBErrorView.access$300(TBErrorView.this) + "," + TBErrorView.access$400(TBErrorView.this);
                if (TBErrorView.access$200(TBErrorView.this) != null) {
                    str2 = URLEncoder.encode(TBErrorView.access$200(TBErrorView.this).toJSON(), "UTF-8");
                } else {
                    str2 = "empty";
                }
                str = String.format("https://market.m.taobao.com/app/motu/emas-mpop-tucaobar/web/index.html?seCate=BUG&cont=%1s&errCode=%2s&fromPage=%3s&error=%4s", str4, str3, name, str2);
            } catch (Exception unused) {
                str = String.format("https://market.m.taobao.com/app/motu/emas-mpop-tucaobar/web/index.html?seCate=BUG&cont=%1s&errCode=%2s&fromPage=%3s&error=%4s", TBErrorView.access$300(TBErrorView.this) + "," + TBErrorView.access$400(TBErrorView.this), str3, name, "empty");
            }
            Nav.from(TBErrorView.this.getContext()).toUri(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public final class RefreshRestoreRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final CharSequence originSubtitle;
        private final CharSequence originTitle;

        static {
            t2o.a(932184077);
        }

        public RefreshRestoreRunnable(CharSequence charSequence, CharSequence charSequence2) {
            this.originTitle = charSequence;
            this.originSubtitle = charSequence2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TBErrorView.access$500(TBErrorView.this).setText(this.originTitle);
            TBErrorView.access$600(TBErrorView.this).setText(this.originSubtitle);
            if (TBErrorView.access$700(TBErrorView.this).getVisibility() == 0) {
                TBErrorView.access$700(TBErrorView.this).setAlpha(1.0f);
                TBErrorView.access$700(TBErrorView.this).setEnabled(true);
            }
            if (TBErrorView.access$800(TBErrorView.this).getVisibility() == 0) {
                TBErrorView.access$800(TBErrorView.this).setAlpha(1.0f);
                TBErrorView.access$800(TBErrorView.this).setEnabled(true);
            }
            if (TBErrorView.access$900(TBErrorView.this).getVisibility() == 0) {
                TBErrorView.access$900(TBErrorView.this).setAlpha(1.0f);
                TBErrorView.access$800(TBErrorView.this).setEnabled(true);
            }
            TBErrorView.access$1002(TBErrorView.this, false);
            TBErrorView.access$1102(TBErrorView.this, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum Status {
        STATUS_ERROR,
        STATUS_EMPTY;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Status status, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/TBErrorView$Status");
        }

        public static Status valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Status) ipChange.ipc$dispatch("fdf474ce", new Object[]{str});
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/TBErrorView$UserInterfaceStyle");
        }

        public static UserInterfaceStyle valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UserInterfaceStyle) ipChange.ipc$dispatch("c03c6bd", new Object[]{str});
            }
            return (UserInterfaceStyle) Enum.valueOf(UserInterfaceStyle.class, str);
        }
    }

    public TBErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.mIconRes = -1;
        this.mInterfaceStyle = UserInterfaceStyle.UNSPECIFIED;
        this.mStatus = Status.STATUS_ERROR;
        this.hasReported = false;
        this.isInRefreshingState = false;
        this.refreshRestoreRunnable = null;
        LocalizationManager.h(context);
        if (!(attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TBErrorView, i, 0)) == null)) {
            this.mIconString = obtainStyledAttributes.getString(R.styleable.TBErrorView_uik_errorIcon);
            this.mTitle = obtainStyledAttributes.getString(R.styleable.TBErrorView_uik_errorTitle);
            this.mSubTitle = obtainStyledAttributes.getString(R.styleable.TBErrorView_uik_errorSubTitle);
            obtainStyledAttributes.recycle();
        }
        int i2 = R.layout.uik_error_new;
        this.mErrorFilter = new DefaultErrorFilter(getContext(), getResources().getString(R.string.uik_default_rule_v2));
        initErrorView(LayoutInflater.from(getContext()).inflate(i2, (ViewGroup) this, true));
    }

    public static /* synthetic */ void access$100(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f12cff1", new Object[]{tBErrorView});
        } else {
            tBErrorView.updateUIForRefreshState();
        }
    }

    public static /* synthetic */ boolean access$1002(TBErrorView tBErrorView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("135321f7", new Object[]{tBErrorView, new Boolean(z)})).booleanValue();
        }
        tBErrorView.isInRefreshingState = z;
        return z;
    }

    public static /* synthetic */ RefreshRestoreRunnable access$1102(TBErrorView tBErrorView, RefreshRestoreRunnable refreshRestoreRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RefreshRestoreRunnable) ipChange.ipc$dispatch("a7d575d6", new Object[]{tBErrorView, refreshRestoreRunnable});
        }
        tBErrorView.refreshRestoreRunnable = refreshRestoreRunnable;
        return refreshRestoreRunnable;
    }

    public static /* synthetic */ Error access$200(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Error) ipChange.ipc$dispatch("f7538707", new Object[]{tBErrorView});
        }
        return tBErrorView.mError;
    }

    public static /* synthetic */ String access$300(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39ec4b51", new Object[]{tBErrorView});
        }
        return tBErrorView.mTitle;
    }

    public static /* synthetic */ String access$400(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d17fe92", new Object[]{tBErrorView});
        }
        return tBErrorView.mSubTitle;
    }

    public static /* synthetic */ TextView access$500(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("25dc3be1", new Object[]{tBErrorView});
        }
        return tBErrorView.mTitleView;
    }

    public static /* synthetic */ TextView access$600(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("3edd8d80", new Object[]{tBErrorView});
        }
        return tBErrorView.mSubTitleView;
    }

    public static /* synthetic */ Button access$700(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("efa412df", new Object[]{tBErrorView});
        }
        return tBErrorView.mNetworkDiagnosisButton;
    }

    public static /* synthetic */ Button access$800(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("31bb403e", new Object[]{tBErrorView});
        }
        return tBErrorView.mFeedbackButton;
    }

    public static /* synthetic */ Button access$900(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("73d26d9d", new Object[]{tBErrorView});
        }
        return tBErrorView.mRefreshButton;
    }

    public static void doReport(String str, String str2, String str3, Error error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72bd90c3", new Object[]{str, str2, str3, error});
        } else {
            doReport(str, str2, str3, (String) null, error, (String) null);
        }
    }

    private void filterIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ee1418", new Object[]{this});
        } else if (!NetUtil.isNetworkConnected(getContext())) {
            this.mIconRes = getErrorIcon();
        } else {
            Status status = this.mStatus;
            if (status != Status.STATUS_EMPTY || this.mIconRes >= 0) {
                Error error = this.mError;
                if (error != null && status == Status.STATUS_ERROR) {
                    this.mIconRes = this.mErrorFilter.filterIcon(error);
                    return;
                }
                return;
            }
            this.mIconRes = getDefaultIconRes();
        }
    }

    private void filterSubTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e9d017", new Object[]{this});
        } else if (!NetUtil.isNetworkConnected(getContext())) {
            this.mSubTitle = getContext().getString(getNetworkErrorSubTitle());
        } else if (this.mStatus != Status.STATUS_EMPTY || !TextUtils.isEmpty(this.mSubTitle)) {
            Error error = this.mError;
            if (error != null && this.mStatus == Status.STATUS_ERROR) {
                this.mSubTitle = this.mErrorFilter.filterSubTitle(error, this.mSubTitle);
            }
        } else {
            this.mSubTitle = getContext().getString(R.string.uik_default_empty_subtitle);
        }
    }

    private void filterTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b7647", new Object[]{this});
        } else if (!NetUtil.isNetworkConnected(getContext())) {
            this.mTitle = getContext().getString(getNetworkErrorTitle());
        } else if (this.mStatus != Status.STATUS_EMPTY || !TextUtils.isEmpty(this.mTitle)) {
            Error error = this.mError;
            if (error != null && this.mStatus == Status.STATUS_ERROR) {
                this.mTitle = this.mErrorFilter.filterTitle(error, this.mTitle);
            }
        } else {
            this.mTitle = getContext().getString(R.string.uik_default_empty_title);
        }
    }

    private int getDefaultErrorSubTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59aea3cf", new Object[]{this})).intValue();
        }
        return R.string.uik_default_error_subtitle_v2;
    }

    private int getDefaultErrorTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a33c095", new Object[]{this})).intValue();
        }
        return R.string.uik_default_error_title_v2;
    }

    private int getDefaultIconRes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("704f6f56", new Object[]{this})).intValue();
        }
        return R.drawable.uik_sys_error_icon_v2;
    }

    private int getErrorIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c2246e5", new Object[]{this})).intValue();
        }
        return R.drawable.uik_error_icon_v2;
    }

    private int getNetworkErrorSubTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d45d782", new Object[]{this})).intValue();
        }
        return R.string.uik_network_error_subtitle_v2;
    }

    private int getNetworkErrorTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38c161c2", new Object[]{this})).intValue();
        }
        return R.string.uik_network_error_title_v2;
    }

    private void initErrorView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b296ae", new Object[]{this, view});
            return;
        }
        this.mIconView = (TUrlImageView) view.findViewById(R.id.uik_error_icon);
        this.mTitleView = (TextView) view.findViewById(R.id.uik_error_title);
        this.mSubTitleView = (TextView) view.findViewById(R.id.uik_error_subTitle);
        this.mRefreshButton = (Button) findViewById(R.id.uik_errorButtonPos);
        this.mFeedbackButton = (Button) findViewById(R.id.uik_errorButtonNag);
        this.mErrorInfoTextView = (TextView) findViewById(R.id.uik_mapping_code);
        this.mErrorWaterMarkTextView = (TextView) findViewById(R.id.uik_water_mark);
        this.mFeedbackButton.setOnClickListener(new GoToReportListener());
        Button button = (Button) findViewById(R.id.uik_network_diagnosis);
        this.mNetworkDiagnosisButton = button;
        button.setOnClickListener(new GoToNetworkDiagnosisListener());
        this.mBackgroundView = (TUrlImageView) findViewById(R.id.uik_error_bg);
        this.mCustomIconView = (TUrlImageView) findViewById(R.id.uik_error_icon_custom);
        this.mCenterLayout = (LinearLayout) findViewById(R.id.layout_center);
        if (TBDeviceUtils.p(getContext()) || TBDeviceUtils.P(getContext())) {
            ViewGroup.LayoutParams layoutParams = this.mCenterLayout.getLayoutParams();
            layoutParams.width = dipToPx(375.0f);
            layoutParams.height = -2;
            this.mCenterLayout.setLayoutParams(layoutParams);
        }
    }

    public static /* synthetic */ Object ipc$super(TBErrorView tBErrorView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/uikit/extend/component/TBErrorView");
        }
    }

    private void report() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730c1fbb", new Object[]{this});
            return;
        }
        doReport(getContext(), this.mTitle, this.mSubTitle, this.mTopic, this.mError, "1");
        this.hasReported = true;
    }

    public static void setNetworkDiagnosisEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabd2965", new Object[]{new Boolean(z)});
        } else {
            isNetworkDiagnosisEnable = z;
        }
    }

    private void throwIllegal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7ac237", new Object[]{this});
        }
    }

    private void updateUIForRefreshState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef40689", new Object[]{this});
            return;
        }
        CharSequence text = this.mTitleView.getText();
        CharSequence text2 = this.mSubTitleView.getText();
        this.mTitleView.setText(Localization.q(R.string.uik_error_view_refreshing_title));
        if (this.mNetworkDiagnosisButton.getVisibility() == 0) {
            this.mNetworkDiagnosisButton.setAlpha(0.3f);
            this.mNetworkDiagnosisButton.setEnabled(false);
        } else {
            this.mSubTitleView.setText(Localization.q(R.string.uik_error_view_refreshing_subtitle));
        }
        if (this.mFeedbackButton.getVisibility() == 0) {
            this.mFeedbackButton.setAlpha(0.3f);
            this.mFeedbackButton.setEnabled(false);
        }
        if (this.mRefreshButton.getVisibility() == 0) {
            this.mRefreshButton.setAlpha(0.3f);
            this.mFeedbackButton.setEnabled(false);
        }
        this.isInRefreshingState = true;
        RefreshRestoreRunnable refreshRestoreRunnable = new RefreshRestoreRunnable(text, text2);
        this.refreshRestoreRunnable = refreshRestoreRunnable;
        postDelayed(refreshRestoreRunnable, 2000L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.mStatus == Status.STATUS_ERROR && this.mError == null) {
            throwIllegal();
        }
    }

    public void setButtonVisibility(ButtonType buttonType, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297c95f", new Object[]{this, buttonType, new Integer(i)});
            return;
        }
        switch (AnonymousClass2.$SwitchMap$com$taobao$uikit$extend$component$TBErrorView$ButtonType[buttonType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                Button button = this.mRefreshButton;
                if (button != null) {
                    button.setVisibility(i);
                    return;
                }
                return;
            case 4:
            case 5:
            case 6:
                if (this.mFeedbackButton == null) {
                    return;
                }
                if (i != 0 || this.mNetworkDiagnosisButton.getVisibility() != 0) {
                    this.mFeedbackButton.setVisibility(i);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void setError(Error error) {
        Button button;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4369955a", new Object[]{this, error});
        } else if (error != null) {
            this.mError = error;
            filterIcon();
            filterTitle();
            filterSubTitle();
            updateErrorView();
            if (!NetUtil.isNetworkConnected(getContext()) && (button = this.mFeedbackButton) != null) {
                button.setVisibility(8);
            }
            if (!this.hasReported) {
                try {
                    report();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            try {
                TLog.loge(MODULE_NAME, "EVSHOW", this.mError.errorMsg + " -> " + getContext().getClass().getCanonicalName());
            } catch (Throwable unused) {
            }
        }
    }

    @Deprecated
    public void setIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c95a84c", new Object[]{this, str});
        }
    }

    public void setIconUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6a8705", new Object[]{this, str});
            return;
        }
        this.mIconString = str;
        this.mIconRes = -1;
        filterIcon();
        updateErrorView();
    }

    @Deprecated
    public void setIconfont(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c0aad2", new Object[]{this, new Integer(i)});
        }
    }

    public void setNotShowNetworkDiagnosisView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa0dc77", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsNotShowNetworkDiagnosisView = z;
        }
    }

    public void setStatus(Status status) {
        Button button;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f9f0c", new Object[]{this, status});
        } else if (status != null) {
            this.mStatus = status;
            if (status == Status.STATUS_EMPTY) {
                if (this.mIconRes < 0) {
                    this.mIconRes = getDefaultIconRes();
                }
                if (this.mSubTitle == null) {
                    this.mSubTitle = getContext().getString(R.string.uik_default_empty_subtitle);
                }
                if (this.mTitle == null) {
                    this.mTitle = getContext().getString(R.string.uik_default_empty_title);
                }
            }
            filterIcon();
            filterTitle();
            filterSubTitle();
            updateErrorView();
            if (!NetUtil.isNetworkConnected(getContext()) && (button = this.mFeedbackButton) != null) {
                button.setVisibility(8);
            }
        }
    }

    public void setSubTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a280e3a5", new Object[]{this, charSequence});
        } else if (charSequence != null) {
            this.mSubTitle = charSequence.toString();
            filterSubTitle();
            updateErrorView();
        }
    }

    public void setTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70050a41", new Object[]{this, charSequence});
        } else if (charSequence != null) {
            this.mTitle = charSequence.toString();
            filterTitle();
            updateErrorView();
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
            ipChange.ipc$dispatch("d44ad0ac", new Object[]{this, userInterfaceStyle});
            return;
        }
        this.mInterfaceStyle = userInterfaceStyle;
        updateErrorView();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        RefreshRestoreRunnable refreshRestoreRunnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        if (!(i == 0 || !this.isInRefreshingState || (refreshRestoreRunnable = this.refreshRestoreRunnable) == null)) {
            removeCallbacks(refreshRestoreRunnable);
            this.refreshRestoreRunnable.run();
        }
        super.setVisibility(i);
        if (i == 0 && !this.hasReported) {
            try {
                report();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private int dipToPx(float f) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbbdcbbe", new Object[]{this, new Float(f)})).intValue();
        }
        float f2 = getContext().getResources().getDisplayMetrics().density * f;
        if (f < 0.0f) {
            i = -1;
        }
        return (int) (f2 + (i * 0.5f));
    }

    public static void doReport(Context context, String str, String str2, String str3, Error error, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3dd711", new Object[]{context, str, str2, str3, error, str4});
            return;
        }
        String name = context != null ? context.getClass().getName() : "null";
        chb g = c21.g();
        if (g != null) {
            String string = g.getString("currActivityName", null);
            String string2 = g.getString("currFragmentName", null);
            if (string != null) {
                name = string;
            }
            if (string2 != null) {
                name = name + "_" + string2;
            }
        }
        doReport(str, str2, name, str3, error, str4);
    }

    public void setIcon(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b5841", new Object[]{this, new Integer(i)});
            return;
        }
        this.mIconRes = i;
        this.mIconString = null;
        filterIcon();
        updateErrorView();
    }

    @Deprecated
    public void setIconfont(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be8fa9db", new Object[]{this, str});
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:8|(2:10|(22:12|13|14|28|(1:30)|31|(2:33|(1:43)(2:39|(1:41)(1:42)))|44|(2:46|(1:48)(1:49))|50|(2:52|(1:54)(2:55|(1:60)(1:59)))|61|(2:63|(1:65))(1:66)|67|(2:81|(1:83))(2:71|(3:76|(1:78)(1:79)|80)(1:75))|105|84|(1:86)|88|(2:98|(2:100|(1:102)))|103|104)(1:15))(1:17)|16|28|(0)|31|(0)|44|(0)|50|(0)|61|(0)(0)|67|(1:69)|81|(0)|105|84|(0)|88|(5:90|92|94|98|(0))|103|104) */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026f A[Catch: all -> 0x0285, TRY_LEAVE, TryCatch #0 {all -> 0x0285, blocks: (B:84:0x0265, B:86:0x026f), top: B:105:0x0265 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateErrorView() {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.extend.component.TBErrorView.updateErrorView():void");
    }

    static {
        t2o.a(932184071);
    }

    public void setButton(ButtonType buttonType, CharSequence charSequence, final View.OnClickListener onClickListener) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe261e63", new Object[]{this, buttonType, charSequence, onClickListener});
            return;
        }
        int i2 = AnonymousClass2.$SwitchMap$com$taobao$uikit$extend$component$TBErrorView$ButtonType[buttonType.ordinal()];
        Button button = (i2 == 1 || i2 == 2 || i2 == 3) ? this.mRefreshButton : null;
        if (button != null) {
            button.setText(charSequence);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.uikit.extend.component.TBErrorView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    TBErrorView.access$100(TBErrorView.this);
                    onClickListener.onClick(view);
                }
            });
            if (onClickListener == null) {
                i = 8;
            }
            button.setVisibility(i);
        }
    }

    public static void doReport(String str, String str2, String str3, String str4, Error error, String str5) {
        String str6;
        String str7;
        String str8;
        String str9;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c17e843", new Object[]{str, str2, str3, str4, error, str5});
            return;
        }
        String str10 = TextUtils.isEmpty(str3) ? "null" : str3;
        String str11 = (error == null || TextUtils.isEmpty(error.url)) ? "null" : error.url;
        String str12 = TextUtils.isEmpty(str) ? "null" : str;
        String str13 = TextUtils.isEmpty(str2) ? "null" : str2;
        String str14 = (error == null || TextUtils.isEmpty(error.apiName)) ? "null" : error.apiName;
        String str15 = (error == null || TextUtils.isEmpty(error.errorCode)) ? "null" : error.errorCode;
        String str16 = (error == null || TextUtils.isEmpty(error.mappingCode)) ? "null" : error.mappingCode;
        if (error != null) {
            str6 = String.valueOf(error.responseCode);
        } else {
            str6 = "0";
        }
        String str17 = (error == null || TextUtils.isEmpty(error.errorMsg)) ? "null" : error.errorMsg;
        String str18 = (error == null || TextUtils.isEmpty(error.reqFalcoId)) ? "null" : error.reqFalcoId;
        if (!isMonitorRegistered) {
            isMonitorRegistered = true;
            DimensionSet create = DimensionSet.create();
            String[] strArr = DEFAULT_DIMENSION_SET;
            str8 = "null";
            int i = 0;
            for (int length = strArr.length; i < length; length = length) {
                create.addDimension(strArr[i]);
                i++;
            }
            MeasureSet create2 = MeasureSet.create();
            String[] strArr2 = DEFAULT_MEASURE_SET;
            str7 = str18;
            int i2 = 0;
            for (int length2 = strArr2.length; i2 < length2; length2 = length2) {
                create2.addMeasure(strArr2[i2]);
                i2++;
            }
            AppMonitor.register(MODULE_NAME, MONITOR_POINT, create2, create);
        } else {
            str8 = "null";
            str7 = str18;
        }
        DimensionValueSet create3 = DimensionValueSet.create();
        create3.setValue("pageName", str10);
        create3.setValue("pageURL", str11);
        create3.setValue("title", str12);
        create3.setValue("subtitle", str13);
        create3.setValue("code", str15);
        create3.setValue(jk.KEY_MAPPING_CODE, str16);
        create3.setValue(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, str6);
        create3.setValue("apiName", str14);
        create3.setValue("topic", TextUtils.isEmpty(str4) ? str8 : str4);
        create3.setValue("errorPageType", TextUtils.isEmpty(str5) ? str8 : str5);
        create3.setValue("message", str17);
        create3.setValue("reqFalcoId", str7);
        MeasureValueSet create4 = MeasureValueSet.create();
        create4.setValue("value", vu3.b.GEO_NOT_SUPPORT);
        AppMonitor.Stat.commit(MODULE_NAME, MONITOR_POINT, create3, create4);
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var != null) {
            String str19 = (error == null || (str9 = error.errorMsg) == null) ? str8 : str9;
            tz8Var.d("ErrorView", "ShowErrorView").d().A("show errorview:pageName=" + str10 + ",pageURL=" + str11 + ",content=" + str12 + "_" + str13 + ",errorCode=" + str15 + ",errorMsg=" + str19 + ",mappingCode=" + str16 + ",responseCode=" + str6 + ",apiName=" + str14 + ",reqFalcoId=" + str7);
            FalcoExceptionReporter b = tz8Var.b();
            if (b != null) {
                b.b(str15).d(str19).e(str11).c(1).a();
            }
        }
    }

    public TBErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TBErrorView(Context context) {
        this(context, null, 0);
    }
}
