package tb;

import com.alibaba.security.realidentity.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zql {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MTL_REFL_TYPE_CUBE_BACK = "cube_back";
    public static final String MTL_REFL_TYPE_CUBE_BOTTOM = "cube_bottom";
    public static final String MTL_REFL_TYPE_CUBE_FRONT = "cube_front";
    public static final String MTL_REFL_TYPE_CUBE_LEFT = "cube_left";
    public static final String MTL_REFL_TYPE_CUBE_RIGHT = "cube_right";
    public static final String MTL_REFL_TYPE_CUBE_TOP = "cube_top";
    public static final String MTL_REFL_TYPE_SPHERE = "sphere";

    /* renamed from: a  reason: collision with root package name */
    public final Logger f32949a = Logger.getLogger(zql.class.getName());
    public final ln2 b;

    static {
        t2o.a(297795634);
    }

    public zql(ln2 ln2Var, String str, BufferedReader bufferedReader) throws IOException {
        this.b = ln2Var;
        zm2 zm2Var = (zm2) ln2Var;
        zm2Var.n(str);
        a(bufferedReader);
        zm2Var.i(str);
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2abafd", new Object[]{this, str});
        } else {
            ((zm2) this.b).a(srq.c(str.substring(1).trim(), 3));
        }
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aed984c", new Object[]{this, str});
        } else {
            ((zm2) this.b).j(srq.e(str.substring(1).trim()));
        }
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ad63954", new Object[]{this, str});
        } else {
            ((zm2) this.b).b(srq.c(str.substring(1).trim(), 2));
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf57b69", new Object[]{this, str});
        } else {
            ((zm2) this.b).c(srq.e(str.substring(6).trim()));
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1750b00a", new Object[]{this, str});
        } else {
            ((zm2) this.b).d(str.substring(1).trim());
        }
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98324032", new Object[]{this, str});
        } else {
            ((zm2) this.b).e(srq.c(str.substring(1).trim(), 1));
        }
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b48935", new Object[]{this, str});
        } else {
            ((zm2) this.b).l(str.substring(6).trim());
        }
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d78f30", new Object[]{this, str});
        } else {
            ((zm2) this.b).m(str.substring(6).trim());
        }
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d50e9f44", new Object[]{this, str});
            return;
        }
        float[] a2 = srq.a(3, str, 1);
        ((zm2) this.b).f(a2[0], a2[1], a2[2]);
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da126cb", new Object[]{this, str});
            return;
        }
        float[] a2 = srq.a(3, str, 2);
        ((zm2) this.b).g(a2[0], a2[1], a2[2]);
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec06539", new Object[]{this, str});
            return;
        }
        float[] a2 = srq.a(2, str, 2);
        ((zm2) this.b).h(a2[0], a2[1]);
    }

    public final void a(BufferedReader bufferedReader) throws IOException {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("495bbd58", new Object[]{this, bufferedReader});
            return;
        }
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                Logger logger = this.f32949a;
                Level level = Level.INFO;
                logger.log(level, "Loaded " + i + " lines");
                return;
            }
            String trim = readLine.trim();
            if (trim.length() != 0 && !trim.startsWith("#")) {
                if (trim.startsWith("vt")) {
                    m(trim);
                } else if (trim.startsWith("vn")) {
                    l(trim);
                } else if (trim.startsWith("v")) {
                    k(trim);
                } else if (trim.startsWith("f")) {
                    b(trim);
                } else if (trim.startsWith(at.f)) {
                    c(trim);
                } else if (trim.startsWith(o.b)) {
                    f(trim);
                } else if (trim.startsWith("s")) {
                    h(trim);
                } else if (trim.startsWith("p")) {
                    g(trim);
                } else if (trim.startsWith("l")) {
                    d(trim);
                } else if (trim.startsWith("maplib")) {
                    e(trim);
                } else if (trim.startsWith("usemap")) {
                    i(trim);
                } else if (trim.startsWith("usemtl")) {
                    j(trim);
                } else if (!trim.startsWith("mtllib")) {
                    Logger logger2 = this.f32949a;
                    Level level2 = Level.WARNING;
                    logger2.log(level2, "line " + i + " unknown line |" + trim + "|");
                }
                i++;
            }
        }
    }

    public final void h(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49dbc2cb", new Object[]{this, str});
            return;
        }
        String trim = str.substring(1).trim();
        if (!trim.equalsIgnoreCase("off")) {
            i = Integer.parseInt(trim);
        }
        ((zm2) this.b).k(i);
    }
}
