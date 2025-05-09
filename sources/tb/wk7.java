package tb;

import android.content.Context;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.message.protocol.ServerMessage;
import com.taobao.android.diagnose.scene.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wk7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static a f30739a = null;

    static {
        t2o.a(615514169);
    }

    public static void b(ServerMessage serverMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed97b01f", new Object[]{serverMessage});
            return;
        }
        int i = serverMessage.command;
        if (i == 1) {
            a aVar = f30739a;
            if (aVar != null) {
                aVar.e();
            }
        } else if (i == 2) {
            a aVar2 = f30739a;
            if (aVar2 != null) {
                aVar2.q(serverMessage.data);
            }
        } else if (i != 3) {
            idh.a("DiagnoseMessageManager", "Unsupported command: " + serverMessage.command);
        } else {
            a aVar3 = f30739a;
            if (aVar3 != null) {
                aVar3.d(serverMessage.data);
            }
        }
    }

    public static void c(Context context, a aVar, otc otcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a80579d", new Object[]{context, aVar, otcVar});
        } else {
            f30739a = aVar;
        }
    }

    public static /* synthetic */ void d(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48490cef", new Object[]{bArr});
            return;
        }
        try {
            byte[] decode = Base64.decode(bArr, 0);
            if (decode != null) {
                ServerMessage serverMessage = (ServerMessage) JSON.parseObject(decode, ServerMessage.class, new Feature[0]);
                if (serverMessage == null) {
                    idh.b("DiagnoseMessageManager", "Failed to parse date to ServerMessage");
                } else {
                    b(serverMessage);
                }
            }
        } catch (Exception e) {
            idh.c("DiagnoseMessageManager", "onData error.", e);
        }
    }

    public static void e(final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdd5af7", new Object[]{bArr});
            return;
        }
        idh.a("DiagnoseMessageManager", "Handle accs data");
        if (bArr == null) {
            idh.a("DiagnoseMessageManager", "response is null");
        } else {
            al7.b().a(new Runnable() { // from class: tb.vk7
                @Override // java.lang.Runnable
                public final void run() {
                    wk7.d(bArr);
                }
            });
        }
    }
}
