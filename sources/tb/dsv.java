package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dsv extends pz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789223);
    }

    public static dsv a(AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dsv) ipChange.ipc$dispatch("2567151a", new Object[]{aURARenderComponent, str});
        }
        return new dsv();
    }

    public static /* synthetic */ Object ipc$super(dsv dsvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/userMotion/model/UserMotionComponentClickEventNode");
    }
}
