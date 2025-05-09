package com.taobao.tao.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import mtopsdk.mtop.domain.MtopResponse;
import tb.s69;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class LimitDialog extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FULL_SCREEN = 1;
    public static final int FULL_SCREEN_WHOLE = 0;
    public static final int INIT_STATE = 3;
    private static final String LIMIT_MODULE_NAME = "sentinel";
    public static final int NORMAL_SCREEN = 2;
    public static final int REQUEST_STATE = 4;
    private static final String SENTINEL_BUTTON_COLOR = "sentinelButtonColor";
    private static final String SENTINEL_BUTTON_TEXT = "sentinelButtonText";
    private static final String SENTINEL_IMAGE = "sentinelImage";
    private static final String SENTINEL_TEXT1 = "sentinel1Text";
    private static final String SENTINEL_TEXT2 = "sentinel2Text";
    private static final String SENTINEL_TEXT3 = "sentinel3Text";
    private static String sFestivalIconUrl;
    private static String sFestivalRefresh;
    private static int sFestivalRefreshColor;
    private static String sFestivalTip1;
    private static String sFestivalTip2;
    private static String sFestivalTip3;
    public int bottomHeight;
    public TextView m11DefaultView;
    public TUrlImageView m11IconView;
    public ProgressBar m11ProgressBar;
    public TextView m11RefreshView;
    public TextView m11Tip1View;
    public TextView m11Tip2View;
    public View mAnchoerView;
    public Activity mContext;
    public PopupWindow mPopupWindow;
    public int mStatus;
    public OnLimitRefreshListener onLimitRefreshListener;
    public int topHeight;
    public int mType = 2;
    private boolean is11 = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface OnLimitRefreshListener {
        void onLimitRefresh();
    }

    static {
        t2o.a(775946417);
    }

    public LimitDialog(Activity activity) {
        super(activity);
        this.mContext = activity;
        initView();
    }

    public static /* synthetic */ Object ipc$super(LimitDialog limitDialog, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/util/LimitDialog");
    }

    private void loadFestivalConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f009e7", new Object[]{this});
            return;
        }
        sFestivalIconUrl = s69.e().g(LIMIT_MODULE_NAME, SENTINEL_IMAGE);
        sFestivalTip1 = s69.e().g(LIMIT_MODULE_NAME, SENTINEL_TEXT1);
        sFestivalTip2 = s69.e().g(LIMIT_MODULE_NAME, SENTINEL_TEXT2);
        sFestivalTip3 = s69.e().g(LIMIT_MODULE_NAME, SENTINEL_TEXT3);
        sFestivalRefresh = s69.e().g(LIMIT_MODULE_NAME, SENTINEL_BUTTON_TEXT);
        sFestivalRefreshColor = s69.e().b(LIMIT_MODULE_NAME, SENTINEL_BUTTON_COLOR, ContextCompat.getColor(this.mContext, R.color.limit_refresh_enable_bg));
    }

    public static boolean setErrorCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("710bac28", new Object[]{str})).booleanValue();
        }
        if ((StringUtil.isEmpty(str) || !str.equals("420")) && !str.equals("499") && !str.equals("599")) {
            return false;
        }
        return true;
    }

    public static boolean setErrorResponse(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2dee77", new Object[]{mtopResponse})).booleanValue();
        }
        if (mtopResponse == null || (!setErrorCode(String.valueOf(mtopResponse.getResponseCode())) && !mtopResponse.isApiLockedResult())) {
            return false;
        }
        return true;
    }

    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        initStatus();
        try {
            this.mPopupWindow.dismiss();
        } catch (Exception unused) {
        }
    }

    public void init11View(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ffbf4c", new Object[]{this, context});
            return;
        }
        View.inflate(context, R.layout.limit_11_view, this);
        this.m11IconView = (TUrlImageView) findViewById(R.id.limit_11_icon_view);
        this.m11Tip1View = (TextView) findViewById(R.id.limit_11_tip1_view);
        this.m11Tip2View = (TextView) findViewById(R.id.limit_11_tip2_view);
        this.m11RefreshView = (TextView) findViewById(R.id.limit_11_refresh_view);
        this.m11ProgressBar = (ProgressBar) findViewById(R.id.limit_11_progressbar);
        this.mStatus = 3;
        if (!TextUtils.isEmpty(sFestivalIconUrl)) {
            this.m11IconView.setImageUrl(sFestivalIconUrl);
            this.m11IconView.setErrorImageResId(R.drawable.limit_icon_default);
        } else {
            this.m11IconView.setBackgroundDrawable(ContextCompat.getDrawable(this.mContext, R.drawable.limit_icon_default));
        }
        if (!TextUtils.isEmpty(sFestivalTip1)) {
            this.m11Tip1View.setText(sFestivalTip1);
        } else {
            this.m11Tip1View.setText(getResources().getText(R.string.limit_11_tips1));
        }
        if (!TextUtils.isEmpty(sFestivalTip2)) {
            this.m11Tip2View.setText(sFestivalTip2);
        } else {
            this.m11Tip2View.setText(getResources().getText(R.string.limit_11_tips2));
        }
        if (!TextUtils.isEmpty(sFestivalRefresh)) {
            this.m11RefreshView.setText(sFestivalRefresh);
        } else {
            this.m11RefreshView.setText(getResources().getText(R.string.limit_11_refresh_operation));
        }
        GradientDrawable gradientDrawable = (GradientDrawable) ContextCompat.getDrawable(this.mContext, R.drawable.shape_button_limit_enalbe);
        gradientDrawable.setColor(sFestivalRefreshColor);
        this.m11RefreshView.setBackground(gradientDrawable);
    }

    public void initStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454a38a9", new Object[]{this});
        } else if (this.is11 && this.mContext != null) {
            this.mStatus = 3;
            this.m11RefreshView.setEnabled(true);
            GradientDrawable gradientDrawable = (GradientDrawable) ContextCompat.getDrawable(this.mContext, R.drawable.shape_button_limit_enalbe);
            gradientDrawable.setColor(sFestivalRefreshColor);
            this.m11RefreshView.setBackground(gradientDrawable);
            this.m11RefreshView.setTextColor(getResources().getColor(R.color.C_white));
            if (!TextUtils.isEmpty(sFestivalTip2)) {
                this.m11Tip2View.setText(sFestivalTip2);
            } else {
                this.m11Tip2View.setText(R.string.limit_11_tips2);
            }
            this.m11ProgressBar.setVisibility(8);
        }
    }

    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return this.mPopupWindow.isShowing();
    }

    public void setDialogType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c46338", new Object[]{this, new Integer(i)});
        } else {
            this.mType = i;
        }
    }

    public void setOnRefreshListener(OnLimitRefreshListener onLimitRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("115d3c63", new Object[]{this, onLimitRefreshListener});
        } else {
            this.onLimitRefreshListener = onLimitRefreshListener;
        }
    }

    public void show(int i) {
        int i2;
        int screenHeight;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb7fa7f", new Object[]{this, new Integer(i)});
            return;
        }
        Activity activity = this.mContext;
        if (activity != null) {
            this.mType = i;
            if (this.mStatus != 4 || !this.is11) {
                this.topHeight = DensityUtil.dip2px(activity, 48.0f) + Constants.statusBarHeight;
                this.bottomHeight = DensityUtil.dip2px(this.mContext, 44.0f);
                if (i == 0) {
                    i2 = SystemUtils.getScreenHeight(getContext());
                    this.topHeight = Constants.statusBarHeight;
                } else {
                    if (i == 1) {
                        screenHeight = SystemUtils.getScreenHeight(getContext());
                        i3 = this.topHeight;
                    } else {
                        screenHeight = SystemUtils.getScreenHeight(getContext()) - this.topHeight;
                        i3 = this.bottomHeight;
                    }
                    i2 = screenHeight - i3;
                }
                this.mPopupWindow.setHeight(i2);
                this.mPopupWindow.setWidth(SystemUtils.getScreenWidth(this.mContext));
                try {
                    this.mPopupWindow.showAtLocation(this.mAnchoerView, 48, 0, this.topHeight);
                } catch (Exception unused) {
                }
            } else {
                startTime(this.m11RefreshView);
            }
        }
    }

    public void show11View(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c65a3f", new Object[]{this, context});
        } else if (context != null) {
            init11View(context);
            this.m11RefreshView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.util.LimitDialog.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    LimitDialog.this.showRequestView(view);
                    OnLimitRefreshListener onLimitRefreshListener = LimitDialog.this.onLimitRefreshListener;
                    if (onLimitRefreshListener != null) {
                        onLimitRefreshListener.onLimitRefresh();
                    }
                }
            });
        }
    }

    public void showAtLocation(View view, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605c6e9d", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else if (this.mStatus != 4 || !this.is11) {
            this.mPopupWindow.setHeight(i2);
            if (i3 <= 0) {
                this.mPopupWindow.setWidth(SystemUtils.getScreenWidth(this.mContext));
            } else {
                this.mPopupWindow.setWidth(i3);
            }
            try {
                this.mPopupWindow.showAtLocation(view, i, i4, i5);
            } catch (Exception unused) {
            }
        } else {
            startTime(this.m11RefreshView);
        }
    }

    public void showNormalView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73a46b8", new Object[]{this, context});
        } else if (this.mContext != null) {
            View.inflate(context, R.layout.limit_default_view, this);
            TextView textView = (TextView) findViewById(R.id.limit_default_refresh_view);
            this.m11DefaultView = textView;
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.util.LimitDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    LimitDialog.this.dismiss();
                    OnLimitRefreshListener onLimitRefreshListener = LimitDialog.this.onLimitRefreshListener;
                    if (onLimitRefreshListener != null) {
                        onLimitRefreshListener.onLimitRefresh();
                    }
                }
            });
        }
    }

    public void showRequestView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29ba8874", new Object[]{this, view});
            return;
        }
        this.mStatus = 4;
        view.setEnabled(false);
        this.m11RefreshView.setBackground(ContextCompat.getDrawable(view.getContext(), R.drawable.shape_button_limit_disalbe));
        if (!TextUtils.isEmpty(sFestivalTip3)) {
            this.m11Tip2View.setText(sFestivalTip3);
        } else {
            this.m11Tip2View.setText(R.string.limit_11_refreshing_tip);
        }
        this.m11ProgressBar.setVisibility(0);
    }

    public void startTime(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb350dbc", new Object[]{this, view});
            return;
        }
        Log.e("", "into--[startTime]");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.tao.util.LimitDialog.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LimitDialog.this.initStatus();
                }
            }
        }, 5000L);
    }

    public void initView() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
        } else if (this.mContext != null) {
            loadFestivalConfig();
            this.mPopupWindow = new PopupWindow(this);
            this.mAnchoerView = this.mContext.getWindow().getDecorView();
            this.mPopupWindow.setContentView(this);
            this.mPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.tao.util.LimitDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                        return;
                    }
                    Activity activity = LimitDialog.this.mContext;
                    if (activity != null) {
                        boolean z2 = activity instanceof Activity;
                    }
                }
            });
            if (FestivalMgr.i().v(LIMIT_MODULE_NAME) || LimitSwitchCenter.is11Time()) {
                z = true;
            }
            this.is11 = z;
            if (z) {
                show11View(this.mContext);
            } else {
                showNormalView(this.mContext);
            }
            initStatus();
        }
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            show(this.mType);
        }
    }
}
