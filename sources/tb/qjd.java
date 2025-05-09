package tb;

import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface qjd {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a extends b {
        void c(String str, AwesomeGetRequestParams awesomeGetRequestParams, es8 es8Var);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void a(String str, String str2, String str3);

        void b(String str, String str2, AwesomeGetData awesomeGetData, boolean z);

        void d(String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, boolean z);
    }

    void m(b bVar);

    void r(b bVar);
}
