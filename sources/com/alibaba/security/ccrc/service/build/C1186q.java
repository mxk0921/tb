package com.alibaba.security.ccrc.service.build;

import android.text.TextUtils;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.wukong.model.AlgoResultSample;
import com.alibaba.security.wukong.model.BitmapImageSample;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.security.wukong.plugin.BaseWukongContentRiskPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.q  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1186q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2615a = "AlgoDispatcher";
    public final Ba b;
    public final C1201y c = new C1201y();

    public C1186q(Ba ba) {
        this.b = ba;
    }

    public void a(C c, CCRCRiskSample cCRCRiskSample, CcrcService.Config config, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9f825b7", new Object[]{this, c, cCRCRiskSample, config, new Boolean(z)});
            return;
        }
        if (cCRCRiskSample instanceof AlgoResultSample) {
            AlgoResultSample algoResultSample = (AlgoResultSample) cCRCRiskSample;
            if (algoResultSample.isTriggerHeart()) {
                this.b.a(algoResultSample.getCode());
            }
            if (algoResultSample.isInferDirect()) {
                a(config.getPid(), this.b.b(algoResultSample.getCode()), algoResultSample.getInferResult(), SampleData.transform(cCRCRiskSample));
                return;
            }
        }
        if (this.b.h()) {
            a(config.getPid(), (String) null, a(cCRCRiskSample, "algo config list is empty"), SampleData.transform(cCRCRiskSample));
            return;
        }
        if (cCRCRiskSample instanceof BitmapImageSample) {
            C1168ia a2 = this.c.a(((BitmapImageSample) cCRCRiskSample).getBitmap());
            if (!a2.b()) {
                a(config.getPid(), (String) null, a(cCRCRiskSample, a2.f2597a), SampleData.transform(cCRCRiskSample));
                return;
            }
        }
        a(cCRCRiskSample, c.a(), z);
        a(cCRCRiskSample, config, z);
    }

    private void a(String str, String str2, Map<String, Object> map, SampleData sampleData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73d4e3c", new Object[]{this, str, str2, map, sampleData});
        } else {
            this.b.a(str, str2, map, sampleData);
        }
    }

    private void a(CCRCRiskSample cCRCRiskSample, CcrcService.Config config, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f6a750", new Object[]{this, cCRCRiskSample, config, new Boolean(z)});
        } else if (this.b.j()) {
            a(config.getPid(), (String) null, a(cCRCRiskSample, "low device and mnn not support low device"), SampleData.transform(cCRCRiskSample));
        } else {
            this.b.a(cCRCRiskSample, config, z);
        }
    }

    private void a(CCRCRiskSample cCRCRiskSample, Collection<BaseWukongContentRiskPlugin> collection, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5bb0e2", new Object[]{this, cCRCRiskSample, collection, new Boolean(z)});
            return;
        }
        for (BaseWukongContentRiskPlugin baseWukongContentRiskPlugin : collection) {
            baseWukongContentRiskPlugin.detect(cCRCRiskSample);
        }
    }

    private Map<String, Object> a(CCRCRiskSample cCRCRiskSample, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b0f61fc0", new Object[]{this, cCRCRiskSample, str});
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("_errorMsg", str);
        }
        return hashMap;
    }
}
