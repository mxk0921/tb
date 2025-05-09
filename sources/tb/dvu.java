package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dvu extends rwh<dvu> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(986710086);
    }

    public dvu(UINode uINode) {
        super(uINode);
    }

    public static /* synthetic */ Object ipc$super(dvu dvuVar, String str, Object... objArr) {
        if (str.hashCode() == 784437744) {
            super.b((Map) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/ui/UINodeExtra");
    }

    @Override // tb.rwh
    public void b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec191f0", new Object[]{this, map});
            return;
        }
        super.b(map);
        if (!map.isEmpty()) {
            this.c.updateExtra(map);
        }
    }
}
