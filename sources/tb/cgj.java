package tb;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.ext.adapter.RecyclerViewWaterfallAdapter;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.mytaobao.ultron.MTBLayoutManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class cgj implements rjc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public VirtualLayoutManager f17046a;
    public RecyclerViewWaterfallAdapter b;
    public ViewEngine c;
    public af5 d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a extends wv {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ViewEngine b;

        public a(ViewEngine viewEngine) {
            this.b = viewEngine;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/MyTBLayoutExtendV1$init$1");
        }

        @Override // tb.wv
        public void a(RecyclerView.LayoutManager layoutManager, Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d965c85", new Object[]{this, layoutManager, exc});
                return;
            }
            ckf.h(layoutManager, "layoutManager");
            cgj.f(cgj.this, layoutManager, exc, this.b);
        }
    }

    static {
        t2o.a(745538080);
        t2o.a(157286672);
    }

    public static final /* synthetic */ void f(cgj cgjVar, RecyclerView.LayoutManager layoutManager, Exception exc, ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b735ad5", new Object[]{cgjVar, layoutManager, exc, viewEngine});
        } else {
            cgjVar.g(layoutManager, exc, viewEngine);
        }
    }

    @Override // tb.rjc
    public RecyclerViewAdapter a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewAdapter) ipChange.ipc$dispatch("b1214140", new Object[]{this});
        }
        RecyclerViewWaterfallAdapter recyclerViewWaterfallAdapter = this.b;
        if (recyclerViewWaterfallAdapter != null) {
            return recyclerViewWaterfallAdapter;
        }
        ckf.s();
        throw null;
    }

    @Override // tb.rjc
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6484ad", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.rjc
    public void d(et6 et6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4362f9a0", new Object[]{this, et6Var});
            return;
        }
        ckf.h(et6Var, c4o.KEY_DATA_SOURCE);
        if (MtbGlobalEnv.x() || !com.taobao.mytaobao.basement.a.d()) {
            ArrayList arrayList = new ArrayList();
            IDMComponent rootComponent = et6Var.d().getRootComponent();
            ViewEngine viewEngine = this.c;
            if (viewEngine != null) {
                List<com.alibaba.android.ultron.ext.vlayout.a> h = jjg.h(viewEngine.K(), rootComponent, arrayList, this.d);
                RecyclerViewWaterfallAdapter recyclerViewWaterfallAdapter = this.b;
                if (recyclerViewWaterfallAdapter != null) {
                    recyclerViewWaterfallAdapter.P(h);
                    RecyclerViewWaterfallAdapter recyclerViewWaterfallAdapter2 = this.b;
                    if (recyclerViewWaterfallAdapter2 != null) {
                        recyclerViewWaterfallAdapter2.setData(arrayList);
                    } else {
                        ckf.s();
                        throw null;
                    }
                } else {
                    ckf.s();
                    throw null;
                }
            } else {
                ckf.s();
                throw null;
            }
        } else {
            RecyclerViewWaterfallAdapter recyclerViewWaterfallAdapter3 = this.b;
            if (recyclerViewWaterfallAdapter3 != null) {
                recyclerViewWaterfallAdapter3.setData(et6Var.c());
            } else {
                ckf.s();
                throw null;
            }
        }
    }

    @Override // tb.rjc
    public RecyclerView.LayoutManager e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.LayoutManager) ipChange.ipc$dispatch("1077ec7c", new Object[]{this, context});
        }
        VirtualLayoutManager virtualLayoutManager = this.f17046a;
        if (virtualLayoutManager != null) {
            return virtualLayoutManager;
        }
        ckf.s();
        throw null;
    }

    public final void g(RecyclerView.LayoutManager layoutManager, Exception exc, ViewEngine viewEngine) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b459b32a", new Object[]{this, layoutManager, exc, viewEngine});
            return;
        }
        int itemCount = layoutManager.getItemCount();
        int childCount = layoutManager.getChildCount();
        if (viewEngine == null) {
            str = "none";
        } else {
            str = viewEngine.I();
            ckf.c(str, "viewEngine.getBizName()");
        }
        UMLinkLogInterface a2 = hdv.a();
        if (exc == null || (str2 = exc.getMessage()) == null) {
            str2 = "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemCount", String.valueOf(itemCount));
        hashMap.put("childCount", String.valueOf(childCount));
        a2.logError("AURAMonitor", str, VirtualLayoutManager.TAG, null, "VirtualLayoutManagerException", str2, new HashMap(), cyu.b(hashMap));
        a2.commitFailure(VirtualLayoutManager.TAG, "AURAMonitor", "1.0", "AURAMonitor", str, hashMap, "VirtualLayoutManagerException", str2);
        UnifyLog.e("UltronLayoutExtend", "bizName=" + str + ",message=" + str2);
    }

    @Override // tb.rjc
    public void c(ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab67ab1", new Object[]{this, viewEngine});
            return;
        }
        ckf.h(viewEngine, "viewEngine");
        this.c = viewEngine;
        this.d = new af5();
        if (this.f17046a == null) {
            Context K = viewEngine.K();
            ckf.c(K, "viewEngine.context");
            MTBLayoutManager mTBLayoutManager = new MTBLayoutManager(K, 1, false);
            this.f17046a = mTBLayoutManager;
            mTBLayoutManager.Z(new a(viewEngine));
        }
        if (this.b == null) {
            this.b = new RecyclerViewWaterfallAdapter(this.c, this.f17046a);
        }
    }
}
