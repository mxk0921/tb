package tb;

import android.content.DialogInterface;
import com.unionpay.UPPayWapActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class rby implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UPPayWapActivity f27270a;

    public rby(UPPayWapActivity uPPayWapActivity) {
        this.f27270a = uPPayWapActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f27270a.g("cancel", null);
    }
}
