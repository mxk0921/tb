package tb;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.falco.FalcoEnvironmentImpl;
import com.taobao.falco.FalcoLifecycleActionMonitor;
import com.taobao.falco.FalcoLoadActionMonitor;
import com.taobao.falco.FalcoLocalTool;
import com.taobao.falco.FalcoNativePageLifecycleCallbacks;
import com.taobao.falco.FalcoVisualTool$FalcoVisualView;
import com.taobao.falco.f;
import com.taobao.falco.l;
import com.taobao.falco.n;
import com.taobao.falco.o;
import com.taobao.falco.p;
import com.taobao.falco.r;
import com.taobao.falco.s;
import com.taobao.falco.t;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import mtopsdk.mtop.util.ErrorConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vz8 implements Handler.Callback, FalcoNativePageLifecycleCallbacks.c, f.b, FalcoLifecycleActionMonitor.j, FalcoLoadActionMonitor.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WindowManager f30358a;
    public boolean c;
    public boolean d;
    public WindowManager.LayoutParams e;
    public FalcoVisualTool$FalcoVisualView f;
    public int g;
    public int h;
    public int i = -1;
    public int j = -1;
    public final Handler b = new Handler(Looper.getMainLooper(), this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements FalcoLocalTool.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public vz8 f30359a;

        @Override // com.taobao.falco.FalcoLocalTool.b
        public void a(boolean z) {
            vz8 vz8Var;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c48f1c2b", new Object[]{this, new Boolean(z)});
            } else if (z && this.f30359a == null) {
                vz8 vz8Var2 = new vz8();
                this.f30359a = vz8Var2;
                vz8Var2.O();
            } else if (!z && (vz8Var = this.f30359a) != null) {
                vz8Var.T();
                this.f30359a = null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            Pair e = vz8.e(vz8.d(vz8.this).getContext());
            int intValue = ((Integer) e.first).intValue();
            int intValue2 = ((Integer) e.second).intValue();
            if (vz8.i(vz8.this) < 0 || vz8.k(vz8.this) < 0 || vz8.d(vz8.this).windowWidth + vz8.i(vz8.this) > intValue || vz8.d(vz8.this).windowHeight + vz8.k(vz8.this) > intValue2) {
                vz8 vz8Var = vz8.this;
                vz8.j(vz8Var, (intValue - vz8.d(vz8Var).windowWidth) / 2);
                vz8 vz8Var2 = vz8.this;
                vz8.l(vz8Var2, (intValue2 - vz8.d(vz8Var2).windowHeight) / 2);
            }
            vz8.m(vz8.this).x = vz8.i(vz8.this);
            vz8.m(vz8.this).y = vz8.k(vz8.this);
            vz8.n(vz8.this).updateViewLayout(vz8.d(vz8.this), vz8.m(vz8.this));
            vz8.d(vz8.this).showSuspendedWindow();
            vz8.o(vz8.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bcd83113", new Object[]{this, view});
                return;
            }
            vz8.d(vz8.this).showLevitatedSphere();
            vz8.m(vz8.this).x = vz8.p(vz8.this);
            vz8.m(vz8.this).y = vz8.q(vz8.this);
            vz8.n(vz8.this).updateViewLayout(vz8.d(vz8.this), vz8.m(vz8.this));
            vz8.r(vz8.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.vz8.g
        public void a(View view, float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("746e825d", new Object[]{this, view, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
                return;
            }
            vz8.m(vz8.this).x = (int) (vz8.p(vz8.this) - f3);
            vz8.m(vz8.this).y = (int) (vz8.q(vz8.this) - f4);
            vz8.n(vz8.this).updateViewLayout(vz8.d(vz8.this), vz8.m(vz8.this));
        }

        @Override // tb.vz8.g
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa6cc159", new Object[]{this, view});
            } else {
                vz8.f(vz8.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.vz8.g
        public void a(View view, float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("746e825d", new Object[]{this, view, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
                return;
            }
            vz8.m(vz8.this).x = (int) (vz8.i(vz8.this) - f3);
            vz8.m(vz8.this).y = (int) (vz8.k(vz8.this) - f4);
            vz8.n(vz8.this).updateViewLayout(vz8.d(vz8.this), vz8.m(vz8.this));
        }

        @Override // tb.vz8.g
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa6cc159", new Object[]{this, view});
            } else {
                vz8.g(vz8.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface f {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface g {
        void a(View view, float f, float f2, float f3, float f4);

        void b(View view);
    }

    public static int I(Context context, int i) {
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c0a5644", new Object[]{context, new Integer(i)})).intValue();
        }
        float f2 = i * context.getResources().getDisplayMetrics().density;
        if (i < 0) {
            i2 = -1;
        }
        return (int) (f2 + (i2 * 0.5f));
    }

    public static Pair<Integer, Integer> L(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("a41e0848", new Object[]{context});
        }
        return Pair.create(Integer.valueOf(TBAutoSizeConfig.x().H(context)), Integer.valueOf(TBAutoSizeConfig.x().B(context)));
    }

    public static boolean M(Context context) {
        boolean canDrawOverlays;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5ba7880", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        canDrawOverlays = Settings.canDrawOverlays(context);
        return canDrawOverlays;
    }

    public static void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3522bda", new Object[0]);
        } else {
            FalcoLocalTool.registerEnableListener(new a());
        }
    }

    public static String Q(int i, f.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f4fb866", new Object[]{new Integer(i), aVar});
        }
        StringBuilder sb = new StringBuilder();
        switch (i) {
            case 401:
                u(sb, (l) aVar);
                break;
            case 402:
                v(sb, (l) aVar);
                break;
            case 403:
                t(sb, (com.taobao.falco.d) aVar);
                break;
            case 404:
                w(sb, (o) aVar);
                break;
            case 405:
                z(sb, (r) aVar);
                break;
            case 406:
                x(sb, (p) aVar);
                break;
            case 407:
                s(sb, (com.taobao.falco.c) aVar);
                break;
        }
        return sb.toString();
    }

    public static Pair<Long, String> S(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("76c67229", new Object[]{new Long(j)});
        }
        long j2 = j >> 10;
        if (j2 > 0) {
            return Pair.create(Long.valueOf(j2), "KB");
        }
        return Pair.create(Long.valueOf(j), "B");
    }

    public static String W(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8af3276", new Object[]{new Long(j)});
        }
        if (j <= 0) {
            return "?";
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date(j));
    }

    public static /* synthetic */ FalcoVisualTool$FalcoVisualView d(vz8 vz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FalcoVisualTool$FalcoVisualView) ipChange.ipc$dispatch("b4b71681", new Object[]{vz8Var});
        }
        return vz8Var.f;
    }

    public static /* synthetic */ Pair e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("eda6565a", new Object[]{context});
        }
        return L(context);
    }

    public static /* synthetic */ void f(vz8 vz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4dbe945", new Object[]{vz8Var});
        } else {
            vz8Var.J();
        }
    }

    public static /* synthetic */ void g(vz8 vz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("617c1446", new Object[]{vz8Var});
        } else {
            vz8Var.K();
        }
    }

    public static /* synthetic */ int h(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92c5a956", new Object[]{context, new Integer(i)})).intValue();
        }
        return I(context, i);
    }

    public static /* synthetic */ int i(vz8 vz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1eb75dcb", new Object[]{vz8Var})).intValue();
        }
        return vz8Var.i;
    }

    public static /* synthetic */ int j(vz8 vz8Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6670b1dc", new Object[]{vz8Var, new Integer(i)})).intValue();
        }
        vz8Var.i = i;
        return i;
    }

    public static /* synthetic */ int k(vz8 vz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab5788cc", new Object[]{vz8Var})).intValue();
        }
        return vz8Var.j;
    }

    public static /* synthetic */ int l(vz8 vz8Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6dd5e6fb", new Object[]{vz8Var, new Integer(i)})).intValue();
        }
        vz8Var.j = i;
        return i;
    }

    public static /* synthetic */ WindowManager.LayoutParams m(vz8 vz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("9353c0ea", new Object[]{vz8Var});
        }
        return vz8Var.e;
    }

    public static /* synthetic */ WindowManager n(vz8 vz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager) ipChange.ipc$dispatch("a7ab75f7", new Object[]{vz8Var});
        }
        return vz8Var.f30358a;
    }

    public static /* synthetic */ void o(vz8 vz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("513809dc", new Object[]{vz8Var});
        } else {
            vz8Var.U();
        }
    }

    public static /* synthetic */ int p(vz8 vz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ddd834d0", new Object[]{vz8Var})).intValue();
        }
        return vz8Var.g;
    }

    public static /* synthetic */ int q(vz8 vz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a785fd1", new Object[]{vz8Var})).intValue();
        }
        return vz8Var.h;
    }

    public static /* synthetic */ void r(vz8 vz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7188adf", new Object[]{vz8Var});
        } else {
            vz8Var.V();
        }
    }

    public static void t(StringBuilder sb, com.taobao.falco.d dVar) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fc1a8fe", new Object[]{sb, dVar});
            return;
        }
        Object obj = "?";
        if (dVar != null) {
            String valueOf = String.valueOf(dVar.f10461a);
            float f2 = dVar.b;
            Object obj2 = obj;
            if (f2 > 0.0f) {
                obj2 = Integer.valueOf((int) (f2 * 100.0f));
            }
            str = String.valueOf(obj2);
            str2 = valueOf;
        } else {
            str = obj;
            str2 = obj;
        }
        sb.append("CPU：");
        sb.append(str2);
        sb.append("核");
        sb.append("，");
        sb.append("使用率 ");
        sb.append(str);
        sb.append(f7l.MOD);
    }

    public static void v(StringBuilder sb, l lVar) {
        long j;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a71c6a88", new Object[]{sb, lVar});
            return;
        }
        if (lVar != null) {
            str = W(lVar.b);
            j = lVar.h;
        } else {
            str = "?";
            j = -1;
        }
        sb.append("启动时刻 ");
        sb.append(str);
        if (j > 0) {
            sb.append("，");
            sb.append("上次冷启时刻 ");
            sb.append(W(j));
        }
    }

    public static void y(StringBuilder sb, FullTraceAnalysis.l lVar, FullTraceAnalysis.l lVar2, FullTraceAnalysis.l lVar3, FullTraceAnalysis.l lVar4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3620c44", new Object[]{sb, lVar, lVar2, lVar3, lVar4});
            return;
        }
        Pair<Long, String> S = S(lVar.b);
        Pair<Long, String> S2 = S(lVar2.b + lVar3.b);
        Pair<Long, String> S3 = S(lVar4.b);
        sb.append("图片 ");
        sb.append(lVar.f6237a);
        sb.append("个，");
        sb.append("包大小 ");
        sb.append(S.first);
        sb.append((String) S.second);
        sb.append("；");
        sb.append("MTOP ");
        sb.append(lVar2.f6237a + lVar3.f6237a);
        sb.append("个，");
        sb.append("包大小 ");
        sb.append(S2.first);
        sb.append((String) S.second);
        sb.append("；");
        sb.append("CDN ");
        sb.append(lVar4.f6237a);
        sb.append("个，");
        sb.append("包大小 ");
        sb.append(S3.first);
        sb.append((String) S3.second);
    }

    public static void z(StringBuilder sb, r rVar) {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3331f1e", new Object[]{sb, rVar});
            return;
        }
        if (rVar != null) {
            str3 = String.valueOf(rVar.f10477a >> 10);
            long j = rVar.b;
            long j2 = j >> 10;
            if (j2 > 0) {
                str = String.valueOf(j2);
                str2 = "GB";
            } else {
                str = String.valueOf(j);
                str2 = "MB";
            }
        } else {
            str3 = "?";
            str = str3;
            str2 = str;
        }
        sb.append("磁盘：");
        sb.append("可用容量 ");
        sb.append(str);
        sb.append(str2);
        sb.append("，");
        sb.append("总量 ");
        sb.append(str3);
        sb.append("GB");
    }

    public final void A(List<Pair<Integer, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2422392a", new Object[]{this, list});
        } else if (this.c) {
            for (Pair<Integer, String> pair : list) {
                this.f.updateDetailItem(400, ((Integer) pair.first).intValue(), (String) pair.second);
            }
        }
    }

    public final void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10e22c7", new Object[]{this, str});
            return;
        }
        this.f.updateDetailItem(100, 101, str);
        this.f.setItemVisibility(100, 102, 8);
        this.f.setItemVisibility(100, 103, 8);
    }

    public final void D(ckh ckhVar, long j, n nVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("562dc08", new Object[]{this, ckhVar, new Long(j), nVar});
            return;
        }
        String str2 = "";
        if (ckhVar == n.PAGE_FIRST_FRAME_RENDER_END) {
            str = "点击响应";
        } else if (ckhVar == n.PAGE_INTERACTIVE_TIME) {
            str = "点击打开TTI";
        } else if (ckhVar == n.PAGE_BIZ_DISPLAY_TIME) {
            str = "业务自定义";
        } else {
            str = ckhVar == n.PAGE_FSP_TIME ? "fsp" : str2;
        }
        if (!this.f.containColorBlockTitle(str)) {
            this.f.addColorBlock(j, str, j + "ms");
            String detailItemContent = this.f.getDetailItemContent(200, 203);
            if (!TextUtils.isEmpty(detailItemContent)) {
                str2 = detailItemContent + "，";
            }
            this.f.updateDetailItem(200, 203, str2 + str + "：" + j + "ms");
        }
        if (nVar != null) {
            X(nVar);
        }
    }

    public final void E(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db82789", new Object[]{this, context});
        } else if (this.c && this.d) {
            this.f30358a.removeView(this.f);
            this.d = false;
            V();
        }
    }

    public final void F(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("619aa794", new Object[]{this, context});
        } else if (M(context)) {
            if (!this.c) {
                P(context);
                this.c = true;
            }
            this.f30358a.addView(this.f, this.e);
            this.d = true;
            U();
        } else if (this.c) {
            V();
        }
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("364e5c0f", new Object[]{this});
        } else if (this.c) {
            if (this.d) {
                this.f30358a.removeView(this.f);
                this.d = false;
            }
            this.f30358a = null;
            this.e = null;
            this.f = null;
            this.g = 0;
            this.h = 0;
            this.i = -1;
            this.j = -1;
            this.c = false;
        }
    }

    public final void H(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b392052e", new Object[]{this, strArr});
            return;
        }
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr[2];
        String str4 = strArr[3];
        if (!TextUtils.isEmpty(str)) {
            this.f.updateDetailItem(100, 101, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f.updateDetailItem(100, 102, str2);
            this.f.setItemVisibility(100, 102, 0);
        }
        if (!TextUtils.isEmpty(str3)) {
            this.f.updateDetailItem(100, 103, str3);
            this.f.setItemVisibility(100, 103, 0);
        }
        this.f.updateDetailItem(100, 104, str4);
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbfcb6", new Object[]{this});
            return;
        }
        Pair<Integer, Integer> L = L(this.f.getContext());
        int intValue = ((Integer) L.first).intValue();
        int intValue2 = ((Integer) L.second).intValue();
        WindowManager.LayoutParams layoutParams = this.e;
        int i = layoutParams.x;
        FalcoVisualTool$FalcoVisualView falcoVisualTool$FalcoVisualView = this.f;
        int i2 = falcoVisualTool$FalcoVisualView.sphereWidth;
        if (i + (i2 / 2) >= intValue / 2) {
            layoutParams.x = (intValue - i2) - I(falcoVisualTool$FalcoVisualView.getContext(), 10);
        } else {
            layoutParams.x = I(falcoVisualTool$FalcoVisualView.getContext(), 10);
        }
        WindowManager.LayoutParams layoutParams2 = this.e;
        int i3 = layoutParams2.y;
        if (i3 < 0) {
            layoutParams2.y = 0;
        } else {
            int i4 = this.f.sphereHeight;
            if (i3 + i4 > intValue2) {
                layoutParams2.y = intValue2 - i4;
            }
        }
        this.g = layoutParams2.x;
        this.h = layoutParams2.y;
        this.f30358a.updateViewLayout(this.f, layoutParams2);
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ab5459", new Object[]{this});
            return;
        }
        Pair<Integer, Integer> L = L(this.f.getContext());
        int intValue = ((Integer) L.first).intValue();
        int intValue2 = ((Integer) L.second).intValue();
        WindowManager.LayoutParams layoutParams = this.e;
        int i = layoutParams.x;
        FalcoVisualTool$FalcoVisualView falcoVisualTool$FalcoVisualView = this.f;
        int i2 = falcoVisualTool$FalcoVisualView.windowWidth;
        if (i + i2 < i2 / 3) {
            layoutParams.x = (i2 * (-2)) / 3;
        } else if ((i + i2) - intValue > (i2 * 2) / 3) {
            layoutParams.x = intValue - (i2 / 3);
        }
        int i3 = layoutParams.y;
        if (i3 < 0) {
            layoutParams.y = 0;
        } else {
            int i4 = falcoVisualTool$FalcoVisualView.windowHeight;
            if (i3 + i4 > intValue2) {
                layoutParams.y = intValue2 - i4;
            }
        }
        this.i = layoutParams.x;
        this.j = layoutParams.y;
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b12342", new Object[]{this});
        } else {
            FalcoNativePageLifecycleCallbacks.a().g(this);
        }
    }

    public final void P(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.g = I(applicationContext, 10);
        this.h = I(applicationContext, 150);
        this.f30358a = (WindowManager) applicationContext.getSystemService(pg1.ATOM_EXT_window);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, Build.VERSION.SDK_INT >= 26 ? 2038 : 2003, 40, -3);
        this.e = layoutParams;
        layoutParams.gravity = 85;
        layoutParams.x = this.g;
        layoutParams.y = this.h;
        FalcoVisualTool$FalcoVisualView falcoVisualTool$FalcoVisualView = new FalcoVisualTool$FalcoVisualView(applicationContext);
        this.f = falcoVisualTool$FalcoVisualView;
        falcoVisualTool$FalcoVisualView.addDetailItem(100, "FalcoTouch (交互行为)", null);
        this.f.updateDetailItem(100, 101, "类型：?");
        this.f.updateDetailItem(100, 102, "触发时刻：?");
        this.f.updateDetailItem(100, 103, "交互页面：?");
        this.f.updateDetailItem(100, 104, "疯狂点击：当前页面检测到0次");
        this.f.addDetailItem(200, "FalcoLoad (页面打开)", null);
        this.f.updateDetailItem(200, 201, "当前页面：?");
        this.f.updateDetailItem(200, 202, "来源页面：?");
        this.f.updateDetailItem(200, 203, "点击响应：?");
        this.f.addDetailItem(300, "FalcoService (页面请求)", null);
        this.f.updateDetailItem(300, 301, "当前页面：?");
        this.f.updateDetailItem(300, 302, "总请求：?");
        this.f.addDetailItem(400, "FalcoEnv (环境信息)", null);
        this.f.updateDetailItem(400, 401, Q(401, null));
        this.f.updateDetailItem(400, 402, Q(402, null));
        this.f.updateDetailItem(400, 403, Q(403, null));
        this.f.updateDetailItem(400, 404, Q(404, null));
        this.f.updateDetailItem(400, 405, Q(405, null));
        this.f.updateDetailItem(400, 406, Q(406, null));
        this.f.updateDetailItem(400, 407, Q(407, null));
        this.f.setSphereClickListener(new b());
        this.f.setWindowDoubleClickListener(new c());
        this.f.setSphereDraggingListener(new d());
        this.f.setWindowDraggingListener(new e());
    }

    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af759a", new Object[]{this});
            return;
        }
        V();
        FalcoNativePageLifecycleCallbacks.a().h(this);
        this.b.sendEmptyMessage(1);
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1de03db4", new Object[]{this});
            return;
        }
        FalcoLifecycleActionMonitor P = s9u.u().P();
        if (P != null) {
            P.q0(this);
        }
        FalcoLoadActionMonitor Q = s9u.u().Q();
        if (Q != null) {
            Q.T0(this);
        }
        FalcoEnvironmentImpl m = FalcoEnvironmentImpl.m();
        if (m != null) {
            m.w(this);
        }
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b1a55b3", new Object[]{this});
            return;
        }
        FalcoLifecycleActionMonitor P = s9u.u().P();
        if (P != null) {
            P.p0();
        }
        FalcoLoadActionMonitor Q = s9u.u().Q();
        if (Q != null) {
            Q.S0();
        }
        FalcoEnvironmentImpl m = FalcoEnvironmentImpl.m();
        if (m != null) {
            m.x(this);
        }
    }

    public final void X(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51cb9f0", new Object[]{this, nVar});
            return;
        }
        StringBuilder sb = new StringBuilder("当前页面：");
        y(sb, nVar.x("picture"), nVar.x("mtop"), nVar.x(mfq.MODULE_SSR), nVar.x("network"));
        this.f.updateDetailItem(300, 301, sb.toString());
        StringBuilder sb2 = new StringBuilder("总请求：");
        y(sb2, FullTraceAnalysis.getInstance().getRequestStatisticInfo("picture"), FullTraceAnalysis.getInstance().getRequestStatisticInfo("mtop"), FullTraceAnalysis.getInstance().getRequestStatisticInfo(mfq.MODULE_SSR), FullTraceAnalysis.getInstance().getRequestStatisticInfo("network"));
        this.f.updateDetailItem(300, 302, sb2.toString());
    }

    @Override // com.taobao.falco.f.b
    public void a(f.a... aVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6918f65e", new Object[]{this, aVarArr});
        } else if (aVarArr != null && aVarArr.length != 0) {
            ArrayList arrayList = new ArrayList(aVarArr.length);
            for (f.a aVar : aVarArr) {
                switch (aVar.type()) {
                    case 3:
                        arrayList.add(Pair.create(401, Q(401, aVar)));
                        arrayList.add(Pair.create(402, Q(402, aVar)));
                        break;
                    case 4:
                        arrayList.add(Pair.create(407, Q(407, aVar)));
                        break;
                    case 5:
                        arrayList.add(Pair.create(406, Q(406, aVar)));
                        break;
                    case 6:
                        arrayList.add(Pair.create(405, Q(405, aVar)));
                        break;
                    case 7:
                        arrayList.add(Pair.create(403, Q(403, aVar)));
                        break;
                    case 8:
                        arrayList.add(Pair.create(404, Q(404, aVar)));
                        break;
                }
            }
            this.b.obtainMessage(2, arrayList).sendToTarget();
        }
    }

    @Override // com.taobao.falco.FalcoLoadActionMonitor.h
    public void b(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c956342e", new Object[]{this, nVar});
        } else {
            this.b.obtainMessage(5, nVar).sendToTarget();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        switch (message.what) {
            case 1:
                G();
                break;
            case 2:
                A((List) message.obj);
                break;
            case 3:
                B((String) message.obj);
                break;
            case 4:
                H((String[]) message.obj);
                break;
            case 5:
                C((n) message.obj);
                break;
            case 6:
                Object[] objArr = (Object[]) message.obj;
                D((ckh) objArr[0], ((Long) objArr[1]).longValue(), (n) objArr[2]);
                break;
            case 7:
                F((Context) message.obj);
                break;
            case 8:
                E((Context) message.obj);
                break;
        }
        return true;
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.c
    public void onChanged(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c87878", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            i = 7;
        } else {
            i = 8;
        }
        this.b.obtainMessage(i, FalcoNativePageLifecycleCallbacks.a().f()).sendToTarget();
    }

    @Override // com.taobao.falco.FalcoLoadActionMonitor.h
    public void c(t tVar, n nVar) {
        String str;
        s.a C1;
        String str2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc03e49", new Object[]{this, tVar, nVar});
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder("疯狂点击：当前页面检测到");
        if (tVar != null) {
            if (t.CATEGORY_FLICK.equals(tVar.B1())) {
                str = "滑动";
            } else {
                str = "点击";
            }
            if (tVar.C1() != null) {
                str2 = f7l.BRACKET_START_STR + ((int) C1.f10478a) + ", " + ((int) C1.b) + f7l.BRACKET_END_STR;
            } else {
                str2 = "?, ?";
            }
            String pageName = tVar.getPageName();
            if (TextUtils.isEmpty(pageName)) {
                pageName = "";
            }
            sb.append("类型：");
            sb.append(str);
            sb.append("，坐标：");
            sb.append(str2);
            sb2.append("触发时刻：");
            sb2.append(W(tVar.b()));
            sb3.append("交互页面：");
            sb3.append(pageName);
        }
        if (nVar != null) {
            i = nVar.s();
        }
        sb4.append(i);
        sb4.append("次");
        this.b.obtainMessage(4, new String[]{sb.toString(), sb2.toString(), sb3.toString(), sb4.toString()}).sendToTarget();
    }

    public static void s(StringBuilder sb, com.taobao.falco.c cVar) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("293eadde", new Object[]{sb, cVar});
            return;
        }
        String str3 = "充电状态未知";
        if (cVar != null) {
            int i = cVar.f10460a;
            if (i == 0) {
                str3 = "未插电";
            } else if (i == 1) {
                str3 = "充电";
            } else if (i == 2) {
                str3 = "充满";
            }
            str2 = String.valueOf(cVar.b);
            str = String.valueOf(cVar.d / 10);
        } else {
            str2 = "?";
            str = str2;
        }
        sb.append("电池：");
        sb.append(str3);
        sb.append("，");
        sb.append("电量 ");
        sb.append(str2);
        sb.append(f7l.MOD);
        sb.append("，");
        sb.append("电池温度 ");
        sb.append(str);
        sb.append("度");
    }

    public static void w(StringBuilder sb, o oVar) {
        String str;
        String str2;
        String str3;
        long j;
        String str4;
        String str5;
        boolean z = true;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a57e380", new Object[]{sb, oVar});
            return;
        }
        if (oVar != null) {
            str5 = String.valueOf(oVar.f10474a);
            str4 = String.valueOf(oVar.b);
            j = oVar.c;
            str3 = String.valueOf(oVar.e);
            str2 = String.valueOf(oVar.f);
            str = String.valueOf(oVar.g);
            if (oVar.h != 1) {
                z = false;
            }
        } else {
            str5 = "?";
            j = -1;
            str4 = str5;
            str3 = str4;
            str2 = str3;
            str = str2;
        }
        sb.append("内存：");
        if (j > 0) {
            sb.append("应用(物理) ");
            sb.append(j);
            sb.append("MB");
            sb.append("，");
        }
        sb.append("可用(物理) ");
        sb.append(str4);
        sb.append("MB");
        sb.append("，");
        sb.append("总共(物理) ");
        sb.append(str5);
        sb.append("MB");
        sb.append("，");
        sb.append("应用(Java) ");
        sb.append(str3);
        sb.append("MB");
        sb.append("，");
        sb.append("总共(Java) ");
        sb.append(str2);
        sb.append("MB");
        sb.append("，");
        sb.append("最大(Java) ");
        sb.append(str);
        sb.append("MB");
        if (z) {
            sb.append("，");
            sb.append("低内存状态");
        }
    }

    public static void x(StringBuilder sb, p pVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef9763e", new Object[]{sb, pVar});
            return;
        }
        String str2 = "?";
        if (pVar != null) {
            str2 = pVar.f10475a;
            if ("NoNetwork".equals(str2)) {
                str2 = ErrorConstant.ERRMSG_NO_NETWORK;
            }
            int i = pVar.j;
            if (i == 0) {
                str = "IPv4";
            } else if (i != 1) {
                str = i != 2 ? str2 : "Dual-stack";
            } else {
                str = "IPv6";
            }
            int i2 = pVar.k;
            if (i2 == 0) {
                str2 = "网络质量未知";
            } else if (i2 == 1) {
                str2 = "弱网";
            } else if (i2 == 2) {
                str2 = "网络质量正常";
            } else if (i2 == 3) {
                str2 = "强网";
            }
        } else {
            str2 = str2;
            str = str2;
        }
        sb.append("网络：");
        sb.append(str2);
        sb.append("，");
        sb.append(str);
        sb.append("，");
        sb.append(str2);
    }

    public final void C(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb95fb1f", new Object[]{this, nVar});
            return;
        }
        this.f.clearAllColorBlock();
        this.f.updateDetailItem(200, 201, "");
        this.f.updateDetailItem(200, 202, "");
        this.f.updateDetailItem(200, 203, "");
        if (nVar == null) {
            this.f.setItemVisibility(200, 8);
            return;
        }
        this.f.setItemVisibility(200, 0);
        StringBuilder sb = new StringBuilder("当前页面：");
        String pageName = nVar.getPageName();
        if (TextUtils.isEmpty(pageName)) {
            pageName = "?";
        }
        sb.append(pageName);
        this.f.updateDetailItem(200, 201, sb.toString());
        String l = nVar.l();
        if (!TextUtils.isEmpty(l)) {
            this.f.updateDetailItem(200, 202, "来源页面：" + l);
            this.f.setItemVisibility(200, 202, 0);
        } else {
            this.f.setItemVisibility(200, 202, 8);
        }
        StringBuilder sb2 = new StringBuilder();
        long W = nVar.W();
        long Y = nVar.Y();
        long e2 = nVar.e();
        long o = nVar.o();
        if (W > 0) {
            FalcoVisualTool$FalcoVisualView falcoVisualTool$FalcoVisualView = this.f;
            falcoVisualTool$FalcoVisualView.addColorBlock(W, "点击响应", W + "ms");
            sb2.append("点击响应：");
            sb2.append(W);
            sb2.append("ms");
        }
        if (Y > 0) {
            FalcoVisualTool$FalcoVisualView falcoVisualTool$FalcoVisualView2 = this.f;
            falcoVisualTool$FalcoVisualView2.addColorBlock(Y, "点击打开TTI", Y + "ms");
            sb2.append("，点击打开TTI：");
            sb2.append(Y);
            sb2.append("ms");
        }
        if (e2 > 0) {
            FalcoVisualTool$FalcoVisualView falcoVisualTool$FalcoVisualView3 = this.f;
            falcoVisualTool$FalcoVisualView3.addColorBlock(e2, "业务自定义", e2 + "ms");
            sb2.append("，业务自定义：");
            sb2.append(Y);
            sb2.append("ms");
        }
        if (o > 0) {
            FalcoVisualTool$FalcoVisualView falcoVisualTool$FalcoVisualView4 = this.f;
            falcoVisualTool$FalcoVisualView4.addColorBlock(o, "fsp", o + "ms");
            sb2.append("，fsp：");
            sb2.append(o);
            sb2.append("ms");
        }
        this.f.updateDetailItem(200, 203, sb2.toString());
        X(nVar);
        this.f.updateDetailItem(100, 104, "疯狂点击：当前页面检测到" + nVar.s() + "次");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void u(java.lang.StringBuilder r7, com.taobao.falco.l r8) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vz8.u(java.lang.StringBuilder, com.taobao.falco.l):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        if (r7.equals("WARM") == false) goto L_0x0033;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void R(java.lang.String r7, long r8, boolean r10, tb.ez8 r11) {
        /*
            r6 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = tb.vz8.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0028
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r8)
            java.lang.Boolean r8 = new java.lang.Boolean
            r8.<init>(r10)
            r9 = 5
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r3] = r6
            r9[r2] = r7
            r9[r1] = r5
            r9[r0] = r8
            r7 = 4
            r9[r7] = r11
            java.lang.String r7 = "604268fc"
            r4.ipc$dispatch(r7, r9)
            return
        L_0x0028:
            r7.hashCode()
            r11 = -1
            int r4 = r7.hashCode()
            switch(r4) {
                case 71725: goto L_0x0049;
                case 2074340: goto L_0x003e;
                case 2656901: goto L_0x0035;
                default: goto L_0x0033;
            }
        L_0x0033:
            r1 = -1
            goto L_0x0053
        L_0x0035:
            java.lang.String r2 = "WARM"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L_0x0053
            goto L_0x0033
        L_0x003e:
            java.lang.String r1 = "COLD"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0047
            goto L_0x0033
        L_0x0047:
            r1 = 1
            goto L_0x0053
        L_0x0049:
            java.lang.String r1 = "HOT"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0052
            goto L_0x0033
        L_0x0052:
            r1 = 0
        L_0x0053:
            switch(r1) {
                case 0: goto L_0x0061;
                case 1: goto L_0x005d;
                case 2: goto L_0x0059;
                default: goto L_0x0056;
            }
        L_0x0056:
            java.lang.String r7 = ""
            goto L_0x0064
        L_0x0059:
            java.lang.String r7 = "温启"
            goto L_0x0064
        L_0x005d:
            java.lang.String r7 = "冷启"
            goto L_0x0064
        L_0x0061:
            java.lang.String r7 = "热启"
        L_0x0064:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "类型："
            r11.<init>(r1)
            r11.append(r7)
            java.lang.String r7 = "，进端时刻："
            r11.append(r7)
            java.lang.String r7 = W(r8)
            r11.append(r7)
            if (r10 == 0) goto L_0x0084
            java.lang.String r7 = "，死亡恢复"
            r11.append(r7)
        L_0x0084:
            android.os.Handler r7 = r6.b
            java.lang.String r8 = r11.toString()
            android.os.Message r7 = r7.obtainMessage(r0, r8)
            r7.sendToTarget()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vz8.R(java.lang.String, long, boolean, tb.ez8):void");
    }

    @Override // com.taobao.falco.FalcoLoadActionMonitor.h
    public void a(ckh ckhVar, long j, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7551b3c", new Object[]{this, ckhVar, new Long(j), nVar});
        } else {
            this.b.obtainMessage(6, new Object[]{ckhVar, Long.valueOf(j), nVar}).sendToTarget();
        }
    }
}
