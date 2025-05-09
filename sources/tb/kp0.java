package tb;

import android.content.Context;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kp0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static kp0 d;

    /* renamed from: a  reason: collision with root package name */
    public float f22819a;
    public int b;
    public int c;

    public static kp0 a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kp0) ipChange.ipc$dispatch("3e661d24", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        kp0 kp0Var = d;
        if (kp0Var != null) {
            return kp0Var;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        kp0 kp0Var2 = new kp0();
        d = kp0Var2;
        kp0Var2.f22819a = displayMetrics.density;
        kp0Var2.c = displayMetrics.heightPixels;
        kp0Var2.b = displayMetrics.widthPixels;
        return kp0Var2;
    }
}
