package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a4s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f15543a;

    static {
        t2o.a(806356520);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbb58cc0", new Object[0])).booleanValue();
        }
        if (f15543a == null) {
            f15543a = Boolean.valueOf(d4s.e("enableSafeEventCenter", true));
        }
        return f15543a.booleanValue();
    }

    public static void b(Context context, f3c f3cVar, s3c s3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66369a29", new Object[]{context, f3cVar, s3cVar});
        } else if (f3cVar != null && s3cVar != null) {
            if (!a()) {
                f3cVar.a(s3cVar);
            } else if (w2s.i(context)) {
                o3s.b("TLiveSafeEventCenterUtils", "组件注册发生在Activity销毁后：" + s3cVar);
            } else {
                f3cVar.a(s3cVar);
            }
        }
    }
}
