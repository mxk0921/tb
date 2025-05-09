package com.taobao.favorites.components.category.offerout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.favorites.favoritesdk.category.response.ComTaobaoMercuryQueryShareListResponseData;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FavCategoryAllAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f10533a;
    public int b = -1;
    public List<ComTaobaoMercuryQueryShareListResponseData.ShareListItem> c = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class ItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f10534a;
        public final ImageView b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(FavCategoryAllAdapter favCategoryAllAdapter) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                int intValue = ((Integer) ItemViewHolder.this.f10534a.getTag()).intValue();
                if (FavCategoryAllAdapter.M(FavCategoryAllAdapter.this) != intValue) {
                    ItemViewHolder.this.b.setVisibility(0);
                    int M = FavCategoryAllAdapter.M(FavCategoryAllAdapter.this);
                    FavCategoryAllAdapter.N(FavCategoryAllAdapter.this, intValue);
                    FavCategoryAllAdapter.this.notifyItemChanged(M);
                    ((FavCategoryAllActivity) FavCategoryAllAdapter.P(FavCategoryAllAdapter.this)).setChooseCategory((ComTaobaoMercuryQueryShareListResponseData.ShareListItem) FavCategoryAllAdapter.O(FavCategoryAllAdapter.this).get(intValue));
                }
            }
        }

        static {
            t2o.a(707788808);
        }

        public ItemViewHolder(View view) {
            super(view);
            AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllAdapter", "ItemViewHolder->public ItemViewHolder(View itemView)", "20180112");
            TextView textView = (TextView) view.findViewById(R.id.category_name);
            this.f10534a = textView;
            this.b = (ImageView) view.findViewById(R.id.choose);
            textView.setOnClickListener(new a(FavCategoryAllAdapter.this));
        }
    }

    static {
        t2o.a(707788807);
    }

    public FavCategoryAllAdapter(Context context) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllAdapter", "FavCategoryAllAdapter(Context context)", "20180112");
        this.f10533a = context;
    }

    public static /* synthetic */ int M(FavCategoryAllAdapter favCategoryAllAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("521dc4d0", new Object[]{favCategoryAllAdapter})).intValue();
        }
        return favCategoryAllAdapter.b;
    }

    public static /* synthetic */ int N(FavCategoryAllAdapter favCategoryAllAdapter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ffed0e3b", new Object[]{favCategoryAllAdapter, new Integer(i)})).intValue();
        }
        favCategoryAllAdapter.b = i;
        return i;
    }

    public static /* synthetic */ List O(FavCategoryAllAdapter favCategoryAllAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("61da580b", new Object[]{favCategoryAllAdapter});
        }
        return favCategoryAllAdapter.c;
    }

    public static /* synthetic */ Context P(FavCategoryAllAdapter favCategoryAllAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("569f8e93", new Object[]{favCategoryAllAdapter});
        }
        return favCategoryAllAdapter.f10533a;
    }

    public static /* synthetic */ Object ipc$super(FavCategoryAllAdapter favCategoryAllAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/favorites/components/category/offerout/FavCategoryAllAdapter");
    }

    public void Q(List<ComTaobaoMercuryQueryShareListResponseData.ShareListItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5220d021", new Object[]{this, list});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllAdapter", "public void addDataList(List<ShareListItem> dataList)", "20180112");
        if (list != null) {
            this.c.addAll(list);
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllAdapter", "public int getItemCount()", "20180112");
        return this.c.size();
    }

    public void setDataList(List<ComTaobaoMercuryQueryShareListResponseData.ShareListItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6029d862", new Object[]{this, list});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllAdapter", "public void setDataList(List<ShareListItem> dataList)", "20180112");
        if (list != null) {
            this.c = list;
            notifyDataSetChanged();
            return;
        }
        this.c.clear();
        notifyDataSetChanged();
    }

    /* renamed from: S */
    public void onBindViewHolder(ItemViewHolder itemViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30c2a3b", new Object[]{this, itemViewHolder, new Integer(i)});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllAdapter", "public void onBindViewHolder(FavCategoryAllAdapter.ItemViewHolder holder, int position)", "20180112");
        itemViewHolder.f10534a.setText(this.c.get(i).title);
        itemViewHolder.f10534a.setTag(Integer.valueOf(i));
        if (i == this.b) {
            itemViewHolder.b.setVisibility(0);
        } else {
            itemViewHolder.b.setVisibility(8);
        }
    }

    /* renamed from: T */
    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemViewHolder) ipChange.ipc$dispatch("b85dca79", new Object[]{this, viewGroup, new Integer(i)});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllAdapter", "public FavCategoryAllAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType)", "20180112");
        return new ItemViewHolder(LayoutInflater.from(this.f10533a).inflate(R.layout.favorite_category_dialog_all_item, viewGroup, false));
    }
}
