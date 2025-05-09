package com.taobao.message.init.accs;

import android.content.Intent;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsException;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.connection.state.a;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.tao.log.TLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AccsMessageService extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AMP_SYNC_SERVICE_ID = "amp-sync";
    private static final String TAG = "AccsMessageService";
    public static final String UPLOAD_SERVICE_ID = "accs-amp-bypass";

    static {
        t2o.a(529530928);
    }

    public static /* synthetic */ Object ipc$super(AccsMessageService accsMessageService, String str, Object... objArr) {
        if (str.hashCode() == 14618822) {
            super.onConnected((TaoBaseService.ConnectInfo) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/init/accs/AccsMessageService");
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListener
    public void onConnected(TaoBaseService.ConnectInfo connectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df10c6", new Object[]{this, connectInfo});
        } else {
            super.onConnected(connectInfo);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
            return;
        }
        boolean equals = "1".equals(ConfigUtil.getValue("mpm_data_switch", "channelUnloadDex", "1"));
        if (!a.v().z(getApplication()) || (!equals ? !BundleSplitUtil.INSTANCE.isMsgBundleReady() : !BundleSplitUtil.INSTANCE.isMsgBundleDownloaded())) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", (Object) "makeUpPush");
                jSONObject.put("originalData", (Object) new String(bArr));
                ACCSClient.getAccsClient().sendData(new ACCSManager.AccsRequest(null, UPLOAD_SERVICE_ID, jSONObject.toJSONString().getBytes(), null));
                TLog.loge(TAG, "accs upload push make up");
            } catch (AccsException e) {
                TLog.loge(TAG, Log.getStackTraceString(e));
            }
        } else if (bArr == null || bArr.length <= 0) {
            TLog.loge(TAG, "empty data: " + str3);
        } else {
            Intent intent = new Intent();
            String packageName = getApplication().getPackageName();
            intent.setAction("com.taobao.message.intent.action.MESSAGE_IN_MAIN");
            intent.putExtra("data", bArr);
            intent.putExtra("dataId", str3);
            intent.setPackage(packageName);
            getApplication().sendBroadcast(intent);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }
}
