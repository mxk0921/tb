package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.regex.Pattern;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d6k implements igv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.igv
    public boolean a(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b744395", new Object[]{this, thread, th})).booleanValue();
        }
        Pattern compile = Pattern.compile("Thread-\\d+");
        String name = thread.getName();
        if (!TextUtils.isEmpty(name) && !compile.matcher(name).find() && !thread.isDaemon()) {
            return false;
        }
        return true;
    }
}
