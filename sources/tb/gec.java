package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ImagePreviewCloseResult;
import com.taobao.android.abilityidl.ability.ImagePreviewInteractionParam;
import tb.jdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface gec extends jdb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337068);
        }

        public static void a(gec gecVar, ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f05cb8f5", new Object[]{gecVar, errorResult});
                return;
            }
            ckf.g(errorResult, "result");
            jdb.a.a(gecVar, errorResult);
        }
    }

    void i(ImagePreviewInteractionParam imagePreviewInteractionParam);

    void u1(ImagePreviewCloseResult imagePreviewCloseResult);
}
