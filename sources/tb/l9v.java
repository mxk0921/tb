package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class l9v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final l9v INSTANCE = new l9v();

    static {
        t2o.a(83886330);
    }

    @JvmStatic
    public static final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e380bd8", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "switchKey");
        try {
            if (new File(ey1.SWITCH_FILE_DIR, ".close".concat(str)).exists()) {
                return false;
            }
            return new File(ey1.SWITCH_FILE_DIR, ".".concat(str)).exists();
        } catch (Throwable th) {
            Result.m1108constructorimpl(b.a(th));
            return false;
        }
    }
}
