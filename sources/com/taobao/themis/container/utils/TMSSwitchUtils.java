package com.taobao.themis.container.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.ges;
import tb.h8s;
import tb.o9s;
import tb.q9s;
import tb.t2o;
import tb.t8s;
import tb.wsq;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0017\u001a\u00020\u000eH\u0003J\b\u0010\u0018\u001a\u00020\u000eH\u0003J\b\u0010\u0019\u001a\u00020\u000eH\u0003J\b\u0010\u001a\u001a\u00020\u000eH\u0003J\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0004J\b\u0010\u001d\u001a\u00020\u000eH\u0007J\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/taobao/themis/container/utils/TMSSwitchUtils;", "", "()V", "FLAG_DEV_JS_FRAMEWORK", "", "FLAG_QKING", "FLAG_TMS", "FLAG_TRIVER", "FLAG_V8", "INNER_SWITCH_LIST", "", "LOCAL_PATH", RPCDataItems.SWITCH_TAG_LOG, "downgradeOn32", "", NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "Landroid/net/Uri;", "enableEnterTMSH5AFC", "context", "Landroid/content/Context;", "enableEnterTMSWeexAFC", "enableEnterUniApp", "isEnterTMS", "isFullSwitchToQking", "isFullSwitchToTMS", "isFullSwitchToTriver", "isFullSwitchToV8", "isHighPerformanceGame", "appId", "useDevJSFramework", "useThemisWidget", RVConstants.EXTRA_START_PARAMS, "Lcom/alibaba/fastjson/JSONObject;", "useV8Runtime", "themis_container_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSSwitchUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FLAG_DEV_JS_FRAMEWORK = ".switchtoDevJsFramework";
    private static final String FLAG_QKING = ".switchToQking";
    private static final String FLAG_TMS = ".switchToThemis";
    private static final String FLAG_TRIVER = ".switchToTriver";
    private static final String FLAG_V8 = ".switchToV8";
    private static final String LOCAL_PATH = "/data/local/tmp/.themis_local_switch/";
    private static final String TAG = "TMSSwitchUtils";
    public static final TMSSwitchUtils INSTANCE = new TMSSwitchUtils();
    private static final List<String> INNER_SWITCH_LIST = yz3.l("3000000106525574", "3000000050566565", "3000000005168953", "3000000028714301", "3000000108495875", "1000003", "1000004", "1000410", "1000413", "1000414", "1000415", "1000416", "1000437", "1000474", "1000476", "10703953", "1159349", "12044118", "12303126", "12721076", "13417847", "17588434", "19433716", "19760947", "19905101", "20012401", "20133772", "22129413", "3000000026238431", "3000000026855752", "3000000027280761", "3000000027490524", "3000000027610902", "3000000028555582", "3000000029462362", "3000000035930451", "3000000036299515", "3000000041273562", "3000000042315414", "3000000047286294", "3000000050106724", "3000000052571421", "3000000055944572", "3000000056086413", "3000000057060663", "3000000059869791", "3000000060129722", "3000000060917022", "3000000062695594", "3000000064426654", "3000000066607081", "3000000070496171", "3000000070975124", "3000000073987945", "3000000074911405", "3000000078644662", "3000000079494892", "3000000081492872", "3000000082511381", "3000000083212031", "3000000083541514", "3000000083741174", "3000000083994175", "3000000084652842", "3000000085107245", "3000000085349091", "3000000086587283", "3000000086736082", "3000000087948954", "3000000088744373", "3000000088746171", "3000000088770721", "3000000089053801", "3000000089144025", "3000000089437432", "3000000090196802", "3000000090438101", "3000000090474045", "3000000090756462", "3000000091808351", "3000000091811391", "3000000091825373", "3000000091987794", "3000000091992743", "3000000092259091", "3000000092576361", "3000000092670541", "3000000093000831", "3000000093210663", "3000000093231824", "3000000093510282", "3000000093709391", "3000000093832684", "3000000093854812", "3000000094040673", "3000000094232113", "3000000094280644", "3000000094311515", "3000000094337401", "3000000094352082", "3000000094568574", "3000000094625664", "3000000094774333", "3000000094776154", "3000000095219882", "3000000095496142", "3000000097410125", "3000000098640642", "3000000099752931", "3000000101663741", "3000000101891044", "3000000102026985", "3000000103156613", "3000000103461192", "3000000105138882", "3000000105361054", "3000000106876185", "3000000106895985", "3000000107577405", "3000000108058665", "3000000108838293", "3000000108841962", "3000000109566362", "3000000110389174", "3000000110389744", "3000000110390273", "3000000110390602", "3000000110390931", "3000000112592904", "3000000114819352", "3000000116425325", "5972516", "6158543", "6296385", "6365528", "6483140", "6528465", "6579080", "6639583", "8536719", "8697302");

    static {
        t2o.a(835715219);
    }

    private TMSSwitchUtils() {
    }

    @JvmStatic
    public static final boolean enableEnterUniApp(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bb274de", new Object[]{uri})).booleanValue();
        }
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return ges.m(uri);
    }

    @JvmStatic
    private static final boolean isFullSwitchToQking() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe631e2b", new Object[0])).booleanValue();
        }
        if (new File(ckf.p(LOCAL_PATH, FLAG_V8)).exists() || !new File(ckf.p(LOCAL_PATH, FLAG_QKING)).exists()) {
            return false;
        }
        return true;
    }

    @JvmStatic
    private static final boolean isFullSwitchToTMS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5454ccbd", new Object[0])).booleanValue();
        }
        if (new File(ckf.p(LOCAL_PATH, FLAG_TRIVER)).exists() || !new File(ckf.p(LOCAL_PATH, FLAG_TMS)).exists()) {
            return false;
        }
        return true;
    }

    @JvmStatic
    private static final boolean isFullSwitchToTriver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60451b8b", new Object[0])).booleanValue();
        }
        if (!new File(ckf.p(LOCAL_PATH, FLAG_TRIVER)).exists() || new File(ckf.p(LOCAL_PATH, FLAG_TMS)).exists()) {
            return false;
        }
        return true;
    }

    @JvmStatic
    private static final boolean isFullSwitchToV8() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1daf76f5", new Object[0])).booleanValue();
        }
        if (!new File(ckf.p(LOCAL_PATH, FLAG_V8)).exists() || new File(ckf.p(LOCAL_PATH, FLAG_QKING)).exists()) {
            return false;
        }
        return true;
    }

    @JvmStatic
    public static final boolean useDevJSFramework() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf0789f2", new Object[0])).booleanValue();
        }
        return new File(ckf.p(LOCAL_PATH, FLAG_DEV_JS_FRAMEWORK)).exists();
    }

    @JvmStatic
    public static final boolean useV8Runtime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1c4a284", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "appId");
        if (isFullSwitchToQking()) {
            return false;
        }
        if (isFullSwitchToV8()) {
            return true;
        }
        if (wsq.O(q9s.j3(), str, false, 2, null)) {
            return false;
        }
        if (!q9s.E2() && !wsq.O(q9s.k3(), str, false, 2, null)) {
            return false;
        }
        return true;
    }

    public final boolean isHighPerformanceGame(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1385cecb", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "appId");
        if (wsq.z0(q9s.INSTANCE.O3(), new String[]{","}, false, 0, 6, null).contains(str)) {
            return true;
        }
        JSONArray q = h8s.INSTANCE.q();
        if (q != null && q.contains(str)) {
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final boolean useThemisWidget(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f422a384", new Object[]{context, jSONObject})).booleanValue();
        }
        ckf.g(context, "context");
        ckf.g(jSONObject, RVConstants.EXTRA_START_PARAMS);
        h8s.w(context);
        String string = jSONObject.getString("widgetId");
        if (string == null) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("sceneParams");
        String str = null;
        String string2 = jSONObject2 == null ? null : jSONObject2.getString("sellerId");
        JSONObject jSONObject3 = jSONObject.getJSONObject("sceneParams");
        if (jSONObject3 != null) {
            str = jSONObject3.getString("sceneId");
        }
        if (str == null) {
            return false;
        }
        return h8s.A(str, string2, string);
    }

    @JvmStatic
    public static final boolean downgradeOn32(Uri uri) {
        boolean is64Bit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e99bef1", new Object[]{uri})).booleanValue();
        }
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        is64Bit = Process.is64Bit();
        return !is64Bit && TextUtils.equals(uri.getQueryParameter("downgradeOn32"), "true");
    }

    @JvmStatic
    public static final boolean enableEnterTMSH5AFC(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d31c756", new Object[]{context, uri})).booleanValue();
        }
        ckf.g(context, "context");
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return TMSSolutionType.getType(uri) == TMSSolutionType.WEB_SINGLE_PAGE && t8s.i(context, uri);
    }

    @JvmStatic
    public static final boolean enableEnterTMSWeexAFC(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d30bfe2", new Object[]{context, uri})).booleanValue();
        }
        ckf.g(context, "context");
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return TMSSolutionType.getType(uri) == TMSSolutionType.WEEX && q9s.A1();
    }

    @JvmStatic
    public static final boolean isEnterTMS(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e3cf7b6", new Object[]{context, uri})).booleanValue();
        }
        ckf.g(context, "context");
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        h8s.w(context);
        TMSLogger.b(TAG, ckf.p("bucketId: $", Integer.valueOf(h8s.c())));
        if (isFullSwitchToTriver()) {
            TMSLogger.b(TAG, "Local switch to triver");
            return false;
        } else if (isFullSwitchToTMS()) {
            TMSLogger.b(TAG, "Local switch to tms");
            return true;
        } else if (enableEnterUniApp(uri)) {
            TMSLogger.b(TAG, "Enter UniApp");
            return true;
        } else if (!o9s.h(context) || uri.getQueryParameter("isThemis") == null) {
            String queryParameter = uri.getQueryParameter("_ariver_appid");
            if (queryParameter == null) {
                return false;
            }
            TMSLogger.b(TAG, ckf.p("appId: ", queryParameter));
            if (!TextUtils.isEmpty(q9s.a()) && wsq.O(q9s.a(), queryParameter, false, 2, null)) {
                TMSLogger.b(TAG, "Tms blackList");
                return false;
            } else if (INNER_SWITCH_LIST.contains(queryParameter)) {
                TMSLogger.b(TAG, "Switch tms inner switch list");
                return true;
            } else {
                TMSSolutionType type = TMSSolutionType.getType(uri);
                TMSLogger.b(TAG, ckf.p("solutionType: ", type));
                if (type == TMSSolutionType.MINIGAME) {
                    TMSLogger.b(TAG, "MiniGame switch tms");
                    return true;
                } else if (!h8s.t(queryParameter)) {
                    return false;
                } else {
                    TMSLogger.b(TAG, "Switch tms by bucketId");
                    return true;
                }
            }
        } else {
            TMSLogger.b(TAG, "Debug app switch to tms by isThemis");
            return t8s.j(uri);
        }
    }
}
