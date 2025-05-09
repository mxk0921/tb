package tb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.weex.weexv2.page.WeexV2Activity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pof extends py {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729810086);
    }

    public pof(String str, String str2) {
        super(str, str2);
    }

    public static /* synthetic */ Object ipc$super(pof pofVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend4/stay/ItemOnTopCalculator");
    }

    @Override // tb.py
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72054be7", new Object[]{this});
        }
        return "itemOnTop";
    }

    @Override // tb.py
    public boolean l(ChildRecyclerView childRecyclerView, int i) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aabbc0d9", new Object[]{this, childRecyclerView, new Integer(i)})).booleanValue();
        }
        int g = g(childRecyclerView);
        uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "ItemOnTopCalculator", "firstPos:" + g + ", anchorPos:" + i);
        if (g < i) {
            return false;
        }
        if (i != 0 || g > i) {
            return true;
        }
        int f = f(childRecyclerView) + childRecyclerView.getTop();
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = childRecyclerView.findViewHolderForAdapterPosition(i);
        if (!(findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.itemView) == null)) {
            f += view.getPaddingTop();
        }
        int measuredHeight = childRecyclerView.getMeasuredHeight();
        uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "ItemOnTopCalculator", "containerVisibility=" + f + ", containerHeight=" + measuredHeight);
        return (!(childRecyclerView.getContext() instanceof WeexV2Activity) || !z4a.REC_PAY_SUCCESS.f32522a.equals(this.c)) ? f >= childRecyclerView.getMeasuredHeight() : f + 50 >= childRecyclerView.getMeasuredHeight();
    }
}
