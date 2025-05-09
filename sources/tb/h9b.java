package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.util.OLog;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class h9b implements tzc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HttpURLConnection f20483a;
    public Map<String, String> b;
    public boolean c = false;
    public String d;

    static {
        t2o.a(613417068);
        t2o.a(613417071);
    }

    @Override // tb.tzc
    public void a(byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd2f1b2", new Object[]{this, bArr});
            return;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(this.f20483a.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        ibl.a(dataOutputStream);
    }

    @Override // tb.tzc
    public void addHeader(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f9a6a9", new Object[]{this, str, str2});
        } else {
            this.f20483a.addRequestProperty(str, str2);
        }
    }

    @Override // tb.tzc
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db139f3", new Object[]{this});
        }
    }

    @Override // tb.tzc
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec46bb36", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    @Override // tb.tzc
    public void connect() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66af7871", new Object[]{this});
        } else {
            this.f20483a.connect();
        }
    }

    @Override // tb.tzc
    public int d() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("baa782be", new Object[]{this})).intValue();
        }
        HttpURLConnection httpURLConnection = this.f20483a;
        if (httpURLConnection == null) {
            return 0;
        }
        return httpURLConnection.getResponseCode();
    }

    @Override // tb.tzc
    public void disconnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9dd2f23", new Object[]{this});
            return;
        }
        HttpURLConnection httpURLConnection = this.f20483a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // tb.tzc
    public Map<String, List<String>> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5f4e796b", new Object[]{this});
        }
        HttpURLConnection httpURLConnection = this.f20483a;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // tb.tzc
    public String getMd5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91115b1", new Object[]{this});
        }
        if (this.c) {
            return this.d;
        }
        return null;
    }

    @Override // tb.tzc
    public void setFollowRedirects(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0cfdb09", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.tzc
    public void setMethod(String str) throws ProtocolException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc10634", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.f20483a.setRequestMethod(str);
            if ("POST".equalsIgnoreCase(str)) {
                this.f20483a.setDoOutput(true);
            }
        }
    }

    @Override // tb.tzc
    public void setParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70906a96", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }

    @Override // tb.tzc
    public void setRetryTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdc93e9", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.tzc
    public String e() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        IOException e;
        InputStream inputStream;
        NoSuchAlgorithmException e2;
        MessageDigest instance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ddfee5a2", new Object[]{this});
        }
        InputStream inputStream2 = null;
        try {
            if (this.f20483a == null) {
                return null;
            }
            try {
                instance = this.c ? MessageDigest.getInstance("MD5") : null;
                inputStream = this.f20483a.getInputStream();
            } catch (IOException e3) {
                e = e3;
                byteArrayOutputStream = null;
            } catch (NoSuchAlgorithmException e4) {
                e2 = e4;
                inputStream = null;
                byteArrayOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
                ibl.a(inputStream2);
                ibl.a(byteArrayOutputStream);
                throw th;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                        if (this.c && instance != null) {
                            instance.update(bArr, 0, read);
                        }
                    }
                    if (this.c && instance != null) {
                        this.d = new String(doh.a(instance.digest()));
                    }
                    String str = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                    ibl.a(inputStream);
                    ibl.a(byteArrayOutputStream);
                    return str;
                } catch (IOException e5) {
                    e = e5;
                    inputStream2 = inputStream;
                    try {
                        throw e;
                    } catch (Throwable th3) {
                        th = th3;
                        ibl.a(inputStream2);
                        ibl.a(byteArrayOutputStream);
                        throw th;
                    }
                } catch (NoSuchAlgorithmException e6) {
                    e2 = e6;
                    OLog.e("HurlNetConnection", "MD5 fail", e2, new Object[0]);
                    ibl.a(inputStream);
                    ibl.a(byteArrayOutputStream);
                    return null;
                }
            } catch (IOException e7) {
                e = e7;
                byteArrayOutputStream = null;
            } catch (NoSuchAlgorithmException e8) {
                e2 = e8;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
                inputStream2 = inputStream;
                ibl.a(inputStream2);
                ibl.a(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // tb.tzc
    public void f(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e80a159", new Object[]{this, str});
            return;
        }
        String c = ibl.c(this.b, "utf-8");
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isEmpty(c)) {
            sb.append(f7l.CONDITION_IF);
            sb.append(c);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
        this.f20483a = httpURLConnection;
        httpURLConnection.setConnectTimeout(5000);
        this.f20483a.setReadTimeout(5000);
        this.f20483a.setUseCaches(false);
        this.f20483a.setDoInput(true);
    }
}
