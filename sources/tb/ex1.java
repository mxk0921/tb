package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class ex1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean b;
    public static final ThreadLocal<StringBuilder> c;
    public static final ThreadLocal<StringBuilder> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends ThreadLocal<StringBuilder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/atools/BaseLog$1");
        }

        /* renamed from: a */
        public StringBuilder initialValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StringBuilder) ipChange.ipc$dispatch("7693d6af", new Object[]{this});
            }
            return new StringBuilder(32);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends ThreadLocal<StringBuilder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/atools/BaseLog$2");
        }

        /* renamed from: a */
        public StringBuilder initialValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StringBuilder) ipChange.ipc$dispatch("7693d6af", new Object[]{this});
            }
            return new StringBuilder(256);
        }
    }

    static {
        t2o.a(398458887);
        try {
            IpChange ipChange = TLog.$ipChange;
            b = true;
        } catch (Exception unused) {
            b = false;
        }
        c = new a();
        d = new b();
    }

    public final String a(String str, Object... objArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe17598b", new Object[]{this, str, objArr});
        }
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = d.get();
        sb.setLength(0);
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        if (objArr != null) {
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(" ");
                Object obj = objArr[i];
                if (obj == null) {
                    obj = "";
                }
                sb.append(obj);
                sb.append(":");
                Object obj2 = objArr[i2];
                if (obj2 == null) {
                    obj2 = "";
                }
                sb.append(obj2);
                i += 2;
            }
            if (i < objArr.length) {
                sb.append(" ");
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("774883eb", new Object[]{this, str});
        }
        StringBuilder sb = c.get();
        sb.setLength(0);
        sb.append(" ");
        sb.append(f());
        sb.append(" ");
        sb.append(str);
        return sb.toString();
    }

    public void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8711bf03", new Object[]{this, str, str2, objArr});
        } else if (b) {
            AdapterForTLog.logd(b(str), a(str2, objArr));
        } else {
            b(str);
            a(str2, objArr);
        }
    }

    public void d(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3112ae3f", new Object[]{this, str, str2, th, objArr});
        } else if (b) {
            AdapterForTLog.loge(b(str), a(str2, objArr), th);
        } else {
            Log.e(b(str), a(str2, objArr), th);
        }
    }

    public void e(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0b6e2e", new Object[]{this, str, str2, objArr});
        } else if (b) {
            AdapterForTLog.loge(b(str), a(str2, objArr));
        } else {
            Log.e(b(str), a(str2, objArr));
        }
    }

    public abstract String f();
}
