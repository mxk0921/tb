package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;
import com.taobao.homepage.pop.utils.PopConst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class n6z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598737217);
    }

    public static final l6z a(String str, TemplateItem templateItem, byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6z) ipChange.ipc$dispatch("4d34456e", new Object[]{str, templateItem, new Byte(b)});
        }
        ckf.g(str, PopConst.BRIDGE_KEY_BUSINESS_ID);
        m6z a2 = o6z.INSTANCE.a(b);
        if (a2 == null) {
            return new l6z(false, null);
        }
        return a2.a(str, templateItem);
    }
}
