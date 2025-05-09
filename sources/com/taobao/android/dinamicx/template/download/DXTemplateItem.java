package com.taobao.android.dinamicx.template.download;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import tb.cb5;
import tb.t2o;
import tb.xh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXTemplateItem {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_VERSION = -1;
    public static final byte TEMPLATE_CACHE_PRIORITY_DEFAULT = 0;
    public static final byte TEMPLATE_CACHE_PRIORITY_HIGH = 1;
    public static final int TYPE_CHECK_DOWNLOAING = 2;
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_REMOTE_CHILD = 1;

    /* renamed from: a  reason: collision with root package name */
    public String f7343a;
    public String c;
    public Collection<String> d;
    public String e;
    public xh6 k;
    public long b = -1;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public int l = 0;
    public int m = 0;
    public Boolean n = null;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface TemplateType {
    }

    static {
        t2o.a(444597005);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b6d1a5f", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f7343a) || this.b <= -1) {
            return false;
        }
        return true;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf22e3", new Object[]{this, str});
            return;
        }
        this.n = Boolean.FALSE;
        cb5.e(str, this.f7343a);
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a8cf400", new Object[]{this})).intValue();
        }
        return this.l;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.e)) {
            this.e = this.f7343a + " : " + this.b;
        }
        return this.e;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.f7343a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DXTemplateItem dXTemplateItem = (DXTemplateItem) obj;
        String str = this.f7343a;
        if (str == null ? dXTemplateItem.f7343a != null : !str.equals(dXTemplateItem.f7343a)) {
            return false;
        }
        if (this.l == dXTemplateItem.l && this.b == dXTemplateItem.b) {
            return true;
        }
        return false;
    }

    public byte f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c2db0a9", new Object[]{this})).byteValue();
        }
        return (byte) 0;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b9c64c4", new Object[]{this})).intValue();
        }
        return this.m;
    }

    public long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d6bc1d", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return d().hashCode();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74767dfd", new Object[]{this});
        } else {
            this.n = null;
        }
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc507ac6", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b0e95a2", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c386b4c6", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "name=" + this.f7343a + "version=" + this.b + "templateUrl=" + this.c;
    }

    public boolean i(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f02d4682", new Object[]{this, str})).booleanValue();
        }
        Boolean bool = this.n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!this.h || (!this.g && !cb5.c(str, this.f7343a))) {
            z = false;
        }
        this.n = Boolean.valueOf(z);
        return z;
    }
}
