package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.v2.result.MaResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kts {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(760217796);
    }

    public static MaResult[] a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult[]) ipChange.ipc$dispatch("43c704e2", new Object[]{bitmap});
        }
        return xxh.g(bitmap, 36607, false);
    }
}
