package tb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class bmf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f16476a;
    public AlertDialog b;

    static {
        t2o.a(481297103);
    }

    public bmf(Activity activity) {
        this.f16476a = activity;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7944d055", new Object[]{this});
            return;
        }
        AlertDialog alertDialog = this.b;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.b.dismiss();
            this.b = null;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe93935e", new Object[]{this})).booleanValue();
        }
        AlertDialog alertDialog = this.b;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return false;
        }
        return true;
    }

    public void c(String str, DialogInterface.OnClickListener onClickListener, String str2, DialogInterface.OnClickListener onClickListener2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feba81bb", new Object[]{this, str, onClickListener, str2, onClickListener2, str3});
        } else if (!this.f16476a.isFinishing()) {
            AlertDialog alertDialog = this.b;
            if (alertDialog != null && alertDialog.isShowing()) {
                this.b.dismiss();
            }
            if (onClickListener == null) {
                str2 = null;
            } else if (TextUtils.isEmpty(str2)) {
                str2 = Localization.q(R.string.irp_error_message_retry_text);
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = Localization.q(R.string.irp_error_message_cancel_text);
            }
            this.b = g9o.a(this.f16476a, "", str, str2, onClickListener, str3, onClickListener2);
        }
    }
}
