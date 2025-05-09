package com.ali.user.open.core.exception;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RpcException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -2875437994101380406L;
    private int mCode;
    private String mMsg;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface ErrorCode {
        public static final int ANTI_REFRESH = 401;
        public static final int API_UNAUTHORIZED = 408;
        public static final int CLIENT_DESERIALIZER_ERROR = 10;
        public static final int CLIENT_NETWORK_ERROR = 7;
        public static final int EXPIRED_REQUEST = 402;
        public static final int ILLEGEL_SIGN = 403;
        public static final int LIMIT_ERROR = 400;
        public static final int SESSION_INVALID = 407;
        public static final int SYSTEM_ERROR = 406;
    }

    static {
        t2o.a(71303191);
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
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/core/exception/RpcException");
    }

    public static boolean isNetworkError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d942731c", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == 7) {
            return true;
        }
        return false;
    }

    public static boolean isSystemError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("451e0f31", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == 7 || (i >= 400 && i <= 408)) {
            return true;
        }
        return false;
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.mCode;
    }

    public String getMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a817838e", new Object[]{this});
        }
        return this.mMsg;
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
