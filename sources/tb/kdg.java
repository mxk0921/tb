package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class kdg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final String f22593a = Globals.getVersionName();
    public static int b = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(511705562);
        }

        public a() {
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("48ea1096", new Object[]{this})).intValue();
            }
            String a2 = kdg.a();
            ckf.f(a2, "appVersion");
            List<String> z0 = wsq.z0(a2, new String[]{"."}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(zz3.q(z0, 10));
            for (String str : z0) {
                arrayList.add(Integer.valueOf(kdg.Companion.e(krq.i(str, 0))));
            }
            if (arrayList.size() < 3) {
                return 100;
            }
            return (((Number) arrayList.get(0)).intValue() * 1000000) + (((Number) arrayList.get(1)).intValue() * 1000) + ((Number) arrayList.get(2)).intValue();
        }

        public final JSONObject b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("1a347668", new Object[]{this});
            }
            try {
                return JSON.parseObject(OrangeConfig.getInstance().getConfig("XGuangCreator", "material_config_version_list", null));
            } catch (Throwable unused) {
                return null;
            }
        }

        @JvmStatic
        public final int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2d6bc1c", new Object[]{this})).intValue();
            }
            if (kdg.b() == -1) {
                try {
                    int d = d();
                    if (d < 0) {
                        d = a();
                    }
                    kdg.c(d);
                } catch (Throwable th) {
                    kdg.c(100);
                    odg.c("LEUtil", "getVersion error:" + Log.getStackTraceString(th));
                }
            }
            return kdg.b();
        }

        public final int e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("40d3bc31", new Object[]{this, new Integer(i)})).intValue();
            }
            return i % 1000;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("83c3d2f1", new Object[]{this})).intValue();
            }
            JSONObject b = b();
            if (b != null) {
                for (Map.Entry<String, Object> entry : b.entrySet()) {
                    if (TextUtils.equals(kdg.a(), entry.getKey())) {
                        return Integer.parseInt(entry.getValue().toString());
                    }
                    String key = entry.getKey();
                    ckf.f(key, "rule.key");
                    if (wsq.O(key, Constants.WAVE_SEPARATOR, false, 2, null)) {
                        String key2 = entry.getKey();
                        ckf.f(key2, "rule.key");
                        List z0 = wsq.z0(key2, new String[]{Constants.WAVE_SEPARATOR}, false, 0, 6, null);
                        if (z0.size() > 1 && kdg.a().compareTo((String) z0.get(0)) >= 0 && kdg.a().compareTo((String) z0.get(1)) <= 0) {
                            return Integer.parseInt(entry.getValue().toString());
                        }
                    }
                }
            }
            return -1;
        }
    }

    static {
        t2o.a(511705561);
    }

    public static final /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e300535", new Object[0]);
        }
        return f22593a;
    }

    public static final /* synthetic */ int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f40f6569", new Object[0])).intValue();
        }
        return b;
    }

    public static final /* synthetic */ void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4b455c1", new Object[]{new Integer(i)});
        } else {
            b = i;
        }
    }

    @JvmStatic
    public static final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d6bc1c", new Object[0])).intValue();
        }
        return Companion.c();
    }
}
