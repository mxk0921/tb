package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class tie {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f28731a;
    public String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;

        public a(String str) {
            this.d = str;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/ImageCacheManager$1");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            if (TextUtils.isEmpty(tie.a(tie.this))) {
                tie.b(tie.this, this.d);
            } else {
                tie tieVar = tie.this;
                tie.b(tieVar, tie.a(tie.this) + "," + this.d);
            }
            mno.h(caa.c(), "plt_cache", tie.a(tie.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;

        public b(String str) {
            this.d = str;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/ImageCacheManager$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            String[] split = this.d.split(",");
            if (!(split == null || split.length == 0)) {
                for (String str : split) {
                    try {
                        File file = new File(str);
                        if (file.exists()) {
                            boolean delete = file.delete();
                            if (caa.q()) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("delete file ");
                                sb.append(str);
                                sb.append(" result is ");
                                sb.append(delete);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final tie f28732a = new tie(null);

        static {
            t2o.a(481296395);
        }

        public static /* synthetic */ tie a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tie) ipChange.ipc$dispatch("ba79df56", new Object[0]);
            }
            return f28732a;
        }
    }

    static {
        t2o.a(481296392);
    }

    public /* synthetic */ tie(a aVar) {
        this();
    }

    public static /* synthetic */ String a(tie tieVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff61d04f", new Object[]{tieVar});
        }
        return tieVar.b;
    }

    public static /* synthetic */ String b(tie tieVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("524b1a43", new Object[]{tieVar, str});
        }
        tieVar.b = str;
        return str;
    }

    public static tie e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tie) ipChange.ipc$dispatch("44f3363c", new Object[0]);
        }
        return c.a();
    }

    public synchronized void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f49b04b", new Object[]{this, str});
        } else if (lg4.Y3()) {
            this.f28731a.post(new a(str));
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else if (lg4.Y3()) {
            String str = this.b;
            this.b = "";
            mno.h(caa.c(), "plt_cache", this.b);
            if (!TextUtils.isEmpty(str)) {
                Coordinator.execute(new b(str));
            }
        }
    }

    public tie() {
        this.f28731a = new Handler(Looper.getMainLooper());
        this.b = eno.d(caa.c(), "plt_cache", "");
    }
}
