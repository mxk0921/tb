package com.taobao.live.home.dinamic.event;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.message.message_open_api.ICallService;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.arq;
import tb.o9m;
import tb.ob5;
import tb.p1t;
import tb.r0h;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DXTblMtopRefreshEventHandler extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLMTOPREFRESH = 5547302832202012607L;

    /* renamed from: a  reason: collision with root package name */
    public static final String f10956a = DXTblMtopRefreshEventHandler.class.getSimpleName();

    static {
        t2o.a(806355421);
    }

    public static /* synthetic */ void a(DXTblMtopRefreshEventHandler dXTblMtopRefreshEventHandler, MtopResponse mtopResponse, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7879f887", new Object[]{dXTblMtopRefreshEventHandler, mtopResponse, context});
        } else {
            dXTblMtopRefreshEventHandler.d(mtopResponse, context);
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f02c108", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "enableRedEnvelopeRefresh", "true"));
    }

    public static /* synthetic */ Object ipc$super(DXTblMtopRefreshEventHandler dXTblMtopRefreshEventHandler, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/event/DXTblMtopRefreshEventHandler");
    }

    public final MtopRequest b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("22e77ebb", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(jSONObject.getString("mtopName"));
        mtopRequest.setNeedEcode(jSONObject.getBooleanValue(ICallService.KEY_NEED_ECODE));
        mtopRequest.setNeedSession(jSONObject.getBooleanValue("needSession"));
        mtopRequest.setVersion(jSONObject.getString("version"));
        mtopRequest.setData(jSONObject.getString("dataParams"));
        return mtopRequest;
    }

    public final void d(MtopResponse mtopResponse, Context context) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23527c2a", new Object[]{this, mtopResponse, context});
        } else if (mtopResponse != null && context != null && mtopResponse.getRet() != null && mtopResponse.getRet().length > 0 && (split = mtopResponse.getRet()[0].split("::")) != null && split.length == 2 && "RECEIVE_ERROR".equals(split[0])) {
            Toast.makeText(context, split[1], 1).show();
        }
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (!c() || dXRuntimeContext == null || objArr == null || objArr.length <= 0) {
        } else {
            if (dXRuntimeContext.h() == null) {
                r0h.b(f10956a, "context is null.");
                return;
            }
            Object obj = objArr[0];
            if (obj instanceof JSONObject) {
                try {
                    MtopRequest b = b((JSONObject) obj);
                    if (b != null) {
                        new HashMap().put(p1t.kLiveMtopBizCodeKey, "TAOBAO");
                        RemoteBusiness.build(b).registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.live.home.dinamic.event.DXTblMtopRefreshEventHandler.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.tao.remotebusiness.IRemoteListener
                            public void onError(int i, MtopResponse mtopResponse, Object obj2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj2});
                                    return;
                                }
                                Log.e("onError", "onError");
                                DXTblMtopRefreshEventHandler.a(DXTblMtopRefreshEventHandler.this, mtopResponse, dXRuntimeContext.h());
                            }

                            @Override // com.taobao.tao.remotebusiness.IRemoteListener
                            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj2) {
                                String[] split;
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj2});
                                    return;
                                }
                                try {
                                    if (baseOutDo instanceof NormalResponse) {
                                        NormalResponse normalResponse = (NormalResponse) baseOutDo;
                                        if (normalResponse.getRet() != null && normalResponse.getRet().length > 0 && (split = normalResponse.getRet()[0].split("::")) != null && split.length == 2 && "RECEIVE_ERROR".equals(split[0])) {
                                            Toast.makeText(dXRuntimeContext.h(), split[1], 1).show();
                                        } else if (!(normalResponse.getData() == null || normalResponse.getData().getJSONArray("cardList") == null || normalResponse.getData().getJSONArray("cardList").size() <= 0)) {
                                            dXRuntimeContext.L().getFlattenWidgetNode().setNeedParse();
                                            dXRuntimeContext.s().f().j1(dXRuntimeContext.L(), normalResponse.getData().getJSONArray("cardList").getJSONObject(0));
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            }

                            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                            public void onSystemError(int i, MtopResponse mtopResponse, Object obj2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj2});
                                    return;
                                }
                                Log.e("onSystemError", "onSystemError");
                                DXTblMtopRefreshEventHandler.a(DXTblMtopRefreshEventHandler.this, mtopResponse, dXRuntimeContext.h());
                            }
                        }).setBizId(59).startRequest(NormalResponse.class);
                    }
                } catch (Exception unused) {
                }
            }
            JSONObject jSONObject = (JSONObject) objArr[1];
            if (jSONObject != null) {
                String string = jSONObject.getString("trackInfo");
                if (jSONObject.getJSONObject("clickMaidian") != null) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("clickMaidian");
                    if (string == null || TextUtils.isEmpty(string)) {
                        o9m.a(jSONObject2.getString("name"), jSONObject2.getString("params"));
                        return;
                    }
                    String string2 = jSONObject2.getString("name");
                    o9m.a(string2, jSONObject2.getString("params") + ",trackInfo=" + string);
                }
            }
        }
    }
}
