package com.taobao.android.nanocompose.runtime.context;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;
import java.util.Map;
import kotlin.a;
import tb.a07;
import tb.abz;
import tb.ckf;
import tb.drz;
import tb.e7z;
import tb.hrz;
import tb.i2z;
import tb.k2z;
import tb.njg;
import tb.qhz;
import tb.shz;
import tb.t2o;
import tb.v2z;
import tb.v4z;
import tb.waz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class RenderContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final NCBusinessContext f9026a;
    public final Context b;
    public final TemplateItem c;
    public final qhz d;
    public Map<String, ? extends Object> e;
    public abz f;
    public byte[] g;
    public final njg h;

    static {
        t2o.a(598737276);
    }

    public /* synthetic */ RenderContext(NCBusinessContext nCBusinessContext, Context context, TemplateItem templateItem, long j, qhz qhzVar, a07 a07Var) {
        this(nCBusinessContext, context, templateItem, j, qhzVar);
    }

    public final NCBusinessContext a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NCBusinessContext) ipChange.ipc$dispatch("b1db0926", new Object[]{this});
        }
        return this.f9026a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("883dfac8", new Object[]{this});
        }
        return this.f9026a.a();
    }

    public final i2z c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i2z) ipChange.ipc$dispatch("705320e", new Object[]{this, new Integer(i)});
        }
        k2z b = this.f9026a.b();
        if (b == null) {
            return null;
        }
        return b.c(i);
    }

    public final Context d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.b;
    }

    public final Map<String, Object> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f788fc61", new Object[]{this});
        }
        return this.e;
    }

    public final v4z f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v4z) ipChange.ipc$dispatch("f2a78517", new Object[]{this});
        }
        return (v4z) this.h.getValue();
    }

    public final drz g() {
        drz drzVar;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drz) ipChange.ipc$dispatch("e63aa2a4", new Object[]{this});
        }
        if (this.d.d() != null) {
            shz d = this.d.d();
            if (d == null) {
                drzVar = null;
            } else {
                drzVar = drz.a(d.b());
            }
            byte b = drz.b((byte) -1);
            if (drzVar != null) {
                z = drz.d(drzVar.g(), b);
            }
            if (!z) {
                shz d2 = this.d.d();
                if (d2 == null) {
                    return null;
                }
                return drz.a(d2.b());
            }
        }
        return drz.a(this.f9026a.g().b());
    }

    public final byte h() {
        hrz hrzVar;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e95ae0a3", new Object[]{this})).byteValue();
        }
        if (this.d.d() != null) {
            shz d = this.d.d();
            if (d == null) {
                hrzVar = null;
            } else {
                hrzVar = hrz.a(d.c());
            }
            byte b = hrz.b((byte) -1);
            if (hrzVar != null) {
                z = hrz.d(hrzVar.g(), b);
            }
            if (!z) {
                shz d2 = this.d.d();
                ckf.d(d2);
                return d2.c();
            }
        }
        return this.f9026a.g().c();
    }

    public final e7z i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e7z) ipChange.ipc$dispatch("7025dd4f", new Object[]{this});
        }
        return j().getRootFlattenedNode();
    }

    public final abz j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (abz) ipChange.ipc$dispatch("e3e9094", new Object[]{this});
        }
        abz abzVar = this.f;
        if (abzVar != null) {
            return abzVar;
        }
        ckf.y("layoutTreeOwner");
        throw null;
    }

    public final byte[] k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("904f1fb5", new Object[]{this});
        }
        return this.g;
    }

    public final qhz l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qhz) ipChange.ipc$dispatch("52c5d155", new Object[]{this});
        }
        return this.d;
    }

    public final TemplateItem m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateItem) ipChange.ipc$dispatch("f78f02cd", new Object[]{this});
        }
        return this.c;
    }

    public final void n(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454c004d", new Object[]{this, map});
        } else {
            this.e = map;
        }
    }

    public final void o(abz abzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd6e8578", new Object[]{this, abzVar});
            return;
        }
        ckf.g(abzVar, "<set-?>");
        this.f = abzVar;
    }

    public final void p(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da7c5fb", new Object[]{this, bArr});
        } else {
            this.g = bArr;
        }
    }

    public final void q(e7z e7zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec566d2", new Object[]{this, e7zVar});
        } else {
            j().updateRootFlattenedNode(e7zVar);
        }
    }

    public final void r(waz wazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf87bef", new Object[]{this, wazVar});
            return;
        }
        ckf.g(wazVar, "layoutNode");
        j().updateRootLayoutNode(wazVar);
    }

    public RenderContext(NCBusinessContext nCBusinessContext, Context context, TemplateItem templateItem, long j, qhz qhzVar) {
        this.f9026a = nCBusinessContext;
        this.b = context;
        this.c = templateItem;
        this.d = qhzVar;
        this.h = a.b(new RenderContext$density$2(this));
    }

    public /* synthetic */ RenderContext(NCBusinessContext nCBusinessContext, Context context, TemplateItem templateItem, long j, qhz qhzVar, int i, a07 a07Var) {
        this(nCBusinessContext, context, templateItem, (i & 8) != 0 ? v2z.b(0, 0, 0, 0, 15, null) : j, qhzVar, null);
    }
}
