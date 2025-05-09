package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y09 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "FastChains";

    /* renamed from: a  reason: collision with root package name */
    public int f31759a = 0;

    static {
        t2o.a(578814077);
    }

    public final int a(String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3e5b223", new Object[]{this, str})).intValue();
        }
        int length = str.length();
        int i2 = 31;
        for (int i3 = 0; i3 < length; i3++) {
            this.f31759a = i3;
            if (i3 > 72) {
                return -1;
            }
            char charAt = str.charAt(i3);
            if (charAt == '?') {
                return i2;
            }
            if (charAt >= 'A' && charAt <= 'Z') {
                i = charAt - 'A';
            } else if (charAt >= 'a' && charAt <= 'z') {
                i = charAt - 'a';
            } else if (charAt == '.') {
                i = 26;
            } else if (charAt == '/') {
                i = 27;
            } else if (charAt == ':') {
                i = 28;
            } else if (charAt == '-') {
                i = 29;
            } else if (charAt == '#') {
                i = 30;
            } else if (charAt < '0' || charAt > '9') {
                return -1;
            } else {
                i = charAt - 17;
            }
            i2 &= x09.REF_MAP[i3][i];
            if (i2 == 0) {
                return -1;
            }
        }
        this.f31759a = length;
        return i2;
    }

    public final xnj b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xnj) ipChange.ipc$dispatch("a35380e3", new Object[]{this, new Integer(i)});
        }
        int c = c(i);
        if (c == -1) {
            return null;
        }
        xnj[] xnjVarArr = x09.PROCESSOR_MAP;
        if (c >= xnjVarArr.length) {
            return null;
        }
        return xnjVarArr[c];
    }

    public final int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("643300b9", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = -1;
        while (i != 0) {
            i2++;
            if ((i & 1) == 1) {
                int[] iArr = x09.PROCESSOR_FILTER_LENGTH_ARRAY;
                if (i2 < iArr.length && iArr[i2] == this.f31759a) {
                    return i2;
                }
            }
            i >>= 1;
        }
        return -1;
    }

    public Intent e(Uri uri, Intent intent, zmj zmjVar) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("d955f67d", new Object[]{this, uri, intent, zmjVar});
        }
        String uri2 = uri.toString();
        if (TextUtils.isEmpty(uri2) || (a2 = a(uri2)) == -1) {
            return null;
        }
        TLog.loge(TAG, "runWithNavContext addr:" + a2);
        xnj b = b(a2);
        if (b == null) {
            return null;
        }
        intent.setData(uri);
        try {
            qoj.b(b.name() + " process");
            b.process(intent, zmjVar);
            zmjVar.A(true, TAG);
            TLog.loge(TAG, "runWithNavContext success " + intent.getDataString());
            return intent;
        } catch (Throwable th) {
            try {
                TLog.loge(TAG, "runWithNavContext error", th);
                return null;
            } finally {
                qoj.a();
            }
        }
    }

    public static Intent d(Uri uri, Intent intent, zmj zmjVar, boolean z, jzm jzmVar) {
        boolean z2 = true;
        z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("65b6897a", new Object[]{uri, intent, zmjVar, new Boolean(z), jzmVar});
        }
        if (!poj.f()) {
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!z) {
            String uri2 = uri.toString();
            if (!uri2.startsWith("TNAVF://") && !uri2.startsWith("tnavf://")) {
                z2 = false;
            }
        }
        if (!z && !z2) {
            return null;
        }
        qoj.b("runFastChain");
        Intent e = new y09().e(uri, intent, zmjVar);
        if (poj.e()) {
            zmjVar.r(null);
        }
        if (!(e == null || jzmVar == null)) {
            jzmVar.e(zmjVar.d(), "fastChains run", SystemClock.uptimeMillis() - uptimeMillis);
        }
        qoj.a();
        return e;
    }
}
