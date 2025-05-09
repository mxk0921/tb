package tb;

import android.content.Context;
import com.heytap.mcssdk.constant.MessageConstant$CommandId;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.msp.push.mode.BaseMode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fv2 implements fzm {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ dv2 f19549a;

        public a(dv2 dv2Var) {
            this.f19549a = dv2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            fv2.this.c(this.f19549a, b6n.s());
        }
    }

    static {
        t2o.a(612368416);
        t2o.a(612368420);
    }

    public final void c(dv2 dv2Var, b6n b6nVar) {
        int i;
        if (dv2Var == null) {
            dgh.b("message is null , please check param of parseCommandMessage(2)");
        } else if (b6nVar == null) {
            dgh.b("pushService is null , please check param of parseCommandMessage(2)");
        } else if (b6nVar.z() == null) {
            dgh.b("pushService.getPushCallback() is null , please check param of parseCommandMessage(2)");
        } else {
            int a2 = dv2Var.a();
            if (a2 == 12287) {
                ICallBackResultService z = b6nVar.z();
                if (z != null) {
                    z.onError(dv2Var.b(), dv2Var.getContent());
                }
            } else if (a2 == 12298) {
                b6nVar.z().onSetPushTime(dv2Var.b(), dv2Var.getContent());
            } else if (a2 == 12306) {
                b6nVar.z().onGetPushStatus(dv2Var.b(), yyv.i(dv2Var.getContent()));
            } else if (a2 == 12309) {
                b6nVar.z().onGetNotificationStatus(dv2Var.b(), yyv.i(dv2Var.getContent()));
            } else if (a2 == 12289) {
                if (dv2Var.b() == 0) {
                    b6nVar.V(dv2Var.getContent());
                }
                b6nVar.z().onRegister(dv2Var.b(), dv2Var.getContent());
            } else if (a2 != 12290) {
                switch (a2) {
                    case MessageConstant$CommandId.COMMAND_APP_NOTIFICATION_OPEN /* 12316 */:
                    case MessageConstant$CommandId.COMMAND_APP_NOTIFICATION_CLOSE /* 12317 */:
                        ISetAppNotificationCallBackService B = b6nVar.B();
                        if (B != null) {
                            B.onSetAppNotificationSwitch(dv2Var.b());
                            return;
                        }
                        return;
                    case MessageConstant$CommandId.COMMAND_APP_NOTIFICATION_GET /* 12318 */:
                        try {
                            i = Integer.parseInt(dv2Var.getContent());
                        } catch (Exception unused) {
                            i = 0;
                        }
                        IGetAppNotificationCallBackService A = b6nVar.A();
                        if (A != null) {
                            A.onGetAppNotificationSwitch(dv2Var.b(), i);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else {
                b6nVar.z().onUnRegister(dv2Var.b());
            }
        }
    }

    @Override // tb.fzm
    public void a(Context context, BaseMode baseMode, IDataMessageCallBackService iDataMessageCallBackService) {
        if (baseMode != null && baseMode.getType() == 4105) {
            dv2 dv2Var = (dv2) baseMode;
            dgh.a("mcssdk-CallBackResultProcessor:" + dv2Var.toString());
            wrt.b(new a(dv2Var));
        }
    }
}
