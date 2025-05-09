package tb;

import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.v2.result.MaResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gp1 extends ut1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                gp1.this.startPreview();
            }
        }
    }

    static {
        t2o.a(760217626);
    }

    public gp1(hvm hvmVar) {
        super(hvmVar);
    }

    public static /* synthetic */ Object ipc$super(gp1 gp1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/barcode/util/BarCodeDialogHelper");
    }

    public void f(FragmentActivity fragmentActivity, MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8666253f", new Object[]{this, fragmentActivity, maResult});
        } else if (rso.i()) {
            new AlertDialog.Builder(fragmentActivity).setTitle(R.string.kakalib_qr_dialog_title).setMessage(R.string.kakalib_qr_result_unresolved).setPositiveButton(R.string.kakalib_return_to_preview, new a()).setCancelable(false).show();
            ey3.g().h("Dialog_show_qr_code");
        } else {
            startPreview();
        }
    }
}
