package com.ali.alihadeviceevaluator.network;

import android.os.Build;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import org.json.JSONException;
import org.json.JSONObject;
import tb.gq1;
import tb.rl0;
import tb.z9a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RemoteDeviceManager implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_ID_DEVICE_SCORE = "1";
    public static final String TAG = "RemoteDeviceManager";
    private a dataCaptureListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
    }

    public RemoteDeviceManager(a aVar) {
        this.dataCaptureListener = aVar;
    }

    public void fetchData(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c9c915", new Object[]{this, new Float(f)});
            return;
        }
        MtopTaobaoHaQueryRequest mtopTaobaoHaQueryRequest = new MtopTaobaoHaQueryRequest();
        mtopTaobaoHaQueryRequest.setBizid("1");
        mtopTaobaoHaQueryRequest.setDeviceModel(Build.MODEL);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localScore", String.valueOf(f));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        mtopTaobaoHaQueryRequest.setData(gq1.a(jSONObject.toString()));
        MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, z9a.f32627a), mtopTaobaoHaQueryRequest).registerListener((IRemoteListener) this).startRequest(MtopTaobaoHaQueryResponse.class);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        Log.e(TAG, "onError" + i);
        ((rl0) this.dataCaptureListener).n();
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (baseOutDo != null && (baseOutDo instanceof MtopTaobaoHaQueryResponse)) {
            try {
                ((rl0) this.dataCaptureListener).p(Float.valueOf(((MtopTaobaoHaQueryResponse) baseOutDo).getData().score).floatValue());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        Log.e(TAG, "onSystemError:" + i);
        ((rl0) this.dataCaptureListener).n();
    }
}
