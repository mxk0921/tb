package tb;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b3s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public e0c f16161a;
    public int b;

    public b3s(e0c e0cVar, int i) {
        this.f16161a = e0cVar;
        this.b = i;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f16161a = null;
        }
    }

    public void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f6a78c", new Object[]{this, str, str2, str3, str4});
            return;
        }
        a aVar = new a(this.b);
        aVar.e(this.f16161a);
        aVar.execute(str, str2, str3, str4);
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac10583d", new Object[]{this, new Integer(i)});
            return;
        }
        k6s.b("TLiveCDNFetchBusiness", "setTimeOut: " + i);
        this.b = i;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends AsyncTask<String, Integer, C0879a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public e0c f16162a;
        public final int b;

        public a(int i) {
            this.b = i;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/message_sdk/cdn/TLiveCDNFetchBusiness$DownloadTask");
        }

        public final String b(URL url) throws IOException {
            HttpsURLConnection httpsURLConnection;
            Throwable th;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d9c60673", new Object[]{this, url});
            }
            InputStream inputStream = null;
            String d = null;
            inputStream = null;
            try {
                httpsURLConnection = (HttpsURLConnection) url.openConnection();
                try {
                    httpsURLConnection.setReadTimeout(this.b);
                    httpsURLConnection.setConnectTimeout(this.b);
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setDoInput(true);
                    httpsURLConnection.connect();
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream2 = httpsURLConnection.getInputStream();
                        if (inputStream2 != null) {
                            try {
                                d = d(inputStream2);
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = inputStream2;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                }
                                throw th;
                            }
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        httpsURLConnection.disconnect();
                        return d;
                    }
                    throw new IOException("HTTP error code: " + responseCode);
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                httpsURLConnection = null;
            }
        }

        /* renamed from: c */
        public void onPostExecute(C0879a aVar) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b5d7fd2", new Object[]{this, aVar});
                return;
            }
            e0c e0cVar = this.f16162a;
            if (e0cVar == null) {
                return;
            }
            if (aVar == null || (str = aVar.b) == null) {
                ((fq2) e0cVar).i(aVar.f16163a, aVar.d, aVar.e, aVar.f, aVar);
            } else {
                ((fq2) e0cVar).k(aVar.f16163a, aVar.d, aVar.e, aVar.f, str);
            }
        }

        public String d(InputStream inputStream) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b5e072ea", new Object[]{this, inputStream});
            }
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            char[] cArr = new char[1024];
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    return stringBuffer.toString();
                }
                stringBuffer.append(cArr, 0, read);
            }
        }

        public void e(e0c e0cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c14f88d2", new Object[]{this, e0cVar});
            } else {
                this.f16162a = e0cVar;
            }
        }

        /* renamed from: a */
        public C0879a doInBackground(String... strArr) {
            Exception e;
            String str;
            String str2;
            String str3;
            String str4 = "0";
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0879a) ipChange.ipc$dispatch("48bef7f1", new Object[]{this, strArr});
            }
            if (isCancelled() || strArr == null || strArr.length <= 0) {
                return null;
            }
            String str5 = strArr[0];
            try {
                str2 = strArr[1];
                try {
                    str3 = strArr[2];
                } catch (Exception e2) {
                    e = e2;
                    str = str4;
                    str4 = str;
                    return new C0879a(this, str5, str2, str, str4, e);
                }
                try {
                    str4 = strArr[3];
                    URL url = new URL(str5);
                    k6s.a("TLiveCDNFetchBusiness", "urlString:" + str5);
                    return new C0879a(this, str5, str2, str3, str4, b(url));
                } catch (Exception e3) {
                    e = e3;
                    str2 = str2;
                    str = str3;
                    return new C0879a(this, str5, str2, str, str4, e);
                }
            } catch (Exception e4) {
                e = e4;
                str2 = "";
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.b3s$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0879a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final String f16163a;
            public final String b;
            public final Exception c;
            public final String d;
            public final String e;
            public final String f;

            public C0879a(a aVar, String str, String str2, String str3, String str4, String str5) {
                this.f16163a = str;
                this.d = str2;
                this.e = str3;
                this.f = str4;
                this.b = str5;
            }

            public String toString() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return "Result{url='" + this.f16163a + "'mResultValue='" + this.b + "', mException=" + this.c + '}';
            }

            public C0879a(a aVar, String str, String str2, String str3, String str4, Exception exc) {
                this.f16163a = str;
                this.d = str2;
                this.e = str3;
                this.f = str4;
                this.c = exc;
            }
        }
    }
}
