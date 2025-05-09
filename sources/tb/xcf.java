package tb;

import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.instantpatch.InstantPatchUpdater;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xcf implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ InstantPatchUpdater this$0;
    public final /* synthetic */ String val$msg;

    public xcf(InstantPatchUpdater instantPatchUpdater, String str) {
        this.this$0 = instantPatchUpdater;
        this.val$msg = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            Toast.makeText(kjv.sContext, this.val$msg, 1).show();
        }
    }
}
