package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.ui.action.GraphicActionAnimation;
import com.taobao.weex.utils.WXLogUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qvw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<nid, String> f26962a;

    static {
        t2o.a(985661640);
        HashMap hashMap = new HashMap();
        f26962a = hashMap;
        hashMap.put(WXSDKEngine.getInstance(), "com.taobao.weex.WXSDKEngineImpl");
        hashMap.put(WXSDKManager.getInstance(), "com.taobao.weex.bridge.WXBridgeManager");
        hashMap.put(new GraphicActionAnimation(), "com.taobao.weex.ui.component.list.template.TemplateDom");
    }

    public static void a() {
        for (Map.Entry entry : ((HashMap) f26962a).entrySet()) {
            if (entry != null) {
                nid nidVar = (nid) entry.getKey();
                if (nidVar.getImpl() == null) {
                    try {
                        nidVar.setImpl(Class.forName((String) entry.getValue()).getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
                    } catch (Throwable th) {
                        WXLogUtils.e("weex1", th);
                    }
                }
            }
        }
    }
}
