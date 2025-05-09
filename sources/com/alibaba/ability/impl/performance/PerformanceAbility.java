package com.alibaba.ability.impl.performance;

import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.RGCategoryInfo;
import com.taobao.android.resourceguardian.data.model.RGTypeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import tb.a07;
import tb.ckf;
import tb.cu;
import tb.eyl;
import tb.jpu;
import tb.jxl;
import tb.kdb;
import tb.m09;
import tb.p7o;
import tb.qp0;
import tb.t2o;
import tb.v3i;
import tb.vq;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class PerformanceAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_ADD_BATTERY_WARNING_LISTENER = "addBatteryWarningListener";
    public static final String API_ADD_CPU_WARNING_LISTENER = "addCPUWarningListener";
    public static final String API_ADD_GLOBAL_WARNING_LISTENER = "addGlobalWarningListener";
    public static final String API_ADD_MEMORY_WARNING_LISTENER = "addMemoryWarningListener";
    public static final String API_GET_BATTERY_INFO = "getBatteryInfo";
    public static final String API_GET_CPU_INFO = "getCPUInfo";
    public static final String API_GET_DEVICE_LEVEL = "getDeviceLevel";
    public static final String API_GET_MEMORY_INFO = "getMemoryInfo";
    public static final String API_REMOVE_BATTERY_WARNING_LISTENER = "removeBatteryWarningListener";
    public static final String API_REMOVE_CPU_WARNING_LISTENER = "removeCPUWarningListener";
    public static final String API_REMOVE_GLOBAL_WARNING_LISTENER = "removeGlobalWarningListener";
    public static final String API_REMOVE_MEMORY_WARNING_LISTENER = "removeMemoryWarningListener";
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public List<b> f2001a;
    public List<b> b;
    public List<b> c;
    public List<b> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(125829123);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(125829122);
    }

    public static /* synthetic */ Object ipc$super(PerformanceAbility performanceAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/performance/PerformanceAbility");
    }

    public final void a(int i, int i2, String str, String str2, vq vqVar, List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28e6d693", new Object[]{this, new Integer(i), new Integer(i2), str, str2, vqVar, list});
            return;
        }
        b bVar = new b(i, i2, str, str2, vqVar);
        p7o.a(bVar);
        list.add(bVar);
    }

    public final void c(List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59375613", new Object[]{this, list});
            return;
        }
        for (b bVar : list) {
            p7o.d(bVar);
        }
        list.clear();
    }

    @Override // tb.cu
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        List<b> list = this.f2001a;
        if (list != null) {
            c(list);
            this.f2001a = null;
        }
        List<b> list2 = this.b;
        if (list2 != null) {
            c(list2);
            this.b = null;
        }
        List<b> list3 = this.c;
        if (list3 != null) {
            c(list3);
            this.c = null;
        }
        List<b> list4 = this.d;
        if (list4 != null) {
            c(list4);
            this.d = null;
        }
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10d90f1f", new Object[]{this});
        }
        try {
            int b2 = qp0.b();
            if (b2 == 0) {
                return "high";
            }
            if (b2 == 1) {
                return "medium";
            }
            if (b2 != 2) {
                return "unknown";
            }
            return "low";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements jxl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f2002a;
        public final int b;
        public final vq c;

        static {
            t2o.a(125829124);
        }

        public b(int i, int i2, String str, String str2, vq vqVar) {
            ckf.g(vqVar, "callback");
            this.f2002a = i;
            this.b = i2;
            this.c = vqVar;
        }

        @Override // tb.jxl
        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cb1881df", new Object[]{this})).intValue();
            }
            return this.f2002a;
        }

        @Override // tb.jxl
        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fb96a19b", new Object[]{this})).intValue();
            }
            return this.b;
        }

        @Override // tb.jxl
        public boolean c(eyl eylVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f29d0f9", new Object[]{this, eylVar})).booleanValue();
            }
            ckf.g(eylVar, "warningInfo");
            this.c.a(new FinishResult(new JSONObject(kotlin.collections.a.j(jpu.a("category", RGCategoryInfo.a(eylVar.f18894a)), jpu.a("type", RGTypeInfo.a(eylVar.b)), jpu.a(m09.TASK_TYPE_LEVEL, eylVar.c), jpu.a("value", eylVar.d), jpu.a("profileType", eylVar.f), jpu.a("process", eylVar.g))), "onWarning"));
            return true;
        }
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        switch (str.hashCode()) {
            case -1120553913:
                if (str.equals(API_REMOVE_BATTERY_WARNING_LISTENER)) {
                    List<b> list = this.d;
                    if (list != null) {
                        c(list);
                    }
                    return new FinishResult(new JSONObject(), null, 2, null);
                }
                break;
            case -860790743:
                if (str.equals(API_ADD_CPU_WARNING_LISTENER)) {
                    String w = MegaUtils.w(map, "bizID", "");
                    String str13 = (String) kdbVar.m("url");
                    List<b> list2 = this.c;
                    if (list2 == null) {
                        list2 = new ArrayList<>();
                        this.c = list2;
                        xhv xhvVar = xhv.INSTANCE;
                    }
                    a(1, 101, w, str13, vqVar, list2);
                    return null;
                }
                break;
            case -592801628:
                if (str.equals(API_ADD_BATTERY_WARNING_LISTENER)) {
                    String w2 = MegaUtils.w(map, "bizID", "");
                    String str14 = (String) kdbVar.m("url");
                    List<b> list3 = this.d;
                    if (list3 == null) {
                        list3 = new ArrayList<>();
                        this.d = list3;
                        xhv xhvVar2 = xhv.INSTANCE;
                    }
                    a(4, 999, w2, str14, vqVar, list3);
                    return null;
                }
                break;
            case 164252716:
                if (str.equals(API_ADD_GLOBAL_WARNING_LISTENER)) {
                    String w3 = MegaUtils.w(map, "bizID", "");
                    String str15 = (String) kdbVar.m("url");
                    List<b> list4 = this.f2001a;
                    if (list4 == null) {
                        list4 = new ArrayList<>();
                        this.f2001a = list4;
                        xhv xhvVar3 = xhv.INSTANCE;
                    }
                    a(9, 999, w3, str15, vqVar, list4);
                    return null;
                }
                break;
            case 424323113:
                if (str.equals(API_REMOVE_GLOBAL_WARNING_LISTENER)) {
                    List<b> list5 = this.f2001a;
                    if (list5 != null) {
                        c(list5);
                    }
                    return new FinishResult(new JSONObject(), null, 2, null);
                }
                break;
            case 800516878:
                if (str.equals(API_ADD_MEMORY_WARNING_LISTENER)) {
                    String w4 = MegaUtils.w(map, "bizID", "");
                    String str16 = (String) kdbVar.m("url");
                    List<b> list6 = this.b;
                    if (list6 == null) {
                        list6 = new ArrayList<>();
                        this.b = list6;
                        xhv xhvVar4 = xhv.INSTANCE;
                    }
                    a(2, 999, w4, str16, vqVar, list6);
                    return null;
                }
                break;
            case 1060587275:
                if (str.equals(API_REMOVE_MEMORY_WARNING_LISTENER)) {
                    List<b> list7 = this.b;
                    if (list7 != null) {
                        c(list7);
                    }
                    return new FinishResult(new JSONObject(), null, 2, null);
                }
                break;
            case 1076526656:
                if (str.equals(API_GET_CPU_INFO)) {
                    eyl c = p7o.c(1, 101, 101);
                    if (c == null || (str2 = c.c) == null) {
                        str2 = "unknown";
                    }
                    Pair a2 = jpu.a(m09.TASK_TYPE_LEVEL, str2);
                    if (c == null || (str3 = c.d) == null) {
                        str3 = "-1";
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.a.j(a2, jpu.a("value", str3))), null, 2, null);
                }
                break;
            case 1382743845:
                if (str.equals(API_GET_BATTERY_INFO)) {
                    eyl c2 = p7o.c(4, 401, 101);
                    eyl c3 = p7o.c(4, 402, 101);
                    if (c2 == null || (str4 = c2.c) == null) {
                        str4 = "unknown";
                    }
                    Pair a3 = jpu.a(m09.TASK_TYPE_LEVEL, str4);
                    if (c2 == null || (str5 = c2.d) == null) {
                        str5 = "-1";
                    }
                    Pair a4 = jpu.a("value", str5);
                    if (c3 == null || (str6 = c3.c) == null) {
                        str6 = "unknown";
                    }
                    Pair a5 = jpu.a("temperatureLevel", str6);
                    if (c3 == null || (str7 = c3.d) == null) {
                        str7 = "-1";
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.a.j(a3, a4, a5, jpu.a("temperature", str7))), null, 2, null);
                }
                break;
            case 1498271052:
                if (str.equals(API_REMOVE_CPU_WARNING_LISTENER)) {
                    List<b> list8 = this.c;
                    if (list8 != null) {
                        c(list8);
                    }
                    return new FinishResult(new JSONObject(), null, 2, null);
                }
                break;
            case 1687020869:
                if (str.equals(API_GET_MEMORY_INFO)) {
                    eyl c4 = p7o.c(2, 201, 101);
                    eyl c5 = p7o.c(2, 202, 101);
                    eyl c6 = p7o.c(2, 203, 101);
                    if (c4 == null || (str8 = c4.c) == null) {
                        str8 = "unknown";
                    }
                    Pair a6 = jpu.a(m09.TASK_TYPE_LEVEL, str8);
                    if (c4 == null || (str9 = c4.d) == null) {
                        str9 = "-1";
                    }
                    Pair a7 = jpu.a("value", str9);
                    if (c5 == null || (str10 = c5.c) == null) {
                        str10 = "unknown";
                    }
                    Pair a8 = jpu.a("nativeMemoryLevel", str10);
                    if (c5 == null || (str11 = c5.d) == null) {
                        str11 = "-1";
                    }
                    Pair a9 = jpu.a("nativeMemorySize", str11);
                    if (c6 == null || (str12 = c6.d) == null) {
                        str12 = "-1";
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.a.j(a6, a7, a8, a9, jpu.a("totalPSSMemory", str12))), null, 2, null);
                }
                break;
            case 2093832600:
                if (str.equals(API_GET_DEVICE_LEVEL)) {
                    return new FinishResult(new JSONObject(v3i.f(jpu.a("result", b()))), null, 2, null);
                }
                break;
        }
        ErrorResult.a.C0055a aVar = ErrorResult.a.Companion;
        return aVar.a("api " + str + " not found");
    }
}
