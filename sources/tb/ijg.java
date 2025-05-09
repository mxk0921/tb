package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ijg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Class f21348a;

    static {
        t2o.a(503316933);
        try {
            f21348a = Class.forName("android.text.Layout$Ellipsizer");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44e11bfe", new Object[]{charSequence})).booleanValue();
        }
        Class cls = f21348a;
        if (cls == null || !cls.isInstance(charSequence)) {
            return false;
        }
        return true;
    }
}
