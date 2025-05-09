package com.alipay.android.msp.framework.exception;

import android.text.TextUtils;
import com.alipay.android.msp.framework.statisticsv2.model.StError;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class NetErrorException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 8374198311711795611L;
    private String bioErrorCode;
    private Channel mChannel;
    private boolean mIsClientError;
    private String mOperationType;
    private int mStatErrorCode;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum Channel {
        UNKNOWN("unknown"),
        RPC("rpc"),
        HTTP("http"),
        WEB("web"),
        DNS("dns");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String val;

        Channel(String str) {
            this.val = str;
        }

        public static /* synthetic */ Object ipc$super(Channel channel, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/exception/NetErrorException$Channel");
        }

        public static Channel valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Channel) ipChange.ipc$dispatch("1aee15d6", new Object[]{str});
            }
            return (Channel) Enum.valueOf(Channel.class, str);
        }

        @Override // java.lang.Enum
        public final String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.val;
        }
    }

    public NetErrorException() {
        this(null, null);
    }

    public static /* synthetic */ Object ipc$super(NetErrorException netErrorException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/exception/NetErrorException");
    }

    private static void printException(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f547bca2", new Object[]{str, th});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            "NetError--".concat(String.valueOf(str));
        }
        if (th != null) {
            try {
                new StringBuilder("NetError--").append(th.getMessage());
            } catch (Exception unused) {
            }
        }
    }

    public final String getBioErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a8f0c76", new Object[]{this});
        }
        return this.bioErrorCode;
    }

    public final String getErrorNameForLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("209247e1", new Object[]{this});
        }
        String netErrorException = toString();
        if (TextUtils.isEmpty(this.mOperationType)) {
            return netErrorException;
        }
        return netErrorException + "_" + this.mOperationType;
    }

    public final String getShortMessageForLog() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f69b4fd", new Object[]{this});
        }
        try {
            if (getCause() != null) {
                str = getCause().getMessage();
            } else {
                str = getMessage();
            }
            String shortRpcLog = LogUtil.shortRpcLog(str);
            if (TextUtils.isEmpty(shortRpcLog)) {
                shortRpcLog = StError.getStackTraceMessage(this);
            }
            return getBioErrorCode() + "|" + shortRpcLog;
        } catch (Throwable unused) {
            return "UnknownStack";
        }
    }

    public final int getStatErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0dfbb65", new Object[]{this})).intValue();
        }
        return this.mStatErrorCode;
    }

    public final boolean isClientError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b94c47e", new Object[]{this})).booleanValue();
        }
        return this.mIsClientError;
    }

    public final void setBioErrorCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57f0f6c0", new Object[]{this, str});
        } else {
            this.bioErrorCode = str;
        }
    }

    public final NetErrorException setChannel(Channel channel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetErrorException) ipChange.ipc$dispatch("e78a1dcd", new Object[]{this, channel});
        }
        this.mChannel = channel;
        return this;
    }

    public final NetErrorException setIsClientError(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetErrorException) ipChange.ipc$dispatch("9e21b532", new Object[]{this, new Boolean(z)});
        }
        this.mIsClientError = z;
        return this;
    }

    public final NetErrorException setOperation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetErrorException) ipChange.ipc$dispatch("48a3ed18", new Object[]{this, str});
        }
        this.mOperationType = str;
        return this;
    }

    public final NetErrorException setStatErrorCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetErrorException) ipChange.ipc$dispatch("2f2a8691", new Object[]{this, new Integer(i)});
        }
        this.mStatErrorCode = i;
        return this;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (this.mStatErrorCode != 0) {
            return String.format(Locale.CHINA, "%s_%d", String.valueOf(this.mChannel), Integer.valueOf(this.mStatErrorCode));
        }
        if (getCause() != null) {
            Locale locale = Locale.CHINA;
            String valueOf = String.valueOf(this.mChannel);
            String name = getCause().getClass().getName();
            return valueOf + "_" + name;
        }
        Locale locale2 = Locale.CHINA;
        return String.valueOf(this.mChannel);
    }

    public NetErrorException(String str) {
        this(str, null);
    }

    public NetErrorException(Throwable th) {
        this(null, th);
    }

    public NetErrorException(String str, Throwable th) {
        super(str, th);
        this.mIsClientError = false;
        this.mStatErrorCode = 0;
        this.mChannel = Channel.UNKNOWN;
        this.mOperationType = "";
        printException(str, th);
    }
}
