package com.taobao.android.detail.ttdetail.skeleton.desc.natives.request;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.MtopRequestParams;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.l6j;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class MtopRequestClient<E extends MtopRequestParams, T> implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context mContext;
    public View mMask;
    public E mParams;
    public RemoteBusiness mRemoteBusiness;
    public WeakReference<l6j<T>> mRequestListenerRef;
    public String mTTID;

    static {
        t2o.a(912262449);
        t2o.a(589299719);
    }

    public MtopRequestClient(E e, String str, l6j<T> l6jVar) {
        this.mParams = e;
        this.mTTID = str;
        this.mRequestListenerRef = new WeakReference<>(l6jVar);
        MtopRequest mtopRequest = new MtopRequest();
        configMtopRequest(mtopRequest);
        RemoteBusiness build = RemoteBusiness.build(mtopRequest, str);
        this.mRemoteBusiness = build;
        configRemoteBusiness(build);
    }

    public void attachOpenTracingContext(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf449002", new Object[]{this, map});
        } else if (map != null && map.size() > 0) {
            this.mRemoteBusiness.setOpenTracingContext(map);
        }
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (this.mRemoteBusiness != null) {
            View view = this.mMask;
            if (view != null) {
                view.setVisibility(8);
            }
            this.mRemoteBusiness.cancelRequest();
        }
    }

    public void configMtopRequest(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17441af", new Object[]{this, mtopRequest});
            return;
        }
        mtopRequest.setData(this.mParams.toData());
        mtopRequest.setApiName(getApiName());
        mtopRequest.setVersion(getApiVersion());
    }

    public void configRemoteBusiness(RemoteBusiness remoteBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e230986f", new Object[]{this, remoteBusiness});
            return;
        }
        remoteBusiness.registeListener((IRemoteListener) this);
        String unitStrategy = getUnitStrategy();
        if (!TextUtils.isEmpty(unitStrategy)) {
            this.mRemoteBusiness.setUnitStrategy(unitStrategy);
        }
        if (isUseWua()) {
            this.mRemoteBusiness.useWua();
        }
    }

    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else if (this.mRemoteBusiness != null) {
            View view = this.mMask;
            if (view != null) {
                view.setVisibility(0);
            }
            this.mRemoteBusiness.asyncRequest();
            MtopRequest mtopRequest = this.mRemoteBusiness.request;
        }
    }

    public abstract String getApiName();

    public abstract String getApiVersion();

    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        return null;
    }

    public boolean isUseWua() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84e1d191", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        View view = this.mMask;
        if (view != null) {
            view.setVisibility(8);
        }
        l6j<T> l6jVar = this.mRequestListenerRef.get();
        if (l6jVar != null) {
            l6jVar.a(mtopResponse);
        }
        new HashMap().put("requestParam", this.mParams);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        View view = this.mMask;
        if (view != null) {
            view.setVisibility(8);
        }
        l6j<T> l6jVar = this.mRequestListenerRef.get();
        if (l6jVar != null) {
            l6jVar.a(mtopResponse);
        }
        new HashMap().put("requestParam", this.mParams);
    }

    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.mContext = context;
        }
    }

    public void setMask(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("784c2ebd", new Object[]{this, view});
        } else {
            this.mMask = view;
        }
    }
}
