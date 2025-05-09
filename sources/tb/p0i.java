package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.global.a;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicDinamicXViewHolder;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicImageViewHolder;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicVideoViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class p0i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final o0i f25796a;
    public final List<u0i> b = new ArrayList();
    public final r0i c = new r0i();
    public boolean d;
    public boolean e;
    public final a f;
    public boolean g;

    static {
        t2o.a(352322151);
    }

    public p0i(JSONObject jSONObject, JSONObject jSONObject2, a aVar) {
        this.f = aVar;
        c();
        b(jSONObject);
        o0i o0iVar = new o0i(y9a.b());
        this.f25796a = o0iVar;
        o0iVar.b(jSONObject2);
    }

    public g9e a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g9e) ipChange.ipc$dispatch("8dd01fd4", new Object[]{this});
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            u0i u0iVar = (u0i) it.next();
            if (u0iVar != null && MainPicVideoViewHolder.i.equals(u0iVar.e()) && (u0iVar instanceof g9w)) {
                return ((g9w) u0iVar).i();
            }
        }
        return null;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1687bf7", new Object[]{this});
            return;
        }
        this.c.b(MainPicVideoViewHolder.i, g9w.h());
        this.c.b(MainPicImageViewHolder.l, ome.g());
        this.c.b(MainPicDinamicXViewHolder.h, so7.h());
    }

    public void b(JSONObject jSONObject) {
        JSONArray jSONArray;
        u0i a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f28d544", new Object[]{this, jSONObject});
            return;
        }
        ((ArrayList) this.b).clear();
        if (!(jSONObject == null || (jSONArray = jSONObject.getJSONArray("data")) == null)) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (!(jSONObject2 == null || (a2 = this.c.a(jSONObject2.getString("type"), jSONObject2, this.f)) == null)) {
                    a2.c = i;
                    if (a2 instanceof ome) {
                        this.d = true;
                    }
                    if (a2.f()) {
                        this.e = true;
                    }
                    ((ArrayList) this.b).add(a2);
                }
            }
        }
    }
}
