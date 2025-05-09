package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class eyw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static obe f18899a;

    static {
        t2o.a(481296444);
    }

    public static String a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("641182a5", new Object[]{bitmap});
        }
        obe obeVar = f18899a;
        if (obeVar == null || bitmap == null) {
            return null;
        }
        return ((m2s) obeVar).b(bitmap);
    }

    public static boolean b(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61800e2a", new Object[]{bitmap})).booleanValue();
        }
        obe obeVar = f18899a;
        if (obeVar == null || bitmap == null || !((m2s) obeVar).c(bitmap)) {
            return false;
        }
        return true;
    }

    public static void c(obe obeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22eb37a2", new Object[]{obeVar});
        } else {
            f18899a = obeVar;
        }
    }
}
