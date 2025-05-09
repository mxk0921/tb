package com.alipay.android.msp.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.birdnest.api.MspConstants;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.template.JSPlugin;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.birdnest.render.api.MspRender;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import tb.pg1;
import tb.slo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Utils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String mCellInfo;
    private static long mGetCellTime;
    private static Boolean mIsRootDevice;

    public static String bundle2string(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8eb31654", new Object[]{bundle});
        }
        if (bundle == null) {
            return null;
        }
        String str = "Bundle{";
        try {
            for (String str2 : bundle.keySet()) {
                str = str + " " + str2 + " => " + bundle.get(str2) + ";";
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return str + " }Bundle";
    }

    public static Bundle cleanParams(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("de592822", new Object[]{bundle});
        }
        bundle.remove(Constants.VI_ENGINE_VERIFYID);
        bundle.remove("token");
        bundle.remove("bizName");
        bundle.remove(Constants.VI_ENGINE_VERIFY_TYPE);
        bundle.remove("logonId");
        bundle.remove("sceneId");
        bundle.remove("bizId");
        bundle.remove(Constants.VI_ENGINE_FAST_BIZDATA);
        bundle.remove(Constants.VI_ENGINE_FAST_MODULENAME);
        bundle.remove("moduleData");
        return bundle;
    }

    private static boolean findBinary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c0c66a5", new Object[0])).booleanValue();
        }
        String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i = 0; i < 8; i++) {
            String str = strArr[i];
            if (new File(str + "su").exists()) {
                return true;
            }
        }
        return false;
    }

    public static JSONObject frameTplInfo2CommonTplInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("391a0897", new Object[]{jSONObject});
        }
        if (!jSONObject.containsKey("data")) {
            jSONObject.put("data", (Object) new JSONObject());
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (!jSONObject2.containsKey(MspConstants.bannerKey.MQP_TOKEN)) {
            jSONObject2.put(MspConstants.bannerKey.MQP_TOKEN, (Object) Long.valueOf(jSONObject.hashCode() + System.currentTimeMillis()));
        }
        jSONObject.put("data", (Object) jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        try {
            JSONObject jSONObject4 = jSONObject.getJSONObject("tplInfo");
            String string = jSONObject4.getString("tplHash");
            String string2 = jSONObject4.getString("tplId");
            if (!TextUtils.isEmpty(string) && !string2.contains(string) && !string2.contains("paycode-guide-banner") && !TextUtils.equals("true", PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_frame_tplhash_degrade"))) {
                string2 = string2 + "_" + string;
            }
            jSONObject3.put(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID, (Object) string2);
            if (TextUtils.isEmpty(jSONObject4.getString("tplVersion"))) {
                jSONObject4.put("tplVersion", "5.4.9");
            }
            if (TextUtils.isEmpty(jSONObject4.getString("time"))) {
                jSONObject4.put("time", "0001");
            }
            if (TextUtils.isEmpty(jSONObject4.getString("platform"))) {
                jSONObject4.put("platform", "android");
            }
            if (TextUtils.isEmpty(jSONObject4.getString("publishVersion"))) {
                jSONObject4.put("publishVersion", "150924");
            }
            jSONObject4.put("tplId", (Object) string2);
            jSONObject3.put("tpl", (Object) jSONObject4);
            jSONObject3.put("data", jSONObject.get("data"));
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return jSONObject3;
    }

    public static String[] getActionParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("768827f2", new Object[]{str});
        }
        int indexOf = str.indexOf(40) + 1;
        int lastIndexOf = str.lastIndexOf(41);
        if (indexOf == 0 || lastIndexOf == -1) {
            return null;
        }
        String[] split = str.substring(indexOf, lastIndexOf).split("' *, *'", -1);
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i])) {
                split[i] = split[i].trim().replaceAll("'", "").replaceAll("\"", "");
            }
        }
        return split;
    }

    public static synchronized int getBizId(String str) {
        synchronized (Utils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e7707c5c", new Object[]{str})).intValue();
            }
            return (str + System.currentTimeMillis() + new Random().nextInt(1000)).hashCode();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:11:0x002c, B:13:0x0032, B:17:0x0038, B:19:0x0042, B:21:0x0045, B:23:0x0056, B:25:0x005e, B:27:0x0070, B:30:0x0075, B:32:0x007b, B:34:0x007f, B:35:0x008a, B:37:0x008e, B:39:0x009e), top: B:43:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:11:0x002c, B:13:0x0032, B:17:0x0038, B:19:0x0042, B:21:0x0045, B:23:0x0056, B:25:0x005e, B:27:0x0070, B:30:0x0075, B:32:0x007b, B:34:0x007f, B:35:0x008a, B:37:0x008e, B:39:0x009e), top: B:43:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getCellInfo(android.content.Context r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.utils.Utils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "9c51c9c5"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r8
            java.lang.Object r8 = r0.ipc$dispatch(r1, r2)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L_0x0015:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = com.alipay.android.msp.utils.Utils.mGetCellTime
            long r2 = r0 - r2
            r4 = 15000(0x3a98, double:7.411E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0026
            java.lang.String r8 = com.alipay.android.msp.utils.Utils.mCellInfo
            return r8
        L_0x0026:
            com.alipay.android.msp.utils.Utils.mGetCellTime = r0
            java.lang.String r0 = "-1;-1"
            com.alipay.android.msp.utils.Utils.mCellInfo = r0
            boolean r0 = shouldGetCellInfo(r8)     // Catch: Exception -> 0x0035
            if (r0 != 0) goto L_0x0038
            java.lang.String r8 = com.alipay.android.msp.utils.Utils.mCellInfo     // Catch: Exception -> 0x0035
            return r8
        L_0x0035:
            r8 = move-exception
            goto L_0x00b5
        L_0x0038:
            com.alipay.android.msp.plugin.engine.IWalletEngine r0 = com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine.getMspWallet()     // Catch: Exception -> 0x0035
            boolean r0 = r0.isBackgroundRunning(r8)     // Catch: Exception -> 0x0035
            if (r0 == 0) goto L_0x0045
            java.lang.String r8 = com.alipay.android.msp.utils.Utils.mCellInfo     // Catch: Exception -> 0x0035
            return r8
        L_0x0045:
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r8.getSystemService(r0)     // Catch: Exception -> 0x0035
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: Exception -> 0x0035
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            int r1 = androidx.core.content.ContextCompat.checkSelfPermission(r8, r1)     // Catch: Exception -> 0x0035
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            int r8 = androidx.core.content.ContextCompat.checkSelfPermission(r8, r1)     // Catch: Exception -> 0x0035
            if (r8 != 0) goto L_0x007a
        L_0x005e:
            com.alipay.android.msp.plugin.engine.IWalletEngine r8 = com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine.getMspWallet()     // Catch: Exception -> 0x0035
            java.lang.String r1 = "MQP_disable_cell_info_10556"
            java.lang.String r8 = r8.getWalletConfig(r1)     // Catch: Exception -> 0x0035
            java.lang.String r1 = "YES"
            boolean r8 = android.text.TextUtils.equals(r8, r1)     // Catch: Exception -> 0x0035
            if (r8 == 0) goto L_0x0073
            java.lang.String r8 = com.alipay.android.msp.utils.Utils.mCellInfo     // Catch: Exception -> 0x0035
            return r8
        L_0x0073:
            if (r0 == 0) goto L_0x007a
            android.telephony.CellLocation r8 = r0.getCellLocation()     // Catch: Exception -> 0x0035
            goto L_0x007b
        L_0x007a:
            r8 = 0
        L_0x007b:
            boolean r0 = r8 instanceof android.telephony.gsm.GsmCellLocation     // Catch: Exception -> 0x0035
            if (r0 == 0) goto L_0x008a
            android.telephony.gsm.GsmCellLocation r8 = (android.telephony.gsm.GsmCellLocation) r8     // Catch: Exception -> 0x0035
            int r0 = r8.getCid()     // Catch: Exception -> 0x0035
            int r8 = r8.getLac()     // Catch: Exception -> 0x0035
            goto L_0x009e
        L_0x008a:
            boolean r0 = r8 instanceof android.telephony.cdma.CdmaCellLocation     // Catch: Exception -> 0x0035
            if (r0 == 0) goto L_0x009c
            android.telephony.cdma.CdmaCellLocation r8 = (android.telephony.cdma.CdmaCellLocation) r8     // Catch: Exception -> 0x0035
            int r0 = r8.getNetworkId()     // Catch: Exception -> 0x0035
            int r8 = r8.getBaseStationId()     // Catch: Exception -> 0x0035
            r7 = r0
            r0 = r8
            r8 = r7
            goto L_0x009e
        L_0x009c:
            r0 = -1
            r8 = -1
        L_0x009e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: Exception -> 0x0035
            r1.<init>()     // Catch: Exception -> 0x0035
            r1.append(r8)     // Catch: Exception -> 0x0035
            java.lang.String r8 = ";"
            r1.append(r8)     // Catch: Exception -> 0x0035
            r1.append(r0)     // Catch: Exception -> 0x0035
            java.lang.String r8 = r1.toString()     // Catch: Exception -> 0x0035
            com.alipay.android.msp.utils.Utils.mCellInfo = r8     // Catch: Exception -> 0x0035
            goto L_0x00b8
        L_0x00b5:
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r8)
        L_0x00b8:
            java.lang.String r8 = com.alipay.android.msp.utils.Utils.mCellInfo
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.utils.Utils.getCellInfo(android.content.Context):java.lang.String");
    }

    public static String getDefaultLocale(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6deac524", new Object[]{context});
        }
        if (context == null) {
            return Locale.getDefault().toString();
        }
        return context.getResources().getConfiguration().locale.toString();
    }

    public static boolean getDegradeKey(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13273537", new Object[]{str, new Integer(i)})).booleanValue();
        }
        try {
            return getDegradeKey(str, MspContextManager.getInstance().getMspContextByBizId(i));
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    public static DisplayMetrics getDisplayMetrics(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("aeee540d", new Object[]{context});
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    private static boolean getDrmKey(String str, MspContext mspContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ff91bb", new Object[]{str, mspContext, new Boolean(z)})).booleanValue();
        }
        if (mspContext == null) {
            return z;
        }
        try {
            Context context = mspContext.getContext();
            if (context == null) {
                return z;
            }
            return DrmManager.getInstance(context).isDegrade(str, false, context);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return z;
        }
    }

    private static String getFormattedKernelVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a4a78a4", new Object[0]);
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(readLine);
            if (!matcher.matches() || matcher.groupCount() < 4) {
                return "Unavailable";
            }
            return matcher.group(1) + "\n" + matcher.group(2) + " " + matcher.group(3) + "\n" + matcher.group(4);
        } catch (IOException unused) {
            return "Unavailable";
        }
    }

    public static boolean getGrayKey(String str, MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d50fa51", new Object[]{str, mspContext})).booleanValue();
        }
        return getDrmKey(str, mspContext, false);
    }

    public static String getInvokeFromApi(MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c710e989", new Object[]{mspTradeContext});
        }
        String fromApi = mspTradeContext.getPaySession().getFromApi();
        if (!TextUtils.isEmpty(fromApi)) {
            return fromApi;
        }
        return MspGlobalDefine.DIRECT_API;
    }

    public static String getInvokeFromSource(MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63d023fa", new Object[]{mspTradeContext});
        }
        String fromSource = mspTradeContext.getPaySession().getFromSource();
        return !TextUtils.isEmpty(fromSource) ? fromSource : "native";
    }

    public static String getKernelVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60491f4", new Object[0]);
        }
        String formattedKernelVersion = getFormattedKernelVersion();
        int indexOf = formattedKernelVersion.indexOf("-");
        if (indexOf != -1) {
            formattedKernelVersion = formattedKernelVersion.substring(0, indexOf);
        }
        int indexOf2 = formattedKernelVersion.indexOf("\n");
        if (indexOf2 != -1) {
            formattedKernelVersion = formattedKernelVersion.substring(0, indexOf2);
        }
        return "Linux ".concat(String.valueOf(formattedKernelVersion));
    }

    public static String getProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98ee17ab", new Object[0]);
        }
        return "https";
    }

    private static String getRandomString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e176e26e", new Object[]{new Integer(i)});
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            int nextInt = random.nextInt(3);
            if (nextInt == 0) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (nextInt == 1) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (nextInt == 2) {
                sb.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb.toString();
    }

    public static String getScreenResolution(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a23782cd", new Object[]{context});
        }
        DisplayMetrics displayMetrics = getDisplayMetrics(context);
        return String.valueOf(displayMetrics.widthPixels) + "*" + displayMetrics.heightPixels;
    }

    public static String getSignatureString(Signature signature, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3180049", new Object[]{signature, str});
        }
        try {
            byte[] byteArray = signature.toByteArray();
            MessageDigest instance = MessageDigest.getInstance(str);
            if (instance == null) {
                return "";
            }
            byte[] digest = instance.digest(byteArray);
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return "";
        }
    }

    public static String getTriDesKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6c83877", new Object[0]);
        }
        return getRandomString(24);
    }

    public static Bitmap getViewBitmap(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("f535cd5f", new Object[]{view});
        }
        Bitmap bitmap = null;
        try {
            bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            Drawable background = view.getBackground();
            if (background != null) {
                background.draw(canvas);
            } else {
                canvas.drawColor(-1);
            }
            view.draw(canvas);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return bitmap;
    }

    public static boolean greaterThanVersion_Q() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e9a493a", new Object[0])).booleanValue();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 28) {
            return true;
        }
        if (i2 == 28) {
            i = Build.VERSION.PREVIEW_SDK_INT;
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isConfigJsonContainsTarget(String str, String str2, String str3, String str4, String str5) {
        Exception e;
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5c5fc81", new Object[]{str, str2, str3, str4, str5})).booleanValue();
        }
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5) || str2 == null || str2.length() <= 0 || str == null || str.length() <= 0) {
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            JSONArray optJSONArray = jSONObject.optJSONArray(str3);
            JSONArray optJSONArray2 = jSONObject.optJSONArray(str4);
            if (optJSONArray2 != null) {
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    String string = optJSONArray2.getString(i);
                    if (str2.equals(string) || str5.equals(string)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    try {
                        if (str2.equals(optJSONArray.getString(i2))) {
                            return false;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        z2 = z;
                        LogUtil.printExceptionStackTrace(e);
                        return z2;
                    }
                }
            }
            return z;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static boolean isDeviceRooted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20723d4c", new Object[0])).booleanValue();
        }
        if (TextUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_disable_root_10556"), slo.VALUE_YES)) {
            return false;
        }
        Boolean bool = mIsRootDevice;
        if (bool != null) {
            return bool.booleanValue();
        }
        mIsRootDevice = Boolean.FALSE;
        try {
            mIsRootDevice = Boolean.valueOf(findBinary());
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return mIsRootDevice.booleanValue();
    }

    public static boolean isOptmizedSdk(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f7e5bb", new Object[]{str})).booleanValue();
        }
        try {
            String alipaySdkVersion = getAlipaySdkVersion(str);
            if (TextUtils.isEmpty(alipaySdkVersion)) {
                return false;
            }
            String[] split = alipaySdkVersion.split("\\.");
            int intValue = Integer.valueOf(split[2]).intValue();
            int intValue2 = Integer.valueOf(split[3]).intValue();
            int intValue3 = Integer.valueOf(split[4]).intValue();
            if (intValue <= 3 && ((intValue != 3 || intValue2 <= 4) && (intValue != 3 || intValue2 != 4 || intValue3 <= 0))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static String map2string(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ddec2a9", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Map{");
        try {
            for (String str : map.keySet()) {
                sb.append(" ");
                sb.append(str);
                sb.append(" => ");
                sb.append(map.get(str));
                sb.append(";");
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        sb.append(" }Map");
        return sb.toString();
    }

    public static int ordinalIndexOf(String str, String str2, int i) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3cb8ca3", new Object[]{str, str2, new Integer(i)})).intValue();
        }
        int i2 = -1;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -1;
        }
        try {
            int indexOf = str.indexOf(str2);
            while (true) {
                i--;
                if (i <= 0 || indexOf == -1) {
                    return indexOf;
                }
                try {
                    indexOf = str.indexOf(str2, indexOf + 1);
                } catch (Throwable th2) {
                    th = th2;
                    i2 = indexOf;
                    LogUtil.printExceptionStackTrace(th);
                    return i2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void postNotification(Context context, String str, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc289b3", new Object[]{context, str, jSONObject, new Integer(i)});
            return;
        }
        StringBuilder sb = new StringBuilder("notifyHashId@");
        sb.append(str);
        sb.append((jSONObject.toString() + System.currentTimeMillis()).hashCode());
        String sb2 = sb.toString();
        jSONObject.put(MspGlobalDefine.NOTIFY_HASH_ID, (Object) sb2);
        EventBusUtil.postNotification(str, BroadcastUtil.postNotification(str, jSONObject, sb2, context, i));
    }

    private static void putIntoBundle(String str, Object obj, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef846d76", new Object[]{str, obj, bundle});
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Float) {
            bundle.putDouble(str, new BigDecimal(Float.toString(((Float) obj).floatValue())).doubleValue());
        } else if (obj instanceof JSON) {
            bundle.putString(str, ((JSON) obj).toJSONString());
        }
    }

    public static UUID randomUuid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UUID) ipChange.ipc$dispatch("fe3ff3a5", new Object[0]);
        }
        return UUID.randomUUID();
    }

    public static int safeParseInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf01e97c", new Object[]{str, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return i;
        }
    }

    public static void sendToDocument(final EventAction eventAction, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("202c70c0", new Object[]{eventAction, str});
            return;
        }
        if (!JsonUtil.isJsonObjectString(str) && !JsonUtil.isJsonArrayString(str)) {
            str = "{}";
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(eventAction.getBizId());
        if (mspContextByBizId == null || !mspContextByBizId.isUseSafeJsExecute()) {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.utils.Utils.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        FBDocument invokeDoc = EventAction.this.getInvokeDoc();
                        long invokeFunKey = EventAction.this.getInvokeFunKey();
                        if (invokeFunKey != 0) {
                            JSPlugin.sendNativeResult(invokeDoc, invokeFunKey, str);
                        }
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            });
            return;
        }
        try {
            FBDocument invokeDoc = eventAction.getInvokeDoc();
            long invokeFunKey = eventAction.getInvokeFunKey();
            if (invokeFunKey != 0) {
                MspRender.safeSendNativeResult(invokeDoc, invokeFunKey, str);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    private static boolean shouldGetCellInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d125312", new Object[]{context})).booleanValue();
        }
        return DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_NOT_ACQUIRE_CELL_INFO, false, context);
    }

    public static boolean shouldGetLocationInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96a4bc9f", new Object[]{context})).booleanValue();
        }
        return DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_NOT_ACQUIRE_FINE_LOCATION, false, context);
    }

    public static Bundle toBundle(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("b6364850", new Object[]{jSONObject}) : toBundle(null, jSONObject);
    }

    public static String toJsJsonString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8070a032", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replace("\\", "\\\\").replace("\"", "\\\"").replace("'", "\\'").replace("\n", "\\n").replace("\r", "\\r").replace("\f", "\\f").replace("\u2028", "\\u2028").replace("\u2029", "\\u2029");
    }

    public static String trimString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3f537fc", new Object[]{str});
        }
        String str2 = null;
        if (str == null || !str.contains("'")) {
            return null;
        }
        int indexOf = str.indexOf("'");
        int lastIndexOf = str.lastIndexOf("'");
        if (indexOf < lastIndexOf) {
            str2 = str.substring(indexOf + 1, lastIndexOf).replaceAll("'", "");
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public static String truncateString(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a0af265", new Object[]{str, new Integer(i)});
        }
        if (str == null) {
            return "";
        }
        return str.substring(0, Math.min(str.length(), i));
    }

    public static String urlDecode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2495bf52", new Object[]{str});
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DATA, ErrorCode.DATA_URL_DECODE_EXCEPTION, e);
            return "";
        }
    }

    public static String AliyunSlot(String str) {
        String str2;
        Exception e;
        int lastIndexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("769e5b3d", new Object[]{str});
        }
        try {
            lastIndexOf = str.lastIndexOf("&slot=\"");
        } catch (Exception e2) {
            e = e2;
            str2 = str;
        }
        if (lastIndexOf <= 0) {
            return str;
        }
        str2 = str.substring(0, lastIndexOf);
        try {
            EventLogUtil.logPayEvent("103619", "scene", "Utils.AliyunSlot", "order_str", str);
        } catch (Exception e3) {
            e = e3;
            LogUtil.printExceptionStackTrace(e);
            return str2;
        }
        return str2;
    }

    public static void addTaobaoSdkStartFlag(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e2795e", new Object[]{context});
            return;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean(MspGlobalDefine.TAOBAO_SDK_START, true);
        edit.apply();
    }

    private static String getAlipaySdkVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7aaabbd1", new Object[]{str});
        }
        try {
            int indexOf = str.indexOf("bizcontext=");
            if (indexOf < 0) {
                return "";
            }
            JSONObject parseObject = JSON.parseObject(str.substring(indexOf + 12, str.length() - 1));
            if (parseObject.containsKey(BizContext.KEY_SDK_VERSION)) {
                return parseObject.getString(BizContext.KEY_SDK_VERSION);
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getLocaleDesByFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10009ea9", new Object[]{new Integer(i)});
        }
        if (!(i == -1 || i == 0)) {
            if (i == 1) {
                return "zh-Hans";
            }
            if (i == 2) {
                return "zh-Hant";
            }
            if (i == 3) {
                return "zh-HK";
            }
            if (i != 4) {
                return null;
            }
        }
        return "en";
    }

    public static Signature[] getRawSignature(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Signature[]) ipChange.ipc$dispatch("8a8e40fd", new Object[]{context, str});
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            LogUtil.record(2, "MspPayApp:getRawSignature", "getRawSignature, packageName=".concat(String.valueOf(str)));
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                if (packageInfo != null) {
                    return packageInfo.signatures;
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        return null;
    }

    public static Bundle toBundle(Bundle bundle, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("91724444", new Object[]{bundle, jSONObject});
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            for (String str : jSONObject.keySet()) {
                try {
                    putIntoBundle(str, jSONObject.get(str), bundle);
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                }
            }
        }
        return bundle;
    }

    public static boolean isPkgInstalled(Context context, String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1cd0857", new Object[]{context, str})).booleanValue();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 64) == null) {
                z = false;
            }
            return z;
        } catch (Throwable th) {
            LogUtil.record(1, "isPkgInstalled:".concat(String.valueOf(str)), th.getMessage());
            return false;
        }
    }

    public static boolean getDegradeKey(String str, MspContext mspContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f23a14a", new Object[]{str, mspContext})).booleanValue() : getDrmKey(str, mspContext, true);
    }

    public static boolean isMspInProcessTask(boolean z, Activity activity) {
        ActivityManager activityManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e001a554", new Object[]{new Boolean(z), activity})).booleanValue();
        }
        if (z) {
            return true;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23 && (activityManager = (ActivityManager) activity.getSystemService("activity")) != null) {
                List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
                for (int i = 0; i < appTasks.size(); i++) {
                    ActivityManager.RecentTaskInfo taskInfo = appTasks.get(i).getTaskInfo();
                    if (taskInfo != null) {
                        int taskId = activity.getTaskId();
                        int i2 = taskInfo.id;
                        if (Build.VERSION.SDK_INT >= 29) {
                            i2 = taskInfo.taskId;
                        }
                        LogUtil.record(2, "Utils:getAppTasks", "id=" + taskId + " ,processTaskId=" + i2);
                        if (taskId == i2) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return false;
    }
}
