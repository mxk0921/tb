package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.RecycleViewAdapter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rrn implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecycleViewAdapter f27570a;

    public rrn(RecycleViewAdapter recycleViewAdapter) {
        this.f27570a = recycleViewAdapter;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            eve.c("InfoFlowRVAdapter", "RV_notifyDataSetChanged01");
            this.f27570a.notifyDataSetChanged();
            eve.b("InfoFlowRVAdapter", "RV_notifyDataSetChanged01");
        } catch (Exception e) {
            fve.e("InfoFlowRVAdapter", e.getMessage());
        }
    }
}
