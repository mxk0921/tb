package com.alipay.android.msp.network.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspBaseDefine;
import com.alipay.android.msp.constants.MspNetConstants;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.constraints.IChannelInfo;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.network.DispatchType;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.pay.service.MspInitAssistService;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspSwitchUtil;
import com.alipay.android.msp.utils.OrderInfoUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RequestConfig implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SETTING_PROVIDER = "content://com.alipay.android.app.settings.data.ServerProvider/current_server";

    /* renamed from: a  reason: collision with root package name */
    public RequestChannel f3711a;
    public StEvent b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public String k;
    public String l;
    public String m;
    public String n;
    public boolean o;
    public String p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public boolean v;
    public Map<String, String> w;
    public boolean x;

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.network.model.RequestConfig$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$android$msp$network$model$RequestConfig$RequestChannel;

        static {
            int[] iArr = new int[RequestChannel.values().length];
            $SwitchMap$com$alipay$android$msp$network$model$RequestConfig$RequestChannel = iArr;
            try {
                iArr[RequestChannel.PB_V3_CASHIER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$network$model$RequestConfig$RequestChannel[RequestChannel.PB_V2_CASHIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$network$model$RequestConfig$RequestChannel[RequestChannel.PB_V3_SDK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$network$model$RequestConfig$RequestChannel[RequestChannel.PB_V2_SECURITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$network$model$RequestConfig$RequestChannel[RequestChannel.PB_V1_CASHIER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$network$model$RequestConfig$RequestChannel[RequestChannel.PB_V1_SECURITY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$network$model$RequestConfig$RequestChannel[RequestChannel.BYTES_CASHIER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$network$model$RequestConfig$RequestChannel[RequestChannel.BYTES_SECURITY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$network$model$RequestConfig$RequestChannel[RequestChannel.DYNAMIC_HOST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$network$model$RequestConfig$RequestChannel[RequestChannel.JSON_CASHIER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: Taobao */
    @Deprecated
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum RequestChannel {
        PB_V1_CASHIER("rpc_pbv1"),
        PB_V1_SECURITY("rpc_pbv1"),
        PB_V2_CASHIER("rpc_pbv2"),
        PB_V2_SECURITY("rpc_pbv2"),
        PB_V3_SDK("rpc_pbv3"),
        PB_V3_CASHIER("rpc_pbv3"),
        BYTES_CASHIER("http_bytes"),
        BYTES_SECURITY("http_bytes"),
        DYNAMIC_HOST("http_mobilesp"),
        JSON_CASHIER("rpc_json");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String mVal;

        RequestChannel(String str) {
            this.mVal = str;
        }

        public static /* synthetic */ Object ipc$super(RequestChannel requestChannel, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/model/RequestConfig$RequestChannel");
        }

        public static RequestChannel valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RequestChannel) ipChange.ipc$dispatch("330ffe20", new Object[]{str});
            }
            return (RequestChannel) Enum.valueOf(RequestChannel.class, str);
        }

        public final String fullName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9fba357f", new Object[]{this});
            }
            return this.mVal + "-" + name();
        }

        @Override // java.lang.Enum
        public final String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.mVal;
        }
    }

    public RequestConfig(String str, String str2, int i, boolean z) {
        this.f3711a = null;
        this.j = true;
        this.k = "";
        this.o = false;
        this.p = "";
        this.q = 0;
        this.r = false;
        this.t = false;
        this.u = 0;
        this.v = false;
        this.s = z;
        if (str != null) {
            if (str.contains("need_login")) {
                this.r = true;
            } else {
                MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
                if (OrderInfoUtil.isRewordRequest(str) || (this.s && mspContextByBizId != null && mspContextByBizId.isFromWallet())) {
                    this.r = true;
                }
                if (OrderInfoUtil.isOpenAuthOrder(mspContextByBizId)) {
                    this.r = true;
                }
            }
        }
        this.i = str2;
        d();
        this.u = i;
        b();
    }

    public static RequestChannel c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestChannel) ipChange.ipc$dispatch("db8a9b8e", new Object[0]);
        }
        if (MspSwitchUtil.isPbv3Enabled()) {
            return RequestChannel.PB_V3_SDK;
        }
        return RequestChannel.BYTES_CASHIER;
    }

    public final void b() {
        String str;
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509c7e1", new Object[]{this});
        } else if (TextUtils.isEmpty(this.h)) {
            if (MspSwitchUtil.isPbv3Enabled()) {
                str = "https://mobilegw.alipay.com/mgw.htm";
            } else {
                str = "http://mobilegw.alipay.com/mgw.htm";
            }
            if (GlobalConstant.DEBUG && (context = GlobalHelper.getInstance().getContext()) != null) {
                try {
                    Cursor query = context.getContentResolver().query(Uri.parse(SETTING_PROVIDER), null, null, null, null);
                    if (query != null && query.getCount() > 0) {
                        if (query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndex("url"));
                            if (!TextUtils.isEmpty(string)) {
                                str = string;
                            }
                        }
                        query.close();
                    }
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
            this.h = str;
        }
    }

    public String getActionJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4070b45", new Object[]{this});
        }
        return this.i;
    }

    public String getApiName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return this.d;
    }

    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
        }
        return this.g;
    }

    public int getBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue();
        }
        return this.u;
    }

    public RequestChannel getChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestChannel) ipChange.ipc$dispatch("a45a6a7b", new Object[]{this});
        }
        return this.f3711a;
    }

    public String getDispatchType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("718433ef", new Object[]{this});
        }
        switch (AnonymousClass1.$SwitchMap$com$alipay$android$msp$network$model$RequestConfig$RequestChannel[this.f3711a.ordinal()]) {
            case 1:
                if (this.r) {
                    return DispatchType.PB_V3_CASHIER_LOGIN;
                }
                return DispatchType.PB_V3_CASHIER;
            case 2:
                if (this.r) {
                    return DispatchType.PB_V2_CASHIER_LOGIN;
                }
                return DispatchType.PB_V2_CASHIER;
            case 3:
                return DispatchType.PB_V3_SDK;
            case 4:
            case 9:
            default:
                return DispatchType.PB_V2_CASHIER;
            case 5:
                return DispatchType.PB_V1_CASHIER;
            case 6:
                return DispatchType.PB_V1_SECURITY;
            case 7:
                return DispatchType.BYTES_CASHIER;
            case 8:
                return DispatchType.BYTES_SECURITY;
            case 10:
                return DispatchType.JSON_CASHIER;
        }
    }

    public String getExtendParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c6bf1b9", new Object[]{this, str});
        }
        Map<String, String> map = this.w;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.w.get(str);
    }

    public Map<String, String> getExtendParamsMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("940e06c2", new Object[]{this});
        }
        return this.w;
    }

    public String getHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9fd6f9b", new Object[]{this});
        }
        return this.h;
    }

    public String getHttpContentType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27df3aa4", new Object[]{this});
        }
        RequestChannel requestChannel = this.f3711a;
        if (requestChannel == RequestChannel.PB_V3_SDK) {
            this.m = HeaderConstant.HEADER_VALUE_PB_TYPE;
        } else if (requestChannel == RequestChannel.JSON_CASHIER) {
            this.m = "application/json";
        } else if (TextUtils.isEmpty(this.m)) {
            this.m = MspNetConstants.Request.DEFAULT_CONTENT_TYPE;
        }
        return this.m;
    }

    public String getMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this});
        }
        return this.f;
    }

    public String getMiniDispatchType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b49b0158", new Object[]{this});
        }
        String requestChannel = this.f3711a.toString();
        RequestChannel requestChannel2 = this.f3711a;
        if ((requestChannel2 != RequestChannel.PB_V3_CASHIER && requestChannel2 != RequestChannel.PB_V2_CASHIER) || !this.r) {
            return requestChannel;
        }
        return this.f3711a.toString() + "CheckLogin";
    }

    public String getNamespace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79c37174", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.c)) {
            this.c = "com.alipay.mobilecashier";
        }
        return this.c;
    }

    public String getRequestKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f443a973", new Object[]{this});
        }
        return this.l;
    }

    public String getSessionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8ede3e", new Object[]{this});
        }
        return this.n;
    }

    public StEvent getStatisticEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StEvent) ipChange.ipc$dispatch("a3780888", new Object[]{this});
        }
        return this.b;
    }

    public String getTridesKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20ea5097", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.k)) {
            this.k = Utils.getTriDesKey();
        }
        return this.k;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.e;
    }

    public String getmTradeNo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e46a614b", new Object[]{this});
        }
        return this.p;
    }

    public int getmUac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee60507a", new Object[]{this})).intValue();
        }
        return this.q;
    }

    public boolean hasTryLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96c687b3", new Object[]{this})).booleanValue();
        }
        return this.t;
    }

    public boolean isBytes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccf4596c", new Object[]{this})).booleanValue();
        }
        RequestChannel requestChannel = this.f3711a;
        if (requestChannel == RequestChannel.BYTES_CASHIER || requestChannel == RequestChannel.BYTES_SECURITY) {
            return true;
        }
        return false;
    }

    public boolean isDynamicHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50bfed08", new Object[]{this})).booleanValue();
        }
        if (this.f3711a == RequestChannel.DYNAMIC_HOST) {
            return true;
        }
        return false;
    }

    public boolean isFirstRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43089c14", new Object[]{this})).booleanValue();
        }
        return this.s;
    }

    public boolean isFromWallet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a09ea318", new Object[]{this})).booleanValue();
        }
        return this.x;
    }

    public boolean isPbV1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18e6c162", new Object[]{this})).booleanValue();
        }
        RequestChannel requestChannel = this.f3711a;
        if (requestChannel == RequestChannel.PB_V1_CASHIER || requestChannel == RequestChannel.PB_V1_SECURITY) {
            return true;
        }
        return false;
    }

    public boolean isPbv2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f8fecc3", new Object[]{this})).booleanValue();
        }
        RequestChannel requestChannel = this.f3711a;
        if (requestChannel == RequestChannel.PB_V2_CASHIER || requestChannel == RequestChannel.PB_V2_SECURITY) {
            return true;
        }
        return false;
    }

    public boolean isPbv3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f9e0444", new Object[]{this})).booleanValue();
        }
        if (this.f3711a == RequestChannel.PB_V3_CASHIER) {
            return true;
        }
        return false;
    }

    public boolean isPbv3ForSdk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a9847d5", new Object[]{this})).booleanValue();
        }
        if (this.f3711a == RequestChannel.PB_V3_SDK) {
            return true;
        }
        return false;
    }

    public boolean isPreloadNetRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f56d91c", new Object[]{this})).booleanValue();
        }
        return this.v;
    }

    public boolean isSupportGzip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c337074a", new Object[]{this})).booleanValue() : this.j;
    }

    public boolean ismNeedLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fea63bbb", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    public boolean ismNeedUa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7898630", new Object[]{this})).booleanValue();
        }
        if (this.q == 1) {
            return true;
        }
        return false;
    }

    public boolean ismResponseHeaderGzipFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c0e35a2", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public void setApiName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26589b54", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.d = str;
        }
    }

    public void setApiVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca4201f1", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.g = str;
        }
    }

    public void setExtendParamsMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d15262a4", new Object[]{this, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        this.w = map;
    }

    public void setFromWallet(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa96c08", new Object[]{this, new Boolean(z)});
        } else {
            this.x = z;
        }
    }

    public void setHasTryLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8de01d87", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public void setHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fc43b", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.h = str;
        }
    }

    public void setIsNeedLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57bcaee6", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    public void setMethod(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc10634", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.f = str;
        }
    }

    public void setNamespace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e878ea", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.c = str;
        }
    }

    public void setPreloadNetRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("762f1f4", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    public void setSessionId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648aa560", new Object[]{this, str});
            return;
        }
        this.n = str;
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.u);
        if (mspContextByBizId != null) {
            mspContextByBizId.setSpmUniqueId(str);
            mspContextByBizId.setGlobalSession(str);
            mspContextByBizId.getStatisticInfo().updateAttr(Vector.Id, "sessionId", str);
        }
    }

    public void setStatisticEvent(StEvent stEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f18a979e", new Object[]{this, stEvent});
        } else {
            this.b = stEvent;
        }
    }

    public void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.e = str;
        }
    }

    public void setmResponseHeaderGzipFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e85c2e", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public void setmTradeNo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33bf228b", new Object[]{this, str});
        } else {
            this.p = str;
        }
    }

    public void setmUac(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39fdf3d0", new Object[]{this, new Integer(i)});
        } else {
            this.q = i;
        }
    }

    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String str2 = this.e;
        String str3 = this.f;
        RequestChannel requestChannel = this.f3711a;
        if (requestChannel != null) {
            str = requestChannel.fullName();
        } else {
            str = "null";
        }
        return "<RequestConfig [/" + str2 + "/" + str3 + "] " + str + ">";
    }

    public RequestConfig clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("9d4184b3", new Object[]{this});
        }
        RequestConfig requestConfig = new RequestConfig();
        requestConfig.c = this.c;
        requestConfig.d = this.d;
        requestConfig.e = this.e;
        requestConfig.f = this.f;
        requestConfig.g = this.g;
        requestConfig.h = this.h;
        requestConfig.i = this.i;
        requestConfig.j = this.j;
        requestConfig.k = this.k;
        requestConfig.l = this.l;
        requestConfig.m = this.m;
        requestConfig.n = this.n;
        requestConfig.o = this.o;
        requestConfig.p = this.p;
        requestConfig.q = this.q;
        requestConfig.r = this.r;
        requestConfig.s = this.s;
        requestConfig.t = this.t;
        requestConfig.u = this.u;
        requestConfig.v = this.v;
        if (this.w != null) {
            requestConfig.w = new HashMap(this.w);
        }
        return requestConfig;
    }

    public void isSupportGzip(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3aa944e", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public static String a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d609f84", new Object[]{str});
        }
        LogUtil.record(4, "RequestConfig.splitSubmitMethod", str);
        if (str != null && str.contains("loc:") && str.contains(";")) {
            for (String str2 : str.split(";")) {
                if (str2 != null && !str2.startsWith("loc:")) {
                    LogUtil.record(4, "phonecashiermsp#flybird", "RequestConfig.splitSubmitMethod submit", str2);
                    return str2;
                }
            }
        }
        return str;
    }

    public final void d() {
        IChannelInfo channelInfo;
        String[] actionParams;
        IChannelInfo channelInfo2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab009828", new Object[]{this});
            return;
        }
        this.c = "com.alipay.mobilecashier";
        this.d = "com.alipay.quickpay";
        this.g = "5.7.2";
        this.m = MspNetConstants.Request.DEFAULT_CONTENT_TYPE;
        this.f3711a = c();
        MspInitAssistService sdkInstance = MspInitAssistService.getSdkInstance();
        if (!(sdkInstance == null || (channelInfo2 = sdkInstance.getChannelInfo()) == null)) {
            this.d = channelInfo2.getApiName();
        }
        if (!TextUtils.isEmpty(this.i)) {
            try {
                JSONObject parseObject = JSON.parseObject(this.i);
                if (parseObject.containsKey("namespace")) {
                    setNamespace(parseObject.getString("namespace"));
                }
                if (parseObject.containsKey("apiVersion")) {
                    setApiVersion(parseObject.getString("apiVersion"));
                }
                if (parseObject.containsKey("name")) {
                    String a2 = a(parseObject.getString("name"));
                    if (!TextUtils.isEmpty(a2) && a2.startsWith("js://") && (actionParams = Utils.getActionParams(a2)) != null && actionParams.length > 1) {
                        a2 = actionParams[1];
                    }
                    if (!TextUtils.isEmpty(a2)) {
                        String[] split = a2.split("/");
                        if (split.length > 2) {
                            setType(split[1]);
                            setMethod(split[2]);
                        }
                    }
                }
                if (parseObject.containsKey("apiName")) {
                    String string = parseObject.getString("apiName");
                    if (!(!TextUtils.isEmpty(string) || sdkInstance == null || (channelInfo = sdkInstance.getChannelInfo()) == null)) {
                        string = channelInfo.getApiName();
                    }
                    setApiName(string);
                }
                if (parseObject.containsKey("https")) {
                    z = parseObject.getBooleanValue("https");
                }
                if (parseObject.containsKey("host")) {
                    String string2 = parseObject.getString("host");
                    if (!TextUtils.isEmpty(string2) && string2.startsWith("http")) {
                        setHost(string2);
                    }
                    if (string2 != null && z) {
                        if (!string2.contains("mobilegw") && string2.contains("/pad/pci.htm")) {
                            this.f3711a = RequestChannel.DYNAMIC_HOST;
                        }
                        this.f3711a = RequestChannel.BYTES_SECURITY;
                    }
                }
                if (parseObject.containsKey(MspBaseDefine.ACTION_REQ_PARAM)) {
                    this.l = parseObject.getString(MspBaseDefine.ACTION_REQ_PARAM);
                }
                if (parseObject.containsKey(MspBaseDefine.ACTION_CONTENT_TYPE)) {
                    this.m = parseObject.getString(MspBaseDefine.ACTION_CONTENT_TYPE);
                }
            } catch (JSONException e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
    }

    public RequestConfig() {
        this.f3711a = null;
        this.j = true;
        this.k = "";
        this.o = false;
        this.p = "";
        this.q = 0;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = 0;
        this.v = false;
        d();
        b();
    }

    public RequestConfig(RequestChannel requestChannel) {
        this.f3711a = null;
        this.j = true;
        this.k = "";
        this.o = false;
        this.p = "";
        this.q = 0;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = 0;
        this.v = false;
        d();
        this.f3711a = requestChannel;
        b();
    }

    public RequestConfig(RequestChannel requestChannel, boolean z) {
        this.f3711a = null;
        this.j = true;
        this.k = "";
        this.o = false;
        this.p = "";
        this.q = 0;
        this.r = false;
        this.t = false;
        this.u = 0;
        this.v = false;
        this.s = z;
        d();
        this.f3711a = requestChannel;
        b();
    }
}
