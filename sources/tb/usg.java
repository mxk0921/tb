package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.LinkedSplashData;
import java.util.Collections;
import java.util.List;
import tb.ssg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class usg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile usg g;

    /* renamed from: a  reason: collision with root package name */
    public qsg f29587a;
    public final ssg b = new ssg();
    public bsd c;
    public wzi d;
    public fi2 e;
    public volatile List<LinkedSplashData> f;

    static {
        t2o.a(736100458);
    }

    public static usg d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (usg) ipChange.ipc$dispatch("5914303f", new Object[0]);
        }
        if (g == null) {
            synchronized (usg.class) {
                try {
                    if (g == null) {
                        g = new usg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public fi2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fi2) ipChange.ipc$dispatch("5dfeff6b", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new fi2();
        }
        return this.e;
    }

    public qsg b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qsg) ipChange.ipc$dispatch("b521360b", new Object[]{this});
        }
        if (this.f29587a == null) {
            this.f29587a = new qsg();
        }
        return this.f29587a;
    }

    public List<LinkedSplashData> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6fd2c942", new Object[]{this});
        }
        List<LinkedSplashData> list = this.f;
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public wzi e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wzi) ipChange.ipc$dispatch("f2dda9de", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new wzi();
        }
        return this.d;
    }

    public bsd f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bsd) ipChange.ipc$dispatch("8f84ec86", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new kgq();
        }
        return this.c;
    }

    public void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d03316", new Object[]{this, jSONObject});
            return;
        }
        tm1.a("LinkedSplashManager", "updateData, topViewSplashSection, start");
        try {
            ssg.a a2 = this.b.a(jSONObject);
            if (a2.a()) {
                tm1.a("LinkedSplashManager", "updateData, got null, reset local data");
                qhg.a(qhg.TOP_VIEW_CACHE, false);
                qhg.b(false);
            } else {
                tm1.a("LinkedSplashManager", "updateData, parse result , parse.ext = " + a2.b + ", parse.dataList = " + a2.f28248a);
            }
            this.f = a2.f28248a;
            if (a2.b != null) {
                oh2.e().i(a2.b);
            }
            tm1.a("LinkedSplashManager", "有数据更新saveAdvInfo");
            fi2 a3 = a();
            a3.h(jSONObject);
            a3.c(1000);
            for (LinkedSplashData linkedSplashData : c()) {
                qsg qsgVar = this.f29587a;
                if (qsgVar != null) {
                    qsgVar.i(linkedSplashData);
                }
            }
            tm1.a("LinkedSplashManager", "preDownload, data pre download finish ");
        } catch (Throwable th) {
            tm1.b("LinkedSplashManager", "preDownload", th);
        }
    }
}
