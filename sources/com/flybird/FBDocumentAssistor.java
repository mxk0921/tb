package com.flybird;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.alipay.android.app.template.FBResourceClient;
import com.alipay.android.app.template.LogCatLog;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.platform.Platform;
import com.alipay.birdnest.util.FBLogger;
import com.alipay.birdnest.util.ResUtils;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.antevent.AntEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import com.flybird.FBDocumentAssistor;
import com.flybird.support.basics.AppContextHolder;
import com.flybird.support.basics.KVStorage;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import tb.gwt;
import tb.lse;
import tb.pg1;
import tb.pgh;
import tb.uca;
import tb.vu3;
import tb.zk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBDocumentAssistor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static float f4924a = -1.0f;
    public static float b = -1.0f;
    public static int c = -1;
    public static int d = -1;
    public static int e = -1;
    public static float f = -1.0f;
    public static Map<String, String> g = new ConcurrentHashMap();
    public static float h = -1.0f;
    public static BirdNestEngine.SettingProvider i = null;

    public static void a(Context context) {
        DisplayMetrics displayMetrics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        AppContextHolder.feedAppContext(context);
        GlobalCacheForApi.a();
        float dp = FBTools.getDp(context);
        f4924a = dp;
        float f2 = h;
        if (f2 != -1.0f && Math.abs(dp - f2) > 0.1d) {
            FBLogger.d("FBDocumentAssistor", "screen resolution changed");
            clearDimCache();
        }
        if (b < 0.0f) {
            b = context.getResources().getDisplayMetrics().ydpi;
        }
        h = f4924a;
        DisplayMetrics displayMetrics2 = FBTools.getDisplayMetrics(context);
        c = displayMetrics2.widthPixels;
        d = FBTools.calcScreenHeight(context, displayMetrics2.heightPixels);
        try {
            if (BirdNestEngine.useValueCache) {
                displayMetrics = (DisplayMetrics) uca.c("Conf:DefDisplayMetrics");
            } else {
                displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
            }
            e = FBTools.calcScreenHeight(context, displayMetrics.heightPixels);
        } catch (Throwable th) {
            FBLogger.e("FBDocumentAssistor", th);
        }
    }

    @Deprecated
    public static void b(FBDocument fBDocument, gwt gwtVar, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cfe7fff", new Object[]{fBDocument, gwtVar, new Integer(i2), str});
        } else if (fBDocument.r) {
            a(fBDocument, gwtVar, i2, str);
        }
    }

    public static BirdNestEngine.ThemeColorProvider c(FBDocument fBDocument) {
        BirdNestEngine engine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestEngine.ThemeColorProvider) ipChange.ipc$dispatch("83952442", new Object[]{fBDocument});
        }
        if (fBDocument == null || (engine = fBDocument.getEngine()) == null) {
            return null;
        }
        return engine.getConfig().getThemeColorProvider();
    }

    public static float[] calcTextSize(FBDocument fBDocument, String str, String str2, String str3, float f2, String str4, String str5, int i2, boolean z, float f3, float f4, float f5, float f6, boolean z2) {
        float[] fArr;
        boolean z3;
        Typeface typeface;
        Typeface typeface2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("e88343a3", new Object[]{fBDocument, str, str2, str3, new Float(f2), str4, str5, new Integer(i2), new Boolean(z), new Float(f3), new Float(f4), new Float(f5), new Float(f6), new Boolean(z2)});
        }
        float[] fArr2 = {0.0f, 0.0f};
        if (str2 == null || str2.length() == 0) {
            return fArr2;
        }
        FBLabel fBLabel = fBDocument.G.get(str);
        if (fBLabel == null) {
            fArr = fArr2;
            fBLabel = new FBLabel(fBDocument.k, null, fBDocument);
            fBDocument.G.put(str, fBLabel);
            z3 = false;
        } else {
            fArr = fArr2;
            z3 = true;
        }
        fBLabel.c(z2);
        final TextView textView = (TextView) fBLabel.getInnerView();
        textView.setTextSize(Platform.f, f2);
        if (!TextUtils.isEmpty(str3) && (typeface2 = FontCache.getTypeface(fBDocument.k, str3)) != null) {
            textView.setTypeface(typeface2);
        }
        if (i2 > 0) {
            textView.setMaxLines(i2);
        }
        if (z) {
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        if (str4.equals("bold")) {
            textView.getPaint().setFakeBoldText(true);
        }
        if (str5.equals(pg1.ATOM_EXT_UDL_line_through)) {
            textView.getPaint().setFlags(textView.getPaint().getFlags() | 16);
        } else if (str5.equals(pg1.ATOM_EXT_underline)) {
            textView.getPaint().setFlags(textView.getPaint().getFlags() | 8);
        }
        fBLabel.H = str2;
        fBLabel.d();
        int i3 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if (i3 > 0) {
            textView.setLineSpacing(f3, 1.0f);
        }
        if (f4 > 0.0f) {
            a(fBDocument, textView, f4);
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            textView.post(new Runnable() { // from class: com.flybird.FBDocumentAssistor.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        textView.requestLayout();
                    }
                }
            });
        } else {
            textView.requestLayout();
        }
        if (z3) {
            TextView textView2 = new TextView(fBDocument.getContext());
            textView2.setTextSize(Platform.f, f2);
            if (!TextUtils.isEmpty(str3) && (typeface = FontCache.getTypeface(fBDocument.k, str3)) != null) {
                textView2.setTypeface(typeface);
            }
            if (i2 > 0) {
                textView2.setMaxLines(i2);
            }
            if (z) {
                textView2.setEllipsize(TextUtils.TruncateAt.END);
            }
            if (str4.equals("bold")) {
                textView2.getPaint().setFakeBoldText(true);
            }
            if (str5.equals(pg1.ATOM_EXT_UDL_line_through)) {
                textView2.getPaint().setFlags(textView.getPaint().getFlags() | 16);
            } else if (str5.equals(pg1.ATOM_EXT_underline)) {
                textView2.getPaint().setFlags(textView.getPaint().getFlags() | 8);
            }
            if (i3 > 0) {
                textView2.setLineSpacing(f3, 1.0f);
            }
            textView2.setText(textView.getText());
            textView2.measure(View.MeasureSpec.makeMeasureSpec((int) Math.min(f6, f5), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            fArr[0] = textView2.getMeasuredWidth();
            fArr[1] = textView2.getMeasuredHeight();
            return fArr;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec((int) Math.min(f6, f5), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        fArr[0] = textView.getMeasuredWidth();
        fArr[1] = textView.getMeasuredHeight();
        return fArr;
    }

    public static native int clearDimCache();

    public static void coreMessageLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae2704d", new Object[]{str});
        } else {
            LoggerFactory.getTraceLogger().debug("Birdnest", str);
        }
    }

    public static CountDownTimer createTimer(final FBDocument fBDocument, final int i2, final boolean z, final long j) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CountDownTimer) ipChange.ipc$dispatch("e5760484", new Object[]{fBDocument, new Integer(i2), new Boolean(z), new Long(j)});
        }
        long j3 = i2;
        if (z) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j3;
        }
        FBLogger.d("FBDocumentAssistor", "create timer: interval:" + i2 + ", repeats: " + z + "--------templateId: " + fBDocument.getTid());
        CountDownTimer countDownTimer = new CountDownTimer(j2, j3) { // from class: com.flybird.FBDocumentAssistor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/flybird/FBDocumentAssistor$1");
            }

            @Override // com.flybird.CountDownTimer
            public void onFinish() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("badeed9", new Object[]{this});
                    return;
                }
                FBDocument fBDocument2 = fBDocument;
                if (fBDocument2.k == null) {
                    cancel();
                } else if (fBDocument2.mCore != 0) {
                    FBDocumentAssistor.nativeOnTimer(fBDocument.mCore, j);
                } else {
                    cancel();
                }
            }

            @Override // com.flybird.CountDownTimer
            public void onTick(long j4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j4)});
                    return;
                }
                FBDocument fBDocument2 = fBDocument;
                if (fBDocument2.k == null) {
                    cancel();
                } else if (z && fBDocument2.mCore != 0) {
                    FBDocumentAssistor.nativeOnTimer(fBDocument.mCore, j);
                    FBLogger.d("FBDocumentAssistor", "onTick: interval:" + i2 + ", repeats: " + z + "--------templateId: " + fBDocument.getTid());
                } else if (fBDocument.mCore == 0) {
                    cancel();
                }
            }
        };
        if (fBDocument.isOnloadFinish()) {
            countDownTimer.start();
        }
        fBDocument.H.add(countDownTimer);
        return countDownTimer;
    }

    public static int destroyTimer(final FBDocument fBDocument, final CountDownTimer countDownTimer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91924176", new Object[]{fBDocument, countDownTimer})).intValue();
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            fBDocument.b0.post(new Runnable() { // from class: com.flybird.FBDocumentAssistor.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        FBDocumentAssistor.a(FBDocument.this, countDownTimer);
                    } catch (Throwable th) {
                        LogCatLog.e("FBDocumentAssistor", th);
                    }
                }
            });
        } else {
            a(fBDocument, countDownTimer);
        }
        return 0;
    }

    public static String getAppLocale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f41abef4", new Object[0]);
        }
        IpChange ipChange2 = Platform.$ipChange;
        FBLogger.d("FBDocumentAssistor", "current locale: null");
        return null;
    }

    public static Map<String, String> getCachedAssetsMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c7e415dd", new Object[0]);
        }
        return g;
    }

    public static int getCurrentNetworkEnvironment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc2d7222", new Object[0])).intValue();
        }
        Integer num = (Integer) uca.c("App:RpcEnv");
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static float getDefaultFontSize(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cb90239", new Object[]{fBDocument})).floatValue();
        }
        if (!(f != -1.0f || fBDocument == null || fBDocument.k == null)) {
            try {
                f = new TextView(fBDocument.k).getTextSize() / f4924a;
            } catch (Throwable unused) {
                f = 14.0f;
            }
        }
        return f;
    }

    public static float getDp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15fb8df9", new Object[0])).floatValue();
        }
        return f4924a;
    }

    public static String getFbVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ab118f3", new Object[0]);
        }
        return BirdNestEngine.getVersion();
    }

    public static BirdNestEngine.SettingProvider getGlobalSettingProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestEngine.SettingProvider) ipChange.ipc$dispatch("45dc772a", new Object[0]);
        }
        return i;
    }

    public static boolean getGlobalSwitch(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53d49a", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        String globalSwitchRaw = getGlobalSwitchRaw(str);
        return TextUtils.isEmpty(globalSwitchRaw) ? z : "true".equalsIgnoreCase(globalSwitchRaw);
    }

    public static String getGlobalSwitchRaw(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e17c014", new Object[]{str});
        }
        IpChange ipChange2 = Platform.$ipChange;
        if (getGlobalSettingProvider() != null) {
            str2 = getGlobalSettingProvider().getRawSwitch(str, "");
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return str2;
    }

    public static String getLocale(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("755cca62", new Object[]{fBDocument});
        }
        if (fBDocument == null || fBDocument.getEngine() == null) {
            return "zh_CN";
        }
        BirdNestEngine engine = fBDocument.getEngine();
        if (engine.getConfig() == null || engine.getConfig().getSettingProvider() == null) {
            return "zh_CN";
        }
        return engine.getConfig().getSettingProvider().getLocale();
    }

    public static String getQueryExternalLocale(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("731dc098", new Object[]{str});
        }
        FBLogger.d("FBDocumentAssistor", "getQueryExternalLocale#configKey: " + str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            IpChange ipChange2 = Platform.$ipChange;
            FBLogger.d("FBDocumentAssistor", "map is null");
            return null;
        } catch (Throwable th) {
            FBLogger.e("FBDocumentAssistor", th);
            return null;
        }
    }

    public static float getScreenHeight(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("917ef447", new Object[]{fBDocument})).floatValue();
        }
        if (fBDocument == null) {
            return d;
        }
        int[] iArr = fBDocument.screenSize;
        if (iArr[1] <= 0) {
            iArr[1] = d;
        }
        return iArr[1];
    }

    public static float getScreenWidth(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88f98622", new Object[]{fBDocument})).floatValue();
        }
        if (fBDocument == null) {
            return c;
        }
        int[] iArr = fBDocument.screenSize;
        if (iArr[0] <= 0) {
            iArr[0] = c;
        }
        return iArr[0];
    }

    public static String getUid() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea2ce1f", new Object[0]);
        }
        try {
            Pair a2 = uca.a("User:UserInfoId");
            if (!((Boolean) a2.first).booleanValue() || (obj = a2.second) == null) {
                obj = "";
            }
            return (String) obj;
        } catch (Throwable th) {
            pgh.j("FBDocumentAssistor", "uid failed", th);
            return "";
        }
    }

    public static String getUtdid() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[0]);
        }
        try {
            Pair a2 = uca.a("User:UtdidOrEquiv");
            if (!((Boolean) a2.first).booleanValue() || (obj = a2.second) == null) {
                obj = "";
            }
            return (String) obj;
        } catch (Throwable th) {
            pgh.j("FBDocumentAssistor", "utdid failed", th);
            return "";
        }
    }

    public static float getVisibleScreenHeight(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c37332d", new Object[]{fBDocument})).floatValue();
        }
        return e;
    }

    public static float getYdpi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4338631", new Object[0])).floatValue();
        }
        return b;
    }

    public static boolean isAlipayAnd2G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2aeef43", new Object[0])).booleanValue();
        }
        IpChange ipChange2 = Platform.$ipChange;
        return false;
    }

    public static native int nativeOnTimer(long j, long j2);

    public static void platformConsoleLog(FBDocument fBDocument, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd33a38", new Object[]{fBDocument, str});
        } else {
            pgh.k(fBDocument.getTid(), str);
        }
    }

    public static void postAccessibilityEvent(final FBDocument fBDocument, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de68dedf", new Object[]{fBDocument, str, new Integer(i2)});
            return;
        }
        pgh.b("FBDocumentAssistor", "sendAccessibilityEvent, content: " + str + ", intType: " + i2);
        if (fBDocument != null) {
            try {
                if (!TextUtils.isEmpty(str) && i2 == 0) {
                    final AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                    obtain.getText().clear();
                    obtain.getText().add(str);
                    final AccessibilityManager accessibilityManager = (AccessibilityManager) AppContextHolder.f5004a.getSystemService("accessibility");
                    fBDocument.b0.post(new Runnable() { // from class: tb.lu8
                        @Override // java.lang.Runnable
                        public final void run() {
                            FBDocumentAssistor.a(FBDocument.this, accessibilityManager, obtain);
                        }
                    });
                }
            } catch (Throwable th) {
                pgh.e("FBDocumentAssistor", "sendAccessibilityEvent1, error: " + th.getMessage());
            }
        }
    }

    public static void putAssetRes(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b11eda", new Object[]{str, str2});
        } else {
            g.put(str, str2);
        }
    }

    public static String readAssertFile(FBDocument fBDocument, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a94d7d90", new Object[]{fBDocument, str});
        }
        gwt a2 = a(fBDocument);
        if (g.containsKey(str)) {
            return g.get(str);
        }
        if (TextUtils.isEmpty(str)) {
            a(fBDocument, a2, 21, "Ast:readAsset_none");
            return "";
        }
        int indexOf = str.indexOf("/");
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1, str.length());
            if (g.containsKey(substring)) {
                a(fBDocument, a2, 21, "Ast:readAsset_cache");
                return g.get(substring);
            }
        } else {
            Resources resources = fBDocument.j;
            if (resources != null) {
                str2 = FBTools.readAssetsFileWithManager(str, resources.getAssets());
                if (!TextUtils.isEmpty(str2)) {
                    a(fBDocument, a2, 21, "Ast:readAsset_asset");
                    return str2;
                }
            }
        }
        FBResourceClient fBResourceClient = fBDocument.param.resourceClient;
        if (fBResourceClient != null && !TextUtils.isEmpty(str)) {
            Object shouldInterceptResource = fBResourceClient.shouldInterceptResource(str, FBResourceClient.Type.STRING);
            if (shouldInterceptResource != null) {
                str2 = String.valueOf(shouldInterceptResource);
            } else {
                str2 = "";
            }
            if (!TextUtils.isEmpty(str2)) {
                a(fBDocument, a2, 21, "Ast:readAsset_client");
                return str2;
            }
        }
        String str3 = null;
        Object resource = fBDocument.getEngine().getConfig().getResourceProvider().getResource(fBDocument.k, str, fBDocument.param.bundleName, null);
        if (resource != null) {
            str3 = String.valueOf(resource);
        }
        if (TextUtils.isEmpty(str3)) {
            str2 = FBTools.readAssetsFile(str, fBDocument.k);
        } else {
            str2 = str3;
        }
        if (!TextUtils.isEmpty(str2)) {
            g.put(str, str2);
        }
        a(fBDocument, a2, 21, "Ast:readAsset_provider");
        return str2;
    }

    public static void setAbnormal(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a53ae5", new Object[]{str, str2});
        } else {
            IpChange ipChange2 = Platform.$ipChange;
        }
    }

    public static void setGlobalSettingProvider(BirdNestEngine.SettingProvider settingProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("124886c6", new Object[]{settingProvider});
        } else {
            i = settingProvider;
        }
    }

    public static double tokenGetValueOfScale(FBDocument fBDocument, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("299c9ee5", new Object[]{fBDocument, str})).doubleValue();
        }
        if (str == null) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        int i2 = 4;
        if (!str.equals("font-scale")) {
            if (!str.equals("content-scale")) {
                return vu3.b.GEO_NOT_SUPPORT;
            }
            if (!Platform.g()) {
                return 1.0d;
            }
            double[] dArr = Platform.c;
            if (4 >= dArr.length) {
                i2 = dArr.length - 1;
            }
            return dArr[i2];
        } else if (!Platform.g()) {
            return 1.0d;
        } else {
            double[] dArr2 = Platform.c;
            if (4 >= dArr2.length) {
                i2 = dArr2.length - 1;
            }
            return dArr2[i2];
        }
    }

    public static int b(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("463e8603", new Object[]{fBDocument})).intValue();
        }
        if (fBDocument == null) {
            return 0;
        }
        return fBDocument.E;
    }

    public static void c(FBDocument fBDocument, gwt gwtVar, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("447a59c0", new Object[]{fBDocument, gwtVar, new Integer(i2), str});
        } else if (fBDocument != null && gwtVar != null) {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            gwtVar.a();
            Platform.a(1, i2, timeUnit.convert(SystemClock.elapsedRealtimeNanos() - gwtVar.f20276a, TimeUnit.NANOSECONDS), fBDocument.getTid(), str, null);
        }
    }

    public static void recordEvent(String str, String str2, String... strArr) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d8becbb", new Object[]{str, str2, strArr});
            return;
        }
        IpChange ipChange2 = Platform.$ipChange;
        try {
            AntEvent.Builder builder = new AntEvent.Builder();
            builder.setEventID(str);
            builder.setBizType("birdnest");
            builder.setLoggerLevel(1);
            while (i2 < strArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("fb_arg");
                int i3 = i2 + 1;
                sb.append(i3);
                builder.addExtParam(sb.toString(), strArr[i2]);
                i2 = i3;
            }
            builder.addExtParam("tpl_id", str2);
            builder.addExtParam("fb_version", Platform.f3819a);
            AntEvent build = builder.build();
            if (BirdNestEngine.useLogBatch) {
                BirdNestEngine.eventBatchRunner.c(build);
            } else {
                build.send();
            }
        } catch (Exception unused) {
        }
    }

    public static float[] getImageSize(FBDocument fBDocument, String str, String str2) {
        BirdNestEngine.ResourceProvider resourceProvider;
        Object resource;
        BirdNestEngine.Params params;
        FBResourceClient fBResourceClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("27d365d9", new Object[]{fBDocument, str, str2});
        }
        gwt a2 = a(fBDocument);
        float[] fArr = {0.0f, 0.0f};
        try {
            if (!TextUtils.isEmpty(str2) && !"undefined".equals(str2)) {
                if (!str2.startsWith("http") && !str2.startsWith("https") && !str2.startsWith("www")) {
                    Context context = fBDocument.k;
                    Drawable drawable = null;
                    Drawable drawable2 = TextUtils.equals("indicatior", str2) ? context.getResources().getDrawable(ResUtils.getDrawableId(context, "alipay_msp_indicatior_loading")) : null;
                    if (drawable2 == null && (params = fBDocument.param) != null && (fBResourceClient = params.resourceClient) != null && !TextUtils.isEmpty(str2)) {
                        FBLogger.d("FBDocumentAssistor", "offline pkg intercept res(getimagesize) ".concat(str2));
                        Object shouldInterceptResource = fBResourceClient.shouldInterceptResource(str2, FBResourceClient.Type.DRAWABLE);
                        if (shouldInterceptResource != null) {
                            drawable = (Drawable) shouldInterceptResource;
                        }
                        if (drawable != null) {
                            fArr[0] = drawable.getIntrinsicWidth();
                            fArr[1] = drawable.getIntrinsicHeight();
                            a(fBDocument, a2, 21, "Ast:imgSize_param");
                            return fArr;
                        }
                        drawable2 = drawable;
                    }
                    if (drawable2 == null && (resourceProvider = fBDocument.getEngine().getConfig().getResourceProvider()) != null && (resource = resourceProvider.getResource(fBDocument.k, str2, fBDocument.param.bundleName, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS)) != null && (resource instanceof Drawable)) {
                        drawable2 = (Drawable) resource;
                    }
                    if (drawable2 == null) {
                        FBLogger.e("FBDocumentAssistor", "FATAL ERROR!, The image(src: " + str2 + ") is not existed!");
                    } else {
                        fArr[0] = drawable2.getIntrinsicWidth();
                        fArr[1] = drawable2.getIntrinsicHeight();
                    }
                    a(fBDocument, a2, 21, "Ast:imgSize_noParam");
                }
                FBImg fBImg = (FBImg) fBDocument.findViewById(str);
                if (fBImg != null) {
                    fArr[0] = fBImg.mWidth;
                    fArr[1] = fBImg.mHeight;
                }
                a(fBDocument, a2, 21, "Ast:imgSize_noParam");
            }
            return fArr;
        } catch (Throwable unused) {
            a(fBDocument, a2, 21, "Ast:imgSize_err");
            return fArr;
        }
    }

    public static boolean tokenGetEnv(FBDocument fBDocument, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fcf0c0c", new Object[]{fBDocument, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        Context context = fBDocument.getContext();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 3228:
                if (str.equals("ea")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3445:
                if (str.equals("la")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3075958:
                if (str.equals(ThemeUtils.COLOR_SCHEME_DARK)) {
                    c2 = 2;
                    break;
                }
                break;
            case 99465916:
                if (str.equals("horiz")) {
                    c2 = 3;
                    break;
                }
                break;
            case 115864556:
                if (str.equals("zhang")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                IpChange ipChange2 = Platform.$ipChange;
                return true;
            case 1:
                IpChange ipChange3 = Platform.$ipChange;
                return false;
            case 2:
                return (fBDocument.E & 1) != 0;
            case 3:
                return context.getResources().getConfiguration().orientation == 2;
            case 4:
                return Platform.g();
            default:
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (r9.equals("scr-sp") == false) goto L_0x0033;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double tokenGetPxOfUnit(com.flybird.FBDocument r8, java.lang.String r9) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.flybird.FBDocumentAssistor.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "bb0ab0c6"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r8
            r2[r0] = r9
            java.lang.Object r8 = r3.ipc$dispatch(r4, r2)
            java.lang.Number r8 = (java.lang.Number) r8
            double r8 = r8.doubleValue()
            return r8
        L_0x001c:
            r3 = 0
            if (r9 != 0) goto L_0x0021
            return r3
        L_0x0021:
            java.lang.String r8 = "Conf:CtxDisplayMetrics"
            java.lang.Object r8 = tb.uca.c(r8)
            android.util.DisplayMetrics r8 = (android.util.DisplayMetrics) r8
            r5 = 1120403456(0x42c80000, float:100.0)
            r6 = -1
            int r7 = r9.hashCode()
            switch(r7) {
                case -907743597: goto L_0x0062;
                case -907743256: goto L_0x0058;
                case -907743132: goto L_0x004c;
                case 2568: goto L_0x0041;
                case 3592: goto L_0x0035;
                default: goto L_0x0033;
            }
        L_0x0033:
            r0 = -1
            goto L_0x006d
        L_0x0035:
            java.lang.String r0 = "px"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x003f
            goto L_0x0033
        L_0x003f:
            r0 = 4
            goto L_0x006d
        L_0x0041:
            java.lang.String r0 = "PX"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x004a
            goto L_0x0033
        L_0x004a:
            r0 = 3
            goto L_0x006d
        L_0x004c:
            java.lang.String r0 = "scr-wp"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0056
            goto L_0x0033
        L_0x0056:
            r0 = 2
            goto L_0x006d
        L_0x0058:
            java.lang.String r1 = "scr-sp"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x006d
            goto L_0x0033
        L_0x0062:
            java.lang.String r0 = "scr-hp"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x006c
            goto L_0x0033
        L_0x006c:
            r0 = 0
        L_0x006d:
            switch(r0) {
                case 0: goto L_0x009b;
                case 1: goto L_0x0082;
                case 2: goto L_0x007a;
                case 3: goto L_0x0077;
                case 4: goto L_0x0071;
                default: goto L_0x0070;
            }
        L_0x0070:
            return r3
        L_0x0071:
            if (r8 == 0) goto L_0x0076
            float r8 = r8.density
            double r3 = (double) r8
        L_0x0076:
            return r3
        L_0x0077:
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            return r8
        L_0x007a:
            if (r8 == 0) goto L_0x0081
            int r8 = r8.widthPixels
            float r8 = (float) r8
            float r8 = r8 / r5
            double r3 = (double) r8
        L_0x0081:
            return r3
        L_0x0082:
            if (r8 == 0) goto L_0x009a
            int r9 = r8.widthPixels
            int r9 = r9 * r9
            float r9 = (float) r9
            r0 = 0
            float r9 = r9 + r0
            int r8 = r8.heightPixels
            int r8 = r8 * r8
            float r8 = (float) r8
            float r9 = r9 + r8
            double r8 = (double) r9
            double r8 = java.lang.Math.sqrt(r8)
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r8 / r0
        L_0x009a:
            return r3
        L_0x009b:
            if (r8 == 0) goto L_0x00a2
            int r8 = r8.heightPixels
            float r8 = (float) r8
            float r8 = r8 / r5
            double r3 = (double) r8
        L_0x00a2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBDocumentAssistor.tokenGetPxOfUnit(com.flybird.FBDocument, java.lang.String):double");
    }

    public static int a(FBDocument fBDocument, CountDownTimer countDownTimer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54a846c", new Object[]{fBDocument, countDownTimer})).intValue();
        }
        if (countDownTimer != null) {
            countDownTimer.cancel();
            FBLogger.d("FBDocumentAssistor", "cancel timer: " + countDownTimer + "--------templateId: " + fBDocument.getTid());
            fBDocument.H.remove(countDownTimer);
        }
        return 0;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return jSONObject.has("data") ? jSONObject.getString("data") : str;
        } catch (JSONException e2) {
            FBLogger.e("FBDocumentAssistor", e2);
            return str;
        }
    }

    public static void a(FBDocument fBDocument, TextView textView, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94e86cb", new Object[]{fBDocument, textView, new Float(f2)});
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int dp = (int) (FBTools.getDp(fBDocument.k) * f2);
        if (dp > i2) {
            int i3 = dp - i2;
            textView.setLineSpacing(i3, 1.0f);
            textView.setPadding(0, i3, 0, 0);
        }
    }

    public static gwt a(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gwt) ipChange.ipc$dispatch("4296a99d", new Object[]{fBDocument});
        }
        if (fBDocument == null || !fBDocument.r) {
            return null;
        }
        return new gwt();
    }

    public static void a(FBDocument fBDocument, gwt gwtVar, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f582a63e", new Object[]{fBDocument, gwtVar, new Integer(i2), str});
        } else if (fBDocument != null && gwtVar != null) {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            gwtVar.a();
            Platform.a(1, i2, timeUnit.convert(gwtVar.e(), TimeUnit.NANOSECONDS), fBDocument.getTid(), str, null);
        }
    }

    public static String a(lse lseVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d964f96b", new Object[]{lseVar, str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = lseVar.f23541a.get(str);
        return (str2 != null || !z) ? str2 : KVStorage.getKeyValue("fb__kv_js_storage", str);
    }

    public static void a(lse lseVar, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8205310b", new Object[]{lseVar, str, str2, new Boolean(z)});
        } else if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                synchronized (lseVar.f23541a) {
                    lseVar.f23541a.put(str, str2);
                }
                if (z) {
                    KVStorage.setKeyValue("fb__kv_js_storage", str, str2);
                }
            } else if (str.endsWith("*")) {
                String substring = str.substring(0, str.length() - 1);
                synchronized (lseVar.f23541a) {
                    try {
                        Iterator<Map.Entry<String, String>> it = lseVar.f23541a.entrySet().iterator();
                        while (it.hasNext()) {
                            if (it.next().getKey().startsWith(substring)) {
                                it.remove();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    KVStorage.deleteKeysWithPrefix("fb__kv_js_storage", substring);
                }
            } else {
                lseVar.f23541a.remove(str);
                if (z) {
                    KVStorage.setKeyValue("fb__kv_js_storage", str, null);
                }
            }
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        pgh.e("FBDocumentAssistor", "sendJsExceptionBroadcast, tplId: " + str + ", js exception:" + str2 + "script:" + str3);
        try {
            LocalBroadcastManager instance = LocalBroadcastManager.getInstance(AppContextHolder.f5004a);
            Intent intent = new Intent();
            intent.setAction("com.flybird.js.exception");
            intent.putExtra("exception", str2);
            intent.putExtra("script", str3);
            intent.putExtra("tplId", str);
            instance.sendBroadcast(intent);
        } catch (Throwable unused) {
        }
    }

    public static void a(FBDocument fBDocument, AccessibilityManager accessibilityManager, AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e347da2", new Object[]{fBDocument, accessibilityManager, accessibilityEvent});
            return;
        }
        try {
            FBView bodyView = fBDocument.getBodyView();
            View innerView = bodyView != null ? bodyView.getInnerView() : null;
            if (innerView == null) {
                Context context = fBDocument.getContext();
                if (context instanceof Activity) {
                    innerView = ((Activity) context).getWindow().getDecorView().getRootView();
                }
            }
            pgh.b("FBDocumentAssistor", "sendAccessibilityEvent from " + innerView);
            if (innerView != null && accessibilityManager != null && accessibilityManager.isEnabled()) {
                accessibilityEvent.setSource(innerView);
                accessibilityEvent.setClassName(innerView.getClass().getName());
                accessibilityEvent.setPackageName(AppContextHolder.f5004a.getPackageName());
                pgh.b("FBDocumentAssistor", "sendAccessibilityEvent: " + accessibilityEvent);
                accessibilityManager.sendAccessibilityEvent(accessibilityEvent);
            }
        } catch (Throwable th) {
            pgh.e("FBDocumentAssistor", "sendAccessibilityEvent2, error: " + th.getMessage());
        }
    }
}
