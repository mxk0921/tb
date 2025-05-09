package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IAiService;
import com.taobao.infoflow.taobao.subservice.biz.aiservice.impl.AiServiceImpl;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wso {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, pmd> f30900a;

    static {
        HashMap hashMap = new HashMap();
        f30900a = hashMap;
        hashMap.put(xn4.NEW_FACE_CHILD_INTL.getContainerId(), new cnn());
    }

    public static IAiService a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAiService) ipChange.ipc$dispatch("b74ef440", new Object[]{str});
        }
        pmd pmdVar = (pmd) ((HashMap) f30900a).get(str);
        if (pmdVar == null) {
            return new AiServiceImpl();
        }
        return pmdVar.a();
    }
}
