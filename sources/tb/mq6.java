package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mq6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final a f24229a = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements mdd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<mdd> f24230a = new ArrayList<>();

        public static /* synthetic */ void s(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8bd4057", new Object[]{aVar});
            } else {
                aVar.y();
            }
        }

        public static /* synthetic */ void w(a aVar, mdd mddVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("969c6c3d", new Object[]{aVar, mddVar});
            } else {
                aVar.x(mddVar);
            }
        }

        @Override // tb.mdd
        public mdd a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mdd) ipChange.ipc$dispatch("97fa7e26", new Object[]{this, str, obj});
            }
            Iterator<mdd> it = this.f24230a.iterator();
            while (it.hasNext()) {
                it.next().a(str, obj);
            }
            return this;
        }

        @Override // tb.mdd
        public mdd b(String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mdd) ipChange.ipc$dispatch("710326c5", new Object[]{this, str, map});
            }
            Iterator<mdd> it = this.f24230a.iterator();
            while (it.hasNext()) {
                it.next().b(str, map);
            }
            return this;
        }

        @Override // tb.mdd
        public mdd c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mdd) ipChange.ipc$dispatch("73340a13", new Object[]{this});
            }
            throw new UnsupportedOperationException();
        }

        @Override // tb.mdd
        public mdd d(String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mdd) ipChange.ipc$dispatch("d85a89dd", new Object[]{this, str, map});
            }
            Iterator<mdd> it = this.f24230a.iterator();
            while (it.hasNext()) {
                it.next().d(str, map);
            }
            return this;
        }

        @Override // tb.mdd
        public mdd e(String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mdd) ipChange.ipc$dispatch("4c31e53a", new Object[]{this, str, map});
            }
            Iterator<mdd> it = this.f24230a.iterator();
            while (it.hasNext()) {
                it.next().e(str, map);
            }
            return this;
        }

        @Override // tb.mdd
        public mdd end() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mdd) ipChange.ipc$dispatch("7daf1745", new Object[]{this});
            }
            throw new UnsupportedOperationException();
        }

        @Override // tb.mdd
        public mdd g(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mdd) ipChange.ipc$dispatch("b8132913", new Object[]{this, str, new Long(j)});
            }
            Iterator<mdd> it = this.f24230a.iterator();
            while (it.hasNext()) {
                it.next().g(str, j);
            }
            return this;
        }

        @Override // tb.mdd
        public mdd h(String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mdd) ipChange.ipc$dispatch("bdeff6b2", new Object[]{this, str, map});
            }
            Iterator<mdd> it = this.f24230a.iterator();
            while (it.hasNext()) {
                it.next().h(str, map);
            }
            return this;
        }

        @Override // tb.mdd
        public mdd i(String str, long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mdd) ipChange.ipc$dispatch("d3a54738", new Object[]{this, str, new Long(j), new Long(j2)});
            }
            Iterator<mdd> it = this.f24230a.iterator();
            while (it.hasNext()) {
                it.next().i(str, j, j2);
            }
            return this;
        }

        @Override // tb.mdd
        public boolean isAlive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c89930ce", new Object[]{this})).booleanValue();
            }
            throw new UnsupportedOperationException();
        }

        @Override // tb.mdd
        public mdd j(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mdd) ipChange.ipc$dispatch("f8564df8", new Object[]{this, str, new Long(j)});
            }
            Iterator<mdd> it = this.f24230a.iterator();
            while (it.hasNext()) {
                it.next().j(str, j);
            }
            return this;
        }

        @Override // tb.mdd
        public mdd k(String str, long j, String str2, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mdd) ipChange.ipc$dispatch("123baf2f", new Object[]{this, str, new Long(j), str2, map});
            }
            Iterator<mdd> it = this.f24230a.iterator();
            while (it.hasNext()) {
                it.next().k(str, j, str2, map);
            }
            return this;
        }

        @Override // tb.mdd
        public mdd l(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mdd) ipChange.ipc$dispatch("48dfa2fc", new Object[]{this, str, obj});
            }
            Iterator<mdd> it = this.f24230a.iterator();
            while (it.hasNext()) {
                it.next().l(str, obj);
            }
            return this;
        }

        @Override // tb.mdd
        public mdd m(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mdd) ipChange.ipc$dispatch("3de93262", new Object[]{this, str, new Long(j)});
            }
            Iterator<mdd> it = this.f24230a.iterator();
            while (it.hasNext()) {
                it.next().m(str, j);
            }
            return this;
        }

        @Override // tb.mdd
        public mdd n(String str, long j, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mdd) ipChange.ipc$dispatch("d027d992", new Object[]{this, str, new Long(j), map});
            }
            Iterator<mdd> it = this.f24230a.iterator();
            while (it.hasNext()) {
                it.next().n(str, j, map);
            }
            return this;
        }

        @Override // tb.mdd
        public mdd o(String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mdd) ipChange.ipc$dispatch("15eafc4b", new Object[]{this, str, map});
            }
            Iterator<mdd> it = this.f24230a.iterator();
            while (it.hasNext()) {
                it.next().o(str, map);
            }
            return this;
        }

        @Override // tb.mdd
        public mdd p(String str, String str2, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mdd) ipChange.ipc$dispatch("4c7abda9", new Object[]{this, str, str2, map});
            }
            Iterator<mdd> it = this.f24230a.iterator();
            while (it.hasNext()) {
                it.next().p(str, str2, map);
            }
            return this;
        }

        @Override // tb.mdd
        public mdd q(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mdd) ipChange.ipc$dispatch("c494e695", new Object[]{this, new Boolean(z)});
            }
            throw new UnsupportedOperationException();
        }

        @Override // tb.mdd
        public String r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6d369af2", new Object[]{this});
            }
            throw new UnsupportedOperationException();
        }

        @Override // tb.mdd
        public mdd u(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mdd) ipChange.ipc$dispatch("e3faa03f", new Object[]{this, str, obj});
            }
            Iterator<mdd> it = this.f24230a.iterator();
            while (it.hasNext()) {
                it.next().u(str, obj);
            }
            return this;
        }

        @Override // tb.mdd
        public mdd v(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mdd) ipChange.ipc$dispatch("d292def7", new Object[]{this, str});
            }
            Iterator<mdd> it = this.f24230a.iterator();
            while (it.hasNext()) {
                it.next().v(str);
            }
            return this;
        }

        public final void x(mdd mddVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5409f598", new Object[]{this, mddVar});
            } else if (mddVar != null) {
                this.f24230a.add(mddVar);
            }
        }

        public final void y() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            } else {
                this.f24230a.clear();
            }
        }
    }

    public static mdd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("8dcdb80d", new Object[0]);
        }
        a aVar = f24229a;
        a.s(aVar);
        vxm vxmVar = vxm.b;
        a.w(aVar, vxmVar.e());
        a.w(aVar, vxmVar.c());
        a.w(aVar, vxmVar.l());
        return aVar;
    }
}
