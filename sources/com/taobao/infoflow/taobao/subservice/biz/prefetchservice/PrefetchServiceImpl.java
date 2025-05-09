package com.taobao.infoflow.taobao.subservice.biz.prefetchservice;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.base.IConfigService;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.biz.IPrefetchService;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import tb.cfc;
import tb.fve;
import tb.hfc;
import tb.jve;
import tb.t2o;
import tb.yox;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PrefetchServiceImpl implements IPrefetchService, hfc.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PrefetchServiceImpl";
    private IConfigService mConfigService;
    private IDxItemClickService mDxItemClickService;
    private IDxItemClickService.OnDxClickNavListener mOnDxClickNavListener;
    private long mPrefetchTime = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IDxItemClickService.OnDxClickNavListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.OnDxClickNavListener
        public void onNav(BaseSectionModel baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc943dd5", new Object[]{this, baseSectionModel, baseSubItemModel, bundle, str});
                return;
            }
            fve.e(PrefetchServiceImpl.TAG, "onNav - start");
            if (!PrefetchServiceImpl.access$000(PrefetchServiceImpl.this, baseSectionModel.getSectionBizCode())) {
                fve.e(PrefetchServiceImpl.TAG, "终止预取");
                return;
            }
            String itemBizCode = baseSubItemModel.getItemBizCode();
            PrefetchServiceImpl prefetchServiceImpl = PrefetchServiceImpl.this;
            List access$100 = PrefetchServiceImpl.access$100(prefetchServiceImpl, "itemBizCode_" + itemBizCode);
            if (access$100 == null) {
                List access$300 = PrefetchServiceImpl.access$300(PrefetchServiceImpl.this, baseSubItemModel.getItemBizCode());
                if (access$300 == null || access$300.isEmpty()) {
                    fve.e(PrefetchServiceImpl.TAG, "未命中Orange配置，不执行预取");
                    return;
                }
                fve.e(PrefetchServiceImpl.TAG, "命中Orange配置，预取包名：" + access$300);
                yox.n(access$300);
                PrefetchServiceImpl.access$200(PrefetchServiceImpl.this);
            } else if (access$100.isEmpty()) {
                fve.e(PrefetchServiceImpl.TAG, "命中对照组，不执行预取");
            } else {
                fve.e(PrefetchServiceImpl.TAG, "命中实验组，预取包名：" + access$100);
                yox.n(access$100);
                PrefetchServiceImpl.access$200(PrefetchServiceImpl.this);
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.OnDxClickNavListener
        public void onNavFinished(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad70e197", new Object[]{this, new Boolean(z)});
            }
        }
    }

    static {
        t2o.a(491782619);
        t2o.a(488636590);
        t2o.a(486539308);
    }

    public static /* synthetic */ boolean access$000(PrefetchServiceImpl prefetchServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("693480e0", new Object[]{prefetchServiceImpl, str})).booleanValue();
        }
        return prefetchServiceImpl.curSectionEnabled(str);
    }

    public static /* synthetic */ List access$100(PrefetchServiceImpl prefetchServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6ae5cb2c", new Object[]{prefetchServiceImpl, str});
        }
        return prefetchServiceImpl.getABPrefetchConfig(str);
    }

    public static /* synthetic */ void access$200(PrefetchServiceImpl prefetchServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0ddcd0", new Object[]{prefetchServiceImpl});
        } else {
            prefetchServiceImpl.recordTime();
        }
    }

    public static /* synthetic */ List access$300(PrefetchServiceImpl prefetchServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1e7965ae", new Object[]{prefetchServiceImpl, str});
        }
        return prefetchServiceImpl.getOrangePrefetchConfig(str);
    }

    private IDxItemClickService.OnDxClickNavListener genNavListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDxItemClickService.OnDxClickNavListener) ipChange.ipc$dispatch("a833facf", new Object[]{this});
        }
        return new a();
    }

    private List<String> getABPrefetchConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7786f3a6", new Object[]{this, str});
        }
        VariationSet activate = UTABTest.activate("AB_HomePage_IconClickPrefetch", str);
        Variation variation = activate == null ? null : activate.getVariation("prefetchItem");
        String valueAsString = variation == null ? null : variation.getValueAsString("");
        fve.e(TAG, "当前命中的实验配置: " + valueAsString + ", component=AB_HomePage_IconClickPrefetch, module=" + str + ", args=prefetchItem");
        if (TextUtils.isEmpty(valueAsString)) {
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(valueAsString);
            if (parseObject == null) {
                return Collections.emptyList();
            }
            if (!parseObject.isEmpty() && (parseObject.get("type") instanceof String) && TextUtils.equals(parseObject.getString("type"), "zcache") && (parseObject.get(VideoControllerManager.ARRAY_KEY_RESOURCES) instanceof List)) {
                return (List) parseObject.get(VideoControllerManager.ARRAY_KEY_RESOURCES);
            }
            return Collections.emptyList();
        } catch (Exception e) {
            fve.c(TAG, "解析实验配置出错！", e);
            return Collections.emptyList();
        }
    }

    private List<String> getOrangePrefetchConfig(String str) {
        JSONArray jSONArray;
        Iterator<Object> it;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f5978759", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            fve.e(TAG, "异常：curItemBizCode=" + str);
            return null;
        }
        IConfigService iConfigService = this.mConfigService;
        if (iConfigService == null) {
            fve.e(TAG, "异常：mConfigService==null");
            return null;
        }
        String string = iConfigService.getString("homepageNavPrefetchConfig", null);
        if (TextUtils.isEmpty(string)) {
            fve.e(TAG, "Orange未配置启用预取的item：config=" + string);
            return null;
        }
        fve.e(TAG, "Orange prefetch config = " + string + ", 点击item = " + str);
        try {
            JSONObject parseObject = JSON.parseObject(string);
            JSONObject jSONObject2 = parseObject == null ? null : parseObject.getJSONObject("itemBizCode");
            if (jSONObject2 == null) {
                jSONArray = new JSONArray();
            } else {
                jSONArray = jSONObject2.getJSONArray(str);
            }
            it = jSONArray.iterator();
        } catch (Exception e) {
            fve.c(TAG, "解析Orange预取配置出错！", e);
        }
        do {
            if (it.hasNext()) {
                Object next = it.next();
                if (!(next instanceof JSONObject)) {
                    fve.e(TAG, str + "的Orange配置格式错误！终止预取");
                } else {
                    jSONObject = (JSONObject) next;
                }
            }
            return null;
        } while (!TextUtils.equals(jSONObject.getString("type"), "zcache"));
        return (List) jSONObject.get(VideoControllerManager.ARRAY_KEY_RESOURCES);
    }

    private void recordTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b79845", new Object[]{this});
        } else {
            this.mPrefetchTime = System.currentTimeMillis();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mDxItemClickService = (IDxItemClickService) cfcVar.a(IDxItemClickService.class);
        this.mConfigService = (IConfigService) cfcVar.a(IConfigService.class);
        if (this.mDxItemClickService != null) {
            if (this.mOnDxClickNavListener == null) {
                this.mOnDxClickNavListener = genNavListener();
            }
            this.mDxItemClickService.addDxClickNavListener(this.mOnDxClickNavListener);
        }
        jve.a(this);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IDxItemClickService.OnDxClickNavListener onDxClickNavListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IDxItemClickService iDxItemClickService = this.mDxItemClickService;
        if (!(iDxItemClickService == null || (onDxClickNavListener = this.mOnDxClickNavListener) == null)) {
            iDxItemClickService.removeDxClickNavListener(onDxClickNavListener);
        }
        jve.c(this);
    }

    @Override // tb.hfc.a
    public String onIntercept(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe4e6f2c", new Object[]{this, str});
        }
        if (this.mPrefetchTime < 0) {
            return str;
        }
        String str2 = str + "&hd_zcache_prefetched=" + this.mPrefetchTime;
        this.mPrefetchTime = -1L;
        return str2;
    }

    private boolean curSectionEnabled(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2750fc91", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            fve.e(TAG, "异常：curSection=" + str);
            return false;
        }
        IConfigService iConfigService = this.mConfigService;
        if (iConfigService == null) {
            fve.e(TAG, "异常：mConfigService==null");
            return false;
        }
        String string = iConfigService.getString("htapNavPrefetchEnabledSections", null);
        if (TextUtils.isEmpty(string)) {
            fve.e(TAG, "Orange未配置任何section启用预取：orangeConfig=" + string);
            return false;
        }
        fve.e(TAG, "Orange配置启用预取的section=" + string + ", curSection=" + str);
        try {
            return Arrays.asList(string.split(",")).contains(str);
        } catch (Exception e) {
            fve.c(TAG, "解析Orange配置出错！", e);
            return false;
        }
    }
}
