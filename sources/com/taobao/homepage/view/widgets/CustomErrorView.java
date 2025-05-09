package com.taobao.homepage.view.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.error.AbsErrorFilter;
import com.taobao.uikit.extend.component.error.DefaultErrorFilter;
import com.taobao.uikit.extend.component.error.Error;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.extend.utils.NetUtil;
import java.net.URLEncoder;
import tb.jk;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class CustomErrorView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE_NAME = "TBErrorView";
    private static final String MONITOR_POINT = "show_error";
    private boolean hasReported;
    private Error mError;
    private AbsErrorFilter mErrorFilter;
    private TextView mErrorInfoTextView;
    private int mIconRes;
    private String mIconString;
    private TUrlImageView mIconView;
    private boolean mIsNotShowNetworkDiagnosisView;
    private Button mLeftButton;
    private TextView mNetworkDiagnosisTextView;
    private Button mRightButton;
    private Status mStatus;
    private String mSubTitle;
    private TextView mSubTitleView;
    private String mTitle;
    private TextView mTitleView;
    private static boolean isMonitorRegistered = false;
    private static boolean isNetworkDiagnosisEnable = false;
    private static final String[] DEFAULT_DIMENSION_SET = {"pageName", "url", "title", "subtitle", "code", jk.KEY_MAPPING_CODE, TBImageFlowMonitor.RESPONSE_CODE_MEASURE, "apiName"};
    private static final String[] DEFAULT_MEASURE_SET = {"value"};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum ButtonType {
        BUTTON_LEFT,
        BUTTON_RIGHT,
        BUTTON_POSITIVE,
        BUTTON_NAGTIVE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ButtonType buttonType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/view/widgets/CustomErrorView$ButtonType");
        }

        public static ButtonType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ButtonType) ipChange.ipc$dispatch("da66a03a", new Object[]{str});
            }
            return (ButtonType) Enum.valueOf(ButtonType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum Status {
        STATUS_ERROR,
        STATUS_EMPTY;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Status status, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/view/widgets/CustomErrorView$Status");
        }

        public static Status valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Status) ipChange.ipc$dispatch("2da19c14", new Object[]{str});
            }
            return (Status) Enum.valueOf(Status.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$homepage$view$widgets$CustomErrorView$ButtonType;

        static {
            int[] iArr = new int[ButtonType.values().length];
            $SwitchMap$com$taobao$homepage$view$widgets$CustomErrorView$ButtonType = iArr;
            try {
                iArr[ButtonType.BUTTON_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$homepage$view$widgets$CustomErrorView$ButtonType[ButtonType.BUTTON_POSITIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$homepage$view$widgets$CustomErrorView$ButtonType[ButtonType.BUTTON_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$homepage$view$widgets$CustomErrorView$ButtonType[ButtonType.BUTTON_NAGTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(729809177);
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                Nav.from(CustomErrorView.this.getContext()).toUri("http://m.taobao.com/go/networkDiagnosis");
            }
        }

        public /* synthetic */ b(CustomErrorView customErrorView, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(729809178);
        }

        public c() {
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
            if (CustomErrorView.access$200(CustomErrorView.this) != null && !TextUtils.isEmpty(CustomErrorView.access$200(CustomErrorView.this).errorCode)) {
                str3 = CustomErrorView.access$200(CustomErrorView.this).errorCode;
            }
            String name = CustomErrorView.this.getContext().getClass().getName();
            try {
                String str4 = CustomErrorView.access$300(CustomErrorView.this) + "," + CustomErrorView.access$400(CustomErrorView.this);
                if (CustomErrorView.access$200(CustomErrorView.this) != null) {
                    str2 = URLEncoder.encode(CustomErrorView.access$200(CustomErrorView.this).toJSON(), "UTF-8");
                } else {
                    str2 = "empty";
                }
                str = String.format("https://market.m.taobao.com/markets/client/feedback_detail?wh_weex=true&seCate=BUG&cont=%1s&errCode=%2s&fromPage=%3s&error=%4s", str4, str3, name, str2);
            } catch (Exception unused) {
                str = String.format("https://market.m.taobao.com/markets/client/feedback_detail?wh_weex=true&seCate=BUG&cont=%1s&errCode=%2s&fromPage=%3s&error=%4s", CustomErrorView.access$300(CustomErrorView.this) + "," + CustomErrorView.access$400(CustomErrorView.this), str3, name, "empty");
            }
            Nav.from(CustomErrorView.this.getContext()).toUri(str);
        }

        public /* synthetic */ c(CustomErrorView customErrorView, a aVar) {
            this();
        }
    }

    public CustomErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.mIconRes = -1;
        this.mStatus = Status.STATUS_ERROR;
        this.hasReported = false;
        if (!(attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TBErrorView, i, 0)) == null)) {
            this.mIconString = obtainStyledAttributes.getString(R.styleable.TBErrorView_uik_errorIcon);
            this.mTitle = obtainStyledAttributes.getString(R.styleable.TBErrorView_uik_errorTitle);
            this.mSubTitle = obtainStyledAttributes.getString(R.styleable.TBErrorView_uik_errorSubTitle);
            obtainStyledAttributes.recycle();
        }
        this.mErrorFilter = new DefaultErrorFilter(getContext(), getResources().getString(R.string.uik_default_rule));
        initErrorView(LayoutInflater.from(getContext()).inflate(R.layout.uik_error, (ViewGroup) this, true));
    }

    public static /* synthetic */ Error access$200(CustomErrorView customErrorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Error) ipChange.ipc$dispatch("30e51f7f", new Object[]{customErrorView});
        }
        return customErrorView.mError;
    }

    public static /* synthetic */ String access$300(CustomErrorView customErrorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da03a5b7", new Object[]{customErrorView});
        }
        return customErrorView.mTitle;
    }

    public static /* synthetic */ String access$400(CustomErrorView customErrorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4749ed6", new Object[]{customErrorView});
        }
        return customErrorView.mSubTitle;
    }

    private void filterSubTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e9d017", new Object[]{this});
        } else if (!NetUtil.isNetworkConnected(getContext())) {
            this.mSubTitle = getContext().getString(R.string.uik_network_error_subtitle);
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
            this.mTitle = getContext().getString(R.string.uik_network_error_title);
        } else if (this.mStatus != Status.STATUS_EMPTY || !TextUtils.isEmpty(this.mTitle)) {
            Error error = this.mError;
            if (error != null && this.mStatus == Status.STATUS_ERROR) {
                this.mTitle = this.mErrorFilter.filterTitle(error, this.mTitle);
            }
        } else {
            this.mTitle = getContext().getString(R.string.uik_default_empty_title);
        }
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
        this.mLeftButton = (Button) findViewById(R.id.uik_errorButtonPos);
        this.mRightButton = (Button) findViewById(R.id.uik_errorButtonNag);
        this.mErrorInfoTextView = (TextView) findViewById(R.id.uik_mapping_code);
        this.mRightButton.setOnClickListener(new c(this, null));
        TextView textView = (TextView) findViewById(R.id.uik_network_diagnosis);
        this.mNetworkDiagnosisTextView = textView;
        textView.getPaint().setFlags(8);
        this.mNetworkDiagnosisTextView.getPaint().setAntiAlias(true);
        this.mNetworkDiagnosisTextView.setOnClickListener(new b(this, null));
    }

    public static /* synthetic */ Object ipc$super(CustomErrorView customErrorView, String str, Object... objArr) {
        if (str.hashCode() == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/view/widgets/CustomErrorView");
    }

    private void updateErrorView() {
        Error error;
        Error error2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2d88b", new Object[]{this});
            return;
        }
        Status status = this.mStatus;
        Status status2 = Status.STATUS_ERROR;
        if (status == status2) {
            if (this.mIconRes >= 0) {
                this.mIconView.setPlaceHoldForeground(ContextCompat.getDrawable(getContext(), this.mIconRes));
                this.mIconView.setImageUrl(null);
            } else if (!TextUtils.isEmpty(this.mIconString)) {
                this.mIconView.setPlaceHoldForeground(null);
                this.mIconView.setImageUrl(this.mIconString);
            } else {
                this.mIconRes = R.drawable.uik_sys_error_icon;
                this.mIconView.setPlaceHoldForeground(ContextCompat.getDrawable(getContext(), this.mIconRes));
                this.mIconView.setImageUrl(null);
            }
        } else if (status == Status.STATUS_EMPTY) {
            if (this.mIconRes >= 0) {
                this.mIconView.setPlaceHoldForeground(ContextCompat.getDrawable(getContext(), this.mIconRes));
                this.mIconView.setImageUrl(null);
            } else if (!TextUtils.isEmpty(this.mIconString)) {
                this.mIconView.setPlaceHoldForeground(null);
                this.mIconView.setImageUrl(this.mIconString);
            } else {
                this.mIconRes = R.drawable.uik_sys_error_icon;
                this.mIconView.setPlaceHoldForeground(ContextCompat.getDrawable(getContext(), this.mIconRes));
                this.mIconView.setImageUrl(null);
            }
        }
        if (TextUtils.isEmpty(this.mTitle)) {
            if (this.mStatus == Status.STATUS_EMPTY) {
                this.mTitle = getContext().getString(R.string.uik_default_empty_title);
            } else {
                this.mTitle = getContext().getString(R.string.uik_default_error_title);
            }
        }
        this.mTitleView.setText(this.mTitle);
        if (TextUtils.isEmpty(this.mSubTitle)) {
            if (this.mStatus == Status.STATUS_EMPTY) {
                this.mSubTitle = getContext().getString(R.string.uik_default_empty_subtitle);
            } else {
                Error error3 = this.mError;
                if (error3 == null || TextUtils.isEmpty(error3.errorMsg)) {
                    this.mSubTitle = getContext().getString(R.string.uik_default_error_subtitle);
                } else {
                    this.mSubTitle = this.mError.errorMsg;
                }
            }
        }
        this.mSubTitleView.setText(this.mSubTitle);
        Status status3 = this.mStatus;
        if (status3 != status2 || (error2 = this.mError) == null) {
            if (status3 == Status.STATUS_EMPTY) {
                this.mRightButton.setVisibility(8);
                this.mErrorInfoTextView.setVisibility(4);
            }
        } else if (!TextUtils.isEmpty(error2.errorCode) || !TextUtils.isEmpty(this.mError.mappingCode)) {
            this.mErrorInfoTextView.setVisibility(0);
            TextView textView = this.mErrorInfoTextView;
            if (TextUtils.isEmpty(this.mError.mappingCode)) {
                str = this.mError.errorCode;
            } else {
                str = this.mError.mappingCode;
            }
            textView.setText(str);
        } else {
            this.mErrorInfoTextView.setVisibility(4);
        }
        if (!this.mIsNotShowNetworkDiagnosisView && isNetworkDiagnosisEnable && (((error = this.mError) != null && this.mErrorFilter.isNetworkError(error.errorCode)) || !NetUtil.isNetworkConnected(getContext()))) {
            this.mNetworkDiagnosisTextView.setVisibility(0);
        }
        invalidate();
    }

    public void setButton(ButtonType buttonType, CharSequence charSequence, View.OnClickListener onClickListener) {
        Button button;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2876e11f", new Object[]{this, buttonType, charSequence, onClickListener});
            return;
        }
        int i2 = a.$SwitchMap$com$taobao$homepage$view$widgets$CustomErrorView$ButtonType[buttonType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            button = this.mLeftButton;
        } else {
            button = null;
        }
        if (button != null) {
            button.setText(charSequence);
            button.setOnClickListener(onClickListener);
            if (onClickListener == null) {
                i = 8;
            }
            button.setVisibility(i);
        }
    }

    public void setButtonVisibility(ButtonType buttonType, int i) {
        Button button;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd62353f", new Object[]{this, buttonType, new Integer(i)});
            return;
        }
        int i2 = a.$SwitchMap$com$taobao$homepage$view$widgets$CustomErrorView$ButtonType[buttonType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            Button button2 = this.mLeftButton;
            if (button2 != null) {
                button2.setVisibility(i);
            }
        } else if ((i2 == 3 || i2 == 4) && (button = this.mRightButton) != null) {
            button.setVisibility(i);
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

    @Override // android.view.View
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
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

    private void report() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730c1fbb", new Object[]{this});
            return;
        }
        String str2 = this.mTitle;
        String str3 = this.mSubTitle;
        if (getContext() != null) {
            str = getContext().getClass().getName();
        } else {
            str = "null";
        }
        doReport(str2, str3, str, this.mError);
        this.hasReported = true;
    }

    static {
        t2o.a(729809174);
    }

    public void setSubTitle(CharSequence charSequence, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9c43cf", new Object[]{this, charSequence, new Boolean(z)});
        } else if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            this.mSubTitle = charSequence2;
            if (z && !charSequence2.isEmpty()) {
                filterTitle();
            }
            updateErrorView();
        }
    }

    public void setTitle(CharSequence charSequence, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("909cf0b3", new Object[]{this, charSequence, new Boolean(z)});
        } else if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            this.mTitle = charSequence2;
            if (z && !charSequence2.isEmpty()) {
                filterTitle();
            }
            updateErrorView();
        }
    }

    public static void doReport(String str, String str2, String str3, Error error) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72bd90c3", new Object[]{str, str2, str3, error});
            return;
        }
        String str5 = "null";
        String str6 = (error == null || TextUtils.isEmpty(error.url)) ? str5 : error.url;
        String str7 = (error == null || TextUtils.isEmpty(error.apiName)) ? str5 : error.apiName;
        String str8 = (error == null || TextUtils.isEmpty(error.errorCode)) ? str5 : error.errorCode;
        String str9 = (error == null || TextUtils.isEmpty(error.mappingCode)) ? str5 : error.mappingCode;
        if (error != null) {
            str4 = String.valueOf(error.responseCode);
        } else {
            str4 = "0";
        }
        if (!isMonitorRegistered) {
            isMonitorRegistered = true;
            DimensionSet create = DimensionSet.create();
            for (String str10 : DEFAULT_DIMENSION_SET) {
                create.addDimension(str10);
            }
            MeasureSet create2 = MeasureSet.create();
            for (String str11 : DEFAULT_MEASURE_SET) {
                create2.addMeasure(str11);
            }
            AppMonitor.register(MODULE_NAME, MONITOR_POINT, create2, create);
        }
        DimensionValueSet create3 = DimensionValueSet.create();
        create3.setValue("pageName", TextUtils.isEmpty(str3) ? str5 : str3);
        create3.setValue("pageURL", str6);
        create3.setValue("title", TextUtils.isEmpty(str) ? str5 : str);
        if (!TextUtils.isEmpty(str2)) {
            str5 = str2;
        }
        create3.setValue("subtitle", str5);
        create3.setValue("code", str8);
        create3.setValue(jk.KEY_MAPPING_CODE, str9);
        create3.setValue(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, str4);
        create3.setValue("apiName", str7);
        MeasureValueSet create4 = MeasureValueSet.create();
        create4.setValue("value", vu3.b.GEO_NOT_SUPPORT);
        AppMonitor.Stat.commit(MODULE_NAME, MONITOR_POINT, create3, create4);
    }

    public CustomErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomErrorView(Context context) {
        this(context, null, 0);
    }
}
