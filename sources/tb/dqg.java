package tb;

import android.content.Context;
import android.content.Intent;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dqg implements cqg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f18012a;
    public final String b;
    public final String c;
    public final Context d;
    public final boolean e;

    static {
        t2o.a(1030750279);
        t2o.a(1030750278);
    }

    public dqg(Context context, String str, String str2, String str3) {
        this.d = context;
        this.f18012a = str;
        this.b = str2;
        this.c = str3;
        this.e = TextUtils.equals("com.eg.android.AlipayGphone", str2);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f947da81", new Object[]{this});
            return;
        }
        try {
            if (this.e) {
                WVStandardEventCenter.postNotificationToJS("tbDownloadFinish", "true");
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("packageName", this.b);
                WVStandardEventCenter.postNotificationToJS("tbDownloadFinishV2", jSONObject.toString());
            }
        } catch (Throwable th) {
            irg.c("DownloadListenerImpl", th.getMessage(), th);
        }
        try {
            Intent intent = new Intent("link.intent.action.DOWNLOAD_FINISH");
            intent.putExtra("link.intent.extra.PACKAGE", this.b);
            intent.putExtra("link.intent.extra.BUSINESS_ID", this.f18012a);
            intent.putExtra("link.intent.extra.DOWNLOAD_URL", this.c);
            LocalBroadcastManager.getInstance(this.d).sendBroadcast(intent);
        } catch (Throwable th2) {
            irg.c("DownloadListenerImpl", th2.getMessage(), th2);
        }
    }

    public void b(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25a31460", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", str);
            jSONObject.put("errorCode", i);
            jSONObject.put("errorMsg", str2);
            if (this.e) {
                WVStandardEventCenter.postNotificationToJS("tbDownloadFail", jSONObject.toString());
            } else {
                jSONObject.put("packageName", this.b);
                WVStandardEventCenter.postNotificationToJS("tbDownloadFailV2", jSONObject.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28975706", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if (this.e) {
                WVStandardEventCenter.postNotificationToJS("tbDownloadProgress", i + "");
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("packageName", this.b);
                jSONObject.put("progress", i);
                WVStandardEventCenter.postNotificationToJS("tbDownloadProgressV2", jSONObject.toString());
            }
        } catch (Throwable th) {
            irg.c("DownloadListenerImpl", th.getMessage(), th);
        }
    }
}
