package tb;

import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface gpc {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a(dxh dxhVar);

        void onHeadersReceived(int i, Map<String, List<String>> map);

        void onHttpResponseProgress(int i);

        void onHttpStart();
    }

    void a(bxh bxhVar, a aVar);
}
