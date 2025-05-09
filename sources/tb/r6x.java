package tb;

import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface r6x {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void createWidgetComponent(int i, HashMap<String, String> hashMap);

        void destroyWidgetComponent(int i);
    }

    void createWidgetComponent(int i, HashMap<String, String> hashMap);

    void destroyWidgetComponent(int i);

    void setCreateWidgetComponentListener(a aVar);
}
