package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.services.IBaseService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class q77 implements l0e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1018167394);
        t2o.a(1018167382);
    }

    @Override // com.taobao.alimama.services.IBaseService
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1300238f", new Object[]{this});
        }
        return IBaseService.Names.SERVICE_TIME.name();
    }

    @Override // tb.l0e
    public long getTimestamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3737eedb", new Object[]{this})).longValue();
        }
        return System.currentTimeMillis();
    }
}
