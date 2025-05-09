package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class goo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(ClassLoader classLoader, File file) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47139588", new Object[]{classLoader, file});
        } else if (file.isDirectory()) {
            k2s.a(classLoader, file);
            RSoLog.d("SWSoLoaderCore, installDir finished, " + classLoader);
        } else {
            throw new RuntimeException("dir not available " + file);
        }
    }
}
