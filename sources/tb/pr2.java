package tb;

import com.taobao.taobaoavsdk.cache.library.ProxyCacheException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface pr2 {
    void a(byte[] bArr, int i) throws ProxyCacheException;

    long available() throws ProxyCacheException;

    int b(byte[] bArr, long j, int i) throws ProxyCacheException;

    void close() throws ProxyCacheException;

    void complete() throws ProxyCacheException;

    boolean isCompleted();
}
