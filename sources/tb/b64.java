package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.datasource.CommonBaseDatasource;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b64 extends acx<CommonBaseDatasource> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final xfn c;

    static {
        t2o.a(815793338);
    }

    public b64(tnl<CommonBaseDatasource> tnlVar, CommonBaseDatasource commonBaseDatasource, xfn xfnVar) {
        super(tnlVar, commonBaseDatasource);
        this.c = xfnVar;
    }

    public static /* synthetic */ Object ipc$super(b64 b64Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/CommonModelAdapter");
    }

    public xfn l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xfn) ipChange.ipc$dispatch("7f7817da", new Object[]{this});
        }
        return this.c;
    }
}
