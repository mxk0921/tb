package com.taobao.tao.infoflow.commonsubservice.recbot.impl;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.commonsubservice.recbot.RecbotServiceImpl;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.t2o;
import tb.yyj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecbotMtopListener implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AtomicBoolean cancelRecbotAdjust = new AtomicBoolean(false);
    private WeakReference<RecbotServiceImpl> recbotServiceWR;

    static {
        t2o.a(729809424);
        t2o.a(589299719);
    }

    public RecbotMtopListener(RecbotServiceImpl recbotServiceImpl) {
        this.recbotServiceWR = new WeakReference<>(recbotServiceImpl);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            onError(i, mtopResponse, obj);
        }
    }

    public void setCancelRecbotAdjust(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("371edf2b", new Object[]{this, new Boolean(z)});
        } else {
            this.cancelRecbotAdjust.set(z);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        RecbotServiceImpl recbotServiceImpl = this.recbotServiceWR.get();
        if (recbotServiceImpl != null) {
            recbotServiceImpl.requestUT(recbotServiceImpl.isRevertOpera, false, false);
            recbotServiceImpl.errorHandle("哎呀没听懂，换个说法试试");
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (!this.cancelRecbotAdjust.get()) {
            RecbotServiceImpl recbotServiceImpl = this.recbotServiceWR.get();
            if (!mtopResponse.isApiSuccess() || !(baseOutDo instanceof RecbotResponse)) {
                str = null;
            } else {
                RecbotDataResult recbotDataResult = (RecbotDataResult) baseOutDo.getData();
                if (recbotDataResult.refresh) {
                    if (recbotServiceImpl != null) {
                        recbotServiceImpl.adjustSuccessTip = recbotDataResult.responseText;
                        recbotServiceImpl.recbotTransmitParams = recbotDataResult.recbotTransmitParams;
                    }
                    yyj.e().O();
                    recbotServiceImpl.requestUT(recbotServiceImpl.isRevertOpera, true, false);
                    return;
                }
                str = recbotDataResult.responseText;
            }
            if (TextUtils.isEmpty(str)) {
                str = "哎呀没听懂，换个说法试试";
            }
            if (recbotServiceImpl != null) {
                recbotServiceImpl.requestUT(recbotServiceImpl.isRevertOpera, false, false);
                recbotServiceImpl.errorHandle(str);
            }
        }
    }
}
