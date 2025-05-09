package com.taobao.ask.utils;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.Map;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import tb.d01;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MtopUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
    }

    static {
        t2o.a(817889313);
    }

    public static RemoteBusiness b(String str, String str2, Map<String, String> map, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("cf2acf2d", new Object[]{str, str2, map, aVar});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "1.0";
        }
        mtopRequest.setVersion(str2);
        mtopRequest.setNeedEcode(true);
        mtopRequest.setNeedSession(true);
        mtopRequest.dataParams = map;
        mtopRequest.setData(a(map));
        RemoteBusiness build = RemoteBusiness.build(mtopRequest);
        build.protocol(ProtocolEnum.HTTPSECURE);
        build.useWua();
        build.useCache();
        build.setErrorNotifyAfterCache(true);
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.ask.utils.MtopUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                a aVar2 = a.this;
                if (aVar2 != null) {
                    ((d01.b) aVar2).a(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                JSONObject parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
                a aVar2 = a.this;
                if (aVar2 != null) {
                    ((d01.b) aVar2).b(parseObject);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                a aVar2 = a.this;
                if (aVar2 != null) {
                    ((d01.b) aVar2).a(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                }
            }
        });
        return build;
    }

    public static RemoteBusiness c(String str, String str2, Map<String, String> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("35737b63", new Object[]{str, str2, map, aVar});
        }
        RemoteBusiness b = b(str, str2, map, aVar);
        b.startRequest();
        return b;
    }

    public static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("795aad45", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("{");
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!(key == null || value == null)) {
                    try {
                        sb.append(JSON.toJSONString(key));
                        sb.append(":");
                        sb.append(JSON.toJSONString(value));
                        sb.append(",");
                    } catch (Throwable th) {
                        StringBuilder sb2 = new StringBuilder(64);
                        sb2.append("[convertMapToDataStr] convert key=");
                        sb2.append(key);
                        sb2.append(",value=");
                        sb2.append(value);
                        sb2.append(" to dataStr error.");
                        TBSdkLog.e("mtopsdk.ReflectUtil", sb2.toString(), th);
                    }
                }
            }
            int length = sb.length();
            if (length > 1) {
                sb.deleteCharAt(length - 1);
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
