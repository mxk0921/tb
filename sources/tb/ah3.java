package tb;

import android.view.LayoutInflater;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.search.jarvis.rcmd.cell.XslAuctionCellWidget;
import com.taobao.search.sf.widgets.list.listcell.crosstips.CrossTipsWidget;
import com.taobao.search.sf.widgets.list.listcell.defaultauction.DefaultAuctionCellWidget;
import com.taobao.search.sf.widgets.list.listcell.defaultshop.DefaultShopCellWidget;
import com.taobao.search.sf.widgets.list.listcell.inshopauction2020.InshopAuction2020CellWidget;
import com.taobao.search.sf.widgets.list.listcell.tips.TipsCellWidget;
import com.taobao.taobao.R;
import tb.rg3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ah3 {
    public static final rg3.b TIPS_CREATOR = new a();
    public static final rg3.b CROSS_TIPS_CREATOR = new b();
    public static final rg3.b INSHOP_AUCTION_2020_LIST_CREATOR = new c();
    public static final rg3.b INSHOP_AUCTION_2020_WF_CREATOR = new d();
    public static final rg3.b XSL_AUCTION_CREATOR = new e();
    public static final rg3.b DEFAULT_AUCTION_CELL_LIST_CREATOR = new f();
    public static final rg3.b DEFAULT_AUCTION_CELL_WF_CREATOR = new g();
    public static final rg3.b DEFAULT_SHOP_CELL_CREATOR = new h();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements rg3.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public WidgetViewHolder a(rg3.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WidgetViewHolder) ipChange.ipc$dispatch("70fcae1f", new Object[]{this, cVar});
            }
            return new TipsCellWidget(R.layout.tbsearch_item_list_tip, cVar.f27354a, cVar.b, cVar.c, cVar.d, cVar.e, (b64) cVar.f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements rg3.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public WidgetViewHolder a(rg3.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WidgetViewHolder) ipChange.ipc$dispatch("70fcae1f", new Object[]{this, cVar});
            }
            return new CrossTipsWidget(cVar.f27354a, cVar.b, cVar.c, cVar.d, cVar.e, (b64) cVar.f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements rg3.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public WidgetViewHolder a(rg3.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WidgetViewHolder) ipChange.ipc$dispatch("70fcae1f", new Object[]{this, cVar});
            }
            return new InshopAuction2020CellWidget(R.layout.sf_tbsearch_item_list_improve_inshop_2021, cVar.f27354a, cVar.b, cVar.c, cVar.d, cVar.e, (b64) cVar.f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements rg3.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public WidgetViewHolder a(rg3.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WidgetViewHolder) ipChange.ipc$dispatch("70fcae1f", new Object[]{this, cVar});
            }
            return new InshopAuction2020CellWidget(R.layout.sf_tbsearch_item_mid_improve_inshop_2021, cVar.f27354a, cVar.b, cVar.c, cVar.d, cVar.e, (b64) cVar.f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements rg3.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public WidgetViewHolder a(rg3.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WidgetViewHolder) ipChange.ipc$dispatch("70fcae1f", new Object[]{this, cVar});
            }
            return new XslAuctionCellWidget(LayoutInflater.from(cVar.f27354a).inflate(R.layout.tbsearch_xsl_downgrade_auction_item, cVar.c, false), cVar.f27354a, cVar.b, cVar.d, cVar.e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements rg3.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public WidgetViewHolder a(rg3.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WidgetViewHolder) ipChange.ipc$dispatch("70fcae1f", new Object[]{this, cVar});
            }
            return new DefaultAuctionCellWidget(LayoutInflater.from(cVar.f27354a).inflate(R.layout.tbsearch_item_default_auction_list, cVar.c, false), cVar.f27354a, cVar.b, cVar.d, cVar.e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements rg3.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public WidgetViewHolder a(rg3.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WidgetViewHolder) ipChange.ipc$dispatch("70fcae1f", new Object[]{this, cVar});
            }
            return new DefaultAuctionCellWidget(LayoutInflater.from(cVar.f27354a).inflate(R.layout.tbsearch_item_default_auction_wf, cVar.c, false), cVar.f27354a, cVar.b, cVar.d, cVar.e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements rg3.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public WidgetViewHolder a(rg3.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WidgetViewHolder) ipChange.ipc$dispatch("70fcae1f", new Object[]{this, cVar});
            }
            return new DefaultShopCellWidget(LayoutInflater.from(cVar.f27354a).inflate(R.layout.tbsearch_item_default_shop, cVar.c, false), cVar.f27354a, cVar.b, cVar.d, cVar.e, (b64) cVar.f);
        }
    }

    static {
        t2o.a(815793542);
    }
}
