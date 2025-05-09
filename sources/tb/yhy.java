package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yhy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HOT_TREND_BACKGROUND_END_COLOR = "hotTrendBackgroundEndColor";
    public static final String HOT_TREND_BACKGROUND_START_COLOR = "hotTrendBackgroundStartColor";
    public static final String HOT_TREND_TOP_MARGIN = "hotTrendHeaderTopMargin";
    public static final String INFO_FLOW_BACKGROUND_COLOR = "infoFlowBackgroundColor";
    public static final String NORMAL_TREND_BACKGROUND_END_COLOR = "normalTrendBackgroundEndColor";
    public static final String NORMAL_TREND_BACKGROUND_START_COLOR = "normalTrendBackgroundStartColor";
    public static final String NORMAL_TREND_TOP_MARGIN = "normalTrendHeaderTopMargin";
    public static final String TREND_HEADER_CORNER_RADIUS = "trendHeaderCornerRadius";

    /* renamed from: a  reason: collision with root package name */
    public int f32106a;
    public int b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;

    static {
        t2o.a(918552710);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0b2d87d", new Object[]{this});
        }
        String str = this.e;
        if (str == null) {
            return "#FCFCFE";
        }
        return str;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6726644", new Object[]{this});
        }
        String str = this.d;
        if (str == null) {
            return "#E5E3FC";
        }
        return str;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f963c82a", new Object[]{this})).intValue();
        }
        int i = this.f32106a;
        if (i == 0) {
            return 90;
        }
        return i;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b28972d6", new Object[]{this});
        }
        String str = this.h;
        if (str == null) {
            return why.DEFAULT_MASK_BACKGROUND_COLOR;
        }
        return str;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("141fe243", new Object[]{this});
        }
        String str = this.g;
        if (str == null) {
            return "#FFFFFF";
        }
        return str;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12c4168a", new Object[]{this});
        }
        String str = this.f;
        if (str == null) {
            return "#F3F6F8";
        }
        return str;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87a6f0f0", new Object[]{this})).intValue();
        }
        int i = this.b;
        if (i == 0) {
            return 72;
        }
        return i;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87049b5", new Object[]{this})).intValue();
        }
        int i = this.c;
        if (i == 0) {
            return 6;
        }
        return i;
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ee2699", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5b3eb2", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dff14b8", new Object[]{this, new Integer(i)});
        } else {
            this.f32106a = i;
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e508c8", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4de6dffb", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f90b2794", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab4d31a", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c48d", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }
}
