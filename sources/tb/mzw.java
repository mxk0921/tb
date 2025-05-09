package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.huc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class mzw implements huc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f24421a;
    public JSONObject b;
    public final CopyOnWriteArraySet<huc.c> c = new CopyOnWriteArraySet<>();
    public final AtomicBoolean d = new AtomicBoolean(false);

    static {
        t2o.a(850395150);
        t2o.a(839909624);
    }

    public mzw(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f24421a = iTMSPage;
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            huc.b.b(this, iTMSPage);
        }
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            huc.b.c(this);
        }
    }

    @Override // tb.huc
    public void o0(huc.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a58576ae", new Object[]{this, cVar});
            return;
        }
        ckf.g(cVar, "callback");
        if (this.d.get()) {
            cVar.a(this.b);
        } else {
            this.c.add(cVar);
        }
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            huc.b.a(this);
        }
    }

    @Override // tb.huc
    public void N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63de90d8", new Object[]{this, str});
            return;
        }
        if (str != null) {
            try {
                if (str.length() != 0) {
                    if (tsq.I(str, "\"", false, 2, null) && tsq.w(str, "\"", false, 2, null)) {
                        str = str.substring(1, str.length() - 1);
                        ckf.f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    this.b = JSON.parseObject(tsq.E(str, "\\", "", false, 4, null));
                }
            } catch (Exception unused) {
                this.b = null;
            }
        }
        this.d.set(true);
        for (huc.c cVar : this.c) {
            cVar.a(this.b);
        }
        this.c.clear();
    }
}
