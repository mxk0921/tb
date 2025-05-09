package mtopsdk.mtop.global.init;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import mtopsdk.common.util.TBSdkLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MtopInitTaskFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CUTE_MTOP_INIT_TASK = "qmtopsdk.mtop.global.init.QMtopInitTask";
    private static final String INNER_MTOP_INIT_TASK = "mtopsdk.mtop.global.init.InnerMtopInitTask";
    private static final String OPEN_MTOP_INIT_TASK = "mtopsdk.mtop.global.init.OpenMtopInitTask";
    private static final String PRODUCT_MTOP_INIT_TASK = "mtopsdk.mtop.global.init.ProductMtopInitTask";
    private static final String SSR_TOP_INIT_TASK = "mtopsdk.ssrcore.SsrMtopInitTask";
    private static final String TAG = "mtopsdk.MtopInitTaskFactory";

    static {
        t2o.a(589299930);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r5.equals(mtopsdk.mtop.intf.Mtop.Id.SSR) == false) goto L_0x0027;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static mtopsdk.mtop.global.init.IMtopInitTask getMtopInitTask(java.lang.String r5) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = mtopsdk.mtop.global.init.MtopInitTaskFactory.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "51c7a158"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.Object r5 = r2.ipc$dispatch(r3, r1)
            mtopsdk.mtop.global.init.IMtopInitTask r5 = (mtopsdk.mtop.global.init.IMtopInitTask) r5
            return r5
        L_0x0015:
            if (r5 != 0) goto L_0x0019
            r5 = 0
            return r5
        L_0x0019:
            r5.hashCode()
            java.lang.String r2 = "mtopsdk.mtop.global.init.InnerMtopInitTask"
            r3 = -1
            int r4 = r5.hashCode()
            switch(r4) {
                case 82418: goto L_0x0055;
                case 2080355: goto L_0x004a;
                case 2432586: goto L_0x003f;
                case 69817910: goto L_0x0034;
                case 408508623: goto L_0x0029;
                default: goto L_0x0027;
            }
        L_0x0027:
            r0 = -1
            goto L_0x005e
        L_0x0029:
            java.lang.String r0 = "PRODUCT"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0032
            goto L_0x0027
        L_0x0032:
            r0 = 4
            goto L_0x005e
        L_0x0034:
            java.lang.String r0 = "INNER"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x003d
            goto L_0x0027
        L_0x003d:
            r0 = 3
            goto L_0x005e
        L_0x003f:
            java.lang.String r0 = "OPEN"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0048
            goto L_0x0027
        L_0x0048:
            r0 = 2
            goto L_0x005e
        L_0x004a:
            java.lang.String r0 = "CUTE"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0053
            goto L_0x0027
        L_0x0053:
            r0 = 1
            goto L_0x005e
        L_0x0055:
            java.lang.String r1 = "SSR"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x005e
            goto L_0x0027
        L_0x005e:
            switch(r0) {
                case 0: goto L_0x0083;
                case 1: goto L_0x007b;
                case 2: goto L_0x0073;
                case 3: goto L_0x006e;
                case 4: goto L_0x0066;
                default: goto L_0x0061;
            }
        L_0x0061:
            mtopsdk.mtop.global.init.IMtopInitTask r5 = newInstance(r2)
            goto L_0x008a
        L_0x0066:
            java.lang.String r5 = "mtopsdk.mtop.global.init.ProductMtopInitTask"
            mtopsdk.mtop.global.init.IMtopInitTask r5 = newInstance(r5)
            goto L_0x008a
        L_0x006e:
            mtopsdk.mtop.global.init.IMtopInitTask r5 = newInstance(r2)
            goto L_0x008a
        L_0x0073:
            java.lang.String r5 = "mtopsdk.mtop.global.init.OpenMtopInitTask"
            mtopsdk.mtop.global.init.IMtopInitTask r5 = newInstance(r5)
            goto L_0x008a
        L_0x007b:
            java.lang.String r5 = "qmtopsdk.mtop.global.init.QMtopInitTask"
            mtopsdk.mtop.global.init.IMtopInitTask r5 = newInstance(r5)
            goto L_0x008a
        L_0x0083:
            java.lang.String r5 = "mtopsdk.ssrcore.SsrMtopInitTask"
            mtopsdk.mtop.global.init.IMtopInitTask r5 = newInstance(r5)
        L_0x008a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.mtop.global.init.MtopInitTaskFactory.getMtopInitTask(java.lang.String):mtopsdk.mtop.global.init.IMtopInitTask");
    }

    private static IMtopInitTask newInstance(String str) {
        try {
            Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return (IMtopInitTask) declaredConstructor.newInstance(new Object[0]);
        } catch (Throwable unused) {
            TBSdkLog.e(TAG, "reflect IMtopInitTask instance error.clazzName=" + str);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
        if (r12.equals(mtopsdk.mtop.intf.Mtop.Id.SSR) == false) goto L_0x003e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static mtopsdk.mtop.global.init.IMtopInitTask getMtopInitTask(java.lang.String r12, int r13) {
        /*
            r0 = 4
            r1 = 3
            r2 = 0
            r3 = 1
            r4 = 2
            com.android.alibaba.ip.runtime.IpChange r5 = mtopsdk.mtop.global.init.MtopInitTaskFactory.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x0020
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r13)
            java.lang.Object[] r13 = new java.lang.Object[r4]
            r13[r2] = r12
            r13[r3] = r0
            java.lang.String r12 = "d190b03d"
            java.lang.Object r12 = r5.ipc$dispatch(r12, r13)
            mtopsdk.mtop.global.init.IMtopInitTask r12 = (mtopsdk.mtop.global.init.IMtopInitTask) r12
            return r12
        L_0x0020:
            if (r12 != 0) goto L_0x0024
            r12 = 0
            return r12
        L_0x0024:
            r12.hashCode()
            java.lang.String r5 = "mtopsdk.ssrcore.SsrMtopInitTask"
            java.lang.String r6 = "qmtopsdk.mtop.global.init.QMtopInitTask"
            java.lang.String r7 = "mtopsdk.mtop.global.init.ProductMtopInitTask"
            java.lang.String r8 = "mtopsdk.mtop.global.init.OpenMtopInitTask"
            java.lang.String r9 = "mtopsdk.mtop.global.init.InnerMtopInitTask"
            r10 = -1
            int r11 = r12.hashCode()
            switch(r11) {
                case 82418: goto L_0x006c;
                case 2080355: goto L_0x0061;
                case 2432586: goto L_0x0056;
                case 69817910: goto L_0x004b;
                case 408508623: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            r2 = -1
            goto L_0x0075
        L_0x0040:
            java.lang.String r2 = "PRODUCT"
            boolean r12 = r12.equals(r2)
            if (r12 != 0) goto L_0x0049
            goto L_0x003e
        L_0x0049:
            r2 = 4
            goto L_0x0075
        L_0x004b:
            java.lang.String r2 = "INNER"
            boolean r12 = r12.equals(r2)
            if (r12 != 0) goto L_0x0054
            goto L_0x003e
        L_0x0054:
            r2 = 3
            goto L_0x0075
        L_0x0056:
            java.lang.String r2 = "OPEN"
            boolean r12 = r12.equals(r2)
            if (r12 != 0) goto L_0x005f
            goto L_0x003e
        L_0x005f:
            r2 = 2
            goto L_0x0075
        L_0x0061:
            java.lang.String r2 = "CUTE"
            boolean r12 = r12.equals(r2)
            if (r12 != 0) goto L_0x006a
            goto L_0x003e
        L_0x006a:
            r2 = 1
            goto L_0x0075
        L_0x006c:
            java.lang.String r11 = "SSR"
            boolean r12 = r12.equals(r11)
            if (r12 != 0) goto L_0x0075
            goto L_0x003e
        L_0x0075:
            switch(r2) {
                case 0: goto L_0x00b4;
                case 1: goto L_0x00af;
                case 2: goto L_0x00aa;
                case 3: goto L_0x00a5;
                case 4: goto L_0x00a0;
                default: goto L_0x0078;
            }
        L_0x0078:
            if (r13 != 0) goto L_0x007f
            mtopsdk.mtop.global.init.IMtopInitTask r12 = newInstance(r9)
            return r12
        L_0x007f:
            if (r3 != r13) goto L_0x0086
            mtopsdk.mtop.global.init.IMtopInitTask r12 = newInstance(r8)
            return r12
        L_0x0086:
            if (r4 != r13) goto L_0x008d
            mtopsdk.mtop.global.init.IMtopInitTask r12 = newInstance(r7)
            return r12
        L_0x008d:
            if (r1 != r13) goto L_0x0094
            mtopsdk.mtop.global.init.IMtopInitTask r12 = newInstance(r6)
            return r12
        L_0x0094:
            if (r0 != r13) goto L_0x009b
            mtopsdk.mtop.global.init.IMtopInitTask r12 = newInstance(r5)
            return r12
        L_0x009b:
            mtopsdk.mtop.global.init.IMtopInitTask r12 = newInstance(r9)
            return r12
        L_0x00a0:
            mtopsdk.mtop.global.init.IMtopInitTask r12 = newInstance(r7)
            return r12
        L_0x00a5:
            mtopsdk.mtop.global.init.IMtopInitTask r12 = newInstance(r9)
            return r12
        L_0x00aa:
            mtopsdk.mtop.global.init.IMtopInitTask r12 = newInstance(r8)
            return r12
        L_0x00af:
            mtopsdk.mtop.global.init.IMtopInitTask r12 = newInstance(r6)
            return r12
        L_0x00b4:
            mtopsdk.mtop.global.init.IMtopInitTask r12 = newInstance(r5)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.mtop.global.init.MtopInitTaskFactory.getMtopInitTask(java.lang.String, int):mtopsdk.mtop.global.init.IMtopInitTask");
    }
}
