package com.taobao.infoflow.taobao.subservice.biz.performanceoptimizationservice.image;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.ImageMonitorService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.bqa;
import tb.cfc;
import tb.dvh;
import tb.fve;
import tb.get;
import tb.h6d;
import tb.jtv;
import tb.l1m;
import tb.r8d;
import tb.t2o;
import tb.w1e;
import tb.xle;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ImageMonitorServiceImpl implements ImageMonitorService, r8d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CAMPAIGN_BG_URL = "item.0.smartContent.bgImg";
    private static final String GONGGE_URL0 = "subSection.0.subSection.0.item.0.smartContent.mainPic.img";
    private static final String GONGGE_URL1 = "subSection.0.subSection.1.item.0.smartContent.mainPic.img";
    private static final String GONGGE_URL2 = "subSection.1.subSection.0.item.0.smartContent.mainPic.img";
    private static final String GONGGE_URL3 = "subSection.1.subSection.1.item.0.smartContent.mainPic.img";
    private static final String GUESS_URL = "item.0.smartContent.main_image.imageUrl";
    private static final String TAG = "ImageMonitorServiceImpl";
    private long cacheTime;
    private IContainerDataService<?> mIContainerDataService;
    private IMainLifecycleService mMainLifecycleService;
    private IContainerDataService.a mOnDataProcessListener;
    private h6d mPageLifeCycle;
    private long networkTime;
    private final Map<String, xle> mImageLoadConfigMap = new ConcurrentHashMap();
    private boolean isListenerAdded = false;
    private final Set<ImageMonitorService.a> mImageLoadListener = Collections.synchronizedSet(new HashSet());
    private final AtomicInteger cacheRequestCount = new AtomicInteger(0);
    private final AtomicInteger networkRequestCount = new AtomicInteger(0);
    private final AtomicInteger cacheCount = new AtomicInteger(0);
    private final AtomicInteger networkCount = new AtomicInteger(0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10774a;

        public a(String str) {
            this.f10774a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ImageMonitorServiceImpl.access$000(ImageMonitorServiceImpl.this, this.f10774a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements IContainerDataService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
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
            } else if (iContainerDataModel != null) {
                ImageMonitorServiceImpl.this.registerFirstPageUrls(iContainerDataModel.getBase());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IContainerInnerDataModel f10777a;

        public d(IContainerInnerDataModel iContainerInnerDataModel) {
            this.f10777a = iContainerInnerDataModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ImageMonitorServiceImpl.access$300(ImageMonitorServiceImpl.this, this.f10777a.getSections());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IContainerInnerDataModel f10778a;

        public e(IContainerInnerDataModel iContainerInnerDataModel) {
            this.f10778a = iContainerInnerDataModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ImageMonitorServiceImpl.access$300(ImageMonitorServiceImpl.this, this.f10778a.getSections());
            }
        }
    }

    static {
        t2o.a(491782528);
        t2o.a(488636621);
    }

    public static /* synthetic */ void access$000(ImageMonitorServiceImpl imageMonitorServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aaa8ab0", new Object[]{imageMonitorServiceImpl, str});
        } else {
            imageMonitorServiceImpl.onImageDraw(str);
        }
    }

    public static /* synthetic */ Map access$100(ImageMonitorServiceImpl imageMonitorServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e278ee9c", new Object[]{imageMonitorServiceImpl});
        }
        return imageMonitorServiceImpl.mImageLoadConfigMap;
    }

    public static /* synthetic */ void access$200(ImageMonitorServiceImpl imageMonitorServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53312ae8", new Object[]{imageMonitorServiceImpl});
        } else {
            imageMonitorServiceImpl.removePhenixLifeCycleListener();
        }
    }

    public static /* synthetic */ void access$300(ImageMonitorServiceImpl imageMonitorServiceImpl, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e789e41a", new Object[]{imageMonitorServiceImpl, list});
        } else {
            imageMonitorServiceImpl.onRegisterFirstPageUrlsInner(list);
        }
    }

    private void addImageLoadConfig(SectionModel sectionModel, String str, String str2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be5ed38", new Object[]{this, sectionModel, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = sectionModel.getJSONObject("args");
            if (jSONObject != null) {
                z = TextUtils.equals("1", jSONObject.getString(jtv.S_ARGS_IS_CLIENT_CACHE));
            }
            xle xleVar = new xle();
            xleVar.f31454a = sectionModel.getTemplate().getName();
            xleVar.b = sectionModel.getTemplate().getVersion();
            xleVar.c = str;
            xleVar.d = z;
            xleVar.f = str2;
            String key = getKey(str);
            this.mImageLoadConfigMap.put(key, xleVar);
            fve.e(TAG, "addImageLoadConfig... isCache:" + xleVar.d + " , index:" + xleVar.f + " , key:" + key + " , url:" + str);
        }
    }

    private void addListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20eca425", new Object[]{this});
            return;
        }
        if (this.mMainLifecycleService != null) {
            this.mPageLifeCycle = createPageLifeCycle();
            this.mMainLifecycleService.getPageLifeCycleRegister().a(this.mPageLifeCycle);
        }
        if (this.mIContainerDataService != null) {
            IContainerDataService.a createDataProcessListener = createDataProcessListener();
            this.mOnDataProcessListener = createDataProcessListener;
            this.mIContainerDataService.addDataProcessListener(createDataProcessListener);
        }
    }

    private void addPhenixLifeCycleListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86c1294", new Object[]{this});
        } else if (!this.isListenerAdded) {
            bqa.d(TAG, "addPhenixLifeCycleListener");
            l1m.b().a(this);
            this.isListenerAdded = true;
        }
    }

    private IContainerDataService.a createDataProcessListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.a) ipChange.ipc$dispatch("a5b738e0", new Object[]{this});
        }
        return new c();
    }

    private h6d createPageLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6d) ipChange.ipc$dispatch("8602dec9", new Object[]{this});
        }
        return new b();
    }

    private String getImageUrl(BaseSectionModel<?> baseSectionModel, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb8bf59d", new Object[]{this, baseSectionModel, str});
        }
        String[] split = str.split("\\.");
        String str2 = "";
        JSONObject jSONObject = baseSectionModel;
        if (split == null) {
            return str2;
        }
        while (i < split.length && jSONObject != null) {
            String str3 = split[i];
            if (i != split.length - 1) {
                jSONObject = jSONObject.getJSONObject(str3);
            } else if (jSONObject.get(str3) instanceof String) {
                str2 = (String) jSONObject.get(str3);
            }
            i++;
            jSONObject = jSONObject;
        }
        fve.e(TAG, "getImageUrl...getImageUrl:" + str2);
        return str2;
    }

    private String getKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da3372e6", new Object[]{this, str});
        }
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf > 0) {
            return str.substring(lastIndexOf + 1);
        }
        return str;
    }

    private String getMatchKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47da6c5f", new Object[]{this, str});
        }
        for (String str2 : this.mImageLoadConfigMap.keySet()) {
            if (str != null && str.contains(str2)) {
                return str2;
            }
        }
        return "";
    }

    private void onAllImageLoadFinished(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be6c07c", new Object[]{this, new Boolean(z)});
            return;
        }
        fve.e(TAG, "onAllImageLoadFinished...isCache:" + z + " , count:" + getImageCount(z));
        for (ImageMonitorService.a aVar : this.mImageLoadListener) {
            aVar.a(z);
        }
    }

    private void onCheckListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90648844", new Object[]{this});
        } else if (!isStarted()) {
            this.mImageLoadConfigMap.clear();
            removePhenixLifeCycleListener();
        } else {
            addPhenixLifeCycleListener();
        }
    }

    private void onRegisterFirstPageUrlsInner(List<SectionModel> list) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c940cd6d", new Object[]{this, list});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (list != null) {
            for (SectionModel sectionModel : list) {
                if (sectionModel.getIndex() >= 0 && sectionModel.getIndex() < 7) {
                    if (sectionModel.getTemplate() != null) {
                        str = sectionModel.getTemplate().getName();
                    } else {
                        str = "";
                    }
                    String sectionBizCode = sectionModel.getSectionBizCode();
                    if (!TextUtils.isEmpty(sectionBizCode) && !TextUtils.isEmpty(str)) {
                        if (sectionBizCode.contains("recommend_gongge")) {
                            addImageLoadConfig(sectionModel, getImageUrl(sectionModel, GONGGE_URL0), "-1");
                            addImageLoadConfig(sectionModel, getImageUrl(sectionModel, GONGGE_URL1), "-1");
                            addImageLoadConfig(sectionModel, getImageUrl(sectionModel, GONGGE_URL2), "-1");
                            addImageLoadConfig(sectionModel, getImageUrl(sectionModel, GONGGE_URL3), "-1");
                        } else if (sectionBizCode.contains("guess")) {
                            if (str.contains("recommend_m_r_4_pool_campaign")) {
                                addImageLoadConfig(sectionModel, getImageUrl(sectionModel, CAMPAIGN_BG_URL), String.valueOf(sectionModel.getIndex()));
                            } else {
                                addImageLoadConfig(sectionModel, getImageUrl(sectionModel, GUESS_URL), String.valueOf(sectionModel.getIndex()));
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
            fve.e(TAG, "onUIRefresh cost:" + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    private void removeListeners() {
        IContainerDataService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f34d22", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = this.mMainLifecycleService;
        if (!(iMainLifecycleService == null || this.mPageLifeCycle == null)) {
            iMainLifecycleService.getPageLifeCycleRegister().b(this.mPageLifeCycle);
        }
        IContainerDataService<?> iContainerDataService = this.mIContainerDataService;
        if (iContainerDataService != null && (aVar = this.mOnDataProcessListener) != null) {
            iContainerDataService.removeDataProcessListener(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ImageMonitorService
    public void addImageLoadListener(ImageMonitorService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5c67e", new Object[]{this, aVar});
        } else {
            this.mImageLoadListener.add(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ImageMonitorService
    public int getImageCount(boolean z) {
        AtomicInteger atomicInteger;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("577260f6", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (z) {
            atomicInteger = this.cacheCount;
        } else {
            atomicInteger = this.networkCount;
        }
        return atomicInteger.get();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ImageMonitorService
    public long getImageLoadTimestamp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfa26d6", new Object[]{this, new Boolean(z)})).longValue();
        }
        if (z) {
            return this.cacheTime;
        }
        return this.networkTime;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ImageMonitorService
    public boolean isNeedMonitor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("805dcf6f", new Object[]{this, str})).booleanValue();
        }
        return this.mImageLoadConfigMap.containsKey(getKey(str));
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ImageMonitorService
    public boolean isStarted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a6f3902", new Object[]{this})).booleanValue();
        }
        return dvh.l();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mMainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        this.mIContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        addListeners();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.mImageLoadConfigMap.clear();
        removePhenixLifeCycleListener();
        removeListeners();
    }

    @Override // tb.r8d
    public void onEvent(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b3d9af", new Object[]{this, str, str2, map});
        }
    }

    @Override // tb.r8d
    public void onFinished(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc51179", new Object[]{this, str, str2, map});
            return;
        }
        xle xleVar = this.mImageLoadConfigMap.get(getMatchKey(str2));
        if (xleVar != null && !TextUtils.isEmpty(xleVar.e) && !xleVar.h.get()) {
            dvh.m("onRequestFinished", String.valueOf(System.currentTimeMillis()), xleVar.e);
            bqa.d(TAG, "onFinished...isCache:" + xleVar.d + " , index:" + xleVar.f + " , url:" + xleVar.c);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ImageMonitorService
    public void onImageViewDraw(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bed1936", new Object[]{this, str});
        } else {
            get.a().e(new a(str));
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ImageMonitorService
    public void registerFirstPageUrls(IContainerInnerDataModel<?> iContainerInnerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e72a6c94", new Object[]{this, iContainerInnerDataModel});
            return;
        }
        onCheckListener();
        if (!isStarted() || iContainerInnerDataModel == null) {
            return;
        }
        if (!iContainerInnerDataModel.isRemote()) {
            get.a().e(new d(iContainerInnerDataModel));
        } else if (iContainerInnerDataModel.getPageParams() != null && iContainerInnerDataModel.getPageParams().getPageNum() == 0) {
            get.a().e(new e(iContainerInnerDataModel));
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ImageMonitorService
    public void removeImageLoadListener(ImageMonitorService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b551cf61", new Object[]{this, aVar});
        } else {
            this.mImageLoadListener.remove(aVar);
        }
    }

    private void removePhenixLifeCycleListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6684bcd1", new Object[]{this});
        } else if (this.isListenerAdded) {
            bqa.d(TAG, "removePhenixLifeCycleListener");
            l1m.b().c(this);
            this.isListenerAdded = false;
        }
    }

    @Override // tb.r8d
    public void onRequest(String str, String str2, Map<String, Object> map) {
        String str3;
        AtomicInteger atomicInteger;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e10f665a", new Object[]{this, str, str2, map});
            return;
        }
        xle xleVar = this.mImageLoadConfigMap.get(getMatchKey(str2));
        if (xleVar != null && !xleVar.g) {
            System.currentTimeMillis();
            String c2 = dvh.c(dvh.TASK_1ST_PAGE_IMAGE_LOAD);
            xleVar.e = c2;
            xleVar.g = true;
            dvh.m("template", xleVar.f31454a, c2);
            dvh.m("templateVersion", xleVar.b, xleVar.e);
            if (xleVar.d) {
                str3 = "local_data";
            } else {
                str3 = "network_data";
            }
            dvh.m("requestType", str3, xleVar.e);
            dvh.m("index", xleVar.f, xleVar.e);
            if (xleVar.d) {
                atomicInteger = this.cacheRequestCount;
            } else {
                atomicInteger = this.networkRequestCount;
            }
            int addAndGet = atomicInteger.addAndGet(1);
            fve.e(TAG, "onRequest...count:" + addAndGet + " , isCache:" + xleVar.d + " , index:" + xleVar.f + " , url:" + xleVar.c);
        }
    }

    private void onImageDraw(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a94444b1", new Object[]{this, str});
            return;
        }
        xle xleVar = this.mImageLoadConfigMap.get(getMatchKey(str));
        if (xleVar != null && !TextUtils.isEmpty(xleVar.e) && !xleVar.h.get()) {
            dvh.g(xleVar.e, true);
            xleVar.h.set(true);
            if (xleVar.d) {
                this.cacheTime = System.currentTimeMillis();
                if (this.cacheCount.addAndGet(1) == this.cacheRequestCount.get()) {
                    onAllImageLoadFinished(true);
                }
            } else {
                this.networkTime = System.currentTimeMillis();
                if (this.networkCount.addAndGet(1) == this.networkRequestCount.get()) {
                    onAllImageLoadFinished(false);
                }
            }
            fve.e(TAG, "onImageViewDraw...isCache:" + xleVar.d + " , index:" + xleVar.f + " , url:" + xleVar.c);
        }
    }

    @Override // tb.r8d
    public void onCancel(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74e88eb1", new Object[]{this, str, str2, map});
            return;
        }
        xle xleVar = this.mImageLoadConfigMap.get(getMatchKey(str2));
        if (xleVar != null && !TextUtils.isEmpty(xleVar.e) && !xleVar.h.get()) {
            bqa.d(TAG, "onCancel...isCache:" + xleVar.d + " , index:" + xleVar.f + " , url:" + xleVar.c);
            xleVar.h.set(true);
            dvh.g(xleVar.e, false);
        }
    }

    @Override // tb.r8d
    public void onError(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0e3681", new Object[]{this, str, str2, map});
            return;
        }
        xle xleVar = this.mImageLoadConfigMap.get(getMatchKey(str2));
        if (xleVar != null && !TextUtils.isEmpty(xleVar.e) && !xleVar.h.get()) {
            bqa.d(TAG, "onError...isCache:" + xleVar.d + " , index:" + xleVar.f + " , url:" + xleVar.c);
            xleVar.h.set(true);
            dvh.g(xleVar.e, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements h6d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.h6d
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onDestroyView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onNewIntent(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            }
        }

        @Override // tb.h6d
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
                return;
            }
            ImageMonitorServiceImpl.access$100(ImageMonitorServiceImpl.this).clear();
            ImageMonitorServiceImpl.access$200(ImageMonitorServiceImpl.this);
        }

        @Override // tb.h6d
        public void onRestart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onWillExit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public /* synthetic */ void onColdStartResume() {
        }

        @Override // tb.h6d
        public /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
        }
    }
}
