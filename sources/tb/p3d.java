package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.OpenContainerLoadAppInfoResult;
import tb.jdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface p3d extends jdb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337092);
        }

        public static void a(p3d p3dVar, ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9205abe8", new Object[]{p3dVar, errorResult});
                return;
            }
            ckf.g(errorResult, "result");
            jdb.a.a(p3dVar, errorResult);
        }
    }

    void M0(OpenContainerLoadAppInfoResult openContainerLoadAppInfoResult);
}
