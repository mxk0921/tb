package com.alibaba.android.ultron.ext.adapter;

import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.a;
import com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RecyclerViewWaterfallAdapter extends RecyclerViewAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final VirtualLayoutManager d;

    static {
        t2o.a(156237827);
        t2o.a(157286553);
    }

    public RecyclerViewWaterfallAdapter(ViewEngine viewEngine, VirtualLayoutManager virtualLayoutManager) {
        super(viewEngine);
        this.d = virtualLayoutManager;
    }

    public static /* synthetic */ Object ipc$super(RecyclerViewWaterfallAdapter recyclerViewWaterfallAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/adapter/RecyclerViewWaterfallAdapter");
    }

    public void P(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57412fb1", new Object[]{this, list});
        } else {
            this.d.w0(list);
        }
    }
}
