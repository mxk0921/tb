package com.taobao.android.detail2.core.biz.superitemcard.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.biz.detailcard.viewholder.ItemCardViewHolder;
import com.taobao.android.detail2.core.framework.base.widget.RoundRectCardRoot;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;
import com.taobao.taobao.R;
import tb.cxj;
import tb.dh7;
import tb.gxq;
import tb.o2r;
import tb.pnm;
import tb.t2o;
import tb.txj;
import tb.y9e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SuperItemViewHolder extends ItemCardViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final y9e H = new a();
    public static final String VIEWHOLDER_KEY = "superItem";

    static {
        t2o.a(352321569);
    }

    public SuperItemViewHolder(View view, ViewGroup viewGroup, dh7 dh7Var, cxj cxjVar, pnm.d dVar) {
        super(view, viewGroup, dh7Var, cxjVar, dVar);
    }

    public static /* synthetic */ Object ipc$super(SuperItemViewHolder superItemViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/biz/superitemcard/viewholder/SuperItemViewHolder");
    }

    @Override // com.taobao.android.detail2.core.biz.detailcard.viewholder.ItemCardViewHolder
    public void W3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606e60ec", new Object[]{this});
        } else {
            this.r.setImageDrawable(gxq.c(this.d));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements y9e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public VerticalAbsViewHolder a(ViewGroup viewGroup, dh7 dh7Var, cxj cxjVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VerticalAbsViewHolder) ipChange.ipc$dispatch("7d87e1ae", new Object[]{this, viewGroup, dh7Var, cxjVar});
            }
            o2r.a("SuperItemViewHolder_inflate");
            pnm.d b = pnm.a().b();
            if (b == null || b.b() == null || !cxjVar.j().M().c(cxjVar.j().R().x)) {
                txj.e(txj.TAG_RENDER, "SuperItemViewHolder create");
                RoundRectCardRoot roundRectCardRoot = (RoundRectCardRoot) LayoutInflater.from(cxjVar.i()).inflate(R.layout.detail_half_screen_layout, viewGroup, false).findViewById(R.id.half_screen_round_root);
                SuperItemViewHolder superItemViewHolder = new SuperItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detail_card_layout, (ViewGroup) roundRectCardRoot, true), roundRectCardRoot, dh7Var, cxjVar, null);
                o2r.b();
                return superItemViewHolder;
            }
            txj.e(txj.TAG_RENDER, "SuperItemViewHolder async create");
            synchronized (b.b()) {
                try {
                    if (b.a() == null) {
                        b.b().wait(1000L);
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    txj.e(txj.TAG_RENDER, "主线程被中断");
                }
            }
            b.d(cxjVar.i());
            txj.e(txj.TAG_RENDER, "SuperItemViewHolder 更新上下文");
            SuperItemViewHolder superItemViewHolder2 = new SuperItemViewHolder(b.a(), (ViewGroup) b.a(), dh7Var, cxjVar, b);
            o2r.b();
            return superItemViewHolder2;
        }
    }
}
