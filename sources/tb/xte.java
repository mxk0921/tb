package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xte implements xec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public i1c f31597a;

    public xte(String str) {
        TLog.logd("InfoFlowAdServiceImpl", "InfoFlowAdServiceImpl", "bizType : " + str);
    }

    @Override // tb.xec
    public i1c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i1c) ipChange.ipc$dispatch("e7de6a70", new Object[]{this});
        }
        if (this.f31597a == null) {
            this.f31597a = new g38();
        }
        return this.f31597a;
    }
}
