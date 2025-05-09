package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tj8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMBINE_EVENT_ADD_NEXT_EVENT = "combineEventAddNext";
    public static final String COMBINE_EVENT_DISPATCH_EVENT = "combineEventDispatchEvent";
    public static final String COMBINE_EVENT_START = "combineEventStart";
    public static final String COMMON_EVENT_END = "commonEventEnd";
    public static final String COMMON_EVENT_START = "commonEventStart";
    public static final String ERROR_CODE_EVENT_CHAIN_COLOR_PARSE_ERROR = "EVENT_CHAIN_COLOR_PARSE_ERROR";
    public static final String ERROR_CODE_EVENT_CHAIN_EXPRESSION_PARSER_ENGINE_PARSE_ERROR = "EVENT_CHAIN_EXPRESSION_PARSER_ENGINE_PARSE_ERROR";
    public static final String ERROR_CODE_EVENT_CHAIN_PARAMS_VALID_ERROR = "EVENT_CHAIN_PARAMS_VALID_ERROR";
    public static final String ERROR_CODE_EVENT_CHAIN_TRY_EXCEPTION_ERROR = "EVENT_CHAIN_TRY_EXCEPTION_ERROR";
    public static final String EVENT_CHAIN_END = "eventChainOver";
    public static final String EVENT_CHAIN_NEXT = "eventChainNext";
    public static final String FEATURE_TYPE = "EventChain";

    /* renamed from: a  reason: collision with root package name */
    public static lnc f28748a;
    public static zgb b;

    static {
        t2o.a(156237884);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8946443b", new Object[]{str, str2, str3});
            return;
        }
        String str4 = "EVENT_CHAIN_PARAMS_VALID_ERROR".equals(str2) ? "参数错误" : str2;
        HashMap hashMap = new HashMap();
        hashMap.put("msg", str3);
        zgb zgbVar = b;
        if (zgbVar != null) {
            ((yk8) zgbVar).a("EventChain", str + "-onHandleEventChain", str2, str4, hashMap);
        }
        f(str, str + "-onHandleEventChain", str2, str4, str3);
    }

    public static void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec6f545", new Object[]{str, str2, str3, str4});
            return;
        }
        String str5 = "EVENT_CHAIN_PARAMS_VALID_ERROR".equals(str3) ? "参数错误" : str3;
        HashMap hashMap = new HashMap();
        hashMap.put("msg", str4);
        zgb zgbVar = b;
        if (zgbVar != null) {
            ((yk8) zgbVar).a("EventChain", str + "-" + str2, str3, str5, hashMap);
        }
        f(str, str + "-" + str2, str3, str5, str4);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:28:0x004f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static java.lang.String c(java.lang.Throwable r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.tj8.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "b084d465"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            if (r4 != 0) goto L_0x001a
            java.lang.String r4 = ""
            return r4
        L_0x001a:
            r0 = 0
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch: all -> 0x003a
            r1.<init>()     // Catch: all -> 0x003a
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch: all -> 0x003b
            r2.<init>(r1)     // Catch: all -> 0x003b
            r4.printStackTrace(r2)     // Catch: all -> 0x0038
            java.lang.String r4 = r1.toString()     // Catch: all -> 0x0038
            r2.close()     // Catch: IOException -> 0x0033
            r1.close()     // Catch: IOException -> 0x0033
            goto L_0x0037
        L_0x0033:
            r0 = move-exception
            d(r0)
        L_0x0037:
            return r4
        L_0x0038:
            r0 = r2
            goto L_0x003b
        L_0x003a:
            r1 = r0
        L_0x003b:
            java.lang.String r4 = "getStackTrace Exception"
            if (r0 == 0) goto L_0x0045
            r0.close()     // Catch: IOException -> 0x0043
            goto L_0x0045
        L_0x0043:
            r0 = move-exception
            goto L_0x004b
        L_0x0045:
            if (r1 == 0) goto L_0x004e
            r1.close()     // Catch: IOException -> 0x0043
            goto L_0x004e
        L_0x004b:
            d(r0)
        L_0x004e:
            return r4
        L_0x004f:
            r4 = move-exception
            if (r0 == 0) goto L_0x0058
            r0.close()     // Catch: IOException -> 0x0056
            goto L_0x0058
        L_0x0056:
            r0 = move-exception
            goto L_0x005e
        L_0x0058:
            if (r1 == 0) goto L_0x0061
            r1.close()     // Catch: IOException -> 0x0056
            goto L_0x0061
        L_0x005e:
            d(r0)
        L_0x0061:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tj8.c(java.lang.Throwable):java.lang.String");
    }

    public static void d(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a801253", new Object[]{th});
        } else if (DinamicXEngine.j0() && th != null) {
            th.printStackTrace();
        }
    }

    public static void e(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7160f46", new Object[]{str, str2, strArr});
            return;
        }
        lnc lncVar = f28748a;
        if (lncVar != null) {
            ((rk8) lncVar).a(str, str2, "", "", 0, strArr);
        }
    }

    public static void f(String str, String str2, String str3, String str4, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa6a46", new Object[]{str, str2, str3, str4, strArr});
            return;
        }
        lnc lncVar = f28748a;
        if (lncVar != null) {
            ((rk8) lncVar).a(str, str2, str3, str4, 0, strArr);
        }
    }

    public static void g(zgb zgbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf6476ed", new Object[]{zgbVar});
        } else {
            b = zgbVar;
        }
    }

    public static void h(lnc lncVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6501aa9", new Object[]{lncVar});
        } else {
            f28748a = lncVar;
        }
    }
}
