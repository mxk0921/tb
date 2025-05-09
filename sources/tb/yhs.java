package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yhs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_DNS_REGEX = ".*http(s?)://(baron|share).laiwang.com.*tm=.*";
    public static final String DEFAULT_PLAN_B_PASSWORD_REGEX = ".*";
    public static final String DEFAULT_PRE_CHECK_REGEX = ".*\\/.*";
    public static final String DEFAULT_REFLOW_PLAN = "C";
    public static final String REFLOW_PLAN_A = "A";
    public static final String REFLOW_PLAN_B = "B";
    public static final String REFLOW_PLAN_C = "C";

    /* renamed from: a  reason: collision with root package name */
    public static ArrayList<zwd> f32103a;
    public static ais b;
    public static ahs c;

    static {
        t2o.a(665845924);
    }

    public static ArrayList<zwd> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("f34907b5", new Object[0]);
        }
        if (f32103a == null) {
            ArrayList<zwd> arrayList = new ArrayList<>();
            f32103a = arrayList;
            arrayList.add(new xhs());
        }
        return f32103a;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76877565", new Object[0]);
        }
        ahs ahsVar = c;
        if (ahsVar == null) {
            return ".*http(s?)://(baron|share).laiwang.com.*tm=.*";
        }
        return ((h8t) ahsVar).a();
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2dc9f34", new Object[0]);
        }
        ais aisVar = b;
        if (aisVar == null) {
            return "(￥|¥)(.+?)(￥|¥)";
        }
        String b2 = ((m8t) aisVar).b();
        if (TextUtils.isEmpty(b2)) {
            return "(￥|¥)(.+?)(￥|¥)";
        }
        return b2;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc2daff5", new Object[0]);
        }
        ais aisVar = b;
        if (aisVar == null) {
            return DEFAULT_PLAN_B_PASSWORD_REGEX;
        }
        return ((m8t) aisVar).c();
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b5e625f", new Object[0]);
        }
        ais aisVar = b;
        if (aisVar == null) {
            return ".*\\/.*";
        }
        return ((m8t) aisVar).d();
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("efeeb659", new Object[0]);
        }
        ais aisVar = b;
        if (aisVar == null) {
            return "C";
        }
        return ((m8t) aisVar).a();
    }

    public static void g(ais aisVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("484be7fd", new Object[]{aisVar});
        } else {
            b = aisVar;
        }
    }

    public static void h(ahs ahsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c1a618c", new Object[]{ahsVar});
        } else {
            c = ahsVar;
        }
    }
}
