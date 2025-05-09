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
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c3s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public f0c f16836a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a extends AsyncTask<String, Integer, C0889a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public f0c f16837a;

        static {
            t2o.a(806355989);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/TLiveCDNFetchBusiness$DownloadTask");
        }

        /* renamed from: a */
        public C0889a doInBackground(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0889a) ipChange.ipc$dispatch("703372f4", new Object[]{this, strArr});
            }
            if (isCancelled() || strArr == null || strArr.length <= 0) {
                return null;
            }
            try {
                return new C0889a(this, b(new URL(strArr[0])));
            } catch (Exception e) {
                return new C0889a(this, e);
            }
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
                    httpsURLConnection.setReadTimeout(3000);
                    httpsURLConnection.setConnectTimeout(3000);
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
        public void onPostExecute(C0889a aVar) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2577e0ed", new Object[]{this, aVar});
                return;
            }
            f0c f0cVar = this.f16837a;
            if (f0cVar == null) {
                return;
            }
            if (aVar == null || (str = aVar.f16838a) == null) {
                f0cVar.onError(aVar);
            } else {
                f0cVar.onSuccess(str);
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

        public void e(f0c f0cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ecc8329d", new Object[]{this, f0cVar});
            } else {
                this.f16837a = f0cVar;
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.c3s$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class C0889a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final String f16838a;
            public final Exception b;

            static {
                t2o.a(806355990);
            }

            public C0889a(a aVar, String str) {
                this.f16838a = str;
            }

            public String toString() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return "Result{mResultValue='" + this.f16838a + "', mException=" + this.b + '}';
            }

            public C0889a(a aVar, Exception exc) {
                this.b = exc;
            }
        }
    }

    static {
        t2o.a(806355988);
    }

    public c3s(f0c f0cVar) {
        this.f16836a = f0cVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f16836a = null;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951942e", new Object[]{this, str});
            return;
        }
        a aVar = new a();
        aVar.e(this.f16836a);
        aVar.execute(str);
    }
}
