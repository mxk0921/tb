package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.Services;
import com.taobao.android.tschedule.aidl.ITScheduleStatus;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class xms implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f31479a;

    public xms(Context context) {
        this.f31479a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            ums.c("bind TSchedule aidl service");
            yms.b((ITScheduleStatus) Services.get(this.f31479a, ITScheduleStatus.class));
            StringBuilder sb = new StringBuilder("success=");
            if (yms.a() != null) {
                z = true;
            }
            sb.append(z);
            ums.b("bind TSchedule aidl service", sb.toString());
        } catch (Throwable th) {
            zdh.b("TS.Status", "init aidl service error", th);
        }
    }
}
