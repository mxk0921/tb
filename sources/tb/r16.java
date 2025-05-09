package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.TypeDX;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r16 extends n10 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String b;
    public DXRootView c;

    static {
        t2o.a(295699372);
    }

    public r16(xea xeaVar, String str) {
        super(xeaVar);
        this.b = str;
    }

    public static /* synthetic */ Object ipc$super(r16 r16Var, String str, Object... objArr) {
        if (str.hashCode() == 142881661) {
            super.a((TypeDX) objArr[0], (JSONObject) objArr[1], ((Number) objArr[2]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/impl/itemview/DXItemView");
    }

    @Override // tb.n10
    public void a(TypeDX typeDX, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884337d", new Object[]{this, typeDX, jSONObject, new Integer(i)});
            return;
        }
        super.a(typeDX, jSONObject, i);
        if (this.c == null || jSONObject == null) {
            hha.b("DXItemView", "onBindViewHolder | itemView exception,  mDXRootView=" + this.c + "    data=" + jSONObject);
            return;
        }
        hha.b("DXItemView", "onBindViewHolder | dx,  holder=" + this.c);
        ikr.f().m(this.c, jSONObject, this.f24437a);
        if (jSONObject.getBooleanValue("native_topItemAnimShow")) {
            ikr.f().h(this.c);
        }
    }

    @Override // tb.n10
    public TypeDX b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypeDX) ipChange.ipc$dispatch("3eccfd5a", new Object[]{this, new Integer(i)});
        }
        xea xeaVar = this.f24437a;
        if (xeaVar == null || xeaVar.i() == null) {
            return null;
        }
        DXRootView a2 = ikr.f().a(this.f24437a.i(), this.b);
        this.c = a2;
        if (a2 != null) {
            return new TypeDX(this.c);
        }
        new View(this.f24437a.i()).setTag("null");
        return new TypeDX(new View(this.f24437a.i()));
    }

    @Override // tb.n10
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90085d1", new Object[]{this});
        }
        return this.b;
    }
}
