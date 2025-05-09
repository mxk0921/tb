package com.taobao.favorites.components.category.offerout;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.favorites.FavoriteBaseActivity;
import com.taobao.favorites.favoritesdk.base.CacheLisener;
import com.taobao.favorites.favoritesdk.base.ModelSdkBusiness;
import com.taobao.favorites.favoritesdk.base.ResultListener;
import com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest;
import com.taobao.favorites.favoritesdk.category.response.ComTaobaoMercuryEditShareListResponse;
import com.taobao.favorites.favoritesdk.category.response.ComTaobaoMercuryQueryShareListResponse;
import com.taobao.favorites.favoritesdk.category.response.ComTaobaoMercuryQueryShareListResponseData;
import com.taobao.favorites.template.FavTemplateConstant;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a0k;
import tb.acq;
import tb.ks6;
import tb.pyu;
import tb.t2o;
import tb.v29;
import tb.vf3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FavCategoryAllActivity extends FavoriteBaseActivity implements ResultListener, CacheLisener, View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ComTaobaoMercuryQueryShareListResponseData data;
    private String itemId = "";
    private TRecyclerView list;
    private TextView mActionBarOperation;
    private FavCategoryAllAdapter mAdapter;
    private View mEmptyView;
    private View mErrorView;
    private ComTaobaoMercuryQueryShareListResponseData.ShareListItem shareListItem;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                FavCategoryAllActivity.this.getCategoryList(0);
            }
        }
    }

    static {
        t2o.a(707788805);
        t2o.a(707788836);
        t2o.a(707788826);
    }

    public static /* synthetic */ Object ipc$super(FavCategoryAllActivity favCategoryAllActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1064812440:
                super.supportDisablePublicMenu();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -198387616:
                return new Boolean(super.onPanelKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/favorites/components/category/offerout/FavCategoryAllActivity");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public void completeChooseCategory(ComTaobaoMercuryQueryShareListResponseData.ShareListItem shareListItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa2e503", new Object[]{this, shareListItem});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllActivity", "public void completeChooseCategory(ShareListItem shareListItem)", "20180112");
        if (shareListItem != null) {
            showLoadingMaskLayout();
            ComTaobaoMercuryEditShareListRequest comTaobaoMercuryEditShareListRequest = new ComTaobaoMercuryEditShareListRequest();
            comTaobaoMercuryEditShareListRequest.setListId(shareListItem.listId);
            comTaobaoMercuryEditShareListRequest.setSource(shareListItem.source);
            comTaobaoMercuryEditShareListRequest.setIsSync(shareListItem.isSync ? 1L : 0L);
            comTaobaoMercuryEditShareListRequest.setCategoryType(shareListItem.shareType);
            comTaobaoMercuryEditShareListRequest.setType(shareListItem.type);
            comTaobaoMercuryEditShareListRequest.setAppName("mclaren");
            if (!TextUtils.isEmpty(this.itemId)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.itemId);
                comTaobaoMercuryEditShareListRequest.setAddList(JSON.toJSONString(arrayList));
            }
            ModelSdkBusiness.b(ks6.a(comTaobaoMercuryEditShareListRequest, 44)).g(6, ComTaobaoMercuryEditShareListResponse.class, this);
        }
    }

    @Override // com.taobao.favorites.favoritesdk.base.CacheLisener
    public void onCached(MtopCacheEvent mtopCacheEvent, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f40859", new Object[]{this, mtopCacheEvent, baseOutDo, obj});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllActivity", "public void onCached(MtopCacheEvent event, BaseOutDo pojo, Object context)", "20180112");
        if (!a0k.a(this) && baseOutDo != null && baseOutDo.getData() != null) {
            ComTaobaoMercuryQueryShareListResponseData comTaobaoMercuryQueryShareListResponseData = (ComTaobaoMercuryQueryShareListResponseData) baseOutDo.getData();
            this.data = comTaobaoMercuryQueryShareListResponseData;
            setData(comTaobaoMercuryQueryShareListResponseData);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllActivity", "public void onClick(View v)", "20180112");
        if (view.getId() == R.id.tv_complete) {
            TBS.Adv.ctrlClicked("Page_DetailAddCategoryMore", CT.Button, "Page_DetailAddCategoryMore_Confirm");
            completeChooseCategory(this.shareListItem);
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllActivity", "public boolean onKeyDown(int keyCode, KeyEvent event)", "20180112");
        if (i == 4) {
            TBS.Adv.ctrlClicked("Page_DetailAddCategoryMore", CT.Button, "Page_DetailAddCategoryMore_Back");
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean onPanelKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllActivity", "protected boolean onPanelKeyDown(int keyCode, KeyEvent event)", "20180112");
        if (i == 4) {
            TBS.Adv.ctrlClicked("Page_DetailAddCategoryMore", CT.Button, "Page_DetailAddCategoryMore_Back");
        }
        return super.onPanelKeyDown(i, keyEvent);
    }

    public void setChooseCategory(ComTaobaoMercuryQueryShareListResponseData.ShareListItem shareListItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd160ba", new Object[]{this, shareListItem});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllActivity", "public void setChooseCategory(ShareListItem shareListItem)", "20180112");
        this.shareListItem = shareListItem;
        this.mActionBarOperation.setTextColor(getResources().getColor(R.color.orange));
    }

    public void setData(ComTaobaoMercuryQueryShareListResponseData comTaobaoMercuryQueryShareListResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839772b1", new Object[]{this, comTaobaoMercuryQueryShareListResponseData});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllActivity", "public void setData(ComTaobaoMercuryQueryShareListResponseData data)", "20180112");
        if (comTaobaoMercuryQueryShareListResponseData != null) {
            this.mAdapter.setDataList(comTaobaoMercuryQueryShareListResponseData.resultList);
        }
    }

    private void initActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43a14d4", new Object[]{this});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllActivity", "private void initActionBar()", "20180112");
        ActionBar supportActionBar = getSupportActionBar();
        this.mActionBarOperation = (TextView) LayoutInflater.from(this).inflate(R.layout.favorite_category_create_actionbar, (ViewGroup) null);
        supportActionBar.setDisplayShowCustomEnabled(true);
        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(-2, -1, 5);
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = DensityUtil.dip2px(getActivity().getApplicationContext(), 12.0f);
        supportActionBar.setCustomView(this.mActionBarOperation, layoutParams);
        this.mActionBarOperation.setOnClickListener(this);
        super.supportDisablePublicMenu();
    }

    private void setEmptyVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2a27a6", new Object[]{this, new Boolean(z)});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllActivity", "private void setEmptyVisible(boolean isVisible)", "20180112");
        if (this.mEmptyView == null) {
            View inflate = ((ViewStub) getActivity().findViewById(R.id.mytaobao_favCategory_empty)).inflate();
            this.mEmptyView = inflate;
            inflate.setVisibility(0);
        }
        if (z) {
            this.mEmptyView.setVisibility(0);
        } else {
            this.mEmptyView.setVisibility(8);
        }
    }

    private void setErrorVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d033e1", new Object[]{this, new Boolean(z)});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllActivity", "private void setErrorVisible(boolean isVisible)", "20180112");
        if (this.mErrorView == null) {
            View findViewById = getActivity().findViewById(R.id.mytaobao_favCategory_load_fail);
            this.mErrorView = findViewById;
            findViewById.setVisibility(0);
            ((Button) this.mErrorView.findViewById(R.id.reload)).setOnClickListener(new a());
        }
        if (z) {
            this.mErrorView.setVisibility(0);
        } else {
            this.mErrorView.setVisibility(8);
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllActivity", "protected void onCreate(Bundle savedInstanceState)", "20180112");
        super.onCreate(bundle);
        setContentView(R.layout.favorite_category_dialog_all_activity);
        if (getIntent() != null) {
            this.itemId = pyu.a(getIntent().getData()).get(FavTemplateConstant.ITEM_ID);
        }
        this.list = (TRecyclerView) findViewById(R.id.category_list);
        this.list.setLayoutManager(new LinearLayoutManager(this));
        FavCategoryAllAdapter favCategoryAllAdapter = new FavCategoryAllAdapter(this);
        this.mAdapter = favCategoryAllAdapter;
        this.list.setAdapter(favCategoryAllAdapter);
        getCategoryList(0);
        initActionBar();
        getSupportActionBar().setTitle(getResources().getString(R.string.fav_cat_all_title));
        this.mActionBarOperation.setText(getResources().getString(R.string.fav_cat_detail_edit_finish));
        updateUTPageName("Page_DetailAddCategoryMore");
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a21ay.8180211");
        updatePageProperties(hashMap);
    }

    public void getCategoryList(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0a296a", new Object[]{this, new Integer(i)});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllActivity", "public void getCategoryList(int page)", "20180112");
        ModelSdkBusiness.b(vf3.b("mclaren", 100, 1, 2, i + "")).j().d(Integer.valueOf(i)).e(true).g(1, ComTaobaoMercuryQueryShareListResponse.class, this);
    }

    @Override // com.taobao.favorites.favoritesdk.base.ResultListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllActivity", "public void onError(int requestType, MtopResponse response, Object requestContext)", "20180112");
        if (!a0k.a(this)) {
            hideloadingMaskLayout();
            if (i == 1) {
                setEmptyVisible(false);
                setErrorVisible(true);
            }
            v29.d(mtopResponse.getRetMsg());
        }
    }

    @Override // com.taobao.favorites.favoritesdk.base.ResultListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllActivity", "public void onSuccess(int requestType, MtopResponse response, BaseOutDo pojo, Object requestContext)", "20180112");
        if (!a0k.a(this)) {
            setErrorVisible(false);
            hideloadingMaskLayout();
            if (baseOutDo != null && baseOutDo.getData() != null) {
                if (i == 1) {
                    int intValue = ((Integer) obj).intValue();
                    ComTaobaoMercuryQueryShareListResponseData comTaobaoMercuryQueryShareListResponseData = (ComTaobaoMercuryQueryShareListResponseData) baseOutDo.getData();
                    this.data = comTaobaoMercuryQueryShareListResponseData;
                    if (comTaobaoMercuryQueryShareListResponseData != null) {
                        ArrayList<ComTaobaoMercuryQueryShareListResponseData.ShareListItem> arrayList = comTaobaoMercuryQueryShareListResponseData.resultList;
                        if (arrayList == null || arrayList.size() <= 0) {
                            setEmptyVisible(true);
                            return;
                        }
                        if (intValue == 0) {
                            this.mAdapter.setDataList(arrayList);
                        } else {
                            this.mAdapter.Q(arrayList);
                        }
                        setEmptyVisible(false);
                    }
                } else if (i == 6) {
                    v29.a();
                    finish();
                }
            }
        }
    }

    @Override // com.taobao.favorites.favoritesdk.base.ResultListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryAllActivity", "public void onSystemError(int requestType, MtopResponse response, Object requestContext)", "20180112");
        if (!a0k.a(this)) {
            hideloadingMaskLayout();
            if (i == 1) {
                setEmptyVisible(false);
                setErrorVisible(true);
            }
            if (!mtopResponse.is41XResult()) {
                v29.b(R.string.server_busy);
            }
        }
    }
}
