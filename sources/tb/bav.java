package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.performence.model.UltronPerformanceFlowModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class bav {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16285a;
    public final String b;
    public cav c;
    public a d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(83886269);
        }

        public boolean a(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ce8d4acc", new Object[]{this, ultronPerformanceFlowModel})).booleanValue();
            }
            return false;
        }

        public boolean b(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3cb2620c", new Object[]{this, ultronPerformanceFlowModel})).booleanValue();
            }
            return false;
        }

        public boolean c(UltronPerformanceFlowModel ultronPerformanceFlowModel, pwl pwlVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("df0ff033", new Object[]{this, ultronPerformanceFlowModel, pwlVar})).booleanValue();
            }
            return false;
        }
    }

    static {
        t2o.a(83886268);
    }

    public bav(String str, String str2) {
        this.f16285a = str;
        this.b = str2;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return this.f16285a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.b;
    }

    public cav c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cav) ipChange.ipc$dispatch("f7b3d7fd", new Object[]{this});
        }
        return this.c;
    }

    public a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4396aa4d", new Object[]{this});
        }
        return this.d;
    }

    public void e(cav cavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4bed31f", new Object[]{this, cavVar});
        } else {
            this.c = cavVar;
        }
    }

    public bav f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bav) ipChange.ipc$dispatch("e9c6693", new Object[]{this, aVar});
        }
        this.d = aVar;
        return this;
    }
}
