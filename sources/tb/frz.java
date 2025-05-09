package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;
import com.taobao.homepage.pop.utils.PopConst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class frz implements m6z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final frz INSTANCE = new frz();

    static {
        t2o.a(598737226);
        t2o.a(598737216);
    }

    @Override // tb.m6z
    public l6z a(String str, TemplateItem templateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6z) ipChange.ipc$dispatch("3b4e48b7", new Object[]{this, str, templateItem});
        }
        ckf.g(str, PopConst.BRIDGE_KEY_BUSINESS_ID);
        if (templateItem == null) {
            return new l6z(false, null);
        }
        TemplateItem e = jrz.e(jrz.INSTANCE, str, templateItem.c(), templateItem.e(), false, 8, null);
        if (e == null) {
            return new l6z(false, null);
        }
        return new l6z(true, e);
    }
}
