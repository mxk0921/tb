package com.taobao.taopai.material.request.materialdetail;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taopai.material.bean.MaterialDetail;
import com.taobao.taopai.material.request.base.BaseMaterialBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.g8i;
import tb.t2o;
import tb.v7i;
import tb.zqc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MaterialDetailBusiness extends BaseMaterialBusiness<MaterialDetail> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MaterialByIdBusiness";
    private zqc mListener;
    private v7i mParams;
    private RemoteBusiness mRemoteBusiness;

    static {
        t2o.a(782237801);
    }

    public MaterialDetailBusiness(v7i v7iVar, zqc zqcVar) {
        super(v7iVar, zqcVar);
        this.mParams = v7iVar;
        this.mListener = zqcVar;
    }

    public static /* synthetic */ Object ipc$super(MaterialDetailBusiness materialDetailBusiness, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -743105213:
                super.onSystemError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                return null;
            case -662674828:
                super.onError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                return null;
            case 1887430145:
                super.cancel();
                return null;
            case 2057952281:
                super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai/material/request/materialdetail/MaterialDetailBusiness");
        }
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        super.cancel();
        RemoteBusiness remoteBusiness = this.mRemoteBusiness;
        if (remoteBusiness != null) {
            remoteBusiness.cancelRequest();
        }
        this.mListener = null;
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public String getCacheFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d638f6c", new Object[]{this});
        }
        return "";
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public String getUtRequestKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a583454", new Object[]{this});
        }
        return "detail_by_id";
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness, com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        super.onError(i, mtopResponse, obj);
        g8i.a(this.mListener, mtopResponse, "error_response_null");
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        super.onSuccess(i, mtopResponse, baseOutDo, obj);
        zqc zqcVar = this.mListener;
        if (zqcVar != null) {
            if (mtopResponse == null) {
                zqcVar.onFail("success_response_null", "");
            } else if (!(baseOutDo instanceof MaterialDetailResponse) || baseOutDo.getData() == null) {
                zqc zqcVar2 = this.mListener;
                String retCode = mtopResponse.getRetCode();
                zqcVar2.onFail(retCode, "success data == null," + mtopResponse.toString());
            } else {
                this.mListener.o(((MaterialDetailResponse) baseOutDo).getData().getModel());
            }
        }
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness, com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        super.onSystemError(i, mtopResponse, obj);
        g8i.a(this.mListener, mtopResponse, "system_error_response_null");
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public void requestNet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1c8e15", new Object[]{this});
            return;
        }
        MaterialDetailRequest materialDetailRequest = new MaterialDetailRequest();
        materialDetailRequest.setMaterialId(this.mParams.j());
        RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) materialDetailRequest);
        this.mRemoteBusiness = build;
        build.registeListener((IRemoteListener) this);
        this.mRemoteBusiness.reqMethod(MethodEnum.GET);
        this.mRemoteBusiness.startRequest(MaterialDetailResponse.class);
    }

    public void handleCacheLoaded(MaterialDetail materialDetail) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d5d200", new Object[]{this, materialDetail});
            return;
        }
        zqc zqcVar = this.mListener;
        if (zqcVar != null) {
            zqcVar.o(materialDetail);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public MaterialDetail parseCacheData(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MaterialDetail) ipChange.ipc$dispatch("8866f1c6", new Object[]{this, str}) : (MaterialDetail) JSON.parseObject(str, MaterialDetail.class);
    }
}
