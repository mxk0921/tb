package com.taobao.android.detail2.core.framework.data.global;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.navigation.TBFragmentTabHost;
import tb.cxj;
import tb.cxo;
import tb.o2r;
import tb.rra;
import tb.t2o;
import tb.txj;
import tb.xmo;
import tb.y9a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NewDetailScreenConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Double f7120a;
    public float b;
    public int c;
    public int d;
    public int e;
    public ScreenType f;
    public Context g;
    public cxj h;
    public boolean i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum ScreenType {
        PAD_PORTRAIT("portrait", "pad_portrait"),
        PAD_LANDSCAPE("landScape", "pad_landscape"),
        FOLD_DEVICE_PORTRAIT("", "fold_device_portrait"),
        FOLD_DEVICE_LANDSCAPE("landScape", "fold_device_landscape"),
        NORMAL_PHONE("", "normal_phone");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String mTypeStr;
        private String mUIStrategyTag;

        ScreenType(String str, String str2) {
            this.mUIStrategyTag = str;
            this.mTypeStr = str2;
        }

        public static /* synthetic */ Object ipc$super(ScreenType screenType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/data/global/NewDetailScreenConfig$ScreenType");
        }

        public static ScreenType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ScreenType) ipChange.ipc$dispatch("1e4307fa", new Object[]{str});
            }
            return (ScreenType) Enum.valueOf(ScreenType.class, str);
        }

        public String getTypeStr() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("69d8f538", new Object[]{this});
            }
            return this.mTypeStr;
        }

        public String getUIStrategyTag() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bc676abc", new Object[]{this});
            }
            return this.mUIStrategyTag;
        }
    }

    static {
        t2o.a(352321786);
    }

    public NewDetailScreenConfig(cxj cxjVar) {
        o2r.a("NewDetailScreenConfig");
        this.h = cxjVar;
        this.g = cxjVar.i();
        h();
        g();
        o2r.b();
    }

    public ScreenType a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScreenType) ipChange.ipc$dispatch("e8ea2030", new Object[]{this});
        }
        return this.f;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e81b5e13", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c355cd0", new Object[]{this})).floatValue();
        }
        return this.b;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41ca1e", new Object[]{this});
        } else if (this.i || i()) {
            int i = xmo.p(this.g).f19556a;
            if (i > 0) {
                n(i);
                return;
            }
            TBFragmentTabHost fragmentTabHost = TBMainHost.b().getFragmentTabHost();
            if (fragmentTabHost != null) {
                i = fragmentTabHost.getBottom();
            }
            if (i > 0) {
                n(i);
            } else {
                n(this.c);
            }
        }
    }

    public final void f() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74a289c4", new Object[]{this});
            return;
        }
        this.e = cxo.b(y9a.b());
        this.c = cxo.a(y9a.b());
        this.f7120a = Double.valueOf((this.e * 1.0d) / 750.0d);
        boolean P = TBDeviceUtils.P(this.g);
        boolean p = TBDeviceUtils.p(this.g);
        if (!P && !p) {
            z = true;
        }
        this.i = z;
        e();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2b2493", new Object[]{this});
            return;
        }
        this.e = cxo.b(this.g);
        this.c = cxo.a(this.g);
        this.f7120a = Double.valueOf((this.e * 1.0d) / 750.0d);
        e();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d6f47d", new Object[]{this});
        } else {
            m();
        }
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18966400", new Object[]{this})).booleanValue();
        }
        if (this.f == null) {
            return false;
        }
        String q = xmo.q(this.g, "");
        if (TextUtils.isEmpty(q)) {
            return true;
        }
        return TextUtils.equals(q, this.f.getTypeStr());
    }

    public int j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac597dea", new Object[]{this, new Integer(i)})).intValue();
        }
        return (int) Math.ceil(i * this.f7120a.doubleValue());
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc18edc", new Object[]{this, new Integer(i)});
            return;
        }
        this.e = cxo.b(this.g);
        this.c = cxo.a(this.g);
        this.f7120a = Double.valueOf((this.e * 1.0d) / 750.0d);
        n(i);
        Context context = this.g;
        if (context instanceof Activity) {
            int i2 = this.d;
            xmo.E(context, i2, this.e, (int) rra.b(this.h, i2, this.b));
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b742a308", new Object[]{this});
            return;
        }
        txj.e(txj.TAG_RENDER, "refreshScreenType");
        m();
        xmo.F(this.g, this.f.getTypeStr());
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("225ea1dc", new Object[]{this});
            return;
        }
        boolean P = TBDeviceUtils.P(this.g);
        boolean p = TBDeviceUtils.p(this.g);
        if (P) {
            if (TBAutoSizeConfig.x().T(this.g)) {
                this.f = ScreenType.PAD_PORTRAIT;
            } else {
                this.f = ScreenType.PAD_LANDSCAPE;
            }
            this.i = false;
        } else if (p) {
            if (TBAutoSizeConfig.x().T(this.g)) {
                this.f = ScreenType.FOLD_DEVICE_PORTRAIT;
            } else {
                this.f = ScreenType.FOLD_DEVICE_LANDSCAPE;
            }
            this.i = false;
        } else {
            this.f = ScreenType.NORMAL_PHONE;
            this.i = true;
        }
    }

    public final void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cffe26fa", new Object[]{this, new Integer(i)});
            return;
        }
        this.d = i;
        txj.e(txj.TAG_RENDER, "刷新有效内容展示高度以及屏幕比例，mScreenValidHeight: " + this.d);
        this.b = ((float) this.e) / ((float) this.d);
    }

    public void o(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f13d8", new Object[]{this, cxjVar});
            return;
        }
        txj.e(txj.TAG_RENDER, "refreshWhenOnScreen");
        this.h = cxjVar;
        this.g = cxjVar.i();
        h();
        if (!this.i) {
            g();
        }
    }

    public NewDetailScreenConfig() {
        o2r.a("NewDetailScreenConfigWithOutContext");
        f();
        o2r.b();
    }
}
