package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Fatigue;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class wb4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GENERATE_FATIGUE_PARAMS_COST = "generateFatigueParams";
    public static boolean d;
    public static final a ComponentFatigueContainer = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, vb4> f30578a = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();
    public static boolean c = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* renamed from: tb.wb4$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static final class RunnableC1083a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ File f30579a;

            public RunnableC1083a(File file) {
                this.f30579a = file;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.a(wb4.ComponentFatigueContainer, this.f30579a);
                }
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CopyOnWriteArrayList f30580a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;

            public b(CopyOnWriteArrayList copyOnWriteArrayList, int i, int i2) {
                this.f30580a = copyOnWriteArrayList;
                this.b = i;
                this.c = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f30580a.subList(0, this.b - this.c).clear();
                }
            }
        }

        static {
            t2o.a(912261368);
        }

        public a() {
        }

        public static final /* synthetic */ void a(a aVar, File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1ae200f", new Object[]{aVar, file});
            } else {
                aVar.n(file);
            }
        }

        public final void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b24e771", new Object[]{this, str});
                return;
            }
            ckf.h(str, "componentFatigueTag");
            vb4 vb4Var = (vb4) wb4.a().get(str);
            if (vb4Var != null) {
                vb4Var.a().add(Long.valueOf(System.currentTimeMillis() / 1000));
                wb4.e(true);
            }
        }

        public final void c(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a45df6d", new Object[]{this, str, new Long(j)});
            } else if (str != null) {
                wb4.a().put(str, new vb4(j));
            }
        }

        public final void d(File file, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dabbb702", new Object[]{this, file, str});
                return;
            }
            ckf.h(file, "file");
            if (str != null && wb4.b().containsKey(str)) {
                wb4.b().remove(str);
            }
            if (wb4.c()) {
                pos.a(new RunnableC1083a(file));
                wb4.e(false);
            }
        }

        public final int f(vb4 vb4Var) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c4d379de", new Object[]{this, vb4Var})).intValue();
            }
            CopyOnWriteArrayList<Long> a2 = vb4Var.a();
            int size = a2.size();
            if (size <= 0) {
                return 0;
            }
            long currentTimeMillis = (System.currentTimeMillis() / 1000) - vb4Var.b();
            Iterator<Long> it = a2.iterator();
            while (it.hasNext() && it.next().longValue() < currentTimeMillis) {
                i++;
            }
            int i2 = size - i;
            if (i2 >= 0 && size > i2) {
                pos.a(new b(a2, size, i2));
                wb4.e(true);
            }
            return i2;
        }

        public final void g(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6630d6ce", new Object[]{this, file});
                return;
            }
            ckf.h(file, "file");
            k(file);
        }

        public final boolean h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("359aa4f3", new Object[]{this})).booleanValue();
            }
            return wb4.d();
        }

        public final void i(Fatigue fatigue) {
            JSONObject data;
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3e41bf", new Object[]{this, fatigue});
            } else if (fatigue != null && (data = fatigue.getData()) != null) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<String, Object> entry : data.entrySet()) {
                    hashSet.add(entry.getKey());
                    JSONObject jSONObject = data.getJSONObject(entry.getKey());
                    if (jSONObject != null) {
                        j = jSONObject.getLongValue("fatigueDuration");
                    } else {
                        j = 0;
                    }
                    if (((int) j) > 0) {
                        l(entry.getKey(), j);
                    }
                }
                Iterator it = wb4.a().entrySet().iterator();
                while (it.hasNext()) {
                    if (!hashSet.contains(((Map.Entry) it.next()).getKey())) {
                        it.remove();
                        wb4.e(true);
                    }
                }
            }
        }

        public final void j(String str) {
            JSONObject jSONObject;
            CopyOnWriteArrayList<Long> a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aabb40a5", new Object[]{this, str});
                return;
            }
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject != null) {
                    for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                        String key = entry.getKey();
                        if (!(key == null || (jSONObject = parseObject.getJSONObject(key)) == null)) {
                            long longValue = jSONObject.getLongValue("validDuration");
                            if (longValue > 0) {
                                c(key, longValue);
                                JSONArray jSONArray = jSONObject.getJSONArray("exposureTimeStampList");
                                if (jSONArray != null) {
                                    Iterator<Object> it = jSONArray.iterator();
                                    while (it.hasNext()) {
                                        long parseLong = Long.parseLong(it.next().toString());
                                        vb4 vb4Var = (vb4) wb4.a().get(key);
                                        if (!(vb4Var == null || (a2 = vb4Var.a()) == null)) {
                                            a2.add(Long.valueOf(parseLong));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                tgh.c("detailComponentFatigue", "JSON parse err", e);
            } catch (NumberFormatException e2) {
                tgh.c("detailComponentFatigue", "Number parse err", e2);
            } catch (Exception e3) {
                tgh.c("detailComponentFatigue", "parse failed", e3);
            }
        }

        public final void k(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e47cf664", new Object[]{this, file});
                return;
            }
            String c = ag9.c(new File(file, "fatigueInfo.txt").getPath());
            if (c != null) {
                j(c);
            }
        }

        public final void l(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("508c181e", new Object[]{this, str, new Long(j)});
            } else if (str != null) {
                vb4 vb4Var = (vb4) wb4.a().get(str);
                if (vb4Var == null) {
                    c(str, j);
                    wb4.e(true);
                } else if (vb4Var.b() != j) {
                    vb4Var.c(j);
                    wb4.e(true);
                }
            }
        }

        public final void m(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec5222b7", new Object[]{this, new Boolean(z)});
                return;
            }
            wb4.f(z);
            if (!wb4.d() && !wb4.a().isEmpty()) {
                wb4.a().clear();
                wb4.e(true);
            }
        }

        public final void n(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("729b23f1", new Object[]{this, file});
                return;
            }
            File file2 = new File(file, "fatigueInfo.txt");
            if (wb4.a().isEmpty()) {
                ag9.a(file2.getPath());
                return;
            }
            try {
                String jSONString = JSON.toJSONString(wb4.a());
                ckf.c(jSONString, "objectStr");
                byte[] bytes = jSONString.getBytes(uj3.UTF_8);
                ckf.c(bytes, "(this as java.lang.String).getBytes(charset)");
                ag9.d(file2, bytes);
            } catch (JSONException e) {
                tgh.c("detailComponentFatigue", "toJSonString parse err", e);
            } catch (Exception e2) {
                tgh.c("detailComponentFatigue", "toByteArray err", e2);
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final String e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a8df8caf", new Object[]{this, str});
            }
            if (str == null) {
                return null;
            }
            if (wb4.b().containsKey(str)) {
                return (String) wb4.b().get(str);
            }
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : wb4.a().entrySet()) {
                int f = f((vb4) entry.getValue());
                if (f != 0) {
                    sb.append((String) entry.getKey());
                    sb.append('=');
                    sb.append(String.valueOf(f));
                    sb.append(';');
                }
            }
            if (sb.length() == 0) {
                wb4.b().put(str, "");
                return null;
            }
            sb.deleteCharAt(sb.length() - 1);
            String sb2 = sb.toString();
            ckf.c(sb2, "params.toString()");
            wb4.b().put(str, sb2);
            return sb2;
        }
    }

    static {
        t2o.a(912261367);
    }

    public static final /* synthetic */ ConcurrentHashMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("9d9b5a4a", new Object[0]);
        }
        return f30578a;
    }

    public static final /* synthetic */ ConcurrentHashMap b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("7abd6eb", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c32a1f28", new Object[0])).booleanValue();
        }
        return d;
    }

    public static final /* synthetic */ boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84634ef4", new Object[0])).booleanValue();
        }
        return c;
    }

    public static final /* synthetic */ void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f704ee78", new Object[]{new Boolean(z)});
        } else {
            d = z;
        }
    }

    public static final /* synthetic */ void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1965cc9c", new Object[]{new Boolean(z)});
        } else {
            c = z;
        }
    }
}
