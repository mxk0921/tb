package com.vivo.push.model;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private String f14615a;
    private String b;

    public a(String str, String str2) {
        this.f14615a = str;
        this.b = str2;
    }

    public final String a() {
        return this.f14615a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f14615a;
        if (str == null) {
            if (aVar.f14615a != null) {
                return false;
            }
        } else if (!str.equals(aVar.f14615a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String str = this.f14615a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return i + 31;
    }

    public final String toString() {
        return "ConfigItem{mKey='" + this.f14615a + "', mValue='" + this.b + "'}";
    }
}
