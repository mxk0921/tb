package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class y24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final y24 f31797a = new y24();

        static {
            t2o.a(767557636);
        }

        public static /* synthetic */ y24 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y24) ipChange.ipc$dispatch("b026538e", new Object[0]);
            }
            return f31797a;
        }
    }

    static {
        t2o.a(767557634);
    }

    public static synchronized y24 a() {
        synchronized (y24.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y24) ipChange.ipc$dispatch("88fb0d74", new Object[0]);
            }
            return b.a();
        }
    }

    public void b(String str, String str2, String str3, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1909955", new Object[]{this, str, str2, str3, bArr});
            return;
        }
        j5s.j().s().b(b6s.b, "RECEIVE MESSAGE COUNT", "成功接收到消息，还未开始处理");
        if (bArr == null) {
            Log.e("TLOG.CommandDataCenter", "msg is null");
            TLogEventHelper.b(v4s.UT_TLOG_CMD_PARSE_ERR, ErrorCode.DATA_EMPTY, "onData msg is null");
            j5s.j().s().c(b6s.f16219a, "NULL MESSAGE", "接收到的服务端消息为空");
            return;
        }
        try {
            String c = z5s.a().c(str, str2, str3, bArr);
            if (!TextUtils.isEmpty(c)) {
                j5s.j().s().b(b6s.f16219a, "RECEIVE MESSAGE", "成功接收到消息");
                b34.c().b(bArr, c, str2, str);
            }
        } catch (Exception e) {
            TLogEventHelper.b(v4s.UT_TLOG_CMD_PARSE_ERR, ErrorCode.CODE_EXC, e.getMessage());
            j5s.j().s().a(b6s.f16219a, "PARSE MESSAGE ERROR", e);
        }
    }

    public y24() {
    }
}
