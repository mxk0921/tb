package tb;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cash.activity.a;
import com.taobao.weex.utils.WXLogUtils;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uvw implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f29642a;
    public final /* synthetic */ MotionEvent b;
    public final /* synthetic */ a c;

    public uvw(a aVar, String str, MotionEvent motionEvent) {
        this.f29642a = str;
        this.b = motionEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        Class b;
        if (!(a.a() == null || (b = a.b()) == null)) {
            try {
                Method method = b.getMethod("addTouchEvent", String.class, MotionEvent.class);
                if (method != null) {
                    method.invoke(a.a(), this.f29642a, this.b);
                }
            } catch (Exception unused) {
                WXLogUtils.e("WXSecurityGuardPageTrack", "[PageTrackLog]addTouchEventReflection error");
            }
        }
        a.c().getAndDecrement();
    }
}
