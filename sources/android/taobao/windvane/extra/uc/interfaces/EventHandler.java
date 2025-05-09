package android.taobao.windvane.extra.uc.interfaces;

import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface EventHandler {
    void data(byte[] bArr, int i);

    void endData();

    void error(int i, String str);

    int getResourceType();

    void headers(Object obj);

    void headers(Map<String, List<String>> map);

    boolean isSynchronous();

    void setRequest(IRequest iRequest);

    void setResourceType(int i);

    void status(int i, int i2, int i3, String str);
}
