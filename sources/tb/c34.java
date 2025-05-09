package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.interact.comment.FetchCommentResponse;
import com.taobao.taolive.sdk.business.interact.comment.FetchCommentResponseData;
import com.taobao.taolive.sdk.model.interact.Comment;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c34 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f16809a = "";
    public String b = "";
    public z69 c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b0d f16810a;

        public a(b0d b0dVar) {
            this.f16810a = b0dVar;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            b0d b0dVar = this.f16810a;
            if (b0dVar != null) {
                b0dVar.onError(i, netResponse, obj);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            ArrayList<Comment> arrayList;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netBaseOutDo != null) {
                FetchCommentResponseData fetchCommentResponseData = (FetchCommentResponseData) netBaseOutDo.getData();
                b0d b0dVar = this.f16810a;
                if (b0dVar != null) {
                    b0dVar.onSuccess(i, netResponse, netBaseOutDo, c34.a(c34.this));
                }
                if (fetchCommentResponseData != null && !TextUtils.isEmpty(fetchCommentResponseData.paginationContext)) {
                    c34.b(c34.this, fetchCommentResponseData.paginationContext);
                }
                if (TextUtils.isEmpty(c34.c(c34.this)) && fetchCommentResponseData != null && (arrayList = fetchCommentResponseData.comments) != null && !arrayList.isEmpty()) {
                    c34.d(c34.this, fetchCommentResponseData.comments.get(0).paginationContext);
                }
            } else {
                b0d b0dVar2 = this.f16810a;
                if (b0dVar2 != null) {
                    b0dVar2.onError(i, netResponse, obj);
                }
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            b0d b0dVar = this.f16810a;
            if (b0dVar != null) {
                b0dVar.onSystemError(i, netResponse, obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b0d f16811a;

        public b(c34 c34Var, b0d b0dVar) {
            this.f16811a = b0dVar;
        }

        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
            } else {
                this.f16811a.onError(1, null, obj);
            }
        }

        public void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            } else if (obj instanceof d.a) {
                try {
                    if (!TextUtils.isEmpty(((d.a) obj).f16813a)) {
                        FetchCommentResponse fetchCommentResponse = new FetchCommentResponse();
                        fetchCommentResponse.setData((FetchCommentResponseData) JSON.parseObject(String.valueOf(((d.a) obj).f16813a), FetchCommentResponseData.class));
                        this.f16811a.onSuccess(1, null, fetchCommentResponse, null);
                    } else {
                        this.f16811a.onError(1, null, obj);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d extends AsyncTask<String, Integer, a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public c f16812a;
        public final String b;

        static {
            t2o.a(806355970);
        }

        public d(c34 c34Var, String str) {
            this.b = str;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/CommentBusiness$DownloadTask");
        }

        /* renamed from: a */
        public a doInBackground(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("65453882", new Object[]{this, strArr});
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
                    if (!TextUtils.isEmpty(this.b)) {
                        httpsURLConnection.setRequestProperty("anchorSideKey", this.b);
                    }
                    httpsURLConnection.setDoInput(true);
                    httpsURLConnection.connect();
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream2 = httpsURLConnection.getInputStream();
                        if (inputStream2 != null) {
                            try {
                                d = d(inputStream2);
                            } catch (Throwable th2) {
                                inputStream = inputStream2;
                                th = th2;
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
                ipChange.ipc$dispatch("69b2bfb", new Object[]{this, aVar});
            } else if (this.f16812a == null) {
            } else {
                if (!TextUtils.isEmpty(aVar.f16813a)) {
                    ((b) this.f16812a).b(aVar);
                } else {
                    ((b) this.f16812a).a(aVar);
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

        public void e(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a58f18d", new Object[]{this, cVar});
            } else {
                this.f16812a = cVar;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a {

            /* renamed from: a  reason: collision with root package name */
            public final String f16813a;

            static {
                t2o.a(806355971);
            }

            public a(d dVar, String str) {
                this.f16813a = str;
            }

            public a(d dVar, Exception exc) {
            }
        }
    }

    static {
        t2o.a(806355965);
    }

    public static /* synthetic */ String a(c34 c34Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e62cecf", new Object[]{c34Var});
        }
        return c34Var.f16809a;
    }

    public static /* synthetic */ String b(c34 c34Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68262e87", new Object[]{c34Var, str});
        }
        c34Var.f16809a = str;
        return str;
    }

    public static /* synthetic */ String c(c34 c34Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("456eb5d0", new Object[]{c34Var});
        }
        return c34Var.b;
    }

    public static /* synthetic */ String d(c34 c34Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e50b748", new Object[]{c34Var, str});
        }
        c34Var.b = str;
        return str;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
            return;
        }
        this.f16809a = "";
        this.b = "";
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        z69 z69Var = this.c;
        if (z69Var != null) {
            z69Var.destroy();
        }
    }

    public void g(String str, int i, boolean z, b0d b0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("683a36fe", new Object[]{this, str, new Integer(i), new Boolean(z), b0dVar});
        } else {
            h(str, "", false, z, b0dVar);
        }
    }

    public void h(String str, String str2, boolean z, boolean z2, b0d b0dVar) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6d9545", new Object[]{this, str, str2, new Boolean(z), new Boolean(z2), b0dVar});
            return;
        }
        if (z2) {
            str3 = qvs.u0() + str + "/200000";
        } else {
            str3 = null;
        }
        i(z, z2, str, str2, this.f16809a, str3, new a(b0dVar));
    }

    public final void i(boolean z, boolean z2, String str, String str2, String str3, String str4, b0d b0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b00896e5", new Object[]{this, new Boolean(z), new Boolean(z2), str, str2, str3, str4, b0dVar});
        } else if (z2) {
            d dVar = new d(this, str2);
            dVar.e(new b(this, b0dVar));
            dVar.execute(str4);
        } else {
            if (this.c == null) {
                this.c = new z69(b0dVar);
            }
            this.c.K(str, str2, str3);
        }
    }
}
