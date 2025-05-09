package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.services.IBaseService;
import com.taobao.statistic.TBS;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class p87 implements y7e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1018167396);
        t2o.a(1018167384);
    }

    @Override // tb.y7e
    public void b(String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a69904", new Object[]{this, str, new Integer(i), obj, obj2, obj3, strArr});
        } else {
            TBS.Ext.commitEvent(str, i, obj, obj2, obj3, strArr);
        }
    }

    @Override // com.taobao.alimama.services.IBaseService
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1300238f", new Object[]{this});
        }
        return IBaseService.Names.SERVICE_USER_TRACK.name();
    }
}
