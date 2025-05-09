package com.ali.user.mobile.login.presenter;

import android.os.AsyncTask;
import com.ali.user.mobile.base.BasePresenter;
import com.ali.user.mobile.base.BaseView;
import com.ali.user.mobile.base.helper.SDKExceptionHelper;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.data.RegisterComponent;
import com.ali.user.mobile.exception.RpcException;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.register.model.BaseRegistRequest;
import com.ali.user.mobile.register.model.MtopCountryCodeContextResult;
import com.ali.user.mobile.register.model.MtopRegisterInitcontextResponseData;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.ResourceUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RegionPresenter implements BasePresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LOGIN_REGION = 0;
    public static final int REGISTER_REGION = 1;
    public BaseView mViewer;

    static {
        t2o.a(70254721);
        t2o.a(70254593);
    }

    public RegionPresenter(BaseView baseView) {
        this.mViewer = baseView;
    }

    private void getRegion(final int i, final RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77a8c35e", new Object[]{this, new Integer(i), rpcRequestCallback});
        } else {
            new CoordinatorWrapper().execute(new AsyncTask<Object, Void, MtopRegisterInitcontextResponseData>() { // from class: com.ali.user.mobile.login.presenter.RegionPresenter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/presenter/RegionPresenter$2");
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.AsyncTask
                public MtopRegisterInitcontextResponseData doInBackground(Object[] objArr) {
                    MtopRegisterInitcontextResponseData mtopRegisterInitcontextResponseData;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (MtopRegisterInitcontextResponseData) ipChange2.ipc$dispatch("be6ac604", new Object[]{this, objArr});
                    }
                    HashMap hashMap = new HashMap();
                    BaseRegistRequest baseRegistRequest = new BaseRegistRequest();
                    baseRegistRequest.ext = hashMap;
                    try {
                        if (i == 0) {
                            mtopRegisterInitcontextResponseData = (MtopRegisterInitcontextResponseData) LoginComponent.getInstance().getCountryList();
                        } else {
                            mtopRegisterInitcontextResponseData = RegisterComponent.getInstance().countryCodeRes(baseRegistRequest);
                        }
                        return mtopRegisterInitcontextResponseData;
                    } catch (Throwable th) {
                        th.printStackTrace();
                        return null;
                    }
                }

                public void onPostExecute(MtopRegisterInitcontextResponseData mtopRegisterInitcontextResponseData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9cf645f7", new Object[]{this, mtopRegisterInitcontextResponseData});
                        return;
                    }
                    RpcRequestCallback rpcRequestCallback2 = rpcRequestCallback;
                    if (rpcRequestCallback2 != null) {
                        if (mtopRegisterInitcontextResponseData == null) {
                            rpcRequestCallback2.onError(null);
                        } else if (mtopRegisterInitcontextResponseData.returnValue != 0) {
                            rpcRequestCallback2.onSuccess(mtopRegisterInitcontextResponseData);
                        } else {
                            rpcRequestCallback2.onError(mtopRegisterInitcontextResponseData);
                        }
                    }
                }
            }, new Object[0]);
        }
    }

    @Override // com.ali.user.mobile.base.BasePresenter
    public void onDestory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
        } else {
            this.mViewer = null;
        }
    }

    @Override // com.ali.user.mobile.base.BasePresenter
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    public void region(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd990e8", new Object[]{this, new Integer(i)});
            return;
        }
        BaseView baseView = this.mViewer;
        if (baseView != null && baseView.isActive()) {
            this.mViewer.showLoading();
            getRegion(i, new RpcRequestCallback() { // from class: com.ali.user.mobile.login.presenter.RegionPresenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onError(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                        return;
                    }
                    BaseView baseView2 = RegionPresenter.this.mViewer;
                    if (baseView2 != null && baseView2.isActive()) {
                        RegionPresenter.this.mViewer.dismissLoading();
                        SDKExceptionHelper.getInstance().rpcExceptionHandler(new RpcException((Integer) 6, ""));
                    }
                }

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onSuccess(RpcResponse rpcResponse) {
                    T t;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                        return;
                    }
                    MtopRegisterInitcontextResponseData mtopRegisterInitcontextResponseData = (MtopRegisterInitcontextResponseData) rpcResponse;
                    if (mtopRegisterInitcontextResponseData != null && (t = mtopRegisterInitcontextResponseData.returnValue) != 0 && ((MtopCountryCodeContextResult) t).countrycodes != null) {
                        HashMap<String, Integer> hashMap = new HashMap<>();
                        ArrayList arrayList = new ArrayList();
                        ArrayList<RegionInfo> fillData = CommonUtil.fillData(ResourceUtil.getStringById("aliuser_common_region"), ((MtopCountryCodeContextResult) mtopRegisterInitcontextResponseData.returnValue).countrycodes, hashMap, arrayList);
                        BaseView baseView2 = RegionPresenter.this.mViewer;
                        if (baseView2 != null) {
                            baseView2.dismissLoading();
                            RegionPresenter.this.mViewer.onGetRegion(fillData, hashMap, arrayList);
                        }
                    }
                }
            });
        }
    }
}
