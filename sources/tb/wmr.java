package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class wmr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699285);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70bbcdf6", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract List<String> b();

    public abstract void c(List<DXTemplateItem> list);
}
