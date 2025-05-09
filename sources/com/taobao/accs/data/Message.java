package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.state.a;
import com.taobao.accs.net.BaseConnection;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import tb.bk8;
import tb.bxf;
import tb.c0z;
import tb.c71;
import tb.j8l;
import tb.pfo;
import tb.t2o;
import tb.v7b;
import tb.vu3;
import tb.wqi;
import tb.x5i;
import tb.z1r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Message implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BINDAPP_V1 = "1";
    public static final String BINDAPP_V2 = "2";
    public static final int EXT_HEADER_VALUE_MAX_LEN = 1023;
    public static final int FLAG_ACK_TYPE = 32;
    public static final int FLAG_BIZ_RET = 64;
    public static final int FLAG_DATA_TYPE = 32768;
    public static final int FLAG_ERR = 4096;
    public static final int FLAG_REQ_BIT1 = 16384;
    public static final int FLAG_REQ_BIT2 = 8192;
    public static final int FLAG_RET = 2048;
    public static final String KEY_BINDAPP = "ctrl_bindapp";
    public static final String KEY_BINDSERVICE = "ctrl_bindservice";
    public static final String KEY_BINDUSER = "ctrl_binduser";
    public static final String KEY_UNBINDAPP = "ctrl_unbindapp";
    public static final String KEY_UNBINDSERVICE = "ctrl_unbindservice";
    public static final String KEY_UNBINDUSER = "ctrl_unbinduser";
    public static final int MAX_RETRY_TIMES = 3;
    private static final String TAG = "Msg";
    public long accsUpTime;
    public String cunstomDataId;
    public byte[] data;
    public String dataId;
    public short dataLength;
    public Map<Integer, String> extHeader;
    public short extHeaderLength;
    public short flags;
    public URL host;
    public Id msgId;
    public transient NetPerformanceMonitor netPerformanceMonitor;
    public int node;
    public long sendEndTime;
    public long sendTime;
    public String source;
    public byte sourceLength;
    public long startSendTime;
    public String target;
    public byte targetLength;
    public short totalLength;
    public static int CONTROL_MAX_RETRY_TIMES = 5;
    public static long baseMessageId = 1;
    public boolean isAck = false;
    public boolean force = false;
    public boolean isCancel = false;
    public byte compress = 0;
    public byte noUse = 0;
    public int type = -1;
    public String packageName = null;
    public Integer command = null;
    public Integer updateDevice = 0;
    public String appKey = null;
    public String appSign = null;
    public Integer osType = null;
    public String osVersion = null;
    public String venderOsName = null;
    public String venderOsVersion = null;
    public String exts = null;
    public String appVersion = null;
    public Integer sdkVersion = null;
    public String ttid = null;
    public String macAddress = null;
    public String userinfo = null;
    public String serviceId = null;
    public String model = null;
    public String brand = null;
    public String imei = null;
    public String imsi = null;
    public String notifyEnable = null;
    public long delyTime = 0;
    public int retryTimes = 0;
    public int timeout = 40000;
    public String bizId = null;
    public String tag = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Id implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String dataId;
        private int id;

        static {
            t2o.a(343933083);
        }

        public Id(int i, String str) {
            this.id = i;
            this.dataId = str;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Id id = (Id) obj;
            if (this.id == id.getId() || this.dataId.equals(id.getDataId())) {
                return true;
            }
            return false;
        }

        public String getDataId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6bbd4c7e", new Object[]{this});
            }
            return this.dataId;
        }

        public int getId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
            }
            return this.id;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return this.dataId.hashCode();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class MsgResType implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALID = -1;
        public static final int NEED_ACK = 1;
        public static final int NO_ACK = 0;

        static {
            t2o.a(343933084);
        }

        public static int valueOf(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c8593527", new Object[]{new Integer(i)})).intValue();
            }
            if (i != 0) {
                return 1;
            }
            return 0;
        }

        public static String name(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e783c90f", new Object[]{new Integer(i)});
            }
            if (i == 0) {
                return "NO_ACK";
            }
            if (i != 1) {
                return v7b.DEFAULT_HTTPS_ERROR_INVALID;
            }
            return "NEED_ACK";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class MsgType implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int CONTROL = 0;
        public static final int DATA = 1;
        public static final int HANDSHAKE = 3;
        public static final int INVALID = -1;
        public static final int PING = 2;

        static {
            t2o.a(343933085);
        }

        public static int valueOf(int i) {
            int i2 = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c8593527", new Object[]{new Integer(i)})).intValue();
            }
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        return 0;
                    }
                }
            }
            return i2;
        }

        public static String name(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e783c90f", new Object[]{new Integer(i)});
            }
            if (i == 0) {
                return "CONTROL";
            }
            if (i == 1) {
                return "DATA";
            }
            if (i == 2) {
                return "PING";
            }
            if (i != 3) {
                return v7b.DEFAULT_HTTPS_ERROR_INVALID;
            }
            return "HANDSHAKE";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum ReqType {
        DATA,
        ACK,
        REQ,
        RES;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ReqType reqType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/data/Message$ReqType");
        }

        public static ReqType valueOf(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ReqType) ipChange.ipc$dispatch("4d77662c", new Object[]{str}) : (ReqType) Enum.valueOf(ReqType.class, str);
        }

        public static ReqType valueOf(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ReqType) ipChange.ipc$dispatch("a53b8191", new Object[]{new Integer(i)});
            }
            if (i == 0) {
                return DATA;
            }
            if (i == 1) {
                return ACK;
            }
            if (i == 2) {
                return REQ;
            }
            if (i != 3) {
                return DATA;
            }
            return RES;
        }
    }

    static {
        t2o.a(343933082);
    }

    public Message() {
        synchronized (Message.class) {
            this.startSendTime = System.currentTimeMillis();
            this.dataId = this.startSendTime + "." + baseMessageId;
            long j = baseMessageId;
            baseMessageId = 1 + j;
            this.msgId = new Id((int) j, this.dataId);
        }
    }

    public static Message BuildPing(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("29700363", new Object[]{new Boolean(z), new Integer(i)});
        }
        Message message = new Message();
        message.type = 2;
        message.command = 201;
        message.force = z;
        message.delyTime = i;
        return message;
    }

    public static Message buildBindApp(String str, String str2, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("230f5545", new Object[]{str, str2, context, intent});
        }
        Message message = null;
        try {
            message = buildBindApp(context, str2, intent.getStringExtra("appKey"), intent.getStringExtra("app_sercet"), intent.getStringExtra("packageName"), intent.getStringExtra("ttid"), intent.getStringExtra("appVersion"));
            setControlHost(str, message);
            return message;
        } catch (Exception e) {
            ALog.e(TAG, "buildBindApp", e.getMessage());
            return message;
        }
    }

    @Deprecated
    public static Message buildBindService(BaseConnection baseConnection, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("8fcba1a9", new Object[]{baseConnection, context, intent}) : buildBindService(baseConnection.l(null), baseConnection.r, intent);
    }

    @Deprecated
    public static Message buildBindUser(BaseConnection baseConnection, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("3af2ce75", new Object[]{baseConnection, context, intent}) : buildBindUser(baseConnection.l(null), baseConnection.r, intent);
    }

    public static Message buildEventMessage(int i, long j, String str, String str2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("90f01fc8", new Object[]{new Integer(i), new Long(j), str, str2, context});
        }
        return buildSendData(str, str2, "", context, context.getPackageName(), new ACCSManager.AccsRequest("", Constants.TARGET_SERVICE_EVENT_COLLECT, bk8.a(context, i, j), ""));
    }

    public static Message buildForeground(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("c26c7b17", new Object[]{str});
        }
        Message message = new Message();
        message.type(1, ReqType.DATA, 0);
        message.command = 100;
        message.target = Constants.TARGET_FORE;
        Context context = GlobalClientInfo.getContext();
        if (context != null) {
            message.packageName = context.getPackageName();
        }
        setControlHost(str, message);
        ALog.e(TAG, "buildFgId = ", message.dataId);
        return message;
    }

    public static Message buildHandshake(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("bd7c253f", new Object[]{str});
        }
        Message message = new Message();
        message.type(3, ReqType.DATA, 1);
        message.packageName = str;
        message.target = Constants.TARGET_CONTROL;
        message.command = 200;
        return message;
    }

    @Deprecated
    public static Message buildPushAck(BaseConnection baseConnection, String str, String str2, String str3, boolean z, short s, String str4, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("c7f44de1", new Object[]{baseConnection, str, str2, str3, new Boolean(z), new Short(s), str4, map}) : buildPushAck(baseConnection.l(null), baseConnection.r, str, str2, str3, z, s, str4, map);
    }

    public static void buildPushAckCommon(String str, String str2, String str3, String str4, String str5, boolean z, short s, String str6, Map<Integer, String> map, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ed6f720", new Object[]{str, str2, str3, str4, str5, new Boolean(z), new Short(s), str6, map, message});
            return;
        }
        message.node = 1;
        message.setPushAckFlag(s, z);
        message.source = str3;
        message.target = str4;
        message.dataId = str5;
        message.isAck = true;
        message.extHeader = map;
        try {
            if (TextUtils.isEmpty(str6)) {
                message.host = new URL(str);
            } else {
                message.host = new URL(str6);
            }
            message.tag = str2;
            if (message.host == null) {
                try {
                    message.host = new URL(str);
                } catch (Throwable th) {
                    ALog.e(TAG, "buildBizAck err", th, new Object[0]);
                }
            }
        } catch (Throwable th2) {
            try {
                ALog.e(TAG, "buildPushAckCommon", th2, new Object[0]);
                if (message.host == null) {
                    try {
                        message.host = new URL(str);
                    } catch (Throwable th3) {
                        ALog.e(TAG, "buildBizAck err", th3, new Object[0]);
                    }
                }
            } catch (Throwable th4) {
                if (message.host == null) {
                    try {
                        message.host = new URL(str);
                    } catch (Throwable th5) {
                        ALog.e(TAG, "buildBizAck err", th5, new Object[0]);
                    }
                }
                throw th4;
            }
        }
    }

    @Deprecated
    public static Message buildRequest(BaseConnection baseConnection, Context context, String str, String str2, String str3, ACCSManager.AccsRequest accsRequest, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("e5319862", new Object[]{baseConnection, context, str, str2, str3, accsRequest, new Boolean(z)}) : buildRequest(context, baseConnection.l(null), baseConnection.r, baseConnection.i.getStoreId(), str, str2, accsRequest, z);
    }

    @Deprecated
    public static Message buildSendData(BaseConnection baseConnection, Context context, String str, String str2, ACCSManager.AccsRequest accsRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("bd120253", new Object[]{baseConnection, context, str, str2, accsRequest}) : buildSendData(baseConnection.l(null), baseConnection.r, baseConnection.i.getStoreId(), context, str, accsRequest, true);
    }

    @Deprecated
    public static Message buildUnbindApp(BaseConnection baseConnection, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("a77e5a1c", new Object[]{baseConnection, context, intent}) : buildUnbindApp(baseConnection.l(null), intent);
    }

    @Deprecated
    public static Message buildUnbindService(BaseConnection baseConnection, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("3ae0f1b0", new Object[]{baseConnection, context, intent}) : buildUnbindService(baseConnection.l(null), baseConnection.r, intent);
    }

    @Deprecated
    public static Message buildUnbindUser(BaseConnection baseConnection, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("ababd3ce", new Object[]{baseConnection, context, intent}) : buildUnbindUser(baseConnection.l(null), baseConnection.r, intent);
    }

    private String getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return "Msg_" + this.tag;
    }

    private void setPushAckFlag(short s, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3c05547", new Object[]{this, new Short(s), new Boolean(z)});
            return;
        }
        this.type = 1;
        short s2 = (short) (((short) (((short) (((short) (s & (-16385))) | 8192)) & (-2049))) & (-65));
        this.flags = s2;
        if (z) {
            this.flags = (short) (s2 | 32);
        }
    }

    public bxf.a buidJsonObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bxf.a) ipChange.ipc$dispatch("3a292625", new Object[]{this});
        }
        return new bxf.a().b("command", this.command.intValue() == 100 ? null : this.command).d("appKey", this.appKey).b(Constants.KEY_OS_TYPE, this.osType).d("sign", this.appSign).b("sdkVersion", this.sdkVersion).d("appVersion", this.appVersion).d("ttid", this.ttid).d("model", this.model).d("brand", this.brand).d("imei", this.imei).d("imsi", this.imsi).d(Constants.KYE_MAC_ADDRESS, this.macAddress).d("os", this.osVersion).d(Constants.KEY_EXTS, this.exts);
    }

    public byte[] build(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("cf4272ed", new Object[]{this, context, new Integer(i)}) : build(context, i, null, null);
    }

    public void buildData() throws JSONException, UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c486bbf", new Object[]{this});
            return;
        }
        Integer num = this.command;
        if (num != null && num.intValue() != 100 && this.command.intValue() != 102) {
            this.data = buidJsonObject().a().toString().getBytes("utf-8");
        }
    }

    public void compressData() {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        GZIPOutputStream gZIPOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ca5cb3", new Object[]{this});
            return;
        }
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            try {
            } catch (Exception unused) {
                return;
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
        if (this.data != null) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                gZIPOutputStream.write(this.data);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (byteArray != null && byteArray.length < this.data.length) {
                    this.data = byteArray;
                    this.compress = (byte) 1;
                }
                gZIPOutputStream.close();
            } catch (Throwable th4) {
                th = th4;
                gZIPOutputStream2 = gZIPOutputStream;
                try {
                    Log.e(getTag(), th.toString());
                    th.printStackTrace();
                    if (gZIPOutputStream2 != null) {
                        gZIPOutputStream2.close();
                    }
                    if (byteArrayOutputStream == null) {
                        return;
                    }
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    if (gZIPOutputStream2 != null) {
                        try {
                            gZIPOutputStream2.close();
                        } catch (Exception unused2) {
                            throw th5;
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th5;
                }
            }
            byteArrayOutputStream.close();
        }
    }

    public long getAccsUpTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f05232b", new Object[]{this})).longValue();
        }
        return this.accsUpTime;
    }

    public String getDataId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bbd4c7e", new Object[]{this});
        }
        return this.dataId;
    }

    public long getDelyTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbdbef2c", new Object[]{this})).longValue();
        }
        return this.delyTime;
    }

    public Id getMsgId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Id) ipChange.ipc$dispatch("be2cf18b", new Object[]{this});
        }
        return this.msgId;
    }

    public NetPerformanceMonitor getNetPermanceMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetPerformanceMonitor) ipChange.ipc$dispatch("6f04fb9e", new Object[]{this});
        }
        return this.netPerformanceMonitor;
    }

    public int getNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("beb89ef2", new Object[]{this})).intValue();
        }
        return this.node;
    }

    public String getPackageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[]{this});
        }
        String str = this.packageName;
        if (str == null) {
            return "";
        }
        return str;
    }

    public int getRetryTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58b4bfee", new Object[]{this})).intValue();
        }
        return this.retryTimes;
    }

    public long getSendEndTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6808afe5", new Object[]{this})).longValue();
        }
        return this.sendEndTime;
    }

    public long getSendTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe3a66e6", new Object[]{this})).longValue();
        }
        return this.sendTime;
    }

    public String getTarget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("663f84d2", new Object[]{this});
        }
        return this.target;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.type;
    }

    public boolean isControlFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f3edfe5", new Object[]{this})).booleanValue();
        }
        return Constants.TARGET_CONTROL.equals(this.target);
    }

    public boolean isForeBgMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ae07827", new Object[]{this})).booleanValue();
        }
        if (Constants.TARGET_FORE.equals(this.target) || Constants.TARGET_BACK.equals(this.target)) {
            return true;
        }
        return false;
    }

    public boolean noTimeoutRequired() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3807992a", new Object[]{this})).booleanValue();
        }
        return Constants.TARGET_AServer_PING_CONTROL.equals(this.target);
    }

    public void putSendTimeInExt(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafaba5", new Object[]{this, new Long(j)});
            return;
        }
        if (this.extHeader == null) {
            this.extHeader = new HashMap();
        }
        Map<Integer, String> map = this.extHeader;
        map.put(32, j + "");
    }

    public void setAccsUpTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f87653e1", new Object[]{this, new Long(j)});
        } else {
            this.accsUpTime = j;
        }
    }

    public void setSendEndTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d0a59ff", new Object[]{this, new Long(j)});
        } else {
            this.sendEndTime = j;
        }
    }

    public void setSendTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be95486", new Object[]{this, new Long(j)});
        } else {
            this.sendTime = j;
        }
    }

    public static Message buildBindService(String str, String str2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("c6642bf7", new Object[]{str, str2, intent});
        }
        Message message = null;
        try {
            message = buildBindService(intent.getStringExtra("packageName"), intent.getStringExtra("serviceId"));
            message.tag = str2;
            setControlHost(str, message);
            return message;
        } catch (Exception e) {
            ALog.e(TAG, "buildBindService", e, new Object[0]);
            e.printStackTrace();
            return message;
        }
    }

    public static Message buildBindUser(String str, String str2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("1da711ab", new Object[]{str, str2, intent});
        }
        Message message = null;
        try {
            message = buildBindUser(intent.getStringExtra("packageName"), intent.getStringExtra(Constants.KEY_USER_ID));
            if (message != null) {
                message.tag = str2;
                setControlHost(str, message);
            }
        } catch (Exception e) {
            ALog.e(TAG, "buildBindUser", e, new Object[0]);
            e.printStackTrace();
        }
        return message;
    }

    public static Message buildPushAck(String str, String str2, String str3, String str4, String str5, boolean z, short s, String str6, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("83994491", new Object[]{str, str2, str3, str4, str5, new Boolean(z), new Short(s), str6, map});
        }
        Message message = new Message();
        buildPushAckCommon(str, str2, str3, str4, str5, z, s, str6, map, message);
        return message;
    }

    public static Message buildRequest(Context context, String str, String str2, String str3, String str4, String str5, ACCSManager.AccsRequest accsRequest, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("6675a86a", new Object[]{context, str, str2, str3, str4, str5, accsRequest, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        Message message = new Message();
        message.node = 1;
        message.type(1, ReqType.REQ, 1);
        message.command = 100;
        message.packageName = str4;
        message.serviceId = accsRequest.serviceId;
        message.userinfo = accsRequest.userId;
        message.data = accsRequest.data;
        String str6 = TextUtils.isEmpty(accsRequest.targetServiceName) ? accsRequest.serviceId : accsRequest.targetServiceName;
        StringBuilder sb = new StringBuilder();
        sb.append(str5);
        sb.append(str6);
        sb.append("|");
        String str7 = accsRequest.target;
        if (str7 == null) {
            str7 = "";
        }
        sb.append(str7);
        message.target = sb.toString();
        if (TextUtils.isEmpty(accsRequest.dataId)) {
            accsRequest.dataId = message.getMsgId().getDataId();
        }
        message.cunstomDataId = accsRequest.dataId;
        message.bizId = accsRequest.businessId;
        message.tag = str2;
        int i = accsRequest.timeout;
        if (i > 0) {
            message.timeout = i;
        }
        if (z) {
            setUnit(str, message, accsRequest);
        } else {
            message.host = accsRequest.host;
        }
        fillExtHeader(context, message, GlobalClientInfo.getInstance(context).getSid(str2), GlobalClientInfo.getInstance(context).getUserId(str2), str3, GlobalClientInfo.mCookieSec, accsRequest);
        try {
            if (ACCSClient.getAccsClient(str2).isAccsConnected()) {
                NetPerformanceMonitor netPerformanceMonitor = new NetPerformanceMonitor();
                message.netPerformanceMonitor = netPerformanceMonitor;
                netPerformanceMonitor.setDataId(message.getMsgId().getDataId());
                message.netPerformanceMonitor.setServiceId(accsRequest.serviceId);
                message.netPerformanceMonitor.setHost(message.host.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        message.tag = str2;
        return message;
    }

    @Deprecated
    public static Message buildSendData(BaseConnection baseConnection, Context context, String str, String str2, ACCSManager.AccsRequest accsRequest, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("336aba8b", new Object[]{baseConnection, context, str, str2, accsRequest, new Boolean(z)}) : buildSendData(baseConnection.l(null), baseConnection.r, baseConnection.i.getStoreId(), context, str, accsRequest, z);
    }

    public static Message buildUnbindApp(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("ad61002e", new Object[]{str, intent});
        }
        Message message = null;
        try {
            message = buildUnbindApp(str, intent.getStringExtra("packageName"));
            setControlHost(str, message);
            return message;
        } catch (Exception e) {
            ALog.e(TAG, "buildUnbindApp1", e.getMessage());
            return message;
        }
    }

    public static Message buildUnbindService(String str, String str2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("e683ba10", new Object[]{str, str2, intent});
        }
        Message message = null;
        try {
            message = buildUnbindService(intent.getStringExtra("packageName"), intent.getStringExtra("serviceId"));
            message.tag = str2;
            setControlHost(str, message);
            return message;
        } catch (Exception e) {
            ALog.e(TAG, "buildUnbindService", e, new Object[0]);
            e.printStackTrace();
            return message;
        }
    }

    public static Message buildUnbindUser(String str, String str2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("e472e232", new Object[]{str, str2, intent});
        }
        Message message = null;
        try {
            message = buildUnbindUser(intent.getStringExtra("packageName"));
            message.tag = str2;
            setControlHost(str, message);
            return message;
        } catch (Exception e) {
            ALog.e(TAG, "buildUnbindUser", e, new Object[0]);
            e.printStackTrace();
            return message;
        }
    }

    private static void fillExtHeader(Context context, Message message, String str, String str2, String str3, String str4, ACCSManager.AccsRequest accsRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f61bbf96", new Object[]{context, message, str, str2, str3, str4, accsRequest});
            return;
        }
        if (!TextUtils.isEmpty(accsRequest.businessId) || !TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(accsRequest.tag) || str4 != null) {
            message.extHeader = new HashMap();
            String str5 = accsRequest.businessId;
            if (str5 != null && UtilityImpl.getByteLen(str5) <= 1023) {
                message.extHeader.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_BUSINESS.ordinal()), accsRequest.businessId);
            }
            if (str != null && UtilityImpl.getByteLen(str) <= 1023) {
                message.extHeader.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_SID.ordinal()), str);
            }
            if (str2 != null && UtilityImpl.getByteLen(str2) <= 1023) {
                message.extHeader.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_USERID.ordinal()), str2);
            }
            String str6 = accsRequest.tag;
            if (str6 != null && UtilityImpl.getByteLen(str6) <= 1023) {
                message.extHeader.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_TAG.ordinal()), accsRequest.tag);
            }
            if (str4 != null && UtilityImpl.getByteLen(str4) <= 1023) {
                message.extHeader.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_COOKIE.ordinal()), str4);
            }
            if (str3 != null && UtilityImpl.getByteLen(str3) <= 1023) {
                message.extHeader.put(19, str3);
            }
        }
        try {
            Map<Integer, String> ext = accsRequest.getExt();
            if (ext != null && ext.size() > 0 && ext.containsKey(35)) {
                if (message.extHeader == null) {
                    message.extHeader = new HashMap();
                }
                message.extHeader.put(35, ext.get(35));
            }
        } catch (Throwable th) {
            ALog.e(TAG, "fillExtHeader err", th, new Object[0]);
            c71.c("accs", BaseMonitor.COUNT_VERIFY, "fillExtHeader", vu3.b.GEO_NOT_SUPPORT);
        }
    }

    private static void setControlHost(String str, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e77f97", new Object[]{str, message});
            return;
        }
        try {
            message.host = new URL(str);
        } catch (Exception e) {
            ALog.e(TAG, "setControlHost", e, new Object[0]);
        }
    }

    private static void setUnit(String str, Message message, ACCSManager.AccsRequest accsRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21a67abd", new Object[]{str, message, accsRequest});
            return;
        }
        URL url = accsRequest.host;
        if (url == null) {
            try {
                message.host = new URL(str);
            } catch (MalformedURLException e) {
                ALog.e(TAG, "setUnit", e, new Object[0]);
                e.printStackTrace();
            }
        } else {
            message.host = url;
        }
    }

    public byte[] build(Context context, int i, Boolean bool, BaseConnection baseConnection) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        byte[] bArr;
        short s;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("65a09bbc", new Object[]{this, context, new Integer(i), bool, baseConnection});
        }
        try {
            buildData();
            str3 = "\textHeader len:";
            str2 = "\tdataId:";
            str = "\tdataIdLength:";
        } catch (UnsupportedEncodingException e) {
            str3 = "\textHeader len:";
            str2 = "\tdataId:";
            str = "\tdataIdLength:";
            ALog.e(getTag(), "build2", e, new Object[0]);
        } catch (JSONException e2) {
            str3 = "\textHeader len:";
            str2 = "\tdataId:";
            str = "\tdataIdLength:";
            ALog.e(getTag(), "build1", e2, new Object[0]);
        }
        byte[] bArr2 = this.data;
        String str6 = bArr2 != null ? new String(bArr2) : "";
        compressData();
        if (!this.isAck) {
            StringBuilder sb = new StringBuilder();
            sb.append(j8l.y(context) ? j8l.p(context) : UtilityImpl.getDeviceId(context));
            sb.append("|");
            sb.append(this.packageName);
            sb.append("|");
            String str7 = this.serviceId;
            if (str7 == null) {
                str7 = "";
            }
            sb.append(str7);
            sb.append("|");
            String str8 = this.userinfo;
            if (str8 == null) {
                str8 = "";
            }
            sb.append(str8);
            this.source = sb.toString();
        }
        try {
            bArr = (this.dataId + "").getBytes("utf-8");
            this.sourceLength = (byte) this.source.getBytes("utf-8").length;
            this.targetLength = (byte) this.target.getBytes("utf-8").length;
            str4 = str6;
            str5 = "\tsource:";
        } catch (Exception e3) {
            e3.printStackTrace();
            str4 = str6;
            str5 = "\tsource:";
            ALog.e(getTag(), "build3", e3, new Object[0]);
            bArr = (this.dataId + "").getBytes();
            this.sourceLength = (byte) this.source.getBytes().length;
            this.targetLength = (byte) this.target.getBytes().length;
        }
        short extHeaderLen = getExtHeaderLen(this.extHeader);
        int length = this.targetLength + 4 + this.sourceLength + 1 + bArr.length;
        byte[] bArr3 = this.data;
        short length2 = (short) (length + (bArr3 == null ? 0 : bArr3.length) + extHeaderLen + 2);
        this.dataLength = length2;
        this.totalLength = (short) (length2 + 2);
        wqi wqiVar = new wqi(this.totalLength + 6);
        ALog.Level level = ALog.Level.D;
        if (ALog.isPrintLog(level)) {
            s = extHeaderLen;
            ALog.d(getTag(), "Build Message", "dataId", new String(bArr));
        } else {
            s = extHeaderLen;
        }
        try {
            wqiVar.a((byte) (this.compress | 32));
            if (ALog.isPrintLog(level)) {
                String tag = getTag();
                ALog.d(tag, "\tversion:2 compress:" + ((int) this.compress), new Object[0]);
            }
            if (i == 0) {
                wqiVar.a(c0z.STATE);
                if (ALog.isPrintLog(level)) {
                    ALog.d(getTag(), "\tflag: 0x80", new Object[0]);
                }
            } else {
                if (bool == null) {
                    wqiVar.a((byte) 64);
                } else if (bool.booleanValue()) {
                    wqiVar.a((byte) 80);
                } else {
                    wqiVar.a((byte) 96);
                }
                if (ALog.isPrintLog(level)) {
                    ALog.d(getTag(), "\tflag: 0x40", new Object[0]);
                }
            }
            wqiVar.b(this.totalLength);
            if (ALog.isPrintLog(level)) {
                String tag2 = getTag();
                ALog.d(tag2, "\ttotalLength:" + ((int) this.totalLength), new Object[0]);
            }
            wqiVar.b(this.dataLength);
            if (ALog.isPrintLog(level)) {
                String tag3 = getTag();
                ALog.d(tag3, "\tdataLength:" + ((int) this.dataLength), new Object[0]);
            }
            wqiVar.b(this.flags);
            if (ALog.isPrintLog(level)) {
                String tag4 = getTag();
                ALog.d(tag4, "\tflags:" + Integer.toHexString(this.flags), new Object[0]);
            }
            wqiVar.a(this.targetLength);
            if (ALog.isPrintLog(level)) {
                String tag5 = getTag();
                ALog.d(tag5, "\ttargetLength:" + ((int) this.targetLength), new Object[0]);
            }
            wqiVar.write(this.target.getBytes("utf-8"));
            if (ALog.isPrintLog(level)) {
                String tag6 = getTag();
                ALog.d(tag6, "\ttarget:" + this.target, new Object[0]);
            }
            wqiVar.a(this.sourceLength);
            if (ALog.isPrintLog(level)) {
                String tag7 = getTag();
                ALog.d(tag7, "\tsourceLength:" + ((int) this.sourceLength), new Object[0]);
            }
            wqiVar.write(this.source.getBytes("utf-8"));
            if (ALog.isPrintLog(level)) {
                String tag8 = getTag();
                ALog.d(tag8, str5 + this.source, new Object[0]);
            }
            wqiVar.a((byte) bArr.length);
            if (ALog.isPrintLog(level)) {
                String tag9 = getTag();
                ALog.d(tag9, str + bArr.length, new Object[0]);
            }
            wqiVar.write(bArr);
            if (ALog.isPrintLog(level)) {
                ALog.d(getTag(), str2.concat(new String(bArr)), new Object[0]);
            }
            wqiVar.b(s);
            if (ALog.isPrintLog(level)) {
                String tag10 = getTag();
                ALog.d(tag10, str3 + ((int) s), new Object[0]);
            }
            Map<Integer, String> map = this.extHeader;
            if (map != null) {
                for (Integer num : map.keySet()) {
                    int intValue = num.intValue();
                    String str9 = this.extHeader.get(num);
                    if (!TextUtils.isEmpty(str9)) {
                        wqiVar.b((short) ((((short) intValue) << 10) | ((short) (str9.getBytes("utf-8").length & 1023))));
                        wqiVar.write(str9.getBytes("utf-8"));
                        if (ALog.isPrintLog(ALog.Level.D)) {
                            String tag11 = getTag();
                            ALog.d(tag11, "\textHeader key:" + intValue + " value:" + str9, new Object[0]);
                        }
                    }
                }
            }
            byte[] bArr4 = this.data;
            if (bArr4 != null) {
                wqiVar.write(bArr4);
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                String tag12 = getTag();
                ALog.d(tag12, "\toriData:" + str4, new Object[0]);
            }
            wqiVar.flush();
        } catch (IOException e4) {
            ALog.e(getTag(), "build4", e4, new Object[0]);
        }
        byte[] byteArray = wqiVar.toByteArray();
        try {
            wqiVar.close();
        } catch (IOException e5) {
            ALog.e(getTag(), "build5", e5, new Object[0]);
        }
        return byteArray;
    }

    public static Message buildBackground(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("d748654c", new Object[]{str});
        }
        Context context = GlobalClientInfo.getContext();
        Message message = new Message();
        if (!j8l.a() || context == null || !UtilityImpl.isChannelProcess(context) || a.v().A(context)) {
            message.type(1, ReqType.DATA, 0);
            message.command = 100;
            message.target = Constants.TARGET_BACK;
            if (context != null) {
                message.packageName = context.getPackageName();
            }
            setControlHost(str, message);
            ALog.e(TAG, "buildBgId = ", message.dataId);
            return message;
        }
        message.type(1, ReqType.DATA, 0);
        message.command = 100;
        message.target = Constants.TARGET_BACK_LIMIT;
        message.packageName = context.getPackageName();
        setControlHost(str, message);
        ALog.e(TAG, "buildBgLimitId = ", message.dataId);
        return message;
    }

    public static Message buildMassMessage(String str, String str2, String str3, String str4, String str5, Context context) {
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("4ef93acf", new Object[]{str, str2, str3, str4, str5, context});
        }
        Message buildSendData = buildSendData(str4, str5, "", context, context.getPackageName(), new ACCSManager.AccsRequest("", Constants.TARGET_SERVICE_MASS, x5i.a(context, str, str3, str2), ""));
        if (buildSendData == null) {
            str6 = "null";
        } else {
            str6 = buildSendData.dataId;
        }
        ALog.e(TAG, "buildMassMessage = ", str6);
        return buildSendData;
    }

    public static Message buildParameterError(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("efa03614", new Object[]{str, new Integer(i)});
        }
        Message message = new Message();
        message.type(1, ReqType.ACK, 0);
        message.command = Integer.valueOf(i);
        message.packageName = str;
        return message;
    }

    public static Message buildSendData(String str, String str2, String str3, Context context, String str4, ACCSManager.AccsRequest accsRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("a2a8b4f", new Object[]{str, str2, str3, context, str4, accsRequest}) : buildSendData(str, str2, str3, context, str4, accsRequest, true);
    }

    public short getExtHeaderLen(Map<Integer, String> map) {
        short s = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9da135e", new Object[]{this, map})).shortValue();
        }
        if (map != null) {
            try {
                for (Integer num : map.keySet()) {
                    num.intValue();
                    String str = map.get(num);
                    if (!TextUtils.isEmpty(str)) {
                        s = (short) (s + ((short) (str.getBytes("utf-8").length & 1023)) + 2);
                    }
                }
            } catch (Exception e) {
                e.toString();
            }
        }
        return s;
    }

    public boolean isTimeOut() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93da6dc2", new Object[]{this})).booleanValue();
        }
        if ((System.currentTimeMillis() - this.startSendTime) + this.delyTime < this.timeout) {
            z = false;
        }
        if (z) {
            String tag = getTag();
            ALog.d(tag, "delay time:" + this.delyTime + " beforeSendTime:" + (System.currentTimeMillis() - this.startSendTime) + " timeout" + this.timeout, new Object[0]);
        }
        return z;
    }

    public void printByte(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf784923", new Object[]{this, bArr});
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d(getTag(), "len:" + bArr.length, new Object[0]);
            if (bArr.length < 512) {
                for (byte b : bArr) {
                    sb.append(Integer.toHexString(b & 255));
                    sb.append(" ");
                }
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.d(getTag(), sb.toString(), new Object[0]);
                }
            }
        }
    }

    public static Message buildAServerPingControl(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("c02a60fb", new Object[]{str, new Long(j)});
        }
        Message message = new Message();
        message.type(1, ReqType.DATA, 0);
        message.command = 100;
        message.target = Constants.TARGET_AServer_PING_CONTROL;
        setControlHost(str, message);
        message.data = String.valueOf(j).getBytes();
        ALog.e(TAG, "buildAServerPingControl ", "dataId", message.dataId, "secs", Long.valueOf(j / 1000));
        return message;
    }

    public static Message buildSendData(String str, String str2, String str3, Context context, String str4, ACCSManager.AccsRequest accsRequest, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("8963510f", new Object[]{str, str2, str3, context, str4, accsRequest, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        Message message = new Message();
        message.node = 1;
        message.type(1, ReqType.DATA, 1);
        message.command = 100;
        message.packageName = str4;
        message.serviceId = accsRequest.serviceId;
        message.userinfo = accsRequest.userId;
        message.data = accsRequest.data;
        String str5 = TextUtils.isEmpty(accsRequest.targetServiceName) ? accsRequest.serviceId : accsRequest.targetServiceName;
        StringBuilder sb = new StringBuilder(Constants.TARGET_SERVICE_PRE);
        sb.append(str5);
        sb.append("|");
        String str6 = accsRequest.target;
        if (str6 == null) {
            str6 = "";
        }
        sb.append(str6);
        message.target = sb.toString();
        if (TextUtils.isEmpty(accsRequest.dataId)) {
            accsRequest.dataId = message.getMsgId().getDataId();
        }
        message.cunstomDataId = accsRequest.dataId;
        message.bizId = accsRequest.businessId;
        int i = accsRequest.timeout;
        if (i > 0) {
            message.timeout = i;
        }
        if (z) {
            setUnit(str, message, accsRequest);
        } else {
            message.host = accsRequest.host;
        }
        fillExtHeader(context, message, GlobalClientInfo.getInstance(context).getSid(str2), GlobalClientInfo.getInstance(context).getUserId(str2), str3, GlobalClientInfo.mCookieSec, accsRequest);
        try {
            if (ACCSClient.getAccsClient(str2).isAccsConnected()) {
                NetPerformanceMonitor netPerformanceMonitor = new NetPerformanceMonitor();
                message.netPerformanceMonitor = netPerformanceMonitor;
                netPerformanceMonitor.setDataId(message.getMsgId().getDataId());
                message.netPerformanceMonitor.setServiceId(accsRequest.serviceId);
                message.netPerformanceMonitor.setHost(message.host.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        message.tag = str2;
        return message;
    }

    private void type(int i, ReqType reqType, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a9e492", new Object[]{this, new Integer(i), reqType, new Integer(i2)});
            return;
        }
        this.type = i;
        if (i != 2) {
            this.flags = (short) (((((i & 1) << 4) | (reqType.ordinal() << 2)) | i2) << 11);
        }
    }

    @Deprecated
    public static Message buildUnbindApp(BaseConnection baseConnection, Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("2339ad91", new Object[]{baseConnection, context, str, str2, str3, str4}) : buildUnbindApp(baseConnection.l(null), str);
    }

    public static Message buildUnbindApp(String str, String str2) {
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("3568dac1", new Object[]{str, str2});
        }
        MessageV2 messageV2 = null;
        try {
            ALog.d(TAG, "buildUnbindApp", new Object[0]);
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            MessageV2 messageV22 = new MessageV2();
            try {
                messageV22.node = 1;
                messageV22.type(1, ReqType.DATA, 1);
                messageV22.packageName = str2;
                messageV22.target = Constants.TARGET_CONTROL;
                messageV22.command = 2;
                messageV22.packageName = str2;
                messageV22.sdkVersion = 402;
                messageV22.cunstomDataId = KEY_UNBINDAPP;
                setControlHost(str, messageV22);
                return messageV22;
            } catch (Exception e2) {
                e = e2;
                messageV2 = messageV22;
                ALog.e(TAG, "buildUnbindApp", e.getMessage());
                return messageV2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Deprecated
    public static Message buildUnbindUser(Context context, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("98a3fd5", new Object[]{context, str, str2, str3, str4, str5}) : buildUnbindUser(str);
    }

    public static Message buildUnbindUser(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("ebb8ec59", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        MessageV2 messageV2 = new MessageV2();
        messageV2.node = 1;
        messageV2.type(1, ReqType.DATA, 1);
        messageV2.packageName = str;
        messageV2.target = Constants.TARGET_CONTROL;
        messageV2.command = 4;
        messageV2.sdkVersion = 402;
        messageV2.cunstomDataId = KEY_UNBINDUSER;
        return messageV2;
    }

    public static Message buildBindApp(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("14b0b412", new Object[]{context, str, str2, str3, str4, str5, str6});
        }
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
        MessageV2 messageV2 = new MessageV2();
        messageV2.node = 1;
        messageV2.type(1, ReqType.DATA, 1);
        messageV2.osType = 1;
        messageV2.osVersion = Build.VERSION.SDK_INT + "";
        messageV2.packageName = str4;
        messageV2.target = Constants.TARGET_CONTROL;
        messageV2.command = 1;
        messageV2.appKey = str2;
        messageV2.appSign = UtilityImpl.getAppsign(context, str2, str3, UtilityImpl.getDeviceId(context), str, (configByTag == null || 2 != configByTag.getSecurity()) ? 1 : 0);
        messageV2.sdkVersion = 402;
        messageV2.appVersion = str6;
        messageV2.packageName = str4;
        messageV2.ttid = str5;
        messageV2.model = Build.MODEL;
        messageV2.brand = Build.BRAND;
        messageV2.cunstomDataId = KEY_BINDAPP;
        messageV2.tag = str;
        messageV2.exts = new bxf.a().d("notifyEnable", UtilityImpl.isNotificationEnabled(context)).d("romInfo", pfo.b().a()).a().toString();
        UtilityImpl.saveNotificationState(context, Constants.SP_FILE_NAME, UtilityImpl.isNotificationEnabled(context));
        return messageV2;
    }

    @Deprecated
    public static Message buildBindService(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("ce406f26", new Object[]{context, str, str2, str3, str4, str5, str6}) : buildBindService(str, str3);
    }

    @Deprecated
    public static Message buildBindUser(Context context, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("11ba5c3c", new Object[]{context, str, str2, str3, str4, str5}) : buildBindUser(str, str4);
    }

    @Deprecated
    public static Message buildUnbindService(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("1838f52d", new Object[]{context, str, str2, str3, str4, str5, str6}) : buildUnbindService(str, str3);
    }

    public static Message buildBindService(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("51abff94", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        MessageV2 messageV2 = new MessageV2();
        messageV2.node = 1;
        messageV2.type(1, ReqType.DATA, 1);
        messageV2.packageName = str;
        messageV2.serviceId = str2;
        messageV2.target = Constants.TARGET_CONTROL;
        messageV2.command = 5;
        messageV2.packageName = str;
        messageV2.serviceId = str2;
        messageV2.sdkVersion = 402;
        messageV2.cunstomDataId = KEY_BINDSERVICE;
        return messageV2;
    }

    public static Message buildBindUser(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("59ebc148", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        MessageV2 messageV2 = new MessageV2();
        messageV2.node = 1;
        messageV2.type(1, ReqType.DATA, 1);
        messageV2.packageName = str;
        messageV2.userinfo = str2;
        messageV2.target = Constants.TARGET_CONTROL;
        messageV2.command = 3;
        messageV2.packageName = str;
        messageV2.userinfo = str2;
        messageV2.sdkVersion = 402;
        messageV2.cunstomDataId = KEY_BINDUSER;
        return messageV2;
    }

    public static Message buildUnbindService(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("ff5f08ad", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        MessageV2 messageV2 = new MessageV2();
        messageV2.node = 1;
        messageV2.type(1, ReqType.DATA, 1);
        messageV2.packageName = str;
        messageV2.serviceId = str2;
        messageV2.target = Constants.TARGET_CONTROL;
        messageV2.command = 6;
        messageV2.packageName = str;
        messageV2.serviceId = str2;
        messageV2.sdkVersion = 402;
        messageV2.cunstomDataId = KEY_UNBINDSERVICE;
        return messageV2;
    }

    public static Message buildSync(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("a04e7f37", new Object[]{str, str2, str3, str4, str5, new Integer(i), new Integer(i2)});
        }
        Message message = new Message();
        message.type(1, ReqType.REQ, 1);
        message.command = 100;
        message.target = Constants.TARGET_SYNC;
        message.userinfo = str5;
        message.packageName = str3;
        message.serviceId = str2;
        message.timeout = 10000;
        message.data = z1r.a(str2, str4, i, i2);
        setControlHost(str, message);
        ALog.e(TAG, "buildSync", "dataId", message.getDataId(), "serviceId", str2, "streamId", str4, "fromSeq", Integer.valueOf(i), "toSeq", Integer.valueOf(i2));
        return message;
    }
}
