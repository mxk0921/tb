package tb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class kl7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final kl7 INSTANCE = new kl7();

    static {
        t2o.a(815792210);
    }

    @JvmStatic
    public static final void a(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55906e39", new Object[]{context, str, str2, str3, onClickListener, str4, onClickListener2});
        } else {
            c(context, str, str2, str3, onClickListener, str4, onClickListener2, false, 128, null);
        }
    }

    @JvmStatic
    public static final void b(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7e0bbb", new Object[]{context, str, str2, str3, onClickListener, str4, onClickListener2, new Boolean(z)});
        } else if (context != null) {
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                return;
            }
            if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                if (!TextUtils.isEmpty(str)) {
                    builder.setTitle(str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    builder.setMessage(str2);
                }
                if (onClickListener != null) {
                    if (TextUtils.isEmpty(str3)) {
                        str3 = Localization.q(R.string.app_confirm);
                    }
                    builder.setPositiveButton(str3, onClickListener);
                }
                if (onClickListener2 != null) {
                    if (TextUtils.isEmpty(str4)) {
                        str4 = Localization.q(R.string.app_cancel);
                    }
                    builder.setNegativeButton(str4, onClickListener2);
                }
                builder.setCancelable(z);
                builder.create().show();
            }
        }
    }

    public static /* synthetic */ void c(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, boolean z, int i, Object obj) {
        String str5;
        String str6;
        String str7;
        DialogInterface.OnClickListener onClickListener3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("332888c7", new Object[]{context, str, str2, str3, onClickListener, str4, onClickListener2, new Boolean(z), new Integer(i), obj});
            return;
        }
        boolean z2 = z;
        String str8 = "";
        if ((2 & i) != 0) {
            str5 = str8;
        } else {
            str5 = str;
        }
        if ((4 & i) != 0) {
            str6 = str8;
        } else {
            str6 = str2;
        }
        if ((8 & i) != 0) {
            str7 = str8;
        } else {
            str7 = str3;
        }
        DialogInterface.OnClickListener onClickListener4 = null;
        if ((i & 16) != 0) {
            onClickListener3 = null;
        } else {
            onClickListener3 = onClickListener;
        }
        if ((i & 32) == 0) {
            str8 = str4;
        }
        if ((i & 64) == 0) {
            onClickListener4 = onClickListener2;
        }
        if ((i & 128) != 0) {
            z2 = true;
        }
        b(context, str5, str6, str7, onClickListener3, str8, onClickListener4, z2);
    }

    @JvmStatic
    public static final void d(final Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dece332", new Object[]{activity, str});
        } else if (activity != null && !activity.isFinishing()) {
            c(activity, "", str, Localization.q(R.string.app_sure), new DialogInterface.OnClickListener() { // from class: tb.b5z
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    kl7.g(activity, dialogInterface, i);
                }
            }, Localization.q(R.string.app_cancel), new DialogInterface.OnClickListener() { // from class: tb.c5z
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    kl7.h(dialogInterface, i);
                }
            }, false, 128, null);
        }
    }

    public static final void g(Activity activity, DialogInterface dialogInterface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e027be", new Object[]{activity, dialogInterface, new Integer(i)});
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", Globals.getApplication().getPackageName(), null));
        if (activity != null) {
            activity.startActivity(intent);
        }
        dialogInterface.cancel();
    }

    public static final void h(DialogInterface dialogInterface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("170a116d", new Object[]{dialogInterface, new Integer(i)});
        } else {
            dialogInterface.cancel();
        }
    }
}
