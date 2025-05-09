package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.compiler.gen.IndexFromCompiler2;
import com.taobao.android.remoteso.log.RSoLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fte {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <T> T a(String str, Class<T> cls) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("115342ea", new Object[]{str, cls});
        }
        try {
            if ("swallows_rso_index".equals(str)) {
                t = (T) IndexFromCompiler2.buildIndex();
            } else {
                t = "swallows_rso_index2".equals(str) ? (T) IndexFromCompiler2.buildIndex2() : null;
            }
        } catch (Throwable th) {
            RSoLog.c("IndexBuilderOpt", th);
        }
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }
}
