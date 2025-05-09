package com.taobao.favorites.components.category.offerout;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.favorites.favoritesdk.base.ModelSdkBusiness;
import com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest;
import com.taobao.favorites.favoritesdk.category.response.ComTaobaoMercuryEditShareListResponse;
import com.taobao.favorites.favoritesdk.category.response.ComTaobaoMercuryQueryShareListResponseData;
import com.taobao.schedule.ViewProxy;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.ks6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FavCategoryPopupAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<ComTaobaoMercuryQueryShareListResponseData.ShareListItem> f10541a;
    public final Activity b;
    public final String c;
    public final FavCategoryPopupWindow d;
    public final ComTaobaoMercuryQueryShareListResponseData e;
    public final View.OnClickListener f = new a();
    public final View.OnClickListener g = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class ItemViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TextView f10542a;
        public final View b;

        static {
            t2o.a(707788820);
        }

        public ItemViewHolder(View view) {
            super(view);
            AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupAdapter", "ItemViewHolder->public ItemViewHolder(View itemView)", "20180112");
            this.f10542a = (TextView) view.findViewById(R.id.category_name);
            this.b = view.findViewById(R.id.divider);
        }

        public static /* synthetic */ Object ipc$super(ItemViewHolder itemViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/favorites/components/category/offerout/FavCategoryPopupAdapter$ItemViewHolder");
        }

        public void b0(ComTaobaoMercuryQueryShareListResponseData.ShareListItem shareListItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ef0f674", new Object[]{this, shareListItem});
                return;
            }
            AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupAdapter", "ItemViewHolder->public void bind(ShareListItem data)", "20180112");
            this.f10542a.setText(shareListItem.title);
            ViewProxy.setOnClickListener(this.itemView, FavCategoryPopupAdapter.P(FavCategoryPopupAdapter.this));
            this.itemView.setTag(shareListItem);
        }

        public void c0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f5f40d8", new Object[]{this});
                return;
            }
            AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupAdapter", "ItemViewHolder->public void bindAllTab()", "20180112");
            this.f10542a.setText("查看全部心愿单");
            ViewProxy.setOnClickListener(this.itemView, FavCategoryPopupAdapter.Q(FavCategoryPopupAdapter.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.favorites.components.category.offerout.FavCategoryPopupAdapter$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class RunnableC0554a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0554a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    FavCategoryPopupAdapter.N(FavCategoryPopupAdapter.this).finish();
                }
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TBS.Adv.ctrlClicked("Page_DetailAddCategory", CT.Button, "Page_DetailAddCategory_AllCategory");
            StringBuilder sb = new StringBuilder("http://h5.m.taobao.com/fav_category_all.htm");
            sb.append("?select_item_id=");
            sb.append(FavCategoryPopupAdapter.M(FavCategoryPopupAdapter.this));
            sb.append("&spm=spm=a21ay.8180211");
            Nav.from(FavCategoryPopupAdapter.N(FavCategoryPopupAdapter.this)).toUri(sb.substring(0));
            view.postDelayed(new RunnableC0554a(), 200L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TBS.Adv.ctrlClicked("Page_DetailAddCategory", CT.Button, "Page_DetailAddCategory_SelectCategory");
            new ArrayList().add(FavCategoryPopupAdapter.M(FavCategoryPopupAdapter.this));
            FavCategoryPopupAdapter.O(FavCategoryPopupAdapter.this, (ComTaobaoMercuryQueryShareListResponseData.ShareListItem) view.getTag());
            FavCategoryPopupAdapter.N(FavCategoryPopupAdapter.this).finish();
        }
    }

    static {
        t2o.a(707788816);
    }

    public FavCategoryPopupAdapter(Activity activity, FavCategoryPopupWindow favCategoryPopupWindow, String str, ComTaobaoMercuryQueryShareListResponseData comTaobaoMercuryQueryShareListResponseData) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupAdapter", "public FavCategoryPopupAdapter(Activity context, FavCategoryPopupWindow popupWindow, String itemId, ComTaobaoMercuryQueryShareListResponseData data)", "20180112");
        this.b = activity;
        this.d = favCategoryPopupWindow;
        this.c = str;
        this.e = comTaobaoMercuryQueryShareListResponseData;
    }

    public static /* synthetic */ String M(FavCategoryPopupAdapter favCategoryPopupAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56708c38", new Object[]{favCategoryPopupAdapter});
        }
        return favCategoryPopupAdapter.c;
    }

    public static /* synthetic */ Activity N(FavCategoryPopupAdapter favCategoryPopupAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("58175581", new Object[]{favCategoryPopupAdapter});
        }
        return favCategoryPopupAdapter.b;
    }

    public static /* synthetic */ void O(FavCategoryPopupAdapter favCategoryPopupAdapter, ComTaobaoMercuryQueryShareListResponseData.ShareListItem shareListItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c932652", new Object[]{favCategoryPopupAdapter, shareListItem});
        } else {
            favCategoryPopupAdapter.S(shareListItem);
        }
    }

    public static /* synthetic */ View.OnClickListener P(FavCategoryPopupAdapter favCategoryPopupAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("ba0da5ee", new Object[]{favCategoryPopupAdapter});
        }
        return favCategoryPopupAdapter.g;
    }

    public static /* synthetic */ View.OnClickListener Q(FavCategoryPopupAdapter favCategoryPopupAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("3023c84d", new Object[]{favCategoryPopupAdapter});
        }
        return favCategoryPopupAdapter.f;
    }

    public static /* synthetic */ Object ipc$super(FavCategoryPopupAdapter favCategoryPopupAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/favorites/components/category/offerout/FavCategoryPopupAdapter");
    }

    public void setDataList(List<ComTaobaoMercuryQueryShareListResponseData.ShareListItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6029d862", new Object[]{this, list});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupAdapter", "public void setDataList(List<ShareListItem> dataList)", "20180112");
        this.f10541a = list;
        notifyDataSetChanged();
    }

    public final void S(ComTaobaoMercuryQueryShareListResponseData.ShareListItem shareListItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa2e503", new Object[]{this, shareListItem});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupAdapter", "private void completeChooseCategory(ShareListItem shareListItem)", "20180112");
        if (shareListItem != null) {
            ComTaobaoMercuryEditShareListRequest comTaobaoMercuryEditShareListRequest = new ComTaobaoMercuryEditShareListRequest();
            comTaobaoMercuryEditShareListRequest.setListId(shareListItem.listId);
            comTaobaoMercuryEditShareListRequest.setSource(shareListItem.source);
            comTaobaoMercuryEditShareListRequest.setIsSync(shareListItem.isSync ? 1L : 0L);
            comTaobaoMercuryEditShareListRequest.setCategoryType(shareListItem.shareType);
            comTaobaoMercuryEditShareListRequest.setType(shareListItem.type);
            comTaobaoMercuryEditShareListRequest.setAppName("mclaren");
            if (!TextUtils.isEmpty(this.c)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.c);
                comTaobaoMercuryEditShareListRequest.setAddList(JSON.toJSONString(arrayList));
            }
            ModelSdkBusiness.b(ks6.a(comTaobaoMercuryEditShareListRequest, 44)).g(1, ComTaobaoMercuryEditShareListResponse.class, this.d);
        }
    }

    /* renamed from: U */
    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemViewHolder) ipChange.ipc$dispatch("fd55e90e", new Object[]{this, viewGroup, new Integer(i)});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupAdapter", "public FavCategoryPopupAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType)", "20180112");
        return new ItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.favorite_category_dialog_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupAdapter", "public int getItemCount()", "20180112");
        List<ComTaobaoMercuryQueryShareListResponseData.ShareListItem> list = this.f10541a;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f10541a.size();
    }

    /* renamed from: T */
    public void onBindViewHolder(ItemViewHolder itemViewHolder, int i) {
        ComTaobaoMercuryQueryShareListResponseData comTaobaoMercuryQueryShareListResponseData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e40006", new Object[]{this, itemViewHolder, new Integer(i)});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupAdapter", "public void onBindViewHolder(FavCategoryPopupAdapter.ItemViewHolder holder, int position)", "20180112");
        if (i != 10 || (comTaobaoMercuryQueryShareListResponseData = this.e) == null || !comTaobaoMercuryQueryShareListResponseData.hasMore) {
            itemViewHolder.b0(this.f10541a.get(i));
            if (i == this.f10541a.size() - 1) {
                itemViewHolder.b.setVisibility(8);
            } else {
                itemViewHolder.b.setVisibility(0);
            }
        } else {
            itemViewHolder.c0();
        }
    }
}
