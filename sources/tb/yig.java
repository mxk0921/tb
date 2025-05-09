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
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yig implements rjc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public VirtualLayoutManager f32114a;
    public RecyclerViewWaterfallAdapter b;
    public ViewEngine c;
    public af5 d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends wv {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewEngine f32115a;

        public a(ViewEngine viewEngine) {
            this.f32115a = viewEngine;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/LayoutExtend$1");
        }

        @Override // tb.wv
        public void a(RecyclerView.LayoutManager layoutManager, Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d965c85", new Object[]{this, layoutManager, exc});
            } else {
                yig.f(yig.this, layoutManager, exc, this.f32115a);
            }
        }
    }

    static {
        t2o.a(156237825);
        t2o.a(157286672);
    }

    public static /* synthetic */ void f(yig yigVar, RecyclerView.LayoutManager layoutManager, Exception exc, ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b34e46", new Object[]{yigVar, layoutManager, exc, viewEngine});
        } else {
            yigVar.g(layoutManager, exc, viewEngine);
        }
    }

    @Override // tb.rjc
    public RecyclerViewAdapter a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewAdapter) ipChange.ipc$dispatch("b1214140", new Object[]{this});
        }
        return this.b;
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
    public void c(ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab67ab1", new Object[]{this, viewEngine});
            return;
        }
        this.c = viewEngine;
        this.d = new af5();
        if (this.f32114a == null) {
            VirtualLayoutManager virtualLayoutManager = new VirtualLayoutManager(viewEngine.K());
            this.f32114a = virtualLayoutManager;
            virtualLayoutManager.Z(new a(viewEngine));
        }
        if (this.b == null) {
            this.b = new RecyclerViewWaterfallAdapter(this.c, this.f32114a);
        }
    }

    @Override // tb.rjc
    public void d(et6 et6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4362f9a0", new Object[]{this, et6Var});
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.b.P(jjg.h(this.c.K(), et6Var.d().getRootComponent(), arrayList, this.d));
        this.b.setData(arrayList);
    }

    @Override // tb.rjc
    public RecyclerView.LayoutManager e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.LayoutManager) ipChange.ipc$dispatch("1077ec7c", new Object[]{this, context});
        }
        return this.f32114a;
    }

    public final void g(RecyclerView.LayoutManager layoutManager, Exception exc, ViewEngine viewEngine) {
        String str;
        String message;
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
        }
        UMLinkLogInterface a2 = hdv.a();
        if (exc == null) {
            message = "";
        } else {
            message = exc.getMessage();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemCount", String.valueOf(itemCount));
        hashMap.put("childCount", String.valueOf(childCount));
        a2.logError("AURAMonitor", str, VirtualLayoutManager.TAG, null, "VirtualLayoutManagerException", message, new HashMap(), cyu.b(hashMap));
        a2.commitFailure(VirtualLayoutManager.TAG, "AURAMonitor", "1.0", "AURAMonitor", str, hashMap, "VirtualLayoutManagerException", message);
        UnifyLog.e("UltronLayoutExtend", "bizName=" + str + ",message=" + message);
    }
}
