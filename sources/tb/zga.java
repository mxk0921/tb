package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zga {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TBLIVE_ORANGE_GL = "goodlist";
    public static final String TBLIVE_ORANGE_GROUP = "tblive";

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f32754a;

    static {
        t2o.a(806356108);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba649a6f", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableCacheForKanDianRecover", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63ede7c3", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableFollowSeckillOpt", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55993b7c", new Object[0])).booleanValue();
        }
        if (f32754a == null) {
            f32754a = Boolean.valueOf(d());
        }
        return f32754a.booleanValue();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97ebbe0a", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableGoodsListSecKillItem", "true"));
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5af1c63e", new Object[0]);
        }
        return null;
    }

    public static String g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6311391f", new Object[]{str, str2});
        }
        return v2s.o().p() != null ? v2s.o().p().b("tblive", str, str2) : str2;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b2e304b", new Object[0])).booleanValue();
        }
        return zqq.c(g("openSubscribePopLayer", "true"));
    }

    public static boolean e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14d3b19c", new Object[]{jSONObject})).booleanValue();
        }
        return (jSONObject != null && jSONObject.getBooleanValue("hasPcg")) && zqq.c(v2s.o().p().b("goodlist", "enableGLPcg", "true"));
    }
}
