package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.bsdiff.Bsdiff;
import java.io.File;
import java.io.IOException;
import tb.egd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qm2 implements egd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public egd.a a(Context context, File file, File file2, File file3) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (egd.a) ipChange.ipc$dispatch("96fb6439", new Object[]{this, context, file, file2, file3});
        }
        try {
            jg9.i(file3);
            int patch = Bsdiff.patch(file.getPath(), file2.getPath(), file3.getPath());
            if (patch != 0) {
                z = false;
            }
            return new egd.a(z, patch);
        } catch (IOException unused) {
            return new egd.a(false, -1);
        }
    }
}
