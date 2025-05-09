package com.taobao.search.mmd.datasource.bean;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SFPromotionBean {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_BAR_DARK = 10001;
    public static final int STATUS_BAR_LIGHT = 10002;
    public static final int STATUS_BAR_UNDEFINED = 10000;

    /* renamed from: a  reason: collision with root package name */
    public int f11550a = 10001;
    public String b;
    public int c;
    public int d;
    public int e;

    /* compiled from: Taobao */
    @Target({ElementType.PARAMETER, ElementType.FIELD})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface ActionBarStatus {
    }

    static {
        t2o.a(815792508);
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91d575aa", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 10000;
        }
        str.hashCode();
        if (str.equals(ThemeUtils.COLOR_SCHEME_DARK)) {
            return 10001;
        }
        if (!str.equals("light")) {
            return 10000;
        }
        return 10002;
    }

    /* renamed from: a */
    public SFPromotionBean clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SFPromotionBean) ipChange.ipc$dispatch("8ac760c9", new Object[]{this});
        }
        SFPromotionBean sFPromotionBean = new SFPromotionBean();
        sFPromotionBean.d = this.d;
        sFPromotionBean.e = this.e;
        sFPromotionBean.f11550a = this.f11550a;
        sFPromotionBean.c = this.c;
        sFPromotionBean.b = this.b;
        return sFPromotionBean;
    }

    public final String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4543608", new Object[]{this, new Integer(i)});
        }
        if (i == 10001) {
            return ThemeUtils.COLOR_SCHEME_DARK;
        }
        if (i != 10002) {
            return "unknown";
        }
        return "light";
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || SFPromotionBean.class != obj.getClass()) {
            return false;
        }
        SFPromotionBean sFPromotionBean = (SFPromotionBean) obj;
        if (this.f11550a == sFPromotionBean.f11550a && this.c == sFPromotionBean.c && this.d == sFPromotionBean.d && this.e == sFPromotionBean.e) {
            return TextUtils.equals(this.b, sFPromotionBean.b);
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i2 = this.f11550a * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((i2 + i) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SFPromotionBean{actionBarStatus=" + c(this.f11550a) + ", backgroundImgUrl='" + this.b + "', backgroundColor=" + this.c + ", tabTextNormalColor=" + this.d + ", tabTextSelectedColor=" + this.e + '}';
    }
}
