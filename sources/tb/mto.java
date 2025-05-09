package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mto extends ky1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593234);
    }

    public static /* synthetic */ Object ipc$super(mto mtoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/behavior/edgecomputing/node/SceneNode");
    }

    @Override // tb.ky1
    public String getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35374867", new Object[]{this});
        }
        return "scene_node";
    }
}
