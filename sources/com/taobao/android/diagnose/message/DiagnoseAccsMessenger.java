package com.taobao.android.diagnose.message;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.android.diagnose.model.AppInfo;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.idh;
import tb.jgg;
import tb.otc;
import tb.t2o;
import tb.uk7;
import tb.wk7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DiagnoseAccsMessenger extends AccsAbstractDataListener implements otc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DiagnoseAccsMessenger";
    private String accsServiceId = "ha-scene-diagnose";
    private String accsTag = "default";
    private AppInfo appInfo = null;
    private AtomicBoolean isInit = new AtomicBoolean(false);

    static {
        t2o.a(615514168);
        t2o.a(615514170);
    }

    public static /* synthetic */ Object ipc$super(DiagnoseAccsMessenger diagnoseAccsMessenger, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/diagnose/message/DiagnoseAccsMessenger");
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
        } else if (this.isInit.get()) {
            if (bArr == null || bArr.length <= 0) {
                idh.b(TAG, "Receive accs push data is null. dataId:" + str3);
                return;
            }
            wk7.e(bArr);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
            return;
        }
        idh.a(TAG, "Send data to accs. dataID: " + str2);
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    public void sendMessage(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f0536c", new Object[]{this, context, str});
            return;
        }
        try {
            if (this.isInit.get()) {
                ACCSClient.getAccsClient(this.accsTag).sendRequest(new ACCSManager.AccsRequest(this.appInfo.uid, this.accsServiceId, str.getBytes(), null));
            }
        } catch (Exception e) {
            idh.c(TAG, "send accs message failure : ", e);
        }
    }

    @Override // tb.otc
    public void init(Context context, jgg jggVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa8f192d", new Object[]{this, context, jggVar});
            return;
        }
        if (jggVar != null) {
            try {
                this.appInfo = uk7.i().g().c();
                this.accsServiceId = jggVar.c;
                this.accsTag = jggVar.d;
            } catch (Exception e) {
                idh.c(TAG, "init", e);
                return;
            }
        }
        idh.a(TAG, "init!!");
        GlobalClientInfo.getInstance(context).registerListener(this.accsServiceId, (AccsAbstractDataListener) this);
        this.isInit.set(true);
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        } else if (this.isInit.get()) {
            if (bArr == null) {
                idh.b(TAG, String.format("Receive accs response data is null. dataId:%s, errCode: %d", str2, Integer.valueOf(i)));
            } else {
                wk7.e(bArr);
            }
        }
    }
}
