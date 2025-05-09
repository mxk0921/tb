package tb;

import androidx.collection.LongSparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class f38 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809060);
    }

    public static void a(DinamicXEngine dinamicXEngine, LongSparseArray<w8> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c3b76b2", new Object[]{dinamicXEngine, longSparseArray});
        } else if (longSparseArray == null || longSparseArray.size() == 0) {
            uqa.b("dxInit", "registerAbilities", "abilities is empty");
        } else {
            for (int i = 0; i < longSparseArray.size(); i++) {
                long keyAt = longSparseArray.keyAt(i);
                dinamicXEngine.J0(keyAt, longSparseArray.get(keyAt));
            }
        }
    }

    public static void b(DinamicXEngine dinamicXEngine, LongSparseArray<evb> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43f11950", new Object[]{dinamicXEngine, longSparseArray});
        } else if (longSparseArray == null || longSparseArray.size() == 0) {
            uqa.b("dxInit", "registerDataParsers", "parsers is empty");
        } else {
            for (int i = 0; i < longSparseArray.size(); i++) {
                long keyAt = longSparseArray.keyAt(i);
                dinamicXEngine.V0(keyAt, longSparseArray.get(keyAt));
            }
        }
    }

    public static void c(DinamicXEngine dinamicXEngine, LongSparseArray<mvb> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a09037", new Object[]{dinamicXEngine, longSparseArray});
        } else if (longSparseArray == null || longSparseArray.size() == 0) {
            uqa.b("dxInit", "registerEventHandlers", "eventHandlers is empty");
        } else {
            for (int i = 0; i < longSparseArray.size(); i++) {
                long keyAt = longSparseArray.keyAt(i);
                dinamicXEngine.W0(keyAt, longSparseArray.get(keyAt));
            }
        }
    }

    public static void d(DinamicXEngine dinamicXEngine, LongSparseArray<qub> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e2ef8d", new Object[]{dinamicXEngine, longSparseArray});
        } else if (longSparseArray == null || longSparseArray.size() == 0) {
            uqa.b("dxInit", "registerWidgetNodes", "widgetNodes is empty");
        } else {
            for (int i = 0; i < longSparseArray.size(); i++) {
                long keyAt = longSparseArray.keyAt(i);
                dinamicXEngine.e1(keyAt, longSparseArray.get(keyAt));
            }
        }
    }
}
