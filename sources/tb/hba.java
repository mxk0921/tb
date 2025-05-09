package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hba extends nv1 implements v9c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782812);
        t2o.a(488636426);
    }

    public hba(lza lzaVar) {
        super(lzaVar);
    }

    public static /* synthetic */ Object ipc$super(hba hbaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/hostservice/callbcak/impl/GlobalDataCallBack");
    }

    @Override // tb.v9c
    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3dfc2e7f", new Object[]{this});
        }
        return w().l();
    }

    @Override // tb.v9c
    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("58e5c3fb", new Object[]{this});
        }
        return w().e();
    }
}
