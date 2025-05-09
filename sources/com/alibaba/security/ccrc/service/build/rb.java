package com.alibaba.security.ccrc.service.build;

import android.text.TextUtils;
import com.alibaba.security.ccrc.common.http.model.VersionInfo;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.obk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2619a = "CcrcCodeOrangeService";
    public static final String b = "wukong_";
    public final String d;
    public xb e;
    public final obk f = new qb(this);
    public final wb c = new wb(CcrcContextImpl.getContext());

    public rb(String str) {
        this.d = str;
    }

    public static /* synthetic */ xb b(rb rbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xb) ipChange.ipc$dispatch("ca408393", new Object[]{rbVar});
        }
        return rbVar.e;
    }

    public static /* synthetic */ wb c(rb rbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wb) ipChange.ipc$dispatch("c9670f31", new Object[]{rbVar});
        }
        return rbVar.c;
    }

    public void a(xb xbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("331e0a2", new Object[]{this, xbVar});
        } else if (!TextUtils.isEmpty(this.d)) {
            this.e = xbVar;
            OrangeConfig.getInstance().registerListener(new String[]{this.d}, this.f, true);
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String config = OrangeConfig.getInstance().getConfig(this.d, VersionInfo.ORANGE_SP_KEY_CONFIG_MD5, "");
        return TextUtils.isEmpty(config) ? (String) this.c.a(a(this.d), VersionInfo.ORANGE_SP_KEY_CONFIG_MD5, "") : config;
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        return b + str;
    }
}
