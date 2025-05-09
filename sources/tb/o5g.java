package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kirinvideoengine.states.model.KirinVideoStateModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class o5g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(500170814);
    }

    public static KirinVideoStateModel.a<String> b(m2c m2cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KirinVideoStateModel.a) ipChange.ipc$dispatch("ac559bd7", new Object[]{m2cVar});
        }
        return a(m2cVar).hasDownloadSet;
    }

    public static KirinVideoStateModel a(m2c m2cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KirinVideoStateModel) ipChange.ipc$dispatch("3cf7eb64", new Object[]{m2cVar});
        }
        KirinVideoStateModel kirinVideoStateModel = new KirinVideoStateModel();
        if (m2cVar != null) {
            kirinVideoStateModel = m2cVar.d();
        }
        if (kirinVideoStateModel != null) {
            return kirinVideoStateModel;
        }
        azf.d(o5g.class, "getBusinessVideoState", "业务传入的KirinVideoStateModel 为null");
        return new KirinVideoStateModel();
    }
}
