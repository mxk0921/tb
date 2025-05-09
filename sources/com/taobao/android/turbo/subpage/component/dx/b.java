package com.taobao.android.turbo.subpage.component.dx;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import com.taobao.android.turbo.subpage.component.dx.TheaterCardAnimAbility;
import tb.c8;
import tb.k8;
import tb.m8;
import tb.n8;
import tb.pg1;
import tb.t2o;
import tb.tk6;
import tb.u8;
import tb.w8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long THEATERCARDANIMSTART = 8660710342251325710L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455766);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public b build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e6ce0ecd", new Object[]{this, obj});
            }
            return new b();
        }
    }

    static {
        t2o.a(916455765);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/subpage/component/dx/TheaterCardAnimStartAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        TheaterCardAnimAbility.CardAnimDecoration cardAnimDecoration;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        try {
            DXRootView o = ((tk6) k8Var).o();
            String i2 = n8Var.i("listId");
            boolean booleanValue = n8Var.c(pg1.ATOM_EXT_reverse).booleanValue();
            DXRecyclerView dXRecyclerView = (DXRecyclerView) DxVideoControlHelper.r(o.getFlattenWidgetNode().queryWidgetNodeByUserId(i2).getWRView().get(), DXRecyclerView.class);
            while (true) {
                if (i >= 3) {
                    cardAnimDecoration = null;
                    break;
                }
                RecyclerView.ItemDecoration itemDecorationAt = dXRecyclerView.getItemDecorationAt(i);
                if (itemDecorationAt instanceof TheaterCardAnimAbility.CardAnimDecoration) {
                    cardAnimDecoration = (TheaterCardAnimAbility.CardAnimDecoration) itemDecorationAt;
                    break;
                }
                i++;
            }
            if (cardAnimDecoration != null) {
                cardAnimDecoration.a(booleanValue);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }
}
