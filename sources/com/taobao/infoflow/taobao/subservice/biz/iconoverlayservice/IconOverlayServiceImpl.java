package com.taobao.infoflow.taobao.subservice.biz.iconoverlayservice;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IIconOverlayService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import tb.cfc;
import tb.fve;
import tb.h6c;
import tb.sgc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class IconOverlayServiceImpl implements IIconOverlayService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "IconOverlayServiceImpl";
    private sgc.b mItemRenderListener;
    private IMainFeedsViewService<?> mMainFeedsViewService;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements sgc.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.sgc.b
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
            }
        }

        @Override // tb.sgc.b
        public void h(int i, View view, BaseSectionModel baseSectionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab94fc2e", new Object[]{this, new Integer(i), view, baseSectionModel});
            } else {
                IconOverlayServiceImpl.access$000(IconOverlayServiceImpl.this, i, view, baseSectionModel);
            }
        }

        @Override // tb.sgc.b
        public void i(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe58018e", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
            }
        }

        @Override // tb.sgc.b
        public void o(int i, View view, BaseSectionModel baseSectionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4bbbcc6", new Object[]{this, new Integer(i), view, baseSectionModel});
            }
        }
    }

    static {
        t2o.a(491782398);
        t2o.a(488636568);
    }

    public static /* synthetic */ void access$000(IconOverlayServiceImpl iconOverlayServiceImpl, int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbcabe67", new Object[]{iconOverlayServiceImpl, new Integer(i), view, baseSectionModel});
        } else {
            iconOverlayServiceImpl.hideIconOverlay(i, view, baseSectionModel);
        }
    }

    private sgc.b createOnItemRenderListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sgc.b) ipChange.ipc$dispatch("2df3f22b", new Object[]{this});
        }
        return new a();
    }

    private String getClientCache(BaseSectionModel baseSectionModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4a6c786", new Object[]{this, baseSectionModel, str});
        }
        return getClientCacheFromModel(baseSectionModel).getString(str);
    }

    private JSONObject getClientCacheFromModel(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3ec31ccd", new Object[]{this, baseSectionModel});
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext == null) {
            ext = new JSONObject();
            baseSectionModel.put("ext", (Object) ext);
        }
        JSONObject jSONObject = ext.getJSONObject("clientCache");
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        ext.put("clientCache", (Object) jSONObject2);
        return jSONObject2;
    }

    private void hideIconOverlay(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0467b3", new Object[]{this, new Integer(i), view, baseSectionModel});
        } else if (baseSectionModel != null) {
            try {
                if (TextUtils.equals(getClientCache(baseSectionModel, "iconOverylayVisibility"), "visible")) {
                    String clientCache = getClientCache(baseSectionModel, "iconOverylayUserId");
                    if ((view instanceof ViewGroup) && !TextUtils.isEmpty(clientCache)) {
                        setClientCache(baseSectionModel, "iconOverylayVisibility", "gone");
                        refreshWidgetNode((ViewGroup) view, clientCache);
                    }
                }
            } catch (Exception e) {
                fve.e(TAG, "hide iconOverlay failed!" + e.toString());
            }
        }
    }

    private void refreshWidgetNode(ViewGroup viewGroup, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67431f1", new Object[]{this, viewGroup, str});
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DXRootView) {
                DXWidgetNode queryWidgetNodeByUserId = ((DXRootView) childAt).getExpandWidgetNode().queryWidgetNodeByUserId(str);
                if (queryWidgetNodeByUserId != null) {
                    queryWidgetNodeByUserId.setNeedParse(new DXWidgetRefreshOption.a().d(true).g(true).a());
                    return;
                }
                fve.e(TAG, "item not found!");
            }
        }
    }

    private void setClientCache(BaseSectionModel<?> baseSectionModel, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7aa2918", new Object[]{this, baseSectionModel, str, str2});
        } else {
            getClientCacheFromModel(baseSectionModel).put(str, (Object) str2);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.mMainFeedsViewService = iMainFeedsViewService;
        if (iMainFeedsViewService == null) {
            fve.e(TAG, "no validate feedsViewService!");
            return;
        }
        h6c lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister();
        if (this.mItemRenderListener == null) {
            this.mItemRenderListener = createOnItemRenderListener();
        }
        lifeCycleRegister.y(this.mItemRenderListener);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mMainFeedsViewService;
        if (iMainFeedsViewService != null && this.mItemRenderListener != null) {
            iMainFeedsViewService.getLifeCycleRegister().q(this.mItemRenderListener);
        }
    }
}
