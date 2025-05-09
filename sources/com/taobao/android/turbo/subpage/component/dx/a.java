package com.taobao.android.turbo.subpage.component.dx;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import com.taobao.android.turbo.subpage.component.dx.TheaterCardAnimAbility;
import tb.c8;
import tb.k8;
import tb.m8;
import tb.n8;
import tb.t2o;
import tb.tk6;
import tb.u8;
import tb.w8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long THEATERCARDANIMCLEAR = 8659435706102106087L;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.turbo.subpage.component.dx.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class C0507a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455764);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public a build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b339e5b8", new Object[]{this, obj});
            }
            return new a();
        }
    }

    static {
        t2o.a(916455763);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/subpage/component/dx/TheaterCardAnimClearAbility");
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
            DXRecyclerView dXRecyclerView = (DXRecyclerView) DxVideoControlHelper.r(((tk6) k8Var).o().getFlattenWidgetNode().queryWidgetNodeByUserId(n8Var.i("listId")).getWRView().get(), DXRecyclerView.class);
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
                dXRecyclerView.removeItemDecoration(cardAnimDecoration);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }
}
