package com.taobao.search.musie.pager;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.MUSView;
import tb.ckf;
import tb.t2o;
import tb.ywh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SlideViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MUSView f11592a;
    public ywh b;

    static {
        t2o.a(815792759);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlideViewHolder(View view) {
        super(view);
        ckf.g(view, "itemView");
        this.f11592a = (MUSView) view;
    }

    public static /* synthetic */ Object ipc$super(SlideViewHolder slideViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/pager/SlideViewHolder");
    }

    public final void b0(ywh ywhVar, MUSDKInstance mUSDKInstance) {
        MUSView n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35364bc8", new Object[]{this, ywhVar, mUSDKInstance});
            return;
        }
        ckf.g(ywhVar, "nodeTree");
        ckf.g(mUSDKInstance, "instance");
        this.f11592a.setRoot(false);
        this.f11592a.setInstance(mUSDKInstance);
        this.f11592a.setScrollObserverEnabled(false);
        if (!ckf.b(this.b, ywhVar) && (n = ywhVar.n()) != null) {
            n.release(true);
        }
        this.b = ywhVar;
        this.f11592a.setUiNodeTree(ywhVar);
    }

    public final void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e4fcd7", new Object[]{this});
            return;
        }
        ywh ywhVar = this.b;
        if (ywhVar != null && !ywhVar.q().isMounted()) {
            this.f11592a.release(true);
            this.f11592a.setUiNodeTree(ywhVar);
        }
    }

    public final void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f51baa", new Object[]{this});
        } else {
            c0();
        }
    }
}
