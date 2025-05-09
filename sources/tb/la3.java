package tb;

import android.content.Context;
import android.os.MessageQueue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.TBMainHost;
import java.util.Objects;
import tb.ub3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class la3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f23203a = 0;
    public static String b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23204a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ String c;

        public a(Context context, JSONObject jSONObject, String str) {
            this.f23204a = context;
            this.b = jSONObject;
            this.c = str;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("context", (Object) this.f23204a);
                JSONObject jSONObject2 = this.b;
                if (jSONObject2 != null) {
                    jSONObject.putAll(jSONObject2);
                }
                qbv.j().a(this.c, "tabCart", jSONObject);
            } catch (Exception e) {
                ub3.g("notifyStageChangedException", e.getMessage());
            }
            return false;
        }
    }

    static {
        t2o.a(479199555);
    }

    public static void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc643f21", new Object[]{recyclerView});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            int childCount = recyclerView.getChildCount();
            if (childCount < 2) {
                f23203a = currentTimeMillis;
                return;
            }
            RecyclerView.ViewHolder findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(childCount - 2);
            if (!(findViewHolderForLayoutPosition instanceof RecyclerViewHolder)) {
                f23203a = currentTimeMillis;
                return;
            }
            IDMComponent b0 = ((RecyclerViewHolder) findViewHolderForLayoutPosition).b0();
            if (b0 == null) {
                f23203a = currentTimeMillis;
                return;
            }
            String key = b0.getKey();
            if (key == null) {
                f23203a = currentTimeMillis;
                return;
            }
            if (Objects.equals(b, key)) {
                h15 tag = ub3.a.a("loadMoreExposeTooFrequently").tag("加载下一页可能出错了");
                ub3.e(tag.message("两次上拉时间间隔：" + (currentTimeMillis - f23203a)).sampling(1.0f));
            }
            b = key;
            f23203a = currentTimeMillis;
        } catch (Throwable th) {
            f23203a = currentTimeMillis;
            throw th;
        }
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c0830c", new Object[]{context, str});
        } else {
            c(context, str, null);
        }
    }

    public static void c(Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc74964", new Object[]{context, str, jSONObject});
        } else if (context != null) {
            pav.g(new a(context, jSONObject, str));
        }
    }

    public static void d(kmb kmbVar, RecyclerView recyclerView, int i) {
        View childAt;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1612d5", new Object[]{kmbVar, recyclerView, new Integer(i)});
            return;
        }
        try {
            int childCount = recyclerView.getChildCount();
            if (childCount > 0 && (childAt = recyclerView.getChildAt(childCount - 1)) != null && childAt.getId() == i) {
                if (TBMainHost.b().getContext() == kmbVar.getContext()) {
                    z = true;
                }
                juv.d(kmbVar, "Page_ShoppingCart_LoadMore_Exposure", "isMain=" + z);
                ub3.d("loadMoreExposure", "加载更多曝光", true, 0.01f);
                a(recyclerView);
            }
        } catch (Exception e) {
            hav.a("reportEndLoadMoreExposureException", e.getMessage());
        }
    }
}
