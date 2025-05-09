package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.FavoriteGuideResultData;
import tb.jdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface k5c extends jdb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337042);
        }

        public static void a(k5c k5cVar, ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d9fb89a", new Object[]{k5cVar, errorResult});
                return;
            }
            ckf.g(errorResult, "result");
            jdb.a.a(k5cVar, errorResult);
        }
    }

    void L(FavoriteGuideResultData favoriteGuideResultData);
}
