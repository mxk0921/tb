package android.taobao.windvane.jsbridge.api;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.utils.FileUtil;
import java.io.File;
import org.json.JSONObject;
import tb.dqw;
import tb.gl4;
import tb.hzl;
import tb.itw;
import tb.kpw;
import tb.nsw;
import tb.obq;
import tb.opw;
import tb.ql7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVScreen extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVScreen";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f1814a;
        public final /* synthetic */ String b;

        public a(WVCallBackContext wVCallBackContext, String str) {
            this.f1814a = wVCallBackContext;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WVScreen.this.capture(this.f1814a, this.b);
            }
        }
    }

    static {
        t2o.a(989856299);
    }

    public static /* synthetic */ Object ipc$super(WVScreen wVScreen, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVScreen");
    }

    public void getOrientation(WVCallBackContext wVCallBackContext, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca441b28", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nsw nswVar = new nsw();
        Context context = this.mContext;
        if (!(context instanceof Activity)) {
            nswVar.b("error", "Context must be Activty!");
            wVCallBackContext.error(nswVar);
            return;
        }
        int requestedOrientation = ((Activity) context).getRequestedOrientation();
        if (requestedOrientation == 0) {
            str2 = "landscape";
        } else if (requestedOrientation == 1) {
            str2 = "portrait";
        } else {
            str2 = "unknown";
        }
        nswVar.b("orientation", str2);
        wVCallBackContext.success(nswVar);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("capture".equals(str)) {
            Context context = this.mContext;
            if (context != null) {
                if (Build.VERSION.SDK_INT < 30) {
                    hzl.b(context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).i(new a(wVCallBackContext, str2)).h(new dqw(wVCallBackContext, "no permission")).d();
                } else {
                    capture(wVCallBackContext, str2);
                }
            }
        } else if ("getOrientation".equals(str)) {
            getOrientation(wVCallBackContext, str2);
        } else if (!"setOrientation".equals(str)) {
            return false;
        } else {
            setOrientation(wVCallBackContext, str2);
        }
        return true;
    }

    public void setOrientation(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66892d9c", new Object[]{this, wVCallBackContext, str});
            return;
        }
        new nsw();
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            try {
                str2 = new JSONObject(str).optString("orientation", str2);
            } catch (Exception unused) {
                wVCallBackContext.error(new nsw("HY_PARAM_ERR"));
            }
        }
        Context context = this.mContext;
        if (!(context instanceof Activity)) {
            nsw nswVar = new nsw();
            nswVar.b("error", "Context must be Activty!");
            wVCallBackContext.error(nswVar);
        } else if (obq.BIZ_NAME.equals(context.getClass().getName())) {
            nsw nswVar2 = new nsw();
            nswVar2.b("error", "Context cannot be TBMainActivity!");
            wVCallBackContext.error(nswVar2);
        } else {
            Activity activity = (Activity) this.mContext;
            if (str2.equals("landscape") || str2.equals("landscapeRight")) {
                activity.setRequestedOrientation(0);
            } else if (str2.equals("landscapeLeft")) {
                activity.setRequestedOrientation(8);
            } else if (str2.equals("portrait") || str2.equals("default")) {
                activity.setRequestedOrientation(1);
            } else if (str2.equals("portraitUpsideDown")) {
                activity.setRequestedOrientation(9);
            } else if (str2.equals("auto")) {
                activity.setRequestedOrientation(4);
            } else {
                wVCallBackContext.error();
                return;
            }
            wVCallBackContext.success();
        }
    }

    public void capture(WVCallBackContext wVCallBackContext, String str) {
        String optString;
        String optString2;
        boolean optBoolean;
        long j;
        long j2;
        long j3;
        String c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bbaded4", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nsw nswVar = new nsw();
        int i = 50;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                optString = jSONObject.optString("inAlbum", "false");
                optString2 = jSONObject.optString("type", "view");
                long optLong = jSONObject.optLong("maxShortSide", FileUtil.LOCAL_REPORT_FILE_MAX_SIZE);
                long optLong2 = jSONObject.optLong("maxLongSide", FileUtil.LOCAL_REPORT_FILE_MAX_SIZE);
                int optInt = jSONObject.optInt("quality", 50);
                if (optInt <= 100 && optInt >= 0) {
                    i = optInt;
                }
                optBoolean = jSONObject.optBoolean("compress", true);
                j = optLong;
                j2 = optLong2;
            } catch (Exception e) {
                nswVar.b("msg", "param error: [" + e.getMessage() + "]");
                wVCallBackContext.error(nswVar);
                return;
            }
        } else {
            optString = "";
            optString2 = "app";
            j2 = 10240;
            j = 10240;
            optBoolean = true;
        }
        boolean z = !"false".equals(optString);
        try {
            if (optString2.equals("app")) {
                j3 = ScreenCaptureUtil.b((Activity) this.mContext, z, i, j2, j, optBoolean);
            } else {
                j3 = ScreenCaptureUtil.a(this.mWebView.getView(), z, i, j2, j, optBoolean);
            }
            nswVar.b("url", itw.c(Long.valueOf(j3)));
            nswVar.b(gl4.CONFIG_LOCAL_PATH, opw.e().b(true) + File.separator + ql7.c(c));
            wVCallBackContext.success(nswVar);
        } catch (Exception unused) {
            wVCallBackContext.error();
        }
    }
}
