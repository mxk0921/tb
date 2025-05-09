package com.taobao.infoflow.core.subservice.base.preload;

import android.content.Intent;
import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.preload.PrefetchImageServiceImpl;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel;
import com.taobao.infoflow.protocol.subservice.biz.IPrefetchImageService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.tao.util.ImageStrategyDecider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bqa;
import tb.cfc;
import tb.eue;
import tb.fw5;
import tb.get;
import tb.p2b;
import tb.pb6;
import tb.s0m;
import tb.t2o;
import tb.tlp;
import tb.vaj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PrefetchImageServiceImpl implements IPrefetchImageService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CACHE_SIZE = 10;
    private static final int CACHE_WIDTH_THRESHOLD = pb6.c(eue.a(), 55.0f);
    private static final String SP_KEY = "template_image_size_config_map";
    private static final String TAG = "IPrefetchImageService";
    private LruCache<String, TemplateImageConfig> mImageConfigMap;
    private final AtomicBoolean mIsStopped = new AtomicBoolean(false);
    private IMainLifecycleService mMainLifecycleService;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class TemplateImageConfig extends HashMap<String, Integer> implements Serializable {
        static {
            t2o.a(486539512);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends TypeReference<LinkedHashMap<String, TemplateImageConfig>> {
        public a(PrefetchImageServiceImpl prefetchImageServiceImpl) {
        }
    }

    static {
        t2o.a(486539510);
        t2o.a(488636589);
    }

    private synchronized LruCache<String, TemplateImageConfig> getImageConfigMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("1918884d", new Object[]{this});
        }
        if (this.mImageConfigMap == null) {
            initImageConfig();
        }
        return this.mImageConfigMap;
    }

    private String getTemplateKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea81876", new Object[]{this, str, str2});
        }
        return str + ":" + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveImageWidth$5(String str, String str2, fw5 fw5Var, int i, int i2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5eed88b", new Object[]{this, str, str2, fw5Var, new Integer(i), new Integer(i2), str3});
        } else {
            saveImageWidthInner(str, str2, fw5Var, i, i2, str3);
        }
    }

    private void logDebug(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82e05ac0", new Object[]{this, str});
        } else {
            eue.b();
        }
    }

    private void saveConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b33c26", new Object[]{this});
        } else if (!this.mIsStopped.get()) {
            get.a().e(new Runnable() { // from class: tb.oqm
                @Override // java.lang.Runnable
                public final void run() {
                    PrefetchImageServiceImpl.this.lambda$saveConfig$4();
                }
            });
            IMainLifecycleService iMainLifecycleService = this.mMainLifecycleService;
            if (iMainLifecycleService != null) {
                iMainLifecycleService.getPageLifeCycleRegister().b(this);
            }
        }
    }

    private void saveImageWidthInner(String str, String str2, fw5 fw5Var, int i, int i2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a5cd33", new Object[]{this, str, str2, fw5Var, new Integer(i), new Integer(i2), str3});
            return;
        }
        TemplateImageConfig templateImageConfig = getImageConfigMap().get(str2);
        if (templateImageConfig == null) {
            templateImageConfig = new TemplateImageConfig();
        }
        if (str.contains("recommend_gongge")) {
            templateImageConfig.put("subSection.0.subSection.1.item.0.smartContent.mainPic.img", Integer.valueOf(i));
            templateImageConfig.put("subSection.1.subSection.0.item.0.smartContent.mainPic.img", Integer.valueOf(i));
            templateImageConfig.put("subSection.1.subSection.1.item.0.smartContent.mainPic.img", Integer.valueOf(i));
        } else {
            Iterator it = ((ArrayList) fw5Var.f19569a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    str4 = null;
                    break;
                }
                fw5 fw5Var2 = (fw5) it.next();
                if (!TextUtils.isEmpty(fw5Var2.d)) {
                    if (!fw5Var2.d.endsWith("img") && !fw5Var2.d.endsWith("imageUrl") && !fw5Var2.d.endsWith("mainMarketBenifitBg")) {
                        if (fw5Var2.d.endsWith(vaj.KEY_BG_IMG) && i >= CACHE_WIDTH_THRESHOLD * 2.0f) {
                            str4 = fw5Var2.d;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!TextUtils.isEmpty(str4)) {
                templateImageConfig.put(str4, Integer.valueOf(i));
            } else {
                return;
            }
        }
        getImageConfigMap().put(str2, templateImageConfig);
        logDebug("saveImageWidth...key:" + str2 + " , config:" + templateImageConfig + " url:" + str3 + " , decidedUrl:" + ImageStrategyDecider.decideUrl(str3, Integer.valueOf(i), Integer.valueOf(i2), p2b.IMAGE_STRATEGY_CONFIG));
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
        } else if (this.mMainLifecycleService == null) {
            IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
            this.mMainLifecycleService = iMainLifecycleService;
            if (iMainLifecycleService != null) {
                iMainLifecycleService.getPageLifeCycleRegister().a(this);
            }
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPrefetchImageService, tb.h6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            saveConfig();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPrefetchImageService, tb.h6d
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPrefetchImageService, tb.h6d
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPrefetchImageService, tb.h6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            saveConfig();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPrefetchImageService, tb.h6d
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPrefetchImageService, tb.h6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPrefetchImageService, tb.h6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPrefetchImageService, tb.h6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPrefetchImageService, tb.h6d
    public void onWillExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPrefetchImageService
    public void prefetchImage(BaseSectionModel<?> baseSectionModel, boolean z, int i) {
        BaseTemplateModel template;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b8e5e2", new Object[]{this, baseSectionModel, new Boolean(z), new Integer(i)});
        } else if (!this.mIsStopped.get() && !z && i == 0 && baseSectionModel.getIndex() >= 0 && baseSectionModel.getIndex() < 7 && (template = baseSectionModel.getTemplate()) != null) {
            String templateKey = getTemplateKey(template.getName(), template.getVersion());
            TemplateImageConfig templateImageConfig = getImageConfigMap().get(templateKey);
            logDebug("prefetchImage...biz:" + baseSectionModel.getSectionBizCode() + " , templateKey:" + templateKey + " , index:" + baseSectionModel.getIndex() + " , config:" + templateImageConfig);
            if (!(templateImageConfig == null || templateImageConfig.isEmpty())) {
                for (Map.Entry<String, Integer> entry : templateImageConfig.entrySet()) {
                    prefetchSingleImage(baseSectionModel, templateKey, entry.getKey(), entry.getValue().intValue());
                }
            }
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPrefetchImageService
    public void saveImageWidth(final String str, String str2, String str3, Object obj, final int i, final int i2, final String str4) {
        final fw5 fw5Var;
        List<fw5> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7dcdf3", new Object[]{this, str, str2, str3, obj, new Integer(i), new Integer(i2), str4});
        } else if (!this.mIsStopped.get() && !str.contains("icon_and_miniapp") && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && i > CACHE_WIDTH_THRESHOLD && !TextUtils.isEmpty(str4) && (obj instanceof fw5) && (list = (fw5Var = (fw5) obj).f19569a) != null && !((ArrayList) list).isEmpty()) {
            long j = fw5Var.b;
            if (j == 33556442494L || j == 5326177973899923051L) {
                final String templateKey = getTemplateKey(str2, str3);
                get.a().e(new Runnable() { // from class: tb.pqm
                    @Override // java.lang.Runnable
                    public final void run() {
                        PrefetchImageServiceImpl.this.lambda$saveImageWidth$5(str, templateKey, fw5Var, i, i2, str4);
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initImageConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fef754", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LruCache<String, TemplateImageConfig> lruCache = new LruCache<>(10);
        String b = tlp.b(SP_KEY, null);
        if (!TextUtils.isEmpty(b)) {
            try {
                for (Map.Entry entry : ((LinkedHashMap) JSON.parseObject(b, new a(this), new Feature[0])).entrySet()) {
                    lruCache.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception e) {
                bqa.b("IPrefetchImageService", "getImageConfigMap error", e);
            }
        }
        this.mImageConfigMap = lruCache;
        bqa.d("IPrefetchImageService", "initImageConfig...cost:" + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveConfig$4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0d41833", new Object[]{this});
            return;
        }
        LruCache<String, TemplateImageConfig> lruCache = this.mImageConfigMap;
        if (lruCache != null && lruCache.size() > 0) {
            try {
                String jSONString = JSON.toJSONString(this.mImageConfigMap.snapshot());
                tlp.c(SP_KEY, jSONString);
                bqa.d("IPrefetchImageService", "saveConfig...config:" + jSONString);
            } catch (Exception e) {
                bqa.b("IPrefetchImageService", "saveConfig error", e);
            }
            this.mImageConfigMap = null;
            this.mIsStopped.set(true);
        }
    }

    private void prefetchSingleImage(BaseSectionModel<?> baseSectionModel, String str, String str2, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fadbf184", new Object[]{this, baseSectionModel, str, str2, new Integer(i)});
            return;
        }
        String[] split = str2.split("\\.");
        if (split != null) {
            String str3 = null;
            JSONObject jSONObject = baseSectionModel;
            int i3 = 0;
            while (i2 < split.length && jSONObject != null) {
                String str4 = split[i2];
                if (i2 == split.length - 1) {
                    if (jSONObject.get(str4) instanceof String) {
                        str3 = (String) jSONObject.get(str4);
                    }
                    float floatValue = jSONObject.getFloatValue("aspectRatio");
                    if (floatValue > 0.0f) {
                        i3 = (int) (i / floatValue);
                    }
                } else {
                    jSONObject = jSONObject.getJSONObject(str4);
                }
                i2++;
                jSONObject = jSONObject;
            }
            bqa.d("IPrefetchImageService", "prefetchSingleImage...templateKey:" + str + " , index:" + baseSectionModel.getIndex() + " , imageUrl:" + str3 + " , imageWidth:" + i);
            if (!TextUtils.isEmpty(str3) && i > 0) {
                String decideUrl = ImageStrategyDecider.decideUrl(str3, Integer.valueOf(i), Integer.valueOf(i3), p2b.IMAGE_STRATEGY_CONFIG);
                logDebug("prefetchSingleImage...decidedUrl:" + decideUrl);
                s0m.B().U("homepage-ads", decideUrl).fetch();
            }
        }
    }

    @Override // tb.h6d
    public /* bridge */ /* synthetic */ void onColdStartResume() {
    }

    @Override // tb.h6d
    public /* bridge */ /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }
}
