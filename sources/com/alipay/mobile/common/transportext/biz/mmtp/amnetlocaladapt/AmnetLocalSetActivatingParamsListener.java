package com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt;

import com.alipay.mobile.common.amnet.api.AmnetSetActivatingParamsListener;
import com.alipay.mobile.common.amnet.api.model.ActivatingParams;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.Transport;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetLocalSetActivatingParamsListener implements AmnetSetActivatingParamsListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static AmnetLocalSetActivatingParamsListener f4200a;

    public static final AmnetLocalSetActivatingParamsListener getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetLocalSetActivatingParamsListener) ipChange.ipc$dispatch("4fc3ad6", new Object[0]);
        }
        AmnetLocalSetActivatingParamsListener amnetLocalSetActivatingParamsListener = f4200a;
        if (amnetLocalSetActivatingParamsListener != null) {
            return amnetLocalSetActivatingParamsListener;
        }
        synchronized (AmnetLocalSetActivatingParamsListener.class) {
            try {
                AmnetLocalSetActivatingParamsListener amnetLocalSetActivatingParamsListener2 = f4200a;
                if (amnetLocalSetActivatingParamsListener2 != null) {
                    return amnetLocalSetActivatingParamsListener2;
                }
                AmnetLocalSetActivatingParamsListener amnetLocalSetActivatingParamsListener3 = new AmnetLocalSetActivatingParamsListener();
                f4200a = amnetLocalSetActivatingParamsListener3;
                return amnetLocalSetActivatingParamsListener3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetSetActivatingParamsListener
    public void onAfterSetActivatingParamsEvent(ActivatingParams activatingParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ade096fe", new Object[]{this, activatingParams});
        } else if (activatingParams == null) {
            LogCatUtil.info("AmnetLocalSetActivatingParamsListener", "[onAfterSetActivatingParamsEvent] activatingParams is null.");
        } else {
            Transport.Activating activating = activatingParams.activating;
            if (activating == null) {
                LogCatUtil.info("AmnetLocalSetActivatingParamsListener", "[onAfterSetActivatingParamsEvent] activating is null.");
                return;
            }
            activating.addExtParam(Baggage.Amnet.KEY_SUB_TARGET_TYPE, "1");
            LogCatUtil.info("AmnetLocalSetActivatingParamsListener", "[onAfterSetActivatingParamsEvent] Set finished.");
        }
    }
}
