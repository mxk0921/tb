package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.managers.pull.PullMsgListener;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class w4n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAG_PUSH = 1;
    public static final int FLAG_RESET = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f30452a;
    public final String b;
    public final String c;
    public int e;
    public long f;
    public sxx n;
    public lkd o;
    public int d = 1;
    public Long g = -1L;
    public int h = 0;
    public int i = 0;
    public final AtomicInteger j = new AtomicInteger(0);
    public final AtomicInteger k = new AtomicInteger(0);
    public final AtomicInteger l = new AtomicInteger(0);
    public final AtomicInteger m = new AtomicInteger(0);

    static {
        t2o.a(628097283);
    }

    public w4n(int i, String str, String str2, int i2, int i3) {
        this.b = "";
        this.c = "";
        this.f30452a = i;
        this.b = str;
        this.c = TextUtils.isEmpty(str2) ? "" : str2;
        c(i2, i3);
        this.o = new PullMsgListener(this);
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a18266", new Object[]{str, str2});
        }
        return str + "b:" + iyv.j(str2);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36db62d7", new Object[]{this})).booleanValue();
        }
        if (this.l.get() == 1) {
            return true;
        }
        return false;
    }

    public int c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8432a0d6", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        this.d = i;
        this.e = i2;
        return i;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.j.set(0);
        MsgLog.e(b5n.TAG, "stopPullMsgInterval >", this.b, this.c, "type", Integer.valueOf(this.d));
        this.k.set(0);
        this.l.set(1);
        this.m.set(0);
        this.o = null;
    }
}
