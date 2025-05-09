package com.taobao.android.shop.features.category;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.activity.ShopCategoryActivity;
import com.taobao.android.shop.features.category.CategoryAdapter;
import com.taobao.android.shop.features.category.data.DataUtil;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.TBTimingUserTrack;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.frp;
import tb.kf3;
import tb.lf3;
import tb.pf3;
import tb.qi8;
import tb.t2o;
import tb.wf3;
import tb.zvu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MCategoryController implements IRemoteBaseListener, CategoryAdapter.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = MCategoryController.class.getSimpleName();
    public static int width;
    private qi8 errorPageManager;
    public View headerview;
    public List<lf3> listdata;
    private CategoryAdapter mAdapter;
    private CategoryDataItem[] mCatInfos;
    private pf3 mCategoryListener;
    private ProgressBar mProgressBar;
    private ViewGroup mRootView;
    private String mUTArgs;
    public StickHeadersRecylerview recyclerView;
    public int tag = -1;
    private CustomBaseActivity mContext = null;
    private String mSellerId = "";
    private String mShopId = "";
    private kf3 mBusiness = null;
    private boolean mIsLoaded = false;
    private boolean mIsDestory = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
                MCategoryController.access$100(MCategoryController.this).c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                MCategoryController.access$100(MCategoryController.this).c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$shop$features$category$data$DataUtil$ContainerType;

        static {
            int[] iArr = new int[DataUtil.ContainerType.values().length];
            $SwitchMap$com$taobao$android$shop$features$category$data$DataUtil$ContainerType = iArr;
            try {
                iArr[DataUtil.ContainerType.ContainerType_Native.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$shop$features$category$data$DataUtil$ContainerType[DataUtil.ContainerType.ContainerType_Weex.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        t2o.a(764411976);
        t2o.a(589299719);
        t2o.a(764411966);
    }

    public MCategoryController(CustomBaseActivity customBaseActivity, ViewGroup viewGroup, String str, String str2) {
        init(customBaseActivity, viewGroup, str, str2);
    }

    public static /* synthetic */ CategoryAdapter access$000(MCategoryController mCategoryController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CategoryAdapter) ipChange.ipc$dispatch("88848aed", new Object[]{mCategoryController});
        }
        return mCategoryController.mAdapter;
    }

    public static /* synthetic */ kf3 access$100(MCategoryController mCategoryController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kf3) ipChange.ipc$dispatch("91ede87b", new Object[]{mCategoryController});
        }
        return mCategoryController.mBusiness;
    }

    private void addView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d22906d", new Object[]{this});
            return;
        }
        int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.SD_44dp);
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.shop_category_group_item_1, (ViewGroup) null);
        inflate.setLayoutParams(new AbsListView.LayoutParams(-1, dimensionPixelSize));
        this.recyclerView.setPinnedHeaderView(inflate);
    }

    private void onWeexData(CategoryData categoryData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9e37d3", new Object[]{this, categoryData});
            return;
        }
        pf3 pf3Var = this.mCategoryListener;
        if (pf3Var != null) {
            ((ShopCategoryActivity) pf3Var).p3(categoryData.url);
        }
    }

    private void processData(CategoryData categoryData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab343c2", new Object[]{this, categoryData});
        } else if (categoryData != null) {
            int i = c.$SwitchMap$com$taobao$android$shop$features$category$data$DataUtil$ContainerType[DataUtil.a(categoryData).ordinal()];
            if (i == 1) {
                showNativeContainer(true);
                showWeexContainer(false);
                onNativeData(categoryData);
            } else if (i == 2) {
                showNativeContainer(false);
                showWeexContainer(true);
                onWeexData(categoryData);
            }
        }
    }

    private void processErr(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ae07", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else if (!this.mIsDestory) {
            if (this.errorPageManager == null) {
                qi8 qi8Var = new qi8(this.mContext, this.mRootView);
                this.errorPageManager = qi8Var;
                qi8Var.b();
            }
            this.errorPageManager.e(mtopResponse, null, null, new a());
            this.mProgressBar.setVisibility(8);
            pf3 pf3Var = this.mCategoryListener;
            if (pf3Var != null) {
                ((ShopCategoryActivity) pf3Var).onError();
            }
            this.mIsLoaded = false;
            CategoryAdapter categoryAdapter = this.mAdapter;
            if (categoryAdapter != null) {
                categoryAdapter.setData(null);
                this.mAdapter.notifyDataSetChanged();
                TBTimingUserTrack.instance().end("Page_Shop_Search", "Page_Shop_Search_Show_Empty");
                TBS.Ext.commitEvent("Shop", 4, "ShopCategory", mtopResponse.getRetCode(), Constants.AVAILABLE_ERROR, this.mUTArgs);
            }
        }
    }

    private void showNativeContainer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d371e0", new Object[]{this, new Boolean(z)});
        } else {
            zvu.b(this.mRootView, R.id.native_container, z);
        }
    }

    private void showWeexContainer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4806a38a", new Object[]{this, new Boolean(z)});
        } else {
            zvu.b(this.mRootView, R.id.weex_container, z);
        }
    }

    private void updateErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2d88b", new Object[]{this});
            return;
        }
        if (this.errorPageManager == null) {
            qi8 qi8Var = new qi8(this.mContext, this.mRootView);
            this.errorPageManager = qi8Var;
            qi8Var.b();
        }
        this.errorPageManager.e(null, null, null, new b());
    }

    @Override // com.taobao.android.shop.features.category.CategoryAdapter.e
    public void OnItemClick(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("680cb626", new Object[]{this, new Integer(i)});
        } else if (this.mCategoryListener != null) {
            if (this.listdata.get(i).d != 2) {
                int i2 = this.listdata.get(i).f;
                TBS.Adv.itemSelectedOnPage("ShopCategory", CT.ListItem, "FirstCategorys", this.listdata.get(i).f);
            } else {
                TBS.Adv.itemSelectedOnPage("ShopCategory", CT.ListItem, "SecCategorys", this.listdata.get(i).f);
            }
            lf3 lf3Var = this.listdata.get(i);
            ((ShopCategoryActivity) this.mCategoryListener).s3(lf3Var.f23308a, lf3Var.b);
        }
    }

    @Override // com.taobao.android.shop.features.category.CategoryAdapter.e
    public void OnItemLongClick(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6074c2", new Object[]{this, new Integer(i)});
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mIsDestory = true;
        this.mCategoryListener = null;
        this.mContext = null;
        CategoryAdapter categoryAdapter = this.mAdapter;
        if (categoryAdapter != null) {
            categoryAdapter.U(null);
            this.mAdapter.destroy();
            this.mAdapter = null;
        }
        kf3 kf3Var = this.mBusiness;
        if (kf3Var != null) {
            kf3Var.a();
            this.mBusiness = null;
        }
        this.recyclerView.setOnScrollListener(null);
        this.recyclerView = null;
    }

    public boolean getIsLoaded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f336b950", new Object[]{this})).booleanValue();
        }
        return this.mIsLoaded;
    }

    public ViewGroup getPageRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("f51a0562", new Object[]{this});
        }
        return this.mRootView;
    }

    public StickHeadersRecylerview getRecylerview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StickHeadersRecylerview) ipChange.ipc$dispatch("9066fdd", new Object[]{this});
        }
        return this.recyclerView;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            processErr(i, mtopResponse, obj);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (!this.mIsDestory) {
            this.mProgressBar.setVisibility(8);
            if (baseOutDo instanceof CategoryResponse) {
                CategoryResponse categoryResponse = (CategoryResponse) baseOutDo;
                qi8 qi8Var = this.errorPageManager;
                if (qi8Var != null) {
                    qi8Var.c();
                }
                pf3 pf3Var = this.mCategoryListener;
                if (pf3Var != null) {
                    ((ShopCategoryActivity) pf3Var).o3();
                }
                this.mIsLoaded = true;
                if (this.mAdapter != null) {
                    if (categoryResponse.getData() == null) {
                        qi8 qi8Var2 = this.errorPageManager;
                        if (qi8Var2 != null) {
                            qi8Var2.f();
                            return;
                        }
                        return;
                    }
                    processData(categoryResponse.getData());
                }
            }
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            processErr(i, mtopResponse, obj);
        }
    }

    public void setCategorySelectionListener(pf3 pf3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e285007f", new Object[]{this, pf3Var});
        } else {
            this.mCategoryListener = pf3Var;
        }
    }

    public void showErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15716ad7", new Object[]{this});
            return;
        }
        updateErrorView();
        zvu.b(this.mRootView, R.id.shop_category_view_progress, false);
    }

    public void startRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb849d4", new Object[]{this});
        } else if (!this.mIsLoaded) {
            this.mIsLoaded = true;
            this.mProgressBar.setVisibility(0);
            this.mBusiness.c();
        }
    }

    private void init(CustomBaseActivity customBaseActivity, ViewGroup viewGroup, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c057f64c", new Object[]{this, customBaseActivity, viewGroup, str, str2});
            return;
        }
        this.mContext = customBaseActivity;
        this.mRootView = viewGroup;
        this.mSellerId = str;
        if (str2 != null) {
            this.mShopId = str2;
        }
        this.mProgressBar = (ProgressBar) viewGroup.findViewById(R.id.shop_category_view_progress);
        kf3 kf3Var = new kf3(this.mSellerId, this.mShopId);
        this.mBusiness = kf3Var;
        kf3Var.b(this);
        width = frp.d();
        this.recyclerView = (StickHeadersRecylerview) this.mRootView.findViewById(R.id.tbsearch_shop_cat_list);
        addView();
        this.recyclerView.setItemAnimator(null);
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(this.mContext, 2);
        this.recyclerView.setHasFixedSize(true);
        CategoryAdapter categoryAdapter = new CategoryAdapter(null, this.mContext);
        this.mAdapter = categoryAdapter;
        categoryAdapter.U(this);
        this.recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener(this) { // from class: com.taobao.android.shop.features.category.MCategoryController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str3, Object... objArr) {
                if (str3.hashCode() == -1177043419) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                }
                int hashCode = str3.hashCode();
                throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode + " in com/taobao/android/shop/features/category/MCategoryController$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                ((StickHeadersRecylerview) recyclerView).configureSuspendView(gridLayoutManager.findFirstVisibleItemPosition());
            }
        });
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.taobao.android.shop.features.category.MCategoryController.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str3, Object... objArr) {
                str3.hashCode();
                int hashCode = str3.hashCode();
                throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode + " in com/taobao/android/shop/features/category/MCategoryController$2");
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("3462f00e", new Object[]{this, new Integer(i)})).intValue();
                }
                if (MCategoryController.access$000(MCategoryController.this) == null) {
                    return 0;
                }
                if (!MCategoryController.access$000(MCategoryController.this).N(i)) {
                    return 2;
                }
                return 1;
            }
        });
        this.recyclerView.setLayoutManager(gridLayoutManager);
        this.recyclerView.setAdapter(this.mAdapter);
        if (!TextUtils.isEmpty(this.mSellerId)) {
            this.mUTArgs = "seller_id=" + this.mSellerId;
        } else if (!TextUtils.isEmpty(this.mShopId)) {
            this.mUTArgs = "shop_id=" + this.mShopId;
        }
    }

    private void onNativeData(CategoryData categoryData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1269429", new Object[]{this, categoryData});
            return;
        }
        this.mCatInfos = categoryData.cats;
        CategoryDataItem categoryDataItem = new CategoryDataItem();
        categoryDataItem.id = "-1";
        categoryDataItem.name = "全部宝贝";
        CategoryDataItem[] categoryDataItemArr = this.mCatInfos;
        if (categoryDataItemArr == null || categoryDataItemArr.length <= 0) {
            TBTimingUserTrack.instance().end("Page_Shop_Search", "Page_Shop_Search_Show_Empty");
            this.mCatInfos = r1;
            CategoryDataItem[] categoryDataItemArr2 = {categoryDataItem};
        } else {
            TBTimingUserTrack.instance().end("Page_Shop_Search", "load");
            ArrayList arrayList = new ArrayList();
            arrayList.add(categoryDataItem);
            for (CategoryDataItem categoryDataItem2 : this.mCatInfos) {
                arrayList.add(categoryDataItem2);
            }
            this.mCatInfos = (CategoryDataItem[]) arrayList.toArray(new CategoryDataItem[0]);
        }
        List<lf3> a2 = wf3.a(this.mCatInfos);
        this.listdata = a2;
        this.mAdapter.setData(a2);
        this.mAdapter.notifyDataSetChanged();
        this.recyclerView.notifyDataChanged(this.listdata);
    }
}
