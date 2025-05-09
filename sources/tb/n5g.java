package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kirinvideoengine.feature.predownload.model.PreDownloadConfig;
import com.taobao.kirinvideoengine.model.MediaModel;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class n5g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public m5g f24524a;
    public final String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, n5g> f24525a = new HashMap<>();

        static {
            t2o.a(500170782);
        }

        public static /* synthetic */ HashMap a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("3d0ed1a", new Object[0]);
            }
            return f24525a;
        }
    }

    static {
        t2o.a(500170781);
    }

    public n5g(String str) {
        this.b = str;
    }

    public static n5g a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n5g) ipChange.ipc$dispatch("5aae0ec", new Object[]{str});
        }
        n5g n5gVar = (n5g) a.a().get(str);
        if (n5gVar != null) {
            return n5gVar;
        }
        n5g n5gVar2 = new n5g(str);
        a.a().put(str, n5gVar2);
        return n5gVar2;
    }

    public void b(MediaModel mediaModel, List<MediaModel> list, m2c m2cVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f7c55ec", new Object[]{this, mediaModel, list, m2cVar, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (m2cVar != null) {
            PreDownloadConfig c = m2cVar.c(m2cVar.a());
            if (this.f24524a == null) {
                this.f24524a = new m5g(m2cVar.a(), m2cVar);
            }
            this.f24524a.A(h5g.a(m2cVar), mediaModel, list, c, i, i2, i3);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0443231", new Object[]{this});
            return;
        }
        m5g m5gVar = this.f24524a;
        if (m5gVar != null) {
            m5gVar.D();
            this.f24524a = null;
        }
        a.a().remove(this.b);
    }
}
