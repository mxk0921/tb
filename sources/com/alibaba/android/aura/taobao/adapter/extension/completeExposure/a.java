package com.alibaba.android.aura.taobao.adapter.extension.completeExposure;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.cg;
import tb.ck;
import tb.ms;
import tb.rbb;
import tb.t2o;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.aspect.lifecycle.exposurereset")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class a extends ms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.android.aura.taobao.adapter.extension.completeExposure.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class C0060a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2149a;
        public Map<String, Object> b;

        static {
            t2o.a(81789034);
        }
    }

    static {
        t2o.a(81789033);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 1335413541) {
            super.beforeFlowExecute((AURAInputData) objArr[0], (cg) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/completeExposure/AURAExposureResetAspectExtension");
    }

    @Override // tb.ms
    public boolean O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47552595", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public List<String> P0(AURARenderComponent aURARenderComponent) {
        AURARenderComponentData aURARenderComponentData;
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4dfcd57a", new Object[]{this, aURARenderComponent});
        }
        if (!(aURARenderComponent == null || (aURARenderComponentData = aURARenderComponent.data) == null || (map = aURARenderComponentData.fields) == null)) {
            Object obj = map.get("accurateExposureOperate");
            if (obj instanceof String) {
                return Arrays.asList(((String) obj).split(","));
            }
        }
        return null;
    }

    @Override // tb.ms, tb.xab
    public void beforeFlowExecute(AURAInputData aURAInputData, cg cgVar) {
        C0060a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f98cb25", new Object[]{this, aURAInputData, cgVar});
            return;
        }
        super.beforeFlowExecute(aURAInputData, cgVar);
        if (L0() == null) {
            ck.g().d("globalData is null");
            return;
        }
        try {
            Map map = (Map) L0().get(AURAExposureCompleteItemEventTriggerExtension.COMPLETE_KEY, Map.class);
            if (map != null && !map.isEmpty()) {
                if ("aura.workflow.adjust".equals(cgVar.a())) {
                    UMFLinkageTrigger uMFLinkageTrigger = (UMFLinkageTrigger) aURAInputData.getData();
                    List<String> P0 = P0(uMFLinkageTrigger.getRenderComponent());
                    if (P0 != null && P0.contains(uMFLinkageTrigger.getAction())) {
                        String triggerComponentKey = uMFLinkageTrigger.getTriggerComponentKey();
                        if (!TextUtils.isEmpty(triggerComponentKey) && (aVar = (C0060a) map.get(triggerComponentKey)) != null) {
                            rbb g = ck.g();
                            g.e("ExposureCompleteItemEventTrigger", triggerComponentKey + " 重置曝光状态");
                            aVar.f2149a = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            ck.g().d("itemModels is null");
        } catch (Throwable th) {
            ck.g().e("AURAExposureResetAspectExtension", th.getMessage());
        }
    }
}
