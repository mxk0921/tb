package tb;

import android.content.Context;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h87 implements g1e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(519045158);
        t2o.a(519045159);
    }

    @Override // tb.g1e
    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa33c00e", new Object[]{this, context, str});
        } else {
            Toast.makeText(context, str, 0).show();
        }
    }
}
