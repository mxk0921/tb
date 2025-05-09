package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TScheduleInitialize;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jms implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f22084a = "TScheduleAfterNavProcessor";

    static {
        t2o.a(329253017);
        t2o.a(578814049);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "TScheduleAfterNavProcessor";
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        try {
            TScheduleInitialize.g().c(intent);
        } catch (Throwable th) {
            zdh.b(f22084a, "process AfterNavTrigger error", th);
            th.printStackTrace();
        }
        return true;
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            zdh.b(f22084a, "registerNavTrigger error", th);
            th.printStackTrace();
        }
        return !zms.b(wms.SWITCH_KEY_ENABLE_NAV, false);
    }
}
