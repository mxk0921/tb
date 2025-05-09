package tb;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qv3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262752);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf59e145", new Object[]{context, str});
            return;
        }
        try {
            ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("剪贴板内容", str));
        } catch (Exception e) {
            tgh.c("SystemUtil", "copyToClipboard", e);
        }
    }
}
