package com.taobao.android.detail2.core.framework.base.dinamicx;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NewDetailDinamicXAdapter extends RecyclerView.Adapter<NewDetailDinamicXViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class NewDetailDinamicXViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final DXTemplateItem f7089a;

        static {
            t2o.a(352321620);
        }

        public NewDetailDinamicXViewHolder(View view, DXTemplateItem dXTemplateItem) {
            super(view);
            this.f7089a = dXTemplateItem;
        }
    }

    static {
        t2o.a(352321618);
    }

    public static /* synthetic */ Object ipc$super(NewDetailDinamicXAdapter newDetailDinamicXAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/base/dinamicx/NewDetailDinamicXAdapter");
    }

    /* renamed from: M */
    public void onBindViewHolder(NewDetailDinamicXViewHolder newDetailDinamicXViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23b1724", new Object[]{this, newDetailDinamicXViewHolder, new Integer(i)});
        } else if (newDetailDinamicXViewHolder.f7089a != null) {
            DXRootView dXRootView = (DXRootView) newDetailDinamicXViewHolder.itemView;
            throw null;
        }
    }

    /* renamed from: N */
    public NewDetailDinamicXViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NewDetailDinamicXViewHolder) ipChange.ipc$dispatch("ccf40bb0", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (i == -1) {
            return new NewDetailDinamicXViewHolder(new View(null), null);
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        throw null;
    }
}
