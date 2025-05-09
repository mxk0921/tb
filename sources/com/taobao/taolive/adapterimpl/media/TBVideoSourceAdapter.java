package com.taobao.taolive.adapterimpl.media;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.model.MediaVideoResponse;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ReflectUtil;
import org.json.JSONException;
import org.json.JSONObject;
import tb.a9e;
import tb.ew0;
import tb.k75;
import tb.qvd;
import tb.t2o;
import tb.v2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBVideoSourceAdapter implements qvd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;

    /* renamed from: a  reason: collision with root package name */
    private String f12991a = "";
    private final String c = k75.VIDEOCONFIG_API_NAME;
    private final String d = k75.VIDEOCONFIG_API_VERSION_3;

    static {
        t2o.a(779092322);
        t2o.a(774897763);
    }

    public TBVideoSourceAdapter(String str) {
        this.b = str;
    }

    public static /* synthetic */ MediaVideoResponse b(TBVideoSourceAdapter tBVideoSourceAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaVideoResponse) ipChange.ipc$dispatch("8dfb41ed", new Object[]{tBVideoSourceAdapter});
        }
        return tBVideoSourceAdapter.d();
    }

    public static /* synthetic */ MediaVideoResponse c(TBVideoSourceAdapter tBVideoSourceAdapter, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaVideoResponse) ipChange.ipc$dispatch("83a72611", new Object[]{tBVideoSourceAdapter, mtopResponse});
        }
        return tBVideoSourceAdapter.f(mtopResponse);
    }

    private MediaVideoResponse d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaVideoResponse) ipChange.ipc$dispatch("e9bb15fa", new Object[]{this});
        }
        return new MediaVideoResponse();
    }

    private MtopRequest e() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("d4a6ac73", new Object[]{this});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(k75.VIDEOCONFIG_API_NAME);
        mtopRequest.setVersion(k75.VIDEOCONFIG_API_VERSION_3);
        HashMap hashMap = new HashMap();
        mtopRequest.dataParams = hashMap;
        hashMap.put("playScenes", "live");
        mtopRequest.dataParams.put("userId", v2s.o().u().getUserId());
        mtopRequest.dataParams.put("videoChannel", "");
        mtopRequest.dataParams.put("from", "TBLiveTimeShift");
        mtopRequest.dataParams.put("videoId", this.b);
        mtopRequest.dataParams.put(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
        Map<String, String> map = mtopRequest.dataParams;
        map.put("androidSDKVersion", "" + Build.VERSION.SDK_INT);
        boolean s = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_USE_SERVER_DEFINITIONPRIORITY, "false"));
        Map<String, String> map2 = mtopRequest.dataParams;
        if (s) {
            str = "1";
        } else {
            str = "0";
        }
        map2.put("useServerPriority", str);
        mtopRequest.setData(ReflectUtil.converMapToDataStr(mtopRequest.dataParams));
        return mtopRequest;
    }

    private MediaVideoResponse f(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaVideoResponse) ipChange.ipc$dispatch("232693e4", new Object[]{this, mtopResponse});
        }
        if (mtopResponse == null) {
            return null;
        }
        MediaVideoResponse mediaVideoResponse = new MediaVideoResponse();
        mediaVideoResponse.errorCode = mtopResponse.getRetCode();
        mediaVideoResponse.errorMsg = mtopResponse.getRetMsg();
        if (mtopResponse.getBytedata() != null) {
            try {
                mediaVideoResponse.data = new JSONObject(new String(mtopResponse.getBytedata())).optJSONObject("data");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return mediaVideoResponse;
    }

    private boolean g(final a9e a9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e884c1", new Object[]{this, a9eVar})).booleanValue();
        }
        RemoteBusiness registeListener = RemoteBusiness.build(e()).registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.taolive.adapterimpl.media.TBVideoSourceAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                a9e a9eVar2 = a9eVar;
                if (a9eVar2 != null) {
                    a9eVar2.a(TBVideoSourceAdapter.c(TBVideoSourceAdapter.this, mtopResponse));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse == null) {
                    a9e a9eVar2 = a9eVar;
                    if (a9eVar2 != null) {
                        a9eVar2.a(TBVideoSourceAdapter.b(TBVideoSourceAdapter.this));
                    }
                } else {
                    a9e a9eVar3 = a9eVar;
                    if (a9eVar3 != null) {
                        a9eVar3.b(TBVideoSourceAdapter.c(TBVideoSourceAdapter.this, mtopResponse));
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                a9e a9eVar2 = a9eVar;
                if (a9eVar2 != null) {
                    a9eVar2.a(TBVideoSourceAdapter.c(TBVideoSourceAdapter.this, mtopResponse));
                }
            }
        });
        registeListener.setJsonType(JsonTypeEnum.ORIGINALJSON);
        registeListener.setConnectionTimeoutMilliSecond(3000);
        registeListener.setSocketTimeoutMilliSecond(1000);
        registeListener.startRequest(0, MediaVideoResponse.class);
        return true;
    }

    @Override // tb.qvd
    public void a(a9e a9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab971ca5", new Object[]{this, a9eVar});
        } else {
            g(a9eVar);
        }
    }
}
