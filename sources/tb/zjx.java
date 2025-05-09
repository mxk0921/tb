package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.ubee.utils.ABDyeRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zjx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092265);
    }

    public static void a(IMTOPDataObject iMTOPDataObject, IRemoteBaseListener iRemoteBaseListener, Class<? extends BaseOutDo> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8426852a", new Object[]{iMTOPDataObject, iRemoteBaseListener, cls});
        } else {
            b(iMTOPDataObject, iRemoteBaseListener, cls, false, false);
        }
    }

    public static void b(IMTOPDataObject iMTOPDataObject, IRemoteBaseListener iRemoteBaseListener, Class<? extends BaseOutDo> cls, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b03d2a", new Object[]{iMTOPDataObject, iRemoteBaseListener, cls, new Boolean(z), new Boolean(z2)});
        } else if (iRemoteBaseListener != null) {
            MtopBusiness registerListener = MtopBusiness.build(Mtop.instance((String) null, gq0.g().getApplication()), iMTOPDataObject).registerListener((IRemoteListener) new ABDyeRemoteBaseListener(iRemoteBaseListener));
            registerListener.setBizId(String.valueOf(59));
            if (z) {
                registerListener.reqMethod(MethodEnum.POST);
            }
            if (z2) {
                registerListener.useWua();
            }
            registerListener.startRequest(cls);
        }
    }
}
