package com.alipay.android.msp.framework.ext;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.accessibility.AccessibilityManager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.utils.DeviceScreenUtil;
import com.alipay.android.msp.utils.UIUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspExtSceneManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile MspExtSceneManager k;
    public final double c;
    public final Resources e;
    public DisplayMetrics f;
    public final AccessibilityManager g;
    public final JSONObject h;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3608a = false;
    public boolean b = false;
    public String d = null;
    public Boolean i = null;
    public Boolean j = null;

    public MspExtSceneManager(Context context) {
        this.c = 8.0d;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        if (context != null) {
            JSONObject jsonConfig = FastStartActivityHelper.getJsonConfig(context, DrmKey.EXT_SCENE_CONFIGS);
            if (jsonConfig != null) {
                try {
                    this.c = jsonConfig.getDouble("pad_screen_size_threshold").doubleValue();
                } catch (Exception unused) {
                }
            }
            this.h = FastStartActivityHelper.getJsonConfig(context, DrmKey.PAD_ADAPT_TEMPLATE_METADATA);
            Resources resources = context.getResources();
            this.e = resources;
            if (resources != null) {
                this.f = resources.getDisplayMetrics();
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.g = (AccessibilityManager) context.getSystemService("accessibility");
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 > 100) {
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "np", "getSystemService", String.valueOf(elapsedRealtime2));
            }
        }
    }

    public static MspExtSceneManager getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspExtSceneManager) ipChange.ipc$dispatch("60555e94", new Object[]{context});
        }
        if (k == null) {
            synchronized (MspExtSceneManager.class) {
                k = new MspExtSceneManager(context);
            }
        }
        return k;
    }

    public static boolean onPadAdaptMode(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0e52eb4", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_PAD_ADAPT_MODE);
    }

    public final String a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bdaf8ad8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        DisplayMetrics displayMetrics = this.f;
        if (displayMetrics == null) {
            return null;
        }
        float f = i / displayMetrics.xdpi;
        float f2 = i2 / displayMetrics.ydpi;
        double sqrt = Math.sqrt((f * f) + (f2 * f2));
        String str = "-dipWidth:" + f + "-dipHeight:" + f2 + "-screenSize:" + sqrt;
        if (sqrt - this.c >= 1.0E-6d) {
            this.d = str;
            this.f3608a = true;
            this.b = true;
        } else {
            this.b = false;
        }
        return str;
    }

    public boolean checkAccessibilityEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6dca246", new Object[]{this})).booleanValue();
        }
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || !this.g.isTouchExplorationEnabled()) {
            return false;
        }
        return true;
    }

    public boolean checkCurrentIsBigScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa3e737c", new Object[]{this})).booleanValue();
        }
        updateScreenSizeInfo();
        return this.b;
    }

    public boolean checkIsBigScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29bec0e5", new Object[]{this})).booleanValue();
        }
        updateScreenSizeInfo();
        return this.f3608a;
    }

    public int getDisplayHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42401bcd", new Object[]{this})).intValue();
        }
        DisplayMetrics displayMetrics = this.f;
        if (displayMetrics == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    public int getDisplayWidth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4d7baba", new Object[]{this, context})).intValue();
        }
        DisplayMetrics displayMetrics = this.f;
        if (displayMetrics == null) {
            return 0;
        }
        int i = displayMetrics.heightPixels;
        int i2 = (int) (i * 0.35427135f);
        int i3 = displayMetrics.widthPixels;
        if (i < i3) {
            i2 = (int) (i3 * 0.35427135f);
        }
        if (i2 < 750) {
            i2 = 750;
        }
        return (!this.b || UIUtil.isPadHuaweiMultiWindow(context)) ? this.f.widthPixels : i2;
    }

    public String isAccessibilityEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad73c4bc", new Object[]{this});
        }
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager == null) {
            return "unknown";
        }
        if (!accessibilityManager.isEnabled() || !this.g.isTouchExplorationEnabled()) {
            return "false";
        }
        return "true";
    }

    public boolean isAutoRotatingTpl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1b72b494", new Object[]{this, str})).booleanValue() : b(str, "auto_rotating");
    }

    public String isBigScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a38528b7", new Object[]{this});
        }
        String updateScreenSizeInfo = updateScreenSizeInfo();
        if (this.f3608a) {
            return "true" + this.d;
        } else if (updateScreenSizeInfo == null) {
            return "unknown";
        } else {
            return "false".concat(updateScreenSizeInfo);
        }
    }

    public boolean isExcludedPadAdaptTpl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2fe1c2", new Object[]{this, str})).booleanValue() : isNonPadAdaptableTpl(str) || isFullScreenTpl(str);
    }

    public boolean isFoldableDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e76299e6", new Object[]{this})).booleanValue();
        }
        if (this.i == null) {
            this.i = Boolean.valueOf(DeviceScreenUtil.isFoldDevice());
        }
        return this.i.booleanValue();
    }

    public boolean isFullScreenTpl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("815b56e0", new Object[]{this, str})).booleanValue() : b(str, "full_screen");
    }

    public boolean isNonPadAdaptableTpl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("55d01859", new Object[]{this, str})).booleanValue() : b(str, "non_pad_adaptable");
    }

    public boolean isPad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad47fb14", new Object[]{this})).booleanValue();
        }
        if (this.j == null) {
            this.j = Boolean.valueOf(DeviceScreenUtil.isPadDevice());
        }
        return this.j.booleanValue();
    }

    public boolean onProxyPadAdaptMode(Configuration configuration, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd72d0f8", new Object[]{this, configuration, context, new Boolean(z)})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        updateScreenSizeInfo(configuration, context);
        if (!this.b || !z) {
            return false;
        }
        return true;
    }

    public void resetInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c08aa4a4", new Object[]{this});
        } else {
            this.f3608a = false;
        }
    }

    public String updateScreenSizeInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2291f75", new Object[]{this});
        }
        Resources resources = this.e;
        if (resources == null) {
            return null;
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.f = displayMetrics;
        if (displayMetrics == null) {
            return null;
        }
        return a(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static boolean isAutoRotatingTpl(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a42d193c", new Object[]{str, context})).booleanValue() : getConfigValue(str, "auto_rotating", context);
    }

    public static boolean isExcludedPadAdaptTpl(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7b97bce", new Object[]{str, context})).booleanValue() : isNonPadAdaptableTpl(str, context) || isFullScreenTpl(str, context);
    }

    public static boolean isFullScreenTpl(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46636470", new Object[]{str, context})).booleanValue() : getConfigValue(str, "full_screen", context);
    }

    public static boolean isNonPadAdaptableTpl(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("53d20d17", new Object[]{str, context})).booleanValue() : getConfigValue(str, "non_pad_adaptable", context);
    }

    public boolean onPadAdaptMode(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ca4359e", new Object[]{this, context, str, new Boolean(z)})).booleanValue() : context != null && z && !isExcludedPadAdaptTpl(str) && checkCurrentIsBigScreen() && UIUtil.isQuickPayTpl(str) && !UIUtil.isPadHuaweiMultiWindow(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (android.text.TextUtils.equals("Y", r5.getString(r6)) != false) goto L_0x0067;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[Catch: Exception -> 0x003d, TRY_LEAVE, TryCatch #0 {Exception -> 0x003d, blocks: (B:6:0x001f, B:8:0x002c, B:10:0x0032, B:15:0x003f, B:17:0x0048, B:20:0x004f, B:22:0x0059), top: B:29:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean getConfigValue(java.lang.String r5, java.lang.String r6, android.content.Context r7) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.android.msp.framework.ext.MspExtSceneManager.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = "32df3b18"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r5 = 2
            r4[r5] = r7
            java.lang.Object r5 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x001f:
            com.alipay.android.msp.framework.drm.DrmManager r7 = com.alipay.android.msp.framework.drm.DrmManager.getInstance(r7)     // Catch: Exception -> 0x003d
            java.lang.String r2 = "pad_adpat_template_metadata"
            com.alibaba.fastjson.JSONObject r7 = r7.getDrmValueFromKey(r2)     // Catch: Exception -> 0x003d
            if (r7 == 0) goto L_0x003f
            boolean r2 = r7.containsKey(r5)     // Catch: Exception -> 0x003d
            if (r2 == 0) goto L_0x003f
            com.alibaba.fastjson.JSONObject r2 = r7.getJSONObject(r5)     // Catch: Exception -> 0x003d
            boolean r2 = r2.containsKey(r6)     // Catch: Exception -> 0x003d
            if (r2 != 0) goto L_0x0046
            goto L_0x003f
        L_0x003d:
            r5 = move-exception
            goto L_0x006a
        L_0x003f:
            java.lang.String r7 = "{\"QUICKPAY@cashier-unify-activity-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@bizapp-collect-money\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-card-no-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-card-type-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@sharepay-apply-delivery\": {\"full_screen\": \"Y\"},\"QUICKPAY@mdeduct-payandsign-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setting-payments-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@message-result-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-card-detail-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-card-select-bank-flex\": {\"full_screen\": \"Y\", \"x\": \"Y\"},\"QUICKPAY@open-account-auth-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@deposit-index-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-activity-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@deduct-pre-confirm-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-safeprotect-sms\": {\"full_screen\": \"Y\"},\"QUICKPAY@bizapp-store-pay\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-wk-card-new-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-card-no-recorrect-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-sms-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-phone-login-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@frontpay-limit-query-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-wkcard-billaddr-new-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-safeprotect\": {\"full_screen\": \"Y\"},\"QUICKPAY@pwd-validate-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-channel-priority-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setspwd-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-login-new-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-account-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-safeprotect-quiz-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-result-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-default-result-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setting-laboratory-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-activity-default-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@credit-evalute-cashier-unified\": {\"full_screen\": \"Y\"},\"QUICKPAY@credit-afterpaying\": {\"full_screen\": \"Y\"},\"QUICKPAY@sharepay-apply-qrcode-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-peerpay-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@mdeduct-sign-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@credit-afterpaying\": {\"full_screen\": \"Y\"},\"QUICKPAY@credit-evalute-cashier-unified\": {\"full_screen\": \"Y\"},\"QUICKPAY@afterpay-guide-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-transfer-detail-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@fingerprint-open-auth-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@large-box-pay-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-card-inst-select-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@special-account-deposit-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-phone-modification-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-new-wk-card-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@sharepay-common-search-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@sharepay-common-apply-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@credit-afterpaying-superpower-template\": {\"full_screen\": \"Y\"},\"QUICKPAY@credit-afterpaying-superpower-exp\": {\"full_screen\": \"Y\"},\"QUICKPAY@mdeduct-agreement-manage-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@waika-select-usa-state-new-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-wkcard-billaddr-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@waika-select-country-and-area-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@sharepay-common-qrcode-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setting-payments-categories-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setting-payments-order-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@waika-select-country-and-area-new-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setting-payments-date-first-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setting-laboratory-guide-flex\":{\"non_pad_adaptable\":\"Y\", \"auto_rotating\": \"Y\"},\"QUICKPAY@sharepay-apply-search\": {\"full_screen\": \"Y\"}}"
            com.alibaba.fastjson.JSONObject r7 = com.alibaba.fastjson.JSON.parseObject(r7)     // Catch: Exception -> 0x003d
        L_0x0046:
            if (r7 == 0) goto L_0x0069
            boolean r2 = r7.containsKey(r5)     // Catch: Exception -> 0x003d
            if (r2 != 0) goto L_0x004f
            goto L_0x0069
        L_0x004f:
            com.alibaba.fastjson.JSONObject r5 = r7.getJSONObject(r5)     // Catch: Exception -> 0x003d
            boolean r7 = r5.containsKey(r6)     // Catch: Exception -> 0x003d
            if (r7 == 0) goto L_0x0066
            java.lang.String r7 = "Y"
            java.lang.String r5 = r5.getString(r6)     // Catch: Exception -> 0x003d
            boolean r5 = android.text.TextUtils.equals(r7, r5)     // Catch: Exception -> 0x003d
            if (r5 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r0 = 0
        L_0x0067:
            r1 = r0
            goto L_0x006d
        L_0x0069:
            return r1
        L_0x006a:
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r5)
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.ext.MspExtSceneManager.getConfigValue(java.lang.String, java.lang.String, android.content.Context):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        if (android.text.TextUtils.equals("Y", r6.getString(r7)) != false) goto L_0x005e;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[Catch: Exception -> 0x0034, TRY_LEAVE, TryCatch #0 {Exception -> 0x0034, blocks: (B:6:0x001f, B:8:0x0023, B:10:0x0029, B:15:0x0036, B:17:0x003f, B:20:0x0046, B:22:0x0050), top: B:29:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.android.msp.framework.ext.MspExtSceneManager.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = "b198ba87"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r6 = 2
            r4[r6] = r7
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001f:
            com.alibaba.fastjson.JSONObject r2 = r5.h     // Catch: Exception -> 0x0034
            if (r2 == 0) goto L_0x0036
            boolean r3 = r2.containsKey(r6)     // Catch: Exception -> 0x0034
            if (r3 == 0) goto L_0x0036
            com.alibaba.fastjson.JSONObject r3 = r2.getJSONObject(r6)     // Catch: Exception -> 0x0034
            boolean r3 = r3.containsKey(r7)     // Catch: Exception -> 0x0034
            if (r3 != 0) goto L_0x003d
            goto L_0x0036
        L_0x0034:
            r6 = move-exception
            goto L_0x0061
        L_0x0036:
            java.lang.String r2 = "{\"QUICKPAY@cashier-unify-activity-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@bizapp-collect-money\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-card-no-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-card-type-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@sharepay-apply-delivery\": {\"full_screen\": \"Y\"},\"QUICKPAY@mdeduct-payandsign-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setting-payments-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@message-result-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-card-detail-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-card-select-bank-flex\": {\"full_screen\": \"Y\", \"x\": \"Y\"},\"QUICKPAY@open-account-auth-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@deposit-index-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-activity-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@deduct-pre-confirm-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-safeprotect-sms\": {\"full_screen\": \"Y\"},\"QUICKPAY@bizapp-store-pay\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-wk-card-new-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-card-no-recorrect-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-sms-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-phone-login-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@frontpay-limit-query-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-wkcard-billaddr-new-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-safeprotect\": {\"full_screen\": \"Y\"},\"QUICKPAY@pwd-validate-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-channel-priority-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setspwd-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-login-new-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-account-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-safeprotect-quiz-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-result-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-default-result-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setting-laboratory-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-activity-default-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@credit-evalute-cashier-unified\": {\"full_screen\": \"Y\"},\"QUICKPAY@credit-afterpaying\": {\"full_screen\": \"Y\"},\"QUICKPAY@sharepay-apply-qrcode-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-peerpay-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@mdeduct-sign-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@credit-afterpaying\": {\"full_screen\": \"Y\"},\"QUICKPAY@credit-evalute-cashier-unified\": {\"full_screen\": \"Y\"},\"QUICKPAY@afterpay-guide-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-transfer-detail-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@fingerprint-open-auth-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@large-box-pay-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-card-inst-select-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@special-account-deposit-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-phone-modification-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-new-wk-card-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@sharepay-common-search-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@sharepay-common-apply-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@credit-afterpaying-superpower-template\": {\"full_screen\": \"Y\"},\"QUICKPAY@credit-afterpaying-superpower-exp\": {\"full_screen\": \"Y\"},\"QUICKPAY@mdeduct-agreement-manage-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@waika-select-usa-state-new-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-wkcard-billaddr-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@waika-select-country-and-area-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@sharepay-common-qrcode-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setting-payments-categories-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setting-payments-order-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@waika-select-country-and-area-new-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setting-payments-date-first-flex\": {\"full_screen\": \"Y\"},\"QUICKPAY@cashier-setting-laboratory-guide-flex\":{\"non_pad_adaptable\":\"Y\", \"auto_rotating\": \"Y\"},\"QUICKPAY@sharepay-apply-search\": {\"full_screen\": \"Y\"}}"
            com.alibaba.fastjson.JSONObject r2 = com.alibaba.fastjson.JSON.parseObject(r2)     // Catch: Exception -> 0x0034
        L_0x003d:
            if (r2 == 0) goto L_0x0060
            boolean r3 = r2.containsKey(r6)     // Catch: Exception -> 0x0034
            if (r3 != 0) goto L_0x0046
            goto L_0x0060
        L_0x0046:
            com.alibaba.fastjson.JSONObject r6 = r2.getJSONObject(r6)     // Catch: Exception -> 0x0034
            boolean r2 = r6.containsKey(r7)     // Catch: Exception -> 0x0034
            if (r2 == 0) goto L_0x005d
            java.lang.String r2 = "Y"
            java.lang.String r6 = r6.getString(r7)     // Catch: Exception -> 0x0034
            boolean r6 = android.text.TextUtils.equals(r2, r6)     // Catch: Exception -> 0x0034
            if (r6 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r0 = 0
        L_0x005e:
            r1 = r0
            goto L_0x0064
        L_0x0060:
            return r1
        L_0x0061:
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r6)
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.ext.MspExtSceneManager.b(java.lang.String, java.lang.String):boolean");
    }

    public static boolean onPadAdaptMode(Context context, MspExtSceneManager mspExtSceneManager, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1a1ed950", new Object[]{context, mspExtSceneManager, str, new Boolean(z)})).booleanValue() : context != null && z && !isExcludedPadAdaptTpl(str, context) && mspExtSceneManager.checkCurrentIsBigScreen() && UIUtil.isQuickPayTpl(str) && !UIUtil.isPadHuaweiMultiWindow(context);
    }

    public int getDisplayWidth(int i, int i2, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6e74602", new Object[]{this, new Integer(i), new Integer(i2), configuration})).intValue();
        }
        int i3 = (int) (i2 * 0.35427135f);
        if (i > i2) {
            i3 = (int) (i * 0.35427135f);
        }
        if (i3 < 750) {
            i3 = 750;
        }
        return (!this.b || UIUtil.isProxyHuaweiMultiWindow(configuration)) ? i : i3;
    }

    public void updateScreenSizeInfo(Configuration configuration, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("898c01e3", new Object[]{this, configuration, context});
        } else if (this.e != null && configuration != null) {
            this.f = this.e.getDisplayMetrics();
            a((int) (configuration.screenWidthDp * UIUtil.getDp(context)), (int) (configuration.screenHeightDp * UIUtil.getDp(context)));
        }
    }
}
