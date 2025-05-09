package tb;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.goods.list.IDMComponentsFrameLayout;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.TypeDX;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d9v extends n10 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final uga b;
    public final String c;

    static {
        t2o.a(295699375);
    }

    public d9v(xea xeaVar, uga ugaVar, String str) {
        super(xeaVar);
        this.b = ugaVar;
        this.c = str;
    }

    public static /* synthetic */ Object ipc$super(d9v d9vVar, String str, Object... objArr) {
        if (str.hashCode() == 142881661) {
            super.a((TypeDX) objArr[0], (JSONObject) objArr[1], ((Number) objArr[2]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/impl/itemview/UltronItemView");
    }

    @Override // tb.n10
    public void a(TypeDX typeDX, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884337d", new Object[]{this, typeDX, jSONObject, new Integer(i)});
            return;
        }
        super.a(typeDX, jSONObject, i);
        this.b.n(this.f24437a, (IDMComponentsFrameLayout) typeDX.itemView, jSONObject, typeDX.c0());
        if (jSONObject.getBooleanValue("native_topItemAnimShow")) {
            this.b.j((IDMComponentsFrameLayout) typeDX.itemView);
        }
    }

    @Override // tb.n10
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90085d1", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.n10
    public TypeDX b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypeDX) ipChange.ipc$dispatch("3eccfd5a", new Object[]{this, new Integer(i)});
        }
        if (TextUtils.isEmpty(this.c)) {
            return null;
        }
        IDMComponentsFrameLayout a2 = this.b.a();
        a2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        TypeDX typeDX = new TypeDX(a2);
        typeDX.d0(true);
        typeDX.f0(this.c);
        hha.b("UltronItemView", "onCreateViewHolder | ultron, viewType=" + i + "  renderType=" + this.c + "    holder=" + typeDX);
        return typeDX;
    }
}
