package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class esv extends pz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789224);
    }

    public static esv a(AURARenderComponent aURARenderComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (esv) ipChange.ipc$dispatch("5d6babfa", new Object[]{aURARenderComponent, new Integer(i)});
        }
        return new esv();
    }

    public static /* synthetic */ Object ipc$super(esv esvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/userMotion/model/UserMotionComponentDisappearEventNode");
    }
}
