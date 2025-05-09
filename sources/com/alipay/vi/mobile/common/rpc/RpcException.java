package com.alipay.vi.mobile.common.rpc;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -2875437994101380406L;
    private int mCode;
    private String mControl;
    private String mMsg;
    private String mOperationType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface ErrorCode {
        public static final int CLIENT_DESERIALIZER_ERROR = 10;
        public static final int CLIENT_HANDLE_ERROR = 9;
        public static final int CLIENT_INTERUPTED_ERROR = 13;
        public static final int CLIENT_LOGIN_FAIL_ERROR = 11;
        public static final int CLIENT_NETWORK_AUTH_ERROR = 15;
        public static final int CLIENT_NETWORK_CACHE_ERROR = 14;
        public static final int CLIENT_NETWORK_CONNECTION_ERROR = 4;
        public static final int CLIENT_NETWORK_DNS_ERROR = 16;
        public static final int CLIENT_NETWORK_ERROR = 7;
        public static final int CLIENT_NETWORK_SCHEDULE_ERROR = 8;
        public static final int CLIENT_NETWORK_SERVER_ERROR = 6;
        public static final int CLIENT_NETWORK_SOCKET_ERROR = 5;
        public static final int CLIENT_NETWORK_SSL_ERROR = 3;
        public static final int CLIENT_NETWORK_UNAVAILABLE_ERROR = 2;
        public static final int CLIENT_TRANSPORT_UNAVAILABAL_ERROR = 1;
        public static final int CLIENT_UNKNOWN_ERROR = 0;
        public static final int CLIENT_USER_CHANGE_ERROR = 12;
        public static final int OK = 1000;
        public static final int SERVER_BIZEXCEPTION = 6666;
        public static final int SERVER_CREATEPROXYERROR = 4003;
        public static final int SERVER_ILLEGALACCESS = 6003;
        public static final int SERVER_ILLEGALARGUMENT = 6005;
        public static final int SERVER_INVOKEEXCEEDLIMIT = 1002;
        public static final int SERVER_JSONPARSEREXCEPTION = 6004;
        public static final int SERVER_METHODNOTFOUND = 6001;
        public static final int SERVER_OPERATIONTYPEMISSED = 3000;
        public static final int SERVER_PARAMMISSING = 6002;
        public static final int SERVER_PERMISSIONDENY = 1001;
        public static final int SERVER_REMOTEACCESSEXCEPTION = 4002;
        public static final int SERVER_REQUESTDATAMISSED = 3001;
        public static final int SERVER_REQUESTTIMEOUT = 4001;
        public static final int SERVER_SERVICENOTFOUND = 6000;
        public static final int SERVER_SESSIONSTATUS = 2000;
        public static final int SERVER_UNKNOWERROR = 5000;
        public static final int SERVER_VALUEINVALID = 3002;
    }

    public RpcException(Integer num, String str) {
        super(format(num, str));
        this.mCode = num.intValue();
        this.mMsg = str;
    }

    public static String format(Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d092f0bd", new Object[]{num, str});
        }
        StringBuilder sb = new StringBuilder("RPCException: ");
        if (num != null) {
            sb.append("[");
            sb.append(num);
            sb.append("]");
        }
        sb.append(" : ");
        if (str != null) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static /* synthetic */ Object ipc$super(RpcException rpcException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/vi/mobile/common/rpc/RpcException");
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.mCode;
    }

    public String getControl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4049c32", new Object[]{this});
        }
        return this.mControl;
    }

    public String getMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a817838e", new Object[]{this});
        }
        return this.mMsg;
    }

    public String getOperationType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76cb9a4e", new Object[]{this});
        }
        return this.mOperationType;
    }

    public void setControl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39272ec", new Object[]{this, str});
        } else {
            this.mControl = str;
        }
    }

    public void setOperationType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97479150", new Object[]{this, str});
        } else {
            this.mOperationType = str;
        }
    }

    public RpcException(Integer num, Throwable th) {
        super(th);
        this.mCode = num.intValue();
    }

    public RpcException(String str) {
        super(str);
        this.mCode = 0;
        this.mMsg = str;
    }
}
