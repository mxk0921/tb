package tb;

import java.io.IOException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ptx {

    /* renamed from: a  reason: collision with root package name */
    public SSLContext f26299a = null;
    public final String b;

    public ptx(String str) {
        this.b = str;
    }

    public static SSLContext b(String str) {
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, new TrustManager[]{new hxx(str)}, null);
            return instance;
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    public final SSLContext a() {
        if (this.f26299a == null) {
            this.f26299a = b(this.b);
        }
        return this.f26299a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(ptx.class)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ptx.class.hashCode();
    }
}
