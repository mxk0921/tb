package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.PreLoadModel;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fyj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UMBRELLA_LAY_PAGE_TAG_ID = "Monitor_NewDetail_HomeLayPageSendRequest";
    public static final String UMBRELLA_ON_SCREEN_TAG_ID = "Monitor_NewDetail_HomeOnScreenSendRequest";

    static {
        t2o.a(491782437);
    }

    public static String a(PreLoadModel preLoadModel) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d49610cf", new Object[]{preLoadModel});
        }
        if (preLoadModel.getItems() != null) {
            i = preLoadModel.getItems().size();
        }
        return i + "";
    }

    public static void b(String str, PreLoadModel preLoadModel, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5969cbdc", new Object[]{str, preLoadModel, th});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("count", a(preLoadModel));
        tve.b("eventProcess", str, "2.0", "Page_NewDetail", null, hashMap, "newDetailPreLoadError", th.getMessage());
    }

    public static void c(String str, PreLoadModel preLoadModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d32ee72", new Object[]{str, preLoadModel});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("count", a(preLoadModel));
        tve.c("eventProcess", str, "2.0", "Page_NewDetail", null, hashMap);
    }
}
