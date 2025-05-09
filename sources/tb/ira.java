package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.nb.searchmanager.client.model.IndexData;
import com.huawei.nb.searchmanager.client.model.IndexForm;
import com.huawei.searchabilitymanager.client.model.SearchableItemAttributeSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ira {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ira b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f21521a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends TypeReference<HashMap<String, String>> {
        public a(ira iraVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements yyb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f21523a;

            public a(String str) {
                this.f21523a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ira.a(ira.this, this.f21523a);
                }
            }
        }

        public b() {
        }

        @Override // tb.yyb
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da277f39", new Object[]{this, str});
                return;
            }
            ggh.c(b.class, "requestSearchData onError retMsg " + str);
        }

        @Override // tb.yyb
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad91c6f4", new Object[]{this, str});
                return;
            }
            ggh.c(b.class, "requestSearchData onSuccess responseData: " + str);
            nn8.c().execute(new a(str));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements hdp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o5p f21524a;
        public final /* synthetic */ JSONArray b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                c cVar = c.this;
                ira.b(ira.this, cVar.f21524a, cVar.b, "defaultGroup");
            }
        }

        public c(o5p o5pVar, JSONArray jSONArray) {
            this.f21524a = o5pVar;
            this.b = jSONArray;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("833e0112", new Object[]{this});
                return;
            }
            ggh.c(c.class, "searchServiceConnect onConnect ");
            nn8.c().execute(new a());
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18aad6e2", new Object[]{this});
            } else {
                ggh.c(c.class, "searchServiceConnect onDisconnect ");
            }
        }
    }

    static {
        t2o.a(437256197);
    }

    public ira(Context context) {
        if (context.getApplicationContext() != null) {
            this.f21521a = context.getApplicationContext();
        } else {
            this.f21521a = context;
        }
    }

    public static /* synthetic */ void a(ira iraVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9264d17", new Object[]{iraVar, str});
        } else {
            iraVar.g(str);
        }
    }

    public static /* synthetic */ void b(ira iraVar, o5p o5pVar, JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bddbdb50", new Object[]{iraVar, o5pVar, jSONArray, str});
        } else {
            iraVar.c(o5pVar, jSONArray, str);
        }
    }

    public static ira d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ira) ipChange.ipc$dispatch("b38304ca", new Object[]{context});
        }
        if (b == null) {
            synchronized (ira.class) {
                try {
                    if (b == null) {
                        b = new ira(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae50812", new Object[]{this});
            return;
        }
        try {
            if (b9l.h(this.f21521a) && f()) {
                List<String> j = j();
                if (!j.isEmpty()) {
                    h(j);
                }
            }
        } catch (Throwable th) {
            ggh.c(ira.class, "insertSearchData onError:  " + th.getMessage());
        }
    }

    public final void h(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6e8659", new Object[]{this, list});
        } else {
            ud7.d().e("android_search", list, null, new b());
        }
    }

    public final void i(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ea576c", new Object[]{this, jSONArray});
            return;
        }
        try {
            o5p o5pVar = new o5p(this.f21521a);
            o5pVar.a(new c(o5pVar, jSONArray));
        } catch (Exception e) {
            ggh.c(ira.class, "searchServiceConnect onError:  " + e.getMessage());
        }
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d6faf31", new Object[]{this, str});
            return;
        }
        try {
            JSONArray jSONArray = JSON.parseObject(str).getJSONObject("contentMap").getJSONObject("android_search").getJSONArray("content");
            JSONArray jSONArray2 = new JSONArray();
            if (jSONArray != null && jSONArray.size() > 0) {
                HashMap hashMap = new HashMap(2);
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        JSONArray jSONArray3 = ((JSONObject) next).getJSONArray(bia.UNDER_TAKE_GOODS_LIST);
                        ggh.c(ira.class, "parseServerData itemArray: " + jSONArray3);
                        hashMap.put(((JSONObject) next).getString("id"), ((JSONObject) next).getString("nextRefreshTime"));
                        if (jSONArray3 != null && jSONArray3.size() > 0) {
                            jSONArray2.addAll(jSONArray3);
                        }
                    }
                }
                l1p.b(JSON.toJSONString(hashMap));
                i(jSONArray2);
            }
        } catch (Exception e) {
            ggh.c(ira.class, "parseServerData onError:  " + e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> j() {
        /*
            r8 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.ira.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "63ae434a"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r8
            java.lang.Object r0 = r1.ipc$dispatch(r2, r3)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0015:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = tb.l1p.a()
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0032
            java.lang.String r0 = "application"
            java.lang.String r1 = "main_search"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r1 = java.util.Arrays.asList(r0)
            goto L_0x006d
        L_0x0032:
            tb.ira$a r3 = new tb.ira$a
            r3.<init>(r8)
            com.alibaba.fastjson.parser.Feature[] r0 = new com.alibaba.fastjson.parser.Feature[r0]
            java.lang.Object r0 = com.alibaba.fastjson.JSON.parseObject(r2, r3, r0)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0047:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x006d
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            long r3 = tb.ru6.a()
            java.lang.Object r5 = r2.getValue()
            java.lang.String r5 = (java.lang.String) r5
            long r5 = java.lang.Long.parseLong(r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0047
            java.lang.Object r2 = r2.getKey()
            r1.add(r2)
            goto L_0x0047
        L_0x006d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "searchUpdatePreCheck typeIdList: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Class<tb.ira> r2 = tb.ira.class
            tb.ggh.c(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ira.j():java.util.List");
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c993b876", new Object[]{this})).booleanValue();
        }
        try {
            if (qj7.j() && e1p.c(this.f21521a)) {
                ggh.c(ira.class, "isHuaweiServiceSupport support");
                return true;
            }
        } catch (Throwable th) {
            ggh.c(ira.class, "isHuaweiServiceSupport error: " + th.getMessage());
        }
        ggh.c(ira.class, "isHuaweiServiceSupport not support");
        return false;
    }

    public final void c(o5p o5pVar, JSONArray jSONArray, String str) {
        Throwable th;
        String str2;
        String string;
        String str3 = "imgUrl";
        String str4 = "contentType";
        Class<ira> cls = ira.class;
        IpChange ipChange = $ipChange;
        String str5 = "isPriceDrop";
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e885c7", new Object[]{this, o5pVar, jSONArray, str});
            return;
        }
        try {
            List<IndexForm> d = o5pVar.d("content");
            int c2 = o5pVar.c(this.f21521a.getPackageName());
            if (c2 < 0) {
                str2 = "saleNumber";
                ggh.c(cls, "createSearchData indexFormVersion: " + c2);
                if (o5pVar.g(this.f21521a.getPackageName(), 1, d) == 1) {
                    ggh.c(cls, "createSearchData setIndexForm success");
                } else {
                    ggh.c(cls, "createSearchData setIndexForm fail");
                    return;
                }
            } else {
                str2 = "saleNumber";
            }
            ArrayList arrayList = new ArrayList();
            for (Iterator<Object> it = jSONArray.iterator(); it.hasNext(); it = it) {
                try {
                    JSONObject jSONObject = (JSONObject) it.next();
                    String string2 = jSONObject.getString("identifier");
                    if (TextUtils.isEmpty(string2)) {
                        string2 = jSONObject.getString("title");
                    }
                    SearchableItemAttributeSet e = o5pVar.e(string2, str);
                    if (TextUtils.isEmpty(jSONObject.getString(str4))) {
                        string = "application";
                    } else {
                        string = jSONObject.getString(str4);
                    }
                    e.setContentType(string);
                    e.setDisplayName(jSONObject.getString("title"));
                    e.setDescription(jSONObject.getString("desc"));
                    if (TextUtils.isEmpty(jSONObject.getString(str3))) {
                        try {
                            e.setLogoURL("https://img.alicdn.com/imgextra/i2/O1CN01znGs3z1pDMFUtRqtG_!!6000000005326-2-tps-80-80.png");
                        } catch (Throwable th2) {
                            th = th2;
                            ggh.c(cls, "createSearchData onError:  " + th.getMessage());
                        }
                    } else {
                        e.setLogoURL(jSONObject.getString(str3));
                    }
                    if (jSONObject.getJSONArray("keywords").toArray(new String[0]) != null) {
                        e.setKeyWords((String[]) jSONObject.getJSONArray("keywords").toArray(new String[0]));
                    }
                    e.setUniqueIdentifier(string2);
                    e.setDataURI(jSONObject.getString(rg0.JUMP_URL));
                    if (jSONObject.getLong("expiredDate") != null) {
                        cls = cls;
                        try {
                            e.setExpirationDate(new Date(jSONObject.getLong("expiredDate").longValue() * 1000));
                        } catch (Throwable th3) {
                            th = th3;
                            ggh.c(cls, "createSearchData onError:  " + th.getMessage());
                        }
                    } else {
                        cls = cls;
                    }
                    if (jSONObject.getLong("priority") != null) {
                        e.setRankingHint((float) jSONObject.getLong("priority").longValue());
                    } else {
                        e.setRankingHint(50.0f);
                    }
                    if (jSONObject.getInteger("storeStatus") != null) {
                        e.setStoreStatus(jSONObject.getInteger("storeStatus").intValue());
                    }
                    if (!TextUtils.isEmpty(jSONObject.getString("productPrice"))) {
                        e.setProductPrice(Float.parseFloat(jSONObject.getString("productPrice")));
                    }
                    if (!TextUtils.isEmpty(jSONObject.getString("productRating"))) {
                        e.setProductRating(Float.parseFloat(jSONObject.getString("productRating")));
                    }
                    if (jSONObject.getInteger(str2) != null) {
                        e.setSaleNumber(jSONObject.getInteger(str2).intValue());
                    }
                    if (jSONObject.getInteger(str5) != null) {
                        e.setIsPriceDrop(jSONObject.getInteger(str5).intValue() == 1);
                    }
                    arrayList.add(e);
                    str2 = str2;
                    str5 = str5;
                    str3 = str3;
                    str4 = str4;
                } catch (Throwable th4) {
                    th = th4;
                    cls = cls;
                    ggh.c(cls, "createSearchData onError:  " + th.getMessage());
                }
            }
            cls = cls;
            ggh.c(cls, "createSearchData indexDataList.size: " + arrayList.size());
            try {
                List<IndexData> h = o5pVar.h(str, this.f21521a.getPackageName(), arrayList);
                ggh.c(cls, "createSearchData failedList: " + h);
            } catch (Throwable th5) {
                th = th5;
                ggh.c(cls, "createSearchData onError:  " + th.getMessage());
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
