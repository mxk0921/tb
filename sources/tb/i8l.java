package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.aranger.exception.IPCException;
import com.taobao.orange.model.NameSpaceDO;
import com.taobao.orange.util.OLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i8l extends AccsAbstractDataListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public long f21158a = 0;
        public long b = 0;
        public long c = 0;
        public long d = 0;

        static {
            t2o.a(613417028);
        }

        public b(i8l i8lVar) {
        }
    }

    static {
        t2o.a(613417026);
    }

    public static /* synthetic */ String d(i8l i8lVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93604a03", new Object[]{i8lVar, str});
        }
        return i8lVar.e(str);
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        try {
            ACCSClient.getAccsClient().registerDataListener("orange-dc", new i8l());
        } catch (Throwable th) {
            OLog.e("OrangeAccsListener", "register", th, new Object[0]);
        }
    }

    public static /* synthetic */ Object ipc$super(i8l i8lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/accssupport/OrangeAccsCriticalListener");
    }

    public final String e(String str) {
        int indexOf;
        int indexOf2;
        int i;
        int indexOf3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("915cde99", new Object[]{this, str});
        }
        if (str == null || (indexOf = str.indexOf("\"type\":")) == -1 || (indexOf2 = str.indexOf(34, indexOf + 7)) == -1 || (indexOf3 = str.indexOf(34, (i = indexOf2 + 1))) == -1) {
            return null;
        }
        String substring = str.substring(i, indexOf3);
        if (NameSpaceDO.TYPE_STANDARD.equals(substring) || "CUSTOM".equals(substring)) {
            return substring;
        }
        return null;
    }

    public final void f(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f229c129", new Object[]{this, str, bArr});
            return;
        }
        b bVar = new b(this);
        bVar.f21158a = System.currentTimeMillis();
        fck.c(new a(bArr, bVar, str));
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f21157a;
        public final /* synthetic */ b b;
        public final /* synthetic */ String c;

        public a(byte[] bArr, b bVar, String str) {
            this.f21157a = bArr;
            this.b = bVar;
            this.c = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x007f A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:10:0x0020, B:13:0x003a, B:16:0x0045, B:18:0x004d, B:20:0x0057, B:22:0x005f, B:23:0x0068, B:24:0x0075, B:26:0x007f, B:28:0x009c), top: B:36:0x0020 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 241
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.i8l.a.run():void");
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
        } else if ("orange-dc".equals(str)) {
            OLog.i("OrangeAccsListener", "onData", "dataId", str3, "userId", str2);
            f(str3, bArr);
        }
    }
}
