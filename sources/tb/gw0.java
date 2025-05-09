package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gw0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092713);
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        return w2s.c(context, f);
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        return i3s.c();
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3b9debe", new Object[0])).intValue();
        }
        return i3s.d();
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0010990", new Object[0])).intValue();
        }
        return i3s.e();
    }

    public static boolean e(Context context, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c09c219d", new Object[]{context, ux9Var})).booleanValue();
        }
        if (nwa.a(ux9Var).c() != null) {
            return nwa.a(ux9Var).c().f(context);
        }
        return false;
    }
}
