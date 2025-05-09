package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.tensorflow.contrib.tmall.sqlite.DbManager;
import tb.htf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class itf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static itf c;
    public int b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, JSONObject> f21570a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements fo6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f21571a;

        public a(c cVar) {
            this.f21571a = cVar;
        }

        @Override // tb.fo6
        public void errorReport(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28fdfd81", new Object[]{this, str, str2, str3});
                return;
            }
            c cVar = this.f21571a;
            if (cVar != null) {
                ((b) cVar).a(null);
            }
        }

        @Override // tb.fo6
        public void notify(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12981c64", new Object[]{this, str, str2});
                return;
            }
            try {
                JSONObject parseObject = JSON.parseObject(str2);
                itf.this.m(parseObject);
                c cVar = this.f21571a;
                if (cVar != null) {
                    ((b) cVar).a(parseObject);
                }
            } catch (Throwable unused) {
                c cVar2 = this.f21571a;
                if (cVar2 != null) {
                    ((b) cVar2).a(null);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21572a;
        public final /* synthetic */ d b;
        public final /* synthetic */ String c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ ArrayList e;

        public b(String str, d dVar, String str2, ArrayList arrayList, ArrayList arrayList2) {
            this.f21572a = str;
            this.b = dVar;
            this.c = str2;
            this.d = arrayList;
            this.e = arrayList2;
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a559a9d", new Object[]{this, jSONObject});
            } else if (((JSONObject) itf.a(itf.this).get(this.f21572a)) == null) {
                d dVar = this.b;
                if (dVar != null) {
                    ((htf.c.a) dVar).a(Boolean.FALSE);
                }
            } else {
                ArrayList b = itf.b(itf.this, this.c);
                if (itf.c(itf.this, b, this.d)) {
                    this.d.removeAll(itf.d(itf.this, b, this.d));
                }
                boolean e = itf.e(itf.this, this.c, this.d, this.e);
                d dVar2 = this.b;
                if (dVar2 != null) {
                    ((htf.c.a) dVar2).a(Boolean.valueOf(e));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
    }

    static {
        t2o.a(1034944545);
    }

    public static /* synthetic */ ConcurrentHashMap a(itf itfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("53dc402c", new Object[]{itfVar});
        }
        return itfVar.f21570a;
    }

    public static /* synthetic */ ArrayList b(itf itfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("9c98c4fd", new Object[]{itfVar, str});
        }
        return itfVar.g(str);
    }

    public static /* synthetic */ boolean c(itf itfVar, ArrayList arrayList, ArrayList arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("856f63fc", new Object[]{itfVar, arrayList, arrayList2})).booleanValue();
        }
        return itfVar.f(arrayList, arrayList2);
    }

    public static /* synthetic */ ArrayList d(itf itfVar, ArrayList arrayList, ArrayList arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("c9942031", new Object[]{itfVar, arrayList, arrayList2});
        }
        return itfVar.h(arrayList, arrayList2);
    }

    public static /* synthetic */ boolean e(itf itfVar, String str, ArrayList arrayList, ArrayList arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("889bd384", new Object[]{itfVar, str, arrayList, arrayList2})).booleanValue();
        }
        return itfVar.k(str, arrayList, arrayList2);
    }

    public static synchronized itf i() {
        synchronized (itf.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (itf) ipChange.ipc$dispatch("3c6a8613", new Object[0]);
            }
            if (c == null) {
                c = new itf();
            }
            return c;
        }
    }

    public final boolean f(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24fd06d4", new Object[]{this, arrayList, arrayList2})).booleanValue();
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList3.removeAll(arrayList);
        if (arrayList3.size() > 0) {
            return true;
        }
        return false;
    }

    public final ArrayList<String> g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("64399d77", new Object[]{this, str});
        }
        JSONObject jSONObject = this.f21570a.get(str);
        ArrayList<String> arrayList = new ArrayList<>();
        if (jSONObject != null) {
            Iterator<Object> it = jSONObject.getJSONArray("features").iterator();
            while (it.hasNext()) {
                arrayList.add(((JSONObject) it.next()).getString("feature_name"));
            }
        }
        return arrayList;
    }

    public final ArrayList<String> h(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("17df7363", new Object[]{this, arrayList, arrayList2});
        }
        ArrayList<String> arrayList3 = new ArrayList<>(arrayList2);
        arrayList3.removeAll(arrayList);
        return arrayList3;
    }

    public void l(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e44b6b1", new Object[]{this, cVar});
            return;
        }
        try {
            gtf.i().o("Jarvis", "JarvisInitTask", null, new a(cVar));
        } catch (Throwable unused) {
            if (cVar != null) {
                ((b) cVar).a(null);
            }
        }
    }

    public void m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16656fd7", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            try {
                Iterator<Object> it = jSONObject.getJSONArray("feature_table").iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject2 = (JSONObject) it.next();
                    String string = jSONObject2.getString("biz_name");
                    if (string != null) {
                        this.f21570a.put(string, jSONObject2);
                    }
                }
            } catch (Throwable unused) {
                LogUtil.e("JarvisFeatureTableManager", "updateFeatureTables error");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(java.lang.String r10, java.util.ArrayList<java.lang.String> r11, java.util.ArrayList<java.util.Map> r12, tb.itf.d r13) {
        /*
            r9 = this;
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = tb.itf.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001e
            java.lang.String r5 = "62c708b6"
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r9
            r6[r2] = r10
            r0 = 2
            r6[r0] = r11
            r0 = 3
            r6[r0] = r12
            r0 = 4
            r6[r0] = r13
            r4.ipc$dispatch(r5, r6)
            return
        L_0x001e:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: all -> 0x0061
            r6.<init>(r11)     // Catch: all -> 0x0061
            java.lang.String r1 = ""
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: all -> 0x0061
            r4.<init>()     // Catch: all -> 0x0061
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.alibaba.fastjson.JSONObject> r4 = r9.f21570a     // Catch: all -> 0x0061
            java.lang.Object r4 = r4.get(r10)     // Catch: all -> 0x0061
            com.alibaba.fastjson.JSONObject r4 = (com.alibaba.fastjson.JSONObject) r4     // Catch: all -> 0x0061
            if (r4 != 0) goto L_0x0037
        L_0x0034:
            r5 = r1
            r3 = 1
            goto L_0x004a
        L_0x0037:
            java.lang.String r1 = "table_name"
            java.lang.String r1 = r4.getString(r1)     // Catch: all -> 0x0061
            java.util.ArrayList r5 = r9.g(r1)     // Catch: all -> 0x0061
            boolean r5 = r9.f(r5, r6)     // Catch: all -> 0x0061
            if (r5 == 0) goto L_0x0049
            goto L_0x0034
        L_0x0049:
            r5 = r1
        L_0x004a:
            if (r3 == 0) goto L_0x0063
            int r1 = r9.b     // Catch: all -> 0x0061
            if (r1 >= r2) goto L_0x0063
            int r1 = r1 + r2
            r9.b = r1     // Catch: all -> 0x0061
            tb.itf$b r8 = new tb.itf$b     // Catch: all -> 0x0061
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r13
            r7 = r12
            r1.<init>(r3, r4, r5, r6, r7)     // Catch: all -> 0x0061
            r9.l(r8)     // Catch: all -> 0x0061
            goto L_0x0091
        L_0x0061:
            r0 = move-exception
            goto L_0x0089
        L_0x0063:
            if (r4 == 0) goto L_0x0091
            if (r3 == 0) goto L_0x0078
            java.util.ArrayList r0 = r9.g(r5)     // Catch: all -> 0x0061
            boolean r1 = r9.f(r0, r6)     // Catch: all -> 0x0061
            if (r1 == 0) goto L_0x0078
            java.util.ArrayList r0 = r9.h(r0, r6)     // Catch: all -> 0x0061
            r6.removeAll(r0)     // Catch: all -> 0x0061
        L_0x0078:
            boolean r0 = r9.k(r5, r6, r12)     // Catch: all -> 0x0061
            if (r13 == 0) goto L_0x0091
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: all -> 0x0061
            r1 = r13
            tb.htf$c$a r1 = (tb.htf.c.a) r1     // Catch: all -> 0x0061
            r1.a(r0)     // Catch: all -> 0x0061
            goto L_0x0091
        L_0x0089:
            java.lang.String r1 = "JarvisFeatureTableManager"
            java.lang.String r2 = "saveBizFeature"
            com.tmall.android.dai.internal.util.LogUtil.e(r1, r2, r0)
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.itf.j(java.lang.String, java.util.ArrayList, java.util.ArrayList, tb.itf$d):void");
    }

    public final boolean k(String str, ArrayList<String> arrayList, ArrayList<Map> arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0c5a3ae", new Object[]{this, str, arrayList, arrayList2})).booleanValue();
        }
        if (arrayList != null) {
            try {
                if (!(arrayList.size() == 0 || arrayList2 == null || arrayList2.size() == 0)) {
                    DbManager instance = DbManager.getInstance();
                    HashMap hashMap = new HashMap();
                    hashMap.put("data_names", str);
                    instance.beginTransaction("JarvisFeatureTableManager", "saveBizFeatureToDB", hashMap);
                    Iterator<Map> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Map next = it.next();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<String> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Object obj = next.get(it2.next());
                            if (obj != null) {
                                arrayList3.add("'" + obj + "'");
                            } else {
                                arrayList3.add("null");
                            }
                        }
                        String str2 = "INSERT INTO " + str + " (" + TextUtils.join(",", arrayList) + ") VALUES (" + TextUtils.join(",", arrayList3) + ");";
                        LogUtil.d("saveBizFeatureToDB", str2);
                        LogUtil.d("saveBizFeatureToDB", "result:" + instance.insert(str2, null, "JarvisFeatureTableManager", "saveBizFeatureToDB", hashMap));
                    }
                    instance.endTransaction("JarvisFeatureTableManager", "saveBizFeatureToDB", hashMap);
                    return true;
                }
            } catch (Throwable th) {
                LogUtil.e("JarvisFeatureTableManager", "saveBizFeatureToDB", th);
            }
        }
        return false;
    }
}
