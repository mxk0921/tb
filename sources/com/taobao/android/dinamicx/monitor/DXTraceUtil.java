package com.taobao.android.dinamicx.monitor;

import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXTraceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_COMMON_INT = 1;
    public static final String TYPE_COMMON_STRING = "common";
    public static final int TYPE_EVENT_CHAIN_INT = 2;
    public static final String TYPE_EVENT_CHAIN_STRING = "eventChain";
    public static final int TYPE_EXPRESSION_INT = 3;
    public static final String TYPE_EXPRESSION_STRING = "expression";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f7326a = false;
    public static boolean b = false;
    public static final List<Integer> c = new ArrayList<Integer>() { // from class: com.taobao.android.dinamicx.monitor.DXTraceUtil.1
        {
            add(1);
            add(2);
            add(3);
        }
    };

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DXTraceSupportType {
    }

    static {
        t2o.a(444596908);
    }

    public static void a(int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779e7a3f", new Object[]{new Integer(i), strArr});
        } else if (h(i)) {
            Trace.beginSection(g(strArr));
        }
    }

    public static void b(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770c13bc", new Object[]{strArr});
        } else {
            a(1, strArr);
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcca111", new Object[0]);
        } else {
            d(1);
        }
    }

    public static void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c7f412", new Object[]{new Integer(i)});
        } else if (h(i)) {
            Trace.endSection();
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4da857dc", new Object[0])).booleanValue();
        }
        return b;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94adc7fd", new Object[0])).booleanValue();
        }
        return f7326a;
    }

    public static String g(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3193a943", new Object[]{strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        if (strArr.length == 1) {
            return strArr[0];
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static boolean h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbbd42f4", new Object[]{new Integer(i)})).booleanValue();
        }
        if (f7326a && ((ArrayList) c).contains(Integer.valueOf(i))) {
            return true;
        }
        return false;
    }

    public static void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2928134", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce9df33", new Object[]{new Boolean(z)});
        } else {
            f7326a = z;
        }
    }
}
