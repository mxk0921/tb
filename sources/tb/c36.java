package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface c36 {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(804257844);
        }

        public static void a(c36 c36Var, DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bacdaf2", new Object[]{c36Var, dXTemplateItem});
            } else {
                ckf.g(dXTemplateItem, "item");
            }
        }
    }

    void a(DXRootView dXRootView);

    void b(DXTemplateItem dXTemplateItem);

    void c(DXTemplateItem dXTemplateItem, f fVar);
}
