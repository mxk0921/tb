package tb;

import android.content.DialogInterface;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class a63 implements DialogInterface.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a63 INSTANCE = new a63();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
        } else {
            dialogInterface.cancel();
        }
    }
}
