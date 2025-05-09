package tb;

import android.os.HandlerThread;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.adapter.anr.TBAnrConfig;
import com.taobao.android.tbuprofen.util.StackDumpUtils;
import java.util.LinkedList;
import tb.b01;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c01 implements StackDumpUtils.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final h0i c;
    public final TBAnrConfig d;

    /* renamed from: a  reason: collision with root package name */
    public HandlerThread f16749a = null;
    public volatile b01 b = null;
    public long e = -1;

    static {
        t2o.a(824180755);
        t2o.a(822083611);
    }

    public c01(h0i h0iVar, TBAnrConfig tBAnrConfig) {
        this.c = h0iVar;
        this.d = tBAnrConfig;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17cb4f0", new Object[]{this, new Long(j)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1001;
        obtain.obj = Long.valueOf(j);
        if (this.b != null) {
            this.b.sendMessage(obtain);
        }
        boolean z = this.d.dumpNativeStack;
    }

    public void b(LinkedList<b01.a> linkedList, LinkedList<b01.a> linkedList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("927e69f7", new Object[]{this, linkedList, linkedList2});
        } else if (this.b != null) {
            this.b.d(linkedList, linkedList2);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b7fee9d", new Object[]{this});
            return;
        }
        urr.b("TraceDumper", "Stop thread " + this.e + " to dump stack!", new Object[0]);
        if (y74.e()) {
            StackDumpUtils.m(this.e);
        }
        if (this.f16749a != null) {
            if (this.b != null) {
                this.b.removeMessages(0);
            }
            this.f16749a.quitSafely();
            this.b = null;
            this.f16749a = null;
        }
    }

    @Override // com.taobao.android.tbuprofen.util.StackDumpUtils.a
    public void onError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
            return;
        }
        urr.b("TraceDumper", "Receive Dump stack trace error:" + i, new Object[0]);
        d();
        e6r.g(i);
        if (this.d.restartDumpThread) {
            c();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89024afd", new Object[]{this});
        } else if (this.f16749a == null) {
            HandlerThread b = wsa.b("tbp-anr-trace");
            this.f16749a = b;
            b.start();
            this.e = this.f16749a.getThreadId();
            this.b = new b01(this, this.f16749a.getLooper(), this.c, this.d);
            this.b.sendEmptyMessage(1002);
            this.b.sendEmptyMessage(0);
        }
    }
}
