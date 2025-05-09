package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uhu extends env {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(578813960);
    }

    public static /* synthetic */ Object ipc$super(uhu uhuVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/bundle/nav/TriverNavProcessorNodeUriFilterItem0");
    }

    @Override // tb.env, tb.dnv
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue();
        }
        return str.equals("openMiniAppIdeDebugInfo") || str.equals("miniAppIDEDebug");
    }
}
