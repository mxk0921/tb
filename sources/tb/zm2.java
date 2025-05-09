package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zm2 implements ln2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Logger f32860a = Logger.getLogger(zm2.class.getName());
    public final ArrayList<l3w> b = new ArrayList<>();
    public final ArrayList<n3w> c = new ArrayList<>();
    public final ArrayList<m3w> d = new ArrayList<>();
    public final HashMap<String, ox8> e = new HashMap<>();
    public final ArrayList<ox8> f = new ArrayList<>();
    public final ArrayList<rw8> g = new ArrayList<>();
    public final HashMap<Integer, ArrayList<rw8>> h = new HashMap<>();
    public int i = 0;
    public ArrayList<rw8> j = null;
    public final HashMap<String, ArrayList<rw8>> k = new HashMap<>();
    public final ArrayList<String> l = new ArrayList<>();
    public final ArrayList<ArrayList<rw8>> m = new ArrayList<>();
    public final HashMap<String, j6i> n = new HashMap<>();
    public final HashMap<String, j6i> o = new HashMap<>();
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;

    static {
        t2o.a(297795625);
        t2o.a(297795633);
    }

    public void a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e029a9f3", new Object[]{this, iArr});
            return;
        }
        rw8 rw8Var = new rw8();
        int i = 0;
        while (i < iArr.length) {
            ox8 ox8Var = new ox8();
            int i2 = i + 1;
            int i3 = iArr[i];
            if (i3 < 0) {
                i3 += this.b.size();
            }
            int i4 = i3 - 1;
            if (i4 < 0 || i4 >= this.b.size()) {
                this.f32860a.log(Level.SEVERE, "Index for geometric vertex=" + i3 + " is out of the current range of geometric vertex values 1 to " + this.b.size() + ", ignoring");
            } else {
                ox8Var.f25721a = this.b.get(i4);
            }
            int i5 = i + 2;
            int i6 = iArr[i2];
            if (i6 != Integer.MIN_VALUE) {
                if (i6 < 0) {
                    i6 += this.c.size();
                }
                int i7 = i6 - 1;
                if (i7 < 0 || i7 >= this.c.size()) {
                    this.f32860a.log(Level.SEVERE, "Index for texture vertex=" + i6 + " is out of the current range of texture vertex values 1 to " + this.c.size() + ", ignoring");
                } else {
                    ox8Var.b = this.c.get(i7);
                }
            }
            i += 3;
            int i8 = iArr[i5];
            if (i8 != Integer.MIN_VALUE) {
                if (i8 < 0) {
                    i8 += this.d.size();
                }
                int i9 = i8 - 1;
                if (i9 < 0 || i9 >= this.d.size()) {
                    this.f32860a.log(Level.SEVERE, "Index for vertex normal=" + i8 + " is out of the current range of vertex normal values 1 to " + this.d.size() + ", ignoring");
                } else {
                    ox8Var.c = this.d.get(i9);
                }
            }
            if (ox8Var.f25721a == null) {
                this.f32860a.log(Level.SEVERE, "Can't add vertex to face with missing vertex!  Throwing away face.");
                this.s++;
                return;
            }
            String ox8Var2 = ox8Var.toString();
            ox8 ox8Var3 = this.e.get(ox8Var2);
            if (ox8Var3 == null) {
                this.e.put(ox8Var2, ox8Var);
                this.f.size();
                this.f.add(ox8Var);
            } else {
                ox8Var = ox8Var3;
            }
            rw8Var.a(ox8Var);
        }
        ArrayList<rw8> arrayList = this.j;
        if (arrayList != null) {
            arrayList.add(rw8Var);
        }
        if (this.m.size() > 0) {
            for (int i10 = 0; i10 < this.m.size(); i10++) {
                this.m.get(i10).add(rw8Var);
            }
        }
        this.g.add(rw8Var);
        if (rw8Var.f27646a.size() == 3) {
            this.p++;
        } else if (rw8Var.f27646a.size() == 4) {
            this.q++;
        } else {
            this.r++;
        }
    }

    public void b(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2b2b64a", new Object[]{this, iArr});
            return;
        }
        Logger logger = this.f32860a;
        Level level = Level.INFO;
        logger.log(level, " Got a line of " + iArr.length + " segments in builder, ignoring");
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ffc23c", new Object[]{this, str});
        }
    }

    public void e(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767ad7b9", new Object[]{this, iArr});
            return;
        }
        Logger logger = this.f32860a;
        Level level = Level.INFO;
        logger.log(level, " Got " + iArr.length + " points in builder, ignoring");
    }

    public void f(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef295e3d", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        } else {
            this.b.add(new l3w(f, f2, f3));
        }
    }

    public void g(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974b756d", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        } else {
            this.d.add(new m3w(f, f2, f3));
        }
    }

    public void h(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777835fd", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.c.add(new n3w(f, f2));
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3967531a", new Object[]{this, str});
            return;
        }
        StringBuilder sb = new StringBuilder("Loaded filename '");
        sb.append(str);
        sb.append("' with ");
        sb.append(this.b.size());
        sb.append(" verticesG, ");
        sb.append(this.c.size());
        sb.append(" verticesT, ");
        sb.append(this.d.size());
        sb.append(" verticesN and ");
        sb.append(this.g.size());
        sb.append(" faces, of which ");
        sb.append(this.p);
        sb.append(" triangles, ");
        sb.append(this.q);
        sb.append(" quads, and ");
        sb.append(this.r);
        sb.append(" with more than 4 points, and faces with errors ");
        sb.append(this.s);
    }

    public void j(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5175718", new Object[]{this, strArr});
            return;
        }
        this.l.clear();
        this.m.clear();
        if (strArr != null) {
            for (String str : strArr) {
                String trim = str.trim();
                this.l.add(trim);
                if (this.k.get(trim) == null) {
                    this.k.put(trim, new ArrayList<>());
                }
                this.m.add(this.k.get(trim));
            }
        }
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90eff69a", new Object[]{this, new Integer(i)});
            return;
        }
        this.i = i;
        if (i != 0 && this.h.get(Integer.valueOf(i)) == null) {
            this.j = new ArrayList<>();
            this.h.put(Integer.valueOf(this.i), this.j);
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed3df57d", new Object[]{this, str});
        } else {
            this.o.get(str);
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a2e8fe8", new Object[]{this, str});
        } else {
            this.n.get(str);
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa903ed", new Object[]{this, str});
        }
    }

    public void c(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c64926e", new Object[]{this, strArr});
        } else if (strArr == null) {
            this.f32860a.log(Level.INFO, " ERROR! Got a maplib line with null names array - blank group line? (i.e. \"g\\n\" ?)");
        } else if (strArr.length == 1) {
            Logger logger = this.f32860a;
            Level level = Level.INFO;
            logger.log(level, " Got a maplib line with one name=|" + strArr[0] + "|");
        } else {
            this.f32860a.log(Level.INFO, " Got a maplib line;");
            for (int i = 0; i < strArr.length; i++) {
                Logger logger2 = this.f32860a;
                Level level2 = Level.INFO;
                logger2.log(level2, "        names[" + i + "] = |" + strArr[i] + "|");
            }
        }
    }
}
