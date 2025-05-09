package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wxu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Random f31004a = new Random();
    public static String b;

    public static String a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7802f23e", new Object[]{str});
        }
        if (byu.b(str)) {
            str2 = "-" + str;
        } else {
            str2 = "";
        }
        return zxu.h() + "-" + zxu.b() + f31004a.nextInt(krg.LOG_LEVEL_DEBUG) + str2;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4d513d5", new Object[0]);
        }
        if (byu.a(b)) {
            synchronized (wxu.class) {
                try {
                    if (byu.a(b)) {
                        b = zxu.h() + "-" + zxu.b() + f31004a.nextInt(krg.LOG_LEVEL_DEBUG);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }
}
