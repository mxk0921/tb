package com.taobao.android.live.plugin.atype.flexalocal.smartlayer.viewmodel;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant.SmartLayerConstant$SmartErrorCode;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.drd;
import tb.frd;
import tb.g6q;
import tb.l6q;
import tb.s6q;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class SmartLayerViewModel implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public s6q mCurrentModel;
    public g6q mSmartConfig;
    public l6q mSmartContext;
    public boolean isRequesting = false;
    public boolean isCancelled = false;
    private AtomicInteger mRequestIndex = new AtomicInteger(0);
    public HashMap<String, s6q> mStageModels = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements frd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f8676a;
        public final /* synthetic */ String b;
        public final /* synthetic */ drd c;

        public a(int i, String str, drd drdVar) {
            this.f8676a = i;
            this.b = str;
            this.c = drdVar;
        }

        @Override // tb.frd
        public void onFail(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
            } else if (SmartLayerViewModel.access$000(SmartLayerViewModel.this) != null && this.f8676a == SmartLayerViewModel.access$000(SmartLayerViewModel.this).get()) {
                drd drdVar = this.c;
                if (drdVar != null) {
                    drdVar.b(SmartLayerViewModel.this, this.b, str, str2);
                }
                SmartLayerViewModel.this.isRequesting = false;
            }
        }

        @Override // tb.frd
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
            } else if (SmartLayerViewModel.access$000(SmartLayerViewModel.this) != null && this.f8676a == SmartLayerViewModel.access$000(SmartLayerViewModel.this).get()) {
                if (jSONObject != null) {
                    s6q s6qVar = new s6q();
                    s6qVar.f27828a = jSONObject;
                    String str = this.b;
                    SmartLayerViewModel smartLayerViewModel = SmartLayerViewModel.this;
                    smartLayerViewModel.mCurrentModel = s6qVar;
                    smartLayerViewModel.mStageModels.put(str, s6qVar);
                    drd drdVar = this.c;
                    if (drdVar != null) {
                        drdVar.a(SmartLayerViewModel.this, this.b);
                    }
                } else {
                    drd drdVar2 = this.c;
                    if (drdVar2 != null) {
                        SmartLayerViewModel smartLayerViewModel2 = SmartLayerViewModel.this;
                        String str2 = this.b;
                        SmartLayerConstant$SmartErrorCode smartLayerConstant$SmartErrorCode = SmartLayerConstant$SmartErrorCode.ERROR_CONTAINER_VIEW_DATA_EMPTY;
                        drdVar2.b(smartLayerViewModel2, str2, smartLayerConstant$SmartErrorCode.errorCode, smartLayerConstant$SmartErrorCode.errorMessage);
                    }
                }
                SmartLayerViewModel.this.isRequesting = false;
            }
        }
    }

    static {
        t2o.a(295699813);
        t2o.a(806355930);
    }

    public SmartLayerViewModel(l6q l6qVar, g6q g6qVar) {
        this.mSmartContext = l6qVar;
        this.mSmartConfig = g6qVar;
    }

    public static /* synthetic */ AtomicInteger access$000(SmartLayerViewModel smartLayerViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("d832f17a", new Object[]{smartLayerViewModel});
        }
        return smartLayerViewModel.mRequestIndex;
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        this.mRequestIndex.getAndAdd(1);
        this.isCancelled = true;
        this.isRequesting = false;
    }

    public JSONObject getModeDataWithStage(String str) {
        s6q s6qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8250c3a6", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && (s6qVar = this.mStageModels.get(str)) != null) {
            return s6qVar.f27828a;
        }
        return null;
    }

    public s6q getModeWithStage(String str) {
        s6q s6qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s6q) ipChange.ipc$dispatch("d4a5d8f5", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && (s6qVar = this.mStageModels.get(str)) != null) {
            return s6qVar;
        }
        return null;
    }

    public boolean isLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e10043d", new Object[]{this})).booleanValue();
        }
        return this.isRequesting;
    }

    public void load(drd drdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90de365c", new Object[]{this, drdVar});
            return;
        }
        l6q l6qVar = this.mSmartContext;
        if (l6qVar != null) {
            l6qVar.getClass();
            if (!TextUtils.isEmpty("show")) {
                this.mSmartContext.getClass();
            }
        }
        loadWithStage("show", drdVar);
    }

    public void loadAward(drd drdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("542f898d", new Object[]{this, drdVar});
        } else {
            loadWithStage("award", drdVar);
        }
    }

    public void loadWithStage(String str, drd drdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac7d4992", new Object[]{this, str, drdVar});
            return;
        }
        if (isLoading()) {
            cancel();
        }
        this.isRequesting = true;
        requestDataWithStage(str, new a(this.mRequestIndex.get(), str, drdVar));
    }

    public abstract void requestDataWithStage(String str, frd frdVar);
}
