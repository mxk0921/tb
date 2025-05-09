package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Paster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ltl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<Paster> f23557a = new ArrayList();
    public a b = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void a(String str, Paster paster);

        void b(String str, Paster paster);

        void c(Paster paster, Paster paster2);

        void d(String str, Paster paster);

        void e(String str, Paster paster);

        void f(Paster paster);

        void g(Paster paster);

        void h(String str, Paster paster);

        void i(String str, Paster paster);

        void j(String str, Paster paster);

        void k(String str, Paster paster);

        void l(String str, Paster paster);

        void m(String str, Paster paster);

        void n(String str, Paster paster);
    }

    static {
        t2o.a(511705441);
    }

    public ltl() {
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.f23557a.clear();
        }
    }

    public void b(List<Paster> list) {
        Paster paster;
        Paster c;
        Paster paster2;
        Paster paster3;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        List<Paster> list2 = list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b329e0", new Object[]{this, list2});
        } else if (list2 != null) {
            if (list.size() == ((ArrayList) this.f23557a).size()) {
                int size = list.size();
                Paster paster4 = null;
                if (((ArrayList) this.f23557a).size() > 0) {
                    paster = (Paster) ((ArrayList) this.f23557a).get(size - 1);
                } else {
                    paster = null;
                }
                if (list.size() > 0) {
                    paster4 = list2.get(size - 1);
                }
                int i2 = 0;
                while (i2 < size) {
                    Paster paster5 = list2.get(i2);
                    Paster c2 = c(paster5.id);
                    if (c2 != null && TextUtils.equals(paster5.id, c2.id)) {
                        Object obj = c2.extra;
                        if (obj instanceof String) {
                            String str = (String) obj;
                            boolean equals = TextUtils.equals(paster5.resPath, c2.resPath);
                            boolean isSameAs = paster5.transform.isSameAs(c2.transform);
                            if (paster5.startTimeUs == c2.startTimeUs) {
                                z = true;
                            } else {
                                z = false;
                            }
                            i = size;
                            if (paster5.endTimeUs == c2.endTimeUs) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (paster5.outlineColor == c2.outlineColor) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (paster5.shadowColor == c2.shadowColor) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (paster5.textColor == c2.textColor) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            boolean equals2 = TextUtils.equals(paster5.textFontPath, c2.textFontPath);
                            paster3 = paster4;
                            boolean equals3 = TextUtils.equals(paster5.text, c2.text);
                            paster2 = paster;
                            if (paster5.mute == c2.mute) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (!equals || !isSameAs || !z || !z2 || !z5 || !z3 || !z4 || !equals2 || !equals3 || !z6) {
                                ((ArrayList) this.f23557a).remove(c2);
                                ((ArrayList) this.f23557a).add(i2, paster5);
                                this.b.h(str, paster5);
                                if (!equals) {
                                    this.b.k(str, paster5);
                                }
                                if (!isSameAs) {
                                    this.b.b(str, paster5);
                                }
                                if (!z) {
                                    this.b.m(str, paster5);
                                }
                                if (!z2) {
                                    this.b.e(str, paster5);
                                }
                                if (!z5) {
                                    this.b.n(str, paster5);
                                }
                                if (!z3) {
                                    this.b.i(str, paster5);
                                }
                                if (!z4) {
                                    this.b.a(str, paster5);
                                }
                                if (!equals2) {
                                    this.b.d(str, paster5);
                                }
                                if (!equals3) {
                                    this.b.j(str, paster5);
                                }
                                if (!z6) {
                                    this.b.l(str, paster5);
                                }
                            }
                            i2++;
                            list2 = list;
                            size = i;
                            paster4 = paster3;
                            paster = paster2;
                        }
                    }
                    i = size;
                    paster2 = paster;
                    paster3 = paster4;
                    i2++;
                    list2 = list;
                    size = i;
                    paster4 = paster3;
                    paster = paster2;
                }
                if (paster != null && paster4 != null && !paster.equals(paster4) && (c = c(paster4.id)) != null && !paster.isInTemplate && !paster4.isInTemplate) {
                    this.b.c(c, paster4);
                }
                e(list);
            } else if (list.size() > ((ArrayList) this.f23557a).size()) {
                for (Paster paster6 : list) {
                    if (!((ArrayList) this.f23557a).contains(paster6)) {
                        this.b.g(paster6);
                    }
                }
                e(list);
            } else {
                Iterator it = ((ArrayList) this.f23557a).iterator();
                while (it.hasNext()) {
                    Paster paster7 = (Paster) it.next();
                    if (!list.contains(paster7)) {
                        this.b.f(paster7);
                    }
                }
                e(list);
            }
        }
    }

    public final Paster c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paster) ipChange.ipc$dispatch("7a42aa29", new Object[]{this, str});
        }
        List<Paster> list = this.f23557a;
        if (list == null) {
            return null;
        }
        for (Paster paster : list) {
            if (TextUtils.equals(paster.id, str)) {
                return paster;
            }
        }
        return null;
    }

    public void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc5cd5c2", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public void e(List<Paster> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a92ae93", new Object[]{this, list});
            return;
        }
        this.f23557a.clear();
        for (Paster paster : list) {
            this.f23557a.add(paster.clone());
        }
    }

    public ltl(a aVar) {
        d(aVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(511705443);
            t2o.a(511705442);
        }

        @Override // tb.ltl.a
        public void b(String str, Paster paster) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("312577f", new Object[]{this, str, paster});
            }
        }

        @Override // tb.ltl.a
        public void e(String str, Paster paster) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eef306e3", new Object[]{this, str, paster});
            }
        }

        @Override // tb.ltl.a
        public void f(Paster paster) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c003b5c", new Object[]{this, paster});
            }
        }

        @Override // tb.ltl.a
        public void g(Paster paster) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79332cfd", new Object[]{this, paster});
            }
        }

        @Override // tb.ltl.a
        public void h(String str, Paster paster) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa7aa4ad", new Object[]{this, str, paster});
            }
        }

        @Override // tb.ltl.a
        public void j(String str, Paster paster) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc39e5c0", new Object[]{this, str, paster});
            }
        }

        @Override // tb.ltl.a
        public void k(String str, Paster paster) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("546ae10b", new Object[]{this, str, paster});
            }
        }

        @Override // tb.ltl.a
        public void m(String str, Paster paster) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57db27bc", new Object[]{this, str, paster});
            }
        }

        @Override // tb.ltl.a
        public void n(String str, Paster paster) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50bacc75", new Object[]{this, str, paster});
            }
        }

        @Override // tb.ltl.a
        public /* synthetic */ void a(String str, Paster paster) {
        }

        @Override // tb.ltl.a
        public /* synthetic */ void c(Paster paster, Paster paster2) {
        }

        @Override // tb.ltl.a
        public /* synthetic */ void d(String str, Paster paster) {
        }

        @Override // tb.ltl.a
        public /* synthetic */ void i(String str, Paster paster) {
        }

        @Override // tb.ltl.a
        public /* synthetic */ void l(String str, Paster paster) {
        }
    }
}
