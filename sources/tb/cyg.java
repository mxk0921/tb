package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.model.SimpleLiveInfo;
import com.taobao.tao.Globals;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cyg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_PAGE_NAME = "Page_MiniLive";

    /* renamed from: a  reason: collision with root package name */
    public boolean f17433a = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17434a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(b bVar, String str, String str2) {
            this.f17434a = bVar;
            this.b = str;
            this.c = str2;
        }

        @Override // tb.cyg.b
        public void onSuccess(Object obj) {
            b bVar;
            String str = "";
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            } else if (!cyg.a(cyg.this) && (obj instanceof c.a)) {
                efs.a("TBLiveService", "onSuccess");
                try {
                    HashMap hashMap = new HashMap();
                    if ((((c.a) obj).f17436a instanceof SimpleLiveInfo) && (bVar = this.f17434a) != null) {
                        SimpleLiveInfo simpleLiveInfo = ((c.a) obj).f17436a;
                        if (simpleLiveInfo != null) {
                            bVar.onSuccess(simpleLiveInfo);
                        } else {
                            hashMap.put("errorMsg", "result is empty");
                            this.f17434a.onError(null);
                        }
                    } else if (this.f17434a != null) {
                        hashMap.put("errorMsg", "result is empty");
                        this.f17434a.onError(null);
                    }
                    if (v2s.o().E() != null) {
                        hashMap.put("url", this.b);
                        hashMap.put("success", Boolean.TRUE);
                        hashMap.put("liveId", this.c);
                        hashMap.put("userId", v2s.o().u() != null ? v2s.o().u().getUserId() : str);
                        v2s.o().E().track4Click(cyg.UT_PAGE_NAME, "fetchLiveInfo", hashMap);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    b bVar2 = this.f17434a;
                    if (bVar2 != null) {
                        bVar2.onError(null);
                    }
                    if (v2s.o().E() != null) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("url", this.b);
                        hashMap2.put("success", Boolean.FALSE);
                        hashMap2.put("liveId", this.c);
                        hashMap2.put("errorMsg", e.getMessage());
                        if (v2s.o().u() != null) {
                            str = v2s.o().u().getUserId();
                        }
                        hashMap2.put("userId", str);
                        v2s.o().E().track4Click(cyg.UT_PAGE_NAME, "fetchLiveInfo", hashMap2);
                    }
                }
            }
        }

        @Override // tb.cyg.b
        public void onError(Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
            } else if (!cyg.a(cyg.this)) {
                b bVar = this.f17434a;
                if (bVar != null) {
                    bVar.onError(null);
                }
                if (iw0.j(Globals.getApplication())) {
                    Toast.makeText(Globals.getApplication(), "接口请求失败!", 1).show();
                }
                efs.a("TBLiveService", "onError");
                if (v2s.o().E() != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("url", this.b);
                    hashMap.put("success", Boolean.FALSE);
                    hashMap.put("liveId", this.c);
                    hashMap.put("errorMsg", "networkFailure");
                    if (v2s.o().u() != null) {
                        str = v2s.o().u().getUserId();
                    } else {
                        str = "";
                    }
                    hashMap.put("userId", str);
                    v2s.o().E().track4Click(cyg.UT_PAGE_NAME, "fetchLiveInfo", hashMap);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void onError(Object obj);

        void onSuccess(Object obj);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends AsyncTask<String, Integer, a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public b f17435a;

        static {
            t2o.a(779092034);
        }

        public c(cyg cygVar) {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/miniLive/services/LiveDetailFetchBusiness$DownloadTask");
        }

        /* renamed from: a */
        public a doInBackground(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("888114d6", new Object[]{this, strArr});
            }
            if (isCancelled() || strArr == null || strArr.length <= 0) {
                return null;
            }
            try {
                String b = b(new URL(strArr[0]));
                if (b == null || b.length() <= 2) {
                    return null;
                }
                return new a(this, (SimpleLiveInfo) JSON.parseObject(b, SimpleLiveInfo.class));
            } catch (Exception e) {
                return new a(this, e);
            }
        }

        public final String b(URL url) throws IOException {
            Throwable th;
            HttpURLConnection httpURLConnection;
            HttpURLConnection httpURLConnection2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d9c60673", new Object[]{this, url});
            }
            InputStream inputStream = null;
            String d = null;
            inputStream = null;
            try {
                if (TextUtils.equals(url.getProtocol(), "https")) {
                    httpURLConnection2 = (HttpsURLConnection) url.openConnection();
                } else {
                    httpURLConnection2 = (HttpURLConnection) url.openConnection();
                }
                try {
                    httpURLConnection2.setReadTimeout(3000);
                    httpURLConnection2.setConnectTimeout(3000);
                    httpURLConnection2.setRequestMethod("GET");
                    httpURLConnection2.setDoInput(true);
                    httpURLConnection2.connect();
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream2 = httpURLConnection2.getInputStream();
                        if (inputStream2 != null) {
                            try {
                                d = d(inputStream2);
                            } catch (Throwable th2) {
                                inputStream = inputStream2;
                                httpURLConnection = httpURLConnection2;
                                th = th2;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                throw th;
                            }
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        httpURLConnection2.disconnect();
                        return d;
                    }
                    throw new IOException("HTTP error code: " + responseCode);
                } catch (Throwable th3) {
                    httpURLConnection = httpURLConnection2;
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = null;
            }
        }

        /* renamed from: c */
        public void onPostExecute(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dca6d77", new Object[]{this, aVar});
                return;
            }
            b bVar = this.f17435a;
            if (bVar == null) {
                return;
            }
            if (aVar == null || !(aVar.f17436a instanceof SimpleLiveInfo)) {
                bVar.onError(aVar);
            } else {
                bVar.onSuccess(aVar);
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

        public void e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efa83141", new Object[]{this, bVar});
            } else {
                this.f17435a = bVar;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a {

            /* renamed from: a  reason: collision with root package name */
            public final SimpleLiveInfo f17436a;

            static {
                t2o.a(779092035);
            }

            public a(c cVar, SimpleLiveInfo simpleLiveInfo) {
                this.f17436a = simpleLiveInfo;
            }

            public a(c cVar, Exception exc) {
            }
        }
    }

    static {
        t2o.a(779092030);
        t2o.a(779092012);
    }

    public static /* synthetic */ boolean a(cyg cygVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("383681e5", new Object[]{cygVar})).booleanValue();
        }
        return cygVar.f17433a;
    }

    public void b(String str, String str2, b bVar) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("385eb4d7", new Object[]{this, str, str2, bVar});
            return;
        }
        String f = f3s.f();
        if (!TextUtils.isEmpty(f)) {
            String str4 = "";
            if (TextUtils.equals("detail", str2)) {
                str3 = "?bizCode=TAOBAO_DETAIL";
            } else {
                str3 = TextUtils.equals("shop", str2) ? "?bizCode=SHOP" : str4;
            }
            String str5 = f + str + str3;
            c cVar = new c(this);
            cVar.e(new a(bVar, str5, str));
            cVar.execute(str5);
            if (v2s.o().E() != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("url", str5);
                hashMap.put("liveId", str);
                if (v2s.o().u() != null) {
                    str4 = v2s.o().u().getUserId();
                }
                hashMap.put("userId", str4);
                v2s.o().E().track4Click(UT_PAGE_NAME, "startFetchLiveInfo", hashMap);
            }
            efs.a("TBLiveService", "startFetchLiveInfo");
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f154f2", new Object[]{this, new Boolean(z)});
        } else {
            this.f17433a = z;
        }
    }
}
