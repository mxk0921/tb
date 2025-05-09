package com.taobao.umipublish.extension.windvane.abilities;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class MTopAbility extends BaseAbility implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767171);
        t2o.a(589299719);
    }

    public static /* synthetic */ Object ipc$super(MTopAbility mTopAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/MTopAbility");
    }

    public abstract String getErrorCode();

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        String retCode = mtopResponse.getRetCode();
        String retMsg = mtopResponse.getRetMsg();
        String errorCode = getErrorCode();
        errorCallback(errorCode, retCode + "," + retMsg);
    }

    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        String retCode = mtopResponse.getRetCode();
        String retMsg = mtopResponse.getRetMsg();
        String errorCode = getErrorCode();
        errorCallback(errorCode, retCode + "," + retMsg);
    }
}
