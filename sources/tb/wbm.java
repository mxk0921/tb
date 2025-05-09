package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.stdpop.api.PopGravity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class wbm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f30589a = new JSONObject();
    public final JSONObject b = new JSONObject();
    public String c;
    public final String d;
    public final Float e;
    public final String f;
    public final JSONObject g;

    static {
        t2o.a(786432015);
    }

    public wbm(String str, Float f, String str2, JSONObject jSONObject) {
        this.d = str;
        this.e = f;
        this.f = str2;
        this.g = jSONObject;
    }

    public final wbm b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wbm) ipChange.ipc$dispatch("bf46f413", new Object[]{this, str, str2, str3});
        }
        this.b.put((JSONObject) "title", str);
        if (str2 != null) {
            this.b.put((JSONObject) "contentBackColor", str2);
        }
        if (str3 != null) {
            this.b.put((JSONObject) "backgroundMode", "color");
            this.b.put((JSONObject) "backgroundStyle", str3);
        }
        return this;
    }

    public final wbm c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wbm) ipChange.ipc$dispatch("31df9741", new Object[]{this, str, str2, str3});
        }
        JSONObject jSONObject = this.f30589a;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", (Object) str);
        jSONObject2.put("version", (Object) str2);
        jSONObject2.put("url", (Object) str3);
        xhv xhvVar = xhv.INSTANCE;
        jSONObject.put((JSONObject) "template", (String) jSONObject2);
        return this;
    }

    public final wbm d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wbm) ipChange.ipc$dispatch("93f5e0ad", new Object[]{this, str});
        }
        if (str != null) {
            this.f30589a.put((JSONObject) "droidFragmentTag", str);
        }
        return this;
    }

    public final wbm e(boolean z, boolean z2, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wbm) ipChange.ipc$dispatch("cb9fdc7e", new Object[]{this, new Boolean(z), new Boolean(z2), num});
        }
        this.b.put((JSONObject) "panEnable", (String) Boolean.valueOf(z));
        this.b.put((JSONObject) "autoRotate", (String) Boolean.valueOf(z2));
        this.b.put((JSONObject) "enterAnimDuration", (String) num);
        return this;
    }

    public final wbm f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wbm) ipChange.ipc$dispatch("6c62ad6f", new Object[]{this, new Boolean(z)});
        }
        this.b.put((JSONObject) e9.TAK_ABILITY_MATCH_CONTENT, (String) Boolean.valueOf(z));
        return this;
    }

    public final wbm g(zfm zfmVar, PopGravity popGravity, Integer num, String str) {
        String value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wbm) ipChange.ipc$dispatch("bc548643", new Object[]{this, zfmVar, popGravity, num, str});
        }
        if (zfmVar != null) {
            this.b.put((JSONObject) "leftMargin", (String) Float.valueOf(zfmVar.b()));
            this.b.put((JSONObject) "rightMargin", (String) Float.valueOf(zfmVar.c()));
            this.b.put((JSONObject) "topMargin", (String) Float.valueOf(zfmVar.d()));
            this.b.put((JSONObject) "bottomMargin", (String) Float.valueOf(zfmVar.a()));
        }
        if (!(popGravity == null || (value = popGravity.getValue()) == null)) {
            this.b.put((JSONObject) "gravity", value);
        }
        if (num != null) {
            this.b.put((JSONObject) "popContainerId", (String) Integer.valueOf(num.intValue()));
        }
        if (str != null) {
            this.b.put((JSONObject) "attachMode", str);
        }
        return this;
    }

    public final wbm h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wbm) ipChange.ipc$dispatch("10ee4d6d", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public final wbm i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wbm) ipChange.ipc$dispatch("9af0c9bf", new Object[]{this, str});
        }
        this.b.put((JSONObject) "title", str);
        return this;
    }

    public final JSONObject a() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d1d5fb15", new Object[]{this});
        }
        this.b.put((JSONObject) "maxHeight", (String) this.e);
        this.b.put((JSONObject) "maxWidth", (String) Float.valueOf(1.0f));
        JSONObject jSONObject = this.b;
        if (!ckf.a(this.e, 1.0f)) {
            i = xbm.a();
        }
        jSONObject.put((JSONObject) hij.KEY_CORNER_RADIUS, (String) Integer.valueOf(i));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) h9.KEY_POP_CONFIG, (String) this.b);
        jSONObject2.put((JSONObject) "popId", this.d);
        jSONObject2.put((JSONObject) "url", this.c);
        jSONObject2.put((JSONObject) "content", (String) this.g);
        jSONObject2.put((JSONObject) "bizId", this.f);
        jSONObject2.put((JSONObject) h9.KEY_EXT_CONFIG, (String) this.f30589a);
        return jSONObject2;
    }
}
