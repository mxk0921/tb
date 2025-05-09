package tb;

import android.os.RemoteException;
import anetwork.channel.Request;
import anetwork.channel.aidl.Connection;
import anetwork.channel.aidl.ParcelableInputStream;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sb implements n55 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Request f27919a;
    public DegradableNetwork b;
    public Connection c;
    public ParcelableInputStream d;

    @Override // tb.n55
    public void a(URL url, m55 m55Var) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85f09dc", new Object[]{this, url, m55Var});
            return;
        }
        RequestImpl requestImpl = new RequestImpl(url);
        this.f27919a = requestImpl;
        requestImpl.setRetryTime(3);
        this.f27919a.setFollowRedirects(true);
        this.f27919a.setReadTimeout(m55Var.d());
        this.f27919a.setConnectTimeout(m55Var.c());
        this.f27919a.setBizId(m55Var.a());
        this.b = new DegradableNetwork(xh4.f31395a);
    }

    @Override // tb.n55
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327aa1be", new Object[]{this, str, str2});
        } else {
            this.f27919a.addHeader(str, str2);
        }
    }

    @Override // tb.n55
    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d10dd8ff", new Object[]{this})).longValue();
        }
        try {
            ParcelableInputStream f = f();
            if (f != null) {
                return f.length();
            }
            fs7.e("Anet", "getDownloadLength inputStream is null", new Object[0]);
            return 0L;
        } catch (RemoteException e) {
            fs7.d("Anet", "getDownloadLength", e, new Object[0]);
            return 0L;
        }
    }

    @Override // tb.n55
    public void connect() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66af7871", new Object[]{this});
        } else {
            this.c = this.b.getConnection(this.f27919a, null);
        }
    }

    @Override // tb.n55
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.c.getStatusCode());
            sb.append("\n");
            sb.append(this.c.getDesc());
            sb.append("\n");
            Map connHeadFields = this.c.getConnHeadFields();
            for (Object obj : connHeadFields.keySet()) {
                sb.append(obj);
                sb.append(":");
                sb.append(connHeadFields.get(obj));
                sb.append("\n");
            }
            return sb.toString();
        } catch (Throwable th) {
            fs7.d("Anet", "getErrorMsg", th, new Object[0]);
            return "";
        }
    }

    @Override // tb.n55
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d46d703", new Object[]{this});
            return;
        }
        try {
            this.c.cancel();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public final ParcelableInputStream f() throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ParcelableInputStream) ipChange.ipc$dispatch("7f03fa1c", new Object[]{this});
        }
        if (this.d == null) {
            this.d = this.c.getInputStream();
        }
        return this.d;
    }

    @Override // tb.n55
    public o55 getInputStream() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o55) ipChange.ipc$dispatch("6129a401", new Object[]{this});
        }
        try {
            return new tb(f());
        } catch (RemoteException e) {
            fs7.d("Anet", "getInputStream", e, new Object[0]);
            throw new IOException("Anet");
        }
    }

    @Override // tb.n55
    public int getStatusCode() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eae362ef", new Object[]{this})).intValue();
        }
        return this.c.getStatusCode();
    }
}
