package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.FavoriteResultData;
import tb.jdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface m5c extends jdb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337044);
        }

        public static void a(m5c m5cVar, ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e546e1b2", new Object[]{m5cVar, errorResult});
                return;
            }
            ckf.g(errorResult, "result");
            jdb.a.a(m5cVar, errorResult);
        }
    }

    void q0(FavoriteResultData favoriteResultData);
}
