package com.taobao.live.home.dinamic.view;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.LiveHomeController;
import com.taobao.live.home.base.BaseViewHolder;
import com.taobao.live.home.base.RecyclerArrayAdapter;
import com.taobao.live.home.dinamic.model.DinamicDataObject;
import com.taobao.live.home.dinamic.model.TemplateObject;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Collection;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.e2h;
import tb.eqd;
import tb.orq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LiveRecyclerAdapter extends RecyclerArrayAdapter<IMTOPDataObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final eqd j;

    static {
        t2o.a(806355455);
    }

    public LiveRecyclerAdapter(Context context, eqd eqdVar) {
        super(context);
        this.j = eqdVar;
    }

    public static /* synthetic */ Object ipc$super(LiveRecyclerAdapter liveRecyclerAdapter, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -584646016) {
            super.M((BaseViewHolder) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 1995301502) {
            super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/live/home/dinamic/view/LiveRecyclerAdapter");
        }
    }

    @Override // com.taobao.live.home.base.RecyclerArrayAdapter
    public void M(BaseViewHolder baseViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd270280", new Object[]{this, baseViewHolder, new Integer(i)});
            return;
        }
        super.M(baseViewHolder, i);
        if (e2h.i()) {
            IMTOPDataObject item = getItem(i);
            if (item instanceof DinamicDataObject) {
                DinamicDataObject dinamicDataObject = (DinamicDataObject) item;
                if (!(orq.a(dinamicDataObject.templateName) || dinamicDataObject.data == null || LiveHomeController.instance().getDinamicSdkManager() == null)) {
                    LiveHomeController.instance().getDinamicSdkManager().prefetchTemplate(T(), dinamicDataObject.templateName, dinamicDataObject);
                }
            }
        }
        ((LiveListViewHolder) baseViewHolder).f0(getItem(i), i);
    }

    @Override // com.taobao.live.home.base.RecyclerArrayAdapter
    public BaseViewHolder N(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseViewHolder) ipChange.ipc$dispatch("7d34ccd4", new Object[]{this, viewGroup, new Integer(i)});
        }
        LiveListViewHolder liveListViewHolder = new LiveListViewHolder(T(), viewGroup, R.layout.live_dinamic_card_container);
        liveListViewHolder.n0(this.j);
        return liveListViewHolder;
    }

    @Override // com.taobao.live.home.base.RecyclerArrayAdapter
    public int Y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5912f7a", new Object[]{this, new Integer(i)})).intValue();
        }
        Collection collection = this.f10940a;
        if (collection != null) {
            IMTOPDataObject iMTOPDataObject = (IMTOPDataObject) ((ArrayList) collection).get(i);
            if (iMTOPDataObject instanceof DinamicDataObject) {
                DinamicDataObject dinamicDataObject = (DinamicDataObject) iMTOPDataObject;
                if (dinamicDataObject.templateName != null) {
                    TemplateObject template = LiveHomeController.instance().getTemplate(dinamicDataObject.templateName);
                    if (template != null) {
                        return template.hashCode();
                    }
                    return dinamicDataObject.templateName.hashCode();
                }
            }
        }
        return 0;
    }

    /* renamed from: l0 */
    public void onViewAttachedToWindow(BaseViewHolder baseViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a01af09", new Object[]{this, baseViewHolder});
            return;
        }
        super.onViewAttachedToWindow(baseViewHolder);
        RecyclerView recyclerView = this.e;
        if (recyclerView != null && (baseViewHolder instanceof LiveListViewHolder) && recyclerView.getScrollState() == 0) {
            LiveListViewHolder liveListViewHolder = (LiveListViewHolder) baseViewHolder;
            liveListViewHolder.o0();
            liveListViewHolder.m0();
        }
    }
}
