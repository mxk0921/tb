package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lcl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ID_ORDER_DELIVER = 2;
    public static final int ID_ORDER_PAY = 1;
    public static final int ID_ORDER_RATE = 4;
    public static final int ID_ORDER_RECEIVE = 3;
    public static final int ID_ORDER_REFUND = 5;
    public static final String KEY_ORDER_DELIVER = "order2Deliver";
    public static final String KEY_ORDER_PAY = "order2Pay";
    public static final String KEY_ORDER_RATE = "order2Rate";
    public static final String KEY_ORDER_RECEIVE = "order2Receive";
    public static final String KEY_ORDER_REFUND = "order2Refund";

    /* renamed from: a  reason: collision with root package name */
    public final int f23258a;
    public final String b;

    static {
        t2o.a(745537738);
    }

    public lcl(int i, String str) {
        this.f23258a = i;
        this.b = str;
    }

    public static ArrayList<lcl> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d19080b8", new Object[0]);
        }
        ArrayList<lcl> arrayList = new ArrayList<>();
        arrayList.add(new lcl(1, KEY_ORDER_PAY));
        arrayList.add(new lcl(2, KEY_ORDER_DELIVER));
        arrayList.add(new lcl(3, KEY_ORDER_RECEIVE));
        arrayList.add(new lcl(4, KEY_ORDER_RATE));
        arrayList.add(new lcl(5, KEY_ORDER_REFUND));
        return arrayList;
    }
}
