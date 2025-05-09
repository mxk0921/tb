package tb;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class lmf implements DialogInterface.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ imf f23413a;

    public lmf(imf imfVar) {
        this.f23413a = imfVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            return;
        }
        if (dialogInterface instanceof AlertDialog) {
            if (((AlertDialog) dialogInterface).isShowing()) {
                dialogInterface.cancel();
            }
        } else if (dialogInterface != null) {
            dialogInterface.cancel();
        }
        if (!this.f23413a.E().isFinishing()) {
            this.f23413a.E().finish();
        }
    }
}
