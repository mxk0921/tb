package com.taobao.android.upp;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.upp.d;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f9879a;
    public final String b;
    public final String c;
    public final WeakReference<d.b> d;
    public final JSONObject e;

    static {
        t2o.a(404750774);
    }

    public f(String str, JSONObject jSONObject, String str2, d.b bVar) {
        this.d = null;
        this.e = null;
        this.f9879a = str;
        this.b = str2;
        this.c = str + str2;
        this.e = jSONObject;
        this.d = new WeakReference<>(bVar);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this});
        }
        return this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c2f1a3", new Object[]{this});
        }
        return this.f9879a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("206169f7", new Object[]{this});
        }
        return this.c;
    }

    public String toString() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("UPPResourceScheme{mSchemeId='");
        sb.append(this.f9879a);
        sb.append("', mInstanceId='");
        sb.append(this.b);
        sb.append("', mUniqueId='");
        sb.append(this.c);
        sb.append("', mCallback=");
        WeakReference<d.b> weakReference = this.d;
        if (weakReference == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(weakReference.hashCode());
        }
        sb.append(obj);
        sb.append(", mBizParams=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }

    public f(String str, JSONObject jSONObject, String str2, d.b bVar, a aVar) {
        this(str, jSONObject, str2, bVar);
    }
}
