package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.ShareGoodsListMessage;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class aof {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f15897a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(aof aofVar, b bVar, String str, String str2) {
            this.f15897a = bVar;
            this.b = str;
            this.c = str2;
        }

        @Override // tb.aof.b
        public void onError(Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
                return;
            }
            b bVar = this.f15897a;
            if (bVar != null) {
                bVar.onError(null);
            }
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
                v2s.o().E().track4Click("Page_TaobaoLiveWatch", "fetchedItemInfo", hashMap);
            }
        }

        @Override // tb.aof.b
        public void onSuccess(Object obj) {
            String str = "";
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            } else if (obj instanceof c.a) {
                try {
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(((c.a) obj).f15899a) && this.f15897a != null) {
                        HashMap hashMap2 = (HashMap) JSON.parseObject(((c.a) obj).f15899a, HashMap.class);
                        if (hashMap2 == null || hashMap2.get("list") == null) {
                            hashMap.put("errorMsg", "map is empty");
                            this.f15897a.onError(null);
                        } else {
                            this.f15897a.onSuccess(JSON.parseArray(JSON.toJSONString(hashMap2.get("list")), ShareGoodsListMessage.class));
                        }
                    } else if (this.f15897a != null) {
                        hashMap.put("errorMsg", "result is empty");
                        this.f15897a.onError(null);
                    }
                    if (v2s.o().E() != null) {
                        hashMap.put("url", this.b);
                        hashMap.put("success", Boolean.TRUE);
                        hashMap.put("liveId", this.c);
                        hashMap.put("userId", v2s.o().u() != null ? v2s.o().u().getUserId() : str);
                        v2s.o().E().track4Click("Page_TaobaoLiveWatch", "fetchedItemInfo", hashMap);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    b bVar = this.f15897a;
                    if (bVar != null) {
                        bVar.onError(null);
                    }
                    if (v2s.o().E() != null) {
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("url", this.b);
                        hashMap3.put("success", Boolean.FALSE);
                        hashMap3.put("liveId", this.c);
                        hashMap3.put("errorMsg", e.getMessage());
                        if (v2s.o().u() != null) {
                            str = v2s.o().u().getUserId();
                        }
                        hashMap3.put("userId", str);
                        v2s.o().E().track4Click("Page_TaobaoLiveWatch", "fetchedItemInfo", hashMap3);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void onError(Object obj);

        void onSuccess(Object obj);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c extends AsyncTask<String, Integer, a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public b f15898a;

        static {
            t2o.a(806355984);
        }

        public c(aof aofVar) {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/ItemFetchBusiness$DownloadTask");
        }

        /* renamed from: a */
        public a doInBackground(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("850e6efa", new Object[]{this, strArr});
            }
            if (isCancelled() || strArr == null || strArr.length <= 0) {
                return null;
            }
            try {
                String b = b(new URL(strArr[0]));
                if (b != null) {
                    return new a(this, b);
                }
                return null;
            } catch (Exception e) {
                return new a(this, e);
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
        public void onPostExecute(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f089a973", new Object[]{this, aVar});
            } else if (this.f15898a == null) {
            } else {
                if (!TextUtils.isEmpty(aVar.f15899a)) {
                    this.f15898a.onSuccess(aVar);
                } else {
                    this.f15898a.onError(aVar);
                }
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
                ipChange.ipc$dispatch("cfae9d15", new Object[]{this, bVar});
            } else {
                this.f15898a = bVar;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a {

            /* renamed from: a  reason: collision with root package name */
            public final String f15899a;

            static {
                t2o.a(806355985);
            }

            public a(c cVar, String str) {
                this.f15899a = str;
            }

            public a(c cVar, Exception exc) {
            }
        }
    }

    static {
        t2o.a(806355981);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    @Deprecated
    public void b(String str, String str2, b bVar) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12cb0366", new Object[]{this, str, str2, bVar});
            return;
        }
        c cVar = new c(this);
        cVar.e(new a(this, bVar, str2, str));
        cVar.execute(str2);
        if (v2s.o().E() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str2);
            hashMap.put("liveId", str);
            if (v2s.o().u() != null) {
                str3 = v2s.o().u().getUserId();
            } else {
                str3 = "";
            }
            hashMap.put("userId", str3);
            v2s.o().E().track4Click("Page_TaobaoLiveWatch", "startFetchItemInfo", hashMap);
        }
    }
}
