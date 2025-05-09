package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.CounterModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.CounterStyleModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hcm extends ubm<CounterModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView e;
    public CountDownTimer f;
    public long g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public Long l;
    public String m;
    public List<String> n;
    public String o;
    public String p;
    public List<String> q;
    public volatile boolean r = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends CountDownTimer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(long j, long j2) {
            super(j, j2);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/nativerender/render/component/PopCounterComponent$1");
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
                return;
            }
            hcm.G(hcm.this, 0L);
            hcm hcmVar = hcm.this;
            oe8 oe8Var = hcmVar.f29277a;
            ComponentBaseModel componentBaseModel = hcmVar.b;
            oe8Var.l(componentBaseModel, "timeout", ((CounterModel) componentBaseModel).action, ((CounterModel) componentBaseModel).actions);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
            } else if (hcm.this.f29277a.j().B()) {
                wdm.d("PopCounterComponent.onTick.isEngineClosed.cancelTimer", new Object[0]);
                hcm.z(hcm.this).cancel();
            } else {
                hcm.B(hcm.this, j);
                hcm hcmVar = hcm.this;
                boolean C = hcm.C(hcmVar, hcm.A(hcmVar));
                wdm.d("PopCounterComponent.onTick.mLeftTime=%s.isOverMarginalValue=%s", Long.valueOf(hcm.A(hcm.this)), Boolean.valueOf(C));
                if (hcm.D(hcm.this) != C) {
                    hcm.E(hcm.this, C);
                    hcm.z(hcm.this).cancel();
                    wdm.d("PopCounterComponent.onTick.isOverMarginalValue.changed.restartTimer", new Object[0]);
                    hcm.F(hcm.this);
                }
                hcm.G(hcm.this, j);
            }
        }
    }

    static {
        t2o.a(790626475);
    }

    public hcm(oe8 oe8Var, CounterModel counterModel, boolean z) {
        super(oe8Var, counterModel, z);
    }

    public static /* synthetic */ long A(hcm hcmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6221ee2", new Object[]{hcmVar})).longValue();
        }
        return hcmVar.g;
    }

    public static /* synthetic */ long B(hcm hcmVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc73fa0c", new Object[]{hcmVar, new Long(j)})).longValue();
        }
        hcmVar.g = j;
        return j;
    }

    public static /* synthetic */ boolean C(hcm hcmVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e9b8b9b", new Object[]{hcmVar, new Long(j)})).booleanValue();
        }
        return hcmVar.K(j);
    }

    public static /* synthetic */ boolean D(hcm hcmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c208eab0", new Object[]{hcmVar})).booleanValue();
        }
        return hcmVar.k;
    }

    public static /* synthetic */ boolean E(hcm hcmVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d66e22e", new Object[]{hcmVar, new Boolean(z)})).booleanValue();
        }
        hcmVar.k = z;
        return z;
    }

    public static /* synthetic */ void F(hcm hcmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ffc508b", new Object[]{hcmVar});
        } else {
            hcmVar.U();
        }
    }

    public static /* synthetic */ void G(hcm hcmVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40078d9a", new Object[]{hcmVar, new Long(j)});
        } else {
            hcmVar.N(j);
        }
    }

    public static /* synthetic */ Object ipc$super(hcm hcmVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 988548963) {
            super.l();
            return null;
        } else if (hashCode == 1137978274) {
            return new Boolean(super.n((String) objArr[0], (String) objArr[1]));
        } else {
            if (hashCode == 1889590256) {
                super.m();
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tbpoplayer/nativerender/render/component/PopCounterComponent");
        }
    }

    public static /* synthetic */ CountDownTimer z(hcm hcmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CountDownTimer) ipChange.ipc$dispatch("7942cd61", new Object[]{hcmVar});
        }
        return hcmVar.f;
    }

    public final String I(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e45df848", new Object[]{this, str, list});
        }
        if (TextUtils.isEmpty(str)) {
            str = "{d}天{h}小时";
        }
        Matcher matcher = Pattern.compile("\\{[0]*[d,h,H,m,s,n][+]?\\}").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            list.add(matcher.group());
            matcher.appendReplacement(stringBuffer, "%s");
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public final void J() {
        Long l;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba5572b", new Object[]{this});
            return;
        }
        Long e = a1n.e(this.f29277a, ((CounterModel) this.b).endTime);
        if ("curTime".equals(((CounterModel) this.b).serverTime)) {
            l = Long.valueOf(PopLayer.getReference().getCurrentTimeStamp(false));
        } else {
            l = a1n.e(this.f29277a, ((CounterModel) this.b).serverTime);
        }
        long j2 = 0;
        if (l == null || e == null) {
            j = 0;
        } else {
            j = e.longValue() - l.longValue();
        }
        if (j >= 0) {
            j2 = j;
        }
        this.g = j2;
    }

    public final boolean K(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebb9947", new Object[]{this, new Long(j)})).booleanValue();
        }
        long j2 = j / 1000;
        long j3 = j2 / 3600;
        long j4 = j3 / 24;
        wdm.d("PopCounterComponent.isOverMarginalValue.leftTime=%s.totalSeconds=%s.hours=%s.days=%s.mOverMarginal=%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), this.l);
        Long l = this.l;
        if (l == null || l.longValue() <= 0 || j4 < this.l.longValue()) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c92545d3", new Object[]{this});
            return;
        }
        try {
            wdm.d("PopCounterComponent.startCountDownTimer.leftTime=%s", Long.valueOf(this.g));
            N(this.g);
            if (((CounterModel) this.b).autoStart) {
                T();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final /* synthetic */ void M() {
        boolean z;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ffc28d", new Object[]{this});
            return;
        }
        if (this.k) {
            z = this.j;
        } else {
            z = this.i;
        }
        long j2 = this.g;
        if (z) {
            j = 100;
        } else {
            j = 1000;
        }
        this.f = new a(j2, j).start();
        this.r = true;
    }

    public final void N(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c27cf47", new Object[]{this, new Long(j)});
            return;
        }
        wdm.d("PopCounterComponent.render.mIsOverMarginal=%s", Boolean.valueOf(this.k));
        if (!this.k) {
            P(j, this.m, this.n);
        } else if ("dh".equals(this.p) || "dh+".equals(this.p)) {
            Q(j, this.p);
        } else {
            P(j, this.o, this.q);
        }
    }

    public final String O(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e1b7aca", new Object[]{this, new Long(j), new Boolean(z)});
        }
        if (j < 0) {
            j = 0;
        }
        if (!z || j >= 10) {
            return String.valueOf(j);
        }
        return "0" + j;
    }

    public final void Q(long j, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba65272", new Object[]{this, new Long(j), str});
            return;
        }
        long j2 = (j / 1000) / 3600;
        long j3 = j2 / 24;
        long j4 = j2 % 24;
        if ("dh".equals(str)) {
            if (j4 == 0) {
                str2 = j3 + "天";
            } else {
                str2 = j3 + "天" + j4 + "小时";
            }
        } else if (!"dh+".equals(str)) {
            str2 = "";
        } else if (j4 == 23) {
            str2 = (j3 + 1) + "天";
        } else {
            str2 = j3 + "天" + (j4 + 1) + "小时";
        }
        this.e.setText(str2);
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc26e16", new Object[]{this});
        } else if (!this.r) {
            T();
        }
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37a0adfd", new Object[]{this});
        } else {
            this.f29277a.x(new Runnable() { // from class: tb.fcm
                @Override // java.lang.Runnable
                public final void run() {
                    hcm.this.L();
                }
            });
        }
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48972ec1", new Object[]{this});
            return;
        }
        CountDownTimer countDownTimer = this.f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        U();
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8b0a", new Object[]{this});
        } else {
            this.f29277a.x(new Runnable() { // from class: tb.gcm
                @Override // java.lang.Runnable
                public final void run() {
                    hcm.this.M();
                }
            });
        }
    }

    @Override // tb.ubm
    public StyleModel f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StyleModel) ipChange.ipc$dispatch("14e3d48a", new Object[]{this});
        }
        T t = this.b;
        if (t != 0) {
            return ((CounterModel) t).style;
        }
        return null;
    }

    @Override // tb.ubm
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
            return;
        }
        super.l();
        wdm.d("PopCounterComponent.onActivityPaused", new Object[0]);
        if (this.f != null) {
            this.h = SystemClock.elapsedRealtime();
            this.f.cancel();
        }
    }

    @Override // tb.ubm
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a0dbf0", new Object[]{this});
            return;
        }
        super.m();
        wdm.d("PopCounterComponent.onActivityResumed", new Object[0]);
        if (this.h > 0) {
            CountDownTimer countDownTimer = this.f;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            long elapsedRealtime = this.g - (SystemClock.elapsedRealtime() - this.h);
            this.g = elapsedRealtime;
            if (elapsedRealtime < 0) {
                this.g = 0L;
            }
            this.h = 0L;
            S();
        }
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49ced62e", new Object[]{this});
            return;
        }
        try {
            this.n = new ArrayList();
            this.q = new ArrayList();
            this.l = a1n.e(this.f29277a, ((CounterModel) this.b).marginalValue);
            boolean K = K(this.g);
            this.k = K;
            if (K) {
                String g = a1n.g(this.f29277a, ((CounterModel) this.b).overMarginalFormat);
                this.p = a1n.g(this.f29277a, ((CounterModel) this.b).overMarginalFormatType);
                if (TextUtils.isEmpty(g)) {
                    g = "{d}天{h}小时";
                }
                this.o = I(g, this.q);
                if (this.q.contains("{n}") || this.q.contains("{0n}")) {
                    this.j = true;
                }
            }
            String g2 = a1n.g(this.f29277a, ((CounterModel) this.b).format);
            if (TextUtils.isEmpty(g2)) {
                if (((CounterModel) this.b).showMilliseconds) {
                    g2 = "{0H}:{0m}:{0s}.{n}";
                } else {
                    g2 = "{0H}:{0m}:{0s}";
                }
            }
            this.m = I(g2, this.n);
            if (this.n.contains("{n}") || this.n.contains("{0n}")) {
                this.i = true;
            }
        } catch (Throwable th) {
            wdm.h("PopCounterComponent.initFormat.error", th);
            this.f29277a.s("CounterFormatError", "");
        }
    }

    @Override // tb.ubm
    public View c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        TextView textView = new TextView(context);
        this.e = textView;
        jl1 g = this.f29277a.g();
        CounterStyleModel counterStyleModel = ((CounterModel) this.b).style;
        i(textView, counterStyleModel);
        textView.setIncludeFontPadding(false);
        textView.setLines(1);
        try {
            textView.setTextSize(0, g.c(context, Float.parseFloat(counterStyleModel.fontSize)));
            if (!TextUtils.isEmpty(counterStyleModel.color)) {
                try {
                    textView.setTextColor(Color.parseColor(counterStyleModel.color));
                } catch (Throwable th) {
                    wdm.h("PopTextComponent.parseColor.textColor.error.", th);
                    oe8 oe8Var = this.f29277a;
                    oe8Var.s("COUNTER_COLOR_INVALID.ID=" + ((CounterModel) this.b).id, String.valueOf(th.getMessage()));
                    return textView;
                }
            }
            float parseFloat = !TextUtils.isEmpty(counterStyleModel.lineHeight) ? Float.parseFloat(counterStyleModel.lineHeight) : 0.0f;
            if (parseFloat > 0.0f && Build.VERSION.SDK_INT >= 28) {
                textView.setLineHeight((int) g.c(context, parseFloat));
            }
            if ("bold".equals(counterStyleModel.fontWeight) || "bolder".equals(counterStyleModel.fontWeight)) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
            }
            if ("center".equals(counterStyleModel.textAlign)) {
                textView.setGravity(17);
            } else if ("left".equals(counterStyleModel.textAlign)) {
                textView.setGravity(19);
            } else if ("right".equals(counterStyleModel.textAlign)) {
                textView.setGravity(21);
            }
            if ("auto".equals(((CounterModel) this.b).style.width)) {
                int paddingLeft = this.e.getPaddingLeft();
                int paddingRight = this.e.getPaddingRight();
                float parseFloat2 = Float.parseFloat(((CounterModel) this.b).style.appendWidth);
                TextView textView2 = this.e;
                int i = (int) (parseFloat2 / 2.0f);
                textView2.setPadding(paddingLeft + i, textView2.getPaddingTop(), paddingRight + i, this.e.getPaddingBottom());
            }
            J();
            H();
            S();
            return textView;
        } catch (Throwable th2) {
            wdm.h("PopTextComponent.parseFontSize.error.", th2);
            oe8 oe8Var2 = this.f29277a;
            oe8Var2.s("COUNTER_SIZE_INVALID.ID=" + ((CounterModel) this.b).id, String.valueOf(th2.getMessage()));
            return textView;
        }
    }

    @Override // tb.ubm
    public boolean n(String str, String str2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43d42ba2", new Object[]{this, str, str2})).booleanValue();
        }
        boolean n = super.n(str, str2);
        if (!n) {
            return n;
        }
        try {
            String string = JSON.parseObject(str2).getString("message");
            if (!"counterStart".equals(string)) {
                if ("counterCancel".equals(string)) {
                    if (this.r) {
                        CountDownTimer countDownTimer = this.f;
                        if (countDownTimer != null) {
                            countDownTimer.cancel();
                        }
                        this.r = false;
                    }
                }
                return z;
            } else if (!this.r) {
                R();
                this.r = true;
            }
            z = n;
            return z;
        } catch (Throwable th) {
            wdm.h("PopCounterComponent.onComponentBroadcast.error", th);
            return n;
        }
    }

    public final void P(long j, String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7fad555", new Object[]{this, new Long(j), str, list});
            return;
        }
        long j2 = j / 1000;
        long j3 = j2 / 3600;
        long j4 = j3 / 24;
        long j5 = j3 % 24;
        long j6 = j3;
        long j7 = (j2 / 60) % 60;
        long j8 = j2 % 60;
        long j9 = (j % 1000) / 100;
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            str2.hashCode();
            char c = 65535;
            switch (str2.hashCode()) {
                case 120560:
                    if (str2.equals("{H}")) {
                        c = 0;
                        break;
                    }
                    break;
                case 121428:
                    if (str2.equals("{d}")) {
                        c = 1;
                        break;
                    }
                    break;
                case 121552:
                    if (str2.equals("{h}")) {
                        c = 2;
                        break;
                    }
                    break;
                case 121707:
                    if (str2.equals("{m}")) {
                        c = 3;
                        break;
                    }
                    break;
                case 121738:
                    if (str2.equals("{n}")) {
                        c = 4;
                        break;
                    }
                    break;
                case 121893:
                    if (str2.equals("{s}")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3712778:
                    if (str2.equals("{0H}")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3713646:
                    if (str2.equals("{0d}")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3713770:
                    if (str2.equals("{0h}")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3713925:
                    if (str2.equals("{0m}")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 3713956:
                    if (str2.equals("{0n}")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 3714111:
                    if (str2.equals("{0s}")) {
                        c = 11;
                        break;
                    }
                    break;
                case 3734943:
                    if (str2.equals("{H+}")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 3761851:
                    if (str2.equals("{d+}")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 3765695:
                    if (str2.equals("{h+}")) {
                        c = 14;
                        break;
                    }
                    break;
                case 115093701:
                    if (str2.equals("{0H+}")) {
                        c = 15;
                        break;
                    }
                    break;
                case 115120609:
                    if (str2.equals("{0d+}")) {
                        c = 16;
                        break;
                    }
                    break;
                case 115124453:
                    if (str2.equals("{0h+}")) {
                        c = 17;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    j9 = j9;
                    j6 = j6;
                    arrayList.add(O(j6, false));
                    break;
                case 1:
                    arrayList.add(O(j4, false));
                    j9 = j9;
                    j6 = j6;
                    break;
                case 2:
                    arrayList.add(O(j5, false));
                    j9 = j9;
                    j6 = j6;
                    break;
                case 3:
                    arrayList.add(O(j7, false));
                    j9 = j9;
                    j6 = j6;
                    break;
                case 4:
                case '\n':
                    arrayList.add(O(j9, false));
                    j9 = j9;
                    j6 = j6;
                    break;
                case 5:
                    j9 = j9;
                    arrayList.add(O(j8, false));
                    j6 = j6;
                    break;
                case 6:
                    j9 = j9;
                    arrayList.add(O(j6, true));
                    j6 = j6;
                    break;
                case 7:
                    j9 = j9;
                    arrayList.add(O(j4, true));
                    j6 = j6;
                    break;
                case '\b':
                    j9 = j9;
                    arrayList.add(O(j5, true));
                    j6 = j6;
                    break;
                case '\t':
                    j9 = j9;
                    arrayList.add(O(j7, true));
                    j6 = j6;
                    break;
                case 11:
                    j9 = j9;
                    arrayList.add(O(j8, true));
                    j6 = j6;
                    break;
                case '\f':
                    j9 = j9;
                    arrayList.add(O(j6 + 1, false));
                    j6 = j6;
                    break;
                case '\r':
                    j9 = j9;
                    arrayList.add(O(j4 + 1, false));
                    j6 = j6;
                    break;
                case 14:
                    j9 = j9;
                    arrayList.add(O(j5 + 1, false));
                    j6 = j6;
                    break;
                case 15:
                    j9 = j9;
                    arrayList.add(O(j6 + 1, true));
                    j6 = j6;
                    break;
                case 16:
                    j9 = j9;
                    arrayList.add(O(j4 + 1, true));
                    j6 = j6;
                    break;
                case 17:
                    j9 = j9;
                    arrayList.add(O(j5 + 1, true));
                    j6 = j6;
                    break;
                default:
                    j9 = j9;
                    j6 = j6;
                    break;
            }
        }
        this.e.setText(String.format(str, arrayList.toArray()));
    }
}
