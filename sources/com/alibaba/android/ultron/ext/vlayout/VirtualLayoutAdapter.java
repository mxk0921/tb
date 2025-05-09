package com.alibaba.android.ultron.ext.vlayout;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class VirtualLayoutAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final VirtualLayoutManager f2289a;

    static {
        t2o.a(156237960);
    }

    public VirtualLayoutAdapter(VirtualLayoutManager virtualLayoutManager) {
        this.f2289a = virtualLayoutManager;
    }

    public static /* synthetic */ Object ipc$super(VirtualLayoutAdapter virtualLayoutAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/VirtualLayoutAdapter");
    }

    public List<a> M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("efcada7b", new Object[]{this});
        }
        return this.f2289a.n0();
    }

    public void N(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57412fb1", new Object[]{this, list});
        } else {
            this.f2289a.w0(list);
        }
    }
}
