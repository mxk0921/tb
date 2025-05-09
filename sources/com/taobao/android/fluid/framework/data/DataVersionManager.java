package com.taobao.android.fluid.framework.data;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.akt;
import tb.ckf;
import tb.f2k;
import tb.ggs;
import tb.ir9;
import tb.kqu;
import tb.njg;
import tb.t2o;
import tb.xhv;
import tb.zt6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DataVersionManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final njg f7797a = kotlin.a.b(DataVersionManager$Companion$sUseDiskCacheSessionTypeWhiteList$2.INSTANCE);
    public static final njg b = kotlin.a.b(DataVersionManager$Companion$sShareSameVersionTypeList$2.INSTANCE);
    public static Map<String, Integer> c = new LinkedHashMap();
    public static final Map<String, Integer> d = new LinkedHashMap();
    public static final ArrayList<zt6> e = new ArrayList<>();
    public static final Object f = new Object();
    public static final AtomicBoolean g = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468714174);
        }

        public a() {
        }

        @JvmStatic
        public final void a(zt6 zt6Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b658bc53", new Object[]{this, zt6Var});
                return;
            }
            ckf.g(zt6Var, DataReceiveMonitor.CB_LISTENER);
            if (!DataVersionManager.b().contains(zt6Var)) {
                DataVersionManager.b().add(zt6Var);
            }
        }

        public final int b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d6cb929b", new Object[]{this, str})).intValue();
            }
            return 1;
        }

        @JvmStatic
        public final int c(String str) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ed3e6e4c", new Object[]{this, str})).intValue();
            }
            String i2 = i(str);
            if (h(i2)) {
                g();
                Integer num = (Integer) DataVersionManager.c().get(i2);
                if (num != null) {
                    i = num.intValue();
                }
            } else {
                Integer num2 = (Integer) DataVersionManager.d().get(i2);
                if (num2 != null) {
                    i = num2.intValue();
                }
            }
            ir9.b("DataVersionManager", "getNextSupportDataVersion: sessionType:" + str + " , mappedSessionType:" + i2 + " , nextDataVersion:" + i);
            return i;
        }

        public final List<String> d() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("c04af0b8", new Object[]{this});
            } else {
                value = DataVersionManager.f().getValue();
            }
            return (List) value;
        }

        public final List<String> e() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("7e27bb2e", new Object[]{this});
            } else {
                value = DataVersionManager.g().getValue();
            }
            return (List) value;
        }

        @JvmStatic
        public final int f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("460dd939", new Object[]{this, str})).intValue();
            }
            String i = i(str);
            ir9.b("DataVersionManager", "getSupportDataVersion: sessionType:" + str + " , mappedSessionType:" + i);
            if (akt.q2("disable_newui")) {
                ir9.b("DataVersionManager", "getSupportDataVersion: disable_newui");
                return 0;
            } else if (akt.q2("enable_newui")) {
                ir9.b("DataVersionManager", "getSupportDataVersion: enable_newui");
                return 1;
            } else if (!f2k.Companion.e()) {
                ir9.b("DataVersionManager", "getSupportDataVersion: 降级");
                return 0;
            } else if (i == null || i.length() == 0) {
                ir9.b("DataVersionManager", "getSupportDataVersion:type空，返回0");
                return 0;
            } else {
                Integer num = (Integer) DataVersionManager.d().get(i);
                if (num != null) {
                    ir9.b("DataVersionManager", "getSupportDataVersion: 本地缓存 dataVersion:" + num);
                    return num.intValue();
                } else if (h(i)) {
                    g();
                    Integer num2 = (Integer) DataVersionManager.c().get(i);
                    if (num2 != null) {
                        DataVersionManager.d().put(i, num2);
                        ir9.b("DataVersionManager", "getSupportDataVersion: 硬盘缓存,写入并返回 dataVersion:" + num2);
                        return num2.intValue();
                    }
                    int b = b(i);
                    DataVersionManager.d().put(i, Integer.valueOf(b));
                    ir9.b("DataVersionManager", "getSupportDataVersion: 硬盘缓存没有，写入并返回" + b);
                    return b;
                } else {
                    ir9.b("DataVersionManager", "getSupportDataVersion:返回-1");
                    return -1;
                }
            }
        }

        public final boolean h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5c5e2426", new Object[]{this, str})).booleanValue();
            }
            if (e().contains("all")) {
                return true;
            }
            if (str == null || str.length() == 0) {
                return false;
            }
            return e().contains(str);
        }

        public final String i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fb7e0c07", new Object[]{this, str});
            }
            if (str == null || str.length() == 0 || !d().contains(str)) {
                return str;
            }
            return "fluid_fake_type";
        }

        public final void j(String str, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b968ee86", new Object[]{this, str, new Integer(i), new Integer(i2)});
                return;
            }
            for (zt6 zt6Var : DataVersionManager.b()) {
                zt6Var.onDataVersionChange(str, i, i2);
            }
        }

        @JvmStatic
        public final void k(zt6 zt6Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84e15836", new Object[]{this, zt6Var});
                return;
            }
            ckf.g(zt6Var, DataReceiveMonitor.CB_LISTENER);
            DataVersionManager.b().remove(zt6Var);
        }

        @JvmStatic
        public final void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1baa9487", new Object[]{this});
            } else {
                g();
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final void g() {
            Map map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c513abc", new Object[]{this});
            } else if (!DataVersionManager.e().get()) {
                synchronized (DataVersionManager.a()) {
                    try {
                        if (!DataVersionManager.e().get()) {
                            Object a2 = ggs.a("videoNewUISwitchMap2");
                            if (a2 instanceof Map) {
                                map = kqu.d(a2);
                            } else {
                                map = new LinkedHashMap();
                            }
                            DataVersionManager.h(map);
                            DataVersionManager.e().set(true);
                        }
                        xhv xhvVar = xhv.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @JvmStatic
        public final void l(String str, int i) {
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c3b0761", new Object[]{this, str, new Integer(i)});
                return;
            }
            String i3 = i(str);
            ir9.b("DataVersionManager", "trySaveNewUIStateToCache: sessionType:" + str + " , mappedSessionType:" + i3 + " , nextDataVersion:" + i);
            if (i3 != null && i3.length() != 0) {
                if (!DataVersionManager.d().containsKey(i3)) {
                    DataVersionManager.d().put(i3, Integer.valueOf(i));
                }
                if (h(i3)) {
                    g();
                    Integer num = (Integer) DataVersionManager.c().get(i3);
                    if (num == null || num.intValue() != i) {
                        DataVersionManager.c().put(i3, Integer.valueOf(i));
                        ir9.b("DataVersionManager", "trySaveNewUIStateToCache: 写入磁盘缓存");
                        ggs.e("videoNewUISwitchMap2", JSON.toJSON(DataVersionManager.c()));
                        if (num != null) {
                            i2 = num.intValue();
                        }
                        j(i3, i2, i);
                    }
                }
            }
        }
    }

    static {
        t2o.a(468714173);
    }

    public static final /* synthetic */ Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b0a7f1db", new Object[0]);
        }
        return f;
    }

    public static final /* synthetic */ ArrayList b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("eb1f111e", new Object[0]);
        }
        return e;
    }

    public static final /* synthetic */ Map c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7fb18c65", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ Map d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5453b99b", new Object[0]);
        }
        return d;
    }

    public static final /* synthetic */ AtomicBoolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("7e0bbd5", new Object[0]);
        }
        return g;
    }

    public static final /* synthetic */ njg f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("f77409bf", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ njg g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("e6041435", new Object[0]);
        }
        return f7797a;
    }

    public static final /* synthetic */ void h(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68b4df61", new Object[]{map});
        } else {
            c = map;
        }
    }

    @JvmStatic
    public static final void i(zt6 zt6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b658bc53", new Object[]{zt6Var});
        } else {
            Companion.a(zt6Var);
        }
    }

    @JvmStatic
    public static final int j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed3e6e4c", new Object[]{str})).intValue();
        }
        return Companion.c(str);
    }

    @JvmStatic
    public static final int k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("460dd939", new Object[]{str})).intValue();
        }
        return Companion.f(str);
    }

    @JvmStatic
    public static final void l(zt6 zt6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e15836", new Object[]{zt6Var});
        } else {
            Companion.k(zt6Var);
        }
    }

    @JvmStatic
    public static final void m(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c3b0761", new Object[]{str, new Integer(i)});
        } else {
            Companion.l(str, i);
        }
    }

    @JvmStatic
    public static final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1baa9487", new Object[0]);
        } else {
            Companion.m();
        }
    }
}
