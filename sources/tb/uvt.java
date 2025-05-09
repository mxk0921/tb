package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class uvt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public h0s f29641a = new a(300000, 1000);
    public b b;
    public long c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends h0s {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(long j, long j2) {
            super(j, j2);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/utils/TimerBus$1");
        }

        @Override // tb.h0s
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
                return;
            }
            uvt.b(uvt.this, System.currentTimeMillis());
            if (uvt.d(uvt.this) != null) {
                uvt.d(uvt.this).g();
            }
        }

        @Override // tb.h0s
        public void f(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
                return;
            }
            uvt uvtVar = uvt.this;
            uvt.b(uvtVar, uvt.a(uvtVar) + 1000);
            if (uvt.c(uvt.this) != null) {
                uvt.c(uvt.this).onTick(uvt.a(uvt.this));
            } else if (uvt.d(uvt.this) != null) {
                uvt.d(uvt.this).d();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void onTick(long j);
    }

    static {
        t2o.a(779093376);
    }

    public static /* synthetic */ long a(uvt uvtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a157721", new Object[]{uvtVar})).longValue();
        }
        return uvtVar.c;
    }

    public static /* synthetic */ long b(uvt uvtVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab890069", new Object[]{uvtVar, new Long(j)})).longValue();
        }
        uvtVar.c = j;
        return j;
    }

    public static /* synthetic */ b c(uvt uvtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("21796b29", new Object[]{uvtVar});
        }
        return uvtVar.b;
    }

    public static /* synthetic */ h0s d(uvt uvtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h0s) ipChange.ipc$dispatch("1a4bfe76", new Object[]{uvtVar});
        }
        return uvtVar.f29641a;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7178b853", new Object[]{this});
            return;
        }
        h0s h0sVar = this.f29641a;
        if (h0sVar != null) {
            h0sVar.d();
            this.f29641a = null;
        }
        this.b = null;
    }

    public void f(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ce0451f", new Object[]{this, bVar});
        } else if (bVar != null) {
            h0s h0sVar = this.f29641a;
            if (h0sVar != null && !h0sVar.f) {
                this.c = System.currentTimeMillis();
                this.f29641a.g();
            }
            this.b = bVar;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8b0a", new Object[]{this});
            return;
        }
        h0s h0sVar = this.f29641a;
        if (h0sVar != null) {
            h0sVar.g();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b325b6a", new Object[]{this});
            return;
        }
        h0s h0sVar = this.f29641a;
        if (h0sVar != null) {
            h0sVar.d();
        }
    }
}
