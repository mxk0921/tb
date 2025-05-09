package tb;

import android.os.Message;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g0i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_AGGREGATE_TASK = 1;
    public static final int TYPE_COMMON_TASK = 0;
    public static final int TYPE_IDLE_TASK = 5;
    public static final int TYPE_LARGE_SYS_KEY_TASK = 4;
    public static final int TYPE_LARGE_TASK = 2;
    public static final int TYPE_SYS_KEY_TASK = 3;
    public static final AtomicLong m = new AtomicLong(0);

    /* renamed from: a  reason: collision with root package name */
    public final long f19663a;
    public int b;
    public int c;
    public final long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public String i;
    public int j;
    public Object k;
    public final HashMap<String, Integer> l;

    static {
        t2o.a(824180764);
    }

    public g0i(int i, long j, long j2, long j3, long j4) {
        this.f19663a = m.getAndIncrement();
        this.b = i;
        this.c = 1;
        this.f = j;
        this.g = j2;
        this.d = j3;
        this.e = j4;
        this.h = 0L;
        this.i = null;
        this.j = -1;
        this.k = null;
        this.l = new HashMap<>();
    }

    public static g0i c(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g0i) ipChange.ipc$dispatch("df945c72", new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4)});
        }
        return new g0i(0, j, j2, j3, j4);
    }

    public static g0i d(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g0i) ipChange.ipc$dispatch("db7d64db", new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4)});
        }
        g0i g0iVar = new g0i(5, 0L, j2, j3, j4);
        g0iVar.h = j;
        return g0iVar;
    }

    public static g0i e(int i, Object obj, long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g0i) ipChange.ipc$dispatch("4843a033", new Object[]{new Integer(i), obj, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
        }
        g0i g0iVar = new g0i(2, j, j2, j3, j4);
        if (i == 1) {
            Message message = (Message) obj;
            g0iVar.j = message.what;
            if (message.getTarget() != null) {
                g0iVar.i = message.getTarget().getClass().getName();
            }
            if (message.getCallback() != null) {
                g0iVar.i += " " + message.getCallback().getClass().getName();
            }
        } else if (i == 2) {
            g0iVar.i = ((MessageQueue.IdleHandler) obj).getClass().getName();
        } else if (i == 3) {
            j((String) obj, g0iVar);
        }
        return g0iVar;
    }

    public static g0i f(Message message, long j, long j2, boolean z, long j3, long j4) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g0i) ipChange.ipc$dispatch("fc4926b8", new Object[]{message, new Long(j), new Long(j2), new Boolean(z), new Long(j3), new Long(j4)});
        }
        if (z) {
            i = 4;
        } else {
            i = 3;
        }
        g0i g0iVar = new g0i(i, j, j2, j3, j4);
        int i2 = message.what;
        g0iVar.j = i2;
        g0iVar.i = "ActivityThread$H";
        if (i2 == 0) {
            g0iVar.i += " " + message.getCallback().getClass().getName();
        }
        g0iVar.k = message.obj;
        return g0iVar;
    }

    public static g0i g(String str, long j, long j2, boolean z, long j3, long j4) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g0i) ipChange.ipc$dispatch("7f7837a1", new Object[]{str, new Long(j), new Long(j2), new Boolean(z), new Long(j3), new Long(j4)});
        }
        if (z) {
            i = 4;
        } else {
            i = 3;
        }
        g0i g0iVar = new g0i(i, j, j2, j3, j4);
        j(str, g0iVar);
        return g0iVar;
    }

    public static void j(String str, g0i g0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37320750", new Object[]{str, g0iVar});
        } else if (str != null) {
            String[] split = str.split(": ");
            if (split.length >= 2) {
                String str2 = split[0];
                g0iVar.i = str2.substring(21, str2.length() - 1);
                g0iVar.j = Integer.parseInt(split[1]);
                g0iVar.k = null;
            }
        }
    }

    public void a(long j, long j2, long j3, long j4, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51eaaaf5", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4), str});
            return;
        }
        this.c++;
        this.f += j;
        this.g += j2;
        this.h += j4;
        this.e = j3;
        if (this.b != 1) {
            this.b = 1;
        }
        if (!TextUtils.isEmpty(str)) {
            Integer num = this.l.get(str);
            if (num == null) {
                num = 0;
            }
            this.l.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebb6cda", new Object[]{this})).booleanValue();
        }
        int i = this.b;
        if (i == 1 || i == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof g0i)) {
            return false;
        }
        g0i g0iVar = (g0i) obj;
        if (g0iVar.f19663a == this.f19663a && g0iVar.d == this.d && g0iVar.b == this.b && g0iVar.j == this.j && Objects.equals(g0iVar.i, this.i)) {
            return true;
        }
        return false;
    }

    public long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7fec4ec", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396597", new Object[]{this})).longValue();
        }
        return this.f19663a;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        int i = this.b;
        if (i == 0) {
            return "COMMON";
        }
        if (i == 1) {
            return "AGGREGATE";
        }
        if (i == 2) {
            return "*LARGE";
        }
        if (i == 3) {
            return "SYSTEM";
        }
        if (i == 4) {
            return "*LARGE SYS";
        }
        if (i != 5) {
            return "";
        }
        return Configuration.IDLE;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%10s:[%d][%s-%s] ==> Cpu:%d, ", k(), Long.valueOf(this.f19663a), y74.h(this.d), y74.h(this.e), Long.valueOf(this.g)));
        if (this.b == 5) {
            sb.append("Idle:");
            sb.append(this.h);
        } else {
            sb.append("Execute:");
            sb.append(this.f);
            int i = this.b;
            if (i == 1) {
                sb.append(", Count:");
                sb.append(this.c);
                sb.append(", TotalIdle:");
                sb.append(this.h);
                HashMap<String, Integer> hashMap = this.l;
                if (hashMap != null && !hashMap.isEmpty()) {
                    sb.append("\n MessageInfo:");
                    for (Map.Entry<String, Integer> entry : this.l.entrySet()) {
                        sb.append("\n");
                        sb.append(entry.getKey());
                        sb.append(":");
                        sb.append(entry.getValue());
                    }
                }
            } else if (i == 2 || i == 3 || i == 4) {
                sb.append(" (");
                if (this.j != -1) {
                    sb.append(" what:");
                    sb.append(this.j);
                }
                if (this.i != null) {
                    sb.append(" target:");
                    sb.append(this.i);
                }
                Object obj = this.k;
                if (!(obj == null || this.b == 2)) {
                    String d = pri.d(obj, this.j);
                    if (!TextUtils.isEmpty(d)) {
                        sb.append(" obj:");
                        sb.append(d);
                    }
                }
                sb.append(" )");
            }
        }
        return sb.toString();
    }

    public g0i(g0i g0iVar) {
        this.f19663a = g0iVar.f19663a;
        this.b = g0iVar.b;
        this.c = g0iVar.c;
        this.f = g0iVar.f;
        this.g = g0iVar.g;
        this.d = g0iVar.d;
        this.e = g0iVar.e;
        this.h = g0iVar.h;
        this.i = g0iVar.i;
        this.j = g0iVar.j;
        this.k = g0iVar.k;
        this.l = g0iVar.l;
    }
}
