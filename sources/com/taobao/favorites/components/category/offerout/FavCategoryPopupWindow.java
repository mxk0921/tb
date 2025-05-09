package com.taobao.favorites.components.category.offerout;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.favorites.favoritesdk.base.ModelSdkBusiness;
import com.taobao.favorites.favoritesdk.base.ResultListener;
import com.taobao.favorites.favoritesdk.category.response.ComTaobaoMercuryCreateShareListResponse;
import com.taobao.favorites.favoritesdk.category.response.ComTaobaoMercuryQueryShareListResponseData;
import com.taobao.schedule.ViewProxy;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import java.util.ArrayList;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.t2o;
import tb.v29;
import tb.vf3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FavCategoryPopupWindow extends PopupWindow implements ResultListener, View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_ITEM_NUMBER = 10;
    public static final int REQUEST_CATEGORY = 1;
    public static final int REQUEST_WISH = 2;
    private int height;
    public boolean isActivityOwnFinish;
    private boolean isClickDimiss;
    private String itemId;
    private FavCategoryPopupAdapter mAdapter;
    private Activity mContext;
    private View myWishButton;
    private int realHeight;
    private RecyclerView recyclerView;
    private View rootView;
    private int width;
    private int xOffset;
    private int yOffset;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FavCategoryPopupWindow.access$100(FavCategoryPopupWindow.this).finish();
            }
        }
    }

    static {
        t2o.a(707788821);
        t2o.a(707788836);
    }

    public FavCategoryPopupWindow(final Activity activity, String str, int i, int i2, ComTaobaoMercuryQueryShareListResponseData comTaobaoMercuryQueryShareListResponseData) {
        super(activity);
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupWindow", "public FavCategoryPopupWindow(final Activity context, String itemId, int xOffset, int yOffset, ComTaobaoMercuryQueryShareListResponseData data)", "20180112");
        this.mContext = activity;
        this.xOffset = i;
        this.yOffset = i2;
        this.realHeight = DensityUtil.dip2px(activity, 108.0f);
        this.itemId = str;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.favorite_category_dialog, (ViewGroup) null);
        this.rootView = inflate;
        View findViewById = inflate.findViewById(R.id.my_wish_category);
        this.myWishButton = findViewById;
        ViewProxy.setOnClickListener(findViewById, this);
        setContentView(this.rootView);
        setBackgroundDrawable(new ColorDrawable(0));
        RecyclerView recyclerView = (RecyclerView) this.rootView.findViewById(R.id.category_list);
        this.recyclerView = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        FavCategoryPopupAdapter favCategoryPopupAdapter = new FavCategoryPopupAdapter(this.mContext, this, str, comTaobaoMercuryQueryShareListResponseData);
        this.mAdapter = favCategoryPopupAdapter;
        this.recyclerView.setAdapter(favCategoryPopupAdapter);
        ViewProxy.setOnClickListener(this.rootView.findViewById(R.id.close), this);
        ViewProxy.setOnClickListener(this.rootView.findViewById(R.id.new_category_rl), this);
        setOutsideTouchable(true);
        mandatoryDraw();
        setItemListData(comTaobaoMercuryQueryShareListResponseData);
        showPopup();
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.favorites.components.category.offerout.FavCategoryPopupWindow.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
                    return;
                }
                FavCategoryPopupWindow favCategoryPopupWindow = FavCategoryPopupWindow.this;
                if (!favCategoryPopupWindow.isActivityOwnFinish) {
                    if (FavCategoryPopupWindow.access$000(favCategoryPopupWindow)) {
                        TBS.Adv.ctrlClicked("Page_DetailAddCategory", CT.Button, "Page_DetailAddCategory_Close");
                    } else {
                        TBS.Adv.ctrlClicked("Page_DetailAddCategory", CT.Button, "Page_DetailAddCategory_OtherClose");
                    }
                    activity.finish();
                }
            }
        });
    }

    public static /* synthetic */ boolean access$000(FavCategoryPopupWindow favCategoryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8d15ead", new Object[]{favCategoryPopupWindow})).booleanValue();
        }
        return favCategoryPopupWindow.isClickDimiss;
    }

    public static /* synthetic */ Activity access$100(FavCategoryPopupWindow favCategoryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("5f3b943e", new Object[]{favCategoryPopupWindow});
        }
        return favCategoryPopupWindow.mContext;
    }

    public static /* synthetic */ Object ipc$super(FavCategoryPopupWindow favCategoryPopupWindow, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/favorites/components/category/offerout/FavCategoryPopupWindow");
    }

    @Override // com.taobao.favorites.favoritesdk.base.ResultListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupWindow", "public void onError(int requestType, MtopResponse response, Object requestContext)", "20180112");
        v29.d("添加失败");
    }

    @Override // com.taobao.favorites.favoritesdk.base.ResultListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupWindow", "public void onSuccess(int requestType, MtopResponse response, BaseOutDo pojo, Object requestContext)", "20180112");
        v29.a();
    }

    @Override // com.taobao.favorites.favoritesdk.base.ResultListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupWindow", "public void onSystemError(int requestType, MtopResponse response, Object requestContext)", "20180112");
        v29.d("添加失败");
    }

    private void mandatoryDraw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25c94c4", new Object[]{this});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupWindow", "private void mandatoryDraw()", "20180112");
        this.rootView.measure(0, 0);
        this.width = this.rootView.getMeasuredWidth();
        this.height = -2;
    }

    private void setItemListData(ComTaobaoMercuryQueryShareListResponseData comTaobaoMercuryQueryShareListResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecaf0d20", new Object[]{this, comTaobaoMercuryQueryShareListResponseData});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupWindow", "private void setItemListData(ComTaobaoMercuryQueryShareListResponseData data)", "20180112");
        if (comTaobaoMercuryQueryShareListResponseData != null) {
            ArrayList<ComTaobaoMercuryQueryShareListResponseData.ShareListItem> arrayList = comTaobaoMercuryQueryShareListResponseData.resultList;
            if (arrayList == null || arrayList.size() <= 0) {
                this.myWishButton.setVisibility(0);
                this.realHeight = DensityUtil.dip2px(this.mContext, 120.0f);
                return;
            }
            int size = arrayList.size();
            ViewGroup.LayoutParams layoutParams = this.recyclerView.getLayoutParams();
            if (size <= 5) {
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.realHeight = DensityUtil.dip2px(this.mContext, (size * 36) + 84);
            } else if (size > 5) {
                layoutParams.width = -1;
                layoutParams.height = DensityUtil.dip2px(this.mContext.getApplicationContext(), 36.0f) * 5;
                this.realHeight = DensityUtil.dip2px(this.mContext, 264.0f);
            }
            this.recyclerView.setLayoutParams(layoutParams);
            this.mAdapter.setDataList(arrayList);
        }
    }

    private void showPopup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4fa10b6", new Object[]{this});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupWindow", "private void showPopup()", "20180112");
        TBS.Ext.commitEvent("Page_DetailAddCategory", 19999, "Page_DetailAddCategory_Show");
        setWidth(this.width);
        setHeight(this.height);
        try {
            showAtLocation(this.mContext.getWindow().getDecorView(), 0, this.xOffset - (DensityUtil.dip2px(this.mContext, 182.0f) / 2), this.yOffset - this.realHeight);
        } catch (Exception unused) {
            Activity activity = this.mContext;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupWindow", "public void onClick(View v)", "20180112");
        int id = view.getId();
        if (id == R.id.close) {
            this.isClickDimiss = true;
            dismiss();
        } else if (id == R.id.new_category_rl) {
            TBS.Adv.ctrlClicked("Page_DetailAddCategory", CT.Button, "Page_DetailAddCategory_CreatCategory");
            StringBuilder sb = new StringBuilder("http://h5.m.taobao.com/fav_category_create.htm");
            sb.append("?select_item_id=");
            sb.append(this.itemId);
            sb.append("&spm=spm=a21ay.8180209");
            Nav.from(this.mContext).toUri(sb.substring(0));
            this.rootView.postDelayed(new a(), 200L);
        } else if (id == R.id.my_wish_category) {
            TBS.Adv.ctrlClicked("Page_DetailAddCategory", CT.Button, "Page_DetailAddCategory_SelectCategory_XinYuanDan");
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.itemId)) {
                arrayList.add(this.itemId);
            }
            ModelSdkBusiness.b(vf3.a("mclaren", 1, "0", "我的心愿单", null, 1L, 2L, 0L, JSON.toJSONString(arrayList), null, 0L)).g(2, ComTaobaoMercuryCreateShareListResponse.class, this);
            this.mContext.finish();
        }
    }
}
