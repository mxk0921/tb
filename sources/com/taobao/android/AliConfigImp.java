package com.taobao.android;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import tb.f7l;
import tb.t2o;
import tb.wo0;
import tb.xo0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AliConfigImp implements AliConfigInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AliConfigImp c = new AliConfigImp(OrangeConfig.getInstance());

    /* renamed from: a  reason: collision with root package name */
    public final OrangeConfig f6239a;
    public final HashMap<wo0, xo0> b = new HashMap<>();

    static {
        t2o.a(613416961);
    }

    public AliConfigImp(OrangeConfig orangeConfig) {
        this.f6239a = orangeConfig;
    }

    public static AliConfigImp getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliConfigImp) ipChange.ipc$dispatch("7ce42184", new Object[0]);
        }
        return c;
    }

    @Override // com.taobao.android.AliConfigInterface
    public void a(String[] strArr, wo0 wo0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d433d36", new Object[]{this, strArr, wo0Var});
            return;
        }
        synchronized (this.b) {
            try {
                xo0 xo0Var = this.b.get(wo0Var);
                if (xo0Var != null) {
                    this.f6239a.unregisterListener(strArr, xo0Var);
                    this.b.remove(wo0Var);
                    StringBuilder sb = new StringBuilder("unregisterListener(");
                    sb.append(Arrays.toString(strArr));
                    sb.append(", ");
                    sb.append(wo0Var);
                    sb.append(f7l.BRACKET_END_STR);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.taobao.android.AliConfigInterface
    public void b(String[] strArr, wo0 wo0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7902c32f", new Object[]{this, strArr, wo0Var});
            return;
        }
        synchronized (this.b) {
            try {
                xo0 xo0Var = this.b.get(wo0Var);
                if (xo0Var == null) {
                    xo0Var = new xo0(wo0Var);
                    this.b.put(wo0Var, xo0Var);
                }
                this.f6239a.registerListener(strArr, xo0Var, false);
                Arrays.toString(strArr);
                Objects.toString(wo0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.taobao.android.AliConfigInterface
    public String getConfig(String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        if (TextUtils.isEmpty(str2)) {
            str4 = this.f6239a.getCustomConfig(str, str3);
        } else {
            str4 = this.f6239a.getConfig(str, str2, str3);
        }
        StringBuilder sb = new StringBuilder("getConfig(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(")=");
        sb.append(str4);
        return str4;
    }

    @Override // com.taobao.android.AliConfigInterface
    public Map<String, String> getConfigs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6165ac1", new Object[]{this, str});
        }
        Map<String, String> configs = this.f6239a.getConfigs(str);
        StringBuilder sb = new StringBuilder("getConfigs(");
        sb.append(str);
        sb.append(")=");
        sb.append(configs);
        return configs;
    }
}
