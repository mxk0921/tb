package tb;

import android.content.DialogInterface;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class kmf implements DialogInterface.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ imf f22757a;

    public kmf(imf imfVar) {
        this.f22757a = imfVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
        } else {
            this.f22757a.E().finish();
        }
    }
}
