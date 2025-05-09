package com.alipay.android.msp.framework.statisticsv2;

import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.upx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum Vector {
    Time("traceId", "time"),
    Trade("tradeNo", "outTradeNo", "payerId", "partnerId", "processTime", "bizType", "outTradeType"),
    App("appName", "appVersion", upx.PRODUCT_ID, "extAppInfo", "reserved1"),
    Sdk("sdkPlatform", "sdkType", "sdkVersion", "sdkInnerVersion", "apiName", "apiVersion", "drmVersion", "sequence", "reserved2"),
    Id("tid", "utdid", "userId", "sessionId", "imsiAndImei"),
    Device("country", "os", "osVersion", "model", "root", "simType", "network", "netBizType", "oaid", "location"),
    Result("endCode", "lastPage", "clientEndCode", "execTime"),
    Event(StEvent.CURRENT_VIEW, "actionType", "action", StEvent.PRE_TIME, StEvent.SEND_MSG, StEvent.RECV_MSG, StEvent.NET_COST, StEvent.SERVER_COST, StEvent.SHOW_WIN, StEvent.CONVERT_TIME, StEvent.PARSE_TIME, StEvent.FILL_DATE_TIME, StEvent.SHOW_TIME, StEvent.EVENT_TIME),
    Error("errorType", "errorCode", "errorMsg", "errorTime"),
    Window(StWindow.WIN_NAME, "netType", StWindow.UPDATE_TYPE, "status", StWindow.UPDATE_TIME, StWindow.WINDOW_TIME),
    Biz("key", "value");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Vector[] sArrayVectors;
    private static Vector[] sBaseVectors;
    private String[] attrs;

    static {
        Vector vector = Time;
        Vector vector2 = Trade;
        Vector vector3 = App;
        Vector vector4 = Sdk;
        Vector vector5 = Id;
        Vector vector6 = Device;
        Vector vector7 = Result;
        Vector vector8 = Event;
        Vector vector9 = Error;
        Vector vector10 = Window;
        Vector vector11 = Biz;
        sBaseVectors = new Vector[]{vector, vector2, vector3, vector4, vector5, vector6, vector7};
        sArrayVectors = new Vector[]{vector8, vector9, vector10, vector11};
    }

    Vector(String... strArr) {
        this.attrs = strArr;
    }

    public static Vector[] getArrayVectorsWithOrder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Vector[]) ipChange.ipc$dispatch("2ffca450", new Object[0]);
        }
        return sArrayVectors;
    }

    public static Vector[] getBaseVectorsWithOrder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Vector[]) ipChange.ipc$dispatch("717fddf4", new Object[0]);
        }
        return sBaseVectors;
    }

    public static /* synthetic */ Object ipc$super(Vector vector, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/statisticsv2/Vector");
    }

    public static Vector valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Vector) ipChange.ipc$dispatch("e60f5c6", new Object[]{str});
        }
        return (Vector) Enum.valueOf(Vector.class, str);
    }

    public final String[] getAttrs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("3246b682", new Object[]{this});
        }
        return this.attrs;
    }
}
