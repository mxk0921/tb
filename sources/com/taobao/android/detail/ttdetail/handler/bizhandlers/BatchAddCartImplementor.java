package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ir;
import tb.t2o;
import tb.tgh;
import tb.ze7;
import tb.zre;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BatchAddCartImplementor implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "batchAddCart";

    /* renamed from: a  reason: collision with root package name */
    public final Context f6797a;

    static {
        t2o.a(912261846);
        t2o.a(912261826);
    }

    public BatchAddCartImplementor(Context context, ze7 ze7Var) {
        this.f6797a = context;
    }

    public static /* synthetic */ int b(BatchAddCartImplementor batchAddCartImplementor, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77804591", new Object[]{batchAddCartImplementor, jSONObject})).intValue();
        }
        return batchAddCartImplementor.g(jSONObject);
    }

    public static /* synthetic */ Context c(BatchAddCartImplementor batchAddCartImplementor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("2e2096cb", new Object[]{batchAddCartImplementor});
        }
        return batchAddCartImplementor.f6797a;
    }

    public static /* synthetic */ void d(BatchAddCartImplementor batchAddCartImplementor, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d7834", new Object[]{batchAddCartImplementor, context});
        } else {
            batchAddCartImplementor.e(context);
        }
    }

    public final void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d3b162d", new Object[]{this, context});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("cartRefreshData");
        intent.putExtra("stringifyAddCartResult", "");
        intent.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public final int f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ae2352d", new Object[]{this, str})).intValue();
        }
        try {
            return JSON.parseObject(str).getJSONObject("add").getJSONArray("items").size();
        } catch (Throwable th) {
            tgh.c("BatchAddCartImplementor", "findInParamsAddCartNum exception", th);
            return 0;
        }
    }

    public final int g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b773bbc", new Object[]{this, jSONObject})).intValue();
        }
        try {
            return jSONObject.getJSONArray("cartIds").size();
        } catch (Throwable th) {
            tgh.c("BatchAddCartImplementor", "findOutParamsAddCartNum exception", th);
            return 0;
        }
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null) {
            return false;
        }
        JSONObject a2 = irVar.a();
        if (a2 == null) {
            Toast.makeText(this.f6797a, "小二很忙，系统很累，请稍后重试!p", 0).show();
            return false;
        }
        String string = a2.getString("apiName");
        String string2 = a2.getString("apiVersion");
        String string3 = a2.getString("data");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            Toast.makeText(this.f6797a, "小二很忙，系统很累，请稍后重试!p", 0).show();
            return false;
        }
        final int f = f(string3);
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(string3);
        mtopRequest.setApiName(string);
        mtopRequest.setVersion(string2);
        mtopRequest.setNeedEcode(true);
        mtopRequest.setNeedSession(true);
        RemoteBusiness build = RemoteBusiness.build(mtopRequest);
        build.registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.BatchAddCartImplementor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    error("onError", mtopResponse);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    error("onSystemError", mtopResponse);
                }
            }

            private void error(String str, MtopResponse mtopResponse) {
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9f4ec1e", new Object[]{this, str, mtopResponse});
                    return;
                }
                String str3 = "source=" + str;
                if (mtopResponse != null) {
                    str2 = str3 + ", api=" + mtopResponse.getApi() + ", isApiSuccess=" + mtopResponse.isApiSuccess() + ", ResponseErrorMsg: " + mtopResponse.getRetMsg();
                } else {
                    str2 = str3 + "mtopResponse null";
                }
                tgh.b("BatchAddCartImplementor", str2);
                String str4 = "小二很忙，系统很累，请稍后重试";
                String retMsg = (mtopResponse == null || mtopResponse.is41XResult()) ? str4 : mtopResponse.getRetMsg();
                if (!TextUtils.isEmpty(retMsg)) {
                    str4 = retMsg;
                }
                Toast.makeText(BatchAddCartImplementor.c(BatchAddCartImplementor.this), str4, 0).show();
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                JSONObject jSONObject;
                String str;
                int i2;
                int i3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse == null || mtopResponse.getBytedata() == null || !mtopResponse.isApiSuccess()) {
                    error("onSuccess", mtopResponse);
                } else {
                    try {
                        JSONObject parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
                        if (!(parseObject == null || (jSONObject = parseObject.getJSONObject("data")) == null)) {
                            int b = BatchAddCartImplementor.b(BatchAddCartImplementor.this, jSONObject);
                            if (b > 0 && (i3 = f) > 0 && b == i3) {
                                str = "添加成功，在购物车等亲～";
                            } else if (b > 0 && (i2 = f) > 0 && b < i2) {
                                str = b + "件加购成功，" + (f - b) + "件无法加入购物车，请去购物车查看";
                            } else if (b <= 0) {
                                str = "无法加入购物车，请稍后重试";
                            } else {
                                tgh.b("BatchAddCartImplementor", "批量加购入参数量跟返回数量异常：" + f + " 入参 vs 返回 " + b);
                                str = "数据异常，请稍后重试！";
                            }
                            Toast.makeText(BatchAddCartImplementor.c(BatchAddCartImplementor.this), str, 0).show();
                            BatchAddCartImplementor batchAddCartImplementor = BatchAddCartImplementor.this;
                            BatchAddCartImplementor.d(batchAddCartImplementor, BatchAddCartImplementor.c(batchAddCartImplementor));
                            return;
                        }
                    } catch (Throwable th) {
                        tgh.b("BatchAddCartImplementor", "parse mtopData exception= " + Log.getStackTraceString(th));
                    }
                    Toast.makeText(BatchAddCartImplementor.c(BatchAddCartImplementor.this), "数据异常，请稍后重试！", 0).show();
                }
            }
        });
        build.reqMethod(MethodEnum.POST);
        build.useWua();
        build.setUnitStrategy("UNIT_TRADE");
        build.startRequest();
        return true;
    }
}
