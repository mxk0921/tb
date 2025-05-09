package com.taobao.alimama.net.core.request;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import mtopsdk.mtop.common.ApiID;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopConvert;
import mtopsdk.mtop.util.ReflectUtil;
import tb.lsj;
import tb.m5j;
import tb.msj;
import tb.nw;
import tb.o6j;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MtopRequest extends nw<o6j> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public o6j f6187a;
    public msj b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class CommonMtopListener implements MtopCallback.MtopFinishListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1018167336);
            t2o.a(589299881);
        }

        private CommonMtopListener() {
        }

        @Override // mtopsdk.mtop.common.MtopCallback.MtopFinishListener
        public void onFinished(MtopFinishEvent mtopFinishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("732e17e0", new Object[]{this, mtopFinishEvent, obj});
                return;
            }
            MtopResponse mtopResponse = mtopFinishEvent.getMtopResponse();
            lsj lsjVar = new lsj();
            lsjVar.f23544a = mtopResponse.getRetCode();
            lsjVar.b = mtopResponse.getRetMsg();
            if (mtopResponse.isApiSuccess()) {
                lsjVar.c = MtopConvert.jsonToOutputDO(mtopResponse.getBytedata(), MtopRequest.b(MtopRequest.this).o());
            }
            if (MtopRequest.c(MtopRequest.this) != null) {
                MtopRequest.c(MtopRequest.this).a(lsjVar);
            }
            MtopRequest.d(MtopRequest.this, null);
        }
    }

    static {
        t2o.a(1018167334);
    }

    public static /* synthetic */ o6j b(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o6j) ipChange.ipc$dispatch("de7ca57d", new Object[]{mtopRequest});
        }
        return mtopRequest.f6187a;
    }

    public static /* synthetic */ msj c(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (msj) ipChange.ipc$dispatch("1077e7fc", new Object[]{mtopRequest});
        }
        return mtopRequest.b;
    }

    public static /* synthetic */ ApiID d(MtopRequest mtopRequest, ApiID apiID) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiID) ipChange.ipc$dispatch("c7f7e77c", new Object[]{mtopRequest, apiID});
        }
        mtopRequest.getClass();
        return apiID;
    }

    public static /* synthetic */ Object ipc$super(MtopRequest mtopRequest, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/net/core/request/MtopRequest");
    }

    /* renamed from: e */
    public void a(o6j o6jVar, msj msjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8d6a0e", new Object[]{this, o6jVar, msjVar});
            return;
        }
        this.f6187a = o6jVar;
        this.b = msjVar;
        mtopsdk.mtop.domain.MtopRequest inputDoToMtopRequest = MtopConvert.inputDoToMtopRequest((Object) o6jVar.n());
        if (o6jVar.m() != null && !o6jVar.m().isEmpty()) {
            if (inputDoToMtopRequest.dataParams == null) {
                inputDoToMtopRequest.dataParams = new HashMap();
            }
            inputDoToMtopRequest.dataParams.putAll(o6jVar.m());
            inputDoToMtopRequest.setData(ReflectUtil.convertMapToDataStr(inputDoToMtopRequest.dataParams));
        }
        m5j.a().b().build(inputDoToMtopRequest, (String) null).addListener(new CommonMtopListener()).asyncRequest();
    }
}
