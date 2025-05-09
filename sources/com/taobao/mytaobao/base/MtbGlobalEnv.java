package com.taobao.mytaobao.base;

import android.taobao.mulitenv.EnvironmentSwitcher;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import kotlin.a;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.PropertyReference1Impl;
import tb.a0g;
import tb.c21;
import tb.ckf;
import tb.dun;
import tb.njg;
import tb.o78;
import tb.osh;
import tb.pb6;
import tb.q3g;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbGlobalEnv {
    public static final /* synthetic */ a0g[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MtbGlobalEnv INSTANCE;
    public static String b;
    public static String c;
    public static int d;
    public static String e;
    public static String f;
    public static String g;
    public static String h;
    public static String i;
    public static boolean j;
    public static long o;

    /* renamed from: a  reason: collision with root package name */
    public static int f11160a = -1;
    public static boolean k = true;
    public static final njg l = a.b(MtbGlobalEnv$noTraceLog$2.INSTANCE);
    public static final njg m = a.b(MtbGlobalEnv$isTablet$2.INSTANCE);
    public static final njg n = a.b(MtbGlobalEnv$isFoldDevice$2.INSTANCE);
    public static final njg q = a.b(MtbGlobalEnv$isPageV2$2.INSTANCE);
    public static final njg r = a.b(MtbGlobalEnv$enableWeexApm$2.INSTANCE);
    public static final njg s = a.b(MtbGlobalEnv$enableMTS$2.INSTANCE);
    public static final njg t = a.b(MtbGlobalEnv$enableDiffRefresh$2.INSTANCE);
    public static final njg u = a.b(MtbGlobalEnv$mtbRvFixedSize$2.INSTANCE);
    public static final njg v = a.b(MtbGlobalEnv$preloadOrderAB$2.INSTANCE);
    public static final njg w = a.b(MtbGlobalEnv$defaultType$2.INSTANCE);
    public static final njg x = a.b(MtbGlobalEnv$isGpPkg$2.INSTANCE);
    public static final njg y = a.b(MtbGlobalEnv$foldAspectRatio$2.INSTANCE);

    public static final boolean A() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("28c61cbb", new Object[0]);
        } else {
            njg njgVar = m;
            a0g a0gVar = $$delegatedProperties[1];
            value = njgVar.getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    public static final void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b6f7010", new Object[]{str});
        } else {
            b = str;
        }
    }

    public static final void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf4008b7", new Object[]{str});
        } else {
            c = str;
        }
    }

    public static final void E(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("932598dd", new Object[]{new Integer(i2)});
        } else {
            d = i2;
        }
    }

    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adaa19f1", new Object[0]);
        }
        return e;
    }

    public static final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b01490b", new Object[0]);
        }
        return f;
    }

    public static final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9b8a071", new Object[0]);
        }
        return h;
    }

    public static final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c322ce6", new Object[0]);
        }
        return g;
    }

    public static final int e() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("331821df", new Object[0]);
        } else {
            njg njgVar = w;
            a0g a0gVar = $$delegatedProperties[9];
            value = njgVar.getValue();
        }
        return ((Number) value).intValue();
    }

    public static final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        return f11160a;
    }

    public static final boolean h() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("6b0fd6e8", new Object[0]);
        } else {
            njg njgVar = t;
            a0g a0gVar = $$delegatedProperties[6];
            value = njgVar.getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    public static final boolean i() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("1a1ef77e", new Object[0]);
        } else {
            njg njgVar = s;
            a0g a0gVar = $$delegatedProperties[5];
            value = njgVar.getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    public static final boolean j() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("9d366e2f", new Object[0]);
        } else {
            njg njgVar = r;
            a0g a0gVar = $$delegatedProperties[4];
            value = njgVar.getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    public static final Float k() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("e553ba6c", new Object[0]);
        } else {
            njg njgVar = y;
            a0g a0gVar = $$delegatedProperties[11];
            value = njgVar.getValue();
        }
        return (Float) value;
    }

    public static final boolean l() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("3da96c97", new Object[0]);
        } else {
            njg njgVar = u;
            a0g a0gVar = $$delegatedProperties[7];
            value = njgVar.getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    public static final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("212d9c26", new Object[0]);
        }
        return b;
    }

    public static final String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79c1ac9f", new Object[0]);
        }
        return c;
    }

    public static final int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("183b1d65", new Object[0])).intValue();
        }
        return d;
    }

    public static final boolean p() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("947c1a21", new Object[0]);
        } else {
            njg njgVar = l;
            a0g a0gVar = $$delegatedProperties[0];
            value = njgVar.getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    public static final int q() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("d9289516", new Object[0]);
        } else {
            njg njgVar = v;
            a0g a0gVar = $$delegatedProperties[8];
            value = njgVar.getValue();
        }
        return ((Number) value).intValue();
    }

    public static final boolean s() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("1d70aa8c", new Object[0]);
        } else {
            njg njgVar = n;
            a0g a0gVar = $$delegatedProperties[2];
            value = njgVar.getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    public static final boolean t() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("a4939524", new Object[0]);
        } else {
            njg njgVar = x;
            a0g a0gVar = $$delegatedProperties[10];
            value = njgVar.getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    @JvmStatic
    public static final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89cf8bc", new Object[0])).booleanValue();
        }
        if (pb6.r(Globals.getApplication()) < pb6.s(Globals.getApplication())) {
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[0])).booleanValue();
        }
        int i2 = f11160a;
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        return true;
    }

    @JvmStatic
    public static final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f294d41b", new Object[0])).booleanValue();
        }
        if (SharedPreferencesUtil.getIntSharedPreference("envType", SharedPreferencesUtil.getIntSharedPreference(EnvironmentSwitcher.SPKEY_ENV, 0)) == 0) {
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bd5e61f", new Object[0])).booleanValue();
        }
        return o78.p(Globals.getApplication());
    }

    public static final boolean y() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("cf7fd940", new Object[0]);
        } else {
            njg njgVar = q;
            a0g a0gVar = $$delegatedProperties[3];
            value = njgVar.getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    @JvmStatic
    public static final boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94672e29", new Object[0])).booleanValue();
        }
        return ckf.b("sinkEngage", c);
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4127c3db", new Object[]{this});
            return;
        }
        try {
            f11160a = c21.g().getInt("deviceLevel", -1);
            TLog.loge("basementLog", "initDeviceInfo, deviceLevel=" + f11160a);
        } catch (Exception e2) {
            TLog.loge("basementLog", "initDeviceInfo, onException" + e2);
        }
    }

    @JvmStatic
    public static final void B(JSONObject jSONObject) {
        JSONObject jSONObject2;
        Long l2;
        Boolean bool;
        JSONObject jSONObject3;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25bef579", new Object[]{jSONObject});
            return;
        }
        String str = null;
        if (jSONObject != null) {
            try {
                jSONObject2 = jSONObject.getJSONObject(q3g.b);
            } catch (Throwable th) {
                TLog.loge("mtbMainLink", "parseMTBVersion error:" + th);
                return;
            }
        } else {
            jSONObject2 = null;
        }
        JSONObject jSONObject4 = jSONObject2 != null ? jSONObject2.getJSONObject("secScreenFragment") : null;
        String string = jSONObject2 != null ? jSONObject2.getString("mytaobaoVersion") : null;
        String string2 = jSONObject2 != null ? jSONObject2.getString("mytaobaoLayout") : null;
        b = string;
        c = string2;
        d = jSONObject2 != null ? jSONObject2.getIntValue("navBarStyle") : 0;
        e = jSONObject4 != null ? jSONObject4.getString("bizType") : null;
        f = jSONObject4 != null ? jSONObject4.getString("pageType") : null;
        g = (jSONObject4 == null || (jSONObject3 = jSONObject4.getJSONObject("bizParams")) == null) ? null : jSONObject3.getString("version");
        if (jSONObject4 != null) {
            str = jSONObject4.getString("placeHolderType");
        }
        h = str;
        if (!(jSONObject2 == null || (bool = jSONObject2.getBoolean("refreshBasement")) == null)) {
            z = bool.booleanValue();
        }
        j = z;
        long longValue = (jSONObject2 == null || (l2 = jSONObject2.getLong("mainInterfaceExpireTime")) == null) ? 0L : l2.longValue();
        if (longValue > 0) {
            osh.f25618a = longValue;
        }
    }

    static {
        t2o.a(745537555);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(dun.b(MtbGlobalEnv.class), "noTraceLog", "getNoTraceLog()Z");
        dun.i(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(dun.b(MtbGlobalEnv.class), "isTablet", "isTablet()Z");
        dun.i(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(dun.b(MtbGlobalEnv.class), "isFoldDevice", "isFoldDevice()Z");
        dun.i(propertyReference1Impl3);
        PropertyReference1Impl propertyReference1Impl4 = new PropertyReference1Impl(dun.b(MtbGlobalEnv.class), "isPageV2", "isPageV2()Z");
        dun.i(propertyReference1Impl4);
        PropertyReference1Impl propertyReference1Impl5 = new PropertyReference1Impl(dun.b(MtbGlobalEnv.class), "enableWeexApm", "getEnableWeexApm()Z");
        dun.i(propertyReference1Impl5);
        PropertyReference1Impl propertyReference1Impl6 = new PropertyReference1Impl(dun.b(MtbGlobalEnv.class), "enableMTS", "getEnableMTS()Z");
        dun.i(propertyReference1Impl6);
        PropertyReference1Impl propertyReference1Impl7 = new PropertyReference1Impl(dun.b(MtbGlobalEnv.class), "enableDiffRefresh", "getEnableDiffRefresh()Z");
        dun.i(propertyReference1Impl7);
        PropertyReference1Impl propertyReference1Impl8 = new PropertyReference1Impl(dun.b(MtbGlobalEnv.class), "mtbRvFixedSize", "getMtbRvFixedSize()Z");
        dun.i(propertyReference1Impl8);
        PropertyReference1Impl propertyReference1Impl9 = new PropertyReference1Impl(dun.b(MtbGlobalEnv.class), "preloadOrderAB", "getPreloadOrderAB()I");
        dun.i(propertyReference1Impl9);
        PropertyReference1Impl propertyReference1Impl10 = new PropertyReference1Impl(dun.b(MtbGlobalEnv.class), "defaultType", "getDefaultType()I");
        dun.i(propertyReference1Impl10);
        PropertyReference1Impl propertyReference1Impl11 = new PropertyReference1Impl(dun.b(MtbGlobalEnv.class), "isGpPkg", "isGpPkg()Z");
        dun.i(propertyReference1Impl11);
        PropertyReference1Impl propertyReference1Impl12 = new PropertyReference1Impl(dun.b(MtbGlobalEnv.class), "foldAspectRatio", "getFoldAspectRatio()Ljava/lang/Float;");
        dun.i(propertyReference1Impl12);
        $$delegatedProperties = new a0g[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3, propertyReference1Impl4, propertyReference1Impl5, propertyReference1Impl6, propertyReference1Impl7, propertyReference1Impl8, propertyReference1Impl9, propertyReference1Impl10, propertyReference1Impl11, propertyReference1Impl12};
        MtbGlobalEnv mtbGlobalEnv = new MtbGlobalEnv();
        INSTANCE = mtbGlobalEnv;
        mtbGlobalEnv.r();
    }
}
