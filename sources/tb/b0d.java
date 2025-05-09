package tb;

import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface b0d {
    void onError(int i, NetResponse netResponse, Object obj);

    void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj);

    void onSystemError(int i, NetResponse netResponse, Object obj);
}
