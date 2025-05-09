package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.taobao.TBActionBar;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.TBOrderDetailActivity;
import com.taobao.android.order.bundle.TBOrderListActivity;
import com.taobao.android.order.bundle.TBOrderListFragment;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class r56 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXNAVIBARMOREVIEW_BADGECOLOR = 2373749041343598844L;
    public static final long DXNAVIBARMOREVIEW_IGNOREFESTIVAL = -2599104242922222640L;
    public static final long DXNAVIBARMOREVIEW_MOREICONCOLOR = -4697674858662531768L;
    public static final long DXNAVIBARMOREVIEW_NAVIBARMOREVIEW = -7527731942041097248L;
    public static final long DXNAVIBARMOREVIEW_RECYCLEBINURL = -6801814531293824448L;
    public static final long DXNAVIBARMOREVIEW_TEXTCOLOR = 5737767606580872653L;

    /* renamed from: a  reason: collision with root package name */
    public int f27115a = -1;
    public String b = "false";
    public int c = -1;
    public int d = gt9.COLOR_UNFOLLOW_DEFAULT;
    public String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements TBPublicMenu.TBOnPublicMenuClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
        public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
            } else if (r56.this.getDXRuntimeContext() != null && r56.this.getDXRuntimeContext().h() != null) {
                Context h = r56.this.getDXRuntimeContext().h();
                if (tBPublicMenuItem != null && tBPublicMenuItem.getId() == R.id.order_list_menu_recycle_bin) {
                    Nav.from(h).toUri(r56.t(r56.this));
                    HashMap hashMap = new HashMap();
                    hashMap.put("pagesource", "orderList");
                    UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(dbv.BIZ_ORDER_LIST, 2101, "Page_order_OrderRecycleBin_clk", null, null, hashMap).build());
                }
            }
        }
    }

    static {
        t2o.a(713031780);
    }

    public static /* synthetic */ Object ipc$super(r56 r56Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/dinamicX/view/DXNaviBarMoreViewWidgetNode");
        }
    }

    public static /* synthetic */ String t(r56 r56Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af9776f2", new Object[]{r56Var});
        }
        return r56Var.e;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new r56();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)});
        }
        if (j == DXNAVIBARMOREVIEW_IGNOREFESTIVAL) {
            return "false";
        }
        return super.getDefaultValueForStringAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof r56)) {
            super.onClone(dXWidgetNode, z);
            r56 r56Var = (r56) dXWidgetNode;
            this.f27115a = r56Var.f27115a;
            this.b = r56Var.b;
            this.c = r56Var.c;
            this.d = r56Var.d;
            this.e = r56Var.e;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new TBActionView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int f;
        int f2;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i2);
        if (a2 == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (a3 != 1073741824) {
            z2 = false;
        }
        if (!z || !z2) {
            if (z) {
                i4 = DXWidgetNode.DXMeasureSpec.b(i);
                i3 = pb6.f(DinamicXEngine.x(), 48.0f);
            } else {
                if (z2) {
                    f = DXWidgetNode.DXMeasureSpec.b(i2);
                    f2 = pb6.f(DinamicXEngine.x(), 48.0f);
                } else {
                    f = pb6.f(DinamicXEngine.x(), 48.0f);
                    f2 = pb6.f(DinamicXEngine.x(), 48.0f);
                }
                i3 = f;
                i4 = f2;
            }
            setMeasuredDimension(DXWidgetNode.resolveSize(i4, i), DXWidgetNode.resolveSize(i3, i2));
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        ITBPublicMenu iTBPublicMenu;
        TBPublicMenu publicMenu;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (context != null) {
            lor.c("DXNaviBarMoreViewWidget", "onRenderView", "----");
            TBActionView tBActionView = (TBActionView) view;
            if (context instanceof ITBPublicMenu) {
                ITBPublicMenu iTBPublicMenu2 = (ITBPublicMenu) context;
                TBPublicMenu publicMenu2 = iTBPublicMenu2.getPublicMenu();
                if (publicMenu2 != null) {
                    publicMenu2.setCustomOverflow(tBActionView);
                    u(iTBPublicMenu2, publicMenu2);
                }
            } else if (context instanceof FragmentActivity) {
                ISupportFragment h = qxq.h(((FragmentActivity) context).getSupportFragmentManager());
                if ((h instanceof ITBPublicMenu) && (publicMenu = (iTBPublicMenu = (ITBPublicMenu) h).getPublicMenu()) != null) {
                    publicMenu.setCustomOverflow(tBActionView);
                    u(iTBPublicMenu, publicMenu);
                }
            }
            tBActionView.setTitle(context.getString(R.string.actionBar_uikit_title));
            String l = FestivalMgr.i().l("global", slo.KEY_NAVI_STYLE);
            if (TextUtils.isEmpty(l)) {
                tBActionView.setIconColor(this.c);
                tBActionView.setMessageNumColor(this.d);
                tBActionView.setMessageBackgroundColor(this.f27115a);
            } else {
                boolean equals = TextUtils.equals("1", l);
                lor.c("DXNaviBarMoreViewWidget", "onRenderView", "isDark = " + equals);
                if (equals) {
                    tBActionView.switchActionStyle(TBActionBar.ActionBarStyle.NORMAL);
                } else {
                    tBActionView.switchActionStyle(TBActionBar.ActionBarStyle.DARK);
                }
            }
            v(context, tBActionView, l);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXNAVIBARMOREVIEW_BADGECOLOR) {
            this.f27115a = i;
        } else if (j == DXNAVIBARMOREVIEW_MOREICONCOLOR) {
            this.c = i;
        } else if (j == 5737767606580872653L) {
            this.d = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXNAVIBARMOREVIEW_IGNOREFESTIVAL) {
            this.b = str;
        } else if (j == DXNAVIBARMOREVIEW_RECYCLEBINURL) {
            this.e = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final void u(ITBPublicMenu iTBPublicMenu, TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0dd053c", new Object[]{this, iTBPublicMenu, tBPublicMenu});
        } else if (!TextUtils.isEmpty(this.e) && iTBPublicMenu != null && tBPublicMenu != null && v9v.i(wbl.NEW_BABEL_ORDER, "enableAddRecycleBinMenu", true)) {
            if (iTBPublicMenu instanceof TBOrderListActivity) {
                TBOrderListActivity tBOrderListActivity = (TBOrderListActivity) iTBPublicMenu;
                if (!tBOrderListActivity.v4()) {
                    tBOrderListActivity.L4();
                } else {
                    return;
                }
            } else if (iTBPublicMenu instanceof TBOrderListFragment) {
                TBOrderListFragment tBOrderListFragment = (TBOrderListFragment) iTBPublicMenu;
                if (!tBOrderListFragment.x3()) {
                    tBOrderListFragment.V3();
                } else {
                    return;
                }
            } else {
                return;
            }
            TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
            builder.setTitle("낊:订单回收站").setNeedLogin(true).setId(R.id.order_list_menu_recycle_bin);
            ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
            TBPublicMenuItem build = builder.build();
            if (build != null) {
                arrayList.add(build);
            }
            tBPublicMenu.addExternalMenus(arrayList, new a());
        }
    }

    public final void v(Context context, TBActionView tBActionView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30690dd5", new Object[]{this, context, tBActionView, str});
        } else if ((context instanceof TBOrderDetailActivity) && ((TBOrderDetailActivity) context).p3() == ParallelBizValueHelper.PageType.logistics_detail && v9v.i("babelorder", "enableFitLogisticsNavMoreBtn", false) && TextUtils.equals("true", this.b)) {
            tBActionView.setIconColor(this.c);
            tBActionView.setMessageNumColor(this.d);
            tBActionView.setMessageBackgroundColor(this.f27115a);
        }
    }
}
