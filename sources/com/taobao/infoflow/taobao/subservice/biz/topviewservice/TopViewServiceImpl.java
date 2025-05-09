package com.taobao.infoflow.taobao.subservice.biz.topviewservice;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.cfc;
import tb.fve;
import tb.gve;
import tb.m5a;
import tb.obq;
import tb.q5d;
import tb.r1e;
import tb.t2o;
import tb.usg;
import tb.vti;
import tb.w1e;
import tb.wzi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TopViewServiceImpl implements ITopViewService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private cfc mInfoFlowContext;
    private r1e mTopViewResponder;
    private q5d pageBizCallback;
    private final List<ITopViewService.a> mTopViewShowListeners = new CopyOnWriteArrayList();
    private final IContainerDataService.a mDataProcessListener = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void j(w1e w1eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0b6e76", new Object[]{this, w1eVar});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void l(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec3ff412", new Object[]{this, w1eVar, iContainerDataModel});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void m(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e9a5c54", new Object[]{this, w1eVar, iContainerDataModel});
            } else if (TopViewServiceImpl.access$000(TopViewServiceImpl.this) != null) {
                fve.e(obq.SPLASH_BUSINESS_TAG, "TopViewServiceImpl#onFinish-> 更新闪屏数据");
                TopViewServiceImpl.access$000(TopViewServiceImpl.this).c(iContainerDataModel);
                TopViewServiceImpl.access$100(TopViewServiceImpl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements q5d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.q5d
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c696af7", new Object[]{this, str});
                return;
            }
            fve.e(obq.SPLASH_BUSINESS_TAG, "createPageBizCallback->onShowing");
            for (ITopViewService.a aVar : TopViewServiceImpl.access$200(TopViewServiceImpl.this)) {
                aVar.b(str);
            }
        }

        @Override // tb.q5d
        public void onClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e155e360", new Object[]{this});
                return;
            }
            fve.e(obq.SPLASH_BUSINESS_TAG, "createPageBizCallback->onClose");
            for (ITopViewService.a aVar : TopViewServiceImpl.access$200(TopViewServiceImpl.this)) {
                aVar.a();
            }
        }

        @Override // tb.q5d
        public void onCreate() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a extends TypeReference<Map<String, Object>> {
            public a(c cVar) {
            }
        }

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                wzi e = usg.d().e();
                List<String> e2 = e.e();
                if (e2 != null && !e2.isEmpty()) {
                    for (String str : e2) {
                        JSONObject parseObject = JSON.parseObject(str);
                        fve.e(obq.SPLASH_BUSINESS_TAG, "commitBootImageMonitor -> commit");
                        gve.b(parseObject.getString("actionType"), parseObject.getString("sceneType"), (Map) JSON.parseObject(parseObject.getJSONObject("args").toJSONString(), new a(this), new Feature[0]));
                    }
                    fve.e(obq.SPLASH_BUSINESS_TAG, "commitBootImageMonitor -> clear");
                    e.a();
                    return;
                }
                fve.e(obq.SPLASH_BUSINESS_TAG, "commitBootImageMonitor bootImageMonitorList -> isEmpty");
            } catch (Throwable th) {
                fve.c(obq.SPLASH_BUSINESS_TAG, "commitBootImageMonitor -> error", th);
            }
        }
    }

    static {
        t2o.a(491782695);
        t2o.a(488636454);
    }

    public static /* synthetic */ r1e access$000(TopViewServiceImpl topViewServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1e) ipChange.ipc$dispatch("7c4cafe8", new Object[]{topViewServiceImpl});
        }
        return topViewServiceImpl.mTopViewResponder;
    }

    public static /* synthetic */ void access$100(TopViewServiceImpl topViewServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99ac26f", new Object[]{topViewServiceImpl});
        } else {
            topViewServiceImpl.commitBootImageMonitor();
        }
    }

    public static /* synthetic */ List access$200(TopViewServiceImpl topViewServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("36c83bb9", new Object[]{topViewServiceImpl});
        }
        return topViewServiceImpl.mTopViewShowListeners;
    }

    private void commitBootImageMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("661a236f", new Object[]{this});
        } else {
            m5a.a().k(new c());
        }
    }

    private q5d createPageBizCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q5d) ipChange.ipc$dispatch("9291ca74", new Object[]{this});
        }
        return new b();
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService
    public void addTopViewShowListener(ITopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61990951", new Object[]{this, aVar});
        } else {
            this.mTopViewShowListeners.add(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService
    public boolean expendTopViewRecord() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e64c398", new Object[]{this})).booleanValue();
        }
        r1e r1eVar = this.mTopViewResponder;
        if (r1eVar != null) {
            return r1eVar.expendTopViewRecord();
        }
        return false;
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService
    public JSONObject getSubTabSearchBarData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bab9b3d1", new Object[]{this});
        }
        r1e r1eVar = this.mTopViewResponder;
        if (r1eVar != null) {
            return r1eVar.b();
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "TopViewServiceImpl#onCreateService-> TopViewService服务创建");
        this.mInfoFlowContext = cfcVar;
        this.mTopViewResponder = new vti(cfcVar);
        IContainerDataService iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            iContainerDataService.addDataProcessListener(this.mDataProcessListener);
            q5d createPageBizCallback = createPageBizCallback();
            this.pageBizCallback = createPageBizCallback;
            r1e r1eVar = this.mTopViewResponder;
            if (r1eVar != null) {
                r1eVar.a(createPageBizCallback);
            }
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "TopViewServiceImpl#onDestroyService-> TopViewService服务销毁");
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            iContainerDataService.removeDataProcessListener(this.mDataProcessListener);
            r1e r1eVar = this.mTopViewResponder;
            if (r1eVar != null) {
                r1eVar.d(this.pageBizCallback);
                this.mTopViewResponder.onDestroy();
            }
            this.mTopViewShowListeners.clear();
        }
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService
    public void removeTopViewShowListener(ITopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773fe8b4", new Object[]{this, aVar});
        } else {
            this.mTopViewShowListeners.remove(aVar);
        }
    }
}
