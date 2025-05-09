package tb;

import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ubb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void a(List<kk> list);

        <T extends kk> void b(T t);

        <T extends kk> void c(T t, List<kk> list);

        void d(kk kkVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
        nk a(AURANextRPCEndpoint aURANextRPCEndpoint, AURANextRPCEndpoint aURANextRPCEndpoint2);

        void c(String str, Map<String, String> map);
    }

    void a(AURANextRPCEndpoint aURANextRPCEndpoint, a aVar);

    void b(AURANextRPCEndpoint aURANextRPCEndpoint, a aVar, b bVar);

    void release();
}
