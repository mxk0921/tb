package com.taobao.taobao.utils;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.utils.CashDeskLog;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import tb.f9v;
import tb.h15;
import tb.yv6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TradeRealTimeDataTrace {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface TradeStage {
        public static final String CREATE_ORDER_FAIL = "createOrder_fail";
        public static final String CREATE_ORDER_REQUEST = "createOrder_request";
        public static final String CREATE_ORDER_SUCCESS = "createOrder_success";
        public static final String PAY_FAIL = "pay_fail";
        public static final String PAY_REQUEST = "pay_request";
        public static final String PAY_SUCCESS = "pay_success";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f12962a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b extends h15 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public static b c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("721328d3", new Object[]{str, str2});
            }
            return new b("AliBuy", str, "34077-tracker", TradeRealTimeDataTrace.a(str2));
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/utils/TradeRealTimeDataTrace$TradeRealTimeCustomModel");
        }
    }

    public static /* synthetic */ String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28c0253f", new Object[]{str});
        }
        return c(str);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa1d3759", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b156394", new Object[]{str});
        }
        if (TradeStage.PAY_REQUEST.equals(str) || TradeStage.PAY_SUCCESS.equals(str) || TradeStage.PAY_FAIL.equals(str)) {
            if (yv6.a()) {
                return "http://taobao.com/jstracker/android/debug/cashdesk.html";
            }
            return "http://taobao.com/jstracker/android/cashdesk.html";
        } else if (yv6.a()) {
            return "http://taobao.com/jstracker/android/debug/tbbuy.html";
        } else {
            return "http://taobao.com/jstracker/android/tbbuy.html";
        }
    }

    public static void d(h15 h15Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe607282", new Object[]{h15Var});
        } else if (h15Var instanceof b) {
            if (yv6.a()) {
                h15Var.sampling(1.0f);
            }
            f9v.p(h15Var);
        } else if (yv6.a()) {
            throw new IllegalArgumentException("model 必须为TradeRealTimeCustomModel");
        }
    }

    public static void e(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("879d6e5b", new Object[]{str, aVar});
        } else if (aVar != null) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "TradeRealTimeDataTrace trace tradeStage:" + str + ",traceModel:" + JSON.toJSONString(aVar));
            d(b.c("tradeRealTimeData", str).tag(str).indicator("c1", b(aVar.d)).indicator("c2", aVar.b).indicator("c3", aVar.g).indicator("c4", aVar.e).indicator("c5", b(aVar.c)).indicator("c9", aVar.f12962a).dimension("d1", c(str)).dimension("d2", aVar.f).dimension("d3", str).dimension("d4", aVar.j).dimension("d5", aVar.i).message(aVar.h).success(true).sampling(1.0f));
        }
    }
}
