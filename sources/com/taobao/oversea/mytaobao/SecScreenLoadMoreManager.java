package com.taobao.oversea.mytaobao;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.mytaobao.ultron.model.SecScreenBean;
import com.taobao.oversea.mytaobao.a;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.xrl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SecScreenLoadMoreManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static SecScreenLoadMoreManager d;

    /* renamed from: a  reason: collision with root package name */
    public String f11441a;
    public String b;
    public Map<String, String> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
    }

    public static /* synthetic */ String a(SecScreenLoadMoreManager secScreenLoadMoreManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cae58dfd", new Object[]{secScreenLoadMoreManager});
        }
        return secScreenLoadMoreManager.f11441a;
    }

    public static /* synthetic */ String b(SecScreenLoadMoreManager secScreenLoadMoreManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3e6df9c", new Object[]{secScreenLoadMoreManager});
        }
        return secScreenLoadMoreManager.b;
    }

    public static /* synthetic */ Map c(SecScreenLoadMoreManager secScreenLoadMoreManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9ca7937a", new Object[]{secScreenLoadMoreManager});
        }
        return secScreenLoadMoreManager.c;
    }

    public static SecScreenLoadMoreManager e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecScreenLoadMoreManager) ipChange.ipc$dispatch("b281a0d0", new Object[0]);
        }
        if (d == null) {
            synchronized (SecScreenLoadMoreManager.class) {
                try {
                    if (d == null) {
                        d = new SecScreenLoadMoreManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3936cf6", new Object[]{this});
            return;
        }
        this.f11441a = null;
        this.b = null;
        this.c = null;
    }

    public void f(SecScreenBean secScreenBean, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec1772a4", new Object[]{this, secScreenBean, str});
            return;
        }
        this.f11441a = secScreenBean.apiName;
        this.b = secScreenBean.apiVersion;
        HashMap<String, String> hashMap = secScreenBean.data;
        this.c = hashMap;
        hashMap.put(xrl.ECHO, str);
        if ("true".equals(secScreenBean.data.get("canLoadMore"))) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("canLoadMore", (Object) "true");
            this.c.put("bizParams", jSONObject.toJSONString());
        }
    }

    public void g(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb1d54", new Object[]{this, aVar});
        } else if (!TextUtils.isEmpty(this.f11441a) && aVar != null) {
            Coordinator.execute(new Runnable() { // from class: com.taobao.oversea.mytaobao.SecScreenLoadMoreManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MtopRequest mtopRequest = new MtopRequest();
                    mtopRequest.setApiName(SecScreenLoadMoreManager.a(SecScreenLoadMoreManager.this));
                    mtopRequest.setVersion(SecScreenLoadMoreManager.b(SecScreenLoadMoreManager.this));
                    mtopRequest.setData(JSON.toJSONString(SecScreenLoadMoreManager.c(SecScreenLoadMoreManager.this)));
                    MtopBusiness errorNotifyAfterCache = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication(), TaoHelper.getTTID()), mtopRequest, TaoHelper.getTTID()).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.oversea.mytaobao.SecScreenLoadMoreManager.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                                return;
                            }
                            a aVar2 = aVar;
                            if (aVar2 != null) {
                                ((a.C0647a) aVar2).a(mtopResponse);
                            }
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                            JSONObject jSONObject;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                                return;
                            }
                            JSONObject jSONObject2 = ((JSONObject) JSON.parseObject(mtopResponse.getBytedata(), JSONObject.class, new Feature[0])).getJSONObject("data").getJSONObject("global");
                            if (jSONObject2 != null && jSONObject2.size() > 0 && jSONObject2.containsKey(xrl.ECHO) && (jSONObject = jSONObject2.getJSONObject(xrl.ECHO)) != null) {
                                SecScreenLoadMoreManager.c(SecScreenLoadMoreManager.this).put(xrl.ECHO, jSONObject.toJSONString());
                            }
                            a aVar2 = aVar;
                            if (aVar2 != null) {
                                ((a.C0647a) aVar2).b(mtopResponse, baseOutDo);
                            }
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                                return;
                            }
                            a aVar2 = aVar;
                            if (aVar2 != null) {
                                ((a.C0647a) aVar2).a(mtopResponse);
                            }
                        }
                    }).setErrorNotifyAfterCache(false);
                    errorNotifyAfterCache.reqMethod(MethodEnum.POST);
                    errorNotifyAfterCache.startRequest();
                }
            });
        }
    }
}
