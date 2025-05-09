package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.goods.list.IDMComponentsFrameLayout;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ge0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long CART_ANIM_DURATION = 500;

    static {
        t2o.a(295699013);
    }

    public static DXWidgetNode b(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("ff68b181", new Object[]{recyclerView, str});
        }
        if (recyclerView != null && !TextUtils.isEmpty(str)) {
            try {
                int childCount = recyclerView.getLayoutManager().getChildCount();
                for (int i = 0; i < childCount; i++) {
                    DXWidgetNode d = d(recyclerView.getLayoutManager().getChildAt(i), str);
                    if (d != null) {
                        return d;
                    }
                }
            } catch (Exception e) {
                hha.b("AddCartAnimHelper", "findNodeByUserId | e=" + e.getMessage());
            }
        }
        return null;
    }

    public static DXWidgetNode c(DXRootView dXRootView, String str) {
        DXWidgetNode queryWidgetNodeByUserId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("d3d1e0c2", new Object[]{dXRootView, str});
        }
        if (dXRootView == null || TextUtils.isEmpty(str) || (queryWidgetNodeByUserId = dXRootView.getExpandWidgetNode().queryWidgetNodeByUserId(str)) == null) {
            return null;
        }
        hha.c("AddCartAnimHelper", "findNodeByUserIdInDX | userId=" + str + "   dxRootView=" + dXRootView.getDxTemplateItem());
        return queryWidgetNodeByUserId;
    }

    public static DXWidgetNode d(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("9bad41d2", new Object[]{view, str});
        }
        if (view instanceof DXRootView) {
            return c((DXRootView) view, str);
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() <= 0) {
            return null;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            DXWidgetNode d = d(viewGroup.getChildAt(i), str);
            if (d != null) {
                return d;
            }
        }
        return null;
    }

    public static void a(xea xeaVar, String str, ViewGroup viewGroup, View view, View view2, View view3) {
        JSONObject jSONObject;
        View inflate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd6b14c", new Object[]{xeaVar, str, viewGroup, view, view2, view3});
        } else if (xeaVar == null || viewGroup == null || view == null || view2 == null || TextUtils.isEmpty(str)) {
            hha.b("AddCartAnimHelper", "addCartAnim | params empty.");
        } else if (xeaVar.i() instanceof Activity) {
            String t = pfa.t(xeaVar.i());
            String simpleName = ((Activity) xeaVar.i()).getClass().getSimpleName();
            if (!TextUtils.isEmpty(t) && !TextUtils.isEmpty(simpleName)) {
                if (t == null || t.contains(simpleName)) {
                    th5 x = xeaVar.x(str);
                    if (x == null || (jSONObject = x.b) == null) {
                        hha.b("AddCartAnimHelper", "not have item.");
                        return;
                    }
                    String string = jSONObject.getString("itemPic");
                    if (!TextUtils.isEmpty(string) && (inflate = LayoutInflater.from(xeaVar.i()).inflate(R.layout.taolive_goods_cart_item_anim_view_flexalocal, (ViewGroup) null)) != null) {
                        int c = w2s.c(xeaVar.i(), 30.0f);
                        viewGroup.addView(inflate, new FrameLayout.LayoutParams(c, c));
                        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.taolive_goods_view_cart_anim_view);
                        if (tUrlImageView != null) {
                            tUrlImageView.setVisibility(0);
                            tUrlImageView.setImageUrl(string);
                            awp.a(inflate, view, view2, view3, 500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                hha.b("AddCartAnimHelper", "onAddCart | currentTop=" + t + " curr=" + simpleName);
            }
        }
    }

    public static View e(String str, p3a p3aVar, xea xeaVar) {
        SingleTabBaseView singleTabBaseView;
        List<IDMComponent> components;
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("32e643ab", new Object[]{str, p3aVar, xeaVar});
        }
        if (!(TextUtils.isEmpty(str) || p3aVar == null || xeaVar == null)) {
            if (p3aVar.g() == null || p3aVar.g().stateMultiTabView == null) {
                singleTabBaseView = null;
            } else {
                List<SingleTabBaseView> liveStateViewList = p3aVar.g().stateMultiTabView.getLiveStateViewList();
                if (liveStateViewList != null && !liveStateViewList.isEmpty()) {
                    singleTabBaseView = liveStateViewList.get(0);
                    int i = 0;
                    while (true) {
                        if (i >= liveStateViewList.size()) {
                            break;
                        }
                        SingleTabBaseView singleTabBaseView2 = liveStateViewList.get(i);
                        if (!(singleTabBaseView2 == null || singleTabBaseView2.getItemCategory() == null || !TextUtils.equals(singleTabBaseView2.getItemCategory().categoryId, xeaVar.J))) {
                            singleTabBaseView = singleTabBaseView2;
                            break;
                        }
                        i++;
                    }
                } else {
                    return null;
                }
            }
            if (!(singleTabBaseView == null || singleTabBaseView.getRecyclerView() == null || singleTabBaseView.getRecyclerView().getLayoutManager() == null)) {
                RecyclerView.LayoutManager layoutManager = singleTabBaseView.getRecyclerView().getLayoutManager();
                for (int i2 = 0; i2 < layoutManager.getChildCount(); i2++) {
                    View childAt = singleTabBaseView.getRecyclerView().getLayoutManager().getChildAt(i2);
                    if ((childAt instanceof IDMComponentsFrameLayout) && (components = ((IDMComponentsFrameLayout) childAt).getComponents()) != null && !components.isEmpty() && (data = components.get(0).getData()) != null && TextUtils.equals(str, uga.d(data))) {
                        hha.b("AddCartAnimHelper", "onAddCart | find targetView, pos=" + i2);
                        return childAt;
                    }
                }
            }
        }
        return null;
    }
}
