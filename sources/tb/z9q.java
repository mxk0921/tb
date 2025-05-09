package tb;

import com.taobao.taobaoavsdk.cache.library.ProxyCacheException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface z9q {
    void a(long j, boolean z) throws ProxyCacheException;

    void close() throws ProxyCacheException;

    long length() throws ProxyCacheException;

    int read(byte[] bArr) throws ProxyCacheException;
}
