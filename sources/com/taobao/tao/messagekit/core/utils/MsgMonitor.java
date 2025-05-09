package com.taobao.tao.messagekit.core.utils;

import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appfrmbundle.mkt.MKTHandler;
import java.util.List;
import java.util.Map;
import tb.ikl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MsgMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static a f12543a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    static {
        t2o.a(628097175);
    }

    public static void a(String str, String str2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aec33a6b", new Object[]{str, str2, new Double(d)});
            return;
        }
        a aVar = f12543a;
        if (aVar != null) {
            ((MKTHandler.c) aVar).a(str, str2, d);
        }
    }

    public static void b(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5653f8a1", new Object[]{str, str2, str3, new Double(d)});
            return;
        }
        a aVar = f12543a;
        if (aVar != null) {
            ((MKTHandler.c) aVar).b(str, str2, str3, d);
        }
    }

    public static void c(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426ed724", new Object[]{str, str2, str3, str4});
            return;
        }
        a aVar = f12543a;
        if (aVar != null) {
            ((MKTHandler.c) aVar).c(str, str2, str3, str4);
        }
    }

    public static void d(ikl iklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b7e629", new Object[]{iklVar});
            return;
        }
        a aVar = f12543a;
        if (aVar != null) {
            ((MKTHandler.c) aVar).d("MKT", "MKT_MSG_DURATION", new ArrayMap<String, String>(iklVar) { // from class: com.taobao.tao.messagekit.core.utils.MsgMonitor.1
                {
                    put("MKT_DIMENS_BIZ", "" + iklVar.f21366a.bizCode());
                    put("MKT_DIMENS_DUP", "" + iklVar.f21366a.needACK());
                    put("MKT_DIMENS_MQTT", "" + iklVar.f21366a.msgType());
                    put("MKT_DIMENS_TYPE", "" + iklVar.f21366a.type());
                    put("MKT_DIMENS_SUBTYPE", "" + iklVar.f21366a.subType());
                    put("MKT_DIMENS_TOPIC", iklVar.f21366a.topic());
                }
            }, new ArrayMap<String, Double>(iklVar) { // from class: com.taobao.tao.messagekit.core.utils.MsgMonitor.2
                {
                    put("MKT_MEASURE_FLOW", Double.valueOf(iklVar.h));
                    put("MKT_MEASURE_NET", Double.valueOf(iklVar.g));
                    put("MKT_MEASURE_PACK", Double.valueOf(iklVar.f));
                }
            });
        }
    }

    public static void e(String str, String str2, Map<String, String> map, Map<String, Double> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d01226", new Object[]{str, str2, map, map2});
            return;
        }
        a aVar = f12543a;
        if (aVar != null) {
            ((MKTHandler.c) aVar).d(str, str2, map, map2);
        }
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeeb8e7", new Object[]{str, str2});
            return;
        }
        a aVar = f12543a;
        if (aVar != null) {
            ((MKTHandler.c) aVar).e(str, str2);
        }
    }

    public static void g(String str, String str2, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62e171a0", new Object[]{str, str2, list, list2});
            return;
        }
        a aVar = f12543a;
        if (aVar != null) {
            ((MKTHandler.c) aVar).f(str, str2, list, list2);
        }
    }

    public static void h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70510ee0", new Object[]{aVar});
        } else {
            f12543a = aVar;
        }
    }
}
