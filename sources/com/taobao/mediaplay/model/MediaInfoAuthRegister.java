package com.taobao.mediaplay.model;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.feh;
import tb.m09;
import tb.rrc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MediaInfoAuthRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MediaPlayControlContext f11022a;
    public final int b;
    public final boolean c;
    public final feh d;

    static {
        t2o.a(774897774);
    }

    public MediaInfoAuthRegister(MediaPlayControlContext mediaPlayControlContext, int i, boolean z) {
        this.f11022a = mediaPlayControlContext;
        this.b = i;
        this.c = z;
        this.d = new feh(toString(), mediaPlayControlContext.mPlayToken);
    }

    public static /* synthetic */ feh a(MediaInfoAuthRegister mediaInfoAuthRegister) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (feh) ipChange.ipc$dispatch("7dff7654", new Object[]{mediaInfoAuthRegister});
        }
        return mediaInfoAuthRegister.d;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42f7794f", new Object[]{str});
        }
        int indexOf = str.indexOf("source=");
        if (indexOf == -1) {
            return null;
        }
        int i = indexOf + 7;
        int indexOf2 = str.indexOf("&", i);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        return str.substring(i, indexOf2);
    }

    public boolean d(String str, final rrc rrcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f0bfca9", new Object[]{this, str, rrcVar})).booleanValue();
        }
        RemoteBusiness registeListener = RemoteBusiness.build(b(str)).registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.mediaplay.model.MediaInfoAuthRegister.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else if (mtopResponse != null) {
                    feh a2 = MediaInfoAuthRegister.a(MediaInfoAuthRegister.this);
                    AVSDKLog.e(a2, "queryVideoAuthData onError response code is : " + mtopResponse.getRetCode() + ",response msg is : " + mtopResponse.getRetMsg() + ", ret is :" + mtopResponse.toString());
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse != null) {
                    feh a2 = MediaInfoAuthRegister.a(MediaInfoAuthRegister.this);
                    AVSDKLog.e(a2, "onSuccess response code is : " + mtopResponse.getRetCode() + ",response msg is : " + mtopResponse.getRetMsg() + ", ret is :" + mtopResponse.toString());
                    try {
                        feh a3 = MediaInfoAuthRegister.a(MediaInfoAuthRegister.this);
                        AVSDKLog.e(a3, "queryVideoAuthData data is " + mtopResponse.getDataJsonObject().toString());
                        String string = mtopResponse.getDataJsonObject().getString("result");
                        feh a4 = MediaInfoAuthRegister.a(MediaInfoAuthRegister.this);
                        AVSDKLog.e(a4, "queryVideoAuthData result is " + string);
                        JSONObject parseObject = JSON.parseObject(string);
                        if (parseObject != null) {
                            int intValue = parseObject.getInteger("errorCode").intValue();
                            String string2 = parseObject.getString("errorMsg");
                            int intValue2 = intValue == 0 ? parseObject.getInteger(m09.TASK_TYPE_LEVEL).intValue() : -1;
                            feh a5 = MediaInfoAuthRegister.a(MediaInfoAuthRegister.this);
                            AVSDKLog.e(a5, "queryVideoAuthData errorCode is " + intValue + ", errorMsg is " + string2 + ", level is " + intValue2);
                            rrc rrcVar2 = rrcVar;
                            if (rrcVar2 != null) {
                                rrcVar2.e(intValue, string2, intValue2);
                            } else {
                                AVSDKLog.e(MediaInfoAuthRegister.a(MediaInfoAuthRegister.this), "queryVideoAuthData authEventAdapter is null ");
                            }
                        } else {
                            AVSDKLog.e(MediaInfoAuthRegister.a(MediaInfoAuthRegister.this), "queryVideoAuthData parseJsonObj is null ");
                        }
                    } catch (Throwable th) {
                        AVSDKLog.e(MediaInfoAuthRegister.a(MediaInfoAuthRegister.this), th.toString());
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else if (mtopResponse != null) {
                    feh a2 = MediaInfoAuthRegister.a(MediaInfoAuthRegister.this);
                    AVSDKLog.e(a2, "queryVideoAuthData onSystemError response code is : " + mtopResponse.getRetCode() + ",response msg is : " + mtopResponse.getRetMsg() + ", ret is :" + mtopResponse.toString());
                }
            }
        });
        registeListener.setJsonType(JsonTypeEnum.ORIGINALJSON);
        registeListener.setConnectionTimeoutMilliSecond(3000);
        registeListener.setSocketTimeoutMilliSecond(1000);
        registeListener.startRequest(0, MediaVideoResponse.class);
        return true;
    }

    public final MtopRequest b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("dc53ac3d", new Object[]{this, str});
        }
        try {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.tblive.live.playcontrol.registration.auth");
            mtopRequest.setVersion("1.0");
            HashMap hashMap = new HashMap();
            hashMap.put("playScenario", Integer.valueOf(this.b));
            hashMap.put("os", TimeCalculator.PLATFORM_ANDROID);
            hashMap.put("cbt", this.f11022a.mBusinessId);
            hashMap.put("csbt", this.f11022a.getFrom());
            String c = c(str);
            if (TextUtils.isEmpty(c)) {
                hashMap.put("sbt", "");
                hashMap.put("ssbt", "");
            } else {
                String[] split = c.split("_");
                if (split.length == 4) {
                    hashMap.put("sbt", split[2]);
                    hashMap.put("ssbt", split[3]);
                } else {
                    hashMap.put("sbt", "");
                    hashMap.put("ssbt", "");
                }
            }
            hashMap.put("hasInvokeNewInterface", Boolean.valueOf(this.c));
            JSONObject jSONObject = new JSONObject(hashMap);
            feh fehVar = this.d;
            AVSDKLog.e(fehVar, " buildRequest is : " + jSONObject.toString());
            mtopRequest.setData(jSONObject.toString());
            return mtopRequest;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
