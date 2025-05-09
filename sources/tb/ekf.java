package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ekf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ekf b = new ekf();

    /* renamed from: a  reason: collision with root package name */
    public final fkf f18640a = new fkf();

    public static ekf a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ekf) ipChange.ipc$dispatch("41aec26f", new Object[0]);
        }
        return b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.f18640a.b();
        }
    }

    public void c(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff5a6cf", new Object[]{this, str, str2, new Integer(i)});
        } else if (i != 14 && i != 15) {
            d(str, str2, i, null);
        }
    }

    public void d(String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("654ba821", new Object[]{this, str, str2, new Integer(i), str3});
            return;
        }
        try {
            ppj a2 = this.f18640a.a(str);
            if (a2 == null) {
                String c = y9a.c();
                TLog.loge(c, "IntroductoryCallbackController", "notifyStatusChanged callback error " + str);
                return;
            }
            a2.onIntroductoryStateChanged(str2, i, str3);
            String c2 = y9a.c();
            TLog.logd(c2, "IntroductoryCallbackController", "notifyStatusChanged callback success " + str + " " + str2 + " " + i);
        } catch (Throwable th) {
            rpj.a("IntroductoryCallbackController", str + " " + th + " notifyStatusChanged error");
            String c3 = y9a.c();
            TLog.loge(c3, "IntroductoryCallbackController", str + "notifyStatusChanged error " + th);
        }
    }
}
