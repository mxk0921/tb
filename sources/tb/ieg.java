package tb;

import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultronnew.bean.LVView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.TypeDX;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.constans.GLRenderType;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ieg extends n10 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String b;

    static {
        t2o.a(295699374);
    }

    public ieg(xea xeaVar, String str) {
        super(xeaVar);
        this.b = str;
    }

    public static /* synthetic */ Object ipc$super(ieg iegVar, String str, Object... objArr) {
        if (str.hashCode() == 142881661) {
            super.a((TypeDX) objArr[0], (JSONObject) objArr[1], ((Number) objArr[2]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/impl/itemview/LVItemView");
    }

    @Override // tb.n10
    public void a(TypeDX typeDX, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884337d", new Object[]{this, typeDX, jSONObject, new Integer(i)});
            return;
        }
        super.a(typeDX, jSONObject, i);
        if (this.f24437a.I() == null || this.f24437a.I().h == null) {
            hha.b("UltronItemViewNew", "createTypeDX | mLVEngine empty.");
        } else if (!(typeDX.itemView instanceof LVView)) {
            hha.b("UltronItemViewNew", "createTypeDX | itemView error. itemView=" + typeDX.itemView);
        } else {
            this.f24437a.I().h.j((LVView) typeDX.itemView, this.b, jSONObject);
        }
    }

    @Override // tb.n10
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90085d1", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.n10
    public TypeDX b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypeDX) ipChange.ipc$dispatch("3eccfd5a", new Object[]{this, new Integer(i)});
        }
        if (TextUtils.isEmpty(this.b)) {
            hha.b("UltronItemViewNew", "createTypeDX | mRenderType empty.");
            return new TypeDX(new FrameLayout(this.f24437a.i()));
        } else if (this.f24437a.I() == null || this.f24437a.I().h == null) {
            hha.b("UltronItemViewNew", "createTypeDX | mLVEngine empty.");
            return new TypeDX(new FrameLayout(this.f24437a.i()));
        } else {
            hha.b("UltronItemViewNew", "onCreateViewHolder | ultron, viewType=" + i + "  renderType=" + this.b);
            feg fegVar = this.f24437a.I().h;
            HashMap hashMap = new HashMap();
            hashMap.put(l10.KEY_GOODS_LIVE_CONTEXT, this.f24437a);
            LVView d = fegVar.d(this.f24437a.i(), GLRenderType.GOODS_LIST.pageCode, hashMap);
            d.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            TypeDX typeDX = new TypeDX(d);
            typeDX.d0(true);
            typeDX.f0(this.b);
            return typeDX;
        }
    }
}
