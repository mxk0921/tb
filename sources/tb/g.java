package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.constant.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f19653a;

    static {
        t2o.a(393216110);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea9aab8e", new Object[0])).booleanValue();
        }
        return b("anr_normal_change");
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c6904a1", new Object[]{str})).booleanValue();
        }
        try {
            return c0.e(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8301846a", new Object[0])).booleanValue();
        }
        return b("aranger_hook_service");
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22bfbfc5", new Object[0])).booleanValue();
        }
        if (f19653a == null) {
            f19653a = Boolean.valueOf(b(Constants.INTENT_KEY_SERVICE));
        }
        return f19653a.booleanValue();
    }
}
