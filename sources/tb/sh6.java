package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.db.DXDataBaseHelper;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sh6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile DXDataBaseHelper f28049a;
    public String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final sh6 f28050a = new sh6();

        static {
            t2o.a(444596959);
        }

        public static /* synthetic */ sh6 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sh6) ipChange.ipc$dispatch("cb2ff12f", new Object[0]);
            }
            return f28050a;
        }
    }

    static {
        t2o.a(444596957);
    }

    public static sh6 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sh6) ipChange.ipc$dispatch("4b3bbff4", new Object[0]);
        }
        return b.a();
    }

    public void a(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e4dd672", new Object[]{this, str, dXTemplateItem});
            return;
        }
        long nanoTime = System.nanoTime();
        if (h()) {
            this.f28049a.delete(str, dXTemplateItem);
        }
        j("DB_Delete", str, dXTemplateItem, System.nanoTime() - nanoTime);
    }

    public boolean b(String str, List<DXTemplateItem> list) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fb170c1", new Object[]{this, str, list})).booleanValue();
        }
        long nanoTime = System.nanoTime();
        if (h()) {
            z = this.f28049a.delete(str, list);
        }
        j("DB_Delete", str, null, System.nanoTime() - nanoTime);
        return z;
    }

    public synchronized void d(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72712a5", new Object[]{this, context, str, str2});
            return;
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            this.b = str2;
            if (this.f28049a == null) {
                this.f28049a = new DXDataBaseHelper(context, str, str2);
            }
        }
    }

    public void e(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2c0eb80", new Object[]{this, str, dXTemplateItem});
            return;
        }
        long nanoTime = System.nanoTime();
        if (h()) {
            this.f28049a.store(str, dXTemplateItem);
        }
        j("DB_Store", str, dXTemplateItem, System.nanoTime() - nanoTime);
    }

    public LinkedList<DXTemplateItem> f(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("784d65c3", new Object[]{this, str, dXTemplateItem});
        }
        long nanoTime = System.nanoTime();
        if (h()) {
            return this.f28049a.query(str, dXTemplateItem);
        }
        j("DB_Query", str, dXTemplateItem, System.nanoTime() - nanoTime);
        return null;
    }

    public LinkedList<DXTemplateItem> g(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("28ddfffa", new Object[]{this, str, dXTemplateItem});
        }
        long nanoTime = System.nanoTime();
        if (h()) {
            return this.f28049a.queryWithDirtyColumn(str, dXTemplateItem);
        }
        j("DB_Query", str, dXTemplateItem, System.nanoTime() - nanoTime);
        return null;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44abb49e", new Object[]{this})).booleanValue();
        }
        if (this.f28049a == null) {
            d(DinamicXEngine.x(), "dinamicx", this.b);
        }
        if (this.f28049a != null) {
            return true;
        }
        i("DB_Open", f.DX_DB_NULL, "dXDataBaseHelper == null");
        return false;
    }

    public final void i(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d9bcff", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        f fVar = new f(this.b);
        f.a aVar = new f.a("DB", str, i);
        aVar.e = str2;
        ArrayList arrayList = new ArrayList();
        fVar.c = arrayList;
        arrayList.add(aVar);
        ic5.p(fVar);
    }

    public final void j(String str, String str2, DXTemplateItem dXTemplateItem, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e62d997", new Object[]{this, str, str2, dXTemplateItem, new Long(j)});
        } else {
            ic5.u(2, str2, "DB", str, dXTemplateItem, null, j, true);
        }
    }

    public boolean k(String str, List<DXTemplateItem> list) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b690148", new Object[]{this, str, list})).booleanValue();
        }
        long nanoTime = System.nanoTime();
        if (h()) {
            z = this.f28049a.updateTemplatesDirty(str, list);
        }
        j("DB_Update", str, null, System.nanoTime() - nanoTime);
        return z;
    }

    public sh6() {
        this.b = "DinamicX_db";
    }
}
