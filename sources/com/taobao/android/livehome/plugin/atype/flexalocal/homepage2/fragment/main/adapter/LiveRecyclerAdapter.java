package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.DinamicDataObject;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.TemplateObject;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.BaseViewHolder;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.HomeMainListViewHolder;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Collection;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.b0h;
import tb.cmb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveRecyclerAdapter extends RecyclerArrayAdapter<IMTOPDataObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final b0h h;
    public final cmb i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseViewHolder f8831a;

        public a(BaseViewHolder baseViewHolder) {
            this.f8831a = baseViewHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if ((this.f8831a instanceof HomeMainListViewHolder) && LiveRecyclerAdapter.this.d.getScrollState() == 0) {
                ((HomeMainListViewHolder) this.f8831a).i0();
            }
        }
    }

    static {
        t2o.a(310378698);
    }

    public LiveRecyclerAdapter(Context context, b0h b0hVar, cmb cmbVar) {
        super(context);
        this.h = b0hVar;
        this.i = cmbVar;
    }

    public static /* synthetic */ Object ipc$super(LiveRecyclerAdapter liveRecyclerAdapter, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1152469069) {
            super.M((BaseViewHolder) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 1995301502) {
            super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/adapter/LiveRecyclerAdapter");
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.adapter.RecyclerArrayAdapter
    public void M(BaseViewHolder baseViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb4eb7b3", new Object[]{this, baseViewHolder, new Integer(i)});
            return;
        }
        r0(baseViewHolder, i, 2);
        super.M(baseViewHolder, i);
        ((HomeMainListViewHolder) baseViewHolder).e0(getItem(i), i);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.adapter.RecyclerArrayAdapter
    public BaseViewHolder N(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseViewHolder) ipChange.ipc$dispatch("f7a74f45", new Object[]{this, viewGroup, new Integer(i)});
        }
        HomeMainListViewHolder homeMainListViewHolder = new HomeMainListViewHolder(U(), viewGroup, R.layout.live_dx_main_container_flexalocal, this.h);
        homeMainListViewHolder.h0(this.i);
        return homeMainListViewHolder;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.adapter.RecyclerArrayAdapter
    public int Y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5912f7a", new Object[]{this, new Integer(i)})).intValue();
        }
        Collection collection = this.f8832a;
        if (collection != null) {
            IMTOPDataObject iMTOPDataObject = (IMTOPDataObject) ((ArrayList) collection).get(i);
            if (iMTOPDataObject instanceof DinamicDataObject) {
                DinamicDataObject dinamicDataObject = (DinamicDataObject) iMTOPDataObject;
                if (dinamicDataObject.templateName != null) {
                    TemplateObject template = this.h.q().getTemplate(dinamicDataObject.templateName);
                    if (template != null) {
                        return template.hashCode();
                    }
                    return dinamicDataObject.templateName.hashCode();
                }
            }
        }
        return 0;
    }

    public void n0(int i, IMTOPDataObject iMTOPDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846d5f60", new Object[]{this, new Integer(i), iMTOPDataObject});
            return;
        }
        Collection collection = this.f8832a;
        if (collection != null) {
            ((ArrayList) collection).add(i, iMTOPDataObject);
            notifyItemInserted(i);
            q0(i);
        }
    }

    public final int o0(int i) {
        TemplateObject j;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4db89341", new Object[]{this, new Integer(i)})).intValue();
        }
        Collection collection = this.f8832a;
        if (collection != null && i >= 0 && i < ((ArrayList) collection).size()) {
            Object obj = ((ArrayList) this.f8832a).get(i);
            if (obj instanceof DinamicDataObject) {
                DinamicDataObject dinamicDataObject = (DinamicDataObject) obj;
                if (!TextUtils.isEmpty(dinamicDataObject.templateName) && this.h.q().getTemplateCardListOwner() != null && (j = this.h.q().getTemplateCardListOwner().j(dinamicDataObject.templateName)) != null && (i2 = j.span) > 0 && i2 <= 2) {
                    return i2;
                }
            }
        }
        return 2;
    }

    /* renamed from: p0 */
    public void onViewAttachedToWindow(BaseViewHolder baseViewHolder) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c79d06a", new Object[]{this, baseViewHolder});
            return;
        }
        super.onViewAttachedToWindow(baseViewHolder);
        if (baseViewHolder != null && (view = baseViewHolder.itemView) != null) {
            view.post(new a(baseViewHolder));
        }
    }

    public void q0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39bd23ef", new Object[]{this, new Integer(i)});
        } else if (this.f8832a != null) {
            while (true) {
                i++;
                if (i < ((ArrayList) this.f8832a).size()) {
                    Object obj = ((ArrayList) this.f8832a).get(i);
                    if (obj instanceof DinamicDataObject) {
                        DinamicDataObject dinamicDataObject = (DinamicDataObject) obj;
                        dinamicDataObject.mPosition++;
                        ((ArrayList) this.f8832a).set(i, dinamicDataObject);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void r0(BaseViewHolder baseViewHolder, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("522d5a1c", new Object[]{this, baseViewHolder, new Integer(i), new Integer(i2)});
            return;
        }
        int o0 = o0(i);
        ViewGroup.LayoutParams layoutParams = baseViewHolder.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
            if (o0 == i2) {
                layoutParams2.setFullSpan(true);
            } else {
                layoutParams2.setFullSpan(false);
            }
        }
    }
}
