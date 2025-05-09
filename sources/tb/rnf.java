package tb;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ma4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class rnf<T extends ma4> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(666894546);
    }

    public rnf(Context context) {
    }

    public abstract void a(T t, int i);

    public abstract View b(boolean z, JSONObject jSONObject);

    public int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55114e94", new Object[]{this, context})).intValue();
        }
        return ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getWidth();
    }
}
