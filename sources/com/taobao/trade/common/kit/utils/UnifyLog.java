package com.taobao.trade.common.kit.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;
import java.util.LinkedHashMap;
import tb.jq0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UnifyLog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_USE_ANDROID_LOG = "useAndroidLog";

    /* renamed from: a  reason: collision with root package name */
    public static final String f13839a = "default";
    public static final String b = "[new_ultron][default]";
    public static final AliLogInterface c = jq0.c();
    public static final LinkedHashMap<String, b> d = new LinkedHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trade/common/kit/utils/UnifyLog$EventType");
        }

        public static EventType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EventType) ipChange.ipc$dispatch("2086663e", new Object[]{str});
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13840a;

        public a(String str) {
            this.f13840a = str;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c263aadc", new Object[]{this, str});
                return;
            }
            UnifyLog.b().loge(UnifyLog.a(), str);
            UnifyLog.c("error", this.f13840a, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void onLog(String str, String str2, String str3);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
    }

    static {
        t2o.a(794820655);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ AliLogInterface b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliLogInterface) ipChange.ipc$dispatch("7e7ccf0d", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1be6b17", new Object[]{str, str2, str3});
        } else {
            f(str, str2, str3);
        }
    }

    public static void d(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edde2c29", new Object[]{str, strArr});
        } else if (c != null) {
            g(e(str, strArr), new a(str));
        }
    }

    public static String e(String str, String... strArr) {
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

    public static void f(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47917d53", new Object[]{str, str2, str3});
            return;
        }
        LinkedHashMap<String, b> linkedHashMap = d;
        String str4 = f13839a;
        if (linkedHashMap.get(str4) != null) {
            linkedHashMap.get(str4).onLog(str, str2, str3);
        }
    }

    public static void g(String str, c cVar) {
        String str2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("374719d", new Object[]{str, cVar});
        } else if (str != null) {
            while (i < str.length()) {
                int i2 = i + 25600;
                if (str.length() <= i2) {
                    str2 = str.substring(i);
                } else {
                    str2 = str.substring(i, i2);
                }
                if (i != 0) {
                    str2 = "----- log split -----\n" + str2;
                }
                ((a) cVar).a(str2);
                i = i2;
            }
        }
    }
}
