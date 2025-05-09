package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class he implements hi {

    /* renamed from: a  reason: collision with root package name */
    private String f14922a;

    /* renamed from: a  reason: collision with other field name */
    private List<he> f1091a;

    /* renamed from: a  reason: collision with other field name */
    private String[] f1092a;
    private String b;

    /* renamed from: b  reason: collision with other field name */
    private String[] f1093b;
    private String c;

    public he(String str, String str2, String[] strArr, String[] strArr2) {
        this.f1091a = null;
        this.f14922a = str;
        this.b = str2;
        this.f1092a = strArr;
        this.f1093b = strArr2;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("ext_ele_name", this.f14922a);
        bundle.putString("ext_ns", this.b);
        bundle.putString("ext_text", this.c);
        Bundle bundle2 = new Bundle();
        String[] strArr = this.f1092a;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.f1092a;
                if (i >= strArr2.length) {
                    break;
                }
                bundle2.putString(strArr2[i], this.f1093b[i]);
                i++;
            }
        }
        bundle.putBundle("attributes", bundle2);
        List<he> list = this.f1091a;
        if (list != null && list.size() > 0) {
            bundle.putParcelableArray("children", a(this.f1091a));
        }
        return bundle;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        if (!TextUtils.isEmpty(this.c)) {
            return hs.b(this.c);
        }
        return this.c;
    }

    @Override // com.xiaomi.push.hi
    public String d() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f14922a);
        if (!TextUtils.isEmpty(this.b)) {
            sb.append(" xmlns=\"");
            sb.append(this.b);
            sb.append("\"");
        }
        String[] strArr = this.f1092a;
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < this.f1092a.length; i++) {
                if (!TextUtils.isEmpty(this.f1093b[i])) {
                    sb.append(" ");
                    sb.append(this.f1092a[i]);
                    sb.append("=\"");
                    sb.append(hs.a(this.f1093b[i]));
                    sb.append("\"");
                }
            }
        }
        if (!TextUtils.isEmpty(this.c)) {
            sb.append(">");
            sb.append(this.c);
        } else {
            List<he> list = this.f1091a;
            if (list == null || list.size() <= 0) {
                sb.append("/>");
                return sb.toString();
            }
            sb.append(">");
            for (he heVar : this.f1091a) {
                sb.append(heVar.d());
            }
        }
        sb.append("</");
        sb.append(this.f14922a);
        sb.append(">");
        return sb.toString();
    }

    public String toString() {
        return d();
    }

    public he(String str, String str2, String[] strArr, String[] strArr2, String str3, List<he> list) {
        this.f14922a = str;
        this.b = str2;
        this.f1092a = strArr;
        this.f1093b = strArr2;
        this.c = str3;
        this.f1091a = list;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Parcelable m753a() {
        return a();
    }

    public static he a(Bundle bundle) {
        ArrayList arrayList;
        String string = bundle.getString("ext_ele_name");
        String string2 = bundle.getString("ext_ns");
        String string3 = bundle.getString("ext_text");
        Bundle bundle2 = bundle.getBundle("attributes");
        Set<String> keySet = bundle2.keySet();
        String[] strArr = new String[keySet.size()];
        String[] strArr2 = new String[keySet.size()];
        int i = 0;
        for (String str : keySet) {
            strArr[i] = str;
            strArr2[i] = bundle2.getString(str);
            i++;
        }
        if (bundle.containsKey("children")) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("children");
            ArrayList arrayList2 = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList2.add(a((Bundle) parcelable));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new he(string, string2, strArr, strArr2, string3, arrayList);
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m754a() {
        return this.f14922a;
    }

    public String a(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        } else if (this.f1092a == null) {
            return null;
        } else {
            int i = 0;
            while (true) {
                String[] strArr = this.f1092a;
                if (i >= strArr.length) {
                    return null;
                }
                if (str.equals(strArr[i])) {
                    return this.f1093b[i];
                }
                i++;
            }
        }
    }

    public void a(he heVar) {
        if (this.f1091a == null) {
            this.f1091a = new ArrayList();
        }
        if (!this.f1091a.contains(heVar)) {
            this.f1091a.add(heVar);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m755a(String str) {
        if (!TextUtils.isEmpty(str)) {
            str = hs.a(str);
        }
        this.c = str;
    }

    public static Parcelable[] a(List<he> list) {
        return a((he[]) list.toArray(new he[list.size()]));
    }

    public static Parcelable[] a(he[] heVarArr) {
        if (heVarArr == null) {
            return null;
        }
        Parcelable[] parcelableArr = new Parcelable[heVarArr.length];
        for (int i = 0; i < heVarArr.length; i++) {
            parcelableArr[i] = heVarArr[i].m753a();
        }
        return parcelableArr;
    }
}
