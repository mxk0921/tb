package tb;

import android.app.Activity;
import android.os.Build;
import android.util.DisplayMetrics;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.themis.external.embed.StartParams;
import com.taobao.themis.external.embed.WidgetStartParams;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class bfs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final bfs INSTANCE = new bfs();

    static {
        t2o.a(852492301);
    }

    public final JSONObject a(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3c7d3436", new Object[]{this, bbsVar});
        }
        Activity I = bbsVar.I();
        ckf.f(I, "instance.activity");
        DisplayMetrics displayMetrics = I.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "apiLevel", (String) Integer.valueOf(Build.VERSION.SDK_INT));
        jSONObject.put((JSONObject) "app", RVEnvironmentService.PLATFORM_TB);
        jSONObject.put((JSONObject) "brand", Build.BRAND);
        jSONObject.put((JSONObject) "currentBattery", "100%");
        jSONObject.put((JSONObject) "fontSizeSetting", (String) 16);
        jSONObject.put((JSONObject) LoggingSPCache.STORAGE_LANGUAGE, AdvanceSetting.CLEAR_NOTIFICATION);
        jSONObject.put((JSONObject) "model", Build.MANUFACTURER + ' ' + ((Object) Build.MODEL));
        jSONObject.put((JSONObject) "performance", "middle");
        jSONObject.put((JSONObject) "pixelRatio", (String) Float.valueOf(f));
        jSONObject.put((JSONObject) "platform", TimeCalculator.PLATFORM_ANDROID);
        jSONObject.put((JSONObject) "platformType", "tb");
        jSONObject.put((JSONObject) "screenHeight", (String) Integer.valueOf(displayMetrics.heightPixels));
        jSONObject.put((JSONObject) x3w.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, (String) Integer.valueOf(displayMetrics.widthPixels));
        jSONObject.put((JSONObject) "statusBarHeight", (String) Float.valueOf(xcs.d(I) / f));
        jSONObject.put((JSONObject) "system", Build.VERSION.RELEASE);
        jSONObject.put((JSONObject) "titleBarHeight", (String) 44);
        jSONObject.put((JSONObject) "version", u8s.a(I));
        jSONObject.put((JSONObject) "deviceOrientation", r8s.m(bbsVar));
        return jSONObject;
    }

    public final String b(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e80e584", new Object[]{this, bbsVar});
        }
        ckf.g(bbsVar, "instance");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "systemInfo", INSTANCE.a(bbsVar).toJSONString());
        StartParams startParams = (StartParams) bbsVar.g(StartParams.class);
        String str = null;
        if (startParams == null || !(startParams instanceof WidgetStartParams)) {
            startParams = null;
        }
        WidgetStartParams widgetStartParams = (WidgetStartParams) startParams;
        jSONObject.put((JSONObject) "sceneParams", widgetStartParams == null ? null : widgetStartParams.getSceneParams());
        jSONObject.put((JSONObject) "widgetUrl", bbsVar.e0());
        StartParams startParams2 = (StartParams) bbsVar.g(StartParams.class);
        if (startParams2 == null || !(startParams2 instanceof WidgetStartParams)) {
            startParams2 = null;
        }
        WidgetStartParams widgetStartParams2 = (WidgetStartParams) startParams2;
        jSONObject.put((JSONObject) "widgetWidth", widgetStartParams2 == null ? null : widgetStartParams2.getWidth());
        StartParams startParams3 = (StartParams) bbsVar.g(StartParams.class);
        if (startParams3 == null || !(startParams3 instanceof WidgetStartParams)) {
            startParams3 = null;
        }
        WidgetStartParams widgetStartParams3 = (WidgetStartParams) startParams3;
        jSONObject.put((JSONObject) "widgetHeight", widgetStartParams3 == null ? null : widgetStartParams3.getHeight());
        JSONObject jSONObject2 = new JSONObject();
        StartParams startParams4 = (StartParams) bbsVar.g(StartParams.class);
        if (startParams4 == null || !(startParams4 instanceof WidgetStartParams)) {
            startParams4 = null;
        }
        WidgetStartParams widgetStartParams4 = (WidgetStartParams) startParams4;
        if (widgetStartParams4 != null) {
            str = widgetStartParams4.getSpmOri();
        }
        jSONObject2.put((JSONObject) "spm_ori", str);
        xhv xhvVar = xhv.INSTANCE;
        jSONObject.put((JSONObject) yj4.PARAM_UT_PARAMS, (String) jSONObject2);
        String jSONString = jSONObject.toJSONString();
        ckf.f(jSONString, "widgetEnvironment.toJSONString()");
        return jSONString;
    }

    public final String c(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("342a48bb", new Object[]{this, bbsVar});
        }
        ckf.g(bbsVar, "instance");
        return "var __widgetEnvironment=" + b(bbsVar) + ';';
    }

    public final byte[] d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2b7ba0b3", new Object[]{this, str});
        }
        try {
            URLConnection openConnection = new URL(str).openConnection();
            if (openConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        httpURLConnection.disconnect();
                        inputStream.close();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.flush();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
        } catch (Throwable th) {
            Throwable th2 = Result.m1111exceptionOrNullimpl(Result.m1108constructorimpl(b.a(th)));
            if (th2 == null) {
                return null;
            }
            TMSLogger.c("TMS", "", th2);
            return null;
        }
    }
}
