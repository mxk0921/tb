package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class agr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final agr INSTANCE = new agr();

    static {
        t2o.a(804257847);
    }

    public final String a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a804d6d2", new Object[]{this, context, str, str2});
        }
        ckf.g(context, "context");
        ckf.g(str, "key");
        return context.getSharedPreferences("tbiUniContainerSp", 0).getString(str, str2);
    }

    public final void b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b150787", new Object[]{this, context, str, str2});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "key");
        ckf.g(str2, "value");
        context.getSharedPreferences("tbiUniContainerSp", 0).edit().putString(str, str2).apply();
    }
}
