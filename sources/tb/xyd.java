package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class xyd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793539);
    }

    public static final boolean a(Activity activity) {
        wyd wydVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea597146", new Object[]{activity})).booleanValue();
        }
        ckf.g(activity, "activity");
        if (activity instanceof wyd) {
            wydVar = (wyd) activity;
        } else {
            wydVar = null;
        }
        if (wydVar == null || !wydVar.l()) {
            return false;
        }
        return true;
    }
}
