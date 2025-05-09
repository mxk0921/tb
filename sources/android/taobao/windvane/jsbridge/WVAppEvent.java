package android.taobao.windvane.jsbridge;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.t2o;
import tb.trw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVAppEvent extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856209);
    }

    public static /* synthetic */ Object ipc$super(WVAppEvent wVAppEvent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == 797441118) {
            super.onPause();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in android/taobao/windvane/jsbridge/WVAppEvent");
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        return true;
    }

    @Override // tb.kpw
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.mWebView.fireEvent("WV.Event.APP.Background", "{}");
        if (trw.getPerformanceMonitor() != null) {
            trw.getPerformanceMonitor().didExitAtTime(this.mWebView.getUrl(), System.currentTimeMillis());
        }
        super.onPause();
    }

    @Override // tb.kpw
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        String dataOnActive = this.mWebView.getDataOnActive();
        if (TextUtils.isEmpty(dataOnActive)) {
            dataOnActive = "{}";
        }
        this.mWebView.fireEvent("WV.Event.APP.Active", dataOnActive);
        this.mWebView.setDataOnActive(null);
    }
}
