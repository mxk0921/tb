package com.taobao.tao.flexbox.layoutmanager.player.videoquickopen;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.akt;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShortVideoQuickOpenManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ShortVideoQuickOpenManager";
    public static final long UPDATE_CONFIG_INTERNAL = 5000;

    /* renamed from: a  reason: collision with root package name */
    public static long f12351a = 0;
    public static final Map<String, String> b;

    static {
        t2o.a(502268318);
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("guangguangdouble", "guangguang");
    }

    public static void a(final IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9119101", new Object[]{iRemoteBaseListener});
            return;
        }
        GlobalConfigRequest globalConfigRequest = new GlobalConfigRequest();
        JSONArray jSONArray = new JSONArray();
        jSONArray.addAll(((HashMap) b).values());
        globalConfigRequest.sourceList = jSONArray;
        if (akt.F0()) {
            globalConfigRequest.buildExtendParams();
        }
        tfs.c(TAG, "开始请求");
        MtopModule.requestWithParser(new d.j(null, globalConfigRequest.toJsonObject(), null), new IRemoteBaseListener() { // from class: com.taobao.tao.flexbox.layoutmanager.player.videoquickopen.ShortVideoQuickOpenManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    IRemoteBaseListener iRemoteBaseListener2 = IRemoteBaseListener.this;
                    if (iRemoteBaseListener2 != null) {
                        iRemoteBaseListener2.onSuccess(i, mtopResponse, baseOutDo, obj);
                    }
                } catch (Throwable th) {
                    tfs.e(ShortVideoQuickOpenManager.TAG, "requestVideoInfo failed: " + th);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                IRemoteBaseListener iRemoteBaseListener2 = IRemoteBaseListener.this;
                if (iRemoteBaseListener2 != null) {
                    iRemoteBaseListener2.onSystemError(i, mtopResponse, obj);
                }
            }
        }, null);
    }
}
