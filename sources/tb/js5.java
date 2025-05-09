package tb;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class js5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLVINSERTBELOW = 7544413833213664309L;

    static {
        t2o.a(310378536);
    }

    public static /* synthetic */ Object ipc$super(js5 js5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/DXDataParserTblvInsertBelow");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DXRecyclerLayout dXRecyclerLayout;
        RecyclerView j0;
        List<Object> x;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        int i2 = -1;
        if (dXRuntimeContext == null || objArr == null) {
            return -1;
        }
        Object obj = objArr[0];
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            String string = jSONObject.getString("recyclerUserId");
            int parseInt = Integer.parseInt(jSONObject.getString("currentCardIndex"));
            if (dXRuntimeContext.L() == null || dXRuntimeContext.L().getExpandWidgetNode() == null) {
                return -1;
            }
            DXWidgetNode queryWidgetNodeByUserId = dXRuntimeContext.L().getExpandWidgetNode().queryWidgetNodeByUserId(string);
            if ((queryWidgetNodeByUserId instanceof DXRecyclerLayout) && (j0 = (dXRecyclerLayout = (DXRecyclerLayout) queryWidgetNodeByUserId).j0()) != null && j0.getScrollState() == 0 && (j0.getLayoutManager() instanceof StaggeredGridLayoutManager) && (x = dXRecyclerLayout.x()) != null && x.size() > 0 && (findViewHolderForAdapterPosition = j0.findViewHolderForAdapterPosition(parseInt)) != null && (findViewHolderForAdapterPosition.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams)) {
                int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) findViewHolderForAdapterPosition.itemView.getLayoutParams()).getSpanIndex();
                if (dXRecyclerLayout.x() != null && dXRecyclerLayout.x().size() > 3 + parseInt) {
                    int i3 = spanIndex % 2;
                    if (i3 == 0) {
                        i = parseInt + 1;
                        while (i < parseInt + 4) {
                            RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = j0.findViewHolderForAdapterPosition(i);
                            if (findViewHolderForAdapterPosition2 != null && (findViewHolderForAdapterPosition2.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) && ((StaggeredGridLayoutManager.LayoutParams) findViewHolderForAdapterPosition2.itemView.getLayoutParams()).getSpanIndex() % 2 == 0) {
                                i2 = i - parseInt;
                                break;
                            }
                            i++;
                        }
                    } else if (i3 == 1) {
                        i = parseInt + 1;
                        while (i < parseInt + 4) {
                            RecyclerView.ViewHolder findViewHolderForAdapterPosition3 = j0.findViewHolderForAdapterPosition(i);
                            if (findViewHolderForAdapterPosition3 != null && (findViewHolderForAdapterPosition3.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) && ((StaggeredGridLayoutManager.LayoutParams) findViewHolderForAdapterPosition3.itemView.getLayoutParams()).getSpanIndex() % 2 == 1) {
                                i2 = i - parseInt;
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return Integer.valueOf(i2);
    }
}
