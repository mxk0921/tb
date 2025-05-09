package tb;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.unionpay.UPPayWapActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class xby implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UPPayWapActivity f31292a;

    public xby(UPPayWapActivity uPPayWapActivity) {
        this.f31292a = uPPayWapActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AlertDialog alertDialog;
        alertDialog = this.f31292a.c;
        alertDialog.dismiss();
    }
}
