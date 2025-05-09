package tb;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexEventTarget;
import com.taobao.android.weex.WeexExternalEventType;
import com.taobao.android.weex.WeexExternalType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex_ability.page.WeexContainerFragment;
import com.taobao.android.weex_ability.page.WeexFragment;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class m5x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Fragment f23799a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements w6a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g1a f23800a;

        public a(g1a g1aVar) {
            this.f23800a = g1aVar;
        }

        @Override // tb.w6a
        public final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4aeceb46", new Object[]{this, new Boolean(z)});
            } else {
                this.f23800a.invoke(Boolean.valueOf(z));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements pce {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g1a f23801a;

        public b(g1a g1aVar) {
            this.f23801a = g1aVar;
        }

        @Override // tb.pce
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("267b7fce", new Object[]{this, map});
            } else {
                this.f23801a.invoke(Boolean.valueOf(ckf.b(map != null ? map.get("state") : null, Boolean.TRUE)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c implements npc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u1a f23802a;

        public c(u1a u1aVar) {
            this.f23802a = u1aVar;
        }

        @Override // tb.npc
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            }
        }

        @Override // tb.npc
        public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
            }
        }

        @Override // tb.npc
        public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
            }
        }

        @Override // tb.npc
        public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            }
        }

        @Override // tb.npc
        public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            }
        }

        @Override // tb.npc
        public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            } else {
                this.f23802a.invoke(Integer.valueOf(i), str);
            }
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class d implements j6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u1a f23803a;

        public d(u1a u1aVar) {
            this.f23803a = u1aVar;
        }

        @Override // tb.j6x
        public void E1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
            }
        }

        @Override // tb.j6x
        public void H0(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            Integer num;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                return;
            }
            u1a u1aVar = this.f23803a;
            if (weexErrorType != null) {
                num = Integer.valueOf(weexErrorType.ordinal());
            } else {
                num = null;
            }
            u1aVar.invoke(num, str);
        }

        @Override // tb.j6x
        public void I1(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
            }
        }

        @Override // tb.j6x
        public void K0(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
            }
        }

        @Override // tb.j6x
        public void K1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
            }
        }

        @Override // tb.j6x
        public void d2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void e2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void l2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void z1(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            Integer num;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                return;
            }
            u1a u1aVar = this.f23803a;
            if (weexErrorType != null) {
                num = Integer.valueOf(weexErrorType.ordinal());
            } else {
                num = null;
            }
            u1aVar.invoke(num, str);
        }
    }

    static {
        t2o.a(786432156);
    }

    public m5x(Fragment fragment) {
        ckf.g(fragment, "weexFragment");
        this.f23799a = fragment;
    }

    public final void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6e10c5", new Object[]{this, str, jSONObject});
            return;
        }
        Fragment fragment = this.f23799a;
        if (fragment instanceof WeexFragment) {
            if (fragment != null) {
                com.taobao.android.weex_framework.a v2 = ((WeexFragment) fragment).v2();
                if (v2 != null) {
                    v2.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, str, jSONObject);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexFragment");
        } else if (!(fragment instanceof WeexContainerFragment)) {
        } else {
            if (fragment != null) {
                WeexInstance B2 = ((WeexContainerFragment) fragment).B2();
                if (B2 != null) {
                    B2.dispatchEvent(WeexEventTarget.DOCUMENT_TARGET, str, com.taobao.android.weex.b.e().a(jSONObject));
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexContainerFragment");
        }
    }

    public final Fragment b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("f6816360", new Object[]{this});
        }
        return this.f23799a;
    }

    public final void d(lce lceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce706660", new Object[]{this, lceVar});
            return;
        }
        Fragment fragment = this.f23799a;
        if (fragment instanceof WeexFragment) {
            if (fragment != null) {
                ((WeexFragment) fragment).N2(lceVar);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexFragment");
        } else if (!(fragment instanceof WeexContainerFragment)) {
        } else {
            if (fragment != null) {
                ((WeexContainerFragment) fragment).M2(lceVar);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexContainerFragment");
        }
    }

    public final void e(g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aafe86b", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, "callback");
        Fragment fragment = this.f23799a;
        if (fragment instanceof WeexFragment) {
            if (fragment != null) {
                ((WeexFragment) fragment).O2(new a(g1aVar));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexFragment");
        } else if (!(fragment instanceof WeexContainerFragment)) {
        } else {
            if (fragment != null) {
                ((WeexContainerFragment) fragment).N2(new b(g1aVar));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexContainerFragment");
        }
    }

    public final void f(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d30c64", new Object[]{this, ddeVar});
            return;
        }
        ckf.g(ddeVar, "overScrollListener");
        Fragment fragment = this.f23799a;
        if (fragment instanceof WeexFragment) {
            if (fragment != null) {
                ((WeexFragment) fragment).S2(ddeVar);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexFragment");
        } else if (!(fragment instanceof WeexContainerFragment)) {
        } else {
            if (fragment != null) {
                ((WeexContainerFragment) fragment).O2(ddeVar);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexContainerFragment");
        }
    }

    public final void g(u1a<? super Integer, ? super String, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff54e18", new Object[]{this, u1aVar});
            return;
        }
        ckf.g(u1aVar, "callback");
        Fragment fragment = this.f23799a;
        if (fragment instanceof WeexFragment) {
            if (fragment != null) {
                ((WeexFragment) fragment).T2(new c(u1aVar));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexFragment");
        } else if (!(fragment instanceof WeexContainerFragment)) {
        } else {
            if (fragment != null) {
                ((WeexContainerFragment) fragment).Q2(new d(u1aVar));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexContainerFragment");
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc2c5b6", new Object[]{this});
            return;
        }
        Fragment fragment = this.f23799a;
        if (fragment instanceof WeexFragment) {
            if (fragment != null) {
                ((WeexFragment) fragment).W2();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexFragment");
        } else if (!(fragment instanceof WeexContainerFragment)) {
        } else {
            if (fragment != null) {
                ((WeexContainerFragment) fragment).R2();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexContainerFragment");
        }
    }

    public final void c(JSONObject jSONObject, Context context, WeexExternalEventType weexExternalEventType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64d1f789", new Object[]{this, jSONObject, context, weexExternalEventType});
            return;
        }
        ckf.g(jSONObject, "params");
        ckf.g(weexExternalEventType, "type");
        if (context != null) {
            StringBuilder sb = new StringBuilder("event = ");
            sb.append(weexExternalEventType.name());
            sb.append(" x = ");
            sb.append(jSONObject.getIntValue("x"));
            sb.append(" y = ");
            sb.append(jSONObject.getIntValue("y"));
            Fragment fragment = this.f23799a;
            if (fragment instanceof WeexFragment) {
                try {
                    if (fragment != null) {
                        com.taobao.android.weex_framework.a v2 = ((WeexFragment) fragment).v2();
                        if (v2 != null) {
                            v2.dispatchExternalEvent(new l5x(WeexExternalType.PAN, uwo.a(context, jSONObject.getFloatValue("x")), uwo.a(context, jSONObject.getFloatValue("y")), jSONObject.getIntValue("w"), jSONObject.getIntValue("h"), weexExternalEventType, System.currentTimeMillis()));
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexFragment");
                } catch (Throwable th) {
                    TLog.loge("stdPopTag", "stdPopTag", "handleWindowDrag err = " + th);
                }
            } else if (fragment instanceof WeexContainerFragment) {
                try {
                    if (fragment != null) {
                        WeexInstance B2 = ((WeexContainerFragment) fragment).B2();
                        if (B2 != null) {
                            B2.dispatchExternalEvent(new l5x(WeexExternalType.PAN, uwo.a(context, jSONObject.getFloatValue("x")), uwo.a(context, jSONObject.getFloatValue("y")), jSONObject.getIntValue("w"), jSONObject.getIntValue("h"), weexExternalEventType, System.currentTimeMillis()));
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexContainerFragment");
                } catch (Throwable th2) {
                    TLog.loge("stdPopTag", "stdPopTag", "handleWindowDrag err = " + th2);
                }
            }
        }
    }
}
