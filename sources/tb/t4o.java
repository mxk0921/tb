package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.init.Launcher_InitPush;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.ICallback;
import com.taobao.agoo.IRegister;
import com.taobao.agoo.TaobaoConstants;
import com.taobao.agoo.TaobaoRegister;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.Config;
import org.android.agoo.control.NotifManager;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class t4o implements AccsDataListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static yh0 b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ICallback> f28490a = new HashMap();

    static {
        t2o.a(343933289);
        t2o.a(343933002);
    }

    public t4o(Context context) {
        if (b == null) {
            b = new yh0(context.getApplicationContext());
        }
    }

    public final void a(JSONObject jSONObject, ICallback iCallback) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0fc4588", new Object[]{this, jSONObject, iCallback});
            return;
        }
        String a2 = bxf.a(jSONObject, rr0.JSON_PUSH_USER_TOKEN, null);
        if (!TextUtils.isEmpty(a2)) {
            Config.setPushAliasToken(GlobalClientInfo.getContext(), a2);
            if (iCallback != null) {
                iCallback.onSuccess();
                b.c(iCallback.f6169a);
            }
        } else if (iCallback != null) {
            iCallback.onFailure("", "agoo server error-pushtoken null");
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onAntiBrush(boolean z, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec7a087d", new Object[]{this, new Boolean(z), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onConnected(TaoBaseService.ConnectInfo connectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df10c6", new Object[]{this, connectInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onDisconnected(TaoBaseService.ConnectInfo connectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46188f6", new Object[]{this, connectInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
            return;
        }
        String str3 = NotifManager.tokenReportDataId;
        if (!TextUtils.isEmpty(str3) && str3.equals(str2)) {
            Launcher_InitPush.manuMonitor.result = i == 200;
            if (UtilityImpl.isAppKeepAlive() && fxp.g(fxp.j()) == -2 && i == 200) {
                APreferencesManager.getSharedPreferences(GlobalClientInfo.getContext(), "Agoo_AppStore", 4).edit().putLong(Constants.SP_KEY_REPORT_TOKEN_TIME, System.currentTimeMillis()).apply();
                ALog.e("RequestListener", "report token success,", "dataId", str2);
            }
            Launcher_InitPush.monitorNow(GlobalClientInfo.getContext());
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        boolean equals;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
            return;
        }
        try {
            if (NotifManager.getServiceId(GlobalClientInfo.getContext(), TaobaoConstants.SERVICE_ID_DEVICECMD).equals(str)) {
                ICallback iCallback = (ICallback) ((HashMap) this.f28490a).get(str2);
                if (i == 200) {
                    String str3 = new String(bArr, "utf-8");
                    ALog.i("RequestListener", "RequestListener onResponse", "dataId", str2, DataReceiveMonitor.CB_LISTENER, iCallback, "json", str3);
                    JSONObject jSONObject = new JSONObject(str3);
                    String a2 = bxf.a(jSONObject, "resultCode", null);
                    String a3 = bxf.a(jSONObject, "cmd", null);
                    if (!"success".equals(a2)) {
                        if (iCallback != null) {
                            iCallback.onFailure(String.valueOf(a2), "agoo server error");
                        }
                        if (!equals) {
                            return;
                        }
                        return;
                    } else if ("register".equals(a3)) {
                        String a4 = bxf.a(jSONObject, "deviceId", null);
                        if (!TextUtils.isEmpty(a4)) {
                            TaobaoRegister.setIsRegisterSuccess(true);
                            tv9.h().q();
                            Config.setDeviceToken(GlobalClientInfo.getContext(), a4);
                            b.e(GlobalClientInfo.getContext().getPackageName());
                            if (iCallback instanceof IRegister) {
                                UtilityImpl.saveUtdid("Agoo_AppStore", GlobalClientInfo.getContext());
                                ((IRegister) iCallback).onSuccess(a4);
                            }
                        } else if (iCallback != null) {
                            iCallback.onFailure("", "agoo server error deviceid null");
                        }
                        if (NotifManager.getServiceId(GlobalClientInfo.getContext(), TaobaoConstants.SERVICE_ID_DEVICECMD).equals(str)) {
                            ((HashMap) this.f28490a).remove(str2);
                            return;
                        }
                        return;
                    } else if (rr0.JSON_CMD_SETALIAS.equals(a3)) {
                        a(jSONObject, iCallback);
                        if (NotifManager.getServiceId(GlobalClientInfo.getContext(), TaobaoConstants.SERVICE_ID_DEVICECMD).equals(str)) {
                            ((HashMap) this.f28490a).remove(str2);
                            return;
                        }
                        return;
                    } else if (rr0.JSON_CMD_REMOVEALIAS.equals(a3)) {
                        Config.setPushAliasToken(GlobalClientInfo.getContext(), null);
                        if (iCallback != null) {
                            iCallback.onSuccess();
                        }
                        b.d();
                        if (NotifManager.getServiceId(GlobalClientInfo.getContext(), TaobaoConstants.SERVICE_ID_DEVICECMD).equals(str)) {
                            ((HashMap) this.f28490a).remove(str2);
                            return;
                        }
                        return;
                    } else if ((p0r.JSON_CMD_ENABLEPUSH.equals(a3) || p0r.JSON_CMD_DISABLEPUSH.equals(a3)) && iCallback != null) {
                        iCallback.onSuccess();
                    }
                } else if (iCallback != null) {
                    iCallback.onFailure(String.valueOf(i), "accs channel error");
                }
            }
            if (!NotifManager.getServiceId(GlobalClientInfo.getContext(), TaobaoConstants.SERVICE_ID_DEVICECMD).equals(str)) {
                return;
            }
        } catch (Throwable th) {
            try {
                ALog.e("RequestListener", "onResponse", th, new Object[0]);
                if (!NotifManager.getServiceId(GlobalClientInfo.getContext(), TaobaoConstants.SERVICE_ID_DEVICECMD).equals(str)) {
                    return;
                }
            } finally {
                if (NotifManager.getServiceId(GlobalClientInfo.getContext(), TaobaoConstants.SERVICE_ID_DEVICECMD).equals(str)) {
                    ((HashMap) this.f28490a).remove(str2);
                }
            }
        }
        ((HashMap) this.f28490a).remove(str2);
    }
}
