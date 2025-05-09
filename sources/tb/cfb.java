package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AlertConfirmInfo;
import tb.jdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface cfb extends jdb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337000);
        }

        public static void a(cfb cfbVar, ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dede95ef", new Object[]{cfbVar, errorResult});
                return;
            }
            ckf.g(errorResult, "result");
            jdb.a.a(cfbVar, errorResult);
        }
    }

    void B(AlertConfirmInfo alertConfirmInfo);

    void J(AlertConfirmInfo alertConfirmInfo);

    void n(AlertConfirmInfo alertConfirmInfo);
}
