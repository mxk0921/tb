package com.alipay.android.msp.framework.statisticsv2;

import android.text.TextUtils;
import com.alipay.android.msp.framework.statisticsv2.model.StBiz;
import com.alipay.android.msp.framework.statisticsv2.model.StError;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.alipay.android.msp.framework.statisticsv2.vector.VectorArrayData;
import com.alipay.android.msp.framework.statisticsv2.vector.VectorData;
import com.alipay.android.msp.pay.results.ResultStatus;
import com.alipay.android.msp.utils.DateUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Recorder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Vector, VectorData> f3662a;
    public final Map<Vector, VectorArrayData> b;

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.framework.statisticsv2.Recorder$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$android$msp$framework$statisticsv2$Vector;

        static {
            int[] iArr = new int[Vector.values().length];
            $SwitchMap$com$alipay$android$msp$framework$statisticsv2$Vector = iArr;
            try {
                iArr[Vector.Time.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$statisticsv2$Vector[Vector.Trade.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$statisticsv2$Vector[Vector.App.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$statisticsv2$Vector[Vector.Sdk.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$statisticsv2$Vector[Vector.Id.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$statisticsv2$Vector[Vector.Device.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$statisticsv2$Vector[Vector.Result.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$statisticsv2$Vector[Vector.Event.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$statisticsv2$Vector[Vector.Error.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$statisticsv2$Vector[Vector.Window.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$statisticsv2$Vector[Vector.Biz.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public Recorder(int i) {
        LogUtil.record(2, "Recorder:init<>", "start");
        HashMap hashMap = new HashMap();
        this.f3662a = hashMap;
        Vector vector = Vector.Time;
        hashMap.put(vector, new VectorData(vector, i));
        Vector vector2 = Vector.Trade;
        hashMap.put(vector2, new VectorData(vector2, i));
        Vector vector3 = Vector.App;
        hashMap.put(vector3, new VectorData(vector3, i));
        Vector vector4 = Vector.Sdk;
        hashMap.put(vector4, new VectorData(vector4, i));
        Vector vector5 = Vector.Id;
        hashMap.put(vector5, new VectorData(vector5, i));
        Vector vector6 = Vector.Device;
        hashMap.put(vector6, new VectorData(vector6, i));
        Vector vector7 = Vector.Result;
        hashMap.put(vector7, new VectorData(vector7, i));
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        Vector vector8 = Vector.Event;
        hashMap2.put(vector8, new VectorArrayData(vector8, i));
        Vector vector9 = Vector.Error;
        hashMap2.put(vector9, new VectorArrayData(vector9, i));
        Vector vector10 = Vector.Window;
        hashMap2.put(vector10, new VectorArrayData(vector10, i));
        Vector vector11 = Vector.Biz;
        hashMap2.put(vector11, new VectorArrayData(vector11, i));
        LogUtil.record(2, "Recorder:init<>", "end");
    }

    public static String b(String str, String str2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("365a75da", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            i = Integer.parseInt(str);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        if (i == ResultStatus.SUCCEEDED.getStatus() || i == ResultStatus.FRONT_CHANNEL_SEL.getStatus()) {
            return String.valueOf(ClientEndCode.SUCCESS);
        }
        if (i == ResultStatus.FAILED.getStatus() || i == ResultStatus.PARAMS_ERROR.getStatus()) {
            return String.valueOf(ClientEndCode.SERVERERROR_COMMON);
        }
        if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, Grammar.ATTR_DEFAULT_VALUE)) {
            return String.valueOf(ClientEndCode.USEREXIT);
        }
        return str2;
    }

    public final void a(Vector vector, String str) {
        VectorData vectorData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1e28bb", new Object[]{this, vector, str});
            return;
        }
        try {
            switch (AnonymousClass1.$SwitchMap$com$alipay$android$msp$framework$statisticsv2$Vector[vector.ordinal()]) {
                case 1:
                    vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.Time);
                    break;
                case 2:
                    vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.Trade);
                    break;
                case 3:
                    vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.App);
                    break;
                case 4:
                    vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.Sdk);
                    break;
                case 5:
                    vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.Id);
                    break;
                case 6:
                    vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.Device);
                    break;
                case 7:
                    vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.Result);
                    break;
                default:
                    vectorData = null;
                    break;
            }
            if (vectorData != null) {
                vectorData.reCheck(str);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public synchronized void addError(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f49d433", new Object[]{this, str, str2, th});
            return;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ((VectorArrayData) ((HashMap) this.b).get(Vector.Error)).add(new StError(str, str2, th, ""));
        }
    }

    public synchronized int addEvent(StEvent stEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6cba92e4", new Object[]{this, stEvent})).intValue();
        }
        return ((VectorArrayData) ((HashMap) this.b).get(Vector.Event)).add(stEvent);
    }

    public synchronized void addExternalError(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ea58b", new Object[]{this, str, str2, str3, str4});
            return;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ((VectorArrayData) ((HashMap) this.b).get(Vector.Error)).add(new StError(str, str2, str3, str4));
        }
    }

    public synchronized int addWindow(StWindow stWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbddffa0", new Object[]{this, stWindow})).intValue();
        }
        return ((VectorArrayData) ((HashMap) this.b).get(Vector.Window)).add(stWindow);
    }

    public synchronized String getAttr(Vector vector, String str) {
        VectorData vectorData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36342cff", new Object[]{this, vector, str});
        }
        String str2 = Grammar.ATTR_DEFAULT_VALUE;
        switch (AnonymousClass1.$SwitchMap$com$alipay$android$msp$framework$statisticsv2$Vector[vector.ordinal()]) {
            case 1:
                vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.Time);
                break;
            case 2:
                vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.Trade);
                break;
            case 3:
                vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.App);
                break;
            case 4:
                vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.Sdk);
                break;
            case 5:
                vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.Id);
                break;
            case 6:
                vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.Device);
                break;
            case 7:
                vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.Result);
                break;
            default:
                vectorData = null;
                break;
        }
        if (vectorData != null) {
            str2 = vectorData.get(str);
        }
        return str2;
    }

    public synchronized void updateAttr(Vector vector, String str, String str2) {
        VectorData vectorData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00571fe", new Object[]{this, vector, str, str2});
            return;
        }
        switch (AnonymousClass1.$SwitchMap$com$alipay$android$msp$framework$statisticsv2$Vector[vector.ordinal()]) {
            case 1:
                vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.Time);
                break;
            case 2:
                vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.Trade);
                break;
            case 3:
                vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.App);
                break;
            case 4:
                vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.Sdk);
                break;
            case 5:
                vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.Id);
                break;
            case 6:
                vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.Device);
                break;
            case 7:
                vectorData = (VectorData) ((HashMap) this.f3662a).get(Vector.Result);
                break;
            default:
                vectorData = null;
                break;
        }
        if (vectorData != null) {
            vectorData.put(str, str2);
        }
    }

    public synchronized void updateBiz(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abe5c54", new Object[]{this, map});
        } else if (map != null) {
            VectorArrayData vectorArrayData = (VectorArrayData) ((HashMap) this.b).get(Vector.Biz);
            for (String str : map.keySet()) {
                vectorArrayData.add(new StBiz(str, map.get(str)));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L_0x005e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void updateResult(java.lang.String r6, java.lang.String r7, long r8) {
        /*
            r5 = this;
            r0 = 2
            monitor-enter(r5)
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.android.msp.framework.statisticsv2.Recorder.$ipChange     // Catch: all -> 0x0022
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: all -> 0x0022
            if (r2 == 0) goto L_0x0024
            java.lang.String r2 = "10e8cc83"
            java.lang.Long r3 = new java.lang.Long     // Catch: all -> 0x0022
            r3.<init>(r8)     // Catch: all -> 0x0022
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: all -> 0x0022
            r9 = 0
            r8[r9] = r5     // Catch: all -> 0x0022
            r9 = 1
            r8[r9] = r6     // Catch: all -> 0x0022
            r8[r0] = r7     // Catch: all -> 0x0022
            r6 = 3
            r8[r6] = r3     // Catch: all -> 0x0022
            r1.ipc$dispatch(r2, r8)     // Catch: all -> 0x0022
            monitor-exit(r5)
            return
        L_0x0022:
            r6 = move-exception
            goto L_0x0098
        L_0x0024:
            java.lang.String r1 = "Recorder#updateResult"
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: all -> 0x0022
            if (r2 == 0) goto L_0x0030
            java.lang.String r2 = "null"
            goto L_0x0031
        L_0x0030:
            r2 = r6
        L_0x0031:
            com.alipay.android.msp.utils.LogUtil.record(r0, r1, r2)     // Catch: all -> 0x0022
            java.util.Map<com.alipay.android.msp.framework.statisticsv2.Vector, com.alipay.android.msp.framework.statisticsv2.vector.VectorData> r1 = r5.f3662a     // Catch: all -> 0x0022
            com.alipay.android.msp.framework.statisticsv2.Vector r2 = com.alipay.android.msp.framework.statisticsv2.Vector.Result     // Catch: all -> 0x0022
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: all -> 0x0022
            java.lang.Object r1 = r1.get(r2)     // Catch: all -> 0x0022
            com.alipay.android.msp.framework.statisticsv2.vector.VectorData r1 = (com.alipay.android.msp.framework.statisticsv2.vector.VectorData) r1     // Catch: all -> 0x0022
            if (r1 != 0) goto L_0x0044
            monitor-exit(r5)
            return
        L_0x0044:
            java.lang.String r2 = ""
            java.lang.String r3 = "Recorder#updateResult"
            java.lang.String r4 = "not use regex"
            com.alipay.android.msp.utils.LogUtil.record(r0, r3, r4)     // Catch: all -> 0x0022
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch: all -> 0x0022
            if (r3 != 0) goto L_0x005e
            java.lang.String r2 = c(r6)     // Catch: all -> 0x0022
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: all -> 0x0022
            if (r3 != 0) goto L_0x005f
        L_0x005e:
            r6 = r2
        L_0x005f:
            java.lang.String r2 = "Recorder#updateResult"
            java.lang.String r3 = "endCode:"
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch: all -> 0x0022
            java.lang.String r3 = r3.concat(r4)     // Catch: all -> 0x0022
            com.alipay.android.msp.utils.LogUtil.record(r0, r2, r3)     // Catch: all -> 0x0022
            java.lang.String r0 = "endCode"
            r1.put(r0, r6)     // Catch: all -> 0x0022
            java.lang.String r0 = "lastPage"
            r1.put(r0, r7)     // Catch: all -> 0x0022
            java.lang.String r7 = "clientEndCode"
            java.lang.String r0 = "clientEndCode"
            java.lang.String r0 = r1.get(r0)     // Catch: all -> 0x0022
            java.lang.String r6 = b(r6, r0)     // Catch: all -> 0x0022
            r1.put(r7, r6)     // Catch: all -> 0x0022
            java.lang.String r6 = "execTime"
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: all -> 0x0022
            long r2 = r2 - r8
            java.lang.String r7 = java.lang.String.valueOf(r2)     // Catch: all -> 0x0022
            r1.put(r6, r7)     // Catch: all -> 0x0022
            monitor-exit(r5)
            return
        L_0x0098:
            monitor-exit(r5)     // Catch: all -> 0x0022
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.statisticsv2.Recorder.updateResult(java.lang.String, java.lang.String, long):void");
    }

    public static String c(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34c1e796", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            for (String str2 : str.split(";")) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith("resultStatus={")) {
                    return str2.substring(14, str2.length() - 1);
                }
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return null;
    }

    public String format() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9662a762", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        try {
            Vector vector = Vector.Id;
            a(vector, "tid");
            a(vector, "userId");
            Vector vector2 = Vector.App;
            a(vector2, "appName");
            a(vector2, "appVersion");
            a(Vector.Sdk, "drmVersion");
            a(Vector.Trade, "bizType");
            sb.append(Grammar.RECORD_START[0]);
            for (Vector vector3 : Vector.getBaseVectorsWithOrder()) {
                sb.append(((VectorData) ((HashMap) this.f3662a).get(vector3)).format());
                sb.append(Grammar.CONTAINER_SEPARATOR[0]);
            }
            for (Vector vector4 : Vector.getArrayVectorsWithOrder()) {
                sb.append(((VectorArrayData) ((HashMap) this.b).get(vector4)).format());
                sb.append(Grammar.CONTAINER_SEPARATOR[0]);
            }
            if (Vector.getBaseVectorsWithOrder().length + Vector.getArrayVectorsWithOrder().length > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(Grammar.RECORD_END[0]);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return sb.toString();
    }

    public synchronized void submit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8423f89f", new Object[]{this});
            return;
        }
        String format = format();
        if (!VectorData.isEmpty((VectorData) ((HashMap) this.f3662a).get(Vector.Result)) || !VectorArrayData.isEmpty((VectorArrayData) ((HashMap) this.b).get(Vector.Event)) || !VectorArrayData.isEmpty((VectorArrayData) ((HashMap) this.b).get(Vector.Error)) || !VectorArrayData.isEmpty((VectorArrayData) ((HashMap) this.b).get(Vector.Window)) || !VectorArrayData.isEmpty((VectorArrayData) ((HashMap) this.b).get(Vector.Biz))) {
            String str = format.substring(0, format.length() - 1) + ",(" + DateUtil.format() + ")]";
            LogUtil.record(4, "phonecashiermsp#log", "StatisticInfo.Recorder.submit", str);
            LoggerFactory.getBehavorLogger().customContent(LogCategory.CATEGORY_ALIPAYSDK, str);
            return;
        }
        LogUtil.record(4, "phonecashiermsp#log", "StatisticInfo.Recorder.submit skip emptyLog", format);
    }

    public synchronized void addError(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4e3624c", new Object[]{this, str, str2, str3});
            return;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ((VectorArrayData) ((HashMap) this.b).get(Vector.Error)).add(new StError(str, str2, str3));
        }
    }
}
