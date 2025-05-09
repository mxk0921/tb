package mtopsdk.ssrcore.callback;

import java.util.List;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import tb.bgq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface SsrCallbackListener extends MtopListener {
    void onFinish(SsrFinishEvent ssrFinishEvent);

    void onReceiveData(bgq bgqVar, byte[] bArr);

    void onResponse(bgq bgqVar, int i, Map<String, List<String>> map);
}
