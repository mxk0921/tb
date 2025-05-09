package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d56 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final pw5 b = new pw5();
    public final pvb c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final g56 f17586a = new g56();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements pvb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public uw5 a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (uw5) ipChange.ipc$dispatch("fd4c7fab", new Object[]{this, str});
            }
            return d56.a(d56.this).a(str);
        }
    }

    static {
        t2o.a(444597893);
    }

    public static /* synthetic */ pw5 a(d56 d56Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pw5) ipChange.ipc$dispatch("4e2f32a5", new Object[]{d56Var});
        }
        return d56Var.b;
    }

    public uw5 b(int i, ovb ovbVar, Map map, e56 e56Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("c80e62ee", new Object[]{this, new Integer(i), ovbVar, map, e56Var});
        }
        return this.f17586a.d(i, ovbVar, map, this.c, e56Var);
    }
}
