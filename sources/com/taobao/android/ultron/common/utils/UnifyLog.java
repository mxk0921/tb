package com.taobao.android.ultron.common.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;
import java.util.LinkedHashMap;
import tb.hav;
import tb.jq0;
import tb.t2o;
import tb.vav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UnifyLog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_USE_ANDROID_LOG = "useAndroidLog";

    /* renamed from: a  reason: collision with root package name */
    public static final String f9837a = "[new_ultron]";
    public static String b = "default";
    public static String c = "[new_ultron][" + b + "]";
    public static final AliLogInterface d = jq0.c();
    public static final LinkedHashMap<String, f> e = new LinkedHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum EventType {
        COMMON("common", 0),
        CLICK("click", 1),
        NET("net", 2),
        NET_RESPONSE("net_response", 3),
        ERROR("error", 4);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int value;

        EventType(String str, int i) {
            this.value = i;
        }

        public static /* synthetic */ Object ipc$super(EventType eventType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/common/utils/UnifyLog$EventType");
        }

        public static EventType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EventType) ipChange.ipc$dispatch("e07219bf", new Object[]{str});
            }
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public int getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
            }
            return this.value;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9838a;

        public a(String str) {
            this.f9838a = str;
        }

        @Override // com.taobao.android.ultron.common.utils.UnifyLog.g
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c263aadc", new Object[]{this, str});
                return;
            }
            UnifyLog.b().logw(UnifyLog.a(), str);
            UnifyLog.c("warn", this.f9838a, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9839a;

        public b(String str) {
            this.f9839a = str;
        }

        @Override // com.taobao.android.ultron.common.utils.UnifyLog.g
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c263aadc", new Object[]{this, str});
                return;
            }
            UnifyLog.b().logd(UnifyLog.a(), str);
            UnifyLog.c("debug", this.f9839a, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9840a;

        public c(String str) {
            this.f9840a = str;
        }

        @Override // com.taobao.android.ultron.common.utils.UnifyLog.g
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c263aadc", new Object[]{this, str});
                return;
            }
            UnifyLog.b().logi(UnifyLog.a(), str);
            UnifyLog.c("info", this.f9840a, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9841a;

        public d(String str) {
            this.f9841a = str;
        }

        @Override // com.taobao.android.ultron.common.utils.UnifyLog.g
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c263aadc", new Object[]{this, str});
                return;
            }
            UnifyLog.b().loge(UnifyLog.a(), str);
            UnifyLog.c("error", this.f9841a, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9842a;
        public final /* synthetic */ String b;

        public e(String str, String str2) {
            this.f9842a = str;
            this.b = str2;
        }

        @Override // com.taobao.android.ultron.common.utils.UnifyLog.g
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c263aadc", new Object[]{this, str});
                return;
            }
            hav.d(this.f9842a + "#" + this.b, str);
            UnifyLog.c("error", this.b, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface f {
        void onLog(String str, String str2, String str3);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface g {
        void a(String str);
    }

    static {
        t2o.a(83886102);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ AliLogInterface b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliLogInterface) ipChange.ipc$dispatch("7e7ccf0d", new Object[0]);
        }
        return d;
    }

    public static /* synthetic */ void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1be6b17", new Object[]{str, str2, str3});
        } else {
            h(str, str2, str3);
        }
    }

    public static void d(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e678f70a", new Object[]{str, strArr});
        } else if (d != null) {
            i(f(str, strArr), new b(str));
        }
    }

    public static void e(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edde2c29", new Object[]{str, strArr});
        } else if (d != null) {
            i(f(str, strArr), new d(str));
        }
    }

    public static String f(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6453e00", new Object[]{str, strArr});
        }
        if (strArr == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i == 0) {
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    sb.append(".");
                }
                sb.append(strArr[i]);
                if (strArr.length > 1) {
                    sb.append(" |");
                }
            } else {
                sb.append(" ");
                sb.append(strArr[i]);
            }
        }
        return sb.toString();
    }

    public static void g(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7300a5", new Object[]{str, strArr});
        } else if (d != null) {
            i(f(str, strArr), new c(str));
        }
    }

    public static void h(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47917d53", new Object[]{str, str2, str3});
            return;
        }
        LinkedHashMap<String, f> linkedHashMap = e;
        if (linkedHashMap.get(b) != null) {
            linkedHashMap.get(b).onLog(str, str2, str3);
        }
    }

    public static void i(String str, g gVar) {
        String str2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f9efee2", new Object[]{str, gVar});
        } else if (str != null) {
            gVar.a("---网络请求数据分割开始---");
            while (i < str.length()) {
                int i2 = i + 25600;
                if (str.length() <= i2) {
                    str2 = str.substring(i);
                } else {
                    str2 = str.substring(i, i2);
                }
                gVar.a(str2);
                i = i2;
            }
            gVar.a("---网络请求数据分割结束---");
        }
    }

    public static void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("[")) {
                str = str.replace("[", "");
            }
            if (str.endsWith("]")) {
                str = str.replace("]", "");
            }
            b = str;
            c = f9837a + "[" + b + "]";
        }
    }

    public static void l(String str, String str2, String str3, String str4, String str5, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5bbac21", new Object[]{str, str2, str3, str4, str5, strArr});
        } else {
            k(str, str2, str3, str4, str5, EventType.COMMON, strArr);
        }
    }

    public static void m(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b07dd4b5", new Object[]{str, str2, str3, strArr});
        } else {
            k(str, str2, str3, "0", "", EventType.COMMON, strArr);
        }
    }

    public static void n(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72fbe857", new Object[]{str, strArr});
        } else if (d != null) {
            i(f(str, strArr), new a(str));
        }
    }

    public static void k(String str, String str2, String str3, String str4, String str5, EventType eventType, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876a4547", new Object[]{str, str2, str3, str4, str5, eventType, strArr});
            return;
        }
        try {
            if (d != null) {
                if (vav.a("ultron", "useRVLoggerToPrintMtop", false)) {
                    hav.d(str + "#" + str2, f("", strArr));
                } else {
                    i(f("", strArr), new e(str, str2));
                }
            }
        } catch (Throwable unused) {
        }
    }
}
