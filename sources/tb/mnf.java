package tb;

import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface mnf {
    void onError(bgq bgqVar, egq egqVar);

    void onFinish(bgq bgqVar);

    void onReceiveData(bgq bgqVar, byte[] bArr);

    void onResponse(bgq bgqVar, int i, Map<String, List<String>> map);
}
