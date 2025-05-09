package com.taobao.monitor;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.d;
import java.util.HashMap;
import java.util.Map;
import tb.xxi;
import tb.zq6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ProcedureGlobal {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f11075a;
    public final Map<String, Float> d = new HashMap();
    public String e;
    public static final ProcedureGlobal f = new ProcedureGlobal();
    public static final xxi PROCEDURE_MANAGER = new xxi();
    public static final d PROCEDURE_FACTORY = new d();

    public static ProcedureGlobal f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProcedureGlobal) ipChange.ipc$dispatch("c8da743b", new Object[0]);
        }
        return f;
    }

    public static float g(String str, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b28e69b6", new Object[]{str, new Float(f2)})).floatValue();
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return Float.parseFloat(str);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return f2;
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("267167ae", new Object[]{this});
        }
        return this.f11075a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("303a22dd", new Object[]{this});
        }
        return this.e;
    }

    public float c(String str) {
        Float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb3fffa", new Object[]{this, str})).floatValue();
        }
        if (!TextUtils.isEmpty(str) && (f2 = (Float) ((HashMap) this.d).get(str)) != null && f2.floatValue() >= 0.0f && f2.floatValue() <= 1.0f) {
            return f2.floatValue();
        }
        return 1.0f;
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d65a39", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public ProcedureGlobal i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProcedureGlobal) ipChange.ipc$dispatch("7d083e83", new Object[]{this, context});
        }
        this.f11075a = context;
        return this;
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f93577e", new Object[]{this, str});
            return;
        }
        try {
            ((HashMap) this.d).clear();
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(",");
                if (split.length > 0) {
                    for (String str2 : split) {
                        String[] split2 = str2.split(":");
                        if (split2.length == 2 && !TextUtils.isEmpty(split2[0]) && !TextUtils.isEmpty(split2[1])) {
                            ((HashMap) this.d).put(split2[0], Float.valueOf(g(split2[1], 1.0f)));
                        }
                    }
                }
            }
        } catch (Exception e) {
            zq6.a("ProcedureGlobal", "setSubTaskSample error", e.getMessage());
        }
    }
}
