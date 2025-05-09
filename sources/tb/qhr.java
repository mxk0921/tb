package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qhr extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLCDNREQUEST = 7441691612387929517L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355364);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public qhr build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qhr) ipChange.ipc$dispatch("9dbec073", new Object[]{this, obj});
            }
            return new qhr();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c extends AsyncTask<String, Integer, a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f26763a;
        public final String b;
        public final String c;
        public final u8 d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f26764a;
            public JSONObject b;

            static {
                t2o.a(806355366);
            }

            public a() {
            }
        }

        static {
            t2o.a(806355365);
        }

        public c(String str, String str2, String str3, u8 u8Var) {
            this.f26763a = str;
            this.b = str2;
            this.c = str3;
            this.d = u8Var;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/ability/TBLCDNRequestAbility$CdnRequestTask");
        }

        /* renamed from: b */
        public void onPostExecute(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ffa43c6", new Object[]{this, aVar});
                return;
            }
            super.onPostExecute(aVar);
            if (aVar == null) {
                this.d.callback("failure", new e8());
            } else if (aVar.f26764a == 200) {
                this.d.callback("success", new f8(aVar.b));
            } else {
                this.d.callback("failure", new e8(aVar.b));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0095: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:34:0x0095 */
        /* JADX WARN: Type inference failed for: r7v14 */
        /* renamed from: a */
        public a doInBackground(String... strArr) {
            HttpURLConnection httpURLConnection;
            Throwable th;
            HttpURLConnection httpURLConnection2;
            BufferedReader bufferedReader;
            Exception e;
            HttpURLConnection httpURLConnection3;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b9073ce5", new Object[]{this, strArr});
            }
            BufferedReader bufferedReader2 = null;
            if (TextUtils.isEmpty(this.f26763a)) {
                return null;
            }
            String str = this.f26763a;
            try {
                try {
                    httpURLConnection3 = (HttpURLConnection) new URL(str).openConnection();
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = str;
                }
                try {
                    if ("ture".equals(this.c)) {
                        httpURLConnection3.setRequestMethod("POST");
                    } else {
                        httpURLConnection3.setRequestMethod("GET");
                    }
                    if (TextUtils.isDigitsOnly(this.b)) {
                        i = Integer.parseInt(this.b);
                    }
                    if (i > 0) {
                        httpURLConnection3.setConnectTimeout(i * 1000);
                    } else {
                        httpURLConnection3.setConnectTimeout(3000);
                    }
                    httpURLConnection3.setReadTimeout(3000);
                    int responseCode = httpURLConnection3.getResponseCode();
                    a aVar = new a();
                    if (responseCode == 200) {
                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection3.getInputStream()));
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                sb.append(readLine);
                            }
                            aVar.f26764a = 200;
                            aVar.b = JSON.parseObject(sb.toString());
                            try {
                                bufferedReader.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            httpURLConnection3.disconnect();
                            return aVar;
                        } catch (Exception e3) {
                            e = e3;
                            httpURLConnection2 = httpURLConnection3;
                            e.printStackTrace();
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            return null;
                        }
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", (Object) Integer.valueOf(responseCode));
                        aVar.f26764a = responseCode;
                        aVar.b = jSONObject;
                        httpURLConnection3.disconnect();
                        return aVar;
                    }
                } catch (Exception e5) {
                    e = e5;
                    bufferedReader = null;
                    httpURLConnection2 = httpURLConnection3;
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection = httpURLConnection3;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Exception e7) {
                e = e7;
                httpURLConnection2 = null;
                bufferedReader = null;
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = null;
            }
        }
    }

    static {
        t2o.a(806355362);
    }

    public static /* synthetic */ Object ipc$super(qhr qhrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/ability/TBLCDNRequestAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        JSONObject h = n8Var == null ? null : n8Var.h();
        if (h == null) {
            return new d8();
        }
        String string = h.getString("requestUrl");
        String string2 = h.getString("timeout");
        String string3 = h.getString("usePost");
        if (TextUtils.isEmpty(string)) {
            return new d8();
        }
        new c(string, string2, string3, u8Var).execute(new String[0]);
        return new d8();
    }
}
