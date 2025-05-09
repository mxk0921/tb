package com.taobao.tao.topmultitab.service.performance;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;
import tb.bqa;
import tb.bqv;
import tb.cfc;
import tb.hqk;
import tb.lx;
import tb.t2o;
import tb.t4b;
import tb.vsm;
import tb.wcc;
import tb.xcc;
import tb.z9c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PreLoadService extends lx implements IPreLoadService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_UPDATE_REQUEST_TYPE = "coldStart,pullRefresh,userLogin,editionSwitch,hotStart";
    private static final String TAG = "PreloadScheduleBridge";
    private hqk mDataProcessListener;
    private IHomeDataService mDataService;
    private bqv mUserActionStorage;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements hqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.hqk
        public void a(JSONObject jSONObject, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a114a6e", new Object[]{this, jSONObject, iContainerDataModel, str});
            } else if (iContainerDataModel == null) {
                bqa.d(PreLoadService.TAG, "containerDataModel == null");
            } else {
                String string = jSONObject.getString("requestType");
                if (TextUtils.isEmpty(string) || !PreLoadService.DEFAULT_UPDATE_REQUEST_TYPE.contains(string)) {
                    bqa.d(PreLoadService.TAG, "不需要处理的requestType，requestType： " + string);
                    return;
                }
                JSONObject access$000 = PreLoadService.access$000(PreLoadService.this, iContainerDataModel);
                if (access$000 == null) {
                    bqa.d(PreLoadService.TAG, "ext == null");
                    PreLoadService.access$100(PreLoadService.this);
                    return;
                }
                JSONObject access$200 = PreLoadService.access$200(PreLoadService.this);
                if (access$200 == null) {
                    PreLoadService.access$300(PreLoadService.this);
                    bqa.d(PreLoadService.TAG, "updateUserTrackScoreRules preloadConfig == null");
                    return;
                }
                String string2 = access$200.getString("value");
                if (TextUtils.isEmpty(string2)) {
                    PreLoadService.access$400(PreLoadService.this);
                    bqa.d(PreLoadService.TAG, "rules == null");
                    return;
                }
                PreLoadService.access$500(PreLoadService.this, string2);
                PreLoadService.access$600(PreLoadService.this, access$000);
            }
        }

        @Override // tb.hqk
        public void b(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c0a53b0", new Object[]{this, jSONObject, str});
            }
        }
    }

    static {
        t2o.a(729810247);
        t2o.a(729810246);
    }

    public static /* synthetic */ JSONObject access$000(PreLoadService preLoadService, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c984d34", new Object[]{preLoadService, iContainerDataModel});
        }
        return preLoadService.getExt(iContainerDataModel);
    }

    public static /* synthetic */ void access$100(PreLoadService preLoadService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5bee166", new Object[]{preLoadService});
        } else {
            preLoadService.destroyAllTask();
        }
    }

    public static /* synthetic */ JSONObject access$200(PreLoadService preLoadService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ae8c9925", new Object[]{preLoadService});
        }
        return preLoadService.getPreloadConfig();
    }

    public static /* synthetic */ void access$300(PreLoadService preLoadService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("177fa2a4", new Object[]{preLoadService});
        } else {
            preLoadService.destroyAllTask();
        }
    }

    public static /* synthetic */ void access$400(PreLoadService preLoadService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50600343", new Object[]{preLoadService});
        } else {
            preLoadService.destroyAllTask();
        }
    }

    public static /* synthetic */ void access$500(PreLoadService preLoadService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b03d192c", new Object[]{preLoadService, str});
        } else {
            preLoadService.updateUserTrackScoreRules(str);
        }
    }

    public static /* synthetic */ void access$600(PreLoadService preLoadService, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fb7ca8f", new Object[]{preLoadService, jSONObject});
        } else {
            preLoadService.updatePreLoadModel(jSONObject);
        }
    }

    private hqk createDataProcessListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hqk) ipChange.ipc$dispatch("656f8d08", new Object[]{this});
        }
        return new a();
    }

    private JSONObject getExt(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("80696729", new Object[]{this, iContainerDataModel});
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base != null) {
            return base.getExt();
        }
        bqa.d(TAG, "base == null");
        return null;
    }

    private JSONObject getPreloadConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7c3cec1c", new Object[]{this});
        }
        IHomeDataService iHomeDataService = this.mDataService;
        if (iHomeDataService == null) {
            bqa.d(TAG, "mDataService == null");
            return null;
        }
        z9c globalExtModel = iHomeDataService.getGlobalExtModel();
        if (globalExtModel == null) {
            bqa.d(TAG, "globalExtModel == null");
            return null;
        }
        JSONObject e = globalExtModel.e();
        if (e != null) {
            return e.getJSONObject("preloadConfig");
        }
        bqa.d(TAG, "clientABTest == null");
        return null;
    }

    public static /* synthetic */ Object ipc$super(PreLoadService preLoadService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/performance/PreLoadService");
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onCreateService(cfc cfcVar) {
        xcc.a(this, cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterDataProcessorListener();
        unRegisterPreLoadTask();
        this.mUserActionStorage.b();
    }

    public void registerDataProcessorListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6550b200", new Object[]{this});
        } else if (this.mDataService != null) {
            hqk createDataProcessListener = createDataProcessListener();
            this.mDataProcessListener = createDataProcessListener;
            this.mDataService.addDataProcessListener(createDataProcessListener);
        }
    }

    public void unRegisterDataProcessorListener() {
        IHomeDataService iHomeDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef0f1a67", new Object[]{this});
            return;
        }
        hqk hqkVar = this.mDataProcessListener;
        if (hqkVar != null && (iHomeDataService = this.mDataService) != null) {
            iHomeDataService.removeDataProcessListener(hqkVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
            return;
        }
        this.mUserActionStorage = new bqv(wccVar);
        this.mDataService = (IHomeDataService) wccVar.a(IHomeDataService.class);
        this.mUserTrackScore = new t4b(wccVar);
        this.mPreloadService = new vsm(this.mUserTrackScore);
        registerDataProcessorListener();
    }
}
