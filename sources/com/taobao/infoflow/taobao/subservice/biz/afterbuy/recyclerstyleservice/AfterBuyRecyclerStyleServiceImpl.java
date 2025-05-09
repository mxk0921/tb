package com.taobao.infoflow.taobao.subservice.biz.afterbuy.recyclerstyleservice;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAfterBuyRecyclerStyleService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import tb.bqa;
import tb.cfc;
import tb.get;
import tb.pb6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AfterBuyRecyclerStyleServiceImpl implements IAfterBuyRecyclerStyleService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_BACKGROUND_COLOR = -1;
    private static final int DEFAULT_MARGIN_TOP = 8;
    private static final String TAG = "AfterBuyRecyclerStyleService";
    private String mBackgroundColor;
    private IContainerService mContainerService;
    private cfc mInfoFlowContext;
    private IContainerService.a mOnUiRefreshListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void a(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acfd1f16", new Object[]{this, iUiRefreshActionModel});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void b(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("154ae7b7", new Object[]{this, iUiRefreshActionModel});
                return;
            }
            IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) AfterBuyRecyclerStyleServiceImpl.access$000(AfterBuyRecyclerStyleServiceImpl.this).a(IMainFeedsViewService.class);
            if (iMainFeedsViewService != null) {
                ViewGroup originalView = iMainFeedsViewService.getOriginalView();
                if (originalView instanceof RecyclerView) {
                    AfterBuyRecyclerStyleServiceImpl.access$100(AfterBuyRecyclerStyleServiceImpl.this, iUiRefreshActionModel.getContainerModel(), (RecyclerView) originalView);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f10722a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements View.OnAttachStateChangeListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                    return;
                }
                bqa.d(AfterBuyRecyclerStyleServiceImpl.TAG, "handleRecyclerViewBackgroundColorAndMargin onViewAttachedToWindow");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b.this.f10722a.getLayoutParams();
                if (marginLayoutParams != null) {
                    b bVar = b.this;
                    marginLayoutParams.topMargin = bVar.c;
                    bVar.f10722a.setLayoutParams(marginLayoutParams);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
                } else {
                    bqa.d(AfterBuyRecyclerStyleServiceImpl.TAG, "handleRecyclerViewBackgroundColorAndMargin onViewDetachedFromWindow");
                }
            }
        }

        public b(RecyclerView recyclerView, int i, int i2) {
            this.f10722a = recyclerView;
            this.b = i;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f10722a.setBackgroundColor(this.b);
            ViewGroup.LayoutParams layoutParams = this.f10722a.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).topMargin = this.c;
                this.f10722a.setLayoutParams(layoutParams);
            } else if (layoutParams instanceof RecyclerView.LayoutParams) {
                ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).topMargin = this.c;
                this.f10722a.setLayoutParams(layoutParams);
            } else {
                this.f10722a.addOnAttachStateChangeListener(new a());
            }
        }
    }

    static {
        t2o.a(491782264);
        t2o.a(488636629);
    }

    public static /* synthetic */ cfc access$000(AfterBuyRecyclerStyleServiceImpl afterBuyRecyclerStyleServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("3856c24d", new Object[]{afterBuyRecyclerStyleServiceImpl});
        }
        return afterBuyRecyclerStyleServiceImpl.mInfoFlowContext;
    }

    public static /* synthetic */ void access$100(AfterBuyRecyclerStyleServiceImpl afterBuyRecyclerStyleServiceImpl, IContainerDataModel iContainerDataModel, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f06d3a", new Object[]{afterBuyRecyclerStyleServiceImpl, iContainerDataModel, recyclerView});
        } else {
            afterBuyRecyclerStyleServiceImpl.handleInfoFlowStyle(iContainerDataModel, recyclerView);
        }
    }

    private IContainerService.a createOnUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerService.a) ipChange.ipc$dispatch("17f2bc37", new Object[]{this});
        }
        return new a();
    }

    private void handleRecyclerViewBackgroundColorAndMargin(int i, int i2, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb520574", new Object[]{this, new Integer(i), new Integer(i2), recyclerView});
        } else {
            get.a().h(new b(recyclerView, i, i2));
        }
    }

    private int parseColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("170122f4", new Object[]{this, str})).intValue();
        }
        try {
            return Color.parseColor(str);
        } catch (Throwable th) {
            bqa.b(TAG, "parseColor failed", th);
            return -1;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        IContainerService iContainerService = (IContainerService) cfcVar.a(IContainerService.class);
        this.mContainerService = iContainerService;
        if (iContainerService != null) {
            IContainerService.a createOnUiRefreshListener = createOnUiRefreshListener();
            this.mOnUiRefreshListener = createOnUiRefreshListener;
            this.mContainerService.addUiRefreshListener(createOnUiRefreshListener);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IContainerService iContainerService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IContainerService.a aVar = this.mOnUiRefreshListener;
        if (aVar != null && (iContainerService = this.mContainerService) != null) {
            iContainerService.removeUiRefreshListener(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAfterBuyRecyclerStyleService
    public void setRecyclerViewBackgroundColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("675caa40", new Object[]{this, str});
        } else {
            this.mBackgroundColor = str;
        }
    }

    private void handleInfoFlowStyle(IContainerDataModel<?> iContainerDataModel, RecyclerView recyclerView) {
        IContainerInnerDataModel<?> base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d0ea30", new Object[]{this, iContainerDataModel, recyclerView});
        } else if (recyclerView != null && iContainerDataModel != null && (base = iContainerDataModel.getBase()) != null) {
            JSONObject ext = base.getExt();
            String string = ext.getString("channelBgColor");
            if (string != null) {
                handleRecyclerViewBackgroundColorAndMargin(parseColor(string), 0, recyclerView);
            } else if (TextUtils.equals(ext.getString("removeBannerTitle"), "true")) {
                String str = this.mBackgroundColor;
                int i = 8;
                if (str != null) {
                    handleRecyclerViewBackgroundColorAndMargin(parseColor(str), pb6.c(recyclerView.getContext(), 8), recyclerView);
                } else if (TextUtils.equals(ext.getString("openPostBuyLabStyle"), "true")) {
                    String string2 = ext.getString("backgroundColor");
                    String string3 = ext.getString("marginTop");
                    int parseColor = string2 != null ? parseColor(string2) : -1;
                    if (string3 != null) {
                        i = Integer.parseInt(string3);
                    }
                    handleRecyclerViewBackgroundColorAndMargin(parseColor, pb6.c(recyclerView.getContext(), i), recyclerView);
                }
            }
        }
    }
}
