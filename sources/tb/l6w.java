package tb;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.NetConfig;
import java.util.LinkedList;
import tb.k6w;
import tb.kvn;
import tb.xbw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class l6w extends yx<j6w, k6w> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public xbw b;
    public kvn c;
    public int d;

    static {
        t2o.a(482344991);
    }

    public l6w(NetConfig netConfig) {
        super(netConfig);
    }

    public static /* synthetic */ Object ipc$super(l6w l6wVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/festival/VideoDetectRunUnit");
    }

    @Override // tb.vio
    public boolean build() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac6c63f9", new Object[]{this})).booleanValue();
        }
        kvn kvnVar = new kvn(lg4.Q3());
        this.c = kvnVar;
        kvnVar.q();
        xbw xbwVar = new xbw(new wbw());
        this.b = xbwVar;
        xbwVar.q();
        if (!this.c.f() || !this.b.f()) {
            return false;
        }
        return true;
    }

    public final k6w c(j6w j6wVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k6w) ipChange.ipc$dispatch("87fa4636", new Object[]{this, j6wVar});
        }
        kvn kvnVar = this.c;
        k6w k6wVar = null;
        if (kvnVar != null) {
            kvn.c u = kvnVar.u(j6wVar.a());
            if (u == null) {
                return null;
            }
            if (u.a() != null && !u.a().isEmpty()) {
                k6wVar = new k6w(j6wVar.b());
                for (RectF rectF : u.a()) {
                    k6wVar.a(Bitmap.createBitmap(j6wVar.a(), (int) (rectF.left * j6wVar.a().getWidth()), (int) (rectF.top * j6wVar.a().getHeight()), (int) (rectF.width() * j6wVar.a().getWidth()), (int) (rectF.height() * j6wVar.a().getHeight())), rectF, u.b.get(i).floatValue());
                    i++;
                }
            }
        }
        return k6wVar;
    }

    /* renamed from: d */
    public k6w a(j6w j6wVar, Object obj) {
        int p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k6w) ipChange.ipc$dispatch("f88806eb", new Object[]{this, j6wVar, obj});
        }
        if (j6wVar.c()) {
            xbw xbwVar = this.b;
            if (xbwVar == null || (p = xbwVar.p()) < 0) {
                return null;
            }
            k6w k6wVar = new k6w(0);
            k6wVar.h(p);
            return k6wVar;
        } else if (this.b != null) {
            k6w c = c(j6wVar);
            this.b.n();
            if (c == null) {
                return null;
            }
            if (c.c().isEmpty()) {
                return c;
            }
            LinkedList linkedList = new LinkedList();
            for (k6w.a aVar : c.c()) {
                int i = this.d + 1;
                this.d = i;
                aVar.c = i;
                xbw.b s = this.b.s(aVar.f22439a, i, aVar.b, aVar.d);
                if (s != null) {
                    if (!s.f31290a) {
                        linkedList.add(aVar);
                    } else if (s.b) {
                        c.b(s.c, aVar.c, aVar.b);
                    }
                }
            }
            c.g(linkedList);
            return c;
        }
        return null;
    }

    @Override // tb.vio
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        xbw xbwVar = this.b;
        if (xbwVar != null) {
            xbwVar.j();
            this.b = null;
        }
        kvn kvnVar = this.c;
        if (kvnVar != null) {
            kvnVar.j();
            this.c = null;
        }
    }
}
