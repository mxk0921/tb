package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.ICacheService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ut3 implements ICacheService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f29597a = new ArrayList();

    static {
        t2o.a(486539330);
        t2o.a(488636522);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.ICacheService.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa0cab2", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ((ArrayList) this.f29597a).add(str);
        }
    }
}
