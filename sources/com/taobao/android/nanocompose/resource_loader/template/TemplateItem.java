package com.taobao.android.nanocompose.resource_loader.template;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.a;
import tb.ckf;
import tb.en9;
import tb.njg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class TemplateItem {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f9022a;
    public final long b;
    public final String c;
    public boolean e;
    public String d = "";
    public final njg f = a.b(new TemplateItem$identifier$2(this));

    static {
        t2o.a(598737232);
    }

    public TemplateItem(String str, long j, String str2) {
        ckf.g(str, "name");
        ckf.g(str2, "url");
        this.f9022a = str;
        this.b = j;
        this.c = str2;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60a671d7", new Object[]{this});
        }
        return this.d;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this});
        }
        return (String) this.f.getValue();
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.f9022a;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.c;
    }

    public final long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d6bc1d", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateItem)) {
            return false;
        }
        TemplateItem templateItem = (TemplateItem) obj;
        if (ckf.b(this.f9022a, templateItem.f9022a) && this.b == templateItem.b && ckf.b(this.c, templateItem.c)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68bf0f49", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (this.f9022a.length() <= 0 || this.b == 0) {
            return false;
        }
        return true;
    }

    public final void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88efff67", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((this.f9022a.hashCode() * 31) + en9.a(this.b)) * 31) + this.c.hashCode();
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("216dec7f", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.d = str;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TemplateItem(name=" + this.f9022a + ", version=" + this.b + ", url=" + this.c + ')';
    }
}
