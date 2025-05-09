package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.list.MetaListWidget;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class tmz extends hsi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean j;
    public final int k = o4p.L2();
    public final JSONObject l = new JSONObject();
    public boolean m;

    static {
        t2o.a(815792896);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmz(MetaListWidget metaListWidget) {
        super(metaListWidget);
        ckf.g(metaListWidget, "widget");
    }

    public static /* synthetic */ Object ipc$super(tmz tmzVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -980867139) {
            super.g();
            return null;
        } else if (hashCode == -466054859) {
            super.h();
            return null;
        } else if (hashCode == 1727106610) {
            super.i();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/refactor/list/ScrollStateListPlugin");
        }
    }

    @Override // tb.hsi
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58927bd", new Object[]{this});
            return;
        }
        super.g();
        this.j = true;
        this.m = false;
    }

    @Override // tb.hsi
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4389135", new Object[]{this});
            return;
        }
        super.h();
        this.j = false;
        a().postEvent(new ljz("dragHide", this.l));
        this.m = false;
    }

    @Override // tb.hsi
    public void i() {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f18e32", new Object[]{this});
            return;
        }
        super.i();
        if (this.j && !this.m) {
            RecyclerView A2 = a().A2();
            ckf.e(A2, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
            PartnerRecyclerView partnerRecyclerView = (PartnerRecyclerView) A2;
            if (o1p.e(partnerRecyclerView.getScrollSpeed()) > this.k) {
                this.m = true;
                boolean isScrollDown = partnerRecyclerView.isScrollDown();
                MetaListWidget a2 = a();
                JSONObject jSONObject = new JSONObject();
                if (isScrollDown) {
                    i = -1;
                }
                jSONObject.put("velocity", (Object) Integer.valueOf(i));
                a2.postEvent(new ljz("dragShow", jSONObject));
            }
        }
    }
}
