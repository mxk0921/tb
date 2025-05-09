package tb;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface tzc {
    void a(byte[] bArr) throws IOException;

    void addHeader(String str, String str2);

    void b();

    void c(boolean z);

    void connect() throws IOException;

    int d() throws IOException;

    void disconnect();

    String e() throws IOException;

    void f(String str) throws IOException;

    Map<String, List<String>> g();

    String getMd5();

    void setFollowRedirects(boolean z);

    void setMethod(String str) throws ProtocolException;

    void setParams(Map<String, String> map);

    void setRetryTime(int i);
}
