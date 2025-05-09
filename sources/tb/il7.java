package tb;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class il7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031794);
    }

    public static AlertDialog.Builder a(String str, String str2, String str3, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertDialog.Builder) ipChange.ipc$dispatch("aefb0ff4", new Object[]{str, str2, str3, context});
        }
        return b(str, str2, str3, null, context);
    }

    public static AlertDialog.Builder b(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertDialog.Builder) ipChange.ipc$dispatch("e2e2ab37", new Object[]{str, str2, str3, onClickListener, context});
        }
        lor.c("DialogHelper", "createAlertDialogBuilder", "title = " + str + " msg = " + str2);
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 3);
        if (!TextUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            builder.setMessage(str2);
        }
        builder.setCancelable(true);
        if (!TextUtils.isEmpty(str3)) {
            builder.setNegativeButton(str3, onClickListener);
        }
        return builder;
    }
}
