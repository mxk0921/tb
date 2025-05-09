package com.taobao.android.abilitykit.mega;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.a;
import tb.a07;
import tb.ckf;
import tb.m8;
import tb.njg;
import tb.t2o;
import tb.t3i;
import tb.w8;
import tb.yji;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MegaHubBuilder<DATA> implements w8<DATA> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final njg f6281a;
    public final String b;
    public final String c;
    public final t3i d;

    static {
        t2o.a(336593070);
        t2o.a(336592930);
    }

    public MegaHubBuilder(String str, String str2) {
        this(str, str2, null, 4, null);
    }

    public static final /* synthetic */ t3i a(MegaHubBuilder megaHubBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t3i) ipChange.ipc$dispatch("79c44b35", new Object[]{megaHubBuilder});
        }
        return megaHubBuilder.d;
    }

    public static final /* synthetic */ String b(MegaHubBuilder megaHubBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2845e29", new Object[]{megaHubBuilder});
        }
        return megaHubBuilder.c;
    }

    public static final /* synthetic */ String c(MegaHubBuilder megaHubBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ee39dea", new Object[]{megaHubBuilder});
        }
        return megaHubBuilder.b;
    }

    @Override // tb.w8
    public m8<?> build(DATA data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m8) ipChange.ipc$dispatch("e57df123", new Object[]{this, data});
        }
        return d();
    }

    public final yji d() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("7f21480d", new Object[]{this});
        } else {
            value = this.f6281a.getValue();
        }
        return (yji) value;
    }

    public MegaHubBuilder(String str, String str2, t3i t3iVar) {
        ckf.g(str, "megaName");
        ckf.g(str2, "megaApi");
        this.b = str;
        this.c = str2;
        this.d = t3iVar;
        this.f6281a = a.b(new MegaHubBuilder$wrapper$2(this));
    }

    public /* synthetic */ MegaHubBuilder(String str, String str2, t3i t3iVar, int i, a07 a07Var) {
        this(str, str2, (i & 4) != 0 ? null : t3iVar);
    }
}
