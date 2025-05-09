package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p4s extends AccsAbstractDataListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(855638018);
    }

    public static /* synthetic */ Object ipc$super(p4s p4sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tlog/message/TLogCommandDataCenter");
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
        } else if (bArr == null || bArr.length <= 0) {
            j5s.j().s().c(b6s.f, "RECEIVE MSG", "接收到accs下发的消息，但是内容为空的.");
            TLogEventHelper.b("ut_tlog_accs_receive_err", ErrorCode.DATA_EMPTY, "onData msg is null");
        } else {
            j5s.j().s().b(b6s.f, "RECEIVE MSG", "接收到accs下发的消息，开始处理");
            y24.a().b(str, str2, str3, bArr);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        } else if (bArr != null) {
            j5s.j().s().b(b6s.f, "RECEIVE REPONSE", "接收到accs返回的reponse");
            y24.a().b(str, "userId", str2, bArr);
        } else if (i != -11) {
            TLogEventHelper.c("ut_tlog_accs_receive_err", String.valueOf(i), "response is null");
            s5s s = j5s.j().s();
            String str3 = b6s.f;
            s.c(str3, "RECEIVE REPONSE", "接收到accs返回的reponse，但是内容为空的, dataId:" + str2 + " serviceId:" + str + " errorCode:" + i);
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
