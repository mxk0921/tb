package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.io.File;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class pq7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final pq7 INSTANCE = new pq7();
    public static final String TAG = "DiskUtil";

    static {
        t2o.a(839909949);
    }

    @JvmStatic
    public static final String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f50047c1", new Object[]{context});
        }
        ckf.g(context, "context");
        File filesDir = context.getFilesDir();
        ckf.f(filesDir, "context.filesDir");
        if (filesDir.exists()) {
            return filesDir.getParent();
        }
        return null;
    }

    @JvmStatic
    public static final String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc731b90", new Object[]{context});
        }
        ckf.g(context, "context");
        return INSTANCE.b(context, TMSCalendarBridge.namespace);
    }

    @JvmStatic
    public static final String d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa6ff3de", new Object[]{context, str});
        }
        ckf.g(context, "context");
        ckf.g(str, "subDir");
        String c = c(context);
        if (c == null) {
            return null;
        }
        return c + wh6.DIR + str;
    }

    public final String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67af004d", new Object[]{this, context, str});
        }
        ckf.g(context, "context");
        ckf.g(str, "subDir");
        String a2 = a(context);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return ((Object) a2) + wh6.DIR + str;
    }
}
