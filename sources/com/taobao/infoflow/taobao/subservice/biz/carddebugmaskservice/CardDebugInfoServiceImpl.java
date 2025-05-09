package com.taobao.infoflow.taobao.subservice.biz.carddebugmaskservice;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardDebugInfoService;
import com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.taobao.R;
import tb.cfc;
import tb.eue;
import tb.fve;
import tb.j93;
import tb.pb6;
import tb.sgc;
import tb.t2o;
import tb.zn4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class CardDebugInfoServiceImpl implements ICardDebugInfoService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEBUG_INFO = "debugInfo";
    private static final String SUFFIX_INDEX_VIEW_ID = "indexView_";
    private static final String TAG = "CardDebugInfoServiceImpl";
    private cfc mInfoFlowContext;
    private sgc.b onItemRenderListener;

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
            }
        }

        @Override // tb.sgc.b
        public void i(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe58018e", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
            } else if (z) {
                CardDebugInfoServiceImpl.access$000(CardDebugInfoServiceImpl.this, view, baseSectionModel, i);
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
        t2o.a(491782293);
        t2o.a(488636539);
    }

    public static /* synthetic */ void access$000(CardDebugInfoServiceImpl cardDebugInfoServiceImpl, View view, BaseSectionModel baseSectionModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2878a0fb", new Object[]{cardDebugInfoServiceImpl, view, baseSectionModel, new Integer(i)});
        } else {
            cardDebugInfoServiceImpl.addDebugInfoViews(view, baseSectionModel, i);
        }
    }

    private void addCardIndexInfo(View view, BaseSectionModel baseSectionModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d13887f", new Object[]{this, view, baseSectionModel, new Integer(i)});
        } else if (!j93.a(baseSectionModel) && view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup instanceof FrameLayout) {
                TextView textView = (TextView) viewGroup.findViewWithTag(SUFFIX_INDEX_VIEW_ID);
                if (textView == null) {
                    textView = new TextView(view.getContext());
                }
                textView.setTextColor(-65536);
                textView.setBackgroundColor(Color.parseColor("#76F709"));
                textView.setAlpha(0.5f);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                int c = pb6.c(view.getContext(), 3.0f);
                layoutParams.setMargins(c, c, c, c);
                int cardIndexFromSection = getCardIndexFromSection(i);
                if (cardIndexFromSection >= 0) {
                    textView.setText(String.valueOf(cardIndexFromSection));
                    textView.setTag(SUFFIX_INDEX_VIEW_ID);
                    ViewParent parent = textView.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(textView);
                    }
                    if (textView.getParent() == null) {
                        viewGroup.addView(textView, layoutParams);
                    }
                }
            }
        }
    }

    private void addDebugInfoViews(View view, BaseSectionModel baseSectionModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c096d7fe", new Object[]{this, view, baseSectionModel, new Integer(i)});
        } else if (eue.b()) {
            addCardIndexInfo(view, baseSectionModel, i);
            attachAiDebugInfoMask(view, baseSectionModel);
        }
    }

    private sgc.b createItemLifeCycleListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sgc.b) ipChange.ipc$dispatch("1c8e7662", new Object[]{this});
        }
        return new a();
    }

    private String getAiDebugInfoString(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3860999d", new Object[]{this, baseSectionModel});
        }
        if (baseSectionModel == null || baseSectionModel.getExposureParam() == null || baseSectionModel.getExposureParam().getArgs() == null || baseSectionModel.getExposureParam().getArgs().getJSONObject(DEBUG_INFO) == null) {
            return "";
        }
        JSONObject jSONObject = baseSectionModel.getExposureParam().getArgs().getJSONObject(DEBUG_INFO);
        StringBuilder sb = new StringBuilder();
        for (String str : jSONObject.keySet()) {
            sb.append(str);
            sb.append(":");
            sb.append(jSONObject.get(str));
            sb.append("\n");
        }
        return sb.toString();
    }

    private int getCardIndexFromSection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("324a4960", new Object[]{this, new Integer(i)})).intValue();
        }
        if (zn4.a(this.mInfoFlowContext.getContainerType().getContainerId())) {
            return i;
        }
        IFirstScreenDataService iFirstScreenDataService = (IFirstScreenDataService) this.mInfoFlowContext.a(IFirstScreenDataService.class);
        if (iFirstScreenDataService == null) {
            return -1;
        }
        int recStartIndex = iFirstScreenDataService.getRecStartIndex();
        if (recStartIndex == -1) {
            recStartIndex = 3;
        }
        return i - recStartIndex;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        fve.e(TAG, "CardDebugMaskServiceImpl create");
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.mInfoFlowContext.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            this.onItemRenderListener = createItemLifeCycleListener();
            iMainFeedsViewService.getLifeCycleRegister().y(this.onItemRenderListener);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.mInfoFlowContext.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            iMainFeedsViewService.getLifeCycleRegister().q(this.onItemRenderListener);
            fve.e(TAG, "CardDebugMaskServiceImpl onDestroy");
        }
    }

    private void attachAiDebugInfoMask(View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28d638d3", new Object[]{this, view, baseSectionModel});
        } else if (view == null) {
            fve.e(TAG, "not in debug env");
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            TextView textView = (TextView) LayoutInflater.from(view.getContext()).inflate(R.layout.card_ai_debug_mask, (ViewGroup) null);
            if (textView == null) {
                fve.e(TAG, "create maskView failed");
                return;
            }
            textView.setLayoutParams(view.getLayoutParams());
            String aiDebugInfoString = getAiDebugInfoString(baseSectionModel);
            if (!TextUtils.isEmpty(aiDebugInfoString)) {
                textView.setText(aiDebugInfoString);
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            viewGroup.addView(textView);
            fve.e(TAG, "bindDebugInfoData, maskView:" + System.identityHashCode(textView) + ", debugInfoStr:" + aiDebugInfoString);
        }
    }
}
