package tb;

import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamOtherResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ppq {
    void a(List<AttachedResponse> list);

    void b(StreamOtherResponse streamOtherResponse);

    void c(StreamOtherResponse streamOtherResponse);

    void d(StreamRemoteMainResponse streamRemoteMainResponse, List<AttachedResponse> list);
}
