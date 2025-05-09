package com.taobao.android.abilitykit.ability.pop.render;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.MegaUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.List;
import tb.a07;
import tb.a8;
import tb.a9;
import tb.ckf;
import tb.h9;
import tb.hp6;
import tb.iab;
import tb.iih;
import tb.n9;
import tb.pr;
import tb.t2o;
import tb.zz1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AKFragmentPopRender<P extends a9, CONTEXT extends n9> extends zz1<P, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String UT_PAGE_FLAG_KEY = "__fragment_as_ut_page__";
    public FragmentActivity d;
    public ViewGroup e;
    public Fragment f;
    public final Fragment g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(336593013);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(336593012);
    }

    public AKFragmentPopRender(Fragment fragment) {
        this.g = fragment;
    }

    public static final /* synthetic */ Object c(AKFragmentPopRender aKFragmentPopRender, FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4f55c40c", new Object[]{aKFragmentPopRender, fragmentActivity});
        }
        return aKFragmentPopRender.f(fragmentActivity);
    }

    public static final /* synthetic */ Fragment d(AKFragmentPopRender aKFragmentPopRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("f7d02ead", new Object[]{aKFragmentPopRender});
        }
        return aKFragmentPopRender.g;
    }

    public static final /* synthetic */ void e(AKFragmentPopRender aKFragmentPopRender, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c927bfd", new Object[]{aKFragmentPopRender, fragment});
        } else {
            aKFragmentPopRender.f = fragment;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(AKFragmentPopRender aKFragmentPopRender, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1314487601) {
            super.n((String) objArr[0], (JSONObject) objArr[1]);
            return null;
        } else if (hashCode == 1003079939) {
            super.m((View) objArr[0]);
            return null;
        } else if (hashCode == 1558852758) {
            aKFragmentPopRender.j((n9) objArr[0], (h9) objArr[1], (View) objArr[2], (iab) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/abilitykit/ability/pop/render/AKFragmentPopRender");
        }
    }

    public final Object f(FragmentActivity fragmentActivity) {
        FragmentManager supportFragmentManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dc938eb4", new Object[]{this, fragmentActivity});
        }
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            return null;
        }
        List<Fragment> fragments = supportFragmentManager.getFragments();
        if (fragments.isEmpty()) {
            return fragmentActivity;
        }
        for (Fragment fragment : fragments) {
            ckf.f(fragment, AdvanceSetting.NETWORK_TYPE);
            if (p(fragment)) {
                return fragment;
            }
        }
        return fragmentActivity;
    }

    public final ViewGroup g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("ad946ec7", new Object[]{this});
        }
        return this.e;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8e8363f", new Object[]{this, str});
        }
        return "fragment";
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70661375", new Object[]{this, view});
        } else {
            r();
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public boolean l(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21f6b89a", new Object[]{this, view, new Integer(i)})).booleanValue();
        }
        ckf.g(view, "contentView");
        return false;
    }

    @Override // tb.zz1, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void m(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc9c903", new Object[]{this, view});
            return;
        }
        super.m(view);
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        this.e = (ViewGroup) view;
    }

    @Override // tb.zz1, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void n(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a682cf", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "type");
        super.n(str, jSONObject);
        FragmentActivity fragmentActivity = this.d;
        if (fragmentActivity != null) {
            Intent intent = new Intent(str);
            intent.replaceExtras(hp6.a(intent.getExtras(), jSONObject));
            LocalBroadcastManager.getInstance(fragmentActivity.getApplicationContext()).sendBroadcast(intent);
        }
    }

    public final FragmentActivity o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("42387a42", new Object[]{this});
        }
        return this.d;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void onSizeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            viewGroup.requestLayout();
        }
    }

    public final boolean p(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b36d76b", new Object[]{this, fragment})).booleanValue();
        }
        Bundle arguments = fragment.getArguments();
        if (arguments == null || !arguments.getBoolean(UT_PAGE_FLAG_KEY, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public void j(CONTEXT context, P p, View view, iab iabVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41b2806", new Object[]{this, context, p, view, iabVar});
            return;
        }
        ckf.g(context, "abilityRuntimeContext");
        ckf.g(p, "params");
        ckf.g(iabVar, "callback");
        j(context, p, view, iabVar);
        Context d = context.d();
        if (d instanceof FragmentActivity) {
            MegaUtils.z(new AKFragmentPopRender$onCreateView$1(this, iabVar, d, View.generateViewId(), p), -1L);
            return;
        }
        r();
        iabVar.a(new a8(10015, "Not FragmentActivity"), d != null ? new PopErrorView(d, this.c) : null);
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        FragmentActivity fragmentActivity = this.d;
        if (fragmentActivity != null) {
            Fragment fragment = this.f;
            if (fragment != null) {
                try {
                    fragmentActivity.getSupportFragmentManager().beginTransaction().remove(fragment).commitNowAllowingStateLoss();
                    this.f = null;
                } catch (Throwable th) {
                    iih iihVar = iih.INSTANCE;
                    iihVar.a("stdPopTag", "onFragmentRelease exp:" + pr.d(th));
                    AppMonitor.Alarm.commitFail("AbilityKit", "ExecuteException", "fragmentPopReleaseError", pr.d(th));
                }
            }
            this.d = null;
            this.e = null;
        }
    }

    public final void s(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c6d1ed9", new Object[]{this, viewGroup});
        } else {
            this.e = viewGroup;
        }
    }

    public final void t(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b32915ba", new Object[]{this, fragmentActivity});
        } else {
            this.d = fragmentActivity;
        }
    }
}
