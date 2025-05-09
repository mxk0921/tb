package tb;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.Supplier;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class yhk<T> extends kdk<T> {
    public yhk(Class cls, Supplier<T> supplier, String str, Class[] clsArr, String[] strArr, Class cls2, g79... g79VarArr) {
        super(cls, str, null, JSONReader.Feature.SupportAutoType.mask, supplier, null, clsArr, strArr, cls2, g79VarArr);
    }

    @Override // tb.kdk, tb.ldk, tb.jdk
    public T D(long j) {
        Supplier<T> supplier = this.b;
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01af  */
    @Override // tb.ldk, tb.jdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T o(com.alibaba.fastjson2.JSONReader r26, java.lang.reflect.Type r27, java.lang.Object r28, long r29) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yhk.o(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }
}
