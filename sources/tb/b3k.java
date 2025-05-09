package tb;

import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.request.CachedMainResponse;
import com.alibaba.android.nextrpc.request.RemoteMainResponse;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface b3k extends hkd {
    void a(List<AttachedResponse> list);

    void b(RemoteMainResponse remoteMainResponse);

    void c(CachedMainResponse cachedMainResponse);

    void e(RemoteMainResponse remoteMainResponse, List<AttachedResponse> list);

    void f(RemoteMainResponse remoteMainResponse);
}
