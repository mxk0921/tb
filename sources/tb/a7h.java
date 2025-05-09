package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class a7h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public int f15582a;
    public int b;
    public final int c;
    public int d;
    public int e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public a7h(JSONArray jSONArray) {
        ckf.g(jSONArray, "feedList");
        n9l n9lVar = n9l.INSTANCE;
        int p = n9lVar.p();
        this.c = p;
        b(jSONArray, p, n9lVar.E());
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("adc6095f", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final boolean a(eme emeVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa0fd022", new Object[]{this, emeVar})).booleanValue();
        }
        if (!(emeVar == null || (str = emeVar.c) == null)) {
            int hashCode = str.hashCode();
            if (hashCode != 3198432) {
                if (hashCode == 3599307 && str.equals("user")) {
                    this.d--;
                }
            } else if (str.equals(eme.IMAGE_TYPE_HEAD)) {
                this.e--;
            }
        }
        return this.e <= 0 && this.d <= 0;
    }

    public final void b(JSONArray jSONArray, int i, int i2) {
        JSONObject jSONObject;
        JSONArray jSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cd4f09b", new Object[]{this, jSONArray, new Integer(i), new Integer(i2)});
            return;
        }
        int f = hfn.f(i, jSONArray.size());
        int i3 = 0;
        for (int i4 = 0; i4 < f; i4++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
            JSONArray jSONArray3 = jSONObject2.getJSONArray(q0j.SCENE_MEDIA_PLAYER);
            i3 += (jSONArray3 != null ? jSONArray3.size() : 0) + ((!jSONObject2.containsKey("appendedFeed") || (jSONObject = jSONObject2.getJSONObject("appendedFeed")) == null || !jSONObject.containsKey(q0j.SCENE_MEDIA_PLAYER) || (jSONArray2 = jSONObject.getJSONArray(q0j.SCENE_MEDIA_PLAYER)) == null) ? 0 : jSONArray2.size());
        }
        if (i3 == 0) {
            this.f15582a = 0;
            this.b = i;
        } else {
            this.f15582a = hfn.f(i3, i2);
            this.b = 1;
        }
        this.d = this.f15582a;
        this.e = this.b;
    }
}
