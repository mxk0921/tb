package tb;

import android.os.RemoteException;
import anet.channel.request.ByteArrayEntry;
import anetwork.channel.Request;
import anetwork.channel.aidl.Connection;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.entity.StringParam;
import anetwork.channel.util.RequestConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.a;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tqr implements tzc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Request f28890a;
    public DegradableNetwork b;
    public Connection c;
    public Map<String, String> d;
    public boolean e = false;
    public String f;

    static {
        t2o.a(613417070);
        t2o.a(613417071);
    }

    @Override // tb.tzc
    public void a(byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd2f1b2", new Object[]{this, bArr});
            return;
        }
        Request request = this.f28890a;
        if (request != null) {
            request.setBodyEntry(new ByteArrayEntry(bArr));
        }
    }

    @Override // tb.tzc
    public void addHeader(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f9a6a9", new Object[]{this, str, str2});
            return;
        }
        Request request = this.f28890a;
        if (request != null) {
            request.addHeader(str, str2);
        }
    }

    @Override // tb.tzc
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db139f3", new Object[]{this});
            return;
        }
        Request request = this.f28890a;
        if (request != null) {
            request.setExtProperty(RequestConstant.ENABLE_COOKIE, "false");
        }
    }

    @Override // tb.tzc
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec46bb36", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    @Override // tb.tzc
    public void connect() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66af7871", new Object[]{this});
        } else {
            this.c = this.b.getConnection(this.f28890a, null);
        }
    }

    @Override // tb.tzc
    public int d() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("baa782be", new Object[]{this})).intValue();
        }
        Connection connection = this.c;
        if (connection == null) {
            return 0;
        }
        try {
            return connection.getStatusCode();
        } catch (RemoteException e) {
            throw new IOException(e);
        }
    }

    @Override // tb.tzc
    public void disconnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9dd2f23", new Object[]{this});
            return;
        }
        try {
            Connection connection = this.c;
            if (connection != null) {
                connection.cancel();
            }
        } catch (RemoteException unused) {
        }
    }

    @Override // tb.tzc
    public void f(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e80a159", new Object[]{this, str});
            return;
        }
        this.b = new DegradableNetwork(a.g);
        RequestImpl requestImpl = new RequestImpl(str);
        this.f28890a = requestImpl;
        requestImpl.setCharset("utf-8");
        this.f28890a.setConnectTimeout(5000);
        this.f28890a.setReadTimeout(5000);
        Map<String, String> map = this.d;
        if (!(map == null || map.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, String> entry : this.d.entrySet()) {
                arrayList.add(new StringParam(entry.getKey(), entry.getValue()));
            }
            this.f28890a.setParams(arrayList);
        }
    }

    @Override // tb.tzc
    public Map<String, List<String>> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5f4e796b", new Object[]{this});
        }
        Connection connection = this.c;
        if (connection == null) {
            return null;
        }
        try {
            return connection.getConnHeadFields();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // tb.tzc
    public String getMd5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91115b1", new Object[]{this});
        }
        if (this.e) {
            return this.f;
        }
        return null;
    }

    @Override // tb.tzc
    public void setFollowRedirects(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0cfdb09", new Object[]{this, new Boolean(z)});
            return;
        }
        Request request = this.f28890a;
        if (request != null) {
            request.setFollowRedirects(z);
        }
    }

    @Override // tb.tzc
    public void setMethod(String str) throws ProtocolException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc10634", new Object[]{this, str});
            return;
        }
        Request request = this.f28890a;
        if (request != null) {
            request.setMethod(str);
        }
    }

    @Override // tb.tzc
    public void setParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70906a96", new Object[]{this, map});
        } else {
            this.d = map;
        }
    }

    @Override // tb.tzc
    public void setRetryTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdc93e9", new Object[]{this, new Integer(i)});
            return;
        }
        Request request = this.f28890a;
        if (request != null) {
            request.setRetryTime(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // tb.tzc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String e() throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.tqr.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "ddfee5a2"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r8
            java.lang.Object r0 = r1.ipc$dispatch(r2, r3)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0015:
            anetwork.channel.aidl.Connection r1 = r8.c
            r2 = 0
            if (r1 != 0) goto L_0x001b
            return r2
        L_0x001b:
            boolean r1 = r8.e     // Catch: all -> 0x0026, NoSuchAlgorithmException -> 0x002a, RemoteException -> 0x002f
            if (r1 == 0) goto L_0x0033
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: all -> 0x0026, NoSuchAlgorithmException -> 0x002a, RemoteException -> 0x002f
            goto L_0x0034
        L_0x0026:
            r0 = move-exception
            r4 = r2
            goto L_0x00b3
        L_0x002a:
            r1 = move-exception
            r3 = r2
            r4 = r3
            goto L_0x009a
        L_0x002f:
            r0 = move-exception
            r4 = r2
            goto L_0x00ac
        L_0x0033:
            r1 = r2
        L_0x0034:
            anetwork.channel.aidl.Connection r3 = r8.c     // Catch: all -> 0x0026, NoSuchAlgorithmException -> 0x002a, RemoteException -> 0x002f
            anetwork.channel.aidl.ParcelableInputStream r3 = r3.getInputStream()     // Catch: all -> 0x0026, NoSuchAlgorithmException -> 0x002a, RemoteException -> 0x002f
            if (r3 == 0) goto L_0x0092
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x0089, NoSuchAlgorithmException -> 0x008c, RemoteException -> 0x008f
            r4.<init>()     // Catch: all -> 0x0089, NoSuchAlgorithmException -> 0x008c, RemoteException -> 0x008f
            r5 = 2048(0x800, float:2.87E-42)
            byte[] r5 = new byte[r5]     // Catch: all -> 0x0059, NoSuchAlgorithmException -> 0x005c, RemoteException -> 0x005e
        L_0x0045:
            int r6 = r3.read(r5)     // Catch: all -> 0x0059, NoSuchAlgorithmException -> 0x005c, RemoteException -> 0x005e
            r7 = -1
            if (r6 == r7) goto L_0x0061
            r4.write(r5, r0, r6)     // Catch: all -> 0x0059, NoSuchAlgorithmException -> 0x005c, RemoteException -> 0x005e
            boolean r7 = r8.e     // Catch: all -> 0x0059, NoSuchAlgorithmException -> 0x005c, RemoteException -> 0x005e
            if (r7 == 0) goto L_0x0045
            if (r1 == 0) goto L_0x0045
            r1.update(r5, r0, r6)     // Catch: all -> 0x0059, NoSuchAlgorithmException -> 0x005c, RemoteException -> 0x005e
            goto L_0x0045
        L_0x0059:
            r0 = move-exception
        L_0x005a:
            r2 = r3
            goto L_0x00b3
        L_0x005c:
            r1 = move-exception
            goto L_0x009a
        L_0x005e:
            r0 = move-exception
        L_0x005f:
            r2 = r3
            goto L_0x00ac
        L_0x0061:
            boolean r5 = r8.e     // Catch: all -> 0x0059, NoSuchAlgorithmException -> 0x005c, RemoteException -> 0x005e
            if (r5 == 0) goto L_0x0076
            if (r1 == 0) goto L_0x0076
            java.lang.String r5 = new java.lang.String     // Catch: all -> 0x0059, NoSuchAlgorithmException -> 0x005c, RemoteException -> 0x005e
            byte[] r1 = r1.digest()     // Catch: all -> 0x0059, NoSuchAlgorithmException -> 0x005c, RemoteException -> 0x005e
            char[] r1 = tb.doh.a(r1)     // Catch: all -> 0x0059, NoSuchAlgorithmException -> 0x005c, RemoteException -> 0x005e
            r5.<init>(r1)     // Catch: all -> 0x0059, NoSuchAlgorithmException -> 0x005c, RemoteException -> 0x005e
            r8.f = r5     // Catch: all -> 0x0059, NoSuchAlgorithmException -> 0x005c, RemoteException -> 0x005e
        L_0x0076:
            java.lang.String r1 = new java.lang.String     // Catch: all -> 0x0059, NoSuchAlgorithmException -> 0x005c, RemoteException -> 0x005e
            byte[] r5 = r4.toByteArray()     // Catch: all -> 0x0059, NoSuchAlgorithmException -> 0x005c, RemoteException -> 0x005e
            java.lang.String r6 = "utf-8"
            r1.<init>(r5, r6)     // Catch: all -> 0x0059, NoSuchAlgorithmException -> 0x005c, RemoteException -> 0x005e
            r3.close()     // Catch: RemoteException -> 0x0085
        L_0x0085:
            tb.ibl.a(r4)
            return r1
        L_0x0089:
            r0 = move-exception
            r4 = r2
            goto L_0x005a
        L_0x008c:
            r1 = move-exception
            r4 = r2
            goto L_0x009a
        L_0x008f:
            r0 = move-exception
            r4 = r2
            goto L_0x005f
        L_0x0092:
            java.io.IOException r1 = new java.io.IOException     // Catch: all -> 0x0089, NoSuchAlgorithmException -> 0x008c, RemoteException -> 0x008f
            java.lang.String r4 = "[TBNet]InputStream is null"
            r1.<init>(r4)     // Catch: all -> 0x0089, NoSuchAlgorithmException -> 0x008c, RemoteException -> 0x008f
            throw r1     // Catch: all -> 0x0089, NoSuchAlgorithmException -> 0x008c, RemoteException -> 0x008f
        L_0x009a:
            java.lang.String r5 = "TBNetConnection"
            java.lang.String r6 = "MD5 fail"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: all -> 0x0059
            com.taobao.orange.util.OLog.e(r5, r6, r1, r0)     // Catch: all -> 0x0059
            if (r3 == 0) goto L_0x00a8
            r3.close()     // Catch: RemoteException -> 0x00a8
        L_0x00a8:
            tb.ibl.a(r4)
            return r2
        L_0x00ac:
            java.io.IOException r1 = new java.io.IOException     // Catch: all -> 0x00b2
            r1.<init>(r0)     // Catch: all -> 0x00b2
            throw r1     // Catch: all -> 0x00b2
        L_0x00b2:
            r0 = move-exception
        L_0x00b3:
            if (r2 == 0) goto L_0x00b8
            r2.close()     // Catch: RemoteException -> 0x00b8
        L_0x00b8:
            tb.ibl.a(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tqr.e():java.lang.String");
    }
}
