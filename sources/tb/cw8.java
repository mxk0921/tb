package tb;

import android.os.Bundle;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import tb.rrt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cw8 extends com.taobao.monitor.impl.trace.a<a> implements rrt.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void g(int i);

        void l(int i);

        void m(String str, int i, int i2, int i3, int i4, int i5, int i6);
    }

    public cw8() {
        rrt.a().e(this);
    }

    public static /* synthetic */ Object ipc$super(cw8 cw8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/impl/trace/FPSDispatcher");
    }

    @Override // tb.rrt.a
    public void a(int i, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ebbf64", new Object[]{this, new Integer(i), message});
            return;
        }
        switch (i) {
            case 120:
                Bundle data = message.getData();
                if (data != null) {
                    Iterator it = ((ArrayList) this.f11091a).iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).m(data.getString("dataType"), data.getInt("fps"), data.getInt("jankCount"), data.getInt("movieJankCount"), data.getInt("movieBigJankCount"), data.getInt("frozenFrameCount"), data.getInt("slowFrameCount"));
                    }
                    rrt.a().c(data);
                    return;
                }
                return;
            case 121:
                Bundle data2 = message.getData();
                if (data2 != null) {
                    Iterator it2 = ((ArrayList) this.f11091a).iterator();
                    while (it2.hasNext()) {
                        ((a) it2.next()).l(data2.getInt("fps"));
                    }
                    rrt.a().c(data2);
                    return;
                }
                return;
            case 122:
                Bundle data3 = message.getData();
                if (data3 != null) {
                    Iterator it3 = ((ArrayList) this.f11091a).iterator();
                    while (it3.hasNext()) {
                        ((a) it3.next()).g(data3.getInt("scrollHitchRate"));
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // tb.rrt.a
    public int[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("e56de46e", new Object[]{this});
        }
        return new int[]{120, 121, 122};
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e069e7c0", new Object[]{this, new Integer(i)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 121;
        Bundle b = rrt.a().b();
        b.putInt("fps", i);
        obtain.setData(b);
        rrt.a().d(obtain);
    }

    public void f(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d825ceeb", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 120;
        Bundle b = rrt.a().b();
        b.putString("dataType", str);
        b.putInt("fps", i);
        b.putInt("jankCount", i2);
        b.putInt("movieJankCount", i3);
        b.putInt("movieBigJankCount", i4);
        b.putInt("frozenFrameCount", i5);
        b.putInt("slowFrameCount", i6);
        obtain.setData(b);
        rrt.a().d(obtain);
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b93e51", new Object[]{this, new Integer(i)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 122;
        Bundle b = rrt.a().b();
        b.putInt("scrollHitchRate", i);
        obtain.setData(b);
        rrt.a().d(obtain);
    }
}
