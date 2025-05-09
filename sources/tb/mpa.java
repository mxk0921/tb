package tb;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class mpa implements pdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.pdb
    public ExecuteResult invoke(String str, String str2, kdb kdbVar, Map<String, ? extends Object> map, s2d s2dVar, ndb ndbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("589945a3", new Object[]{this, str, str2, kdbVar, map, s2dVar, ndbVar});
        }
        ckf.g(str, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(str2, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(s2dVar, "callback");
        ckf.g(ndbVar, "next");
        if (!vpw.commonConfig.H1) {
            return ndbVar.a(str, str2, kdbVar, map, s2dVar);
        }
        Object m = kdbVar.m("url");
        if (!(m instanceof String)) {
            return ErrorResult.a.Companion.e("url is not String");
        }
        if (hrw.c().a((String) m, str, str2, null)) {
            return ndbVar.a(str, str2, kdbVar, map, s2dVar);
        }
        ErrorResult.a.C0055a aVar = ErrorResult.a.Companion;
        return aVar.e("calling " + str + '.' + str2 + " is not allowed in url " + m);
    }
}
