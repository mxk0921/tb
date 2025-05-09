package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ot1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IRemoteBaseListener f25630a;
    public RemoteBusiness b;
    public IMTOPDataObject c;

    static {
        t2o.a(806356534);
    }

    public ot1(IRemoteBaseListener iRemoteBaseListener) {
        this.f25630a = iRemoteBaseListener;
    }

    public void a(int i, IMTOPDataObject iMTOPDataObject, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f58ffc4", new Object[]{this, new Integer(i), iMTOPDataObject, cls});
            return;
        }
        this.c = iMTOPDataObject;
        RemoteBusiness remoteBusiness = this.b;
        if (remoteBusiness != null) {
            remoteBusiness.cancelRequest();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(p1t.kLiveMtopBizCodeKey, "TAOBAO");
        RemoteBusiness remoteBusiness2 = (RemoteBusiness) RemoteBusiness.build(iMTOPDataObject).registeListener((IRemoteListener) this.f25630a).reqContext((Object) this).setBizId(59).headers((Map<String, String>) hashMap);
        this.b = remoteBusiness2;
        remoteBusiness2.startRequest(i, cls);
    }
}
