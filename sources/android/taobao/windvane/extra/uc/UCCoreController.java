package android.taobao.windvane.extra.uc;

import android.webkit.ValueCallback;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.m;
import com.uc.webview.export.extension.Sdk2CoreHost;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.abq;
import tb.gtw;
import tb.pg1;
import tb.t2o;
import tb.x74;
import tb.y71;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UCCoreController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UCCoreController";
    private static final AtomicBoolean sRegisteredThreadANRCallback = new AtomicBoolean(false);

    static {
        t2o.a(989856074);
    }

    public static void registerThreadANRCallback(final abq abqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f75e21bc", new Object[]{abqVar});
        } else if (sRegisteredThreadANRCallback.compareAndSet(false, true)) {
            abqVar.e("registerThreadANRCallback");
            Sdk2CoreHost.instance().setThreadNotRespondingCallback(new ValueCallback<Map<String, Object>>() { // from class: android.taobao.windvane.extra.uc.UCCoreController.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onReceiveValue(Map<String, Object> map) {
                    String str;
                    Throwable th;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cc3b1331", new Object[]{this, map});
                        return;
                    }
                    try {
                        String str2 = "ThreadWatchdog get callback. pid: " + ((Integer) map.get(MspDBHelper.BizEntry.COLUMN_NAME_PID)).intValue() + ", tid: " + ((Integer) map.get("tid")).intValue() + ", threadName: " + ((String) map.get(m.THREAD_NAME)) + ", state: " + ((String) map.get("state")) + ", type: " + ((String) map.get("type")) + ", url: " + ((String) map.get("url")) + ", webviewCount: " + ((Integer) map.get("webviewCount")).intValue() + ", taskInfo: " + ((String) map.get("taskInfo")) + ", elapseInMs: " + ((Integer) map.get("elapseInMs")).intValue() + ", alarmInMs: " + ((Integer) map.get("alarmInMs")).intValue() + ", stack: " + ((String) map.get(pg1.ATOM_stack));
                        abq.this.e(str2);
                        str = "ThreadWatchdog";
                        try {
                            y71.commitFail(str, 0, gtw.f((String) map.get("url")), str2);
                        } catch (Throwable th2) {
                            th = th2;
                            y71.commitFail(str, 1, gtw.f((String) map.get("url")), "err:" + th + " StackTrace::" + x74.i(th));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str = "ThreadWatchdog";
                    }
                }
            });
        }
    }
}
