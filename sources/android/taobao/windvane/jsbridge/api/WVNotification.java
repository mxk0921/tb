package android.taobao.windvane.jsbridge.api;

import android.media.ToneGenerator;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kpw;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVNotification extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVNotification";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f1812a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i) {
            super(str);
            this.f1812a = i;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVNotification$1");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ToneGenerator toneGenerator = new ToneGenerator(1, 100);
            for (int i = 0; i < this.f1812a; i++) {
                toneGenerator.startTone(24);
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            toneGenerator.stopTone();
            toneGenerator.release();
        }
    }

    static {
        t2o.a(989856294);
    }

    public static /* synthetic */ Object ipc$super(WVNotification wVNotification, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVNotification");
    }

    public final void beep(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd10edfc", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            new a(TAG, Integer.parseInt(new JSONObject(str).optString("count"))).start();
            wVCallBackContext.success("{}");
        } catch (JSONException unused) {
            v7t.d(TAG, "openWindow: param parse to JSON error, param=" + str);
            wVCallBackContext.error("param error");
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"beep".equals(str)) {
            return false;
        }
        beep(str2, wVCallBackContext);
        return true;
    }
}
