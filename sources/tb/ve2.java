package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.ali.user.open.core.Site;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.util.StackDumpUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import tb.b01;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ve2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f29952a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int MSG_UPLOAD_ANR_INFO = 1;
        public static final int MSG_UPLOAD_ANR_INIT = 0;

        /* renamed from: a  reason: collision with root package name */
        public static final Set<String> f29953a = new HashSet();

        static {
            t2o.a(824180762);
        }

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbuprofen/adapter/anr/BizUploader$BizUploaderHandler");
        }

        public final boolean b(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b9d445c6", new Object[]{this, stackTraceElement, stackTraceElement2})).booleanValue();
            }
            if (stackTraceElement == stackTraceElement2) {
                return true;
            }
            if (stackTraceElement == null || stackTraceElement2 == null || !Objects.equals(stackTraceElement.getClassName(), stackTraceElement2.getClassName()) || !Objects.equals(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) || !Objects.equals(stackTraceElement.getFileName(), stackTraceElement2.getFileName())) {
                return false;
            }
            return true;
        }

        public final String c(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("96b1a3b1", new Object[]{this, th});
            }
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }

        public final void d(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb102122", new Object[]{this, objArr, objArr2, new Integer(i), new Integer(i2), new Integer(i3)});
            } else if (objArr != null && objArr2 != null) {
                if (objArr.length != 0 || objArr2.length != 0) {
                    Throwable th = new Throwable("Message wall duration: " + i + "\nThe Second Dump Point Difference Stack msg wall duration:  afterDumpInterval: " + i3, new Throwable("The First Dump Point Difference Stack(" + i2 + "ms)"));
                    StackTraceElement[] a2 = a(StackDumpUtils.k(objArr), StackDumpUtils.k(objArr2), th);
                    if (a2 != null) {
                        Throwable th2 = new Throwable("Main thread blocked");
                        th2.setStackTrace(a2);
                        HashMap hashMap = new HashMap();
                        hashMap.put(rf2.KEY_BLOCK_STACK, th2);
                        hashMap.put(rf2.KEY_ADDITION, c(th));
                        rf2.c().b(hashMap);
                        urr.c("BizUploader", th2, "Main thread block stack trace", new Object[0]);
                    }
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 0) {
                HashSet hashSet = (HashSet) f29953a;
                hashSet.add(hq9.TMALL);
                hashSet.add(Site.CAINIAO);
                hashSet.add("mtop");
                hashSet.add("com.taobao");
                hashSet.add("com.etao");
                hashSet.add("com.uc.");
                hashSet.add("com.ali");
                hashSet.add("me.ele");
                hashSet.add("com.ut");
                hashSet.add("anet.");
                hashSet.add("anetwork.");
            } else if (i == 1) {
                try {
                    int i2 = message.arg1;
                    b01.a[] aVarArr = (b01.a[]) message.obj;
                    d(aVarArr[0].c(), aVarArr[1].c(), i2, aVarArr[0].a(), aVarArr[1].a());
                } catch (Throwable th) {
                    urr.c("BizUploader", th, "uploadStackTraceToBiz error", new Object[0]);
                }
            }
        }

        public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2, Throwable th) {
            int i;
            int i2 = -1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StackTraceElement[]) ipChange.ipc$dispatch("d4648ff8", new Object[]{this, stackTraceElementArr, stackTraceElementArr2, th});
            }
            if (stackTraceElementArr == null || stackTraceElementArr.length == 0 || stackTraceElementArr2 == null || stackTraceElementArr2.length == 0) {
                th.setStackTrace(new StackTraceElement[0]);
                if (th.getCause() == null) {
                    return null;
                }
                th.getCause().setStackTrace(new StackTraceElement[0]);
                return null;
            }
            int length = stackTraceElementArr.length - 1;
            int i3 = 0;
            for (int length2 = stackTraceElementArr2.length - 1; length >= 0 && length2 >= 0; length2--) {
                StackTraceElement stackTraceElement = stackTraceElementArr[length];
                if (!b(stackTraceElement, stackTraceElementArr2[length2])) {
                    i2 = length + 1;
                    i = length2 + 1;
                    break;
                }
                if (stackTraceElement.getClassName().startsWith("tb.")) {
                    i3 = length;
                    break;
                }
                Iterator it = ((HashSet) f29953a).iterator();
                while (it.hasNext()) {
                    if (stackTraceElement.getClassName().contains((String) it.next())) {
                        i3 = length;
                        break;
                        break;
                    }
                }
                length--;
            }
            i = -1;
            if (i2 < 0 || i2 > stackTraceElementArr.length - 1 || i > stackTraceElementArr2.length - 1) {
                th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTraceElementArr2, 0, i3));
                if (th.getCause() != null) {
                    th.getCause().setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTraceElementArr, 0, i3));
                }
                return (StackTraceElement[]) Arrays.copyOfRange(stackTraceElementArr, i3, stackTraceElementArr.length);
            }
            th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTraceElementArr2, 0, i));
            th.getCause().setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTraceElementArr, 0, i2));
            return (StackTraceElement[]) Arrays.copyOfRange(stackTraceElementArr, i2, stackTraceElementArr.length);
        }
    }

    static {
        t2o.a(824180761);
    }

    public ve2() {
        HandlerThread b = wsa.b("tbp-biz-upload");
        b.start();
        this.f29952a = new a(b.getLooper());
    }

    public void a(b01.a aVar, b01.a aVar2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c980535", new Object[]{this, aVar, aVar2, new Long(j)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = new b01.a[]{aVar, aVar2};
        obtain.arg1 = (int) j;
        this.f29952a.sendMessage(obtain);
    }
}
