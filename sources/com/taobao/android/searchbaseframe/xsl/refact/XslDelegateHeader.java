package com.taobao.android.searchbaseframe.xsl.refact;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import com.taobao.android.searchbaseframe.xsl.refact.XslDelegateHeader;
import tb.box;
import tb.ckf;
import tb.ct2;
import tb.g1a;
import tb.lox;
import tb.t2o;
import tb.xhv;
import tb.ytc;
import tb.zwm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class XslDelegateHeader implements ytc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final zwm f9363a = new zwm(ct2.ZCACHE_ERROR_CODE_MAX, 1000);
    public final View b;
    public lox c;

    static {
        t2o.a(993002083);
        t2o.a(993001865);
    }

    public XslDelegateHeader(Activity activity, box boxVar) {
        ckf.g(activity, "activity");
        ckf.g(boxVar, "config");
        this.b = new View(activity);
        boxVar.k1().d(new g1a() { // from class: tb.vtz
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv i;
                i = XslDelegateHeader.i(XslDelegateHeader.this, (lox) obj);
                return i;
            }
        });
    }

    public static final xhv i(XslDelegateHeader xslDelegateHeader, lox loxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("19a21dae", new Object[]{xslDelegateHeader, loxVar});
        }
        ckf.g(xslDelegateHeader, "this$0");
        xslDelegateHeader.c = loxVar;
        return xhv.INSTANCE;
    }

    @Override // tb.kcc
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9c42e6", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.kcc
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2da086e", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.kcc
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86368875", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.kcc
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be8e58d9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.kcc
    public int e(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b8e4ea6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        lox loxVar = this.c;
        if (loxVar != null) {
            return loxVar.consumePageScroll(i);
        }
        return 0;
    }

    @Override // tb.ytc
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af5b5a8a", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.kcc
    public void g(MetaLayout metaLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc7c587", new Object[]{this, metaLayout});
        }
    }

    @Override // tb.ytc
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.kcc
    public zwm getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zwm) ipChange.ipc$dispatch("2e158f9c", new Object[]{this});
        }
        return this.f9363a;
    }

    @Override // tb.ytc
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.ytc
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.ytc
    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f2365a4", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
