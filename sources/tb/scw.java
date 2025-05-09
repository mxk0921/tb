package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class scw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = scw.class.getSimpleName();

    static {
        t2o.a(779093466);
    }

    public static void a(ux9 ux9Var, b3d b3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2808154", new Object[]{ux9Var, b3dVar});
        }
    }

    public static void b(naj najVar, ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5940c967", new Object[]{najVar, iSmallWindowStrategy});
        } else if (najVar != null) {
            najVar.d(iSmallWindowStrategy);
        }
    }

    public static void c(ux9 ux9Var, b3d b3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbfc0fb", new Object[]{ux9Var, b3dVar});
        }
    }
}
