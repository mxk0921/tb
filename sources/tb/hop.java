package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class hop extends DXTemplateItem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int o;

    static {
        t2o.a(766509447);
    }

    public static /* synthetic */ Object ipc$super(hop hopVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/data/ShopDXTemplateItem");
    }

    public final int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcc18c98", new Object[]{this})).intValue();
        }
        return this.o;
    }

    public final void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7068772", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }
}
