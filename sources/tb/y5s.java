package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.tao.log.interceptor.RealTimeLogMessageManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y5s extends AccsAbstractDataListener implements nqi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f31874a = new AtomicBoolean(false);

    static {
        t2o.a(855638020);
        t2o.a(767557678);
    }

    public static /* synthetic */ Object ipc$super(y5s y5sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tlog/message/TLogRealtimeMessenger");
    }

    @Override // tb.nqi
    public bqi a(api apiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bqi) ipChange.ipc$dispatch("69de1660", new Object[]{this, apiVar});
        }
        return null;
    }

    @Override // tb.nqi
    public void b(api apiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f440a4", new Object[]{this, apiVar});
            return;
        }
        try {
            GlobalClientInfo.getInstance(apiVar.f15918a).registerListener(apiVar.c, (AccsAbstractDataListener) this);
            this.f31874a.set(true);
        } catch (Exception e) {
            Log.e("RealtimeMessenger", "Init failed", e);
        }
    }

    @Override // tb.nqi
    public bqi c(api apiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bqi) ipChange.ipc$dispatch("d8fe4844", new Object[]{this, apiVar});
        }
        try {
        } catch (Exception e) {
            Log.e("RealtimeMessenger", "send accs message failure : ", e);
        }
        if (!this.f31874a.get()) {
            return null;
        }
        apiVar.getClass();
        ACCSClient.getAccsClient(null).sendRequest(new ACCSManager.AccsRequest(null, apiVar.c, apiVar.b.getBytes(), null));
        return null;
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
        } else if (this.f31874a.get()) {
            if (bArr == null || bArr.length <= 0) {
                Log.e("RealtimeMessenger", "Receive accs push data is null. dataId:" + str3);
                return;
            }
            RealTimeLogMessageManager.g(bArr);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        } else if (this.f31874a.get()) {
            if (bArr == null) {
                Log.e("RealtimeMessenger", String.format("Receive accs response data is null. dataId:%s, errCode: %d", str2, Integer.valueOf(i)));
            } else {
                RealTimeLogMessageManager.g(bArr);
            }
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
