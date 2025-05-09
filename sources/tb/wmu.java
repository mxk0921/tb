package tb;

import android.content.Context;
import android.os.PowerManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.TrtcLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wmu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String b = wmu.class.getName();

    /* renamed from: a  reason: collision with root package name */
    public final PowerManager.WakeLock f30783a;

    static {
        t2o.a(395313619);
    }

    public wmu(Context context) {
        this.f30783a = ((PowerManager) context.getSystemService("power")).newWakeLock(536870922, "trtc:rtc-room");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c88a5d", new Object[]{this});
            return;
        }
        try {
            this.f30783a.acquire();
            String str = b;
            TrtcLog.j(str, "PM, acquire wakelock: " + this.f30783a.toString());
        } catch (Exception e) {
            String str2 = b;
            TrtcLog.i(str2, "exception: " + e.getMessage());
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        try {
            this.f30783a.release();
            String str = b;
            TrtcLog.j(str, "PM, release wakelock: " + this.f30783a.toString());
        } catch (Exception e) {
            String str2 = b;
            TrtcLog.i(str2, "exception: " + e.getMessage());
        }
    }
}
