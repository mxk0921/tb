package com.taobao.avplayer;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.mediaplay.model.MediaVideoResponse;
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
import tb.k75;
import tb.qvd;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBLiveSourceAdapter implements qvd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f10109a;

    static {
        t2o.a(451936297);
        t2o.a(774897763);
    }

    public TBLiveSourceAdapter(String str) {
        this.f10109a = str;
    }

    public static /* synthetic */ MediaVideoResponse b(TBLiveSourceAdapter tBLiveSourceAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaVideoResponse) ipChange.ipc$dispatch("47b9d5f", new Object[]{tBLiveSourceAdapter});
        }
        return tBLiveSourceAdapter.d();
    }

    public static /* synthetic */ MediaVideoResponse c(TBLiveSourceAdapter tBLiveSourceAdapter, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaVideoResponse) ipChange.ipc$dispatch("48d7bec3", new Object[]{tBLiveSourceAdapter, mtopResponse});
        }
        return tBLiveSourceAdapter.f(mtopResponse);
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

    public final MediaVideoResponse d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaVideoResponse) ipChange.ipc$dispatch("e9bb15fa", new Object[]{this});
        }
        return new MediaVideoResponse();
    }

    public final MtopRequest e() {
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
        mtopRequest.dataParams.put("videoChannel", "");
        mtopRequest.dataParams.put("from", "TBLiveTimeShift");
        mtopRequest.dataParams.put("videoId", this.f10109a);
        mtopRequest.dataParams.put(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
        Map<String, String> map = mtopRequest.dataParams;
        map.put("androidSDKVersion", "" + Build.VERSION.SDK_INT);
        mtopRequest.dataParams.put("useServerPriority", "1");
        mtopRequest.setData(ReflectUtil.converMapToDataStr(mtopRequest.dataParams));
        return mtopRequest;
    }

    public final MediaVideoResponse f(MtopResponse mtopResponse) {
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

    public final boolean g(final a9e a9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e884c1", new Object[]{this, a9eVar})).booleanValue();
        }
        RemoteBusiness registeListener = RemoteBusiness.build(e()).registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.avplayer.TBLiveSourceAdapter.1
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
                    a9eVar2.a(TBLiveSourceAdapter.c(TBLiveSourceAdapter.this, mtopResponse));
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
                        a9eVar2.a(TBLiveSourceAdapter.b(TBLiveSourceAdapter.this));
                    }
                } else {
                    a9e a9eVar3 = a9eVar;
                    if (a9eVar3 != null) {
                        a9eVar3.b(TBLiveSourceAdapter.c(TBLiveSourceAdapter.this, mtopResponse));
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
                    a9eVar2.a(TBLiveSourceAdapter.c(TBLiveSourceAdapter.this, mtopResponse));
                }
            }
        });
        registeListener.setJsonType(JsonTypeEnum.ORIGINALJSON);
        registeListener.setConnectionTimeoutMilliSecond(3000);
        registeListener.setSocketTimeoutMilliSecond(1000);
        registeListener.startRequest(0, MediaVideoResponse.class);
        return true;
    }
}
