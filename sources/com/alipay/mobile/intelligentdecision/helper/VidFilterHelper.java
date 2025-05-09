package com.alipay.mobile.intelligentdecision.helper;

import android.text.TextUtils;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VidFilterHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile VidFilterHelper c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, String> f4234a = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();

    public static VidFilterHelper a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VidFilterHelper) ipChange.ipc$dispatch("e7d12015", new Object[0]);
        }
        if (c == null) {
            synchronized (VidFilterHelper.class) {
                try {
                    if (c == null) {
                        c = new VidFilterHelper();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            DecisionLogcat.a("VidFilterHelper", "havePredit error:" + th.getMessage());
        }
        if (!TextUtils.isEmpty(str) && str2.equalsIgnoreCase("pay_enter")) {
            DecisionLogcat.b("VidFilterHelper", "pre size:" + this.b.size());
            if (this.b.containsKey(str)) {
                if (this.b.size() >= 10) {
                    this.b.clear();
                    this.b.put(str, "");
                }
                DecisionLogcat.b("VidFilterHelper", "havePredit:" + str);
                return true;
            }
            if (this.b.size() >= 10) {
                this.b.clear();
            }
            this.b.put(str, "");
            return false;
        }
        return false;
    }

    public final boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            DecisionLogcat.a("VidFilterHelper", "haveCollect error:" + th.getMessage());
        }
        if (!TextUtils.isEmpty(str) && str2.equalsIgnoreCase("pay_enter")) {
            DecisionLogcat.b("VidFilterHelper", "collect size:" + this.f4234a.size());
            if (this.f4234a.containsKey(str)) {
                if (this.f4234a.size() >= 10) {
                    this.f4234a.clear();
                    this.f4234a.put(str, "");
                }
                DecisionLogcat.b("VidFilterHelper", "haveCollect:" + str);
                return true;
            }
            if (this.f4234a.size() >= 10) {
                this.f4234a.clear();
            }
            this.f4234a.put(str, "");
            return false;
        }
        return false;
    }
}
