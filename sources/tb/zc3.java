package tb;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.icart.core.ability.event.CartOpenPopEventAbility;
import com.alibaba.android.icart.core.view.ViewManager;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.TBMainHost;
import java.util.List;
import kotlin.jvm.JvmStatic;
import tb.ub3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class zc3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final zc3 INSTANCE = new zc3();

    static {
        t2o.a(478150891);
    }

    @JvmStatic
    public static final void b(Bundle bundle, f8e f8eVar) {
        zxb P;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9f1b7c", new Object[]{bundle, f8eVar});
        } else if (f8eVar != null) {
            try {
                kmb g = f8eVar.g();
                if (g != null && (P = g.d()) != null) {
                    String y = P.y();
                    if (bundle != null) {
                        bundle.putString("filterItem", y);
                        String z = P.z();
                        if (TextUtils.isEmpty(z)) {
                            String b = CartOpenPopEventAbility.Companion.b();
                            if (!TextUtils.isEmpty(b)) {
                                bundle.putString("nextRenderRoot", b);
                                bundle.putBoolean("isOpenStdPopEvent", true);
                            }
                        } else {
                            bundle.putString("nextRenderRoot", z);
                        }
                        TBMainHost b2 = TBMainHost.b();
                        ckf.f(b2, "TBMainHost.get()");
                        bundle.putBoolean("isMainTab", ckf.b(b2.getContext(), f8eVar.getActivity()));
                        bundle.putBoolean("isRecommendFlowVisible", f8eVar.e());
                        INSTANCE.c(f8eVar, bundle);
                    }
                }
            } catch (Throwable th) {
                xh8 c = xh8.a("Ultron").c("CartReCreateReporter");
                String message = th.getMessage();
                if (message == null) {
                    message = "出错了";
                }
                f9v.q(c.message(message));
            }
        }
    }

    @JvmStatic
    public static final void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50f98c0", new Object[]{bundle});
        } else if (bundle != null) {
            try {
                String string = bundle.getString("filterItem");
                if (string == null) {
                    string = "noFilter";
                }
                String string2 = bundle.getString("nextRenderRoot");
                if (string2 == null) {
                    string2 = "noRenderRoot";
                }
                String valueOf = String.valueOf(bundle.getBoolean("isOpenStdPopEvent"));
                String valueOf2 = String.valueOf(bundle.getBoolean("isMainTab", true));
                String valueOf3 = String.valueOf(bundle.getBoolean("isRecommendFlowVisible"));
                int i = bundle.getInt("scrollPosition", 0);
                int i2 = bundle.getInt("scrollItemPosition", 0);
                hav.g(c9x.CART_BIZ_NAME, "CartReCreateReporter", "onRestoreInstanceState#", "filterItem:" + string + ", nextRenderRoot:" + string2 + ", isStdPop:" + valueOf + ", isMainTab:" + valueOf2 + ", isRecommendFlowVisible:" + valueOf3 + ",position:" + i);
                h15 tag = ub3.a.a("recreateCartFragment").tag("重新创建购物车");
                StringBuilder sb = new StringBuilder("滚动到的位置:");
                sb.append(i);
                ub3.e(tag.message(sb.toString()).sampling(1.0f).dimension("d1", string).dimension("d2", string2).dimension("d3", valueOf).dimension("d4", valueOf3).dimension("d5", valueOf2).dimension("d6", scv.a()).dimension("d7", String.valueOf(i)).dimension("d8", String.valueOf(i2)));
                ub3.k(c9x.CART_BIZ_NAME, "scrollPositionWhenRecreate", (long) i, 0.5f);
                ub3.k(c9x.CART_BIZ_NAME, "scrollItemPositionWhenRecreate", (long) i2, 0.5f);
            } catch (Throwable th) {
                xh8 c = xh8.a("Ultron").c("CartReCreateReporter");
                String message = th.getMessage();
                if (message == null) {
                    message = "出错了";
                }
                f9v.q(c.message(message));
            }
        }
    }

    public final void c(f8e f8eVar, Bundle bundle) {
        ViewManager Z;
        ViewGroup o;
        IDMComponent b0;
        fsb c;
        List<IDMComponent> components;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9510c0c5", new Object[]{this, f8eVar, bundle});
            return;
        }
        kmb g = f8eVar.g();
        if (!(g == null || (Z = g.e()) == null || (o = Z.o()) == null || !(o instanceof RecyclerView))) {
            RecyclerView recyclerView = (RecyclerView) o;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                int findLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
                bundle.putInt("scrollPosition", findLastVisibleItemPosition);
                int i2 = 0;
                for (int childCount = recyclerView.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = o.getChildAt(childCount);
                    if (childAt instanceof DXRootView) {
                        DXTemplateItem dxTemplateItem = ((DXRootView) childAt).getDxTemplateItem();
                        if (tsq.x("icart_mix_item", dxTemplateItem != null ? dxTemplateItem.e() : null, true)) {
                            break;
                        }
                    }
                    i2++;
                }
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(findLastVisibleItemPosition - i2);
                if ((findViewHolderForAdapterPosition instanceof RecyclerViewHolder) && (b0 = ((RecyclerViewHolder) findViewHolderForAdapterPosition).b0()) != null) {
                    kmb g2 = f8eVar.g();
                    ckf.f(g2, "engine.cartPresenter");
                    zxb P = g2.d();
                    if (!(P == null || (c = P.c()) == null || (components = c.getComponents()) == null)) {
                        for (IDMComponent iDMComponent : components) {
                            ckf.f(iDMComponent, "component");
                            JSONObject containerInfo = iDMComponent.getContainerInfo();
                            if ("icart_mix_item".equals(containerInfo != null ? containerInfo.getString("name") : null)) {
                                i++;
                            }
                            String key = iDMComponent.getKey();
                            if (key != null && key.equals(b0.getKey())) {
                                break;
                            }
                        }
                        bundle.putInt("scrollItemPosition", i);
                    }
                }
            }
        }
    }
}
