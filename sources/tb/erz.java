package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;
import com.taobao.homepage.pop.utils.PopConst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class erz implements m6z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final erz INSTANCE = new erz();

    static {
        t2o.a(598737225);
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
        TemplateItem c = jrz.c(jrz.INSTANCE, str, templateItem.c(), templateItem.e(), false, 8, null);
        if (c == null) {
            return new l6z(false, null);
        }
        if (templateItem.e() == c.e()) {
            return new l6z(true, c);
        }
        return new l6z(true, c);
    }
}
