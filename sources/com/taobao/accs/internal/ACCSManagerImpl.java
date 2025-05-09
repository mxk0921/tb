package com.taobao.accs.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import anet.channel.SessionCenter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.AccsIPCProvider;
import com.taobao.accs.ErrorCode;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.IHeartBeat;
import com.taobao.accs.ILoginInfo;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.ConnectionServiceManager;
import com.taobao.accs.connection.IConnection;
import com.taobao.accs.data.AccsStreamConfig;
import com.taobao.accs.data.AckExtraData;
import com.taobao.accs.data.Message;
import com.taobao.accs.data.MessageBizAck;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.aranger.exception.IPCException;
import com.taobao.mass.MassClient;
import com.taobao.message.init.accs.AccsMessageService;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import tb.brt;
import tb.c71;
import tb.czv;
import tb.d2r;
import tb.f2r;
import tb.l70;
import tb.m8l;
import tb.o2j;
import tb.re;
import tb.t2o;
import tb.tv9;
import tb.vu3;
import tb.x1r;
import tb.xd0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ACCSManagerImpl implements com.taobao.accs.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PREFIX_ACCS = "accs:";
    private static final String PREFIX_DATA_SEPARATOR = "<dt>";
    private static final String PREFIX_EXT_SEPARATOR = "<kv>";
    private static final List<String> allowServiceList;
    private String mConfigTag;
    private String TAG = "ACCSMgrImpl_";
    private Random random = new Random();
    private tv9.c forebackStateReceiver = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends x1r {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ AccsStreamConfig b;

        public c(AccsStreamConfig accsStreamConfig) {
            this.b = accsStreamConfig;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/internal/ACCSManagerImpl$3");
        }

        @Override // tb.x1r
        public Object a(String str) {
            String[] split;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("9da17462", new Object[]{this, str});
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                int indexOf = str.indexOf(ACCSManagerImpl.PREFIX_ACCS);
                if (indexOf <= 0) {
                    return Intent.parseUri(str, 0);
                }
                Intent parseUri = Intent.parseUri(str.substring(0, indexOf), 0);
                String substring = str.substring(indexOf + 5, str.length() - 1);
                if (TextUtils.isEmpty(substring)) {
                    return parseUri;
                }
                String[] split2 = substring.split(ACCSManagerImpl.PREFIX_DATA_SEPARATOR);
                if (split2.length != 2) {
                    return parseUri;
                }
                if (!TextUtils.isEmpty(split2[0])) {
                    HashMap hashMap = new HashMap();
                    for (String str2 : split2[0].split(ACCSManagerImpl.PREFIX_EXT_SEPARATOR)) {
                        if (!TextUtils.isEmpty(str2)) {
                            String[] split3 = str2.split("=");
                            hashMap.put(Integer.valueOf(Integer.parseInt(split3[0])), split3[1]);
                        }
                    }
                    parseUri.putExtra(TaoBaseService.ExtraInfo.EXT_HEADER, hashMap);
                }
                if (TextUtils.isEmpty(split2[1])) {
                    return parseUri;
                }
                parseUri.putExtra("data", Base64.decode(split2[1], 2));
                return parseUri;
            } catch (Throwable th) {
                ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "deserializeFromString err", th, new Object[0]);
                return null;
            }
        }

        @Override // tb.x1r
        public void b(String str, String str2, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e89569e", new Object[]{this, str, str2, new Integer(i), new Integer(i2)});
                return;
            }
            try {
                IConnection connectionWrapper = ConnectionServiceManager.getInstance().getConnectionWrapper(ACCSManagerImpl.access$300(ACCSManagerImpl.this));
                connectionWrapper.sendMessage(Message.buildSync(connectionWrapper.getHost(null), str, GlobalClientInfo.getContext().getPackageName(), str2, this.b.getUserId(), i, i2));
            } catch (IPCException e) {
                ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "onPullMessage err", e, new Object[0]);
            }
        }

        @Override // tb.x1r
        public void c(f2r f2rVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("652fb8e1", new Object[]{this, f2rVar});
                return;
            }
            Intent intent = (Intent) f2rVar.a();
            if (intent != null) {
                intent.putExtra(Constants.KEY_SKIP_SYNC, true);
                o2j.d(GlobalClientInfo.getContext(), intent);
            }
        }

        @Override // tb.x1r
        public String d(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d93d8b7d", new Object[]{this, obj});
            }
            if (!(obj instanceof Intent)) {
                return null;
            }
            Intent intent = (Intent) obj;
            try {
                StringBuilder sb = new StringBuilder(intent.toUri(0));
                StringBuilder sb2 = new StringBuilder();
                Serializable serializableExtra = intent.getSerializableExtra(TaoBaseService.ExtraInfo.EXT_HEADER);
                if (serializableExtra != null) {
                    for (Map.Entry entry : ((HashMap) serializableExtra).entrySet()) {
                        sb2.append(entry.getKey());
                        sb2.append("=");
                        sb2.append((String) entry.getValue());
                        sb2.append(ACCSManagerImpl.PREFIX_EXT_SEPARATOR);
                    }
                }
                sb2.append(ACCSManagerImpl.PREFIX_DATA_SEPARATOR);
                byte[] byteArrayExtra = intent.getByteArrayExtra("data");
                if (byteArrayExtra != null) {
                    sb2.append(Base64.encodeToString(byteArrayExtra, 2));
                }
                if (sb2.length() > 0) {
                    sb.append(ACCSManagerImpl.PREFIX_ACCS);
                    sb.append((CharSequence) sb2);
                    sb.append(";");
                }
                return sb.toString();
            } catch (Throwable th) {
                ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "serializeToString err", th, new Object[0]);
                return null;
            }
        }
    }

    static {
        t2o.a(343933130);
        t2o.a(343932947);
        ArrayList arrayList = new ArrayList();
        allowServiceList = arrayList;
        arrayList.add(AccsMessageService.UPLOAD_SERVICE_ID);
    }

    public ACCSManagerImpl(Context context, String str) {
        GlobalClientInfo.mContext = context.getApplicationContext();
        this.mConfigTag = str;
        this.TAG += str;
        if (AccsClientConfig.getConfigByTag(this.mConfigTag) == null) {
            try {
                new AccsClientConfig.Builder().setAppKey(ACCSManager.getDefaultAppkey(context)).setTag(str).build();
            } catch (AccsException e) {
                ALog.e(this.TAG, "ACCSManagerImpl build config", e, new Object[0]);
            }
        }
        ConnectionServiceManager.getInstance().init();
        if (czv.g(context)) {
            tv9.h().p(this.forebackStateReceiver);
        }
        this.TAG += this.mConfigTag;
    }

    public static /* synthetic */ String access$000(ACCSManagerImpl aCCSManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2bb9cfed", new Object[]{aCCSManagerImpl});
        }
        return aCCSManagerImpl.TAG;
    }

    public static /* synthetic */ IConnection access$100(ACCSManagerImpl aCCSManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IConnection) ipChange.ipc$dispatch("cb836f11", new Object[]{aCCSManagerImpl});
        }
        return aCCSManagerImpl.getConnection();
    }

    public static /* synthetic */ void access$200(ACCSManagerImpl aCCSManagerImpl, IConnection iConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ea40e4", new Object[]{aCCSManagerImpl, iConnection});
        } else {
            aCCSManagerImpl.schedulePing(iConnection);
        }
    }

    public static /* synthetic */ String access$300(ACCSManagerImpl aCCSManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a48684a", new Object[]{aCCSManagerImpl});
        }
        return aCCSManagerImpl.mConfigTag;
    }

    private IConnection getConnection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IConnection) ipChange.ipc$dispatch("fd07f2ea", new Object[]{this});
        }
        return ConnectionServiceManager.getInstance().getConnectionWrapper(this.mConfigTag);
    }

    private void schedulePing(IConnection iConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781ef57f", new Object[]{this, iConnection});
        } else {
            brt.m(new b(iConnection), this.random.nextInt(6), TimeUnit.SECONDS);
        }
    }

    private void subscribeSync(AccsStreamConfig accsStreamConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258605e6", new Object[]{this, accsStreamConfig});
        } else if (!d2r.b().d(accsStreamConfig.getServiceId())) {
            d2r.b().h(accsStreamConfig.getServiceId(), accsStreamConfig.getStreamId(), accsStreamConfig.getStartSeq(), accsStreamConfig.getSeqSnapshotInterval(), accsStreamConfig.getSyncTimeoutInMill(), accsStreamConfig.isSaveDB(), new c(accsStreamConfig));
        }
    }

    public void bindApp(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6115946f", new Object[]{this, context, str, str2, iAppReceiver});
        } else {
            bindApp(context, str, "accs", str2, iAppReceiver);
        }
    }

    @Override // com.taobao.accs.a
    public void bindUser(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("253f5e03", new Object[]{this, context, str});
        } else {
            bindUser(context, str, false);
        }
    }

    @Override // com.taobao.accs.a
    public boolean cancel(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25dc16f5", new Object[]{this, context, str})).booleanValue();
        }
        try {
            return getConnection().cancel(str);
        } catch (IPCException e) {
            ALog.e(this.TAG, "cancel exception", e, new Object[0]);
            return true;
        }
    }

    @Override // com.taobao.accs.a
    public void clearLoginInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccce0177", new Object[]{this, context});
        } else {
            GlobalClientInfo.getInstance(context).clearLoginInfoImpl();
        }
    }

    @Override // com.taobao.accs.a
    public void forceDisableService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("303889a9", new Object[]{this, context});
        } else {
            UtilityImpl.focusDisableService(context);
        }
    }

    @Override // com.taobao.accs.a
    public void forceEnableService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296f93fa", new Object[]{this, context});
        } else {
            UtilityImpl.focusEnableService(context);
        }
    }

    @Override // com.taobao.accs.a
    public String getConnectionUnitInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4d9bf73", new Object[]{this});
        }
        try {
            return getConnection().getConnectionUnitInfo();
        } catch (IPCException unused) {
            return null;
        }
    }

    @Override // com.taobao.accs.a
    public long getServerTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cda1621", new Object[]{this})).longValue();
        }
        try {
            return getConnection().getServerTime();
        } catch (IPCException unused) {
            return 0L;
        }
    }

    public String getUserUnit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f59ed6b4", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.accs.a
    public boolean isChannelError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acf2cfb1", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return ErrorCode.isChannelError(i);
    }

    @Override // com.taobao.accs.a
    public boolean isNetworkReachable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("768651bc", new Object[]{this, context})).booleanValue();
        }
        return UtilityImpl.isNetworkConnected(context);
    }

    @Override // com.taobao.accs.a
    public void registerDataListener(Context context, String str, AccsAbstractDataListener accsAbstractDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13412671", new Object[]{this, context, str, accsAbstractDataListener});
        } else {
            GlobalClientInfo.getInstance(context).registerListener(str, accsAbstractDataListener);
        }
    }

    @Override // com.taobao.accs.a
    public void registerSerivce(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f898bca9", new Object[]{this, context, str, str2});
        } else {
            GlobalClientInfo.getInstance(context).registerService(str, str2);
        }
    }

    @Override // com.taobao.accs.a
    public String sendData(Context context, String str, String str2, byte[] bArr, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("70504f2c", new Object[]{this, context, str, str2, bArr, str3}) : sendData(context, str, str2, bArr, str3, null);
    }

    @Override // com.taobao.accs.a
    public String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2b853f37", new Object[]{this, context, str, str2, bArr, str3, str4}) : sendRequest(context, str, str2, bArr, str3, str4, null);
    }

    @Override // com.taobao.accs.a
    public void setLoginInfo(Context context, ILoginInfo iLoginInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbc7003", new Object[]{this, context, iLoginInfo});
        } else {
            GlobalClientInfo.getInstance(context).setLoginInfoImpl(this.mConfigTag, iLoginInfo);
        }
    }

    @Override // com.taobao.accs.a
    @Deprecated
    public void setMode(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab05467", new Object[]{this, context, new Integer(i)});
        } else {
            ACCSClient.setEnvironment(context, i);
        }
    }

    public void startInAppConnection(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd31f89b", new Object[]{this, context, str, str2, iAppReceiver});
        } else {
            startInAppConnection(context, str, null, str2, iAppReceiver);
        }
    }

    @Override // com.taobao.accs.a
    public void unRegisterDataListener(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6cd8471", new Object[]{this, context, str});
        } else {
            GlobalClientInfo.getInstance(context).unregisterListener(str);
        }
    }

    @Override // com.taobao.accs.a
    public void unRegisterSerivce(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f38198", new Object[]{this, context, str});
        } else {
            GlobalClientInfo.getInstance(context).unRegisterService(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements tv9.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.tv9.c
        public void a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2af4f036", new Object[]{this, context});
                return;
            }
            ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "onBackState", new Object[0]);
            try {
                ConnectionServiceManager.getInstance().onBackground(ACCSManagerImpl.access$300(ACCSManagerImpl.this));
            } catch (Exception e) {
                ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "onBackState error, Error:", e, new Object[0]);
                c71.c("accs", BaseMonitor.COUNT_VERIFY, "onBackState", vu3.b.GEO_NOT_SUPPORT);
            }
        }

        @Override // tb.tv9.c
        public void b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a0cc2cb", new Object[]{this, context});
                return;
            }
            try {
                ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "onForeState", new Object[0]);
                ACCSManagerImpl aCCSManagerImpl = ACCSManagerImpl.this;
                ACCSManagerImpl.access$200(aCCSManagerImpl, ACCSManagerImpl.access$100(aCCSManagerImpl));
                ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "send foreground state frame", new Object[0]);
                ACCSManagerImpl.access$100(ACCSManagerImpl.this).sendMessage(Message.buildForeground(ACCSManagerImpl.access$100(ACCSManagerImpl.this).getHost(null)));
                ACCSManagerImpl.access$100(ACCSManagerImpl.this).setForeBackState(1);
                if (MassClient.getInstance().isNotEmpty()) {
                    ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "send mass foreground state frame", new Object[0]);
                    ACCSManagerImpl.access$100(ACCSManagerImpl.this).sendMessage(Message.buildMassMessage(ACCSManagerImpl.access$100(ACCSManagerImpl.this).getAppkey(), "front", "powermsg", ACCSManagerImpl.access$100(ACCSManagerImpl.this).getHost(null), ACCSManagerImpl.access$300(ACCSManagerImpl.this), context));
                }
                ConnectionServiceManager.getInstance().onForeground();
            } catch (Exception e) {
                ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "onForeState error, Error:", e, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IConnection f6066a;

        public b(IConnection iConnection) {
            this.f6066a = iConnection;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                IConnection iConnection = this.f6066a;
                if (iConnection != null) {
                    iConnection.ping(true, false);
                }
            } catch (IPCException e) {
                ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "schedulePing exception", e, new Object[0]);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6 A[Catch: all -> 0x00c0, TryCatch #4 {all -> 0x00c0, blocks: (B:26:0x009b, B:28:0x00ab, B:30:0x00b1, B:32:0x00b7, B:40:0x00c6, B:41:0x00d8, B:43:0x00ee, B:44:0x00f6, B:46:0x00ff, B:48:0x0110, B:50:0x0116, B:51:0x012c, B:52:0x0130, B:53:0x0139, B:54:0x0140, B:56:0x0144), top: B:63:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee A[Catch: all -> 0x00c0, TryCatch #4 {all -> 0x00c0, blocks: (B:26:0x009b, B:28:0x00ab, B:30:0x00b1, B:32:0x00b7, B:40:0x00c6, B:41:0x00d8, B:43:0x00ee, B:44:0x00f6, B:46:0x00ff, B:48:0x0110, B:50:0x0116, B:51:0x012c, B:52:0x0130, B:53:0x0139, B:54:0x0140, B:56:0x0144), top: B:63:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff A[Catch: all -> 0x00c0, TryCatch #4 {all -> 0x00c0, blocks: (B:26:0x009b, B:28:0x00ab, B:30:0x00b1, B:32:0x00b7, B:40:0x00c6, B:41:0x00d8, B:43:0x00ee, B:44:0x00f6, B:46:0x00ff, B:48:0x0110, B:50:0x0116, B:51:0x012c, B:52:0x0130, B:53:0x0139, B:54:0x0140, B:56:0x0144), top: B:63:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130 A[Catch: all -> 0x00c0, TryCatch #4 {all -> 0x00c0, blocks: (B:26:0x009b, B:28:0x00ab, B:30:0x00b1, B:32:0x00b7, B:40:0x00c6, B:41:0x00d8, B:43:0x00ee, B:44:0x00f6, B:46:0x00ff, B:48:0x0110, B:50:0x0116, B:51:0x012c, B:52:0x0130, B:53:0x0139, B:54:0x0140, B:56:0x0144), top: B:63:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144 A[Catch: all -> 0x0158, TRY_LEAVE, TryCatch #4 {all -> 0x00c0, blocks: (B:26:0x009b, B:28:0x00ab, B:30:0x00b1, B:32:0x00b7, B:40:0x00c6, B:41:0x00d8, B:43:0x00ee, B:44:0x00f6, B:46:0x00ff, B:48:0x0110, B:50:0x0116, B:51:0x012c, B:52:0x0130, B:53:0x0139, B:54:0x0140, B:56:0x0144), top: B:63:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // com.taobao.accs.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void bindApp(android.content.Context r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, com.taobao.accs.IAppReceiver r14) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.internal.ACCSManagerImpl.bindApp(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.taobao.accs.IAppReceiver):void");
    }

    @Override // com.taobao.accs.a
    public void bindService(Context context, String str) {
        String appkey;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc166df3", new Object[]{this, context, str});
        } else if (!UtilityImpl.getFocusDisableStatus(context) && !UtilityImpl.getFocusDisableStatus(context)) {
            Intent intent = getIntent(context, 5);
            if (intent == null) {
                sendAppNotBind(context, 5, str, null);
                return;
            }
            try {
                appkey = getConnection().getAppkey();
            } catch (Exception e) {
                ALog.e(this.TAG, "bindService getAppkey exception", e, new Object[0]);
            }
            if (!TextUtils.isEmpty(appkey)) {
                intent.putExtra("appKey", appkey);
                intent.putExtra("serviceId", str);
                if (UtilityImpl.isMainProcess(context)) {
                    try {
                        Message buildBindService = Message.buildBindService(getConnection().getHost(null), this.mConfigTag, intent);
                        if (!(buildBindService == null || buildBindService.getNetPermanceMonitor() == null)) {
                            buildBindService.getNetPermanceMonitor().setDataId(buildBindService.dataId);
                            buildBindService.getNetPermanceMonitor().setHost(buildBindService.host.toString());
                        }
                        sendControlMessage(context, buildBindService, 5, false);
                    } catch (Exception e2) {
                        ALog.e(this.TAG, "bindService getHost exception", e2, new Object[0]);
                    }
                }
                try {
                    getConnection().startChannelService();
                } catch (Exception e3) {
                    ALog.e(this.TAG, "bindService startChannelService exception", e3, new Object[0]);
                }
            }
        }
    }

    @Override // com.taobao.accs.a
    public void bindUser(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ad1531", new Object[]{this, context, str, new Boolean(z)});
            return;
        }
        try {
            ALog.e(this.TAG, "bindUser", "userId", str);
            if (UtilityImpl.getFocusDisableStatus(context)) {
                ALog.e(this.TAG, "accs disabled", new Object[0]);
                return;
            }
            Intent intent = getIntent(context, 3);
            if (intent == null) {
                ALog.e(this.TAG, "intent null", new Object[0]);
                sendAppNotBind(context, 3, null, null);
                return;
            }
            String appkey = getConnection().getAppkey();
            if (TextUtils.isEmpty(appkey)) {
                ALog.e(this.TAG, "appKey null", new Object[0]);
                return;
            }
            if (UtilityImpl.appVersionChanged(context) || z) {
                ALog.i(this.TAG, "force bind User", new Object[0]);
                intent.putExtra(Constants.KEY_FOUCE_BIND, true);
                z = true;
            }
            intent.putExtra("appKey", appkey);
            intent.putExtra(Constants.KEY_USER_ID, str);
            if (UtilityImpl.isMainProcess(context)) {
                Message buildBindUser = Message.buildBindUser(getConnection().getHost(null), this.mConfigTag, intent);
                if (!(buildBindUser == null || buildBindUser.getNetPermanceMonitor() == null)) {
                    buildBindUser.getNetPermanceMonitor().setDataId(buildBindUser.dataId);
                    buildBindUser.getNetPermanceMonitor().setHost(buildBindUser.host.toString());
                }
                sendControlMessage(context, buildBindUser, 3, z);
            }
            getConnection().startChannelService();
        } catch (Throwable th) {
            ALog.e(this.TAG, "bindUser", th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.a
    public Map<String, Boolean> forceReConnectChannel() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b612f593", new Object[]{this});
        }
        try {
            SessionCenter.getInstance(getConnection().getAppkey()).forceRecreateAccsSession();
        } catch (Exception e) {
            ALog.e(this.TAG, "forceReConnectChannel err", e, new Object[0]);
        }
        return getChannelState();
    }

    @Override // com.taobao.accs.a
    public Map<String, Boolean> getChannelState() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83cd4940", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        try {
            String host = getConnection().getHost(null);
            hashMap.put(host, Boolean.FALSE);
            if (l70.d(SessionCenter.getInstance(getConnection().getAppkey()), host, 60000L, this.mConfigTag) != null) {
                hashMap.put(host, Boolean.TRUE);
            }
            String str = this.TAG;
            ALog.d(str, "getChannelState " + hashMap.toString(), new Object[0]);
        } catch (Exception e) {
            ALog.e(this.TAG, "getChannelState err", e, new Object[0]);
        }
        return hashMap;
    }

    @Override // com.taobao.accs.a
    public boolean notifyMsgDelivery(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dd9b921", new Object[]{this, str})).booleanValue();
        }
        if (!m8l.t()) {
            return false;
        }
        try {
            return getConnection().notifyMsgDelivery(str);
        } catch (IPCException e) {
            ALog.e(this.TAG, "notifyMsgDelivery exception", e, new Object[0]);
            return false;
        }
    }

    @Override // com.taobao.accs.a
    public void queryStream(AccsStreamConfig accsStreamConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8467ea3", new Object[]{this, accsStreamConfig});
        } else if (accsStreamConfig == null) {
            ALog.d(this.TAG, "queryStream config = NULL", new Object[0]);
        } else {
            d2r.b().f(accsStreamConfig.getServiceId(), accsStreamConfig.getStreamId(), accsStreamConfig.getStartSeq(), accsStreamConfig.getEndSeq());
        }
    }

    @Override // com.taobao.accs.a
    public void registerConnectStateListener(AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb59c4bb", new Object[]{this, accsConnectStateListener});
        } else if (m8l.w()) {
            GlobalClientInfo.getInstance(GlobalClientInfo.getContext()).registerConnectionListener(this.mConfigTag, accsConnectStateListener);
        } else if (accsConnectStateListener != null) {
            try {
                getConnection().registerConnectStateListener(accsConnectStateListener);
            } catch (Exception e) {
                ALog.e(this.TAG, "registerConnectStateListener exception", e, new Object[0]);
            }
        }
    }

    @Override // com.taobao.accs.a
    public void registerHeartBeatListener(IHeartBeat iHeartBeat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf7e846", new Object[]{this, iHeartBeat});
            return;
        }
        try {
            getConnection().registerHeartBeatListener(iHeartBeat);
        } catch (IPCException e) {
            ALog.e(this.TAG, "setHeartBeatListener err", e, new Object[0]);
        }
    }

    @Override // com.taobao.accs.a
    public String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ae89a7a2", new Object[]{this, context, str, str2, bArr, str3, str4}) : sendData(context, str, str2, bArr, str3, str4, null);
    }

    @Override // com.taobao.accs.a
    public String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8329b758", new Object[]{this, context, str, str2, bArr, str3, str4, url}) : sendRequest(context, new ACCSManager.AccsRequest(str, str2, bArr, str3, str4, url, null));
    }

    @Override // com.taobao.accs.a
    public void setProxy(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95bdaae4", new Object[]{this, context, str, new Integer(i)});
            return;
        }
        SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
        if (!TextUtils.isEmpty(str)) {
            edit.putString(Constants.KEY_PROXY_HOST, str);
        }
        edit.putInt(Constants.KEY_PROXY_PORT, i);
        edit.apply();
    }

    @Override // com.taobao.accs.a
    public void startInAppConnection(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87dbbfa5", new Object[]{this, context, str, str2, str3, iAppReceiver});
            return;
        }
        GlobalClientInfo.getInstance(context).setAppReceiver(this.mConfigTag, iAppReceiver);
        if (!UtilityImpl.isMainProcess(context)) {
            ALog.d(this.TAG, "inapp only init in main process!", new Object[0]);
            return;
        }
        String str4 = this.TAG;
        ALog.d(str4, "startInAppConnection APPKEY:" + str, new Object[0]);
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.equals(getConnection().getAppkey(), str)) {
                    getConnection().setTTid(str3);
                    getConnection().setAppkey(str);
                    UtilityImpl.saveAppKey(context, str);
                }
                getConnection().start();
            }
        } catch (Exception e) {
            ALog.e(this.TAG, "startInAppConnection exception", e, new Object[0]);
        }
    }

    @Override // com.taobao.accs.a
    public void subscribeStream(AccsStreamConfig accsStreamConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c35c9661", new Object[]{this, accsStreamConfig});
        } else if (accsStreamConfig == null) {
            ALog.e(this.TAG, "subscribeStream config = NULL", new Object[0]);
        } else {
            subscribeSync(accsStreamConfig);
        }
    }

    @Override // com.taobao.accs.a
    public void unRegisterConnectStateListener(AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4790e2", new Object[]{this, accsConnectStateListener});
        } else if (m8l.w()) {
            GlobalClientInfo.getInstance(GlobalClientInfo.getContext()).unRegisterConnectStateListener(this.mConfigTag, accsConnectStateListener);
        } else if (accsConnectStateListener != null) {
            try {
                getConnection().unRegisterConnectStateListener(accsConnectStateListener);
            } catch (Exception e) {
                ALog.e(this.TAG, "registerConnectStateListener exception", e, new Object[0]);
            }
        }
    }

    @Override // com.taobao.accs.a
    public void unSubscribeStream(AccsStreamConfig accsStreamConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13939fda", new Object[]{this, accsStreamConfig});
        } else if (accsStreamConfig == null) {
            ALog.e(this.TAG, "unSubscribeStream config = NULL", new Object[0]);
        } else {
            d2r.b().j(accsStreamConfig.getServiceId(), accsStreamConfig.getStreamId());
        }
    }

    @Override // com.taobao.accs.a
    public void unbindService(Context context, String str) {
        String appkey;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f05b4c", new Object[]{this, context, str});
        } else if (!UtilityImpl.getFocusDisableStatus(context)) {
            Intent intent = getIntent(context, 6);
            if (intent == null) {
                sendAppNotBind(context, 6, str, null);
                return;
            }
            try {
                appkey = getConnection().getAppkey();
            } catch (Exception e) {
                ALog.e(this.TAG, "unbindService getAppkey exception", e, new Object[0]);
            }
            if (!TextUtils.isEmpty(appkey)) {
                intent.putExtra("appKey", appkey);
                intent.putExtra("serviceId", str);
                if (UtilityImpl.isMainProcess(context)) {
                    try {
                        sendControlMessage(context, Message.buildUnbindService(getConnection().getHost(null), this.mConfigTag, intent), 6, false);
                    } catch (Exception e2) {
                        ALog.e(this.TAG, "unbindService getHost exception", e2, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // com.taobao.accs.a
    public void unbindUser(Context context) {
        String appkey;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4624d80", new Object[]{this, context});
        } else if (!UtilityImpl.getFocusDisableStatus(context) && !UtilityImpl.getFocusDisableStatus(context)) {
            Intent intent = getIntent(context, 4);
            if (intent == null) {
                sendAppNotBind(context, 4, null, null);
                return;
            }
            try {
                appkey = getConnection().getAppkey();
            } catch (Exception e) {
                ALog.e(this.TAG, "unbindUser getAppkey exception", e, new Object[0]);
            }
            if (!TextUtils.isEmpty(appkey)) {
                intent.putExtra("appKey", appkey);
                if (UtilityImpl.isMainProcess(context)) {
                    try {
                        sendControlMessage(context, Message.buildUnbindUser(getConnection().getHost(null), this.mConfigTag, intent), 4, false);
                    } catch (Exception e2) {
                        ALog.e(this.TAG, "unbindUser getHost exception", e2, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // com.taobao.accs.a
    public void unregisterHeartBeatListener(IHeartBeat iHeartBeat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bee6bcd", new Object[]{this, iHeartBeat});
            return;
        }
        try {
            getConnection().unregisterHeartBeatListener(iHeartBeat);
        } catch (IPCException e) {
            ALog.e(this.TAG, "unregisterHeartBeatListener err", e, new Object[0]);
        }
    }

    @Override // com.taobao.accs.a
    public void updateConfig(AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec2d53f8", new Object[]{this, accsClientConfig});
            return;
        }
        try {
            getConnection().updateConfig(accsClientConfig);
        } catch (Exception e) {
            ALog.e(this.TAG, "updateConfig exception", e, new Object[0]);
        }
    }

    private Intent getIntent(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("36fe5e7f", new Object[]{this, context, new Integer(i)});
        }
        if (i == 1 || !UtilityImpl.getFocusDisableStatus(context)) {
            Intent intent = new Intent();
            intent.setAction(Constants.ACTION_COMMAND);
            intent.setClassName(context.getPackageName(), xd0.channelService);
            intent.putExtra("packageName", context.getPackageName());
            intent.putExtra("command", i);
            try {
                intent.putExtra("appKey", getConnection().getAppkey());
            } catch (Exception e) {
                ALog.e(this.TAG, "getIntent getAppkey exception", e, new Object[0]);
            }
            intent.putExtra(Constants.KEY_CONFIG_TAG, this.mConfigTag);
            return intent;
        }
        ALog.e(this.TAG, "getIntent null command:" + i + " accs enabled:" + UtilityImpl.getFocusDisableStatus(context), new Object[0]);
        return null;
    }

    private void sendAppNotBind(Context context, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a263e64d", new Object[]{this, context, new Integer(i), str, str2});
            return;
        }
        Intent intent = new Intent(Constants.ACTION_RECEIVE);
        intent.setPackage(context.getPackageName());
        intent.putExtra("command", i);
        intent.putExtra("serviceId", str);
        intent.putExtra("dataId", str2);
        try {
            intent.putExtra("appKey", getConnection().getAppkey());
        } catch (Exception e) {
            ALog.e(this.TAG, "sendAppNotBind getAppkey exception", e, new Object[0]);
        }
        intent.putExtra(Constants.KEY_CONFIG_TAG, this.mConfigTag);
        intent.putExtra("errorCode", i == 2 ? 200 : 300);
        o2j.d(context, intent);
    }

    @Override // com.taobao.accs.a
    public void delaySendBusinessAck(String str, String str2, String str3, short s, String str4, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d96e71", new Object[]{this, str, str2, str3, new Short(s), str4, map});
            return;
        }
        try {
            getConnection().sendDelayBizAck(MessageBizAck.buildBizAck(getConnection().getHost(null), this.mConfigTag, str, str2, str3, true, s, str4, map));
        } catch (IPCException e) {
            ALog.e(this.TAG, "delaySendBusinessAck exception", e, new Object[0]);
        }
    }

    @Override // com.taobao.accs.a
    public boolean isAccsConnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eec7c18", new Object[]{this})).booleanValue();
        }
        try {
            if (getConnection() != null) {
                return getConnection().isConnected();
            }
            return false;
        } catch (Exception e) {
            if (e instanceof IPCException) {
                ALog.e(this.TAG, "isAccsConnected isConnected exception", e, new Object[0]);
                if (((IPCException) e).getErrorCode() == 22) {
                    c71.c("accs", BaseMonitor.COUNT_VERIFY, "is_connect_ipc_err", vu3.b.GEO_NOT_SUPPORT);
                    try {
                        ((IConnection) re.m(new ComponentName(re.r(), AccsIPCProvider.class), IConnection.class, new Pair(AccsClientConfig.class, AccsClientConfig.getConfigByTag(this.mConfigTag)), new Pair(Integer.class, Integer.valueOf(tv9.h().i())))).start();
                    } catch (IPCException unused) {
                        ALog.e(this.TAG, "create connectionService exception", e, new Object[0]);
                    }
                }
            }
            return true;
        }
    }

    @Override // com.taobao.accs.a
    public String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("210d8883", new Object[]{this, context, str, str2, bArr, str3, str4, url}) : sendData(context, new ACCSManager.AccsRequest(str, str2, bArr, str3, str4, url, null));
    }

    public void unbindApp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a37ad16", new Object[]{this, context});
            return;
        }
        ALog.e(this.TAG, "unbindApp", new Object[0]);
        if (!UtilityImpl.getFocusDisableStatus(context)) {
            Intent intent = getIntent(context, 2);
            if (intent == null) {
                sendAppNotBind(context, 2, null, null);
            } else if (UtilityImpl.isMainProcess(context)) {
                try {
                    sendControlMessage(context, Message.buildUnbindApp(getConnection().getHost(null), intent), 2, false);
                } catch (Exception e) {
                    ALog.e(this.TAG, "unbindApp getHost exception", e, new Object[0]);
                }
            }
        }
    }

    @Override // com.taobao.accs.a
    public void sendBusinessAck(String str, String str2, String str3, short s, String str4, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acea1bf4", new Object[]{this, str, str2, str3, new Short(s), str4, map});
            return;
        }
        try {
            getConnection().send(Message.buildPushAck(getConnection().getHost(null), this.mConfigTag, str, str2, str3, true, s, str4, map), true);
        } catch (IPCException e) {
            ALog.e(this.TAG, "sendBusinessAck exception", e, new Object[0]);
        }
    }

    @Override // com.taobao.accs.a
    public String sendRequest(Context context, ACCSManager.AccsRequest accsRequest, String str, boolean z) {
        String str2;
        String str3;
        String str4;
        char c2;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c2dd73", new Object[]{this, context, accsRequest, str, new Boolean(z)});
        }
        try {
        } catch (Throwable th2) {
            th = th2;
            str4 = "accs";
            str3 = BaseMonitor.ALARM_POINT_REQ_ERROR;
            str2 = "1";
            c2 = 0;
        }
        if (accsRequest == null) {
            ALog.e(this.TAG, "sendRequest request null", new Object[0]);
            c71.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, null, "1", "request null");
            return null;
        } else if (!UtilityImpl.isMainProcess(context)) {
            ALog.e(this.TAG, "sendRequest not in mainprocess", new Object[0]);
            return null;
        } else if (UtilityImpl.getFocusDisableStatus(context)) {
            ALog.e(this.TAG, "sendRequest disable", new Object[0]);
            c71.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "accs disable");
            return null;
        } else if (TextUtils.isEmpty(getConnection().getAppkey())) {
            c71.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "request appkey null");
            ALog.e(this.TAG, "sendRequest appkey null", new Object[0]);
            return null;
        } else {
            getConnection().start();
            String packageName = str == null ? context.getPackageName() : str;
            String host = getConnection().getHost(null);
            String str5 = this.mConfigTag;
            str4 = "accs";
            str3 = BaseMonitor.ALARM_POINT_REQ_ERROR;
            str2 = "1";
            c2 = 0;
            try {
                Message buildRequest = Message.buildRequest(context, host, str5, "", packageName, Constants.TARGET_SERVICE_PRE, accsRequest, z);
                if (!(buildRequest == null || buildRequest.getNetPermanceMonitor() == null)) {
                    buildRequest.getNetPermanceMonitor().onSend();
                }
                getConnection().send(buildRequest, true);
                if (UtilityImpl.isServiceIdPrintLog(buildRequest.serviceId)) {
                    ALog.e(this.TAG, "sendRequest.info", "dataId", buildRequest.dataId, "serviceId", buildRequest.serviceId, "requestId", accsRequest.dataId);
                }
            } catch (Throwable th3) {
                th = th3;
                if (accsRequest != null) {
                    String str6 = accsRequest.serviceId;
                    c71.a(str4, str3, str6, str2, "request " + th.toString());
                    String str7 = this.TAG;
                    String str8 = accsRequest.dataId;
                    Object[] objArr = new Object[2];
                    objArr[c2] = "dataId";
                    objArr[1] = str8;
                    ALog.e(str7, "sendRequest", th, objArr);
                }
                return accsRequest.dataId;
            }
            return accsRequest.dataId;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void sendControlMessage(android.content.Context r9, com.taobao.accs.data.Message r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.internal.ACCSManagerImpl.sendControlMessage(android.content.Context, com.taobao.accs.data.Message, int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ee, code lost:
        tb.c71.a("accs", com.taobao.accs.utl.BaseMonitor.ALARM_POINT_REQ_ERROR, r18.serviceId, "1", "accs disable");
     */
    @Override // com.taobao.accs.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String sendData(android.content.Context r17, com.taobao.accs.ACCSManager.AccsRequest r18) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.internal.ACCSManagerImpl.sendData(android.content.Context, com.taobao.accs.ACCSManager$AccsRequest):java.lang.String");
    }

    @Override // com.taobao.accs.a
    public boolean addBizAckInfo(String str, String str2, AckExtraData ackExtraData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c67adc39", new Object[]{this, str, str2, ackExtraData})).booleanValue();
        }
        if (!m8l.t()) {
            return false;
        }
        if (ackExtraData == null) {
            ALog.e(this.TAG, "addBizAckInfo extData null", "dataId", str, Constants.KEY_STEPID, str2);
            return false;
        }
        try {
            return getConnection().addBizAckInfo(str, str2, ackExtraData);
        } catch (IPCException e) {
            ALog.e(this.TAG, "addBizAckInfo exception", e, new Object[0]);
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:(1:21)(1:22)|23|(6:28|34|35|(3:97|37|(4:44|(2:46|(10:102|48|49|93|50|51|95|52|(1:56)|59))|64|67)(1:41))(2:70|(2:72|73)(7:74|(1:76)|77|(1:79)|80|(1:82)|83))|84|90)|29|30|91|31|32|99|33|34|35|(0)(0)|84|90) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0129, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0294, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0295, code lost:
        r6 = com.taobao.accs.utl.BaseMonitor.ALARM_POINT_REQ_ERROR;
        r13 = r20;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e1 A[Catch: all -> 0x01de, TryCatch #7 {all -> 0x01de, blocks: (B:67:0x01b1, B:70:0x01e1, B:72:0x01ee, B:74:0x021a, B:76:0x026e, B:77:0x0275, B:79:0x027d, B:80:0x0285, B:82:0x0289, B:83:0x028f, B:87:0x0299), top: B:104:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.taobao.accs.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String sendPushResponse(android.content.Context r26, com.taobao.accs.ACCSManager.AccsRequest r27, com.taobao.accs.base.TaoBaseService.ExtraInfo r28) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.internal.ACCSManagerImpl.sendPushResponse(android.content.Context, com.taobao.accs.ACCSManager$AccsRequest, com.taobao.accs.base.TaoBaseService$ExtraInfo):java.lang.String");
    }

    @Override // com.taobao.accs.a
    public String sendRequest(Context context, ACCSManager.AccsRequest accsRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("97c9e1e3", new Object[]{this, context, accsRequest}) : sendRequest(context, accsRequest, null, true);
    }
}
