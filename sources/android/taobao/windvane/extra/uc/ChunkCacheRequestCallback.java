package android.taobao.windvane.extra.uc;

import java.util.List;
import java.util.Map;
import tb.bgq;
import tb.egq;
import tb.mnf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ChunkCacheRequestCallback extends mnf {
    void onCustomCallback(int i, Object... objArr);

    @Override // tb.mnf
    /* synthetic */ void onError(bgq bgqVar, egq egqVar);

    @Override // tb.mnf
    /* synthetic */ void onFinish(bgq bgqVar);

    void onNetworkResponse(int i, Map<String, List<String>> map);

    @Override // tb.mnf
    /* synthetic */ void onReceiveData(bgq bgqVar, byte[] bArr);

    @Override // tb.mnf
    /* synthetic */ void onResponse(bgq bgqVar, int i, Map map);
}
