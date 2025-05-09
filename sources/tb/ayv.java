package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ayv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f16080a;

    public static boolean a(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96669d88", new Object[]{context})).booleanValue();
        }
        Boolean bool = f16080a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                z = true;
            }
            f16080a = Boolean.valueOf(z);
        } catch (Exception unused) {
            f16080a = Boolean.FALSE;
        }
        return f16080a.booleanValue();
    }
}
