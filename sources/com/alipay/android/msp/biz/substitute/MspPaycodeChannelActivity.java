package com.alipay.android.msp.biz.substitute;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.android.msp.biz.substitute.SpmHelper;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.minizxing.BarcodeFormat;
import com.alipay.android.msp.framework.minizxing.ErrorCorrectionLevel;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.pay.results.MspPayResult;
import com.alipay.android.msp.pay.results.ResultStatus;
import com.alipay.android.msp.ui.views.AbsActivity;
import com.alipay.android.msp.utils.BitmapUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.NumUtil;
import com.alipay.android.msp.utils.ZXingHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.net.URLDecoder;
import tb.acq;
import tb.f7l;
import tb.tkt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspPaycodeChannelActivity extends AbsActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f3528a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public Bitmap j;
    public boolean k;
    public String l;
    public String m;
    public boolean n;
    public long o = 0;
    public String p = "";

    public static /* synthetic */ String access$000(MspPaycodeChannelActivity mspPaycodeChannelActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef0a2d80", new Object[]{mspPaycodeChannelActivity});
        }
        return mspPaycodeChannelActivity.p;
    }

    public static /* synthetic */ int access$100(MspPaycodeChannelActivity mspPaycodeChannelActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e01a1ff2", new Object[]{mspPaycodeChannelActivity})).intValue();
        }
        return mspPaycodeChannelActivity.f3528a;
    }

    public static /* synthetic */ String access$200(MspPaycodeChannelActivity mspPaycodeChannelActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c119b782", new Object[]{mspPaycodeChannelActivity});
        }
        return mspPaycodeChannelActivity.l;
    }

    public static /* synthetic */ String access$300(MspPaycodeChannelActivity mspPaycodeChannelActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa217c83", new Object[]{mspPaycodeChannelActivity});
        }
        return mspPaycodeChannelActivity.b;
    }

    public static /* synthetic */ Bitmap access$400(MspPaycodeChannelActivity mspPaycodeChannelActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("fffb797a", new Object[]{mspPaycodeChannelActivity});
        }
        return mspPaycodeChannelActivity.j;
    }

    public static /* synthetic */ Bitmap access$402(MspPaycodeChannelActivity mspPaycodeChannelActivity, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ac349672", new Object[]{mspPaycodeChannelActivity, bitmap});
        }
        mspPaycodeChannelActivity.j = bitmap;
        return bitmap;
    }

    public static /* synthetic */ Bitmap access$500(MspPaycodeChannelActivity mspPaycodeChannelActivity, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("872c7cf1", new Object[]{mspPaycodeChannelActivity, bitmap});
        }
        if (bitmap != null) {
            return BitmapUtil.getRoundedBitmap(BitmapUtil.zoomImage(mspPaycodeChannelActivity.j, 135, 135), 12);
        }
        return BitmapUtil.getRoundedBitmap(BitmapFactory.decodeResource(mspPaycodeChannelActivity.getResources(), R.drawable.alipay_substitute_user_default), 12);
    }

    public static /* synthetic */ void access$700(MspPaycodeChannelActivity mspPaycodeChannelActivity) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edda5d39", new Object[]{mspPaycodeChannelActivity});
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) mspPaycodeChannelActivity.findViewById(R.id.substitute_paycode_qrcode_layout);
        ImageView imageView = (ImageView) mspPaycodeChannelActivity.findViewById(R.id.substitute_paycode_qrcode_img);
        TextView textView = (TextView) mspPaycodeChannelActivity.findViewById(R.id.substitute_paycode_qrcode_desc);
        if (imageView.getWidth() != imageView.getHeight()) {
            if (imageView.getWidth() < imageView.getHeight()) {
                i2 = imageView.getWidth();
            } else {
                i2 = imageView.getHeight();
            }
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = i2;
            layoutParams.width = i2;
            imageView.setLayoutParams(layoutParams);
        }
        if (textView.getBottom() > relativeLayout.getHeight() || ((int) textView.getTextSize()) * 2 > textView.getHeight()) {
            textView.setPadding(textView.getPaddingLeft() / 3, textView.getPaddingTop(), textView.getPaddingRight() / 3, textView.getPaddingBottom());
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        if (textView.getBottom() > relativeLayout.getHeight()) {
            i = ((((layoutParams2.topMargin + layoutParams3.topMargin) + layoutParams3.bottomMargin) + relativeLayout.getHeight()) - textView.getBottom()) / 3;
        } else {
            i = ((layoutParams2.topMargin + layoutParams3.topMargin) + layoutParams3.bottomMargin) / 3;
        }
        layoutParams2.setMargins(layoutParams2.leftMargin, i, layoutParams2.rightMargin, layoutParams2.bottomMargin);
        imageView.setLayoutParams(layoutParams2);
        layoutParams3.setMargins(layoutParams3.leftMargin, i, layoutParams3.rightMargin, i);
        textView.setLayoutParams(layoutParams3);
    }

    public static /* synthetic */ Object ipc$super(MspPaycodeChannelActivity mspPaycodeChannelActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/biz/substitute/MspPaycodeChannelActivity");
        }
    }

    public static int l3(Context context, float f) {
        Resources resources;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue();
        }
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        return (int) (f * resources.getDisplayMetrics().density);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity
    public void finish() {
        MspWindowClient mspWindowClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        LogUtil.record(1, "PaycodeChannel", "finish");
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(this.f3528a);
        if (!(tradeContextByBizId == null || (mspWindowClient = (MspWindowClient) tradeContextByBizId.getMspUIClient()) == null)) {
            SpmHelper.Page page = SpmHelper.Page.Subpay_Paycode;
            SpmHelper.PageState pageState = SpmHelper.PageState.End;
            String str = this.p;
            StringBuilder sb = new StringBuilder();
            sb.append(SystemClock.elapsedRealtime() - this.o);
            SpmHelper.saveNativePageSpm(this, page, pageState, str, sb.toString(), this.f3528a, mspWindowClient.getFrameStack().getTopTplOrNativeFrame());
        }
        if (this.n && tradeContextByBizId != null) {
            MspPayResult mspPayResult = tradeContextByBizId.getMspPayResult();
            if (mspPayResult != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(ResultStatus.PAY_IGNORE_CODE.getStatus());
                mspPayResult.setEndCode(sb2.toString());
            }
            tradeContextByBizId.exit(0);
        }
    }

    public static /* synthetic */ Bitmap access$600(MspPaycodeChannelActivity mspPaycodeChannelActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c0ff0938", new Object[]{mspPaycodeChannelActivity});
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(mspPaycodeChannelActivity.getResources(), R.drawable.alipay_substitute_logo);
        int l3 = l3(mspPaycodeChannelActivity, 220.0f);
        int l32 = l3(mspPaycodeChannelActivity, 220.0f);
        LogUtil.record(1, "PaycodeChannel", "paycodeWidth:".concat(String.valueOf(l3)));
        LogUtil.record(1, "PaycodeChannel", "paycodeHeight:".concat(String.valueOf(l32)));
        return ZXingHelper.createCodeBitmap(mspPaycodeChannelActivity.h, BarcodeFormat.QR_CODE, -789518, l3, l32, ErrorCorrectionLevel.Q, decodeResource, -16777216);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        LogUtil.record(1, "PaycodeChannel", "onBackPressed");
        finish();
    }

    @Override // com.alipay.android.msp.ui.views.AbsActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        LogUtil.record(1, "PaycodeChannel", "onDestroy");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        LogUtil.record(1, "PaycodeChannel", "onResume");
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.biz.substitute.MspPaycodeChannelActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                boolean z = false;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (!TextUtils.isEmpty(MspPaycodeChannelActivity.access$300(MspPaycodeChannelActivity.this))) {
                    MspPaycodeChannelActivity mspPaycodeChannelActivity = MspPaycodeChannelActivity.this;
                    MspPaycodeChannelActivity.access$402(mspPaycodeChannelActivity, BitmapUtil.getHttpBitmap(MspPaycodeChannelActivity.access$300(mspPaycodeChannelActivity)));
                }
                StringBuilder sb = new StringBuilder("getHttpBitmap:mUserAvatarUrl=");
                sb.append(MspPaycodeChannelActivity.access$300(MspPaycodeChannelActivity.this));
                sb.append(", bitmap_is_null=");
                if (MspPaycodeChannelActivity.access$400(MspPaycodeChannelActivity.this) == null) {
                    z = true;
                }
                sb.append(z);
                LogUtil.record(1, "PaycodeChannel", sb.toString());
                MspPaycodeChannelActivity mspPaycodeChannelActivity2 = MspPaycodeChannelActivity.this;
                final Bitmap access$500 = MspPaycodeChannelActivity.access$500(mspPaycodeChannelActivity2, MspPaycodeChannelActivity.access$400(mspPaycodeChannelActivity2));
                final Bitmap access$600 = MspPaycodeChannelActivity.access$600(MspPaycodeChannelActivity.this);
                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.biz.substitute.MspPaycodeChannelActivity.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ((ImageView) MspPaycodeChannelActivity.this.findViewById(R.id.substitute_paycode_user_img)).setImageBitmap(access$500);
                        ((ImageView) MspPaycodeChannelActivity.this.findViewById(R.id.substitute_paycode_qrcode_img)).setImageBitmap(access$600);
                        MspPaycodeChannelActivity.access$700(MspPaycodeChannelActivity.this);
                    }
                });
            }
        });
    }

    @Override // com.alipay.android.msp.ui.views.AbsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        MspWindowClient mspWindowClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        LogUtil.record(1, "PaycodeChannel", "onCreate");
        try {
            if (Build.VERSION.SDK_INT != 26) {
                setRequestedOrientation(1);
            }
        } catch (Throwable th) {
            LogUtil.record(1, "MspPaycodeChannelActivity:oncreate", "failed to set orientation");
            LogUtil.printExceptionStackTrace(th);
        }
        if (GlobalHelper.getInstance().getContext() == null) {
            GlobalHelper.getInstance().init(this);
        }
        setContentView(R.layout.substitute_paycode_activity);
        Intent intent = getIntent();
        this.f3528a = intent.getIntExtra("bizId", -1);
        this.b = intent.getStringExtra(SubstituteConstants.KEY_SUBSTITUTE_PAY_AVATAR);
        this.c = intent.getStringExtra(SubstituteConstants.KEY_SUBSTITUTE_PAY_SHOWNAME);
        this.d = intent.getStringExtra(SubstituteConstants.KEY_SUBSTITUTE_PAY_REALNAME);
        this.e = intent.getStringExtra(SubstituteConstants.KEY_SUBSTITUTE_PAY_SLOGAN);
        this.f = intent.getStringExtra(SubstituteConstants.KEY_SUBSTITUTE_PAY_AMOUNT);
        this.g = intent.getStringExtra("desc");
        this.h = intent.getStringExtra(SubstituteConstants.KEY_SUBSTITUTE_PAY_CODEURL);
        String stringExtra = intent.getStringExtra(SubstituteConstants.KEY_SUBSTITUTE_PAY_TIME);
        this.i = stringExtra;
        if (stringExtra == null) {
            this.i = "";
        }
        this.k = intent.getBooleanExtra(SubstituteConstants.KEY_CODE_DOWNLOAD_BUTTON, false);
        this.l = intent.getStringExtra(SubstituteConstants.KEY_CODE_DOWNLOAD_BUTTON_LINK);
        this.m = intent.getStringExtra(SubstituteConstants.KEY_CODE_DOWNLOAD_BUTTON_NAME);
        this.n = intent.getBooleanExtra("needExit", false);
        LogUtil.record(1, "PaycodeChannel", "Params#avatar:" + this.b);
        LogUtil.record(1, "PaycodeChannel", "Params#showname:" + this.c);
        LogUtil.record(1, "PaycodeChannel", "Params#realname:" + this.d);
        LogUtil.record(1, "PaycodeChannel", "Params#slogan:" + this.e);
        LogUtil.record(1, "PaycodeChannel", "Params#amount:" + this.f);
        LogUtil.record(1, "PaycodeChannel", "Params#desc:" + this.g);
        LogUtil.record(1, "PaycodeChannel", "Params#codeurl:" + this.h);
        LogUtil.record(1, "PaycodeChannel", "Params#codetime:" + this.i);
        LogUtil.record(1, "PaycodeChannel", "Params#codeDLBtn:" + this.k);
        LogUtil.record(1, "PaycodeChannel", "Params#codeDLBtnLink:" + this.l);
        LogUtil.record(1, "PaycodeChannel", "Params#codeDLBtnName:" + this.m);
        LogUtil.record(1, "PaycodeChannel", "Params#needExit:" + this.n);
        this.p = "a283.b5824__" + GlobalHelper.getInstance().getUtdid(this) + "__" + NumUtil.c10to64(System.currentTimeMillis()) + "_";
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(this.f3528a);
        final MspWindowFrame topTplOrNativeFrame = (tradeContextByBizId == null || (mspWindowClient = (MspWindowClient) tradeContextByBizId.getMspUIClient()) == null) ? null : mspWindowClient.getFrameStack().getTopTplOrNativeFrame();
        SpmHelper.saveNativePageSpm(this, SpmHelper.Page.Subpay_Paycode, SpmHelper.PageState.Start, this.p, "0", this.f3528a, topTplOrNativeFrame);
        this.o = SystemClock.elapsedRealtime();
        View findViewById = findViewById(R.id.title_back_layout);
        findViewById.setContentDescription(LanguageHelper.localizedStringForKey("accessibilty_back_button", getString(R.string.accessibilty_back_button), new Object[0]));
        ((TextView) findViewById(R.id.mini_web_title)).setText(LanguageHelper.localizedStringForKey("substitute_paycode_title", getString(R.string.substitute_paycode_title), new Object[0]));
        ((TextView) findViewById(R.id.tv_download_layout_hint)).setText(LanguageHelper.localizedStringForKey("substitute_download_hint", getString(R.string.substitute_download_hint), new Object[0]));
        int i = R.id.download_button_name;
        ((TextView) findViewById(i)).setText(LanguageHelper.localizedStringForKey("substitute_download_text", getString(R.string.substitute_download_text), new Object[0]));
        SpmHelper.Control control = SpmHelper.Control.Subpay_Paycode_BACK;
        SpmHelper.Action action = SpmHelper.Action.Exposure;
        SpmHelper.saveNativeControlSpm(this, control, action, this.p, this.f3528a, topTplOrNativeFrame);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.biz.substitute.MspPaycodeChannelActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                MspPaycodeChannelActivity mspPaycodeChannelActivity = MspPaycodeChannelActivity.this;
                SpmHelper.saveNativeControlSpm(mspPaycodeChannelActivity, SpmHelper.Control.Subpay_Paycode_BACK, SpmHelper.Action.Clicked, MspPaycodeChannelActivity.access$000(mspPaycodeChannelActivity), MspPaycodeChannelActivity.access$100(MspPaycodeChannelActivity.this), topTplOrNativeFrame);
                MspPaycodeChannelActivity.this.onBackPressed();
            }
        });
        TextView textView = (TextView) findViewById(R.id.substitute_paycode_user_desc);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.c)) {
            sb.append(this.c);
        }
        if (!TextUtils.isEmpty(this.d)) {
            sb.append(f7l.BRACKET_START_STR);
            sb.append(this.d);
            sb.append(f7l.BRACKET_END_STR);
        }
        if (sb.length() != 0) {
            sb.append("：");
        }
        sb.append(this.e);
        textView.setText(sb.toString());
        ((TextView) findViewById(R.id.substitute_paycode_trade_price)).setText(this.f);
        ((TextView) findViewById(R.id.substitute_paycode_trade_desc)).setText(this.g);
        String localizedStringForKey = LanguageHelper.localizedStringForKey("qrcode_desc_prefix", getString(R.string.qrcode_desc_prefix), new Object[0]);
        String str = localizedStringForKey + this.i + LanguageHelper.localizedStringForKey("qrcode_desc_suffix", getString(R.string.qrcode_desc_suffix), new Object[0]);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan((int) tkt.DEFAULT_SHADOW_COLOR);
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(-445377);
        spannableStringBuilder.setSpan(foregroundColorSpan, 0, localizedStringForKey.length(), 33);
        spannableStringBuilder.setSpan(foregroundColorSpan2, localizedStringForKey.length(), localizedStringForKey.length() + this.i.length(), 18);
        spannableStringBuilder.setSpan(foregroundColorSpan, localizedStringForKey.length() + this.i.length(), str.length(), 33);
        ((TextView) findViewById(R.id.substitute_paycode_qrcode_desc)).setText(spannableStringBuilder);
        View findViewById2 = findViewById(R.id.download_layout);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById(R.id.substitute_paycode_layout).getLayoutParams();
        if (this.k) {
            findViewById2.setVisibility(0);
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, 42);
            SpmHelper.saveNativeControlSpm(this, SpmHelper.Control.Subpay_Paycode_Download, action, this.p, this.f3528a, topTplOrNativeFrame);
            ((ImageButton) findViewById(R.id.download_button)).setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.biz.substitute.MspPaycodeChannelActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    Intent intent2 = new Intent();
                    intent2.setAction("android.intent.action.VIEW");
                    intent2.setData(Uri.parse(URLDecoder.decode(MspPaycodeChannelActivity.access$200(MspPaycodeChannelActivity.this))));
                    intent2.addCategory("android.intent.category.BROWSABLE");
                    MspPaycodeChannelActivity.this.startActivity(intent2);
                    MspPaycodeChannelActivity mspPaycodeChannelActivity = MspPaycodeChannelActivity.this;
                    SpmHelper.saveNativeControlSpm(mspPaycodeChannelActivity, SpmHelper.Control.Subpay_Paycode_Download, SpmHelper.Action.Clicked, MspPaycodeChannelActivity.access$000(mspPaycodeChannelActivity), MspPaycodeChannelActivity.access$100(MspPaycodeChannelActivity.this), topTplOrNativeFrame);
                }
            });
            ((TextView) findViewById(i)).setText(this.m);
            return;
        }
        findViewById2.setVisibility(8);
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, 102);
    }
}
