package com.alipay.android.msp.framework.statisticsv2.vector;

import android.text.TextUtils;
import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.collector.AppCollector;
import com.alipay.android.msp.framework.statisticsv2.collector.DeviceCollector;
import com.alipay.android.msp.framework.statisticsv2.collector.IAsyncCollectorCallback;
import com.alipay.android.msp.framework.statisticsv2.collector.IdCollector;
import com.alipay.android.msp.framework.statisticsv2.collector.ResultCollector;
import com.alipay.android.msp.framework.statisticsv2.collector.SdkCollector;
import com.alipay.android.msp.framework.statisticsv2.collector.TimeCollector;
import com.alipay.android.msp.framework.statisticsv2.collector.TradeCollector;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VectorData implements IAsyncCollectorCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f3672a;
    public final Vector b;
    public final Map<String, String> c = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.framework.statisticsv2.vector.VectorData$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class AnonymousClass2 {
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
        }
    }

    public VectorData(Vector vector, int i) {
        this.f3672a = i;
        this.b = vector;
        TaskHelper.executeCursur(new Runnable() { // from class: com.alipay.android.msp.framework.statisticsv2.vector.VectorData.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                String[] attrs;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (String str : VectorData.access$000(VectorData.this).getAttrs()) {
                    if (!TextUtils.isEmpty(str)) {
                        String access$100 = VectorData.access$100(VectorData.this, str);
                        if (!TextUtils.isEmpty(access$100)) {
                            VectorData.access$200(VectorData.this).put(str, access$100);
                        }
                    }
                }
            }
        });
    }

    public static /* synthetic */ Vector access$000(VectorData vectorData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Vector) ipChange.ipc$dispatch("6a39038b", new Object[]{vectorData});
        }
        return vectorData.b;
    }

    public static /* synthetic */ String access$100(VectorData vectorData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f631183", new Object[]{vectorData, str});
        }
        return vectorData.a(str);
    }

    public static /* synthetic */ Map access$200(VectorData vectorData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b9c4f147", new Object[]{vectorData});
        }
        return vectorData.c;
    }

    public static boolean isEmpty(VectorData vectorData) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("628b5965", new Object[]{vectorData})).booleanValue();
        }
        if (vectorData == null || (map = vectorData.c) == null || ((ConcurrentHashMap) map).size() == 0) {
            return true;
        }
        return false;
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f300a3bb", new Object[]{this, str});
        }
        String str2 = Grammar.ATTR_DEFAULT_VALUE;
        try {
            switch (AnonymousClass2.$SwitchMap$com$alipay$android$msp$framework$statisticsv2$Vector[this.b.ordinal()]) {
                case 1:
                    str2 = TimeCollector.collectData(str, this.f3672a);
                    break;
                case 2:
                    str2 = TradeCollector.collectData(str, this.f3672a);
                    break;
                case 3:
                    str2 = AppCollector.collectData(str, this.f3672a);
                    break;
                case 4:
                    str2 = SdkCollector.collectData(str);
                    break;
                case 5:
                    str2 = IdCollector.collectData(str, this.f3672a);
                    break;
                case 6:
                    str2 = DeviceCollector.asyncCollectData(str, this);
                    break;
                case 7:
                    str2 = ResultCollector.collectData(str);
                    break;
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return str2;
    }

    public String format() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9662a762", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Grammar.CONTAINER_START[0]);
        String[] attrs = this.b.getAttrs();
        for (String str : attrs) {
            if (str != null) {
                String filter = Grammar.filter((String) ((ConcurrentHashMap) this.c).get(str));
                if (TextUtils.isEmpty(filter)) {
                    filter = Grammar.ATTR_DEFAULT_VALUE;
                }
                sb.append(filter);
                sb.append(Grammar.FIELD_SEPARATOR[0]);
            }
        }
        if (attrs.length > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(Grammar.CONTAINER_END[0]);
        return sb.toString();
    }

    public String get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6158a19", new Object[]{this, str});
        }
        if (str != null) {
            return (String) ((ConcurrentHashMap) this.c).get(str);
        }
        return "";
    }

    public void put(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fc7a2a", new Object[]{this, str, str2});
        } else if (str != null && str2 != null) {
            ((ConcurrentHashMap) this.c).put(str, str2);
        }
    }

    @Override // com.alipay.android.msp.framework.statisticsv2.collector.IAsyncCollectorCallback
    public void reCheck(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dcbbb66", new Object[]{this, str});
        } else if (str != null) {
            String str2 = (String) ((ConcurrentHashMap) this.c).get(str);
            if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, Grammar.ATTR_DEFAULT_VALUE)) {
                String a2 = a(str);
                LogUtil.record(2, "Vector:reCheck", "atr=" + str + " , newAttrValue=" + a2);
                if (!TextUtils.isEmpty(a2) && !TextUtils.equals(a2, Grammar.ATTR_DEFAULT_VALUE)) {
                    ((ConcurrentHashMap) this.c).put(str, a2);
                }
            }
        }
    }
}
