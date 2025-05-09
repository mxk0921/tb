package tb;

import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jap extends iy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199327);
    }

    public jap(zxb zxbVar) {
        super(zxbVar);
    }

    public static /* synthetic */ Object ipc$super(jap japVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/request/SendLocalCacheDataRequest");
    }

    @Override // tb.jod
    public String a(RequestConfig requestConfig, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("523b998e", new Object[]{this, requestConfig, uxVar});
        }
        zxb zxbVar = this.f21638a;
        new f7h(zxbVar, zxbVar.x().getContext(), new b3o()).h(uxVar, null, requestConfig.g());
        return null;
    }
}
