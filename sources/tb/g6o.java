package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class g6o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f19758a;
    public final String b;
    public final ArrayList<BaseCellBean> c;
    public final ArrayList<BaseCellBean> d;
    public final otf e;

    static {
        t2o.a(815792282);
    }

    public g6o(JSONObject jSONObject, String str, ArrayList<BaseCellBean> arrayList, ArrayList<BaseCellBean> arrayList2, otf otfVar) {
        ckf.g(str, "beginVersion");
        ckf.g(arrayList, "rerankItemList");
        ckf.g(arrayList2, "rerankP4pList");
        ckf.g(otfVar, "jarvis");
        this.f19758a = jSONObject;
        this.b = str;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = otfVar;
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("49befc7b", new Object[]{this});
        }
        return this.f19758a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4803344", new Object[]{this});
        }
        return this.b;
    }

    public final ArrayList<BaseCellBean> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("c58ebfb7", new Object[]{this});
        }
        return this.c;
    }

    public final ArrayList<BaseCellBean> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("49bf0cb8", new Object[]{this});
        }
        return this.d;
    }

    public final otf e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (otf) ipChange.ipc$dispatch("a720f036", new Object[]{this});
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6o)) {
            return false;
        }
        g6o g6oVar = (g6o) obj;
        if (ckf.b(this.f19758a, g6oVar.f19758a) && ckf.b(this.b, g6oVar.b) && ckf.b(this.c, g6oVar.c) && ckf.b(this.d, g6oVar.d) && ckf.b(this.e, g6oVar.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        JSONObject jSONObject = this.f19758a;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return (((((((i * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RerankParams(actionParams=" + this.f19758a + ", beginVersion=" + this.b + ", rerankItemList=" + this.c + ", rerankP4pList=" + this.d + ", jarvis=" + this.e + ')';
    }
}
