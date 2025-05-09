package com.alipay.android.app.render.birdnest.service;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alipay.android.app.cctemplate.utils.DrmUtil;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.android.app.render.birdnest.BirdNestBuilder;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.template.FBContext;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.session.standalone.model.PrepareResult;
import com.flybird.session.standalone.model.PrerenderOptions;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.List;
import org.json.JSONObject;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class BirdNestService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int PRE_RENDER_MAX_CONCURRENT_TASK_NUM = 2;
    private static final int PRE_RENDER_MAX_CONTEXT_NUM = 2;
    public static volatile PrerenderOptions prerenderOptions;
    public ICashierProvider mProvider;

    public BirdNestService() {
    }

    @Deprecated
    public abstract FBContext buildFBContext(BirdNestBuilder birdNestBuilder);

    public abstract PrepareResult buildPrepareResult(BirdNestBuilder birdNestBuilder);

    public ICashierProvider getProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ICashierProvider) ipChange.ipc$dispatch("2dde5263", new Object[]{this});
        }
        return this.mProvider;
    }

    public void initialize(ICashierProvider iCashierProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d90bb9d2", new Object[]{this, iCashierProvider});
        } else {
            this.mProvider = iCashierProvider;
        }
    }

    public abstract boolean onBackPressed(View view);

    public abstract List<JSONObject> releaseResource(int i);

    public BirdNestService(ICashierProvider iCashierProvider) {
        this.mProvider = iCashierProvider;
    }

    public static PrerenderOptions getPrerenderOptions(Context context) {
        Throwable th;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrerenderOptions) ipChange.ipc$dispatch("efa8f8ec", new Object[]{context});
        }
        if (prerenderOptions == null) {
            if (context != null) {
                try {
                    com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(DrmUtil.getRawDrmValueFromKey(context, "bird_nest_pre_rend_options", null));
                    i = parseObject.getIntValue("maxContextNum");
                    try {
                        i2 = parseObject.getIntValue("maxConcurrentTaskNum");
                    } catch (Throwable th2) {
                        th = th2;
                        LogUtils.printExceptionStackTrace(th);
                        i2 = 2;
                        LogUtils.record(2, "BirdNestService:getPrerenderOptions", "maxContextNum:" + i + "maxConcurrentTaskNum:" + i2);
                        prerenderOptions = new PrerenderOptions.Builder().setAllowPrerender(true).setMaxContextNum(i).setMaxConcurrentTaskNum(i2).build();
                        return prerenderOptions;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i = 2;
                }
            } else {
                i2 = 2;
                i = 2;
            }
            LogUtils.record(2, "BirdNestService:getPrerenderOptions", "maxContextNum:" + i + "maxConcurrentTaskNum:" + i2);
            prerenderOptions = new PrerenderOptions.Builder().setAllowPrerender(true).setMaxContextNum(i).setMaxConcurrentTaskNum(i2).build();
        }
        return prerenderOptions;
    }
}
