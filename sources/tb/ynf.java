package tb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ynf extends py {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729810085);
    }

    public ynf(String str, String str2) {
        super(str, str2);
    }

    public static /* synthetic */ Object ipc$super(ynf ynfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend4/stay/ItemExposeCalculator");
    }

    @Override // tb.py
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72054be7", new Object[]{this});
        }
        return "itemExpose";
    }

    @Override // tb.py
    public boolean l(ChildRecyclerView childRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aabbc0d9", new Object[]{this, childRecyclerView, new Integer(i)})).booleanValue();
        }
        if (o(childRecyclerView, i) || o(childRecyclerView, i + 1)) {
            return true;
        }
        return false;
    }

    public final boolean o(RecyclerView recyclerView, int i) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("993e4a5", new Object[]{this, recyclerView, new Integer(i)})).booleanValue();
        }
        if (recyclerView == null) {
            return false;
        }
        int f = f(recyclerView);
        if (f <= 0) {
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "ItemExposeCalculator", "containerVisibility <= 0, posExpose=false");
            return false;
        } else if (g(recyclerView) > i) {
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "ItemExposeCalculator", "firstVisible > anchorPos, posExpose=true");
            return true;
        } else {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            if (findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.itemView) == null) {
                uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "ItemExposeCalculator", "anchorView is null, posExpose=false");
                return false;
            }
            int measuredHeight = view.getMeasuredHeight();
            if (findViewHolderForAdapterPosition.itemView.getTop() > f || f - findViewHolderForAdapterPosition.itemView.getTop() <= measuredHeight / 2) {
                uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "ItemExposeCalculator", "anchorView is not expose, posExpose=false");
                return false;
            }
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "ItemExposeCalculator", "anchorView is expose, posExpose=true");
            return true;
        }
    }
}
