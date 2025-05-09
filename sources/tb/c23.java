package tb;

import android.content.DialogInterface;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class c23 implements DialogInterface.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c23 INSTANCE = new c23();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
        } else if (dialogInterface != null) {
            dialogInterface.cancel();
        }
    }
}
