package tb;

import anet.channel.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.AssembleMonitor;
import com.taobao.accs.utl.ALog;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ed1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CLIENT_RECEIVE_TIME_KEY = 32;
    public static final int EXT_KEY_BY_PULL = 36;
    public static final int EXT_KEY_ROUTE = 35;
    public static final int EXT_KEY_STREAM = 34;
    public static final int EXT_TAG = 4;
    public static final int SERVER_SEND_TIME_KEY = 33;
    public static final int SPLITTED_DATA_INDEX = 17;
    public static final int SPLITTED_DATA_MD5 = 18;
    public static final int SPLITTED_DATA_NUMS = 16;
    public static final int SPLITTED_TIME_OUT = 15;
    public static final char[] h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a  reason: collision with root package name */
    public final String f18490a;
    public final int b;
    public final String c;
    public long d;
    public ScheduledFuture<?> f;
    public volatile int e = 0;
    public final Map<Integer, byte[]> g = new TreeMap(new a(this));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Comparator<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(ed1 ed1Var) {
        }

        /* renamed from: a */
        public int compare(Integer num, Integer num2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dc099c7f", new Object[]{this, num, num2})).intValue();
            }
            return num.intValue() - num2.intValue();
        }
    }

    static {
        t2o.a(343933079);
    }

    public ed1(String str, int i, String str2) {
        this.f18490a = str;
        this.b = i;
        this.c = str2;
    }

    public static /* synthetic */ int a(ed1 ed1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("995b70ff", new Object[]{ed1Var})).intValue();
        }
        return ed1Var.e;
    }

    public static /* synthetic */ int b(ed1 ed1Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17ebf628", new Object[]{ed1Var, new Integer(i)})).intValue();
        }
        ed1Var.e = i;
        return i;
    }

    public static /* synthetic */ String c(ed1 ed1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6123acb3", new Object[]{ed1Var});
        }
        return ed1Var.f18490a;
    }

    public static /* synthetic */ Map d(ed1 ed1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("456857c3", new Object[]{ed1Var});
        }
        return ed1Var.g;
    }

    public static char[] e(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("cdfe3e4b", new Object[]{bArr});
        }
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = h;
            cArr[i] = cArr2[(b2 & 240) >>> 4];
            i += 2;
            cArr[i2] = cArr2[b2 & 15];
        }
        return cArr;
    }

    public void g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac105bfe", new Object[]{this, new Long(j)});
            return;
        }
        if (j <= 0) {
            j = 30000;
        }
        this.f = brt.h().schedule(new b(), j, TimeUnit.MILLISECONDS);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (ed1.this) {
                try {
                    if (ed1.a(ed1.this) == 0) {
                        ALog.e("AssembleMessage", "timeout", "dataId", ed1.c(ed1.this));
                        ed1.b(ed1.this, 1);
                        ed1.d(ed1.this).clear();
                        AppMonitor.getInstance().commitStat(new AssembleMonitor(ed1.c(ed1.this), String.valueOf(ed1.a(ed1.this))));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0123 A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:16:0x006d, B:18:0x0071, B:20:0x007f, B:21:0x0089, B:25:0x008e, B:27:0x0096, B:28:0x009c, B:30:0x00b3, B:31:0x00c0, B:33:0x00c6, B:36:0x00d0, B:37:0x00e0, B:39:0x00e8, B:41:0x00fd, B:44:0x0123, B:46:0x015a, B:48:0x017d, B:49:0x0180, B:51:0x0182, B:52:0x0199), top: B:58:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017d A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:16:0x006d, B:18:0x0071, B:20:0x007f, B:21:0x0089, B:25:0x008e, B:27:0x0096, B:28:0x009c, B:30:0x00b3, B:31:0x00c0, B:33:0x00c6, B:36:0x00d0, B:37:0x00e0, B:39:0x00e8, B:41:0x00fd, B:44:0x0123, B:46:0x015a, B:48:0x017d, B:49:0x0180, B:51:0x0182, B:52:0x0199), top: B:58:0x006d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] f(int r20, int r21, byte[] r22) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ed1.f(int, int, byte[]):byte[]");
    }
}
