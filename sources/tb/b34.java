package tb;

import android.text.TextUtils;
import android.util.Log;
import com.ali.user.mobile.rpc.ApiConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b34 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16152a;
    public final ConcurrentHashMap<String, fob> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final b34 f16153a = new b34();

        static {
            t2o.a(767557701);
        }

        public static /* synthetic */ b34 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b34) ipChange.ipc$dispatch("6e6bfaec", new Object[0]);
            }
            return f16153a;
        }
    }

    static {
        t2o.a(767557699);
    }

    public static final b34 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b34) ipChange.ipc$dispatch("64f9d352", new Object[0]);
        }
        return b.a();
    }

    public void a(String str, fob fobVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d12fb4bd", new Object[]{this, str, fobVar});
        } else {
            this.b.put(str, fobVar);
        }
    }

    public void b(byte[] bArr, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f8b8f5", new Object[]{this, bArr, str, str2, str3});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                z24 b2 = z5s.a().b(bArr, str, str2, str3);
                if (b2 != null) {
                    s5s s = j5s.j().s();
                    String str4 = b6s.f16219a;
                    s.b(str4, "RECEIVE MESSAGE", "接收消息后，基础信息解析完成");
                    if (b2.g.equals(ApiConstants.ResultActionType.NOTIFY)) {
                        j5s.j().s().b(str4, "RECEIVE MESSAGE", "接收到notify消息，开始拉任务");
                        h5n.a().b();
                    }
                    fob fobVar = this.b.get(b2.e);
                    if (fobVar != null) {
                        s5s s2 = j5s.j().s();
                        s2.b(str4, "RECEIVE MESSAGE", "开始处理任务，opcode=" + b2.e);
                        TLogEventHelper.f(v4s.UT_TLOG_CMD_EXECUTE, v4s.PARAM_OP_CODE, b2.e);
                        fobVar.a(b2);
                        return;
                    }
                    s5s s3 = j5s.j().s();
                    s3.b(str4, "RECEIVE MESSAGE", "没有对应的任务存在，opcode=" + b2.e);
                    return;
                }
                TLogEventHelper.b(v4s.UT_TLOG_CMD_PARSE_ERR, ErrorCode.DATA_EMPTY, "commandInfo is null");
                j5s.j().s().c(b6s.c, this.f16152a, "CommandInfo is null");
            } catch (Exception e) {
                Log.e(this.f16152a, "parse command info error", e);
                j5s.j().s().a(b6s.c, this.f16152a, e);
                TLogEventHelper.b(v4s.UT_TLOG_CMD_EXECUTE_ERR, ErrorCode.CODE_EXC, e.getMessage());
            }
        } else {
            TLogEventHelper.b(v4s.UT_TLOG_CMD_PARSE_ERR, ErrorCode.DATA_EMPTY, "dealCommandData content is null");
            j5s.j().s().c(b6s.c, this.f16152a, "MESSAGE IS NULL");
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        a("RDWP_APPLY_UPLOAD_TOKEN_REPLY", new la1());
        a("RDWP_APPLY_UPLOAD_REPLY", new qa1());
        a("RDWP_LOG_UPLOAD", new yfh());
        a("RDWP_LOG_CONFIGURE", new ceh());
        a("RDWP_USER_DEFINED_UPLOAD", new vsu());
    }

    public b34() {
        this.f16152a = "TLOG.CommandManager";
        this.b = new ConcurrentHashMap<>();
    }
}
