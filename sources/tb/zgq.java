package tb;

import android.text.TextUtils;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.TraceLogEventType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.orange.OrangeConfig;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zgq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_PLACEHOLDER = "errorPlaceHolder";
    public static final String SCENE_FCP_ROOT = "fcp_root";
    public static final UMLinkLogInterface j = hdv.a();

    /* renamed from: a  reason: collision with root package name */
    public final String f32762a;
    public final Long b;
    public final Map<String, List<wgq>> c;
    public final Map<String, String> d;
    public String f;
    public boolean g;
    public final x5v i;
    public boolean e = false;
    public final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974d65b8", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ((HashMap) this.d).put(str, str2);
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32acb502", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            if (str2 == null) {
                str2 = "";
            }
            ((HashMap) this.d).put(str, str2);
            this.e = g(str);
        }
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d146e0c", new Object[]{this, str, str2});
            return;
        }
        b(str, str2);
        this.g = true;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            return;
        }
        try {
            String str = "";
            String jSONString = !((HashMap) this.c).isEmpty() ? JSON.toJSONString(this.c) : str;
            if (!((HashMap) this.d).isEmpty()) {
                str = JSON.toJSONString(this.d);
            }
            if (!TextUtils.isEmpty(this.f)) {
                a("umbrellaTraceID", this.f);
            }
            if (this.e) {
                HashMap hashMap = new HashMap();
                hashMap.put("bizScenes", jSONString);
                hashMap.put(es6.DP_BIZ_CONTEXT, str);
                hashMap.put("Umbrella_Diagnose_Type", "1");
                hashMap.put("Umbrella_Diagnose_ErrorCode", "UmbrellaTrace");
                nzb.b().d(this.f32762a, hashMap);
            }
            f(jSONString, str);
            e(jSONString, str);
            j();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12843d30", new Object[]{this, str, str2});
        } else if (this.e) {
            HashMap hashMap = new HashMap();
            hashMap.put("biz", this.f32762a);
            hashMap.put("time", String.valueOf(this.b));
            hashMap.put(z9u.KEY_TAOKE_BIZSCENE, str);
            hashMap.put(es6.DP_BIZ_CONTEXT, str2);
            j.commitFailure("AppErrorTrace", "", "", r7j.UMBRELLA_SPINDLE_BIZ, this.f32762a, hashMap, "UmbrellaTrace", "场景诊断");
        }
    }

    public final void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63497f22", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("biz", (Object) this.f32762a);
            jSONObject.put("time", (Object) this.h.format(this.b));
            jSONObject.put(z9u.KEY_TAOKE_BIZSCENE, (Object) str);
            jSONObject.put(es6.DP_BIZ_CONTEXT, (Object) str2);
            j.trace(this.f32762a, "UmbrellaTrace", "", "SceneStage", "", "", TraceLogEventType.ERROR, jSONObject.toJSONString());
        }
    }

    public boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a07f7c31", new Object[]{this, str})).booleanValue();
        }
        if (ERROR_PLACEHOLDER.equals(str)) {
            return k();
        }
        return true;
    }

    public final long h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("229aad88", new Object[]{this, str, str2})).longValue();
        }
        try {
            return Long.parseLong(OrangeConfig.getInstance().getConfig(idv.ORANGE_GROUP_NAME, str + "_Error_" + str, String.valueOf(2000L)));
        } catch (Throwable th) {
            th.printStackTrace();
            return 2000L;
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30036438", new Object[]{this});
            return;
        }
        ((HashMap) this.d).clear();
        ((HashMap) this.c).clear();
        this.e = false;
        this.i.a();
        this.g = false;
        this.f = String.format("UTI%d", Long.valueOf(System.currentTimeMillis()));
    }

    public zgq(String str) {
        this.g = false;
        this.f32762a = TextUtils.isEmpty(str) ? "" : str;
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.b = valueOf;
        this.c = new HashMap();
        this.d = new HashMap();
        this.i = new x5v(str);
        this.g = true;
        this.f = String.format("UTI%d", valueOf);
    }

    public void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f87fd31f", new Object[]{this, jSONObject});
        } else if (b0r.a(OrangeConfig.getInstance().getConfig(idv.ORANGE_GROUP_NAME, "UmbrellaTraceResponseSwitch", "true"), true) && jSONObject != null && jSONObject.size() > 0 && this.g) {
            Coordinator.getDefaultThreadPoolExecutor().execute(new u8u(this.f, r7j.UMBRELLA_SPINDLE_BIZ, this.f32762a, jSONObject));
        }
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("166ebe02", new Object[]{this})).booleanValue();
        }
        List list = (List) ((HashMap) this.c).get(SCENE_FCP_ROOT);
        if (list == null || list.size() <= 0) {
            return false;
        }
        long j2 = ((wgq) list.get(0)).start;
        long h = h(this.f32762a, ERROR_PLACEHOLDER);
        long currentTimeMillis = System.currentTimeMillis() - j2;
        a("placeHolderTc", String.valueOf(currentTimeMillis));
        return currentTimeMillis >= h;
    }
}
