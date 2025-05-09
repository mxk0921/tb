package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface rwd {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909870);
        }

        public static /* synthetic */ ITMSPage a(rwd rwdVar, String str, Window window, JSONObject jSONObject, String str2, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITMSPage) ipChange.ipc$dispatch("71c663a9", new Object[]{rwdVar, str, window, jSONObject, str2, new Integer(i), obj});
            }
            if (obj == null) {
                if ((i & 8) != 0) {
                    str2 = "web";
                }
                return rwdVar.a(str, window, jSONObject, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createPageByUrl");
        }
    }

    ITMSPage a(String str, Window window, JSONObject jSONObject, String str2);

    ITMSPage b(String str, Window window, String str2, JSONObject jSONObject);
}
