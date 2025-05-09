package tb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class g9o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297650);
    }

    public static AlertDialog a(Activity activity, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertDialog) ipChange.ipc$dispatch("b1485fa3", new Object[]{activity, str, str2, str3, onClickListener, str4, onClickListener2});
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        if (!TextUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        builder.setMessage(str2);
        if (!TextUtils.isEmpty(str3) && onClickListener != null) {
            builder.setPositiveButton(str3, onClickListener);
        }
        if (!TextUtils.isEmpty(str4)) {
            builder.setNegativeButton(str4, onClickListener2);
        }
        builder.setCancelable(false);
        if (activity.isFinishing()) {
            return builder.create();
        }
        return builder.show();
    }
}
