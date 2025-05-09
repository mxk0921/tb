package com.alipay.android.msp.pay;

import com.alipay.android.msp.constants.MspNetConstants;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.framework.dynfun.DynDataWrapper;
import com.alipay.android.msp.network.model.RequestConfig;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TradeLogicData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Header[] f3716a;
    public RequestConfig d;
    public final DynDataWrapper<String> e;
    public final DynDataWrapper<String> i;
    public int b = 0;
    public int c = 1;
    public boolean f = false;
    public boolean g = false;
    public boolean h = true;
    public String j = "";
    public String k = "";
    public boolean l = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class TradeLogicDataTransfer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Header[] f3717a;
        public RequestConfig d;
        public int b = 0;
        public int c = 1;
        public String e = "";
        public boolean f = false;
        public boolean g = false;
        public boolean h = true;
        public String i = "";
        public String j = "";
        public String k = "";
        public boolean l = false;

        public static /* synthetic */ Header[] access$000(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Header[]) ipChange.ipc$dispatch("149d1c10", new Object[]{tradeLogicDataTransfer});
            }
            return tradeLogicDataTransfer.f3717a;
        }

        public static /* synthetic */ Header[] access$002(TradeLogicDataTransfer tradeLogicDataTransfer, Header[] headerArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Header[]) ipChange.ipc$dispatch("d6177c40", new Object[]{tradeLogicDataTransfer, headerArr});
            }
            tradeLogicDataTransfer.f3717a = headerArr;
            return headerArr;
        }

        public static /* synthetic */ int access$100(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a31e65ae", new Object[]{tradeLogicDataTransfer})).intValue();
            }
            return tradeLogicDataTransfer.b;
        }

        public static /* synthetic */ String access$1000(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4b5dc797", new Object[]{tradeLogicDataTransfer});
            }
            return tradeLogicDataTransfer.k;
        }

        public static /* synthetic */ String access$1002(TradeLogicDataTransfer tradeLogicDataTransfer, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6f39758b", new Object[]{tradeLogicDataTransfer, str});
            }
            tradeLogicDataTransfer.k = str;
            return str;
        }

        public static /* synthetic */ int access$102(TradeLogicDataTransfer tradeLogicDataTransfer, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c5442e59", new Object[]{tradeLogicDataTransfer, new Integer(i)})).intValue();
            }
            tradeLogicDataTransfer.b = i;
            return i;
        }

        public static /* synthetic */ boolean access$1100(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f49cb2e", new Object[]{tradeLogicDataTransfer})).booleanValue();
            }
            return tradeLogicDataTransfer.l;
        }

        public static /* synthetic */ boolean access$1102(TradeLogicDataTransfer tradeLogicDataTransfer, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("de85b6ac", new Object[]{tradeLogicDataTransfer, new Boolean(z)})).booleanValue();
            }
            tradeLogicDataTransfer.l = z;
            return z;
        }

        public static /* synthetic */ int access$200(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a2a4caf", new Object[]{tradeLogicDataTransfer})).intValue();
            }
            return tradeLogicDataTransfer.c;
        }

        public static /* synthetic */ int access$202(TradeLogicDataTransfer tradeLogicDataTransfer, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dfb52778", new Object[]{tradeLogicDataTransfer, new Integer(i)})).intValue();
            }
            tradeLogicDataTransfer.c = i;
            return i;
        }

        public static /* synthetic */ RequestConfig access$300(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RequestConfig) ipChange.ipc$dispatch("ba5767ba", new Object[]{tradeLogicDataTransfer});
            }
            return tradeLogicDataTransfer.d;
        }

        public static /* synthetic */ RequestConfig access$302(TradeLogicDataTransfer tradeLogicDataTransfer, RequestConfig requestConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RequestConfig) ipChange.ipc$dispatch("44042b17", new Object[]{tradeLogicDataTransfer, requestConfig});
            }
            tradeLogicDataTransfer.d = requestConfig;
            return requestConfig;
        }

        public static /* synthetic */ String access$400(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5274eda2", new Object[]{tradeLogicDataTransfer});
            }
            return tradeLogicDataTransfer.e;
        }

        public static /* synthetic */ String access$402(TradeLogicDataTransfer tradeLogicDataTransfer, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f654ed6", new Object[]{tradeLogicDataTransfer, str});
            }
            tradeLogicDataTransfer.e = str;
            return str;
        }

        public static /* synthetic */ boolean access$500(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bf4e01c3", new Object[]{tradeLogicDataTransfer})).booleanValue();
            }
            return tradeLogicDataTransfer.f;
        }

        public static /* synthetic */ boolean access$502(TradeLogicDataTransfer tradeLogicDataTransfer, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2f0852b7", new Object[]{tradeLogicDataTransfer, new Boolean(z)})).booleanValue();
            }
            tradeLogicDataTransfer.f = z;
            return z;
        }

        public static /* synthetic */ boolean access$600(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8659e8c4", new Object[]{tradeLogicDataTransfer})).booleanValue();
            }
            return tradeLogicDataTransfer.g;
        }

        public static /* synthetic */ boolean access$602(TradeLogicDataTransfer tradeLogicDataTransfer, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("49794bd6", new Object[]{tradeLogicDataTransfer, new Boolean(z)})).booleanValue();
            }
            tradeLogicDataTransfer.g = z;
            return z;
        }

        public static /* synthetic */ boolean access$700(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4d65cfc5", new Object[]{tradeLogicDataTransfer})).booleanValue();
            }
            return tradeLogicDataTransfer.h;
        }

        public static /* synthetic */ boolean access$702(TradeLogicDataTransfer tradeLogicDataTransfer, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("63ea44f5", new Object[]{tradeLogicDataTransfer, new Boolean(z)})).booleanValue();
            }
            tradeLogicDataTransfer.h = z;
            return z;
        }

        public static /* synthetic */ String access$800(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("32385a1e", new Object[]{tradeLogicDataTransfer});
            }
            return tradeLogicDataTransfer.i;
        }

        public static /* synthetic */ String access$802(TradeLogicDataTransfer tradeLogicDataTransfer, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b42d1452", new Object[]{tradeLogicDataTransfer, str});
            }
            tradeLogicDataTransfer.i = str;
            return str;
        }

        public static /* synthetic */ String access$900(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6a29353d", new Object[]{tradeLogicDataTransfer});
            }
            return tradeLogicDataTransfer.j;
        }

        public static /* synthetic */ String access$902(TradeLogicDataTransfer tradeLogicDataTransfer, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("795f05b1", new Object[]{tradeLogicDataTransfer, str});
            }
            tradeLogicDataTransfer.j = str;
            return str;
        }
    }

    public TradeLogicData(MspContext mspContext) {
        new WeakReference(mspContext);
        int bizId = mspContext.getBizId();
        this.e = new DynDataWrapper<>(bizId, "trade_no", "");
        this.i = new DynDataWrapper<>(bizId, "sessionId", "");
    }

    public void fromTransfer(TradeLogicDataTransfer tradeLogicDataTransfer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732f5dbf", new Object[]{this, tradeLogicDataTransfer});
            return;
        }
        setLdcHeaders(TradeLogicDataTransfer.access$000(tradeLogicDataTransfer));
        this.b = TradeLogicDataTransfer.access$100(tradeLogicDataTransfer);
        setUac(TradeLogicDataTransfer.access$200(tradeLogicDataTransfer));
        setRequestConfig(TradeLogicDataTransfer.access$300(tradeLogicDataTransfer));
        setTradeNo(TradeLogicDataTransfer.access$400(tradeLogicDataTransfer));
        setHasTryLogin(TradeLogicDataTransfer.access$500(tradeLogicDataTransfer));
        setFirstRequest(TradeLogicDataTransfer.access$600(tradeLogicDataTransfer));
        setIsSupportGzip(TradeLogicDataTransfer.access$700(tradeLogicDataTransfer));
        setSessionId(TradeLogicDataTransfer.access$800(tradeLogicDataTransfer));
        setUserName(TradeLogicDataTransfer.access$900(tradeLogicDataTransfer));
        setUserLogoUrl(TradeLogicDataTransfer.access$1000(tradeLogicDataTransfer));
        setIsViChannelMode(TradeLogicDataTransfer.access$1100(tradeLogicDataTransfer));
    }

    public Header[] getLdcHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Header[]) ipChange.ipc$dispatch("81bca66e", new Object[]{this});
        }
        return this.f3716a;
    }

    public RequestConfig getRequestConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("fdfdb155", new Object[]{this});
        }
        return this.d;
    }

    public int getRetryTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58b4bfee", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public String getSessionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8ede3e", new Object[]{this});
        }
        return this.i.read();
    }

    public String getTradeNo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59e3704a", new Object[]{this});
        }
        return this.e.read();
    }

    public int getUac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1615001b", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public String getUserLogoUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60b03a96", new Object[]{this});
        }
        return this.k;
    }

    public String getUserName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d328f00d", new Object[]{this});
        }
        return this.j;
    }

    public boolean hasTryLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96c687b3", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean isFirstRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43089c14", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public boolean isIsSupportGzip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5665f340", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean isViChannelMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c55b94", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public void setFirstRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a7408c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void setHasTryLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8de01d87", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void setIsSupportGzip(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e327850", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void setIsViChannelMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f05b4c6", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public void setLdcHeaders(Header[] headerArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bdb1e02", new Object[]{this, headerArr});
        } else if (headerArr != null) {
            this.f3716a = headerArr;
        }
    }

    public void setRequestConfig(RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b50237", new Object[]{this, requestConfig});
        } else {
            this.d = requestConfig;
        }
    }

    public void setSessionId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648aa560", new Object[]{this, str});
        } else {
            this.i.write(str);
        }
    }

    public void setTradeNo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98e21d4", new Object[]{this, str});
        } else {
            this.e.write(str);
        }
    }

    public void setUac(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a743d8e7", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void setUserLogoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd0e4708", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public void setUserName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd26c09", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public TradeLogicDataTransfer toTransfer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TradeLogicDataTransfer) ipChange.ipc$dispatch("33ebbcac", new Object[]{this});
        }
        TradeLogicDataTransfer tradeLogicDataTransfer = new TradeLogicDataTransfer();
        Header[] headerArr = this.f3716a;
        if (headerArr != null) {
            TradeLogicDataTransfer.access$002(tradeLogicDataTransfer, (Header[]) Arrays.copyOf(headerArr, headerArr.length));
        }
        TradeLogicDataTransfer.access$102(tradeLogicDataTransfer, this.b);
        TradeLogicDataTransfer.access$202(tradeLogicDataTransfer, this.c);
        RequestConfig requestConfig = this.d;
        if (requestConfig != null) {
            TradeLogicDataTransfer.access$302(tradeLogicDataTransfer, requestConfig.clone());
        }
        TradeLogicDataTransfer.access$402(tradeLogicDataTransfer, this.e.read());
        TradeLogicDataTransfer.access$502(tradeLogicDataTransfer, this.f);
        TradeLogicDataTransfer.access$602(tradeLogicDataTransfer, this.g);
        TradeLogicDataTransfer.access$702(tradeLogicDataTransfer, this.h);
        TradeLogicDataTransfer.access$802(tradeLogicDataTransfer, this.i.read());
        TradeLogicDataTransfer.access$902(tradeLogicDataTransfer, this.j);
        TradeLogicDataTransfer.access$1002(tradeLogicDataTransfer, this.k);
        TradeLogicDataTransfer.access$1102(tradeLogicDataTransfer, this.l);
        return tradeLogicDataTransfer;
    }

    public void updateRetryTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e8642e", new Object[]{this});
        } else {
            this.b++;
        }
    }

    public void setLdcHeaders(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1e53ee", new Object[]{this, str});
        } else {
            this.f3716a = new Header[]{new BasicHeader(MspNetConstants.Request.MSP_PARAM, str)};
        }
    }
}
