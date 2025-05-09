package com.taobao.android.change.app.icon.utils;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.mtop.ChangeAppIconMtopRequest;
import com.taobao.android.change.app.icon.mtop.ChangeAppIconMtopResponse;
import com.taobao.android.change.app.icon.mtop.ChangeAppIconRequest;
import com.taobao.login4android.Login;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.HashMap;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.fqt;
import tb.hxv;
import tb.qh3;
import tb.t2o;
import tb.t4v;
import tb.ubl;
import tb.wh3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MtopUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ChangeAppIconRequest f6525a;
        public final /* synthetic */ wh3 b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.change.app.icon.utils.MtopUtils$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C0344a implements wh3 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0344a() {
            }

            @Override // tb.wh3
            public void a(ChangeAppIconMtopResponse changeAppIconMtopResponse) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4ecbbf69", new Object[]{this, changeAppIconMtopResponse});
                    return;
                }
                AdapterForTLog.loge(qh3.TAG, "sendChangeAppIconInfo fail");
                wh3 wh3Var = a.this.b;
                if (wh3Var != null) {
                    wh3Var.a(changeAppIconMtopResponse);
                }
            }

            @Override // tb.wh3
            public void b(ChangeAppIconMtopResponse changeAppIconMtopResponse) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e6a7254e", new Object[]{this, changeAppIconMtopResponse});
                    return;
                }
                AdapterForTLog.loge(qh3.TAG, "sendChangeAppIconInfo success");
                wh3 wh3Var = a.this.b;
                if (wh3Var != null) {
                    wh3Var.b(changeAppIconMtopResponse);
                }
            }
        }

        public a(ChangeAppIconRequest changeAppIconRequest, wh3 wh3Var) {
            this.f6525a = changeAppIconRequest;
            this.b = wh3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                boolean checkSessionValid = Login.checkSessionValid();
                AdapterForTLog.loge(qh3.TAG, "sendChangeAppIconInfo checkSessionValid:" + checkSessionValid);
                if (checkSessionValid) {
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(this.f6525a.errorMsg)) {
                        String str = this.f6525a.errorMsg;
                        this.f6525a.errorMsg = hxv.h(str, ubl.b(ubl.ORANGE_KEY_CHANGE_APP_ICON_ERROR_MSG_MTOP_MAX_LENGTH, 20));
                        hashMap.put("error", hxv.d(str));
                    }
                    String jSONString = JSON.toJSONString(this.f6525a);
                    t4v.a(t4v.PAGE_NAME, "mtop", "requestInfo:" + jSONString, this.f6525a.status, hashMap);
                    ChangeAppIconMtopRequest changeAppIconMtopRequest = new ChangeAppIconMtopRequest();
                    changeAppIconMtopRequest.API_NAME = "mtop.taobao.tlens.icon.log.upload";
                    changeAppIconMtopRequest.VERSION = "1.0";
                    changeAppIconMtopRequest.addParam("request", jSONString);
                    MtopUtils.d(changeAppIconMtopRequest, ChangeAppIconMtopResponse.class, Login.getUserId(), new C0344a());
                }
            } catch (Throwable th) {
                AdapterForTLog.loge(qh3.TAG, "sendChangeAppIconInfo error", th);
                wh3 wh3Var = this.b;
                if (wh3Var != null) {
                    wh3Var.a(null);
                }
            }
        }
    }

    static {
        t2o.a(284164121);
    }

    public static /* synthetic */ ChangeAppIconMtopResponse a(MtopResponse mtopResponse, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChangeAppIconMtopResponse) ipChange.ipc$dispatch("2a41310a", new Object[]{mtopResponse, cls});
        }
        return c(mtopResponse, cls);
    }

    public static MtopRequest b(ChangeAppIconMtopRequest changeAppIconMtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("7a1b9e32", new Object[]{changeAppIconMtopRequest});
        }
        if (changeAppIconMtopRequest == null) {
            return null;
        }
        try {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(changeAppIconMtopRequest.API_NAME);
            mtopRequest.setVersion(changeAppIconMtopRequest.VERSION);
            mtopRequest.setNeedEcode(changeAppIconMtopRequest.NEED_ECODE);
            mtopRequest.setNeedSession(changeAppIconMtopRequest.NEED_SESSION);
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < changeAppIconMtopRequest.paramNames.size(); i++) {
                if (!(changeAppIconMtopRequest.paramNames.get(i) == null || changeAppIconMtopRequest.paramValues.get(i) == null)) {
                    jSONObject.put(changeAppIconMtopRequest.paramNames.get(i), changeAppIconMtopRequest.paramValues.get(i).toString());
                }
            }
            mtopRequest.setData(jSONObject.toString());
            return mtopRequest;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static <T extends ChangeAppIconMtopResponse<?>> T c(MtopResponse mtopResponse, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ChangeAppIconMtopResponse) ipChange.ipc$dispatch("fffe80b3", new Object[]{mtopResponse, cls}));
        }
        try {
            JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
            if (dataJsonObject != null) {
                return (T) ((ChangeAppIconMtopResponse) JSON.parseObject(dataJsonObject.toString(), cls));
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void e(ChangeAppIconRequest changeAppIconRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d547a896", new Object[]{changeAppIconRequest});
        } else {
            f(changeAppIconRequest, null);
        }
    }

    public static void f(ChangeAppIconRequest changeAppIconRequest, wh3 wh3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c281ff", new Object[]{changeAppIconRequest, wh3Var});
            return;
        }
        boolean a2 = ubl.a(ubl.ORANGE_KEY_CHANGE_APP_ICON_ENABLE_MTOP_REPORT, "true");
        AdapterForTLog.loge(qh3.TAG, "sendChangeAppIconInfo report:" + a2);
        if (a2) {
            fqt.d().b(new a(changeAppIconRequest, wh3Var));
        }
    }

    public static <T extends ChangeAppIconMtopResponse<?>> void d(ChangeAppIconMtopRequest changeAppIconMtopRequest, final Class<T> cls, String str, final wh3 wh3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0519842", new Object[]{changeAppIconMtopRequest, cls, str, wh3Var});
            return;
        }
        try {
            MtopBusiness build = MtopBusiness.build(b(changeAppIconMtopRequest));
            if (!TextUtils.isEmpty(str)) {
                build.setReqUserId(str);
            }
            build.reqMethod(MethodEnum.POST);
            build.setConnectionTimeoutMilliSecond(changeAppIconMtopRequest.connectionTimeoutMilliSecond);
            build.setSocketTimeoutMilliSecond(changeAppIconMtopRequest.socketTimeoutMilliSecond);
            build.showLoginUI(false);
            build.addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.android.change.app.icon.utils.MtopUtils.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                private <T extends ChangeAppIconMtopResponse<?>> void handleError(int i, MtopResponse mtopResponse, Object obj, Class<T> cls2, wh3 wh3Var2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8df96675", new Object[]{this, new Integer(i), mtopResponse, obj, cls2, wh3Var2});
                        return;
                    }
                    AdapterForTLog.loge("ChangeAppIcon.mtop", "onError() called with: requestType = [" + i + "], response = [" + mtopResponse + "], requestContext = [" + obj + "]");
                    ChangeAppIconMtopResponse changeAppIconMtopResponse = null;
                    try {
                        try {
                            changeAppIconMtopResponse = MtopUtils.a(mtopResponse, cls2);
                            if (wh3Var2 == null) {
                                return;
                            }
                        } catch (Exception e) {
                            AdapterForTLog.loge("ChangeAppIcon.mtop", "handleError exception", e);
                            if (wh3Var2 == null) {
                                return;
                            }
                        }
                        wh3Var2.a(changeAppIconMtopResponse);
                    } catch (Throwable th) {
                        if (wh3Var2 != null) {
                            wh3Var2.a(null);
                        }
                        throw th;
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        handleError(i, mtopResponse, obj, cls, wh3Var);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    AdapterForTLog.loge("ChangeAppIcon.mtop", "onSuccess() called with: requestType = [" + i + "], response = [" + mtopResponse + "], pojo = [" + baseOutDo + "], requestContext = [" + obj + "]");
                    ChangeAppIconMtopResponse a2 = MtopUtils.a(mtopResponse, cls);
                    wh3 wh3Var2 = wh3Var;
                    if (wh3Var2 != null) {
                        wh3Var2.b(a2);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        handleError(i, mtopResponse, obj, cls, wh3Var);
                    }
                }
            });
            AdapterForTLog.loge("ChangeAppIcon.mtop", "startRequest() request:" + JSON.toJSONString(changeAppIconMtopRequest));
            build.startRequest();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
