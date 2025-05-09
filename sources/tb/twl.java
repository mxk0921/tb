package tb;

import android.os.Looper;
import android.os.Process;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class twl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<DXTemplateItem, List<DXResult<DXRootView>>> f29002a = new ConcurrentHashMap();
    public final Map<String, AtomicInteger> b;
    public final b c;
    public final ViewEngine d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o58 f29003a;

        public a(o58 o58Var) {
            this.f29003a = o58Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Process.setThreadPriority(10);
                twl.b(twl.this, this.f29003a);
                Thread.yield();
            } catch (Exception e) {
                UnifyLog.e("PerfOpt.Tmq", e.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(157286691);
        }

        public static /* synthetic */ boolean a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("777201cc", new Object[]{bVar})).booleanValue();
            }
            bVar.getClass();
            return false;
        }
    }

    static {
        t2o.a(157286688);
    }

    public twl(ViewEngine viewEngine, b bVar) {
        this.d = viewEngine;
        this.c = bVar;
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        hashMap.put("buy_address", new AtomicInteger(1));
        hashMap.put("buy_select", new AtomicInteger(5));
        hashMap.put("buy_input", new AtomicInteger(1));
        hashMap.put("buy_subtotal", new AtomicInteger(1));
        hashMap.put("buy_image_text", new AtomicInteger(2));
        hashMap.put("buy_item", new AtomicInteger(2));
    }

    public static /* synthetic */ void a(twl twlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b411e3", new Object[]{twlVar});
        } else {
            twlVar.j();
        }
    }

    public static /* synthetic */ void b(twl twlVar, o58 o58Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("515ac3b9", new Object[]{twlVar, o58Var});
        } else {
            twlVar.e(o58Var);
        }
    }

    public final void c(o58 o58Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51d6217b", new Object[]{this, o58Var});
        } else {
            pav.k(new a(o58Var));
        }
    }

    public final DXTemplateItem d(s sVar, o58 o58Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("21cf3d09", new Object[]{this, sVar, o58Var});
        }
        DXTemplateItem a2 = ajt.a(o58Var);
        if (a2.b <= 0) {
            return null;
        }
        return sVar.i(a2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
        r4.decrementAndGet();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(tb.o58 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "createDinamicView "
            com.android.alibaba.ip.runtime.IpChange r1 = tb.twl.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0017
            java.lang.String r0 = "3ccc2a97"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r3 = 1
            r2[r3] = r7
            r1.ipc$dispatch(r0, r2)
            return
        L_0x0017:
            boolean r1 = r6.h()
            if (r1 != 0) goto L_0x001e
            return
        L_0x001e:
            com.alibaba.android.ultron.vfw.core.ViewEngine r1 = r6.d
            tb.jo7 r1 = r1.Q()
            com.taobao.android.dinamicx.s r1 = r1.b()
            com.taobao.android.dinamicx.template.download.DXTemplateItem r2 = r6.d(r1, r7)
            if (r2 != 0) goto L_0x002f
            return
        L_0x002f:
            java.lang.String r3 = "PerfOpt.Tmq"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "createDinamicView:"
            r4.<init>(r5)
            java.lang.String r5 = r2.f7343a
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String[] r4 = new java.lang.String[]{r4}
            com.taobao.android.ultron.common.utils.UnifyLog.g(r3, r4)
            java.util.Map<com.taobao.android.dinamicx.template.download.DXTemplateItem, java.util.List<com.taobao.android.dinamicx.DXResult<com.taobao.android.dinamicx.DXRootView>>> r3 = r6.f29002a
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x0074
            monitor-enter(r6)
            java.util.Map<com.taobao.android.dinamicx.template.download.DXTemplateItem, java.util.List<com.taobao.android.dinamicx.DXResult<com.taobao.android.dinamicx.DXRootView>>> r3 = r6.f29002a     // Catch: all -> 0x006e
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch: all -> 0x006e
            java.lang.Object r3 = r3.get(r2)     // Catch: all -> 0x006e
            java.util.List r3 = (java.util.List) r3     // Catch: all -> 0x006e
            if (r3 != 0) goto L_0x0070
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: all -> 0x006e
            r3.<init>()     // Catch: all -> 0x006e
            java.util.Map<com.taobao.android.dinamicx.template.download.DXTemplateItem, java.util.List<com.taobao.android.dinamicx.DXResult<com.taobao.android.dinamicx.DXRootView>>> r4 = r6.f29002a     // Catch: all -> 0x006e
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4     // Catch: all -> 0x006e
            r4.put(r2, r3)     // Catch: all -> 0x006e
            goto L_0x0070
        L_0x006e:
            r7 = move-exception
            goto L_0x0072
        L_0x0070:
            monitor-exit(r6)     // Catch: all -> 0x006e
            goto L_0x0074
        L_0x0072:
            monitor-exit(r6)     // Catch: all -> 0x006e
            throw r7
        L_0x0074:
            java.util.Map<java.lang.String, java.util.concurrent.atomic.AtomicInteger> r4 = r6.b     // Catch: Exception -> 0x00a6
            java.lang.String r5 = r2.f7343a     // Catch: Exception -> 0x00a6
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: Exception -> 0x00a6
            java.lang.Object r4 = r4.get(r5)     // Catch: Exception -> 0x00a6
            java.util.concurrent.atomic.AtomicInteger r4 = (java.util.concurrent.atomic.AtomicInteger) r4     // Catch: Exception -> 0x00a6
            if (r4 == 0) goto L_0x00a8
            int r5 = r4.get()     // Catch: Exception -> 0x00a6
            if (r5 <= 0) goto L_0x0089
            goto L_0x00a8
        L_0x0089:
            java.lang.String r1 = "Tmq"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: Exception -> 0x00a6
            r2.<init>(r0)     // Catch: Exception -> 0x00a6
            java.lang.String r7 = r7.c     // Catch: Exception -> 0x00a6
            r2.append(r7)     // Catch: Exception -> 0x00a6
            java.lang.String r7 = " SKIP"
            r2.append(r7)     // Catch: Exception -> 0x00a6
            java.lang.String r7 = r2.toString()     // Catch: Exception -> 0x00a6
            java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch: Exception -> 0x00a6
            com.taobao.android.ultron.common.utils.UnifyLog.n(r1, r7)     // Catch: Exception -> 0x00a6
            goto L_0x00cf
        L_0x00a6:
            r7 = move-exception
            goto L_0x00cc
        L_0x00a8:
            if (r4 == 0) goto L_0x00ad
            r4.decrementAndGet()     // Catch: Exception -> 0x00a6
        L_0x00ad:
            com.alibaba.android.ultron.vfw.core.ViewEngine r7 = r6.d     // Catch: Exception -> 0x00a6
            android.content.Context r7 = r7.K()     // Catch: Exception -> 0x00a6
            com.alibaba.android.ultron.vfw.core.ViewEngine r0 = r6.d     // Catch: Exception -> 0x00a6
            androidx.recyclerview.widget.RecyclerView r0 = r0.Z()     // Catch: Exception -> 0x00a6
            com.taobao.android.dinamicx.DXResult r7 = r1.g(r7, r0, r2)     // Catch: Exception -> 0x00a6
            boolean r0 = r7.d()     // Catch: Exception -> 0x00a6
            if (r0 != 0) goto L_0x00cf
            monitor-enter(r6)     // Catch: Exception -> 0x00a6
            r3.add(r7)     // Catch: all -> 0x00c9
            monitor-exit(r6)     // Catch: all -> 0x00c9
            goto L_0x00cf
        L_0x00c9:
            r7 = move-exception
            monitor-exit(r6)     // Catch: all -> 0x00c9
            throw r7     // Catch: Exception -> 0x00a6
        L_0x00cc:
            r7.printStackTrace()
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.twl.e(tb.o58):void");
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            ((ConcurrentHashMap) this.f29002a).clear();
        }
    }

    public final boolean h() {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return true;
            }
            Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(Looper.getMainLooper());
            if (!(obj instanceof ThreadLocal)) {
                return false;
            }
            ((ThreadLocal) obj).set(Looper.getMainLooper());
            return true;
        } catch (Exception e) {
            UnifyLog.e("ViewEngine", e.toString());
            return false;
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f780aa", new Object[]{this});
            return;
        }
        Process.setThreadPriority(10);
        String str = "purchase".equals(this.d.W()) ? "buy" : null;
        if (str != null) {
            UnifyLog.g("PerfOpt.Tmq", "preloadTemplate start...");
            xav d = xav.d(this.d.K(), str);
            List<String> g = d.g();
            if (g == null || g.size() == 0) {
                UnifyLog.n("PerfOpt.Tmq", "preloadTemplate empty");
                return;
            }
            for (String str2 : g) {
                List<o58> g2 = g(d.f(str2));
                if (g2 != null && g2.size() > 0) {
                    i(g2);
                    return;
                }
            }
        }
    }

    public DXResult<DXRootView> k(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("b16e4c8e", new Object[]{this, dXTemplateItem});
        }
        if (dXTemplateItem == null) {
            return null;
        }
        synchronized (this) {
            try {
                List list = (List) ((ConcurrentHashMap) this.f29002a).get(dXTemplateItem);
                if (list == null || list.size() <= 0) {
                    AtomicInteger atomicInteger = (AtomicInteger) ((HashMap) this.b).get(dXTemplateItem.f7343a);
                    if (atomicInteger != null) {
                        atomicInteger.decrementAndGet();
                    }
                    return null;
                }
                int size = list.size() - 1;
                DXResult<DXRootView> dXResult = (DXResult) list.get(size);
                list.remove(size);
                return dXResult;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List<o58> g(JSONObject jSONObject) {
        JSONArray jSONArray;
        o58 o58Var;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fc04a824", new Object[]{this, jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject2 = jSONObject.getJSONObject("container");
        if (jSONObject2 == null || (jSONArray = jSONObject2.getJSONArray("data")) == null) {
            return arrayList;
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            if (jSONObject3 != null && (str = (o58Var = new o58(jSONObject3)).c) != null && !str.contains("dialog") && !o58Var.c.contains(AgooConstants.MESSAGE_POPUP)) {
                arrayList.add(o58Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void i(List<o58> list) {
        char c;
        char c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd9658d", new Object[]{this, list});
        } else if (list != null && list.size() != 0 && b.a(this.c)) {
            UnifyLog.m(this.d.I(), "PerfOpt.Tmq", "preloadTemplate preCreateView start", new String[0]);
            wo7 wo7Var = (wo7) this.d.b0().b("dinamicx");
            o58 o58Var = null;
            int i = 0;
            for (o58 o58Var2 : list) {
                String str = o58Var2.c;
                str.hashCode();
                if (str.equals("buy_select")) {
                    o58Var = o58Var2;
                } else if (str.equals("buy_address")) {
                    i++;
                    c(o58Var2);
                }
            }
            if (o58Var != null) {
                i++;
                c(o58Var);
            }
            for (o58 o58Var3 : list) {
                String str2 = o58Var3.c;
                str2.hashCode();
                switch (str2.hashCode()) {
                    case -984426196:
                        if (str2.equals("buy_item")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -452608815:
                        if (str2.equals("buy_input")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -2838883:
                        if (str2.equals("buy_subtotal")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 111123690:
                        if (str2.equals("buy_image_text")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                    case 3:
                        i += 2;
                        c(o58Var3);
                        c(o58Var3);
                        break;
                    case 1:
                    case 2:
                        i++;
                        c(o58Var3);
                        break;
                }
            }
            if (o58Var != null) {
                i += 4;
                for (int i2 = 0; i2 < 4; i2++) {
                    c(o58Var);
                }
            }
            int i3 = 15 - i;
            if (i3 > 0) {
                for (o58 o58Var4 : list) {
                    if (i3 > 0) {
                        String str3 = o58Var4.c;
                        str3.hashCode();
                        switch (str3.hashCode()) {
                            case -984426196:
                                if (str3.equals("buy_item")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -868126507:
                                if (str3.equals("buy_select")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -853640207:
                                if (str3.equals("buy_submit")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -452608815:
                                if (str3.equals("buy_input")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -2838883:
                                if (str3.equals("buy_subtotal")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 27056955:
                                if (str3.equals("buy_address")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 111123690:
                                if (str3.equals("buy_image_text")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                break;
                            default:
                                String str4 = o58Var4.d;
                                if (str4 != null && str4.endsWith("xml")) {
                                    c(o58Var4);
                                }
                                i3--;
                                break;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
