package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class m43 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean g = false;

    /* renamed from: a  reason: collision with root package name */
    public String f23765a = "Unknown";
    public Boolean b = Boolean.TRUE;
    public String c = "";
    public String d = "";
    public String e = "";
    public Boolean f = Boolean.FALSE;

    static {
        t2o.a(730857580);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd33576e", new Object[0]);
        } else if (!g) {
            g = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add("success");
            arrayList.add("failure");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("ava_type");
            arrayList2.add("err_type");
            arrayList2.add("err_msg");
            arrayList2.add("pssource");
            arrayList2.add("say_bye_2_back_source");
            jzu.m("PLT", "CaptureAva", arrayList, arrayList2);
        }
    }

    public static void d(m43 m43Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd5c719b", new Object[]{m43Var});
        } else if (m43Var != null) {
            c();
            HashMap hashMap = new HashMap();
            e(m43Var, hashMap);
            HashMap hashMap2 = new HashMap();
            if (m43Var.b.booleanValue()) {
                hashMap2.put("success", Double.valueOf(1.0d));
                hashMap2.put("failure", Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT));
            } else {
                hashMap2.put("success", Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT));
                hashMap2.put("failure", Double.valueOf(1.0d));
            }
            jzu.d("PLT", "CaptureAva", hashMap2, hashMap);
        }
    }

    public static void e(m43 m43Var, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d104914c", new Object[]{m43Var, map});
            return;
        }
        map.put("pssource", m43Var.e);
        map.put("ava_type", m43Var.f23765a);
        map.put("device_level", String.valueOf(ri7.b()));
        map.put("say_bye_2_back_source", m43Var.f.toString());
        if (!m43Var.b.booleanValue()) {
            String str = "unknown";
            map.put("err_type", TextUtils.isEmpty(m43Var.c) ? str : m43Var.c);
            if (!TextUtils.isEmpty(m43Var.d)) {
                str = m43Var.d;
            }
            map.put("err_msg", str);
        }
    }

    public void a(String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae957ac", new Object[]{this, str, str2, str3, str4, new Boolean(z)});
            return;
        }
        this.f23765a = str;
        this.b = Boolean.FALSE;
        if (TextUtils.isEmpty(str2)) {
            str2 = "unknown";
        }
        this.c = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = "unknown";
        }
        this.d = str3;
        this.e = str4;
        this.f = Boolean.valueOf(z);
        d(this);
    }

    public void b(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7537fde7", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        this.f23765a = str;
        this.b = Boolean.TRUE;
        this.e = str2;
        this.f = Boolean.valueOf(z);
        d(this);
    }
}
