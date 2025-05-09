package tb;

import android.os.RemoteException;
import anetwork.channel.aidl.Connection;
import anetwork.channel.aidl.ParcelableInputStream;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.util.RequestConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.Error;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ub extends dtj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Connection b;

    static {
        t2o.a(996147275);
    }

    public ub(cuj cujVar) {
        DegradableNetwork degradableNetwork = new DegradableNetwork(yox.g());
        RequestImpl requestImpl = new RequestImpl(cujVar.e());
        if (iv7.p) {
            requestImpl.setRetryTime(2);
            requestImpl.setBizId(cujVar.a());
        } else {
            requestImpl.setBizId("ZCache");
        }
        if (cujVar.c() > 0) {
            requestImpl.setConnectTimeout(cujVar.c() * 1000);
        }
        requestImpl.setFollowRedirects(true);
        requestImpl.setMethod("GET");
        if (cujVar.b() != null) {
            for (Map.Entry<String, String> entry : cujVar.b().entrySet()) {
                requestImpl.addHeader(entry.getKey(), entry.getValue());
            }
        }
        if (cujVar.d() != null) {
            try {
                requestImpl.setExtProperty(RequestConstant.KEY_PARENT_TRACE_ID, cujVar.d());
            } catch (Exception unused) {
            }
        }
        this.b = degradableNetwork.getConnection(requestImpl, null);
    }

    public static /* synthetic */ Object ipc$super(ub ubVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/zcache/network/ANetwork");
    }

    @Override // tb.dtj
    public String b(String str) {
        Map<String, List<String>> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0a48918", new Object[]{this, str});
        }
        if (str == null || (e = e()) == null) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        Iterator<Map.Entry<String, List<String>>> it = e.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, List<String>> next = it.next();
            String key = next.getKey();
            if (key != null && lowerCase.contentEquals(key.toLowerCase())) {
                List<String> value = next.getValue();
                if (value != null && value.size() > 0) {
                    return value.get(0);
                }
            }
        }
        return null;
    }

    @Override // tb.dtj
    public InputStream d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("b713b4be", new Object[]{this});
        }
        try {
            ParcelableInputStream inputStream = this.b.getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new a(inputStream);
        } catch (RemoteException e) {
            g(-5, e);
            return null;
        }
    }

    @Override // tb.dtj
    public Map<String, List<String>> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("683d75de", new Object[]{this});
        }
        try {
            return this.b.getConnHeadFields();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // tb.dtj
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eae362ef", new Object[]{this})).intValue();
        }
        try {
            int statusCode = this.b.getStatusCode();
            if (statusCode < 0) {
                this.f18056a = new Error(statusCode, "NetworkSDK Error");
            }
            return statusCode;
        } catch (RemoteException | NullPointerException e) {
            g(-4, e);
            return 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a extends InputStream {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ParcelableInputStream f29269a;

        static {
            t2o.a(996147276);
        }

        public a(ParcelableInputStream parcelableInputStream) {
            this.f29269a = parcelableInputStream;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/zcache/network/ANetwork$StreamWrapper");
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6f9282c3", new Object[]{this})).intValue();
            }
            try {
                return this.f29269a.available();
            } catch (RemoteException e) {
                throw new IOException(e.getMessage(), e);
            }
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
                return;
            }
            try {
                this.f29269a.close();
            } catch (RemoteException e) {
                throw new IOException(e.getMessage(), e);
            }
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
            }
            try {
                return this.f29269a.readByte();
            } catch (RemoteException e) {
                throw new IOException(e.getMessage(), e);
            }
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7a0434f2", new Object[]{this, new Long(j)})).longValue();
            }
            try {
                return this.f29269a.skip((int) j);
            } catch (RemoteException e) {
                throw new IOException(e.getMessage(), e);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9ed24497", new Object[]{this, bArr})).intValue();
            }
            try {
                return this.f29269a.read(bArr);
            } catch (RemoteException e) {
                throw new IOException(e.getMessage(), e);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
            }
            try {
                return this.f29269a.readBytes(bArr, i, i2);
            } catch (RemoteException e) {
                throw new IOException(e.getMessage(), e);
            }
        }
    }
}
