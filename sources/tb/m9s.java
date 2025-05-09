package tb;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class m9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Context context) {
        ClipData.Item itemAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("334fa47f", new Object[]{context});
        }
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager.getPrimaryClip() == null || (itemAt = clipboardManager.getPrimaryClip().getItemAt(0)) == null || itemAt.getText() == null) {
            return "";
        }
        return itemAt.getText().toString();
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3eb0ed7", new Object[]{context, str});
        } else {
            ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", str));
        }
    }
}
