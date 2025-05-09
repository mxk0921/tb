package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface wlb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements wlb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468713935);
            t2o.a(468713934);
        }

        @Override // tb.wlb
        public void onActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.wlb
        public void onAppear(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.wlb
        public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
            }
        }

        @Override // tb.wlb
        public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
            }
        }

        @Override // tb.wlb
        public void onDisActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.wlb
        public void onDisAppear(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.wlb
        public void onRecycle(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.wlb
        public void onWillActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f263d10f", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.wlb
        public void onWillDisActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9290cf3b", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.wlb
        public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, List list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2231971b", new Object[]{this, uq9Var, aVar, new Integer(i), list});
            }
        }
    }

    void onActive(uq9 uq9Var);

    void onAppear(uq9 uq9Var);

    void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i);

    void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, List<Object> list);

    void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder);

    void onDisActive(uq9 uq9Var);

    void onDisAppear(uq9 uq9Var);

    void onRecycle(uq9 uq9Var);

    void onWillActive(uq9 uq9Var);

    void onWillDisActive(uq9 uq9Var);
}
