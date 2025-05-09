package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class x6s extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final y6s f31183a;

    static {
        t2o.a(860880912);
    }

    public x6s(y6s y6sVar, Looper looper) {
        super(looper);
        this.f31183a = y6sVar;
    }

    public static /* synthetic */ Object ipc$super(x6s x6sVar, String str, Object... objArr) {
        if (str.hashCode() == 673877017) {
            super.handleMessage((Message) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tmgcashier/msg/TMGCashierMSGCenter");
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        super.handleMessage(message);
        switch (message.what) {
            case 1001:
                try {
                    this.f31183a.k((String) message.obj);
                    return;
                } catch (JSONException e) {
                    TLog.logd("tmgcashier", "TMGCashierMSGCenter", "MSG_WHAT_FRESHPAGE" + e.getMessage());
                    return;
                }
            case 1002:
                this.f31183a.e();
                return;
            case 1003:
                try {
                    JSONObject jSONObject = (JSONObject) message.obj;
                    String string = jSONObject.getString("url");
                    if (!jSONObject.has("isNewContainer") || !jSONObject.getBoolean("isNewContainer")) {
                        this.f31183a.i(string);
                        return;
                    } else {
                        this.f31183a.j(string);
                        return;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            case 1004:
                try {
                    this.f31183a.g((String) message.obj);
                    return;
                } catch (Exception e3) {
                    e3.printStackTrace();
                    return;
                }
            case 1005:
                this.f31183a.h();
                return;
            case 1006:
                try {
                    this.f31183a.p((String) message.obj);
                    return;
                } catch (Exception e4) {
                    e4.printStackTrace();
                    return;
                }
            case 1007:
                this.f31183a.n((WVCallBackContext) message.obj);
                return;
            case 1008:
                this.f31183a.o((String) message.obj);
                return;
            default:
                return;
        }
    }
}
