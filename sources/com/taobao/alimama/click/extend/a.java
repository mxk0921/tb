package com.taobao.alimama.click.extend;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.click.extend.ExtendClickLink;
import java.util.HashMap;
import java.util.Map;
import tb.gs8;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ExtendClickLink> f6179a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final a f6180a = new a();

        static {
            t2o.a(1017118754);
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("292f9236", new Object[0]);
            }
            return f6180a;
        }
    }

    static {
        t2o.a(1017118752);
    }

    public static a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5ba07dd2", new Object[0]);
        }
        return b.a();
    }

    public final boolean a(ExtendClickLink extendClickLink) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7eead6ce", new Object[]{this, extendClickLink})).booleanValue();
        }
        if (extendClickLink == null) {
            return false;
        }
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (Integer.parseInt(extendClickLink.b()) < 100) {
            throw new IllegalArgumentException("etype 不合法，自定义链路etype需大于等于100");
        } else if (TextUtils.isEmpty(extendClickLink.b()) || extendClickLink.a() == ExtendClickLink.CustomClickType.NONE) {
            return false;
        } else {
            return true;
        }
    }

    public ExtendClickLink b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtendClickLink) ipChange.ipc$dispatch("805b571e", new Object[]{this, str});
        }
        return (ExtendClickLink) ((HashMap) this.f6179a).get(str);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
            return;
        }
        ExtendClickLink.a g = new ExtendClickLink.a().f("100").g("mtop.ali.ad.settle.tianhe.click");
        ExtendClickLink.CustomClickType customClickType = ExtendClickLink.CustomClickType.CPM;
        e(g.e(customClickType).d());
        e(new gs8(new ExtendClickLink.a().f("101").e(customClickType)));
    }

    public void e(ExtendClickLink extendClickLink) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2be7325", new Object[]{this, extendClickLink});
        } else if (a(extendClickLink)) {
            if (!((HashMap) this.f6179a).containsKey(extendClickLink.b())) {
                ((HashMap) this.f6179a).put(extendClickLink.b(), extendClickLink);
                return;
            }
            throw new IllegalArgumentException("etype 重复注册，请检查etype类型");
        }
    }

    public a() {
        this.f6179a = new HashMap();
        d();
    }
}
