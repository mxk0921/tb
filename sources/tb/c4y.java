package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kyx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c4y extends xtx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final kyx d;

    public c4y(com.uploader.implement.a aVar, s7y s7yVar) {
        super(aVar, s7yVar);
        kyx kyxVar = new kyx(aVar, s7yVar);
        this.d = kyxVar;
        kyxVar.e(new a(this));
    }

    public static /* synthetic */ Object ipc$super(c4y c4yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/uploader/implement/b/a/d");
    }

    @Override // tb.j5y
    public void a(g6y g6yVar, int i) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432943c6", new Object[]{this, g6yVar, new Integer(i)});
            return;
        }
        int i2 = g6yVar.d;
        int i3 = g6yVar.c;
        if (i3 != 0) {
            bArr = new byte[i2];
            System.arraycopy(g6yVar.b, i3, bArr, 0, i2);
        } else {
            bArr = g6yVar.b;
        }
        lxx e = e();
        if (e != null) {
            e.c(this, i);
        }
        this.d.d(i, bArr, i2);
    }

    @Override // tb.j5y
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (rtx.d(2)) {
            rtx.a(2, "LongLivedConnection", this.c + " connectAsync");
        }
        this.d.b();
        return true;
    }

    @Override // tb.j5y
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (rtx.d(2)) {
            rtx.a(2, "LongLivedConnection", this.c + " closeAsync");
        }
        this.d.h();
        return true;
    }

    @Override // tb.j5y
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return this.d.i();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements kyx.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<c4y> f16863a;

        public a(c4y c4yVar) {
            this.f16863a = new WeakReference<>(c4yVar);
        }

        @Override // tb.kyx.c
        public void a(int i) {
            lxx e;
            ytx ytxVar;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            c4y c4yVar = this.f16863a.get();
            if (c4yVar != null && (e = c4yVar.e()) != null) {
                if (i == -2032) {
                    String num = Integer.toString(i);
                    ytxVar = new ytx("300", num, z9u.ARG_TAOKE_ERROR + i, true);
                } else {
                    if (i == -2601 || i == -2613 || i == -2413) {
                        str = "-1";
                    } else {
                        str = Integer.toString(i);
                    }
                    ytxVar = new ytx("100", str, z9u.ARG_TAOKE_ERROR + i, true);
                }
                e.a(c4yVar, ytxVar);
            }
        }

        @Override // tb.kyx.c
        public void b(int i) {
            lxx e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                return;
            }
            c4y c4yVar = this.f16863a.get();
            if (c4yVar != null && (e = c4yVar.e()) != null) {
                e.d(c4yVar, i);
            }
        }

        @Override // tb.kyx.c
        public void a() {
            lxx e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            c4y c4yVar = this.f16863a.get();
            if (c4yVar != null && (e = c4yVar.e()) != null) {
                e.h(c4yVar);
            }
        }

        @Override // tb.kyx.c
        public void a(int i, int i2) {
            lxx e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            c4y c4yVar = this.f16863a.get();
            if (c4yVar != null && (e = c4yVar.e()) != null) {
                String num = Integer.toString(i2);
                e.a(c4yVar, new ytx("100", num, "onSendFailed" + i2, false));
            }
        }

        @Override // tb.kyx.c
        public void a(byte[] bArr, int i) {
            lxx e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2713f1b4", new Object[]{this, bArr, new Integer(i)});
                return;
            }
            c4y c4yVar = this.f16863a.get();
            if (c4yVar != null && (e = c4yVar.e()) != null) {
                g6y g6yVar = new g6y();
                g6yVar.b = bArr;
                g6yVar.c = 0;
                g6yVar.d = i;
                e.f(c4yVar, g6yVar);
            }
        }
    }
}
