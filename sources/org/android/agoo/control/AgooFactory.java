package org.android.agoo.control;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.NoTraceTriggerHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.common.MsgDO;
import org.android.agoo.message.MessageService;
import org.android.agoo.service.SendMessage;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.bmv;
import tb.brt;
import tb.c71;
import tb.j8l;
import tb.lef;
import tb.rd0;
import tb.t2o;
import tb.vu3;
import tb.xd0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AgooFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEAL_MESSAGE = "accs.msgRecevie";
    private static final String TAG = "AgooFactory";
    private static Context mContext = null;
    public NotifManager notifyManager = null;
    private MessageService messageService = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class MessageConnection implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Intent intent;
        private String messageId;
        private ServiceConnection sc = this;
        private SendMessage sendMessage;

        static {
            t2o.a(343933331);
        }

        public MessageConnection(String str, Intent intent) {
            this.messageId = str;
            this.intent = intent;
        }

        public static /* synthetic */ Intent access$200(MessageConnection messageConnection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("8684dae0", new Object[]{messageConnection});
            }
            return messageConnection.intent;
        }

        public static /* synthetic */ SendMessage access$300(MessageConnection messageConnection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SendMessage) ipChange.ipc$dispatch("cf639d0a", new Object[]{messageConnection});
            }
            return messageConnection.sendMessage;
        }

        public static /* synthetic */ SendMessage access$302(MessageConnection messageConnection, SendMessage sendMessage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SendMessage) ipChange.ipc$dispatch("ccb67c00", new Object[]{messageConnection, sendMessage});
            }
            messageConnection.sendMessage = sendMessage;
            return sendMessage;
        }

        public static /* synthetic */ ServiceConnection access$400(MessageConnection messageConnection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ServiceConnection) ipChange.ipc$dispatch("3a2822c9", new Object[]{messageConnection});
            }
            return messageConnection.sc;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            ALog.d(AgooFactory.TAG, "MessageConnection conneted:" + componentName, new Object[0]);
            this.sendMessage = SendMessage.Stub.asInterface(iBinder);
            ALog.d(AgooFactory.TAG, "onConnected current tid:" + Thread.currentThread().getId(), new Object[0]);
            ALog.d(AgooFactory.TAG, "MessageConnection sent:" + this.intent, new Object[0]);
            if (this.sendMessage != null) {
                brt.b(new Runnable() { // from class: org.android.agoo.control.AgooFactory.MessageConnection.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v0 */
                    /* JADX WARN: Type inference failed for: r0v7, types: [android.content.Context] */
                    /* JADX WARN: Type inference failed for: r0v9 */
                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.ServiceConnection] */
                    @Override // java.lang.Runnable
                    public void run() {
                        int i = 0;
                        i = 0;
                        String str = "send finish. close this connection";
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            try {
                                ALog.d(AgooFactory.TAG, "onConnected running tid:" + Thread.currentThread().getId(), new Object[0]);
                                MessageConnection.access$300(MessageConnection.this).doSend(MessageConnection.access$200(MessageConnection.this));
                                ALog.d(AgooFactory.TAG, str, new Object[0]);
                            } catch (RemoteException e) {
                                ALog.e(AgooFactory.TAG, "send error", e, new Object[0]);
                                ALog.d(AgooFactory.TAG, str, new Object[0]);
                            }
                            MessageConnection.access$302(MessageConnection.this, null);
                            i = AgooFactory.access$000();
                            str = MessageConnection.access$400(MessageConnection.this);
                            i.unbindService(str);
                        } catch (Throwable th) {
                            ALog.d(AgooFactory.TAG, str, new Object[i]);
                            MessageConnection.access$302(MessageConnection.this, null);
                            AgooFactory.access$000().unbindService(MessageConnection.access$400(MessageConnection.this));
                            throw th;
                        }
                    }
                });
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            } else {
                ALog.d(AgooFactory.TAG, "MessageConnection disConnected", new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class SendMessageRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Intent intent;
        private String pack;

        static {
            t2o.a(343933333);
        }

        public SendMessageRunnable(String str, Intent intent) {
            this.pack = str;
            this.intent = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ALog.d(AgooFactory.TAG, "running tid:" + Thread.currentThread().getId() + ",pack=" + this.pack, new Object[0]);
                AgooFactory.access$000().sendBroadcast(this.intent);
                StringBuilder sb = new StringBuilder("SendMessageRunnable for accs,pack=");
                sb.append(this.pack);
                ALog.d(AgooFactory.TAG, sb.toString(), new Object[0]);
                try {
                    this.intent.setPackage(this.pack);
                    this.intent.setAction(AgooConstants.INTENT_FROM_AGOO_MESSAGE);
                    lef.f(AgooFactory.access$000(), this.intent);
                } catch (Throwable unused) {
                }
                Intent intent = new Intent(AgooConstants.BINDER_MSGRECEIVER_ACTION);
                intent.setPackage(this.pack);
                ALog.d(AgooFactory.TAG, "this message pack:" + this.pack, new Object[0]);
                ALog.d(AgooFactory.TAG, "start to service...", new Object[0]);
                boolean bindService = AgooFactory.access$000().bindService(intent, new MessageConnection(this.intent.getStringExtra("id"), this.intent), 17);
                ALog.d(AgooFactory.TAG, "start service ret:" + bindService, new Object[0]);
                if (!bindService) {
                    ALog.d(AgooFactory.TAG, "SendMessageRunnable is error", new Object[0]);
                }
            } catch (Throwable th) {
                ALog.e(AgooFactory.TAG, "SendMessageRunnable is error,e=" + th.toString(), new Object[0]);
            }
        }
    }

    static {
        t2o.a(343933325);
    }

    public static /* synthetic */ Context access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("bf71316f", new Object[0]);
        }
        return mContext;
    }

    public static /* synthetic */ MessageService access$100(AgooFactory agooFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageService) ipChange.ipc$dispatch("72fc5ef0", new Object[]{agooFactory});
        }
        return agooFactory.messageService;
    }

    private static final boolean checkPackage(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("948c6ad1", new Object[]{context, str})).booleanValue();
        }
        if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
            return true;
        }
        return false;
    }

    public void init(Context context, NotifManager notifManager, MessageService messageService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8330c08a", new Object[]{this, context, notifManager, messageService});
            return;
        }
        mContext = context.getApplicationContext();
        this.notifyManager = notifManager;
        if (notifManager == null) {
            this.notifyManager = new NotifManager();
        }
        this.notifyManager.init(mContext);
        this.messageService = messageService;
        if (messageService == null) {
            this.messageService = new MessageService();
        }
        this.messageService.init(mContext);
    }

    public Bundle msgReceiverPreHandler(byte[] bArr, String str, TaoBaseService.ExtraInfo extraInfo, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("171f57f6", new Object[]{this, bArr, str, extraInfo, new Boolean(z)}) : msgReceiverPreHandler(bArr, str, extraInfo, z, null);
    }

    public void msgRecevie(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45639134", new Object[]{this, bArr, str});
        } else {
            msgRecevie(bArr, str, null);
        }
    }

    public void saveMsg(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcaf152", new Object[]{this, bArr});
        } else {
            saveMsg(bArr, null);
        }
    }

    public void updateMsg(final byte[] bArr, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7dab40e", new Object[]{this, bArr, new Boolean(z)});
        } else {
            brt.b(new Runnable() { // from class: org.android.agoo.control.AgooFactory.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String str2 = new String(bArr, "utf-8");
                        if (TextUtils.isEmpty(str2)) {
                            c71.c("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "msg==null", vu3.b.GEO_NOT_SUPPORT);
                            return;
                        }
                        ALog.i(AgooFactory.TAG, "message = ".concat(str2), new Object[0]);
                        JSONObject jSONObject = new JSONObject(str2);
                        String string = jSONObject.getString("api");
                        String string2 = jSONObject.getString("id");
                        if (TextUtils.equals(string, "agooReport")) {
                            str = jSONObject.getString("status");
                        } else {
                            str = null;
                        }
                        if (TextUtils.equals(string, AgooConstants.AGOO_SERVICE_AGOOACK)) {
                            c71.c("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, "handlerACKMessage", vu3.b.GEO_NOT_SUPPORT);
                        }
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(str)) {
                            if (ALog.isPrintLog(ALog.Level.I)) {
                                ALog.i(AgooFactory.TAG, "updateMsg data begin,api=" + string + ",id=" + string2 + ",status=" + str + ",reportTimes=" + Config.getReportCacheMsg(AgooFactory.access$000()), new Object[0]);
                            }
                            if (TextUtils.equals(string, "agooReport")) {
                                if (TextUtils.equals(str, "4") && z) {
                                    AgooFactory.access$100(AgooFactory.this).updateAccsMessage(string2, "1");
                                } else if ((TextUtils.equals(str, "8") || TextUtils.equals(str, "9")) && z) {
                                    AgooFactory.access$100(AgooFactory.this).updateAccsMessage(string2, "100");
                                }
                                c71.c("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, str, vu3.b.GEO_NOT_SUPPORT);
                                return;
                            }
                            return;
                        }
                        c71.c("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "json key null", vu3.b.GEO_NOT_SUPPORT);
                    } catch (Throwable th) {
                        ALog.e(AgooFactory.TAG, "updateMsg get data error,e=" + th, new Object[0]);
                        c71.c("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "json exception", vu3.b.GEO_NOT_SUPPORT);
                    }
                }
            });
        }
    }

    public void updateNotifyMsg(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9ec7ca", new Object[]{this, str, str2});
        } else {
            brt.b(new Runnable() { // from class: org.android.agoo.control.AgooFactory.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AgooFactory.this.updateMsgStatus(str, str2);
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:7:0x001a, B:9:0x0028, B:12:0x0032, B:13:0x0038, B:15:0x003e, B:16:0x0044, B:19:0x004c, B:21:0x0054, B:22:0x0072, B:23:0x007b, B:25:0x0083, B:26:0x00b9, B:29:0x00c3, B:31:0x00c6, B:32:0x00ea), top: B:35:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String parseEncryptedMsg(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.control.AgooFactory.parseEncryptedMsg(java.lang.String):java.lang.String");
    }

    private void sendMsgByBindService(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49e8f1d6", new Object[]{this, str, intent});
            return;
        }
        try {
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d(TAG, "onHandleMessage current tid:" + Thread.currentThread().getId(), new Object[0]);
            }
            brt.b(new SendMessageRunnable(str, intent));
        } catch (Throwable th) {
            ALog.e(TAG, "sendMsgByBindService error >>", th, new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v2 */
    public Bundle msgReceiverPreHandler(byte[] bArr, String str, TaoBaseService.ExtraInfo extraInfo, boolean z, List<MsgDO> list) {
        Object th;
        Bundle bundle;
        boolean z2;
        int i;
        String str2 = 1;
        String str3 = ",";
        String str4 = "ext";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("34046a7", new Object[]{this, bArr, str, extraInfo, new Boolean(z), list});
        }
        String str5 = TAG;
        try {
            if (bArr != null) {
                try {
                    if (bArr.length > 0) {
                        String str6 = new String(bArr, "utf-8");
                        if (ALog.isPrintLog(ALog.Level.I)) {
                            ALog.i(str5, "msgRecevie,message--->[" + str6 + "],utdid=" + xd0.c(mContext), new Object[0]);
                        }
                        if (TextUtils.isEmpty(str6)) {
                            ALog.i(str5, "handleMessage message==null,utdid=" + xd0.c(mContext), new Object[0]);
                            return null;
                        }
                        JSONArray jSONArray = new JSONArray(str6);
                        int length = jSONArray.length();
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder();
                        Bundle bundle2 = null;
                        String str7 = null;
                        for (int i2 = 0; i2 < length; i2 = i + 1) {
                            Bundle bundle3 = new Bundle();
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            if (jSONObject == null) {
                                jSONArray = jSONArray;
                                sb2 = sb2;
                                sb = sb;
                                length = length;
                                str5 = str5;
                                str4 = str4;
                                bundle2 = bundle3;
                                str3 = str3;
                                str7 = str7;
                                i = i2;
                                str6 = str6;
                            } else {
                                jSONArray = jSONArray;
                                MsgDO msgDO = new MsgDO();
                                String string = jSONObject.getString("p");
                                String string2 = jSONObject.getString(bmv.MSGTYPE_INTERVAL);
                                String string3 = jSONObject.getString(TplMsg.VALUE_T_NATIVE_RETURN);
                                long j = jSONObject.getLong("f");
                                if (!jSONObject.isNull(str4)) {
                                    str7 = jSONObject.getString(str4);
                                }
                                int i3 = length - 1;
                                msgDO.msgIds = string2;
                                msgDO.extData = str7;
                                msgDO.removePacks = string;
                                msgDO.messageSource = str;
                                if (TextUtils.isEmpty(string3)) {
                                    msgDO.errorCode = "11";
                                    if (list == null) {
                                        this.notifyManager.handlerACKMessage(msgDO, extraInfo);
                                    } else {
                                        list.add(msgDO);
                                    }
                                } else if (TextUtils.isEmpty(string)) {
                                    msgDO.errorCode = "12";
                                    if (list == null) {
                                        this.notifyManager.handlerACKMessage(msgDO, extraInfo);
                                    } else {
                                        list.add(msgDO);
                                    }
                                } else if (j == -1) {
                                    msgDO.errorCode = "13";
                                    if (list == null) {
                                        this.notifyManager.handlerACKMessage(msgDO, extraInfo);
                                    } else {
                                        list.add(msgDO);
                                    }
                                } else {
                                    if (!checkPackage(mContext, string)) {
                                        ALog.d(str5, "msgRecevie checkpackage is del,pack=" + string, new Object[0]);
                                        sb2 = sb2;
                                        sb2.append(string);
                                        sb.append(string2);
                                        if (i2 < i3) {
                                            sb2.append(str3);
                                            sb.append(str3);
                                            i = i2;
                                            sb = sb;
                                            str5 = str5;
                                            str3 = str3;
                                            bundle2 = bundle3;
                                            length = length;
                                            str6 = str6;
                                        } else {
                                            i = i2;
                                            str5 = str5;
                                            bundle2 = bundle3;
                                            length = length;
                                            str6 = str6;
                                            str3 = str3;
                                            str4 = str4;
                                            sb = sb;
                                        }
                                    } else {
                                        sb2 = sb2;
                                        Bundle flag = getFlag(j, msgDO);
                                        String string4 = flag.getString(AgooConstants.MESSAGE_ENCRYPTED);
                                        if (mContext.getPackageName().equals(string)) {
                                            if (!TextUtils.equals(string4, "4") && !TextUtils.equals(string4, "0")) {
                                                ALog.e(str5, "msgRecevie msg encrypted flag not exist, cannot prase!!!", new Object[0]);
                                                msgDO.errorCode = AgooConstants.REPORT_NOT_ENCRYPT;
                                                if (list == null) {
                                                    this.notifyManager.handlerACKMessage(msgDO, extraInfo);
                                                } else {
                                                    list.add(msgDO);
                                                }
                                                str5 = str5;
                                                str3 = str3;
                                                bundle2 = bundle3;
                                                length = length;
                                                str6 = str6;
                                                i = i2;
                                                sb = sb;
                                            }
                                            bundle = bundle3;
                                            z2 = false;
                                        } else {
                                            bundle = bundle3;
                                            z2 = true;
                                        }
                                        bundle.putAll(flag);
                                        String string5 = jSONObject.getString("t");
                                        if (!TextUtils.isEmpty(string5)) {
                                            bundle.putString("time", string5);
                                        }
                                        str5 = str5;
                                        bundle.putLong("trace", System.currentTimeMillis());
                                        bundle.putString("id", string2);
                                        bundle.putString(AgooConstants.MESSAGE_BODY, string3);
                                        bundle.putString("source", string);
                                        bundle.putString(AgooConstants.MESSAGE_FROM_APPKEY, Config.getAgooAppKey(mContext));
                                        bundle.putString(AgooConstants.MESSAGE_EXT, str7);
                                        bundle.putString(AgooConstants.MESSAGE_ORI, str6);
                                        if (z) {
                                            i = i2;
                                            sb2 = sb2;
                                            sb = sb;
                                            length = length;
                                            str6 = str6;
                                            bundle2 = bundle;
                                            str3 = str3;
                                            str4 = str4;
                                            sendMsgToBussiness(mContext, string, bundle, z2, str, extraInfo);
                                        } else {
                                            bundle2 = bundle;
                                            sb2 = sb2;
                                            str3 = str3;
                                            length = length;
                                            i = i2;
                                            sb = sb;
                                            str4 = str4;
                                            str6 = str6;
                                            bundle2.putString("type", "common-push");
                                            bundle2.putString(AgooConstants.MESSAGE_SOURCE, str);
                                        }
                                    }
                                    str4 = str4;
                                }
                                length = length;
                                str5 = str5;
                                bundle2 = bundle3;
                                str6 = str6;
                                sb2 = sb2;
                                i = i2;
                                str4 = str4;
                                str3 = str3;
                                sb = sb;
                            }
                        }
                        if (sb2.length() > 0) {
                            MsgDO msgDO2 = new MsgDO();
                            msgDO2.msgIds = sb.toString();
                            msgDO2.removePacks = sb2.toString();
                            msgDO2.errorCode = "10";
                            msgDO2.messageSource = str;
                            if (list == null) {
                                this.notifyManager.handlerACKMessage(msgDO2, extraInfo);
                            } else {
                                list.add(msgDO2);
                            }
                        }
                        return bundle2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str2 = str5;
                    if (ALog.isPrintLog(ALog.Level.E)) {
                        ALog.e(str2, "msgRecevie is error,e=" + th, new Object[0]);
                    }
                    return null;
                }
            }
            ALog.i(str5, "handleMessage data==null,utdid=" + xd0.c(mContext), new Object[0]);
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void msgRecevie(final byte[] bArr, final String str, final TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e1803d", new Object[]{this, bArr, str, extraInfo});
            return;
        }
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.i(TAG, "into--[AgooFactory,msgRecevie]:messageSource=" + str, new Object[0]);
            }
            brt.b(new Runnable() { // from class: org.android.agoo.control.AgooFactory.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AgooFactory.this.msgReceiverPreHandler(bArr, str, extraInfo, true);
                    }
                }
            });
        } catch (Throwable th) {
            ALog.e(TAG, "serviceImpl init task fail:" + th.toString(), new Object[0]);
        }
    }

    public void reportCacheMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b80d0fa", new Object[]{this});
            return;
        }
        try {
            brt.b(new Runnable() { // from class: org.android.agoo.control.AgooFactory.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArrayList<MsgDO> unReportMsg = AgooFactory.access$100(AgooFactory.this).getUnReportMsg();
                    if (unReportMsg != null && unReportMsg.size() > 0) {
                        ALog.e(AgooFactory.TAG, "reportCacheMsg", "size", Integer.valueOf(unReportMsg.size()));
                        Iterator<MsgDO> it = unReportMsg.iterator();
                        while (it.hasNext()) {
                            MsgDO next = it.next();
                            if (next != null) {
                                next.isFromCache = true;
                                next.triggerType = j8l.d(AgooFactory.access$000());
                                AgooFactory.this.notifyManager.report(next, null);
                            }
                        }
                    }
                }
            });
        } catch (Throwable th) {
            ALog.e(TAG, "reportCacheMsg fail:" + th.toString(), new Object[0]);
        }
    }

    public void saveMsg(final byte[] bArr, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98a92a9c", new Object[]{this, bArr, str});
        } else if (bArr != null && bArr.length > 0) {
            brt.b(new Runnable() { // from class: org.android.agoo.control.AgooFactory.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String str2 = new String(bArr, "utf-8");
                        JSONArray jSONArray = new JSONArray(str2);
                        int length = jSONArray.length();
                        if (length == 1) {
                            String str3 = null;
                            String str4 = null;
                            for (int i = 0; i < length; i++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i);
                                if (jSONObject != null) {
                                    str3 = jSONObject.getString(bmv.MSGTYPE_INTERVAL);
                                    str4 = jSONObject.getString("p");
                                }
                            }
                            if (ALog.isPrintLog(ALog.Level.I)) {
                                ALog.i(AgooFactory.TAG, "saveMsg msgId:" + str3 + ",message=" + str2 + ",currentPack=" + str4 + ",reportTimes=" + Config.getReportCacheMsg(AgooFactory.access$000()), new Object[0]);
                            }
                            if (!TextUtils.isEmpty(str4) && TextUtils.equals(str4, AgooFactory.access$000().getPackageName())) {
                                if (TextUtils.isEmpty(str)) {
                                    AgooFactory.access$100(AgooFactory.this).addAccsMessage(str3, str2, "0");
                                } else {
                                    AgooFactory.access$100(AgooFactory.this).addAccsMessage(str3, str2, str);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        ALog.e(AgooFactory.TAG, "saveMsg fail:" + th.toString(), new Object[0]);
                    }
                }
            });
        }
    }

    public void updateMsgStatus(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0aaa825", new Object[]{this, str, str2});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.i(TAG, "updateNotifyMsg begin,messageId=" + str + ",status=" + str2 + ",reportTimes=" + Config.getReportCacheMsg(mContext), new Object[0]);
                }
                if (TextUtils.equals(str2, "8")) {
                    this.messageService.updateAccsMessage(str, "2");
                } else if (TextUtils.equals(str2, "9")) {
                    this.messageService.updateAccsMessage(str, "3");
                }
            }
        } catch (Throwable th) {
            ALog.e(TAG, "updateNotifyMsg e=" + th.toString(), new Object[0]);
        }
    }

    private void sendMsgToBussiness(Context context, String str, Bundle bundle, boolean z, String str2, TaoBaseService.ExtraInfo extraInfo) {
        AccsClientConfig accsClientConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef6af75", new Object[]{this, context, str, bundle, new Boolean(z), str2, extraInfo});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(AgooConstants.INTENT_FROM_AGOO_MESSAGE);
        intent.setPackage(str);
        intent.putExtras(bundle);
        intent.putExtra("type", "common-push");
        intent.putExtra(AgooConstants.MESSAGE_SOURCE, str2);
        intent.addFlags(32);
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable(AgooConstants.MESSAGE_ACCS_EXTRA, extraInfo);
            intent.putExtra(AgooConstants.MESSAGE_AGOO_BUNDLE, bundle2);
            accsClientConfig = AccsClientConfig.getConfigByTag("default");
        } catch (Throwable th) {
            ALog.e(TAG, "sendMsgToBussiness", th, new Object[0]);
            accsClientConfig = null;
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i(TAG, "sendMsgToBussiness intent:" + bundle.toString() + ",utdid=" + xd0.c(context) + ",pack=" + str + ",agooFlag=" + z, new Object[0]);
        }
        if (z) {
            NoTraceTriggerHelper.f(context, str, 3);
            if (accsClientConfig != null && accsClientConfig.isPullUpEnable()) {
                sendMsgByBindService(str, intent);
                return;
            }
            return;
        }
        intent.setClassName(str, rd0.a(str));
        lef.f(context, intent);
    }

    private static Bundle getFlag(long j, MsgDO msgDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("82cc92c4", new Object[]{new Long(j), msgDO});
        }
        Bundle bundle = new Bundle();
        try {
            char[] charArray = Long.toBinaryString(j).toCharArray();
            int length = charArray.length;
            if (8 <= length) {
                StringBuilder sb = new StringBuilder("");
                sb.append(Integer.parseInt("" + charArray[1] + charArray[2] + charArray[3] + charArray[4], 2));
                String sb2 = sb.toString();
                bundle.putString(AgooConstants.MESSAGE_ENCRYPTED, sb2);
                ALog.i(TAG, "getFlag", "msgEncryptFlag", sb2);
                if (charArray[6] == '1') {
                    bundle.putString("report", "1");
                    msgDO.reportStr = "1";
                }
                if (charArray[7] == '1') {
                    bundle.putString("notify", "1");
                }
                if (9 <= length && charArray[8] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_HAS_TEST, "1");
                }
                if (10 <= length && charArray[9] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_DUPLICATE, "1");
                }
                if (11 <= length && charArray[10] == '1') {
                    bundle.putInt(AgooConstants.MESSAGE_POPUP, 1);
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }
}
