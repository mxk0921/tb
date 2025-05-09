package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class vg9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final vg9 INSTANCE = new vg9();

    static {
        t2o.a(849346589);
    }

    @JvmStatic
    public static final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("602541f1", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "absPath");
        if (str.length() == 0) {
            return false;
        }
        return new File(str).exists();
    }

    @JvmStatic
    public static final long c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("419ab3c6", new Object[]{str})).longValue();
        }
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return nc9.c(new File(str));
    }

    @JvmStatic
    public static final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a47e76f", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "path");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return tsq.I(str, "../", false, 2, null) || tsq.w(str, "/..", false, 2, null) || wsq.O(str, "/../", false, 2, null);
    }
}
