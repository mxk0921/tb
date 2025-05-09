package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface dkb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        boolean a(b bVar, IJsBridgeService.a.AbstractC0565a aVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        String getAction();

        String getContainerId();

        JSONObject getParams();
    }

    void a(String str, a aVar);

    boolean b(String str, b bVar, IJsBridgeService.a.AbstractC0565a aVar);
}
