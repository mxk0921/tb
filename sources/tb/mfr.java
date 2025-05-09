package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class mfr extends kfr<xfr> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(804257795);
    }

    public static /* synthetic */ Object ipc$super(mfr mfrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/industry/tbiunicontainer/TBIDefaultDataEngine");
    }

    /* renamed from: d */
    public xfr a(qd2 qd2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xfr) ipChange.ipc$dispatch("ea0b51", new Object[]{this, qd2Var});
        }
        ckf.g(qd2Var, "bizData");
        Object parseObject = JSON.parseObject(qd2Var.a(), xfr.class);
        ckf.f(parseObject, "JSON.parseObject(bizData…ata, TBIMeta::class.java)");
        return (xfr) parseObject;
    }
}
