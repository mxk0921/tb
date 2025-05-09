package com.android.taobao.safeclean;

import android.content.Intent;
import android.taobao.safemode.SafeModeReceiver;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.aranger.exception.IPCException;
import tb.p1r;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AccsBypassService extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(654311425);
    }

    public static /* synthetic */ Object ipc$super(AccsBypassService accsBypassService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/android/taobao/safeclean/AccsBypassService");
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf7f97aa", new Object[]{this, str});
            return;
        }
        Intent intent = new Intent(this, MainProcessAccsReceiver.class);
        intent.putExtra("command", str);
        sendBroadcast(intent);
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    @Override // com.taobao.accs.base.AccsDataListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onData(java.lang.String r6, java.lang.String r7, java.lang.String r8, byte[] r9, com.taobao.accs.base.TaoBaseService.ExtraInfo r10) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.android.taobao.safeclean.AccsBypassService.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0021
            java.lang.String r1 = "694255fc"
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r3 = 1
            r2[r3] = r6
            r6 = 2
            r2[r6] = r7
            r6 = 3
            r2[r6] = r8
            r6 = 4
            r2[r6] = r9
            r6 = 5
            r2[r6] = r10
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0021:
            r6 = 0
            java.lang.String r7 = new java.lang.String     // Catch: UnsupportedEncodingException | JSONException -> 0x0044
            java.lang.String r8 = "utf-8"
            r7.<init>(r9, r8)     // Catch: UnsupportedEncodingException | JSONException -> 0x0044
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: UnsupportedEncodingException | JSONException -> 0x0044
            r8.<init>(r7)     // Catch: UnsupportedEncodingException | JSONException -> 0x0044
            java.lang.String r9 = "appVersion"
            java.lang.String r10 = "0"
            java.lang.String r9 = r8.optString(r9, r10)     // Catch: UnsupportedEncodingException | JSONException -> 0x0044
            java.lang.String r10 = "type"
            java.lang.String r6 = r8.optString(r10)     // Catch: UnsupportedEncodingException | JSONException -> 0x0042
            r4 = r7
            r7 = r6
            r6 = r4
            goto L_0x0047
        L_0x0042:
            goto L_0x0046
        L_0x0044:
            r9 = r6
        L_0x0046:
            r7 = r6
        L_0x0047:
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 == 0) goto L_0x004e
            return
        L_0x004e:
            java.lang.String r8 = "AccsSource"
            android.util.Log.e(r8, r6)
            java.lang.String r8 = "safemode"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x006e
            tb.o7h r7 = tb.o7h.b()
            java.lang.String r7 = r7.g()
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x0071
            r5.b(r6, r9)
            goto L_0x0071
        L_0x006e:
            r5.a(r6)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.taobao.safeclean.AccsBypassService.onData(java.lang.String, java.lang.String, java.lang.String, byte[], com.taobao.accs.base.TaoBaseService$ExtraInfo):void");
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    public final void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf05fb2e", new Object[]{this, str, str2});
        } else if (!"false".equals(p1r.b(this, "support_command_safemode", "false"))) {
            try {
                if (System.currentTimeMillis() - Long.parseLong(p1r.b(this, "lastTime", "0")) < 14400000) {
                    return;
                }
            } catch (Exception unused) {
            }
            p1r.a(this, "lastTime", String.valueOf(System.currentTimeMillis()));
            try {
                IpChange ipChange2 = SafeModeReceiver.$ipChange;
                Intent intent = new Intent(this, SafeModeReceiver.class);
                intent.setPackage(getPackageName());
                intent.putExtra("Launch", true);
                intent.putExtra(HeaderConstant.HEADER_KEY_VERSION, str2);
                intent.putExtra("command", str);
                sendBroadcast(intent);
            } catch (Throwable unused2) {
            }
        }
    }
}
