package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class i2s extends g19 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Integer e;
    public int f;
    public final boolean d = AdapterForTLog.isValid();
    public int g = -1;

    public static /* synthetic */ Object ipc$super(i2s i2sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/compat/TFormatLog");
    }

    @Override // tb.cw9
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8075dd08", new Object[]{this, new Integer(i)});
        } else {
            this.e = Integer.valueOf(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r2 > 200) goto L_0x003d;
     */
    @Override // tb.cw9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(int r5) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.i2s.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0021
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r5)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r4
            r5[r0] = r3
            java.lang.String r0 = "9a546af9"
            java.lang.Object r5 = r2.ipc$dispatch(r0, r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x0021:
            java.lang.Integer r2 = r4.e
            if (r2 == 0) goto L_0x002e
            int r2 = r2.intValue()
            if (r5 < r2) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            return r0
        L_0x002e:
            boolean r2 = r4.d
            if (r2 == 0) goto L_0x005b
            int r2 = r4.g
            if (r2 < 0) goto L_0x003d
            int r2 = r2 + r0
            r4.g = r2
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 <= r3) goto L_0x0055
        L_0x003d:
            java.lang.String r2 = com.taobao.tlog.adapter.AdapterForTLog.getLogLevel()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x0049
            r2 = 6
            goto L_0x0051
        L_0x0049:
            char r2 = r2.charAt(r1)
            int r2 = r4.f(r2)
        L_0x0051:
            r4.f = r2
            r4.g = r1
        L_0x0055:
            int r2 = r4.f
            if (r5 < r2) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.i2s.b(int):boolean");
    }

    @Override // tb.cw9
    public void c(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea92bab", new Object[]{this, new Integer(i), str, str2});
        } else if (this.d) {
            AdapterForTLog.loge(str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    @Override // tb.cw9
    public void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{this, str, str2, objArr});
        } else if (this.d) {
            AdapterForTLog.logd(str, d(str2, objArr));
        } else {
            d(str2, objArr);
        }
    }

    @Override // tb.cw9
    public void e(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{this, str, str2, objArr});
        } else if (this.d) {
            AdapterForTLog.loge(str, d(str2, objArr));
        } else {
            Log.e(str, d(str2, objArr));
        }
    }

    public final int f(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aaf2e889", new Object[]{this, new Character(c)})).intValue();
        }
        if (c == 'D') {
            return 3;
        }
        if (c == 'I') {
            return 4;
        }
        if (c == 'L') {
            return Integer.MAX_VALUE;
        }
        if (c == 'V') {
            return 2;
        }
        if (c != 'W') {
            return 6;
        }
        return 5;
    }

    @Override // tb.cw9
    public void i(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25eb8f2d", new Object[]{this, str, str2, objArr});
        } else if (this.d) {
            AdapterForTLog.logi(str, d(str2, objArr));
        } else {
            d(str2, objArr);
        }
    }

    @Override // tb.cw9
    public void w(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a20ae5f", new Object[]{this, str, str2, objArr});
        } else if (this.d) {
            AdapterForTLog.logw(str, d(str2, objArr));
        } else {
            d(str2, objArr);
        }
    }
}
