package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class lha extends md7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String k;
    public String l;
    public List<b> m;
    public int n;
    public int o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements zf8<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(lha lhaVar) {
        }

        /* renamed from: b */
        public b a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4e1963a6", new Object[]{this, obj});
            }
            JSONObject jSONObject = (JSONObject) obj;
            b bVar = new b();
            bVar.f23340a = jSONObject.getString("picUrl");
            jSONObject.getString("itemId");
            bVar.b = jSONObject.getString(rg0.JUMP_URL);
            jSONObject.getString("title");
            jSONObject.getString("price");
            return bVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f23340a;
        public String b;

        static {
            t2o.a(912262511);
        }
    }

    static {
        t2o.a(912262509);
    }

    public lha(ComponentModel componentModel) {
        super(componentModel);
    }

    public static /* synthetic */ Object ipc$super(lha lhaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/viewmodel/GoodsMatchingViewModel");
    }

    @Override // tb.md7
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea845f58", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.md7
    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37e7e28", new Object[]{this, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("goodsmatchingList");
        if (jSONArray != null) {
            this.k = jSONObject.getString("machingTitle");
            this.l = jSONObject.getString("picUrl");
            JSONObject jSONObject2 = jSONObject.getJSONObject("size");
            if (jSONObject2 != null) {
                this.n = jSONObject2.getIntValue("height");
                this.o = jSONObject2.getIntValue("width");
            }
            if (this.n <= 0 || this.o <= 0) {
                this.n = 1;
                this.o = 1;
            }
            this.m = uf7.a(jSONArray, new a(this));
        }
    }
}
