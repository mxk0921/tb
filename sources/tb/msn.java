package tb;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.core.util.Pools;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.BaseItemViewHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class msn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<Pools.SimplePool<BaseItemViewHolder>> f24276a = new SparseArray<>();

    static {
        t2o.a(295698700);
    }

    public BaseItemViewHolder a(fzf fzfVar, ViewGroup viewGroup, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseItemViewHolder) ipChange.ipc$dispatch("2b71f925", new Object[]{this, fzfVar, viewGroup, ux9Var});
        }
        int b = epf.b(fzfVar);
        Pools.SimplePool<BaseItemViewHolder> simplePool = this.f24276a.get(b);
        if (simplePool == null) {
            simplePool = new Pools.SimplePool<>(5);
            this.f24276a.put(b, simplePool);
        }
        BaseItemViewHolder acquire = simplePool.acquire();
        if (acquire == null) {
            return epf.a(viewGroup, b, ux9Var);
        }
        return acquire;
    }

    public void b(BaseItemViewHolder baseItemViewHolder, fzf fzfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c8d804b", new Object[]{this, baseItemViewHolder, fzfVar});
        } else if (baseItemViewHolder != null) {
            int b = epf.b(fzfVar);
            Pools.SimplePool<BaseItemViewHolder> simplePool = this.f24276a.get(b);
            if (simplePool == null) {
                simplePool = new Pools.SimplePool<>(5);
                this.f24276a.put(b, simplePool);
            }
            try {
                simplePool.release(baseItemViewHolder);
            } catch (Exception e) {
                o3s.b("RecyclerPool", fkx.i(e));
            }
        }
    }
}
