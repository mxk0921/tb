package tb;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class jl7 {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601414);
        }

        public a() {
        }

        public static /* synthetic */ void b(a aVar, Context context, String str, String str2, String str3, String str4, boolean z, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3958d1be", new Object[]{aVar, context, str, str2, str3, str4, new Boolean(z), onClickListener, onClickListener2, onCancelListener, new Integer(i), obj});
            } else {
                aVar.a(context, str, str2, str3, str4, z, onClickListener, onClickListener2, (i & 256) != 0 ? null : onCancelListener);
            }
        }

        public final void a(Context context, String str, String str2, String str3, String str4, boolean z, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931ef629", new Object[]{this, context, str, str2, str3, str4, new Boolean(z), onClickListener, onClickListener2, onCancelListener});
                return;
            }
            ckf.g(context, "context");
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            if (!TextUtils.isEmpty(str)) {
                builder.setTitle(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.setMessage(str2);
            }
            builder.setCancelable(z);
            if (!TextUtils.isEmpty(str3)) {
                builder.setPositiveButton(str3, onClickListener);
            }
            if (!TextUtils.isEmpty(str4)) {
                builder.setNegativeButton(str4, onClickListener2);
            }
            builder.setOnCancelListener(onCancelListener);
            builder.create().show();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601413);
    }
}
