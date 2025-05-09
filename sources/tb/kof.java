package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kof extends md7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q = null;
    public String r;
    public ArrayList<a> s;
    public String t;
    public String u;
    public String v;
    public float w;
    public float x;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f22799a;

        static {
            t2o.a(912262514);
        }

        public a(String str, int i, int i2) {
            this.f22799a = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
    }

    static {
        t2o.a(912262513);
    }

    public kof(ComponentModel componentModel) {
        super(componentModel);
    }

    public static /* synthetic */ Object ipc$super(kof kofVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/viewmodel/ItemInfoViewModel");
    }

    @Override // tb.md7
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea845f58", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final a l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ff679b45", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new a(str, 0, 0);
    }

    public void m(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c974a2", new Object[]{this, bVar});
        }
    }

    @Override // tb.md7
    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37e7e28", new Object[]{this, jSONObject});
            return;
        }
        this.q = jSONObject.getString("widthRatio");
        this.k = jSONObject.getString("picUrl");
        this.l = jSONObject.getString("price");
        this.m = jSONObject.getString("title");
        this.n = jSONObject.getString("tips");
        this.o = jSONObject.getString(rg0.JUMP_URL);
        this.p = jSONObject.getString("itemId");
        jSONObject.getString("avType");
        jSONObject.getString("panoramaUrl");
        this.r = jSONObject.getString("videoTagUrl");
        String string = jSONObject.getString(m09.ICON_RENDER);
        this.t = string;
        if (!TextUtils.isEmpty(string)) {
            String[] split = this.t.split(",");
            if (this.s == null) {
                this.s = new ArrayList<>();
            }
            for (String str : split) {
                a l = l(str);
                if (l != null) {
                    this.s.add(l);
                }
            }
        }
        this.u = jSONObject.getString("thumbnail");
        this.v = jSONObject.getString("videoUrl");
        jSONObject.getString("videoId");
        JSONObject jSONObject2 = jSONObject.getJSONObject("size");
        if (jSONObject2 != null) {
            try {
                this.w = jSONObject2.getFloatValue("height");
                this.x = jSONObject2.getFloatValue("width");
            } catch (Exception unused) {
            }
        }
        if (this.w == 0.0f || this.x == 0.0f) {
            this.w = 9.0f;
            this.x = 16.0f;
        }
    }
}
