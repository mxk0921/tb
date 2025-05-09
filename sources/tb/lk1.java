package tb;

import android.app.Activity;
import com.alibaba.ut.comm.JsBridge;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.nb0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class lk1 implements nb0.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final lk1 b = new lk1();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Boolean> f23379a = new HashMap<>();

    public static lk1 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lk1) ipChange.ipc$dispatch("d60c63e1", new Object[0]);
        }
        return b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            nb0.d().c(this);
        }
    }

    @Override // tb.nb0.d
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        xbe a2 = egw.a(activity);
        if (!this.f23379a.containsKey(Integer.valueOf(activity.hashCode()))) {
            if (a2 != null) {
                a2.addJavascriptInterface(new JsBridge(a2), "UT4Aplus");
                thh.h("hook success:", a2);
            } else {
                thh.e(RPCDataItems.SWITCH_TAG_LOG, "cannot found webview");
            }
        }
        HashMap<String, Boolean> hashMap = this.f23379a;
        hashMap.put(activity.hashCode() + "", Boolean.TRUE);
    }
}
