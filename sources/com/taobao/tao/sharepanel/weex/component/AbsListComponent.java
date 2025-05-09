package com.taobao.tao.sharepanel.weex.component;

import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.sharepanel.common.CommonAdapter;
import com.taobao.tao.sharepanel.weex.WeexSharePanel;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;
import java.util.ArrayList;
import java.util.List;
import tb.kp6;
import tb.ma4;
import tb.mi3;
import tb.ogs;
import tb.oj8;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class AbsListComponent extends WXComponent<RecyclerView> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FINAL_CHANCE = 2;
    public boolean customCopy;
    public int dataSetChance;
    public boolean isHasInitData;
    private boolean isImageShare;
    private boolean isNeedAnimate;
    private JSONObject itemStyle;
    public List<ma4> mComponents;
    public kp6 mDataBinder = ((WeexSharePanel) ShareBizAdapter.getInstance().getShareEngine().getCurSharePanel()).f12764a;
    private boolean mIncludeToolFlag;

    static {
        t2o.a(666894583);
    }

    public AbsListComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.customCopy = "true".equals(basicComponentData.getAttrs().get("customCopy"));
        boolean equals = "true".equals(basicComponentData.getAttrs().get("customJump"));
        this.isNeedAnimate = "true".equals(basicComponentData.getAttrs().get("needAnimate"));
        this.isImageShare = "true".equals(basicComponentData.getAttrs().get("imageShare"));
        boolean equals2 = "true".equals(basicComponentData.getAttrs().get("includeTool"));
        this.mIncludeToolFlag = equals2;
        if (this instanceof ShareChannelView) {
            boolean z = this.customCopy;
            ogs.f25380a = z;
            if (equals2) {
                ogs.b = z;
                ogs.c = equals;
            }
        }
        Object obj = basicComponentData.getAttrs().get("itemStyle");
        if (obj != null) {
            this.itemStyle = JSON.parseObject(String.valueOf(obj));
        }
        this.dataSetChance = 0;
    }

    private List<ma4> getComponentList(List<ma4> list) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("98ce022a", new Object[]{this, list});
        }
        if (this.mIncludeToolFlag || !(this instanceof ShareChannelView)) {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        for (ma4 ma4Var : list) {
            if (ma4Var instanceof mi3) {
                mi3 mi3Var = (mi3) ma4Var;
                mi3Var.f = this.isImageShare;
                if (z && mi3Var.g().l()) {
                }
            }
            arrayList.add(ma4Var);
        }
        return arrayList;
    }

    public static /* synthetic */ Object ipc$super(AbsListComponent absListComponent, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/sharepanel/weex/component/AbsListComponent");
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        this.mDataBinder = null;
    }

    public abstract String getComponentKey();

    @WXComponentProp(name = "list")
    public void onComponentData(List<ma4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8533de20", new Object[]{this, list});
            return;
        }
        this.mComponents = getComponentList(list);
        RecyclerView hostView = getHostView();
        if (hostView != null) {
            if (!this.isHasInitData) {
                if (this.isNeedAnimate) {
                    hostView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(hostView.getContext(), R.anim.layout_animation_fall_down));
                }
                CommonAdapter commonAdapter = (CommonAdapter) hostView.getAdapter();
                commonAdapter.O(this.mComponents);
                commonAdapter.notifyDataSetChanged();
            }
            initDone();
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public RecyclerView initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("47255b6e", new Object[]{this, context});
        }
        RecyclerView recyclerView = new RecyclerView(context);
        if (this.isNeedAnimate) {
            recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(recyclerView.getContext(), R.anim.layout_animation_fall_down));
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (this.mComponents == null) {
            this.mComponents = new ArrayList();
        } else {
            this.isHasInitData = true;
        }
        recyclerView.setAdapter(new CommonAdapter(recyclerView.getContext(), this.mComponents, true, this.itemStyle));
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        initDone();
        return recyclerView;
    }

    public void initDone() {
        boolean z = false;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc40d039", new Object[]{this});
            return;
        }
        this.dataSetChance++;
        List<ma4> list = this.mComponents;
        if (list != null && list.size() > 0) {
            z = true;
        }
        if (this.dataSetChance == 2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) getComponentKey());
            if (!z) {
                i = -1;
            }
            jSONObject.put("state", (Object) Integer.valueOf(i));
            oj8.d().c(oj8.DATA_STATE_EVENT, jSONObject);
        }
    }
}
