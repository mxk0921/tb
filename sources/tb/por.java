package tb;

import android.os.RemoteException;
import android.text.TextUtils;
import anetwork.channel.aidl.Connection;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class por implements mlh {

    /* renamed from: a  reason: collision with root package name */
    public final Connection f26215a;

    public por(Connection connection) {
        this.f26215a = connection;
    }

    public final String A(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof List)) {
            return "";
        }
        List list = (List) obj;
        if (list.size() != 0) {
            return A(list.get(0));
        }
        return "";
    }

    public boolean C() {
        try {
            if (this.f26215a.getStatusCode() / 100 == 2) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f26215a.cancel();
        } catch (RemoteException e) {
            zhh.c("close error failed ", e);
            e.printStackTrace();
        }
    }

    public InputStream e() throws IOException {
        try {
            return new pql(this.f26215a.getInputStream());
        } catch (RemoteException unused) {
            throw new IOException("remote error");
        }
    }

    public String g() {
        Connection connection = this.f26215a;
        try {
            String A = A(connection.getConnHeadFields().get("content-type"));
            if (TextUtils.isEmpty(A)) {
                return A(connection.getConnHeadFields().get("Content-Type"));
            }
            return A;
        } catch (Exception unused) {
            return "";
        }
    }

    public String w() {
        Connection connection = this.f26215a;
        try {
            if (C()) {
                return null;
            }
            return "Unable to fetch " + connection.getDesc() + ". Failed with " + connection.getStatusCode();
        } catch (Exception e) {
            zhh.c("get error failed ", e);
            return e.getMessage();
        }
    }
}
