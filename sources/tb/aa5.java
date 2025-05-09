package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.musie.video.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class aa5 implements upc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792790);
        t2o.a(986710022);
    }

    @Override // tb.upc
    public spc a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (spc) ipChange.ipc$dispatch("2be7285", new Object[]{this, context});
        }
        return new a(context);
    }
}
